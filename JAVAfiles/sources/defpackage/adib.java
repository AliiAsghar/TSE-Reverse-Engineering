package defpackage;

import android.telephony.SubscriptionManager;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adib extends SubscriptionManager.OnSubscriptionsChangedListener {
    public final SubscriptionManager a;
    public final ExecutorService b;
    private final int c;
    private int d = 1;
    private final adgx e;

    public adib(SubscriptionManager subscriptionManager, int i, adgx adgxVar, ExecutorService executorService) {
        d.t(i >= 0, "Invalid SubscriptionId");
        this.c = i;
        this.e = adgxVar;
        this.a = subscriptionManager;
        this.b = executorService;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        try {
            if (this.a.getActiveSubscriptionInfo(this.c) == null) {
                if (this.d == 2) {
                    adgx adgxVar = this.e;
                    advr.d(adgxVar.b.a, "SIM(subId=%d) is removed.", Integer.valueOf(adgxVar.a));
                    adhw adhwVar = adgxVar.b.c;
                    if (!Objects.isNull(adhwVar)) {
                        adhwVar.G(false);
                    }
                }
                this.d = 3;
                return;
            }
            if (this.d == 3) {
                adgx adgxVar2 = this.e;
                advr.d(adgxVar2.b.a, "SIM(subId=%d) is detected.", Integer.valueOf(adgxVar2.a));
                adhw adhwVar2 = adgxVar2.b.c;
                if (!Objects.isNull(adhwVar2)) {
                    adhwVar2.G(true);
                }
            }
            this.d = 2;
        } catch (SecurityException unused) {
        }
    }
}
