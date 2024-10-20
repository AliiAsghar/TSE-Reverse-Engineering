package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class wvk extends wna {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.wnj, defpackage.wnk
    public final void d(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((wvj) apzj.i(context)).Mf((AsyncTelephonySimStateReceiver) this);
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
