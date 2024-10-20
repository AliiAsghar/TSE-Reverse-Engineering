package defpackage;

import android.app.Activity;
import android.content.Context;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krc implements apya {
    public final krv a;
    public final kqm b;
    private final int c;
    private final kqj d;

    public krc(krv krvVar, kqj kqjVar, kqm kqmVar, int i) {
        this.a = krvVar;
        this.d = kqjVar;
        this.b = kqmVar;
        this.c = i;
    }

    private final Object a() {
        int i = this.c;
        switch (i) {
            case 0:
                kqm kqmVar = this.b;
                return akdp.p((cg) ((apxx) kqmVar.b).a, (akmy) kqmVar.c.b(), (ahiy) this.a.aC.b(), (Executor) this.a.ba.b());
            case 1:
                cg cgVar = (cg) ((apxx) this.b.b).a;
                return akmy.c(cgVar, cgVar);
            case 2:
                return akdp.d((arpi) this.d.aD.b(), (cg) ((apxx) this.b.b).a);
            case 3:
                return ifc.a((cg) ((apxx) this.b.b).a);
            case 4:
                return new ygv((aquq) this.a.xy.b());
            case 5:
                return ifc.g((cg) ((apxx) this.b.b).a);
            case 6:
                return new asqe((cg) ((apxx) this.b.b).a, (aohs) this.d.aG.b(), algw.i(new akvt(0)));
            case 7:
                return new jxv((anen) this.a.m.b(), (Object) this.a.aF);
            case 8:
                return Optional.of(this.a.a.hz());
            case 9:
                return new ibi(this.a.a.aS, (char[]) null, (byte[]) null, (byte[]) null);
            case 10:
                cj cjVar = (cj) this.d.e.b();
                kqm kqmVar2 = this.b;
                krv krvVar = this.a;
                return new igz(cjVar, kqmVar2.p, krvVar.yJ, krvVar.a.fP, krvVar.pR, krvVar.fD, (aksr) krvVar.at.b(), this.a.qV);
            case 11:
                kqj kqjVar = this.d;
                krv krvVar2 = this.a;
                kqm kqmVar3 = this.b;
                return new BlockAndReportSpamCallbacks(kqjVar.e, krvVar2.tm, kqmVar3.m, kqmVar3.n, krvVar2.si, krvVar2.yF, kqmVar3.o, krvVar2.dw, (anen) krvVar2.z.b());
            case 12:
                return new ibi((cj) this.d.e.b(), (byte[]) null);
            case 13:
                return ahkm.j((cg) ((apxx) this.b.b).a);
            case 14:
                return new aohs((cg) ((apxx) this.b.b).a, (Executor) this.a.ba.b());
            case 15:
                ansy ansyVar = (ansy) this.a.ct.b();
                anen anenVar = (anen) this.a.z.b();
                krv krvVar3 = this.a;
                return new ize(ansyVar, anenVar, krvVar3.jN, krvVar3.rG, (prd) krvVar3.rP.b());
            case 16:
                return ifc.j((cg) ((apxx) this.b.b).a);
            case 17:
                return ((alha) algw.i((akkq) this.b.u.b())).a;
            case 18:
                return akkr.a((cg) ((apxx) this.b.b).a);
            case 19:
                return new izc((mbl) this.a.bB.b(), (byte[]) null);
            case 20:
                return ifc.m((cg) ((apxx) this.b.b).a);
            case 21:
                return new uac((ansy) this.a.ct.b(), (ahiy) this.a.aC.b(), (byte[]) null);
            case 22:
                kqj kqjVar2 = this.d;
                kqm kqmVar4 = this.b;
                return new afxz(kqjVar2.c, kqjVar2.aF, kqmVar4.C, apyb.a(kqmVar4.D), apyb.a(this.b.E), this.b.e);
            case 23:
                krv krvVar4 = this.a;
                kqm kqmVar5 = this.b;
                return new agcp((armf) krvVar4.yA, (armf) kqmVar5.A, (armf) kqmVar5.B, (byte[]) null);
            case 24:
                return new aday(this.d.c, this.b.z, (byte[]) null, (byte[]) null);
            case 25:
                return new adwo(this.a.yA, (char[]) null);
            case 26:
                return new aday(this.d.c, this.b.z, null, null, null);
            case 27:
                alok h = alor.h(7);
                h.h(afid.class, acyb.l());
                h.h(afof.class, (agae) this.a.a.ce.b());
                h.h(afpb.class, (agae) this.a.a.cf.b());
                h.h(afvx.class, acyb.p());
                h.h(afxh.class, acyb.q());
                h.h(agit.class, agdj.c());
                h.h(afre.class, acyb.o());
                return h.b();
            case 28:
                krx krxVar = this.a.a;
                alok h2 = alor.h(6);
                h2.h(agek.b, krx.hY(krxVar));
                h2.h(agek.a, acyb.l());
                h2.h(agek.d, acyb.p());
                h2.h(agek.e, acyb.q());
                h2.h(agek.g, agdj.c());
                h2.h(agek.h, acyb.o());
                return h2.b();
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return jsz.c();
            case 30:
                return ifc.v((Context) this.a.n.b(), (arpi) this.a.bP.b(), (eoz) this.b.H.b(), Optional.of(afgn.a), kqm.t(this.b), (ibs) this.a.yG.b(), (ahiy) this.a.po.b(), Optional.empty(), Optional.empty(), this.a.a.gm);
            case 31:
                return acyb.n((Activity) this.d.c.b(), (cg) ((apxx) this.b.b).a, Optional.empty());
            case 32:
                return Optional.of(krx.f(this.a.a));
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                krv krvVar5 = this.a;
                return new agcp(krvVar5.dO, krvVar5.yA, krvVar5.a.cp);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return jsz.f((cg) ((apxx) this.b.b).a);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                krv krvVar6 = this.a;
                return new kkc((armf) krvVar6.fd, (armf) krvVar6.yJ, (armf) krvVar6.a.fP);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                krv krvVar7 = this.a;
                return new lfl(krvVar7.z, krvVar7.m, krvVar7.bV, this.b.M, (byte[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                krv krvVar8 = this.a;
                kkn k = krx.k(krvVar8.a);
                krx krxVar2 = krvVar8.a;
                krv krvVar9 = krxVar2.a;
                return alor.m("AllMessagesDonationConversationCollector", k, "RecentMessagesDonationConversationCollector", new kkx(krvVar9.et, krxVar2.gn, krvVar9.de, (anen) krvVar9.z.b()));
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return new jxv((anen) this.a.m.b(), (Object) kqm.e(this.b));
            case 39:
                return new jat((Context) this.a.n.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                krv krvVar10 = this.a;
                return new kor((Object) krvVar10.bY, (Object) krvVar10.vH);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                krv krvVar11 = this.a;
                return new jat(krvVar11.n, krvVar11.m, krvVar11.z, krvVar11.bV, krvVar11.dw, krvVar11.eQ, krvVar11.fh, (char[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return new akvf(this.a.a.iJ());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return jsz.m((cg) ((apxx) this.b.b).a);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return new akhr((cg) ((apxx) this.b.b).a, (ahiy) this.a.aC.b(), (Executor) this.a.ba.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return uxd.a((cg) ((apxx) this.b.b).a);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return zfk.a((cg) ((apxx) this.b.b).a);
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return zfk.d((cg) ((apxx) this.b.b).a);
            case 48:
                return zfk.e((cg) ((apxx) this.b.b).a);
            case 49:
                krv krvVar12 = this.a;
                apya apyaVar = krvVar12.a.fP;
                apwt a = apxv.a(krvVar12.gD);
                aaya aayaVar = (aaya) this.b.Y.b();
                mbl mblVar = (mbl) this.a.bB.b();
                xbf xbfVar = (xbf) this.a.hA.b();
                krv krvVar13 = this.a;
                return new abbj(apyaVar, a, aayaVar, mblVar, xbfVar, krvVar13.yJ, (abbu) krvVar13.yF.b(), (aksr) this.a.at.b());
            case 50:
                krv krvVar14 = this.a;
                apya apyaVar2 = krvVar14.n;
                apya apyaVar3 = krvVar14.av;
                apya a2 = apyb.a(krvVar14.gD);
                krv krvVar15 = this.a;
                kqj kqjVar3 = this.d;
                apya apyaVar4 = krvVar15.bB;
                krx krxVar3 = krvVar15.a;
                return new aaya(apyaVar2, apyaVar3, a2, apyaVar4, krxVar3.cM, krxVar3.cN, kqjVar3.ax, krvVar15.sR, krxVar3.L, krvVar15.bV, krvVar15.gC, krvVar15.at, krvVar15.ay, krvVar15.fY, krvVar15.fM, krvVar15.sY, krvVar15.gb);
            case 51:
                kqj kqjVar4 = this.d;
                krv krvVar16 = this.a;
                return new zlc(kqjVar4.c, krvVar16.je, krvVar16.av, krvVar16.a.gs, (char[]) null);
            case 52:
                return new zhg(this.a.av);
            case 53:
                return new vyv((RcsProfileService) this.a.lt.b());
            case 54:
                krv krvVar17 = this.a;
                apya apyaVar5 = krvVar17.fX;
                apya apyaVar6 = krvVar17.fY;
                apya apyaVar7 = krvVar17.gl;
                apya apyaVar8 = krvVar17.dF;
                arwe arweVar = (arwe) krvVar17.dP.b();
                krv krvVar18 = this.a;
                return new znu(apyaVar5, apyaVar6, apyaVar7, apyaVar8, arweVar, krvVar18.dR, krvVar18.a.gt, krvVar18.dF);
            case 55:
                arwe arweVar2 = (arwe) this.a.dP.b();
                arwe arweVar3 = (arwe) this.a.dO.b();
                kqm kqmVar6 = this.b;
                krv krvVar19 = this.a;
                apya apyaVar9 = kqmVar6.Y;
                apya apyaVar10 = krvVar19.av;
                apya apyaVar11 = krvVar19.vk;
                xyt xytVar = (xyt) krvVar19.gY.b();
                krv krvVar20 = this.a;
                return new aayd(arweVar2, arweVar3, apyaVar9, apyaVar10, apyaVar11, xytVar, krvVar20.aB, krvVar20.fM, krvVar20.fY, krvVar20.hr);
            case 56:
                arpi arpiVar = (arpi) this.a.dj.b();
                arwe arweVar4 = (arwe) this.a.dP.b();
                krv krvVar21 = this.a;
                apya apyaVar12 = krvVar21.fX;
                apya apyaVar13 = krvVar21.gl;
                Context context = (Context) krvVar21.n.b();
                krv krvVar22 = this.a;
                return new wyp(arpiVar, arweVar4, apyaVar12, apyaVar13, context, krvVar22.eN, krvVar22.vk);
            case 57:
                return new zlt((ahiy) this.a.aC.b(), (atsg) this.a.bT.b(), (xnv) this.a.bV.b(), (znj) this.a.fd.b(), (anen) this.a.z.b(), (yjy) this.a.aF.b(), this.a.dd);
            case 58:
                return new krb(this, 0);
            case 59:
                arwe arweVar5 = (arwe) this.a.dO.b();
                arpi arpiVar2 = (arpi) this.a.dN.b();
                arpi arpiVar3 = (arpi) this.a.bP.b();
                krv krvVar23 = this.a;
                return new iji(arweVar5, arpiVar2, arpiVar3, krx.aO(krvVar23.a), (ansy) krvVar23.ct.b());
            case 60:
                kqj kqjVar5 = this.d;
                kqm kqmVar7 = this.b;
                krv krvVar24 = this.a;
                return new zlz(kqjVar5.c, kqmVar7.am, krvVar24.at, krvVar24.bB, (byte[]) null);
            case 61:
                krv krvVar25 = this.a;
                return new zmt(krvVar25.a.ef, krvVar25.aC);
            case 62:
                return new lpg((Object) this.a.ff);
            case 63:
                krv krvVar26 = this.a;
                return new jat(krvVar26.bV, krvVar26.m, krvVar26.z, krvVar26.mZ, krvVar26.dm, krvVar26.iL, krvVar26.a.gx);
            case 64:
                kqm kqmVar8 = this.b;
                return zfk.u(kqm.g(kqmVar8), kqm.l(kqmVar8), kqm.m(kqmVar8), kqm.n(kqmVar8), kqm.k(kqmVar8), kqm.h(kqmVar8), kqm.p(kqmVar8), kqm.i(kqmVar8), kqm.j(kqmVar8));
            case 65:
                return uxd.c((cg) ((apxx) this.b.b).a);
            case 66:
                ansy ansyVar2 = (ansy) this.a.ct.b();
                ahiy ahiyVar = (ahiy) this.a.aC.b();
                krv krvVar27 = this.a;
                kqm kqmVar9 = this.b;
                apya apyaVar14 = krvVar27.et;
                apya apyaVar15 = kqmVar9.ar;
                qya qyaVar = (qya) krvVar27.ol.b();
                ytk ytkVar = (ytk) this.a.oj.b();
                mho mhoVar = (mho) this.a.gD.b();
                yfp yfpVar = (yfp) this.a.eG.b();
                anen anenVar2 = (anen) this.a.z.b();
                krv krvVar28 = this.a;
                return new zug(ansyVar2, ahiyVar, apyaVar14, apyaVar15, qyaVar, ytkVar, mhoVar, yfpVar, anenVar2, krvVar28.dq, (Long) krvVar28.Dt.b(), (Long) this.a.Du.b());
            case 67:
                krv krvVar29 = this.a;
                return new znp((armf) krvVar29.dw, (aneo) krvVar29.z.b());
            case 68:
                krv krvVar30 = this.a;
                kqm kqmVar10 = this.b;
                return new zlc(krvVar30.at, kqmVar10.as, kqmVar10.at, krvVar30.bB, (byte[]) null);
            case 69:
                return new ahmn((aksr) this.a.at.b(), null);
            case 70:
                return new aabr();
            case 71:
                enh N = ((cg) ((apxx) this.b.b).a).N();
                N.getClass();
                return N;
            case 72:
                return new zfh((Object) this.a.bY, (byte[]) null);
            case 73:
                return new znp((ansy) this.a.ct.b(), (aneo) this.a.z.b());
            case 74:
                kqm kqmVar11 = this.b;
                return zfk.v(kqm.p(kqmVar11), kqm.i(kqmVar11));
            case 75:
                return zfk.k((cg) ((apxx) this.b.b).a);
            case 76:
                krv krvVar31 = this.a;
                return new zai(krvVar31.ct, krvVar31.z, krvVar31.dS, krvVar31.aC, krvVar31.a.ai);
            case 77:
                return new aaak();
            case 78:
                arwe arweVar6 = (arwe) this.a.dO.b();
                krv krvVar32 = this.a;
                return new prz(arweVar6, krvVar32.sv, krvVar32.bV, krvVar32.iL, krvVar32.mZ, krvVar32.nk, krvVar32.dd, krvVar32.cF, krvVar32.hH, krvVar32.a.gF, krvVar32.qV, (qsa) krvVar32.Di.b());
            case 79:
                cg cgVar2 = (cg) ((apxx) this.b.b).a;
                if (cgVar2 instanceof aagf) {
                    return (aagf) cgVar2;
                }
                throw new IllegalStateException(hht.e(cgVar2, aagg.class));
            case 80:
                return new ljn(this.a.eB, new itw(3), (Executor) this.a.m.b(), this.a.id);
            case 81:
                krv krvVar33 = this.a;
                return new gqg(krvVar33.vW, krvVar33.pP, this.b.aC, krvVar33.xK, krvVar33.dA, null, null, null);
            case 82:
                return new uac(this.a.at, this.d.aJ, (byte[]) null);
            case 83:
                krv krvVar34 = this.a;
                return new zhi(krvVar34.dz, krvVar34.dA, this.d.aJ, (byte[]) null);
            case 84:
                return Optional.of(this.a.a.iR());
            case 85:
                return new wft((whj) this.a.gL.b(), (xvu) this.a.vk.b(), kqm.f(this.b), (anen) this.a.z.b(), (anen) this.a.m.b(), (xnv) this.a.bV.b());
            case 86:
                apwt a3 = apxv.a(this.a.ij);
                krv krvVar35 = this.a;
                return new zlz(a3, krvVar35.dI, (anen) krvVar35.m.b(), (anen) this.a.ay.b());
            case 87:
                Context context2 = (Context) this.a.n.b();
                kqj kqjVar6 = this.d;
                krv krvVar36 = this.a;
                apya apyaVar16 = kqjVar6.at;
                mbl mblVar2 = (mbl) krvVar36.bB.b();
                ydh ydhVar = (ydh) this.a.eH.b();
                yfo yfoVar = (yfo) this.a.eA.b();
                uff uffVar = (uff) this.a.dZ.b();
                krv krvVar37 = this.a;
                return new ahmv(context2, apyaVar16, mblVar2, ydhVar, yfoVar, uffVar, krvVar37.yJ, (wfh) krvVar37.oF.b(), (xnv) this.a.bV.b());
            case 88:
                return new afmd((cg) ((apxx) this.b.b).a, (abdc) this.a.a.cX.b(), (aqws) this.d.k.b(), kqm.q(this.b));
            case 89:
                return new zfh((Object) this.a.aF, (byte[]) null);
            case 90:
                return new wpp(this.a.gL.b(), this.a.bV.b(), this.a.fM.b(), (byte[]) null);
            case 91:
                return new wfw((arwe) this.a.dP.b(), this.a.fY);
            case 92:
                return new lrf((Context) this.a.n.b(), (xvc) this.a.dW.b(), this.a.dd);
            case 93:
                cg cgVar3 = (cg) ((apxx) this.b.b).a;
                kqm kqmVar12 = this.b;
                krv krvVar38 = this.a;
                kqmVar12.u();
                abcf abcfVar = (abcf) new abck(cgVar3, abcf.class).b(new msl(12));
                abcfVar.getClass();
                return abcfVar;
            case 94:
                Context context3 = (Context) this.a.n.b();
                yce yceVar = (yce) this.a.df.b();
                return new abac(context3, yceVar);
            case 95:
                krv krvVar39 = this.a;
                return new adea(krvVar39.si, krvVar39.aM, krvVar39.bX, this.d.aB);
            case 96:
                return new znj((armf) this.a.av, kqm.s(this.b));
            case 97:
                return acyb.m((eoz) this.b.H.b());
            case 98:
                krv krvVar40 = this.a;
                kqm kqmVar13 = this.b;
                apya apyaVar17 = krvVar40.bQ;
                apya apyaVar18 = kqmVar13.I;
                krx krxVar4 = krvVar40.a;
                return new afxz(apyaVar17, apyaVar18, krxVar4.gk, krxVar4.eT, krxVar4.ck, krxVar4.eV, (byte[]) null, (char[]) null);
            case 99:
                kqj kqjVar7 = this.d;
                kqm kqmVar14 = this.b;
                return new adec(kqjVar7.c, kqmVar14.aS, kqmVar14.aT, this.a.a.ck, kqmVar14.e, null, null);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        Object adayVar;
        int i = this.c;
        if (i / 100 != 0) {
            switch (i) {
                case VCardConstants.DEFAULT_PREF /* 100 */:
                    return new afvp();
                case 101:
                    return new aodz((char[]) null);
                case 102:
                    adayVar = new aday((armf) this.d.c, (armf) this.b.aW, (byte[]) null);
                    break;
                case 103:
                    return new adwo(this.b.e, (byte[]) null);
                case 104:
                    return new agiz((addp) this.b.aY.b(), (afjy) this.a.a.cl.b());
                case 105:
                    krv krvVar = this.a;
                    adayVar = new addp(krvVar.yA, krvVar.a.ck, (char[]) null);
                    break;
                case 106:
                    return new afph((Context) this.a.n.b(), (arwe) this.b.e.b(), this.b.b());
                case 107:
                    return new adta(this.d.aF, null, null);
                case 108:
                    return new adta(this.b.e, (char[]) null);
                case 109:
                    adayVar = new aday(this.b.bc, this.a.a.ck, (byte[]) null, (char[]) null);
                    break;
                case 110:
                    return new aday((Context) this.d.c.b(), (byte[]) null);
                case 111:
                    jgq jgqVar = (jgq) this.a.a.ct.b();
                    ogx ogxVar = (ogx) this.a.a.fm.b();
                    ouq ouqVar = new ouq(this.a.a.a.bN);
                    jgqVar.getClass();
                    ogxVar.getClass();
                    return new afyk(jgqVar, true, true, true, true, ogxVar.a(), ((ansy) ouqVar.a.b()).e("bugle.enable_check_hugo_rendering_state_on_back_navigation"), 8);
                case 112:
                    eoz eozVar = (eoz) this.b.H.b();
                    eozVar.getClass();
                    ConversationViewModel conversationViewModel = (ConversationViewModel) new eoy(eozVar).a(ConversationViewModel.class);
                    Object b = conversationViewModel.g.b();
                    b.getClass();
                    Object b2 = conversationViewModel.h.b();
                    b2.getClass();
                    return new afkq((aflb) b, (afku) b2);
                case 113:
                    return new kor(Optional.empty(), Optional.empty());
                default:
                    throw new AssertionError(i);
            }
            return adayVar;
        }
        return a();
    }
}
