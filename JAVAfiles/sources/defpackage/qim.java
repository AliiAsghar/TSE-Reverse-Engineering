package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class qim extends wng {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.wnk
    public final void d(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((qij) apzj.i(context)).Mi((qii) this);
                    this.a = true;
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
