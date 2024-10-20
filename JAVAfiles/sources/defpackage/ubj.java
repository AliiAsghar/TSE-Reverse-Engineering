package defpackage;

import android.telephony.SubscriptionManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ubj extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ ubl a;

    public ubj(ubl ublVar) {
        this.a = ublVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        akrc b = this.a.k.b("DataModelImpl#OnSubscriptionsChangedListener");
        try {
            qiu.h(((kkg) this.a.l.get()).b());
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
