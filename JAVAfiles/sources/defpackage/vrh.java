package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrh extends wng {
    public xyt a;
    public aksr b;
    private volatile boolean c = false;
    private final Object d = new Object();

    @Override // defpackage.wng
    public final akrc a() {
        return this.b.b("ShutdownReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
            xzb.j("Bugle", "Device is shutting down. RCS availability will not be updated until after reboot.");
            ((vrn) this.a.a()).m();
        }
    }

    @Override // defpackage.wnk
    public final void d(Context context) {
        if (!this.c) {
            synchronized (this.d) {
                if (!this.c) {
                    ((vrr) apzj.i(context)).Os(this);
                    this.c = true;
                }
            }
        }
    }

    @Override // defpackage.wng, defpackage.wnk, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d(context);
        super.onReceive(context, intent);
    }
}
