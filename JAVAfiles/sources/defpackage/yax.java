package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yax extends wng {
    public aksr a;
    private volatile boolean b = false;
    private final Object c = new Object();
    private final yaq d;

    public yax(yaq yaqVar) {
        this.d = yaqVar;
    }

    @Override // defpackage.wng
    public final akrc a() {
        return this.a.b("ConnectivityBroadcastReceiverLegacy Receive broadcast");
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
        yaq yaqVar = this.d;
        qjb.a(new wnc(yaqVar, intent, 20), ((yav) yaqVar).i);
    }

    @Override // defpackage.wnk
    public final void d(Context context) {
        if (!this.b) {
            synchronized (this.c) {
                if (!this.b) {
                    ((yaj) apzj.i(context)).Oq(this);
                    this.b = true;
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

    public yax() {
    }
}
