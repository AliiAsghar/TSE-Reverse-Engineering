package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yaw extends wng {
    public final ybg a;
    public aksr b;
    private volatile boolean c = false;
    private final Object d = new Object();
    private final anen e;

    public yaw(anen anenVar, ybg ybgVar) {
        this.e = anenVar;
        this.a = ybgVar;
    }

    @Override // defpackage.wng
    public final akrc a() {
        return this.b.b("ConnectivityBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        qiu.h(aktp.ah(new wuo(this, 16), this.e));
    }

    @Override // defpackage.wnk
    public final void d(Context context) {
        if (!this.c) {
            synchronized (this.d) {
                if (!this.c) {
                    ((yak) apzj.i(context)).Op(this);
                    this.c = true;
                }
            }
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    @Override // defpackage.wng, defpackage.wnk, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d(context);
        super.onReceive(context, intent);
    }

    public yaw() {
    }
}
