package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfq extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfq(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v133, types: [aemc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, mkl] */
    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, aesp] */
    /* JADX WARN: Type inference failed for: r1v33, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [mjd, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        eov P;
        eov P2;
        aahr aahrVar = null;
        enb enbVar = null;
        enb enbVar2 = null;
        switch (this.c) {
            case 0:
                kfy kfyVar = ((kfs) this.a).g;
                if (kfyVar != null) {
                    kfyVar.close();
                }
                Object obj = this.a;
                ?? r6 = this.b;
                nei neiVar = ((kfs) obj).h;
                ahqr ahqrVar = (ahqr) neiVar.e.b();
                ahqrVar.getClass();
                jxv jxvVar = (jxv) neiVar.b.b();
                jxvVar.getClass();
                kgb kgbVar = (kgb) neiVar.f.b();
                kgbVar.getClass();
                kgd kgdVar = (kgd) neiVar.a.b();
                kgdVar.getClass();
                kge kgeVar = (kge) neiVar.c.b();
                kgeVar.getClass();
                piv pivVar = (piv) neiVar.d.b();
                pivVar.getClass();
                kfy kfyVar2 = new kfy(ahqrVar, r6, jxvVar, kgbVar, kgdVar, kgeVar, pivVar);
                kfs kfsVar = (kfs) this.a;
                kfsVar.g = kfyVar2;
                kfsVar.d.set(true);
                return kfyVar2;
            case 1:
                kfh kfhVar = (kfh) this.a;
                int i = kfhVar.b.a;
                if (i != 0) {
                    int i2 = i - 1;
                    Object obj2 = ((kjp) this.b).a;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            aahrVar = ((aajq) obj2).a();
                        }
                    } else {
                        aahrVar = ((aajq) obj2).b();
                    }
                    return new kfg(kfhVar.a, aahrVar, new kek(3), new kdg(this.b, this.a, 20));
                }
                throw null;
            case 2:
                Object b = ((khh) this.a).a.b();
                b.getClass();
                boolean booleanValue = ((Boolean) b).booleanValue();
                Object obj3 = this.b;
                if (true != booleanValue) {
                    obj3 = null;
                }
                if (obj3 == null) {
                    return null;
                }
                return (juh) arsd.k((Optional) ((apxx) obj3).a);
            case 3:
                this.b.a();
                ((khw) this.a).m.b(lof.a);
                return arnb.a;
            case 4:
                this.b.a();
                ((khw) this.a).m.b(llr.a);
                return arnb.a;
            case 5:
                this.b.a();
                ((jxh) this.a).c.a();
                return arnb.a;
            case 6:
                ((jxv) this.a).l((kjl) this.b);
                ((kjl) this.b).f.a();
                return arnb.a;
            case 7:
                ((jxv) this.a).l((kjl) this.b);
                ((kjl) this.b).g.a();
                return arnb.a;
            case 8:
                nei neiVar2 = (nei) this.a;
                ?? r1 = neiVar2.c;
                String a = ((nel) this.b).a();
                ((mho) r1.b()).aN(2, amho.BIZINFO_SOURCE_CONVERSATION_AVATAR, a);
                ((lkd) neiVar2.b).b(new lmr(neiVar2.d, a));
                return arnb.a;
            case 9:
                eoz d = dyt.d(this.b);
                if (d instanceof enb) {
                    enbVar2 = (enb) d;
                }
                if (enbVar2 != null && (P = enbVar2.P()) != null) {
                    return P;
                }
                return ((cg) this.a).P();
            case 10:
                eoz d2 = dyt.d(this.b);
                if (d2 instanceof enb) {
                    enbVar = (enb) d2;
                }
                if (enbVar != null && (P2 = enbVar.P()) != null) {
                    return P2;
                }
                return ((cg) this.a).P();
            case 11:
                jhc jhcVar = ((lgv) this.a).a;
                Object obj4 = this.b;
                akrc b2 = ((lhe) obj4).f.b("MultiShare SendButtonUiAdapterImpl#onSend");
                try {
                    ahqq d3 = ((lhe) obj4).l.d();
                    ((lhe) obj4).g.c();
                    qjh.l(((lhe) obj4).b, ((lhe) obj4).c, new hak((lhe) obj4, d3, jhcVar, yyb.ba(), (arpe) null, 11), 2);
                    armd.i(b2, null);
                    return arnb.a;
                } finally {
                }
            case 12:
                return new lio((String) this.b, this.a);
            case 13:
                ljn ljnVar = (ljn) ((lit) this.a).g.b();
                ljn.d(ljnVar, 16, 0, 0, 6);
                ((ahqr) ljnVar.a.b()).g(ljo.h, null, ahqp.SUCCESS);
                ((ahqr) ljnVar.a.b()).g(ljo.j, null, ahqp.SUCCESS);
                lgd lgdVar = ((lit) this.a).l;
                Object obj5 = this.b;
                obj5.getClass();
                lgdVar.a(lga.a((mmj) obj5));
                ((lit) this.a).d.c();
                return arnb.a;
            case 14:
                ljn.d((ljn) ((ljh) this.a).g.b(), 6, 0, 0, 6);
                ?? r0 = this.b;
                r0.getClass();
                ((ljh) this.a).n.a(new ChipData(new ChipId.Identity(r0.b()), r0.e(), r0.g(), r0.a(), false, 16, null));
                ((ljh) this.a).e.c();
                return arnb.a;
            case 15:
                ?? r12 = this.b;
                ((ljh) this.a).n.a(new ChipData(new ChipId.Identity(r12), hwr.A(r12), null, null, false, 28, null));
                ((ljh) this.a).e.c();
                return arnb.a;
            case 16:
                ahqq ahqqVar = ((liv) this.a).d;
                if (ahqqVar != null) {
                    ((ahqr) ((ljh) this.b).f.b()).f(ahqqVar, ljo.a, null, ahqp.SUCCESS);
                }
                return arnb.a;
            case 17:
                if (!((lix) this.a).b.isEmpty()) {
                    aesp aespVar = ((lji) ((lix) this.a).b.get(0)).a().a;
                    if (aespVar instanceof aesn) {
                        aesn aesnVar = (aesn) aespVar;
                        if (!aesnVar.d) {
                            aesnVar.f.a();
                            ((ljp) this.b).f.f(false);
                        }
                    } else {
                        throw new IllegalArgumentException("Unexpected ListItemUiData when clicking on Done button");
                    }
                }
                return arnb.a;
            case 18:
                ((lre) this.a).a();
                this.b.b().a();
                return arnb.a;
            case 19:
                aemc aemcVar = (aemc) this.b.a(((lre) this.a).c);
                return aemcVar.a(new kfq(this.a, aemcVar, 18));
            default:
                return (aewt) this.b.a(((lre) this.a).c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfq(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
