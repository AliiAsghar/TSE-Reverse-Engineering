package defpackage;

import android.telephony.SubscriptionManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvx extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ wvy a;

    public wvx(wvy wvyVar) {
        this.a = wvyVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        akrc b = ((aksr) this.a.e.b()).b("SimStateMonitor#onSubscriptionsChanged");
        wvy wvyVar = this.a;
        try {
            qjh.l(wvyVar.d, null, new uxs(wvyVar, (arpe) null, 11), 3);
            armd.i(b, null);
        } finally {
        }
    }
}
