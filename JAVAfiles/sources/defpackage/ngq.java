package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.provisioning.config.Configuration;
import j$.time.Duration;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ngq implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ngq(aglz aglzVar, int i) {
        this.b = i;
        this.a = aglzVar;
    }

    /* JADX WARN: Type inference failed for: r0v82, types: [armf, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((ngr) this.a).t.a());
            case 1:
                return (Boolean) ((ngr) this.a).q.b();
            case 2:
                return Boolean.valueOf(((ngr) this.a).r.a());
            case 3:
                xyo c = prk.a.c();
                c.H("Business info does not exist in database");
                c.z("RBM bot id", this.a);
                c.q();
                return true;
            case 4:
                return ((prl) this.a).a;
            case 5:
                xyo c2 = prk.a.c();
                c2.H("Business info does not exist in database");
                c2.z("RBM bot id", this.a);
                c2.q();
                return false;
            case 6:
                return ((puw) this.a).d.f();
            case 7:
                return ((puw) this.a).d.f();
            case 8:
                pvm pvmVar = new pvm();
                pvn pvnVar = (pvn) this.a;
                pvmVar.c(((Duration) ((pvr) pvnVar.a()).a).dividedBy(2L));
                pvmVar.b((Duration) ((pvr) pvnVar.a()).b);
                return pvmVar.a();
            case 9:
                pvm pvmVar2 = new pvm();
                pvmVar2.c(puw.a);
                pvmVar2.b((Duration) ((pvr) ((pvn) this.a).a()).b);
                return pvmVar2.a();
            case 10:
                return ((pvn) this.a).a();
            case 11:
                pvn pvnVar2 = (pvn) this.a;
                Optional i = pvnVar2.a.i(pvnVar2.b.l());
                if (i.isEmpty()) {
                    return pvnVar2.c.d();
                }
                int i2 = ((Configuration) i.get()).mCapabilityDiscoveryConfiguration.mCapInfoExpiry;
                if (i2 <= 0) {
                    return pvnVar2.c.d();
                }
                return Duration.ofSeconds(i2);
            case 12:
                pvn pvnVar3 = (pvn) this.a;
                Optional i3 = pvnVar3.a.i(pvnVar3.b.l());
                if (i3.isEmpty()) {
                    return pvnVar3.c.c();
                }
                int i4 = ((Configuration) i3.get()).mCapabilityDiscoveryConfiguration.mNonRcsCapInfoExpiry;
                if (i4 <= 0) {
                    return pvnVar3.c.c();
                }
                return Duration.ofSeconds(i4);
            case 13:
                pyz pyzVar = ((qac) this.a).a;
                if (pyzVar == null || pyzVar.equals(null)) {
                    return null;
                }
                return pyz.a(((qac) this.a).a);
            case 14:
                alvw i5 = qcb.a.i();
                i5.X(alwp.a, "BugleGroupManagement");
                ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getCurrentActiveSelfChatEndpoint", 620, "IncomingRcsGroupNotificationConversationGetter.java")).q("Group notification for group with stale sub Id");
                return this.a;
            case 15:
                return this.a;
            case 16:
                ConversationIdType conversationIdType = ((qpp) this.a).d;
                if (conversationIdType == null || conversationIdType.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((qpp) this.a).d));
            case 17:
                znj znjVar = (znj) this.a.b();
                aiwl a = wus.a();
                a.i(wuk.PHONE_NUMBER_MIN_MATCH_GUESS);
                a.k(qrf.a);
                return znjVar.ab(a.f());
            case 18:
                qss qssVar = ((qst) this.a).a;
                if (qssVar == null || qssVar.equals(null)) {
                    return null;
                }
                return qta.e(((qst) this.a).a);
            case 19:
                qss qssVar2 = ((qts) this.a).a;
                if (qssVar2 == null || qssVar2.equals(null)) {
                    return null;
                }
                return qta.e(((qts) this.a).a);
            default:
                qss qssVar3 = ((qts) this.a).b;
                if (qssVar3 == null || qssVar3.equals(null)) {
                    return null;
                }
                return qta.e(((qts) this.a).b);
        }
    }

    public /* synthetic */ ngq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
