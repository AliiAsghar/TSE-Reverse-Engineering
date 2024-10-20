package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qlf implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qlf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v4, types: [apwt, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return d.W(this.a, obj);
            case 1:
                xze xzeVar = qif.a;
                aozy builder = ((qid) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                Object obj2 = this.a;
                qid qidVar = (qid) builder.b;
                qidVar.c |= 64;
                qidVar.p = (String) obj2;
                return (qid) builder.s();
            case 2:
                return d.W(this.a, obj);
            case 3:
                return this.a.a(obj);
            case 4:
                return d.W(this.a, obj);
            case 5:
                return d.W(this.a, obj);
            case 6:
                return d.W(this.a, obj);
            case 7:
                return d.W(this.a, obj);
            case 8:
                return d.W(this.a, obj);
            case 9:
                Optional optional = (Optional) obj;
                qpn.s((alog) this.a, optional);
                return optional;
            case 10:
                aozy builder2 = ((qrf) obj).toBuilder();
                int intValue = ((Integer) ((Optional) this.a).get()).intValue();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                qrf qrfVar = (qrf) builder2.b;
                qrfVar.b |= 1;
                qrfVar.c = intValue;
                return (qrf) builder2.s();
            case 11:
                return this.a;
            case 12:
                aozy builder3 = ((qrf) obj).toBuilder();
                int intValue2 = ((Integer) ((Optional) this.a).get()).intValue();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                qrf qrfVar2 = (qrf) builder3.b;
                qrfVar2.b |= 1;
                qrfVar2.c = intValue2;
                return (qrf) builder3.s();
            case 13:
                Optional optional2 = (Optional) obj;
                aozy createBuilder = amrd.a.createBuilder();
                if (optional2.isPresent()) {
                    long intValue3 = ((Integer) optional2.get()).intValue();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amrd amrdVar = (amrd) createBuilder.b;
                    amrdVar.b |= 1;
                    amrdVar.c = intValue3;
                }
                long a = qqs.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj3 = this.a;
                amrd amrdVar2 = (amrd) createBuilder.b;
                amrdVar2.b |= 2;
                amrdVar2.d = a;
                maq maqVar = (maq) ((qrg) obj3).b.b();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.FUZZY_MATCH_LENGTH;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amrd amrdVar3 = (amrd) createBuilder.s();
                amrdVar3.getClass();
                amfrVar2.aC = amrdVar3;
                amfrVar2.e |= 32768;
                maqVar.j(amfqVar);
                return null;
            case 14:
                Long l = (Long) obj;
                long longValue = ((Long) qxx.a.e()).longValue();
                qxx qxxVar = (qxx) this.a;
                long epochMilli = qxxVar.c.f().toEpochMilli();
                if (l == null || l.longValue() == 0 || epochMilli >= l.longValue() + longValue) {
                    ((wul) qxxVar.d.a.get()).j(new mdq(epochMilli, 6)).h(new qda(19), andi.a);
                    ((uof) ((lpg) qxxVar.b.b()).a.b()).f("run_analyze");
                    ((uof) ((lpg) qxxVar.b.b()).a.b()).a(upk.a("run_analyze", und.a));
                }
                return null;
            case 15:
                ajwt ajwtVar = (ajwt) obj;
                ((qyo) this.a).c.c("Bugle.Cms.LinkedAccountManager.GetLinkedAccountAsync.Success.Count");
                return ajwtVar;
            case 16:
                ((CheckActiveDesktopIsAliveAsyncAction) this.a).e.e("Bugle.Ditto.Action.Success.Metrics.Counts", 12);
                return null;
            case 17:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    qyw qywVar = ((CheckActiveDesktopIsAliveAsyncAction) this.a).g;
                    qyw qywVar2 = (qyw) qywVar.a.b();
                    qywVar2.getClass();
                    trn trnVar = (trn) qywVar.b.b();
                    trnVar.getClass();
                    ?? b = qywVar.c.b();
                    b.getClass();
                    anen anenVar = (anen) qywVar.g.b();
                    anenVar.getClass();
                    anen anenVar2 = (anen) qywVar.h.b();
                    anenVar2.getClass();
                    xnv xnvVar = (xnv) qywVar.i.b();
                    xnvVar.getClass();
                    mbl mblVar = (mbl) qywVar.j.b();
                    mblVar.getClass();
                    wpp wppVar = (wpp) qywVar.k.b();
                    wppVar.getClass();
                    new CheckActiveDesktopIsAliveAsyncAction(qywVar2, trnVar, b, qywVar.d, qywVar.e, qywVar.f, anenVar, anenVar2, xnvVar, mblVar, wppVar, qywVar.l).x(117, CheckActiveDesktopIsAliveAsyncAction.b);
                }
                return null;
            case 18:
                xyo e = GenericWorkerQueueAction.d.e();
                e.H("Couldn't process item: ");
                e.H(((srd) this.a).o());
                e.r((Exception) obj);
                return false;
            case 19:
                xyo e2 = GenericWorkerQueueAction.d.e();
                e2.H("Couldn't re-enqueue or delete item: ");
                e2.H(((srd) this.a).o());
                e2.r((Exception) obj);
                return false;
            default:
                xyo e3 = GenericWorkerQueueAction.d.e();
                e3.H("BatchWorker failed to process workItem: ");
                e3.H(this.a);
                e3.r((Exception) obj);
                return false;
        }
    }
}
