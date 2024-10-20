package defpackage;

import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtp extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ adtr a;

    public adtp(adtr adtrVar) {
        this.a = adtrVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, acyz] */
    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        boolean z;
        advr.d(adtr.a, "Received onSubscriptionsChanged event", new Object[0]);
        boolean booleanValue = ((Boolean) aczy.a().a.b.a()).booleanValue();
        adtr adtrVar = this.a;
        if (booleanValue) {
            try {
                List<SubscriptionInfo> c = adwq.b(adtrVar.f).c();
                aozy createBuilder = aphv.a.createBuilder();
                if (c != null && !c.isEmpty()) {
                    z = false;
                    for (SubscriptionInfo subscriptionInfo : c) {
                        int mcc = subscriptionInfo.getMcc();
                        int mnc = subscriptionInfo.getMnc();
                        if (mcc > 0 && mnc > 0) {
                            aozy createBuilder2 = aphu.a.createBuilder();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar = createBuilder2.b;
                            aphu aphuVar = (aphu) apagVar;
                            aphuVar.b |= 1;
                            aphuVar.c = mcc;
                            if (!apagVar.isMutable()) {
                                createBuilder2.u();
                            }
                            aphu aphuVar2 = (aphu) createBuilder2.b;
                            aphuVar2.b |= 2;
                            aphuVar2.d = mnc;
                            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            aphu aphuVar3 = (aphu) createBuilder2.b;
                            aphuVar3.b |= 4;
                            aphuVar3.e = simSlotIndex;
                            int subscriptionId = subscriptionInfo.getSubscriptionId();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            aphu aphuVar4 = (aphu) createBuilder2.b;
                            aphuVar4.b |= 8;
                            aphuVar4.f = subscriptionId;
                            aphu aphuVar5 = (aphu) createBuilder2.s();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            aphv aphvVar = (aphv) createBuilder.b;
                            aphuVar5.getClass();
                            apax apaxVar = aphvVar.e;
                            if (!apaxVar.c()) {
                                aphvVar.e = apag.mutableCopy(apaxVar);
                            }
                            aphvVar.e.add(aphuVar5);
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphv aphvVar2 = (aphv) createBuilder.b;
                aphvVar2.b |= 2;
                aphvVar2.d = z;
                int f = adtrVar.f(adtrVar.f);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphv aphvVar3 = (aphv) createBuilder.b;
                aphvVar3.b = 1 | aphvVar3.b;
                aphvVar3.c = f;
                adtrVar.e.d((aphv) createBuilder.s());
            } catch (adwk unused) {
                advr.h(adtr.a, "Permission is required for SubscriptionManager", new Object[0]);
            }
        }
        adtr adtrVar2 = this.a;
        adts adtsVar = adtrVar2.g;
        if (adtsVar != null && adtsVar.d(adtr.F(adtrVar2.f))) {
            advr.d(adtr.a, "delay onSubscriptionsChanged", new Object[0]);
        } else {
            this.a.n(-1);
        }
    }
}
