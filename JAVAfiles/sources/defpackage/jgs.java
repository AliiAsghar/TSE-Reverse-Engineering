package defpackage;

import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgs extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ jgu c;
    final /* synthetic */ List d;
    final /* synthetic */ jgp e;
    final /* synthetic */ jgt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgs(jgu jguVar, List list, jgp jgpVar, jgt jgtVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = jguVar;
        this.d = list;
        this.e = jgpVar;
        this.f = jgtVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgs) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        List list;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            aqil.P(obj);
            list = obj2;
        } else {
            aqil.P(obj);
            alvw e = jgt.a.e();
            e.X(alwp.a, "BugleComposeRow2");
            ((alvg) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logSplitRcsMessageQueued$1", "invokeSuspend", 115, "BugleMessageQueuedLogger.kt")).J("Logging split RCS message queued: %s, analyticsIds: %s, imageCompressionInfo: %s", this.c, this.d, this.e);
            jgt jgtVar = this.f;
            jgu jguVar = this.c;
            jgp jgpVar = this.e;
            List aq = aqjn.aq(aqjn.C(jgtVar.c(jguVar.a, jguVar.b)), jgtVar.b(jguVar, jgpVar));
            int size = aq.size();
            List list2 = this.d;
            if (size == list2.size()) {
                jgt jgtVar2 = this.f;
                jgu jguVar2 = this.c;
                this.a = aq;
                this.b = 1;
                Object e2 = jgtVar2.e(jguVar2.a);
                if (e2 != arplVar) {
                    list = aq;
                    obj = e2;
                } else {
                    return arplVar;
                }
            } else {
                throw new IllegalArgumentException("Size of attachmentInfos (" + aq.size() + ") and attachmentAnalyticsIds (" + list2.size() + ") must match to log each messageQueuedEvent correctly");
            }
        }
        final amrj amrjVar = (amrj) obj;
        for (armo armoVar : aqjn.aA(list, this.d)) {
            final List list3 = (List) armoVar.a;
            final long longValue = ((Number) armoVar.b).longValue();
            alvw e3 = jgt.a.e();
            e3.X(alwp.a, "BugleComposeRow2");
            ((alvg) e3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logSplitRcsMessageQueued$1", "invokeSuspend", 139, "BugleMessageQueuedLogger.kt")).C("Logging message queued attachmentInfo: %s, analyticsId: %s", list3, longValue);
            final jgt jgtVar3 = this.f;
            final jgu jguVar3 = this.c;
            jgtVar3.n(new Supplier() { // from class: jgr
                @Override // java.util.function.Supplier
                public final Object get() {
                    ahlp bD = aktp.bD(amsm.a.createBuilder());
                    bD.q(longValue);
                    bD.s();
                    bD.r(list3);
                    jgtVar3.f(jguVar3.a);
                    amrj amrjVar2 = amrjVar;
                    if (amrjVar2 != null) {
                        bD.p(amrjVar2);
                    }
                    return bD.o();
                }
            });
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new jgs(this.c, this.d, this.e, this.f, arpeVar);
    }
}
