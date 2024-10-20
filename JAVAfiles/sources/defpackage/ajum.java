package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.setupcompat.ISetupCompatService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajum implements ServiceConnection {
    final /* synthetic */ ajun a;

    public ajum(ajun ajunVar) {
        this.a = ajunVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.b(new atal(7));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.a.b(new atal(6));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        if (iBinder == null) {
            ajun.c.u("Binder is null when onServiceConnected was called!");
            i = 5;
        } else {
            i = 4;
        }
        this.a.b(new atal(i, ISetupCompatService.Stub.asInterface(iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b(new atal(5));
    }
}
