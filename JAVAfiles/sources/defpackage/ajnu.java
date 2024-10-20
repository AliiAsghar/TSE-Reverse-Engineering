package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajnu implements ServiceConnection {
    final /* synthetic */ ajnv a;

    public ajnu(ajnv ajnvVar) {
        this.a = ajnvVar;
    }

    public final void a(ComponentName componentName) {
        xzb.n("RcsClientLib", "Binding to " + componentName.getClassName() + " has died.");
        ajnv ajnvVar = this.a;
        ajnvVar.f(ajnvVar.getServiceNameLoggingEnum(), 5);
    }

    public final void b(ComponentName componentName) {
        xzb.n("RcsClientLib", "Null IBinder returned for ".concat(String.valueOf(componentName.getClassName())));
        if (((Boolean) ajnv.a.e()).booleanValue()) {
            this.a.c(ajnz.NULL_BINDING);
        }
        ajnv ajnvVar = this.a;
        ajnvVar.f(ajnvVar.getServiceNameLoggingEnum(), 6);
    }

    public final void c(IBinder iBinder) {
        Object obj;
        ajnv ajnvVar = this.a;
        synchronized (ajnvVar.d) {
            Class<?>[] declaredClasses = ajnvVar.c.getDeclaredClasses();
            int i = 0;
            while (true) {
                obj = null;
                if (i >= declaredClasses.length) {
                    break;
                }
                if (declaredClasses[i].getName().endsWith("Stub")) {
                    try {
                        obj = declaredClasses[i].getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                        break;
                    } catch (Exception e) {
                        xzb.i("RcsClientLib", e, "Error while getting stub: ".concat(String.valueOf(e.getMessage())));
                    }
                }
                i++;
            }
            ajnvVar.f = obj;
        }
        if (ajnvVar.f != null) {
            ajnvVar.d(ajnvVar.getClass().getName());
        } else {
            ajnvVar.c(ajnz.INTERNAL_ERROR);
        }
        if (!((Boolean) ajnv.b.e()).booleanValue()) {
            synchronized (this.a.d) {
                this.a.d.notifyAll();
            }
        }
        ajnv ajnvVar2 = this.a;
        ajnvVar2.f(ajnvVar2.getServiceNameLoggingEnum(), 3);
    }

    public final void d() {
        synchronized (this.a.d) {
            this.a.f = null;
        }
        ajnv ajnvVar = this.a;
        ajnvVar.e(ajnvVar.getClass().getName());
        ajnv ajnvVar2 = this.a;
        ajnvVar2.f(ajnvVar2.getServiceNameLoggingEnum(), 4);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        armf armfVar = this.a.g;
        if (armfVar != null) {
            ((Executor) armfVar.b()).execute(akto.j(new ajnt(this, componentName, 0)));
        } else {
            a(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        armf armfVar = this.a.g;
        if (armfVar != null) {
            ((Executor) armfVar.b()).execute(akto.j(new ajnt(this, componentName, 2)));
        } else {
            b(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        armf armfVar = this.a.g;
        if (armfVar != null) {
            ((Executor) armfVar.b()).execute(akto.j(new ajnt(this, iBinder, 3)));
        } else {
            c(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        armf armfVar = this.a.g;
        if (armfVar != null) {
            ((Executor) armfVar.b()).execute(akto.j(new ajir(this, 10, null)));
        } else {
            d();
        }
    }
}
