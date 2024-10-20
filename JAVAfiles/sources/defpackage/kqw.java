package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqw implements apya {
    public final krv a;
    public final kqp b;
    private final int c;
    private final kqi d;
    private final kqh e;

    public kqw(krv krvVar, kqp kqpVar, kqi kqiVar, kqh kqhVar, int i) {
        this.a = krvVar;
        this.b = kqpVar;
        this.d = kqiVar;
        this.e = kqhVar;
        this.c = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.c) {
            case 0:
                return new aohs((aksr) this.b.d.b(), (byte[]) null);
            case 1:
                vqu vquVar = (vqu) this.a.dt.b();
                krv krvVar = this.a;
                apya apyaVar = krvVar.dF;
                psw pswVar = (psw) krvVar.hG.b();
                ryg rygVar = (ryg) this.a.ok.b();
                krv krvVar2 = this.a;
                return new nct(vquVar, apyaVar, pswVar, rygVar, krvVar2.a.bV, krvVar2.lq);
            case 2:
                krv krvVar3 = this.a;
                kqh kqhVar = this.e;
                kqp kqpVar = this.b;
                return new mlt(krvVar3.z, krvVar3.m, krvVar3.ay, krvVar3.lq, kqhVar.d, kqpVar.f, krvVar3.bV, krvVar3.aC, krvVar3.dd, kqpVar.A, krvVar3.yz, krvVar3.a.ca, krvVar3.aF, krvVar3.dF, null, null);
            case 3:
                krv krvVar4 = this.a;
                return new ljp(krvVar4.z, krvVar4.ay, krvVar4.m, this.e.d, krvVar4.gY, krvVar4.bV, krvVar4.aC, this.b.ae, krvVar4.du, krvVar4.dd, krvVar4.dF);
            case 4:
                return new qdq(this, null);
            case 5:
                return new qdq(this, null);
            case 6:
                Activity activity = this.e.a;
                if (activity != null) {
                    return activity;
                }
                throw new IllegalStateException("Attempted use of the activity when it is null");
            case 7:
                agap n = ((agat) ((apxq) ((aklj) this.e.f.b()).a).aS()).n();
                n.getClass();
                return n;
            case 8:
                kqh kqhVar2 = this.e;
                return aktp.A(aetn.bd(kqhVar2.a), kqhVar2.U);
            case 9:
                return new ink((Activity) this.e.e.b(), (agak) this.e.g.b());
            case 10:
                atal d = ((inz) ((apxq) ((aklj) this.e.f.b()).a).aS()).d();
                d.getClass();
                return d;
            case 11:
                ioc c = ((iny) ((apxq) ((aklj) this.e.f.b()).a).aS()).c();
                c.getClass();
                return c;
            case 12:
                yjl j = ((yjm) ((apxq) ((aklj) this.e.f.b()).a).aS()).j();
                j.getClass();
                return j;
            case 13:
                aqws b = ((ihh) ((apxq) ((aklj) this.e.f.b()).a).aS()).b();
                b.getClass();
                return b;
            case 14:
                iyh g = ((iyg) ((apxq) ((aklj) this.e.f.b()).a).aS()).g();
                g.getClass();
                return g;
            case 15:
                yyp k = ((yyg) ((apxq) ((aklj) this.e.f.b()).a).aS()).k();
                k.getClass();
                return k;
            case 16:
                return new uac((ansy) this.a.ct.b(), (ahiy) this.a.aC.b(), (byte[]) null);
            case 17:
                Context context = (Context) this.a.n.b();
                kqh kqhVar3 = this.e;
                return new iqr(context, new iji((Context) kqhVar3.e.b(), (aksr) kqhVar3.V.d.b(), (gpx) kqhVar3.V.am.b()), 0);
            case 18:
                return new iqr((Context) this.a.n.b(), (vqu) this.a.dt.b(), 1);
            case 19:
                iqt f = ((iqu) ((apxq) ((aklj) this.e.f.b()).a).aS()).f();
                f.getClass();
                return f;
            case 20:
                return new ipq();
            case 21:
                lkd lkdVar = (lkd) this.d.e.b();
                arwe arweVar = (arwe) this.e.t.b();
                enh enhVar = (enh) this.e.v.b();
                kqh kqhVar4 = this.e;
                alok h = alor.h(50);
                h.h(lla.class, new lld(kqhVar4.a()));
                h.h(lle.class, new lll((Context) kqhVar4.e.b(), (ajwt) kqhVar4.V.b.b(), kqhVar4.b.a.dz, 1));
                h.h(llf.class, new llq((Context) kqhVar4.e.b(), kqhVar4.V.ag, 1));
                h.h(llg.class, new lli((Context) kqhVar4.e.b(), kqhVar4.b()));
                h.h(llj.class, new lll((Context) kqhVar4.e.b(), kqhVar4.k, kqhVar4.b.yJ, 0));
                h.h(llm.class, new llo((Context) kqhVar4.e.b(), kqhVar4.b()));
                h.h(llp.class, new llq((Context) kqhVar4.e.b(), (qky) kqhVar4.b.a.cL.b(), 0));
                h.h(llr.class, new lmj((jci) kqhVar4.b.a.db.b(), 1));
                Activity activity2 = (Activity) kqhVar4.e.b();
                krv krvVar5 = kqhVar4.b;
                h.h(llu.class, new llw(activity2, kqhVar4.V.am, krvVar5.a.dD, (mbl) krvVar5.ci.b(), (obo) kqhVar4.b.BS.b()));
                h.h(llx.class, new llz(kqhVar4.V.u, kqhVar4.w, kqhVar4.b.uN));
                h.h(lls.class, new lma((Context) kqhVar4.e.b(), kqhVar4.V.u, kqhVar4.b()));
                h.h(lmb.class, new lmc((Activity) kqhVar4.e.b()));
                h.h(lmd.class, new lnt((ajwt) kqhVar4.V.b.b(), (aabr) kqhVar4.b.a.dr.b(), 1));
                h.h(lme.class, new lmh((Context) kqhVar4.e.b(), kqhVar4.d(), kqhVar4.a()));
                h.h(lmi.class, new lmj((Context) kqhVar4.e.b(), 0));
                Activity activity3 = (Activity) kqhVar4.e.b();
                krv krvVar6 = kqhVar4.b;
                h.h(lmk.class, new lml(activity3, krvVar6.yJ, (Optional) ((apxx) krvVar6.a.dp).a, (abbj) kqhVar4.z.b(), new nnu(kqhVar4.b.a.a.bN)));
                h.h(lmn.class, new lmm((Context) kqhVar4.e.b(), (ajwt) kqhVar4.V.b.b(), kqhVar4.b.a.iR(), kqhVar4.f()));
                h.h(lmo.class, new lll((Context) kqhVar4.e.b(), (ajwt) kqhVar4.V.b.b(), kqhVar4.V.ag, 2, null));
                h.h(lmp.class, new lll((Context) kqhVar4.e.b(), (qoq) kqhVar4.V.u.b(), kqhVar4.b(), 3));
                h.h(lmr.class, new lmj((Context) kqhVar4.e.b(), (gpx) kqhVar4.V.am.b(), 2));
                Context context2 = (Context) kqhVar4.e.b();
                krv krvVar7 = kqhVar4.b;
                h.h(lms.class, new lmt(context2, krvVar7.fz(), (abbu) krvVar7.yF.b()));
                h.h(lmu.class, new lmj((ktk) kqhVar4.A.b(), 3));
                h.h(lmv.class, new lmz((Context) kqhVar4.e.b(), kqhVar4.d(), kqhVar4.a(), Optional.empty(), kqhVar4.f()));
                h.h(lnc.class, new lmj((cj) kqhVar4.u.b(), 4));
                Context context3 = (Context) kqhVar4.e.b();
                arpi arpiVar = (arpi) kqhVar4.b.dN.b();
                arwe arweVar2 = (arwe) kqhVar4.t.b();
                kqp kqpVar2 = kqhVar4.V;
                h.h(lnd.class, new lnf(context3, arpiVar, arweVar2, kqpVar2.y, kqhVar4.b.cu, kqpVar2.j));
                h.h(lng.class, new llq((Context) kqhVar4.e.b(), kqhVar4.B, 2, (byte[]) null));
                h.h(lnh.class, new lnj((uxx) kqhVar4.V.x.b(), kqhVar4.a()));
                h.h(lnl.class, new lmj((Context) kqhVar4.e.b(), 5));
                Optional optional = (Optional) ((apxx) kqhVar4.C).a;
                Activity activity4 = (Activity) kqhVar4.e.b();
                h.h(lnm.class, new llq(optional, activity4, 3));
                h.h(lno.class, new lmj((Context) kqhVar4.e.b(), 6));
                kqhVar4.a();
                h.h(lnp.class, new lnr());
                h.h(lns.class, new lnt((cj) kqhVar4.u.b(), 0));
                h.h(lnu.class, new lll((Context) kqhVar4.e.b(), (arwe) kqhVar4.b.bQ.b(), kqhVar4.V.ag, 4));
                h.h(lnv.class, new lmj((Context) kqhVar4.e.b(), 7));
                h.h(lny.class, new lob(kqhVar4.k, 1));
                h.h(loa.class, new lob(kqhVar4.a(), 0));
                h.h(loc.class, new lmj((Context) kqhVar4.e.b(), 8));
                h.h(lod.class, new lnt((ajwt) kqhVar4.V.b.b(), (aabr) kqhVar4.b.a.dr.b(), kqhVar4.b.a.dF, 2));
                h.h(loe.class, new lnt((ajwt) kqhVar4.V.b.b(), (aabr) kqhVar4.b.a.dr.b(), 3, (byte[]) null));
                h.h(lof.class, new lll((Activity) kqhVar4.e.b(), (armf) kqhVar4.b.za, (armf) kqhVar4.V.ag, 5));
                h.h(log.class, new lmj((Context) kqhVar4.e.b(), 9));
                h.h(loh.class, new loj((Context) kqhVar4.e.b(), (qky) kqhVar4.b.a.cL.b(), kqhVar4.b.dq));
                h.h(lok.class, new lom((Context) kqhVar4.e.b(), kqhVar4.b()));
                h.h(loo.class, new lop((Context) kqhVar4.e.b(), kqhVar4.V.u, kqhVar4.b(), (ajwt) kqhVar4.V.b.b()));
                krv krvVar8 = kqhVar4.b;
                h.h(loz.class, new lpc((Optional) ((apxx) krvVar8.mY).a, (arwe) krvVar8.bQ.b(), (acdd) kqhVar4.b.a.dG.b(), (aiim) kqhVar4.E.b(), (yjf) kqhVar4.b.bU.b()));
                h.h(lor.class, new llq((Context) kqhVar4.e.b(), (qky) kqhVar4.b.a.cL.b(), 4, (byte[]) null));
                h.h(los.class, new llq((Context) kqhVar4.e.b(), kqhVar4.F, 5, (char[]) null));
                h.h(lot.class, new low((Context) kqhVar4.b.n.b(), kqhVar4.a(), (kor) kqhVar4.b.a.cb.b()));
                h.h(lox.class, new lmj((Context) kqhVar4.e.b(), 10));
                h.h(loy.class, new lmj((Context) kqhVar4.e.b(), 11));
                alor b2 = h.b();
                kqh kqhVar5 = this.e;
                return new lkc(lkdVar, arweVar, enhVar, b2, alor.n(lko.class, new lkn((lkd) kqhVar5.W.e.b()), lkw.class, new lkv((lkd) kqhVar5.W.e.b()), lkz.class, new lky((lkd) kqhVar5.W.e.b())));
            case 22:
                arpi arpiVar2 = (arpi) this.d.b.b();
                apxa apxaVar = (apxa) this.d.a.b();
                aklj akljVar = (aklj) this.e.f.b();
                arpiVar2.getClass();
                apxaVar.getClass();
                akljVar.getClass();
                aiut.c();
                arwe e = arwi.e(arpiVar2.plus(new aryj(null)));
                akdo akdoVar = new akdo(apxaVar, akljVar, e);
                apxaVar.a(akdoVar);
                akljVar.N().c(akdoVar);
                return e;
            case 23:
                return akdp.l((cj) this.e.u.b());
            case 24:
                return akdp.k((Activity) this.e.e.b());
            case 25:
                return new lga((arpi) this.a.dj.b(), (lrf) this.a.tA.b(), this.b.h);
            case 26:
                kqp kqpVar3 = this.b;
                krv krvVar9 = this.a;
                apya apyaVar2 = kqpVar3.ag;
                apwt a = apxv.a(krvVar9.gD);
                aaya aayaVar = (aaya) this.e.y.b();
                mbl mblVar = (mbl) this.a.bB.b();
                xbf xbfVar = (xbf) this.a.hA.b();
                krv krvVar10 = this.a;
                return new abbj(apyaVar2, a, aayaVar, mblVar, xbfVar, krvVar10.yJ, (abbu) krvVar10.yF.b(), (aksr) this.b.d.b());
            case 27:
                krv krvVar11 = this.a;
                apya apyaVar3 = krvVar11.n;
                apya apyaVar4 = krvVar11.av;
                apya a2 = apyb.a(krvVar11.gD);
                krv krvVar12 = this.a;
                kqh kqhVar6 = this.e;
                kqp kqpVar4 = this.b;
                apya apyaVar5 = krvVar12.bB;
                krx krxVar = krvVar12.a;
                return new aaya(apyaVar3, apyaVar4, a2, apyaVar5, krxVar.cM, krxVar.cN, kqhVar6.x, krvVar12.sR, krxVar.L, krvVar12.bV, krvVar12.gC, kqpVar4.d, krvVar12.ay, krvVar12.fY, krvVar12.fM, kqpVar4.ah, krvVar12.gb);
            case 28:
                krv krvVar13 = this.a;
                krx krxVar2 = krvVar13.a;
                apya apyaVar6 = krvVar13.av;
                apya apyaVar7 = krxVar2.cO;
                apya a3 = apyb.a(krvVar13.gD);
                krv krvVar14 = this.a;
                return new zap(apyaVar6, apyaVar7, a3, krvVar14.sR, krvVar14.aB, krvVar14.gC);
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return new ktk((Activity) this.e.e.b());
            case 30:
                hgj hgjVar = (hgj) this.a.uZ.b();
                anen anenVar = (anen) this.a.m.b();
                psi psiVar = (psi) this.a.qV.b();
                krv krvVar15 = this.a;
                return new psh(hgjVar, anenVar, psiVar, krvVar15.aE, (yjr) krvVar15.bO.b());
            case 31:
                ajxd r = ((ajxk) aovp.m(((aklj) this.e.f.b()).a, ajxk.class)).r();
                r.getClass();
                return r;
            case 32:
                aiim O = ((afkp) ((apxq) ((aklj) this.e.f.b()).a).aS()).O();
                O.getClass();
                return O;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return Optional.of(this.a.a.hz());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return new zgd((Context) this.e.e.b(), (arwe) this.e.t.b(), (enh) this.e.v.b(), (zge) this.d.f.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                apxv.a(this.e.I);
                return Optional.empty();
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                apxv.a(this.e.K);
                return Optional.empty();
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                kyf C = ((kyr) ((apxq) ((aklj) this.e.f.b()).a).aS()).C();
                C.getClass();
                return C;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return new vyv((yyb) this.a.au.b());
            case 39:
                return new vyv(this.e.N, (boolean[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return new iew((Context) this.a.n.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                apvo G = ((lfc) ((apxq) ((aklj) this.e.f.b()).a).aS()).G();
                G.getClass();
                return G;
            default:
                return akkr.b((aklj) this.e.f.b());
        }
    }
}
