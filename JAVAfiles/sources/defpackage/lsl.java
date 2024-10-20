package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationProvisioningEventReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lsl extends wna {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.wnj, defpackage.wnk
    public final void d(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((lst) apzj.i(context)).MM((SingleRegistrationProvisioningEventReceiver) this);
                    this.a = true;
                }
            }
        }
    }

    @Override // defpackage.wnj, defpackage.wng, defpackage.wnk, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d(context);
        super.onReceive(context, intent);
    }
}
