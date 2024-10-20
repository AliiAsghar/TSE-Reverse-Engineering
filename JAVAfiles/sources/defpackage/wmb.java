package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.receiver.WapPushSiExpiringEventReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class wmb extends wng {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.wnk
    public final void d(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((wmw) apzj.i(context)).MV((WapPushSiExpiringEventReceiver) this);
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
