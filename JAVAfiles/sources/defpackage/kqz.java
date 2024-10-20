package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqz implements apya {
    public final krv a;
    public final kql b;
    private final int c;
    private final kqp d;
    private final kqh e;

    public kqz(krv krvVar, kqp kqpVar, kqh kqhVar, kql kqlVar, int i) {
        this.a = krvVar;
        this.d = kqpVar;
        this.e = kqhVar;
        this.b = kqlVar;
        this.c = i;
    }

    private final Object a() {
        int i = this.c;
        switch (i) {
            case 0:
                return new uac((ansy) this.a.ct.b(), (ahiy) this.a.aC.b(), (byte[]) null);
            case 1:
                krv krvVar = this.a;
                return new mci(krvVar.eB, new itw(4), (Executor) krvVar.m.b());
            case 2:
                kql kqlVar = this.b;
                return new nhh((cg) ((apxx) kqlVar.d).a, kqlVar.e, kqlVar.h, this.a.a.bU);
            case 3:
                return ahkm.j((cg) ((apxx) this.b.d).a);
            case 4:
                krv krvVar2 = this.a;
                kql kqlVar2 = this.b;
                return new kjp(krvVar2.n, krvVar2.z, kqlVar2.f, this.d.d, kqlVar2.g);
            case 5:
                return new ngu((Context) this.a.n.b());
            case 6:
                return new hwr(null);
            case 7:
                return new abco((Context) this.a.n.b(), (yjv) this.a.aM.b(), (yjy) this.a.aF.b(), (abbu) this.a.yF.b());
            case 8:
                return ifc.m((cg) ((apxx) this.b.d).a);
            case 9:
                return new kor(Optional.empty(), Optional.empty());
            case 10:
                return new iew((Set) altg.a);
            case 11:
                return new qdq(this, null);
            case 12:
                vqu vquVar = (vqu) this.a.dt.b();
                krv krvVar3 = this.a;
                apya apyaVar = krvVar3.dF;
                psw pswVar = (psw) krvVar3.hG.b();
                ryg rygVar = (ryg) this.a.ok.b();
                krv krvVar4 = this.a;
                return new nct(vquVar, apyaVar, pswVar, rygVar, krvVar4.a.bV, krvVar4.lq);
            case 13:
                krv krvVar5 = this.a;
                kqp kqpVar = this.d;
                kql kqlVar3 = this.b;
                krx krxVar = krvVar5.a;
                return new rss(krvVar5.bV, krvVar5.hD, krvVar5.dt, krvVar5.hA, krvVar5.hC, krvVar5.n, krvVar5.az, krvVar5.aF, krvVar5.je, krvVar5.pj, krvVar5.ea, krvVar5.uD, kqpVar.z, kqlVar3.n, krvVar5.pS, krvVar5.oG, krvVar5.eQ, krxVar.bW, kqlVar3.p, kqpVar.N, krvVar5.dF, krxVar.bX, krvVar5.rm, krxVar.bY, krvVar5.z, krvVar5.rl, krxVar.bZ);
            case 14:
                return new rvp((vqu) this.a.dt.b(), (xbf) this.a.hA.b(), (nct) this.b.n.b(), this.a.dF, this.d.N);
            case 15:
                return new aohs((cg) ((apxx) this.b.d).a, (Executor) this.a.ba.b());
            case 16:
                kql kqlVar4 = this.b;
                return akdp.p((cg) ((apxx) kqlVar4.d).a, (akmy) kqlVar4.t.b(), (ahiy) this.a.aC.b(), (Executor) this.a.ba.b());
            case 17:
                cg cgVar = (cg) ((apxx) this.b.d).a;
                return akmy.c(cgVar, cgVar);
            case 18:
                krv krvVar6 = this.a;
                return new gpx(krvVar6.av, krvVar6.bY, krvVar6.vH, (xnv) krvVar6.bV.b());
            case 19:
                kql kqlVar5 = this.b;
                krv krvVar7 = this.a;
                krx krxVar2 = krvVar7.a;
                return new ipd(kqlVar5.d, kqlVar5.F, kqlVar5.I, krxVar2.cr, kqlVar5.J, kqlVar5.L, kqlVar5.M, kqlVar5.N, kqlVar5.O, kqlVar5.R, kqlVar5.S, kqlVar5.T, kqlVar5.U, kqlVar5.V, kqlVar5.aa, krxVar2.cu, kqlVar5.ak, kqlVar5.am, krvVar7.ft, kqlVar5.an, krxVar2.cw, krxVar2.cx, kqlVar5.ao, kqlVar5.ap);
            case 20:
                kqh kqhVar = this.e;
                kql kqlVar6 = this.b;
                return new afxz(kqhVar.e, kqhVar.g, kqlVar6.A, apyb.a(kqlVar6.B), apyb.a(this.b.C), this.b.E);
            case 21:
                krv krvVar8 = this.a;
                kql kqlVar7 = this.b;
                return new agcp((armf) krvVar8.yA, (armf) kqlVar7.y, (armf) kqlVar7.z, (byte[]) null);
            case 22:
                return new aday(this.e.e, this.b.x, (byte[]) null, (byte[]) null);
            case 23:
                return new adwo(this.a.yA, (char[]) null);
            case 24:
                return new aday(this.e.e, this.b.x, null, null, null);
            case 25:
                alok h = alor.h(7);
                h.h(afid.class, acyb.l());
                h.h(afof.class, (agae) this.a.a.ce.b());
                h.h(afpb.class, (agae) this.a.a.cf.b());
                h.h(afvx.class, acyb.p());
                h.h(afxh.class, acyb.q());
                h.h(agit.class, agdj.c());
                h.h(afre.class, acyb.o());
                return h.b();
            case 26:
                krx krxVar3 = this.a.a;
                alok h2 = alor.h(6);
                h2.h(agek.b, krx.hY(krxVar3));
                h2.h(agek.a, acyb.l());
                h2.h(agek.d, acyb.p());
                h2.h(agek.e, acyb.q());
                h2.h(agek.g, agdj.c());
                h2.h(agek.h, acyb.o());
                return h2.b();
            case 27:
                return akdp.d((arpi) this.b.D.b(), (cg) ((apxx) this.b.d).a);
            case 28:
                krv krvVar9 = this.a;
                return akdp.s(krvVar9.Rh(), (aneo) krvVar9.ba.b());
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                krv krvVar10 = this.a;
                kql kqlVar8 = this.b;
                return new aiim(krvVar10.a.cl, kqlVar8.G, kqlVar8.H, this.d.af, null);
            case 30:
                krv krvVar11 = this.a;
                return new agcp(krvVar11.dO, krvVar11.yA, krvVar11.a.cp);
            case 31:
                krv krvVar12 = this.a;
                return new aday(krvVar12.dO, krvVar12.a.cg, null, null, null, null);
            case 32:
                return new ifb((armf) this.b.c, (armf) this.a.a.bW, (byte[]) null, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                kql kqlVar9 = this.b;
                return new ifb((armf) kqlVar9.c, (armf) kqlVar9.K, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return new ifb((rtg) this.a.oG.b(), (rtb) this.a.eb.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return new ifb(this.b.c, this.a.a.bW, null, null, null, null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                kql kqlVar10 = this.b;
                return new ifb(kqlVar10.c, kqlVar10.K, (char[]) null, (byte[]) null, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return new ifb(this.a.a.bW, this.b.K, (byte[]) null, (char[]) null, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                kqh kqhVar2 = this.e;
                krv krvVar13 = this.a;
                kql kqlVar11 = this.b;
                return new gqg(kqhVar2.e, krvVar13.a.bW, kqlVar11.P, kqlVar11.c, kqlVar11.Q, (byte[]) null);
            case 39:
                return new kor(Optional.empty(), Optional.empty());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return new kor(Optional.empty(), Optional.empty());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                kql kqlVar12 = this.b;
                krv krvVar14 = this.a;
                krx krxVar4 = krvVar14.a;
                return new jat(kqlVar12.d, krvVar14.n, krxVar4.bW, kqlVar12.P, krxVar4.cb, kqlVar12.c, kqlVar12.Q, (byte[]) null, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return new ifb(this.b.c, this.a.a.bW, (char[]) null, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                kql kqlVar13 = this.b;
                return new ifb(kqlVar13.c, kqlVar13.K, (byte[]) null, (byte[]) null, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return new ifb(this.a.a.bW, this.b.K, (byte[]) null, (char[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                kql kqlVar14 = this.b;
                krv krvVar15 = this.a;
                return new rae(kqlVar14.W, krvVar15.bQ, krvVar15.po, krvVar15.bV, krvVar15.eb, kqlVar14.X, krvVar15.yF, kqlVar14.Y, kqlVar14.Z, null, null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return new ngv((Context) this.a.n.b(), (aneo) this.a.m.b(), (anen) this.a.z.b(), new hgj((byte[]) null, (char[]) null), (yxb) this.a.hw.b());
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return new ngw((arwe) this.a.bQ.b());
            case 48:
                krv krvVar16 = this.a;
                return new mcu(krvVar16.eB, new itw(4), (Executor) krvVar16.m.b());
            case 49:
                krv krvVar17 = this.a;
                return new mcx(krvVar17.eB, new itw(4), (Executor) krvVar17.m.b());
            case 50:
                kql kqlVar15 = this.b;
                return new ifq(kqlVar15.ag, kqlVar15.ah, kqlVar15.ai, kqlVar15.aj, this.a.a.ct);
            case 51:
                kqh kqhVar3 = this.e;
                kql kqlVar16 = this.b;
                krv krvVar18 = this.a;
                return new lig(kqhVar3.e, kqlVar16.ac, kqlVar16.c, krvVar18.bP, kqlVar16.ad, kqlVar16.ae, krvVar18.n, kqlVar16.d, krvVar18.dN, kqlVar16.E, kqlVar16.af, krvVar18.a.bD);
            case 52:
                kqh kqhVar4 = this.e;
                krv krvVar19 = this.a;
                kql kqlVar17 = this.b;
                return new gqg(kqhVar4.e, krvVar19.bV, kqlVar17.ab, krvVar19.de, kqlVar17.E);
            case 53:
                krv krvVar20 = this.a;
                apya apyaVar2 = krvVar20.eB;
                itw itwVar = new itw(4);
                return new mcm(apyaVar2, itwVar, (Executor) this.a.m.b());
            case 54:
                return new zkm((atsg) this.d.S.b(), (Executor) this.a.z.b(), (uvi) this.a.de.b());
            case 55:
                return new aajt((Context) this.a.n.b());
            case 56:
                Context context = (Context) this.a.n.b();
                yce yceVar = (yce) this.a.df.b();
                return new abac(context, yceVar);
            case 57:
                kqh kqhVar5 = this.e;
                kql kqlVar18 = this.b;
                krv krvVar21 = this.a;
                return new iql(kqhVar5.e, kqlVar18.ac, krvVar21.bP, kqlVar18.c, krvVar21.pS, krvVar21.eH);
            case 58:
                return new iji((armf) this.e.e, (armf) this.b.ac, (armf) this.a.a.cv);
            case 59:
                return new ipq();
            case 60:
                return acyb.m((eoz) this.b.al.b());
            case 61:
                return acyb.n((Activity) this.e.e.b(), (cg) ((apxx) this.b.d).a, Optional.empty());
            case 62:
                return new ygv((aquq) this.a.xy.b());
            case 63:
                return new adwq(this.e.e.b());
            case 64:
                return Optional.of((aday) this.a.a.cy.b());
            case 65:
                kqh kqhVar6 = this.e;
                return new gpx(kqhVar6.e, kqhVar6.h, kqhVar6.i, kqhVar6.j, (short[]) null);
            case 66:
                return new kor(Optional.empty(), Optional.empty());
            case 67:
                return new abac(this.b.aC, this.a.av, null);
            case 68:
                kql kqlVar19 = this.b;
                krv krvVar22 = kqlVar19.a;
                apya apyaVar3 = kqlVar19.at;
                apya apyaVar4 = krvVar22.oX;
                apya apyaVar5 = kqlVar19.av;
                aaso aasoVar = new aaso(apyaVar3, apyaVar4, apyaVar5, krvVar22.bU, kqlVar19.aw, apyaVar5, apyaVar5);
                kql kqlVar20 = this.b;
                krv krvVar23 = kqlVar20.a;
                aasz aaszVar = new aasz(kqlVar20.at, krvVar23.oX, kqlVar20.av, krvVar23.bU, krvVar23.bV, kqlVar20.ax, kqlVar20.as, kqlVar20.ay);
                kql kqlVar21 = this.b;
                krv krvVar24 = kqlVar21.a;
                krx krxVar5 = krvVar24.a;
                aarf aarfVar = new aarf(krvVar24.n, krvVar24.oX, kqlVar21.aA, kqlVar21.az, krxVar5.cB, krxVar5.cC);
                kql kqlVar22 = this.b;
                krv krvVar25 = kqlVar22.a;
                aapq aapqVar = new aapq(krvVar25.bV, kqlVar22.ad, kqlVar22.ae, kqlVar22.el.e, kqlVar22.aB, kqlVar22.ab, krvVar25.ba, kqlVar22.af, krvVar25.a.bD);
                alok alokVar = new alok();
                alokVar.h(apel.EMOJI, aarfVar);
                alokVar.h(apel.GALLERY, aasoVar);
                alokVar.h(apel.CAMERA_GALLERY, aaszVar);
                alokVar.h(apel.CONTACT, aapqVar);
                return alokVar.b();
            case 69:
                final ajwt ajwtVar = (ajwt) this.d.b.b();
                ajwtVar.getClass();
                int i2 = inx.b;
                return new inx() { // from class: inv
                    @Override // defpackage.inx
                    public final ajwt a() {
                        int i3 = inw.a;
                        return ajwt.this;
                    }
                };
            case 70:
                krv krvVar26 = this.a;
                kql kqlVar23 = this.b;
                return new yyz(krvVar26.n, kqlVar23.at, krvVar26.bV, krvVar26.ft, krvVar26.bU, this.e.k, krvVar26.z, krvVar26.DD, krvVar26.yF, krvVar26.yG, krvVar26.a.cb, kqlVar23.au, krvVar26.pH, null);
            case 71:
                return new kor(Optional.empty(), Optional.empty());
            case 72:
                Context context2 = (Context) this.a.n.b();
                yjf yjfVar = (yjf) this.a.bU.b();
                krv krvVar27 = this.a;
                ContentResolver z = krvVar27.z();
                anen anenVar = (anen) krvVar27.z.b();
                kql kqlVar24 = this.b;
                return new aatp(context2, yjfVar, z, anenVar, kqlVar24.d(), kqlVar24.p());
            case 73:
                Context context3 = (Context) this.a.n.b();
                yjf yjfVar2 = (yjf) this.a.bU.b();
                krv krvVar28 = this.a;
                ContentResolver z2 = krvVar28.z();
                anen anenVar2 = (anen) krvVar28.z.b();
                kql kqlVar25 = this.b;
                return new aatl(context3, yjfVar2, z2, anenVar2, kqlVar25.d(), kqlVar25.p());
            case 74:
                return false;
            case 75:
                kql kqlVar26 = this.b;
                return new zme(kqlVar26.c, this.a.a.cB, kqlVar26.az);
            case 76:
                return new aaak();
            case 77:
                return new zmr((armf) this.a.bV);
            case 78:
                return new zme((ykw) this.a.av.b(), (alor) this.b.aC.b());
            case 79:
                krv krvVar29 = this.a;
                kqh kqhVar7 = this.e;
                kql kqlVar27 = this.b;
                return new ifq(krvVar29.bV, kqhVar7.m, kqlVar27.aG, kqlVar27.aI, (ifb) krvVar29.a.cI.b());
            case 80:
                return new ahmn((aksr) this.d.d.b(), null);
            case 81:
                kql kqlVar28 = this.b;
                krv krvVar30 = this.a;
                kqp kqpVar2 = this.d;
                krx krxVar6 = krvVar30.a;
                return new rae(kqlVar28.aH, krvVar30.kR, krxVar6.cH, kqpVar2.h, kqpVar2.d, krxVar6.cG, krvVar30.mM, krvVar30.kO, krvVar30.ba, (char[]) null);
            case 82:
                return new hgj((armf) this.d.d);
            case 83:
                krv krvVar31 = this.a;
                return new ifb(krvVar31.n, krvVar31.bV, (char[]) null);
            case 84:
                return new ifb(this.a.bV, this.b.aG, (short[]) null);
            case 85:
                return new zpp((ahmn) this.b.aG.b());
            case 86:
                kqp kqpVar3 = this.d;
                krv krvVar32 = this.a;
                apya apyaVar6 = kqpVar3.ag;
                apwt a = apxv.a(krvVar32.gD);
                aaya aayaVar = (aaya) this.b.aQ.b();
                mbl mblVar = (mbl) this.a.bB.b();
                xbf xbfVar = (xbf) this.a.hA.b();
                krv krvVar33 = this.a;
                return new abbj(apyaVar6, a, aayaVar, mblVar, xbfVar, krvVar33.yJ, (abbu) krvVar33.yF.b(), (aksr) this.d.d.b());
            case 87:
                krv krvVar34 = this.a;
                apya apyaVar7 = krvVar34.n;
                apya apyaVar8 = krvVar34.av;
                apya a2 = apyb.a(krvVar34.gD);
                krv krvVar35 = this.a;
                kql kqlVar29 = this.b;
                kqp kqpVar4 = this.d;
                apya apyaVar9 = krvVar35.bB;
                krx krxVar7 = krvVar35.a;
                return new aaya(apyaVar7, apyaVar8, a2, apyaVar9, krxVar7.cM, krxVar7.cN, kqlVar29.aP, krvVar35.sR, krxVar7.L, krvVar35.bV, krvVar35.gC, kqpVar4.d, krvVar35.ay, krvVar35.fY, krvVar35.fM, kqpVar4.ah, krvVar35.gb);
            case 88:
                krv krvVar36 = this.a;
                krx krxVar8 = krvVar36.a;
                apya apyaVar10 = krvVar36.av;
                apya apyaVar11 = krxVar8.cO;
                apya a3 = apyb.a(krvVar36.gD);
                krv krvVar37 = this.a;
                return new zap(apyaVar10, apyaVar11, a3, krvVar37.sR, krvVar37.aB, krvVar37.gC);
            case 89:
                Executor executor = (Executor) this.a.z.b();
                krv krvVar38 = this.a;
                return new iui(executor, krvVar38.cj, (ahiy) krvVar38.aC.b());
            case 90:
                return new zxo(apxv.a(this.b.aX));
            case 91:
                zxr m = ((zxs) ((apxq) ((aklj) this.e.f.b()).a).aS()).m();
                m.getClass();
                return Optional.of(m);
            case 92:
                return new gpx((aneo) this.a.m.b(), (eoy) this.b.k.b(), this.a.dA, this.b.n());
            case 93:
                return new abbo(this.b.ba);
            case 94:
                anen anenVar3 = (anen) this.a.z.b();
                krv krvVar39 = this.a;
                return new laj(anenVar3, krvVar39.gN, krvVar39.gD, krvVar39.bY, krvVar39.av, krvVar39.tV, krvVar39.id, (xnv) krvVar39.bV.b());
            case 95:
                anen anenVar4 = (anen) this.a.ay.b();
                krv krvVar40 = this.a;
                return new abbq(anenVar4, krvVar40.a.cR, krvVar40.id, this.b.ba);
            case 96:
                return Optional.of(this.a.a.aY());
            case 97:
                krv krvVar41 = this.a;
                apya apyaVar12 = krvVar41.eB;
                Executor executor2 = (Executor) krvVar41.m.b();
                krv krvVar42 = this.a;
                return new ity(apyaVar12, executor2, krvVar42.fB, (arwe) krvVar42.bQ.b(), (arpi) this.a.bP.b(), (Context) this.a.n.b());
            case 98:
                return new qjh();
            case 99:
                return Optional.of(this.a.a.iR());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.c;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new jbg((aneo) this.a.z.b(), (eoy) this.b.k.b(), (ryg) this.a.dm.b(), this.a.dA);
            case 101:
                kql kqlVar = this.b;
                return new gpx(kqlVar.bl, this.e.e, this.d.d, kqlVar.bm, (byte[]) null, (byte[]) null);
            case 102:
                krv krvVar = this.a;
                return new iji((armf) krvVar.pR, (armf) krvVar.dd, (armf) this.e.e, (byte[]) null);
            case 103:
                return new ahmn((aksr) this.d.d.b(), null);
            case 104:
                kqp kqpVar = this.d;
                kql kqlVar2 = this.b;
                krv krvVar2 = this.a;
                krx krxVar = krvVar2.a;
                return new aabl(kqpVar.W, kqlVar2.c, kqlVar2.ab, kqlVar2.aD, kqlVar2.aE, krvVar2.gD, krxVar.cW, krvVar2.bV, krvVar2.ef, kqlVar2.K, krxVar.bW, krvVar2.yF, krvVar2.eQ);
            case 105:
                return new zfm((armf) this.a.n);
            case 106:
                return new zhg(this.a.a.cX, null, null);
            case 107:
                return new yai();
            case 108:
                return Optional.of(new ipq());
            case 109:
                return new znp((armf) this.d.h, (aneo) this.a.z.b());
            case 110:
                krv krvVar3 = this.a;
                kql kqlVar3 = this.b;
                kqh kqhVar = this.e;
                krx krxVar2 = krvVar3.a;
                return new yzk(krvVar3.n, krxVar2.cL, krvVar3.je, krvVar3.hA, krvVar3.bU, kqlVar3.bv, kqhVar.k, krxVar2.dk, krvVar3.oD, krxVar2.dm, krvVar3.yJ, kqlVar3.af, krxVar2.bD, apyb.a(krvVar3.fu), apyb.a(this.a.oZ), this.b.bx);
            case 111:
                return new yyb();
            case 112:
                return new zfh((armf) this.b.bw, (byte[]) null, (byte[]) null);
            case 113:
                kql kqlVar4 = this.b;
                krv krvVar4 = this.a;
                return new aair(kqlVar4.bA, krvVar4.bU, kqlVar4.bv, this.e.k, krvVar4.yF, krvVar4.bB, krvVar4.a.cv, kqlVar4.bz);
            case 114:
                return new aagc((xve) this.b.bz.b(), (Optional) ((apxx) this.b.aF).a);
            case 115:
                return new xve((Context) this.a.n.b());
            case 116:
                krv krvVar5 = this.a;
                apya apyaVar = krvVar5.a.cW;
                apya apyaVar2 = krvVar5.oC;
                mho mhoVar = (mho) krvVar5.gD.b();
                xbf xbfVar = (xbf) this.a.hA.b();
                ydc ydcVar = (ydc) this.a.dU.b();
                kql kqlVar5 = this.b;
                krv krvVar6 = kqlVar5.a;
                mcr mcrVar = new mcr(krvVar6.eB, new itw(4), (Executor) krvVar6.m.b(), kqlVar5.bC);
                lzz lzzVar = (lzz) this.a.fB.b();
                kql kqlVar6 = this.b;
                krv krvVar7 = this.a;
                Object l = kql.l(kqlVar6);
                anen anenVar = (anen) krvVar7.z.b();
                kqp kqpVar2 = this.d;
                krx krxVar3 = this.a.a;
                apya apyaVar3 = kqpVar2.ab;
                Optional of = Optional.of((ioy) krxVar3.cr.b());
                kql kqlVar7 = this.b;
                return new zry(apyaVar, apyaVar2, mhoVar, xbfVar, ydcVar, mcrVar, lzzVar, (znj) l, anenVar, apyaVar3, of, kqlVar7.bD, this.d.aa, kqlVar7.bE, this.a.a.ds);
            case 117:
                return new zfh(this.a.xy);
            case 118:
                cj cjVar = (cj) this.b.bH.b();
                kql kqlVar8 = this.b;
                krv krvVar8 = this.a;
                kqp kqpVar3 = this.d;
                return new igz(cjVar, kqlVar8.bK, krvVar8.yJ, kqpVar3.ag, krvVar8.pR, krvVar8.fD, (aksr) kqpVar3.d.b(), this.a.qV);
            case 119:
                return akdp.k((Activity) this.e.e.b());
            case 120:
                kql kqlVar9 = this.b;
                kqp kqpVar4 = this.d;
                krv krvVar9 = this.a;
                return new BlockAndReportSpamCallbacks(kqlVar9.bH, kqpVar4.X, kqlVar9.bI, kqlVar9.bJ, kqpVar4.u, krvVar9.yF, kqlVar9.e, kqpVar4.h, (anen) krvVar9.z.b());
            case 121:
                return new ibi((cj) this.b.bH.b(), (byte[]) null);
            case 122:
                return uxd.c((cg) ((apxx) this.b.d).a);
            case 123:
                cg cgVar = (cg) ((apxx) this.b.d).a;
                krv krvVar10 = this.a;
                return new yvp(cgVar, krvVar10.fu, krvVar10.fp, krvVar10.dd, this.d.d, krvVar10.bY);
            case 124:
                return new lgc();
            case 125:
                return new ibi((Object) this.a.bY, (byte[]) null);
            case 126:
                return new abav(this.a.bB);
            case 127:
                kql kqlVar10 = this.b;
                return new aahp(kqlVar10.bR, this.d.Y, kqlVar10.bL, this.a.qV);
            case 128:
                return new aajq((Context) this.a.n.b());
            case 129:
                return new izc((armf) this.a.ee);
            case 130:
                arwe arweVar = (arwe) this.a.dO.b();
                arpi arpiVar = (arpi) this.a.dN.b();
                arpi arpiVar2 = (arpi) this.a.bP.b();
                krv krvVar11 = this.a;
                return new iji(arweVar, arpiVar, arpiVar2, krx.aO(krvVar11.a), (ansy) krvVar11.ct.b());
            case 131:
                kql kqlVar11 = this.b;
                krv krvVar12 = this.a;
                return new wtt(kqlVar11.bZ, krvVar12.kG, krvVar12.aC, this.d.d, (arwe) krvVar12.dP.b());
            case 132:
                krv krvVar13 = this.a;
                kqp kqpVar5 = this.d;
                return new wtp(krvVar13.kG, krvVar13.a.dB, krvVar13.n, krvVar13.dK, krvVar13.uy, kqpVar5.K, kqpVar5.d, (arwe) krvVar13.dP.b(), (aneo) this.a.ay.b());
            case 133:
                return new kkc((arpi) this.a.dN.b(), (arpi) this.a.bP.b());
            case 134:
                krv krvVar14 = this.a;
                return new mgh(krvVar14.gN, krvVar14.fX, (arwe) krvVar14.dP.b());
            case 135:
                return new lfl((yjv) this.a.aM.b(), this.a.yF, this.d.O);
            case 136:
                Context context = (Context) this.e.e.b();
                return new lga(context);
            case 137:
                kqp kqpVar6 = this.d;
                krv krvVar15 = this.a;
                return new gqg(kqpVar6.P, krvVar15.pP, this.b.ci, krvVar15.xK, krvVar15.dA, null, null, null);
            case 138:
                return new uac(this.d.d, this.b.aG, (byte[]) null);
            case 139:
                kql kqlVar12 = this.b;
                cg cgVar2 = (cg) ((apxx) kqlVar12.d).a;
                krv krvVar16 = this.a;
                apya apyaVar4 = krvVar16.gD;
                apya apyaVar5 = krvVar16.bB;
                apya apyaVar6 = krvVar16.aF;
                apya apyaVar7 = kqlVar12.aQ;
                znj znjVar = (znj) kqlVar12.ck.b();
                zfh zfhVar = (zfh) this.b.cl.b();
                kql kqlVar13 = this.b;
                return new aaiz(cgVar2, apyaVar4, apyaVar5, apyaVar6, apyaVar7, znjVar, zfhVar, kqlVar13.cm, kqlVar13.co);
            case 140:
                krv krvVar17 = this.a;
                krv krvVar18 = this.b.a;
                return new znj((armf) krvVar17.av, new zlc(krvVar18.bV, krvVar18.bB, krvVar18.vk, krvVar18.gD, null, null));
            case 141:
                return new zfh((Object) this.a.aF, (byte[]) null);
            case 142:
                return new wft((whj) this.a.gL.b(), (xvu) this.a.vk.b(), kql.k(this.b), (anen) this.a.z.b(), (anen) this.a.m.b(), (xnv) this.a.bV.b());
            case 143:
                return new yyt((xnv) this.a.bV.b(), (anen) this.a.z.b(), (whj) this.a.gL.b(), this.b.cn);
            case 144:
                arpi arpiVar3 = (arpi) this.a.dj.b();
                arwe arweVar2 = (arwe) this.a.dP.b();
                krv krvVar19 = this.a;
                apya apyaVar8 = krvVar19.fX;
                apya apyaVar9 = krvVar19.gl;
                Context context2 = (Context) krvVar19.n.b();
                krv krvVar20 = this.a;
                return new wyp(arpiVar3, arweVar2, apyaVar8, apyaVar9, context2, krvVar20.eN, krvVar20.vk);
            case 145:
                kql kqlVar14 = this.b;
                cg cgVar3 = (cg) ((apxx) kqlVar14.d).a;
                krv krvVar21 = this.a;
                return new aazk(cgVar3, krvVar21.a.dW, krvVar21.gD, krvVar21.bB, krvVar21.dt, krvVar21.hs, kqlVar14.cn);
            case 146:
                krv krvVar22 = this.a;
                return new zlz(krvVar22.av, krvVar22.bB, krvVar22.bV, apyb.a(this.b.cs), (char[]) null);
            case 147:
                krv krvVar23 = this.a;
                apwt a = apxv.a(this.b.cr);
                anen anenVar2 = (anen) this.a.m.b();
                krx krxVar4 = krvVar23.a;
                return new aazm(krxVar4.v, krxVar4.y, a, anenVar2);
            case 148:
                krx krxVar5 = this.a.a;
                return new yfd(new znj((ghw) krxVar5.a.zC.b(), krxVar5.a.bY), this.a.bY);
            case 149:
                krv krvVar24 = this.a;
                krx krxVar6 = krvVar24.a;
                return new aiqj(krvVar24.gD, krvVar24.dt, krvVar24.aF, krvVar24.yJ, krxVar6.cO, krvVar24.av, krvVar24.n, krvVar24.z, krvVar24.ay, krvVar24.sR, krxVar6.dX);
            case 150:
                krv krvVar25 = this.a;
                kql kqlVar15 = this.b;
                return new yzk(krvVar25.gD, krvVar25.bB, krvVar25.aF, krvVar25.yJ, krvVar25.gL, krvVar25.pR, krvVar25.z, krvVar25.ay, kqlVar15.aQ, krvVar25.fY, krvVar25.fM, kqlVar15.cn, krvVar25.gW, krvVar25.dd, krvVar25.a.dY);
            case 151:
                krv krvVar26 = this.a;
                return new zoh(krvVar26.z, krvVar26.ay, krvVar26.ht);
            case 152:
                Activity activity = (Activity) this.e.e.b();
                anen anenVar3 = (anen) this.a.z.b();
                aohs aohsVar = (aohs) this.e.c.b();
                kyg kygVar = new kyg(this.b.h());
                aqws aqwsVar = (aqws) this.e.l.b();
                krv krvVar27 = this.a;
                krx krxVar7 = krvVar27.a;
                return new kxm(activity, anenVar3, aohsVar, kygVar, aqwsVar, krvVar27.ci, krxVar7.ee, Optional.empty(), new pgc(krxVar7.a.bN));
            case 153:
                return new kyc(Optional.empty());
            case 154:
                return new las(this.d.d, apxv.a(this.b.cz), apxv.a(this.b.cB), (akgu) this.b.u.b());
            case 155:
                krv krvVar28 = this.a;
                return new zmt(krvVar28.a.ef, krvVar28.aC);
            case 156:
                kql kqlVar16 = this.b;
                kqh kqhVar2 = kqlVar16.el;
                zmp zmpVar = zmp.DELETE;
                apya apyaVar10 = kqhVar2.e;
                apya apyaVar11 = kqlVar16.ej.d;
                apya apyaVar12 = kqlVar16.cA;
                apyaVar10.getClass();
                apyaVar11.getClass();
                apyaVar12.getClass();
                Context context3 = (Context) apyaVar10.b();
                aksr aksrVar = (aksr) apyaVar11.b();
                aksrVar.getClass();
                laz lazVar = new laz(context3, aksrVar, (atal) apyaVar12.b(), 0);
                kql kqlVar17 = this.b;
                return alor.n(zmpVar, lazVar, zmp.ARCHIVE, kqlVar17.b(), zmp.MARK_AS_READ_OR_UNREAD, kql.j(kqlVar17));
            case 157:
                return ((ghw) this.b.f()).u(R.drawable.quantum_gm_ic_delete_vd_theme_24);
            case 158:
                return ((ghw) this.b.f()).u(R.drawable.quantum_gm_ic_archive_vd_theme_24);
            case 159:
                return ((ghw) this.b.f()).u(R.drawable.messages_unread_chat_icon);
            case 160:
                return ((ghw) this.b.f()).u(R.drawable.messages_chat_icon);
            case 161:
                return new uwi(this.a.vo);
            case 162:
                kqh kqhVar3 = this.e;
                krv krvVar29 = this.a;
                return new wyp(kqhVar3.e, krvVar29.oj, krvVar29.hA, krvVar29.cy, this.b.cG, krvVar29.a.eg, krvVar29.dd, (byte[]) null);
            case 163:
                return new lfl((cj) this.b.bH.b(), this.b.cJ, this.a.bB, (aksr) this.d.d.b());
            case 164:
                apwt a2 = apxv.a(this.a.bV);
                kqp kqpVar7 = this.d;
                kql kqlVar18 = this.b;
                krv krvVar30 = this.a;
                return new kkg(a2, kqpVar7.U, kqlVar18.cI, krvVar30.cA, krvVar30.dd);
            case 165:
                krv krvVar31 = this.a;
                return new lqx(krvVar31.av, (xnv) krvVar31.bV.b(), (ahiy) this.a.aC.b(), this.b.cL, this.a.yD);
            case 166:
                return new lpg((armf) this.a.ci, (byte[]) null, (byte[]) null);
            case 167:
                kql kqlVar19 = this.b;
                return new lga(kqlVar19.cN, kqlVar19.cO, this.a.yD);
            case 168:
                kqh kqhVar4 = this.e;
                krx krxVar8 = kqhVar4.b.a;
                lga i2 = kqhVar4.i();
                lga lgaVar = new lga();
                kqh kqhVar5 = this.e;
                return alor.p("IMessagePromo", i2, "DittoBatteryPromo", lgaVar, "VerifiedSmsInvestigativeRpcPromo", kqh.h(kqhVar5), "BlockListAutoMigratedPromo", kqh.j(kqhVar5), "GaiaPairingPromo", new lga());
            case 169:
                return alor.l("DataDonationNotification", new lga());
            case 170:
                krv krvVar32 = this.b.a;
                return new altx(new lrb(krvVar32.oq, krvVar32.yJ, krvVar32.gD, (anen) krvVar32.z.b()));
            case 171:
                arwe arweVar3 = (arwe) this.a.dP.b();
                arwe arweVar4 = (arwe) this.a.dO.b();
                kql kqlVar20 = this.b;
                krv krvVar33 = this.a;
                return new abfh(arweVar3, arweVar4, kqlVar20.cV, kqlVar20.u, krvVar33.yF, kqlVar20.aQ, kqlVar20.cM, kqlVar20.cW, krvVar33.yD);
            case 172:
                krv krvVar34 = this.a;
                apya apyaVar13 = krvVar34.av;
                arwe arweVar5 = (arwe) krvVar34.dP.b();
                krv krvVar35 = this.a;
                apya apyaVar14 = krvVar35.aB;
                adwu adwuVar = (adwu) krvVar35.dM.b();
                krv krvVar36 = this.a;
                return new abgg(apyaVar13, arweVar5, apyaVar14, adwuVar, krvVar36.a.aR(), krvVar36.aC, (ahiy) krvVar36.tE.b(), (ansy) this.a.ct.b());
            case 173:
                return new ghw((char[]) null, (byte[]) null);
            case 174:
                return new lga((ghw) this.b.cZ.b());
            case 175:
                return new akmy((aksr) this.d.d.b());
            case 176:
                krv krvVar37 = this.a;
                return new zai(krvVar37.xM, krvVar37.fD, this.b.df, (anen) krvVar37.m.b());
            case 177:
                return new vjs(this.a.ff);
            case 178:
                krv krvVar38 = this.a;
                return new znj((Object) krvVar38.bY, (Object) krvVar38.bB, (char[]) null);
            case 179:
                cg cgVar4 = (cg) ((apxx) this.b.d).a;
                krv krvVar39 = this.a;
                return new abaa(cgVar4, krvVar39.a.eh, krvVar39.yH, krvVar39.yJ);
            case 180:
                kql kqlVar21 = this.b;
                cg cgVar5 = (cg) ((apxx) kqlVar21.d).a;
                krv krvVar40 = this.a;
                apya apyaVar15 = kqlVar21.f3do;
                arwe arweVar6 = (arwe) krvVar40.dP.b();
                kql kqlVar22 = this.b;
                return new aayj(cgVar5, apyaVar15, arweVar6, kqlVar22.aQ, kqlVar22.cn, this.a.gD, (lqx) kqlVar22.cM.b());
            case 181:
                arwe arweVar7 = (arwe) this.a.dP.b();
                arwe arweVar8 = (arwe) this.a.dO.b();
                kql kqlVar23 = this.b;
                krv krvVar41 = this.a;
                apya apyaVar16 = kqlVar23.aQ;
                apya apyaVar17 = krvVar41.av;
                apya apyaVar18 = krvVar41.vk;
                xyt xytVar = (xyt) krvVar41.gY.b();
                krv krvVar42 = this.a;
                return new aayd(arweVar7, arweVar8, apyaVar16, apyaVar17, apyaVar18, xytVar, krvVar42.aB, krvVar42.fM, krvVar42.fY, krvVar42.hr);
            case 182:
                krv krvVar43 = this.a;
                final apya apyaVar19 = krvVar43.a.a.bN;
                return new kor(new oao() { // from class: nke
                    @Override // defpackage.oao
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.cloud_sync_stop_hangouts_snackbar");
                    }
                }, (qif) krvVar43.on.b(), this.e.M, (qop) this.a.rp.b());
            case 183:
                krv krvVar44 = this.a;
                apya apyaVar20 = krvVar44.bY;
                apya apyaVar21 = krvVar44.k;
                return new qjk(apyaVar20, apyaVar21, (anen) this.a.z.b());
            case 184:
                krx krxVar9 = this.b.a.a;
                return new lfl(alpt.s(krxVar9.r(), krxVar9.q(), krxVar9.p()), (uac) this.b.b.b(), (ahiy) this.a.aC.b());
            case 185:
                return new ghw((Context) this.a.n.b());
            case 186:
                return new aktp();
            case 187:
                return new kor(this.a.m.b(), (armf) this.a.xy);
            case 188:
                Context context4 = (Context) this.a.n.b();
                krv krvVar45 = this.a;
                return new kpf(context4, krvVar45.cz, krvVar45.aM);
            case 189:
                return Optional.of((kxc) this.b.dC.b());
            case 190:
                cg cgVar6 = (cg) ((apxx) this.b.d).a;
                kqp kqpVar8 = this.d;
                krv krvVar46 = this.a;
                apya apyaVar22 = kqpVar8.b;
                arwe arweVar9 = (arwe) krvVar46.dO.b();
                Optional of2 = Optional.of(this.a.a.o());
                krv krvVar47 = this.a;
                return new kxc(cgVar6, apyaVar22, arweVar9, of2, krvVar47.cp, krvVar47.a.em);
            case 191:
                return new lpg((armf) this.a.dd);
            case 192:
                return new vco((aksr) this.d.d.b(), (armf) this.a.a.eo);
            case 193:
                cg cgVar7 = (cg) ((apxx) this.b.d).a;
                if (cgVar7 instanceof lfv) {
                    return (lfv) cgVar7;
                }
                throw new IllegalStateException(hht.e(cgVar7, lfx.class));
            case 194:
                cg cgVar8 = (cg) ((apxx) this.b.d).a;
                if (cgVar8 instanceof yyw) {
                    return (yyw) cgVar8;
                }
                throw new IllegalStateException(hht.e(cgVar8, yyz.class));
            case 195:
                return new krb(this, 1);
            case 196:
                return new akvf(new ahmn((aksr) this.d.d.b(), null));
            case 197:
                return new zig((Context) this.e.e.b(), (adve) this.a.vu.b());
            case 198:
                return new vjs(this.a.n.b(), (byte[]) null);
            case 199:
                return Optional.of(new vom());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        int i = this.c;
        int i2 = i / 100;
        if (i2 != 0) {
            if (i2 != 1) {
                switch (i) {
                    case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                        return new akhr((cg) ((apxx) this.b.d).a, (ahiy) this.a.aC.b(), (Executor) this.a.ba.b());
                    case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                        Context context = (Context) this.a.n.b();
                        arwe arweVar = (arwe) this.a.dO.b();
                        krv krvVar = this.a;
                        return new zib(context, arweVar, krvVar.yJ, krvVar.iL);
                    case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                        Context context2 = (Context) this.a.n.b();
                        krv krvVar2 = this.a;
                        apya apyaVar = krvVar2.bU;
                        apya apyaVar2 = krvVar2.yJ;
                        apya apyaVar3 = krvVar2.gD;
                        xnv xnvVar = (xnv) krvVar2.bV.b();
                        ExecutorService executorService = (ExecutorService) this.a.m.b();
                        krv krvVar3 = this.a;
                        return new zas(context2, apyaVar, apyaVar2, apyaVar3, xnvVar, executorService, krvVar3.gN, krvVar3.bO, krvVar3.pP, krvVar3.bB);
                    case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                        return Optional.of((ibh) this.b.dZ.b());
                    case 204:
                        return new ibh();
                    case 205:
                        return new rae((ykw) this.a.av.b(), (zxy) this.a.eN.b(), (Context) this.a.n.b(), (ansy) this.a.ct.b(), (anen) this.a.z.b(), (anen) this.a.m.b(), (ahiy) this.a.aC.b(), (kkc) this.a.a.cT.b(), this.a.a.er);
                    case 206:
                        Context context3 = (Context) this.a.n.b();
                        krv krvVar4 = this.a;
                        return new wyp(context3, krvVar4.ct, krvVar4.dm, krvVar4.gK, krvVar4.aF, krvVar4.hB, krvVar4.dd);
                    case 207:
                        cg cgVar = (cg) ((apxx) this.b.d).a;
                        if (cgVar instanceof zxw) {
                            return (zxw) cgVar;
                        }
                        throw new IllegalStateException(hht.e(cgVar, zxy.class));
                    case 208:
                        Context context4 = (Context) this.a.n.b();
                        kql kqlVar = this.b;
                        krv krvVar5 = this.a;
                        apya apyaVar4 = kqlVar.ab;
                        mbl mblVar = (mbl) krvVar5.bB.b();
                        ydh ydhVar = (ydh) this.a.eH.b();
                        yfo yfoVar = (yfo) this.a.eA.b();
                        uff uffVar = (uff) this.a.dZ.b();
                        krv krvVar6 = this.a;
                        return new ahmv(context4, apyaVar4, mblVar, ydhVar, yfoVar, uffVar, krvVar6.yJ, (wfh) krvVar6.oF.b(), (xnv) this.a.bV.b());
                    case 209:
                        return new aatk((Context) this.a.n.b(), (anen) this.a.z.b(), (enm) ((apxx) this.b.d).a, (atsg) this.d.S.b(), (aksr) this.d.d.b(), (ahiy) this.a.aC.b(), this.b.d(), (yjf) this.a.bU.b(), (xnv) this.a.bV.b(), this.b.p());
                    case 210:
                        return new kor(Optional.empty(), Optional.empty());
                    case 211:
                        return ((alha) algw.i((akkq) this.b.eh.b())).a;
                    case 212:
                        return akkr.a((cg) ((apxx) this.b.d).a);
                    default:
                        throw new AssertionError(i);
                }
            }
            return c();
        }
        return a();
    }
}
