package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajnx implements ServiceConnection {
    private static final uuf a = uuh.q(146527691);
    private final aksr b;
    private final Class c;
    private final ServiceConnection d;

    public ajnx(aksr aksrVar, Class cls, ServiceConnection serviceConnection) {
        this.b = aksrVar;
        this.c = cls;
        this.d = serviceConnection;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        if (((Boolean) a.e()).booleanValue()) {
            akrc a2 = this.b.a(this.c, "onBindingDied");
            try {
                this.d.onBindingDied(componentName);
                a2.close();
                return;
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.d.onBindingDied(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        if (((Boolean) a.e()).booleanValue()) {
            akrc a2 = this.b.a(this.c, "onNullBinding");
            try {
                this.d.onNullBinding(componentName);
                a2.close();
                return;
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.d.onNullBinding(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (((Boolean) a.e()).booleanValue()) {
            akrc a2 = this.b.a(this.c, "onServiceConnected");
            try {
                this.d.onServiceConnected(componentName, iBinder);
                a2.close();
                return;
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.d.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (((Boolean) a.e()).booleanValue()) {
            akrc a2 = this.b.a(this.c, "onServiceDisconnected");
            try {
                this.d.onServiceDisconnected(componentName);
                a2.close();
                return;
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.d.onServiceDisconnected(componentName);
    }
}
