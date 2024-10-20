package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilx implements akvz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ilx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v102, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    @Override // defpackage.akvz
    public final /* synthetic */ akwa a(akvv akvvVar) {
        int i = 13;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        switch (this.b) {
            case 0:
                alog a = ((zoi) akvvVar).a();
                Object obj = this.a;
                ilw ilwVar = (ilw) obj;
                List A = ilwVar.G.A(a);
                Collection.EL.stream(A).forEach(new ibo(obj, i));
                ilwVar.G.aj(A);
                return akwa.a;
            case 1:
                ((ilw) this.a).r.ifPresent(new ibo((aaet) akvvVar, 11));
                return akwa.a;
            case 2:
                Object obj2 = this.a;
                ilw ilwVar2 = (ilw) obj2;
                long epochMilli = ((xnv) ilwVar2.f.b()).f().toEpochMilli();
                long a2 = ((xnv) ilwVar2.f.b()).a();
                akrh e = aktp.e("DraftEditorFragmentPeer#onSendButtonClick");
                try {
                    ((xcs) ((ilw) obj2).i.b()).h(xcr.SEND_BUTTON_ACCURATE);
                    if (((ilw) obj2).y.E().l()) {
                        ((ilw) obj2).y.E().c.ao();
                    } else {
                        mbh mbhVar = new mbh(epochMilli, a2);
                        if (true == ((ilw) obj2).y.E().V()) {
                            i3 = 2;
                        }
                        ((ilw) obj2).y(mbhVar, true, true, false, i3);
                        if (((zxy) ((ilw) obj2).e.b()).t()) {
                            ((ilw) obj2).y.E().w().ifPresent(new ile(i4));
                        }
                    }
                    akwa akwaVar = akwa.a;
                    e.close();
                    return akwaVar;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 3:
                itb itbVar = (itb) this.a;
                Context x = itbVar.f.x();
                x.getClass();
                zjq zjqVar = itbVar.aQ;
                ((lzv) zjqVar.b.b()).D(x, ((zpg) akvvVar).a(), null);
                ((mho) zjqVar.c.b()).ac(0);
                return akwa.a;
            case 4:
                itb itbVar2 = (itb) this.a;
                itbVar2.f.x().getClass();
                throw null;
            case 5:
                ((Optional) ((apxx) ((itb) this.a).am).a).ifPresent(new isb(8));
                return akwa.a;
            case 6:
                rry a3 = ((aade) akvvVar).a();
                String a4 = a3.u().a();
                int f = a3.f();
                irl irlVar = ((itb) this.a).z;
                if (irlVar.f == null) {
                    xzb.n("Bugle", "Failed to show options UI: fragment manager is null.");
                } else {
                    aozy createBuilder = apnf.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apnf apnfVar = (apnf) createBuilder.b;
                    a4.getClass();
                    apnfVar.b = 1 | apnfVar.b;
                    apnfVar.c = a4;
                    alog alogVar = rvx.a;
                    if (f != 6 && f != 7) {
                        if (rvx.n(f)) {
                            apne apneVar = apne.XMS_FAILED_TO_SEND_OPTIONS;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            apnf apnfVar2 = (apnf) createBuilder.b;
                            apnfVar2.e = apneVar.k;
                            apnfVar2.b |= 4;
                        }
                    } else {
                        apne apneVar2 = apne.XMS_STUCK_IN_SENDING_OPTIONS;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apnf apnfVar3 = (apnf) createBuilder.b;
                        apnfVar3.e = apneVar2.k;
                        apnfVar3.b |= 4;
                    }
                    xvl.aP((apnf) createBuilder.s()).q(irlVar.f, "messageFailureOptionsBottomModalFragment");
                }
                return akwa.a;
            case 7:
                irn irnVar = (irn) akvvVar;
                rry rryVar = irnVar.a.e;
                if (rryVar != null && rryVar.u() != null) {
                    ((itb) this.a).l(irnVar.a.e.u(), false);
                }
                return akwa.a;
            case 8:
                iuw iuwVar = (iuw) akvvVar;
                itb itbVar3 = (itb) this.a;
                rrl rrlVar = (rrl) itbVar3.ay.a();
                if (itbVar3.G.isPresent()) {
                    iuu iuuVar = (iuu) itbVar3.G.get();
                    iuwVar.a();
                    iuwVar.b();
                    iuwVar.d();
                    iuwVar.c();
                    rrlVar.s();
                    boolean z = rrlVar.b.d;
                    itbVar3.an.a();
                    itbVar3.an.i();
                    itbVar3.an.getClass();
                    return iuuVar.c();
                }
                return akwa.a;
            case 9:
                itb itbVar4 = (itb) this.a;
                if (itbVar4.G.isPresent()) {
                    iuu iuuVar2 = (iuu) itbVar4.G.get();
                    return iuuVar2.b();
                }
                return akwa.a;
            case 10:
                ((itb) this.a).H.ifPresent(new isb(5));
                return akwa.a;
            case 11:
                ((itb) this.a).H.ifPresent(new isb(i2));
                return akwa.a;
            case 12:
                ((itb) this.a).I.ifPresent(new isb(3));
                return akwa.a;
            case 13:
                ((itb) this.a).aq.a.ifPresent(new ile(15));
                return akwa.a;
            case 14:
                ((itb) this.a).aT.c().ifPresent(new isb(i4));
                return akwa.a;
            case 15:
                itb itbVar5 = (itb) this.a;
                Context x2 = itbVar5.f.x();
                x2.getClass();
                zjq zjqVar2 = itbVar5.aQ;
                ((Optional) zjqVar2.a).isPresent();
                ((lzv) zjqVar2.b.b()).D(x2, ((zph) akvvVar).b(), null);
                ((mho) zjqVar2.c.b()).ac(0);
                return akwa.a;
            case 16:
                if (yig.b()) {
                    ixd ixdVar = (ixd) this.a;
                    if (!ixdVar.bp.isEmpty() && !ixdVar.bs.isEmpty() && !ixdVar.bo.isEmpty()) {
                        ((jbu) ixdVar.bo.get()).b();
                        ((jcd) ixdVar.bs.get()).a();
                        ixdVar.R(new ivg(9), new ivg(10));
                        return akwa.a;
                    }
                }
                return akwa.a;
            case 17:
                if (yig.b()) {
                    ixd ixdVar2 = (ixd) this.a;
                    if (!ixdVar2.bo.isEmpty() && !ixdVar2.bn.isEmpty() && !ixdVar2.bq.isEmpty()) {
                        ((jcd) ixdVar2.bs.get()).a();
                        ((jbu) ixdVar2.bo.get()).a();
                        ixdVar2.R(new ivg(20), new ivn(i3));
                        return akwa.a;
                    }
                }
                return akwa.a;
            case 18:
                if (yig.b()) {
                    ixd ixdVar3 = (ixd) this.a;
                    if (!ixdVar3.i.isEmpty() && !ixdVar3.bo.isEmpty() && !ixdVar3.M.aA()) {
                        ((ahqr) ixdVar3.bB.b()).e(new ahka("RequestMagicRewrite"));
                        throw null;
                    }
                }
                return akwa.a;
            case 19:
                if (!yig.b()) {
                    return akwa.a;
                }
                ((ixd) this.a).R(new ivg(i), null);
                return akwa.a;
            default:
                itd itdVar = (itd) akvvVar;
                boolean booleanValue = ((Boolean) aaxj.d.e()).booleanValue();
                Object obj3 = this.a;
                if (!booleanValue && !((Boolean) aaxj.e.e()).booleanValue()) {
                    ixd ixdVar4 = (ixd) obj3;
                    armf armfVar = ixdVar4.af;
                    Uri b = itdVar.b();
                    itdVar.a();
                    ixd.bs(armfVar, b, false, ixdVar4.L, ixdVar4.q());
                } else {
                    ixd ixdVar5 = (ixd) obj3;
                    armf armfVar2 = ixdVar5.af;
                    Uri b2 = itdVar.b();
                    itdVar.a();
                    ixd.bt(armfVar2, b2, false, ixdVar5.L, ixdVar5.M);
                }
                return akwa.a;
        }
    }
}
