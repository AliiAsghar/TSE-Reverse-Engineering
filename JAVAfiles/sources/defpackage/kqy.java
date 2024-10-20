package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;
import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;
import com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqy implements apya {
    private final krv a;
    private final int b;
    private final kqj c;

    public kqy(krv krvVar, kqj kqjVar, int i) {
        this.a = krvVar;
        this.c = kqjVar;
        this.b = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0021. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r4v11, types: [ajxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [ajxs, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        Object yjlVar;
        Object iocVar;
        Object iqtVar;
        Object ajxfVar;
        Object akkwVar;
        Object lagVar;
        Object abggVar;
        int i = this.b;
        if (i / 100 != 0) {
            if (i == 100) {
                kqj kqjVar = this.c;
                return new znj(kqjVar.e, kqjVar.aN, (byte[]) null, (byte[]) null);
            }
            throw new AssertionError(i);
        }
        switch (i) {
            case 0:
                Activity activity = this.c.a;
                if (activity != null) {
                    return activity;
                }
                throw new IllegalStateException("Attempted use of the activity when it is null");
            case 1:
                Context context = (Context) this.a.n.b();
                krv krvVar = this.a;
                apya apyaVar = krvVar.bU;
                apya apyaVar2 = krvVar.yJ;
                apya apyaVar3 = krvVar.gD;
                xnv xnvVar = (xnv) krvVar.bV.b();
                ExecutorService executorService = (ExecutorService) this.a.m.b();
                krv krvVar2 = this.a;
                return new zas(context, apyaVar, apyaVar2, apyaVar3, xnvVar, executorService, krvVar2.gN, krvVar2.bO, krvVar2.pP, krvVar2.bB);
            case 2:
                yjlVar = new yjl((cj) this.c.e.b(), (xnv) this.a.bV.b(), (yjg) this.a.bU.b());
                return yjlVar;
            case 3:
                Activity activity2 = (Activity) this.c.c.b();
                try {
                    cj cjVar = (cj) activity2;
                    cjVar.getClass();
                    return cjVar;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity2))), e);
                }
            case 4:
                Context context2 = (Context) this.c.c.b();
                apwt a = apxv.a(this.c.g);
                krv krvVar3 = this.a;
                apya apyaVar4 = krvVar3.a.fH;
                anen anenVar = (anen) krvVar3.m.b();
                krv krvVar4 = this.a;
                return new koi(context2, a, apyaVar4, anenVar, krvVar4.gD, krvVar4.za);
            case 5:
                yjlVar = new koh((Context) this.a.n.b(), (xnv) this.a.bV.b(), (anen) this.a.m.b());
                return yjlVar;
            case 6:
                return new aabr();
            case 7:
                return ifc.c((Activity) this.c.c.b());
            case 8:
                return new aqws((char[]) null);
            case 9:
                iocVar = new ioc((Activity) this.c.c.b(), (aabr) this.c.i.b(), (xjo) this.c.l.b());
                return iocVar;
            case 10:
                return new xjo();
            case 11:
                iocVar = new atal((Activity) this.c.c.b());
                return iocVar;
            case 12:
                iocVar = new iou((cj) this.c.e.b());
                return iocVar;
            case 13:
                cj cjVar2 = (cj) this.c.e.b();
                kqj kqjVar2 = this.c;
                krv krvVar5 = this.a;
                iqtVar = new iqt(cjVar2, kqjVar2.n, krvVar5.bY, (xnv) krvVar5.bV.b());
                return iqtVar;
            case 14:
                iocVar = new izc(Optional.empty(), (byte[]) null);
                return iocVar;
            case 15:
                return new iyh();
            case 16:
                return jsz.e((Activity) this.c.c.b());
            case 17:
                krv krvVar6 = this.a;
                yjlVar = new klc(krvVar6.bY, krvVar6.az, (anen) krvVar6.z.b());
                return yjlVar;
            case 18:
                ajxd ajxdVar = (ajxd) this.c.A.b();
                ajxdVar.getClass();
                return ajxdVar;
            case 19:
                aklj akljVar = (aklj) this.c.t.b();
                kqj kqjVar3 = this.c;
                ajxfVar = new ajxf(akljVar, kqjVar3.x(), kqjVar3.u(), kqjVar3.s(), (akbo) kqjVar3.z.b(), (agcp) this.c.u.b(), (ajyy) this.c.v.b(), (aogy) this.a.a.fL.b(), (ajyc) this.a.AW.b(), (algw) ((apxx) this.c.w).a, algw.i(a.by()));
                return ajxfVar;
            case 20:
                return aktp.A(this.c.v(), null);
            case 21:
                aklj akljVar2 = (aklj) this.c.t.b();
                agcp agcpVar = (agcp) this.c.u.b();
                ajyy ajyyVar = (ajyy) this.c.v.b();
                kqj kqjVar4 = this.c;
                return new ajyr(akljVar2, agcpVar, ajyyVar, (algw) ((apxx) kqjVar4.w).a, (akkw) kqjVar4.y.b());
            case 22:
                iocVar = new agcp(this.c.B());
                return iocVar;
            case 23:
                iocVar = new ajyy((aklj) this.c.t.b());
                return iocVar;
            case 24:
                akkwVar = new akkw((aklj) this.c.t.b(), this.c.M());
                return akkwVar;
            case 25:
                return algw.i(this.c.q());
            case 26:
                aklj akljVar3 = (aklj) this.c.t.b();
                agcp agcpVar2 = (agcp) this.c.u.b();
                ajyy ajyyVar2 = (ajyy) this.c.v.b();
                kqj kqjVar5 = this.c;
                return new ajys(akljVar3, agcpVar2, ajyyVar2, (algw) ((apxx) kqjVar5.w).a, (akkw) kqjVar5.y.b());
            case 27:
                aklj akljVar4 = (aklj) this.c.t.b();
                akljVar4.getClass();
                acss acssVar = new acss(akljVar4, 10);
                enh N = akljVar4.N();
                Boolean bool = false;
                bool.getClass();
                iocVar = new akbr(acssVar, akljVar4, N);
                return iocVar;
            case 28:
                aklj akljVar5 = (aklj) this.c.t.b();
                kqj kqjVar6 = this.c;
                ajxfVar = new ajxm(akljVar5, kqjVar6.y(), kqjVar6.u(), kqjVar6.s(), (akbo) kqjVar6.z.b(), (agcp) this.c.u.b(), (ajyy) this.c.v.b(), (aogy) this.a.a.fL.b(), (ajyc) this.a.AW.b(), (algw) ((apxx) this.c.w).a, algw.i(a.by()));
                return ajxfVar;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                iqtVar = new kpw((uvi) this.a.de.b(), (ajxd) this.c.B.b(), (Activity) this.c.c.b(), this.a.bB);
                return iqtVar;
            case 30:
                iocVar = new znj(this.a.a.q);
                return iocVar;
            case 31:
                kqj kqjVar7 = this.c;
                krv krvVar7 = this.a;
                return new kpx(kqjVar7.E, krvVar7.xM, krvVar7.z, krvVar7.aM, (Optional) ((apxx) krvVar7.a.ab).a, (Activity) kqjVar7.c.b());
            case 32:
                iocVar = new vjs(this.a.ff);
                return iocVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                anen anenVar2 = (anen) this.a.z.b();
                anen anenVar3 = (anen) this.a.ay.b();
                krv krvVar8 = this.a;
                uac Qm = krvVar8.Qm();
                apya apyaVar5 = krvVar8.jN;
                apya apyaVar6 = krvVar8.oP;
                ansy ansyVar = (ansy) krvVar8.ct.b();
                krv krvVar9 = this.a;
                krv krvVar10 = krvVar9.a.a;
                apya apyaVar7 = krvVar9.tl;
                ((AccessibilityManager) ((Context) krvVar10.n.b()).getSystemService("accessibility")).getClass();
                return new kws(anenVar2, anenVar3, Qm, apyaVar5, apyaVar6, ansyVar, apyaVar7, this.a.aC);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                cj cjVar3 = (cj) this.c.e.b();
                kyf kyfVar = (kyf) new abcj(cjVar3, kyf.class).b(this.c.I);
                kyfVar.getClass();
                return kyfVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return new kyf(this.c.N(), (Context) this.a.n.b(), (anen) this.a.ay.b(), this.a.uF, new mka((byte[]) null));
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                anen anenVar4 = (anen) this.a.z.b();
                krv krvVar11 = this.a;
                return new laj(anenVar4, krvVar11.gN, krvVar11.gD, krvVar11.bY, krvVar11.av, krvVar11.tV, krvVar11.id, (xnv) krvVar11.bV.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                xnv xnvVar2 = (xnv) this.a.bV.b();
                kqj kqjVar8 = this.c;
                krx krxVar = this.a.a;
                iqtVar = new lbt(xnvVar2, kqjVar8.L(), krxVar.fN, krxVar.fO);
                return iqtVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                iocVar = new vyv((yyb) this.a.au.b());
                return iocVar;
            case 39:
                iocVar = new vyv(this.c.H, (boolean[]) null);
                return iocVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                iocVar = new iew((Context) this.a.n.b());
                return iocVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                krv krvVar12 = this.a;
                apya apyaVar8 = krvVar12.de;
                xnv xnvVar3 = (xnv) krvVar12.bV.b();
                krv krvVar13 = this.a;
                apya apyaVar9 = krvVar13.bB;
                arwe arweVar = (arwe) krvVar13.dP.b();
                kqj kqjVar9 = this.c;
                lagVar = new lag(apyaVar8, xnvVar3, apyaVar9, arweVar, kqjVar9.n, (cj) kqjVar9.e.b(), this.a.bY);
                return lagVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                krv krvVar14 = this.a;
                return new qxr(krvVar14.dz, krvVar14.dm, krvVar14.gY, this.c.L, krvVar14.ol, krvVar14.kE, krvVar14.dF, krvVar14.dA, (char[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                vqu vquVar = (vqu) this.a.dt.b();
                krv krvVar15 = this.a;
                apya apyaVar10 = krvVar15.dF;
                psw pswVar = (psw) krvVar15.hG.b();
                ryg rygVar = (ryg) this.a.ok.b();
                krv krvVar16 = this.a;
                return new nct(vquVar, apyaVar10, pswVar, rygVar, krvVar16.a.bV, krvVar16.lq);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                krv krvVar17 = this.a;
                kqj kqjVar10 = this.c;
                krx krxVar2 = krvVar17.a;
                return new rss(krvVar17.bV, krvVar17.hD, krvVar17.dt, krvVar17.hA, krvVar17.hC, krvVar17.n, krvVar17.az, krvVar17.aF, krvVar17.je, krvVar17.pj, krvVar17.ea, krvVar17.uD, krvVar17.iH, kqjVar10.L, krvVar17.pS, krvVar17.oG, krvVar17.eQ, krxVar2.bW, kqjVar10.N, krvVar17.iO, krvVar17.dF, krxVar2.bX, krvVar17.rm, krxVar2.bY, krvVar17.z, krvVar17.rl, krxVar2.bZ);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                vqu vquVar2 = (vqu) this.a.dt.b();
                xbf xbfVar = (xbf) this.a.hA.b();
                nct nctVar = (nct) this.c.L.b();
                krv krvVar18 = this.a;
                return new rvp(vquVar2, xbfVar, nctVar, krvVar18.dF, krvVar18.iO);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                kqj kqjVar11 = this.c;
                akkwVar = new lga(kqjVar11.P, kqjVar11.Q, this.a.yD);
                return akkwVar;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                kqj kqjVar12 = this.c;
                krv krvVar19 = kqjVar12.b;
                lga T = kqjVar12.T();
                lga U = kqjVar12.U();
                return alor.p("IMessagePromo", T, "DittoBatteryPromo", U, "VerifiedSmsInvestigativeRpcPromo", new lga(), "BlockListAutoMigratedPromo", this.c.V(), "GaiaPairingPromo", new lga());
            case 48:
                return alor.l("DataDonationNotification", new lga());
            case 49:
                return new ipq();
            case 50:
                iocVar = new ibi(this.c.T, (byte[]) null, (byte[]) null);
                return iocVar;
            case 51:
                iocVar = new ibi((armf) this.a.eQ);
                return iocVar;
            case 52:
                krv krvVar20 = this.a;
                return new kpv(krvVar20.bV, this.c.V, krvVar20.bB, krvVar20.vq, krvVar20.m, krvVar20.z);
            case 53:
                iocVar = new izc((Object) this.a.bY);
                return iocVar;
            case 54:
                arwe arweVar2 = (arwe) this.a.dP.b();
                krv krvVar21 = this.a;
                iocVar = new kpy(arweVar2, (Optional) ((apxx) krvVar21.mY).a, (lgb) krvVar21.a.fR.b());
                return iocVar;
            case 55:
                iocVar = new kqa((arwe) this.a.dP.b(), this.a.a.bz);
                return iocVar;
            case 56:
                Context context3 = (Context) this.a.n.b();
                krv krvVar22 = this.a;
                iocVar = new kpf(context3, krvVar22.cz, krvVar22.aM);
                return iocVar;
            case 57:
                krv krvVar23 = this.a;
                apya apyaVar11 = krvVar23.bY;
                apya apyaVar12 = krvVar23.k;
                yjlVar = new qjk(apyaVar11, apyaVar12, (anen) this.a.z.b());
                return yjlVar;
            case 58:
                iocVar = new ktk((Activity) this.c.c.b(), (byte[]) null);
                return iocVar;
            case 59:
                iocVar = new apvo(this.c.ae);
                return iocVar;
            case 60:
                krx krxVar3 = this.a.a;
                arwe arweVar3 = (arwe) krxVar3.a.dP.b();
                krv krvVar24 = krxVar3.a;
                return new altx(new kpz(arweVar3, (Optional) ((apxx) krvVar24.vP).a, krvVar24.tE, (ansy) krvVar24.ct.b(), krxVar3.fS));
            case 61:
                Activity activity3 = (Activity) this.c.c.b();
                if (activity3 instanceof IdentityDetailsActivity) {
                    IdentityDetailsActivity identityDetailsActivity = (IdentityDetailsActivity) activity3;
                    identityDetailsActivity.getClass();
                    return identityDetailsActivity;
                }
                throw new IllegalStateException(hht.d(activity3, lrm.class, "Attempt to inject a Activity wrapper of type "));
            case 62:
                krv krvVar25 = this.a;
                iqtVar = new yyp(krvVar25.oq, krvVar25.os, krvVar25.ct, krvVar25.z);
                return iqtVar;
            case 63:
                Context context4 = (Context) this.a.n.b();
                ykw ykwVar = (ykw) this.a.av.b();
                this.c.E();
                akkwVar = new yhw(context4, ykwVar);
                return akkwVar;
            case 64:
                Activity activity4 = (Activity) this.c.c.b();
                if (activity4 instanceof SimSelectionSettingsActivity) {
                    SimSelectionSettingsActivity simSelectionSettingsActivity = (SimSelectionSettingsActivity) activity4;
                    simSelectionSettingsActivity.getClass();
                    return simSelectionSettingsActivity;
                }
                throw new IllegalStateException(hht.d(activity4, zlz.class, "Attempt to inject a Activity wrapper of type "));
            case 65:
                yjlVar = new zxr((Context) this.a.n.b(), this.c.am, this.a.bB);
                return yjlVar;
            case 66:
                return Optional.of(this.a.a.aY());
            case 67:
                iocVar = new zfh(apxv.a(this.c.ao), (byte[]) null);
                return iocVar;
            case 68:
                return Optional.of((zxr) this.c.an.b());
            case 69:
                return Optional.of(new aabr());
            case 70:
                iocVar = new wfh(this.a.a.dz, (float[]) null);
                return iocVar;
            case 71:
                Activity activity5 = (Activity) this.c.c.b();
                if (activity5 instanceof OpenRbmDeepLinkActivity) {
                    OpenRbmDeepLinkActivity openRbmDeepLinkActivity = (OpenRbmDeepLinkActivity) activity5;
                    openRbmDeepLinkActivity.getClass();
                    return openRbmDeepLinkActivity;
                }
                throw new IllegalStateException(hht.d(activity5, aads.class, "Attempt to inject a Activity wrapper of type "));
            case 72:
                krv krvVar26 = this.a;
                apya apyaVar13 = krvVar26.eB;
                itw itwVar = new itw(4);
                yjlVar = new mcm(apyaVar13, itwVar, (Executor) this.a.m.b());
                return yjlVar;
            case 73:
                iocVar = new aajt(this.c.au);
                return iocVar;
            case 74:
                iocVar = new zmr((armf) this.a.bV);
                return iocVar;
            case 75:
                akkwVar = new yks((anen) this.a.m.b(), this.a.a.gb);
                return akkwVar;
            case 76:
                krv krvVar27 = this.a;
                krx krxVar4 = krvVar27.a;
                apya apyaVar14 = krvVar27.av;
                apya apyaVar15 = krxVar4.cO;
                apya a2 = apyb.a(krvVar27.gD);
                krv krvVar28 = this.a;
                lagVar = new zap(apyaVar14, apyaVar15, a2, krvVar28.sR, krvVar28.aB, krvVar28.gC);
                return lagVar;
            case 77:
                iocVar = new zfh((anen) this.a.z.b());
                return iocVar;
            case 78:
                krv krvVar29 = this.a;
                apya apyaVar16 = krvVar29.av;
                arwe arweVar4 = (arwe) krvVar29.dP.b();
                krv krvVar30 = this.a;
                apya apyaVar17 = krvVar30.aB;
                adwu adwuVar = (adwu) krvVar30.dM.b();
                krv krvVar31 = this.a;
                abggVar = new abgg(apyaVar16, arweVar4, apyaVar17, adwuVar, krvVar31.a.aR(), krvVar31.aC, (ahiy) krvVar31.tE.b(), (ansy) this.a.ct.b());
                return abggVar;
            case 79:
                iocVar = new zfj(this.c.az, null, null, null);
                return iocVar;
            case 80:
                iocVar = new zfj(this.a.fX, null, null);
                return iocVar;
            case 81:
                iocVar = new aiim((Activity) this.c.c.b(), Optional.empty(), (afke) this.a.a.ck.b());
                return iocVar;
            case 82:
                Activity activity6 = (Activity) this.c.c.b();
                kqj kqjVar13 = this.c;
                return new agap(activity6, kqjVar13.o(), kqjVar13.p(), (afke) this.a.a.ck.b(), (arwe) this.c.aE.b(), Optional.of(Boolean.valueOf(((ansy) new npg(this.a.a.a.bN).a.b()).e("bugle.fix_view_focus_clear_on_keyboard_close"))));
            case 83:
                iocVar = new agbn((Activity) this.c.c.b(), this.c.J());
                return iocVar;
            case 84:
                iocVar = new agaw((Activity) this.c.c.b(), this.c.Q());
                return iocVar;
            case 85:
                Context context5 = (Context) this.a.n.b();
                atsg atsgVar = (atsg) this.a.a.G.b();
                context5.getClass();
                atsgVar.getClass();
                agbw agbwVar = agbw.a;
                agbwVar.getClass();
                return aeke.bP(context5, atsgVar, agbwVar, "keyboard", "keyboard");
            case 86:
                arpi arpiVar = (arpi) this.c.aD.b();
                aklj akljVar6 = (aklj) this.c.t.b();
                arpiVar.getClass();
                akljVar6.getClass();
                return aktp.z(arpiVar, akljVar6.N());
            case 87:
                krv krvVar32 = this.a;
                return akdp.s(krvVar32.Rh(), (aneo) krvVar32.ba.b());
            case 88:
                akkwVar = new hwo((Activity) this.c.c.b(), altg.a);
                return akkwVar;
            case 89:
                iocVar = new aohs((aksr) this.a.at.b(), (byte[]) null);
                return iocVar;
            case 90:
                this.a.Qm();
                this.c.F();
                return new wam();
            case 91:
                return akdp.l((cj) this.c.e.b());
            case 92:
                return akkr.b((aklj) this.c.t.b());
            case 93:
                iocVar = new ahmn((aksr) this.a.at.b(), null);
                return iocVar;
            case 94:
                iocVar = new afpr((Activity) this.c.c.b());
                return iocVar;
            case 95:
                return ipq.n((Context) this.c.c.b(), krx.hW(), (Optional) this.a.a.cv.b());
            case 96:
                kqj kqjVar14 = this.c;
                iqtVar = new zhi(kqjVar14.aj, kqjVar14.aP, kqjVar14.aO, (char[]) null);
                return iqtVar;
            case 97:
                kqj kqjVar15 = this.c;
                iocVar = new znj((armf) kqjVar15.aN, (armf) kqjVar15.aO, (char[]) null);
                return iocVar;
            case 98:
                kqj kqjVar16 = this.c;
                krv krvVar33 = this.a;
                abggVar = new wyp(kqjVar16.aM, krvVar33.rM, krvVar33.oR, krvVar33.ow, krvVar33.oS, krvVar33.oQ, (arwe) krvVar33.dP.b());
                return abggVar;
            case 99:
                return alpt.o(xrh.l(this.a.a.a.gp()));
            default:
                throw new AssertionError(i);
        }
    }
}
