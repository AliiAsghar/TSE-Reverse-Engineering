package defpackage;

import android.content.Context;
import com.android.vcard.VCardConstants;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.businessinfo.BusinessInfoEngine;
import com.google.android.ims.jibe.service.connectiontracker.ImsConnectionTrackerEngine;
import com.google.android.ims.jibe.service.contactsmanager.ContactsManager;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.profile.RcsProfileEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.jibe.service.singleregistration.SingleRegistrationVendorImsController;
import com.google.android.ims.jibe.service.transportcontrol.TransportControlEngine;
import com.google.android.ims.messaging.MessagingEngine;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adty implements apya {
    private final adtz a;
    private final int b;

    public adty(adtz adtzVar, int i) {
        this.a = adtzVar;
        this.b = i;
    }

    private final Object a() {
        int i = this.b;
        int i2 = 0;
        byte[] bArr = null;
        switch (i) {
            case 0:
                aduu aduuVar = (aduu) this.a.aS.b.b();
                aduuVar.getClass();
                return aduuVar;
            case 1:
                adtl q = this.a.aS.q();
                q.getClass();
                return q;
            case 2:
                anen u = this.a.aS.u();
                u.getClass();
                return u;
            case 3:
                adov adovVar = (adov) this.a.d.b();
                aduw s = this.a.aS.s();
                s.getClass();
                return new adqg(adovVar, s, this.a.aS.v());
            case 4:
                return new adov();
            case 5:
                Context context = (Context) this.a.f.b();
                adtz adtzVar = this.a;
                alor m = alor.m(adwl.DUAL_REG, adtzVar.aq, adwl.SINGLE_REG, adtzVar.av);
                adtz adtzVar2 = this.a;
                apya apyaVar = adtzVar2.aM;
                apya apyaVar2 = adtzVar2.ao;
                apya apyaVar3 = adtzVar2.x;
                apya apyaVar4 = adtzVar2.o;
                apya apyaVar5 = adtzVar2.b;
                apya apyaVar6 = adtzVar2.k;
                apya apyaVar7 = adtzVar2.aL;
                apya apyaVar8 = adtzVar2.aK;
                apya apyaVar9 = adtzVar2.aG;
                apya apyaVar10 = adtzVar2.aF;
                apya apyaVar11 = adtzVar2.aE;
                apya apyaVar12 = adtzVar2.ax;
                apya apyaVar13 = adtzVar2.aw;
                apya apyaVar14 = adtzVar2.s;
                apya apyaVar15 = adtzVar2.r;
                apya apyaVar16 = adtzVar2.q;
                apwt a = apxv.a(adtzVar2.E);
                apwt a2 = apxv.a(apyaVar16);
                apwt a3 = apxv.a(apyaVar15);
                apwt a4 = apxv.a(apyaVar14);
                apwt a5 = apxv.a(apyaVar13);
                apwt a6 = apxv.a(apyaVar12);
                apwt a7 = apxv.a(apyaVar11);
                apwt a8 = apxv.a(apyaVar10);
                apwt a9 = apxv.a(apyaVar9);
                apwt a10 = apxv.a(apyaVar8);
                apwt a11 = apxv.a(apyaVar7);
                apwt a12 = apxv.a(apyaVar6);
                apwt a13 = apxv.a(apyaVar5);
                apwt a14 = apxv.a(apyaVar4);
                apwt a15 = apxv.a(apyaVar3);
                apwt a16 = apxv.a(apyaVar2);
                adtf adtfVar = (adtf) apyaVar.b();
                abqa f = this.a.aS.f();
                f.getClass();
                yjy e = this.a.aS.e();
                e.getClass();
                anen anenVar = (anen) this.a.c.b();
                adtz adtzVar3 = this.a;
                acrh acrhVar = adtzVar3.aS;
                apwt a17 = apxv.a(adtzVar3.n);
                acjj g = acrhVar.g();
                g.getClass();
                return new RcsEngineProxyImpl(context, m, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, adtzVar2.A, a14, a15, adtzVar2.a, a16, adtfVar, f, e, anenVar, a17, g);
            case 6:
                return this.a.aS.a();
            case 7:
                adtz adtzVar4 = this.a;
                apya apyaVar17 = adtzVar4.f;
                adoi j = adtzVar4.j();
                Context context2 = (Context) apyaVar17.b();
                adtg adtgVar = (adtg) adtzVar4.P.b();
                adov adovVar2 = (adov) adtzVar4.d.b();
                acqj acqjVar = (acqj) adtzVar4.w.b();
                acnx j2 = adtzVar4.aS.j();
                j2.getClass();
                adom adomVar = (adom) adtzVar4.B.b();
                acrh acrhVar2 = adtzVar4.aS;
                apya apyaVar18 = acrhVar2.a;
                aiot t = acrhVar2.t();
                Context context3 = (Context) ((apxx) apyaVar18).a;
                adfd n = acrhVar2.n();
                advp advpVar = new advp("(RCS): ");
                acnx acnxVar = (acnx) acrhVar2.aR.b();
                int[] iArr = adfm.a;
                if (aczx.n()) {
                    iArr = adfm.b;
                }
                adfo adfoVar = new adfo(context2, adtgVar, adovVar2, acqjVar, j2, adomVar, t, new afxz(context3, n.a, iArr, advpVar, acnxVar), (adfq) adtzVar4.ag.b());
                acsu acsuVar = (acsu) this.a.an.b();
                adtz adtzVar5 = this.a;
                return j.a(adwl.DUAL_REG, adfoVar, acsuVar, new adpz((adqg) adtzVar5.ao.b(), (adqa) adtzVar5.ap.b(), (yjr) adtzVar5.h.b(), (adpu) adtzVar5.j.b(), (aikc) adtzVar5.C.b(), (adps) adtzVar5.m.b(), new adta((adpu) adtzVar5.j.b()), new adqg(adtzVar5.T, adtzVar5.S, adtzVar5.R, adtzVar5.k()), new adta(adtzVar5.k())));
            case 8:
                BusinessInfoDatabase businessInfoDatabase = (BusinessInfoDatabase) this.a.aS.bd.b();
                businessInfoDatabase.getClass();
                return businessInfoDatabase;
            case 9:
                acqy acqyVar = (acqy) this.a.aS.bb.b();
                acqyVar.getClass();
                return acqyVar;
            case 10:
                return new acrd((Context) this.a.f.b(), (acqy) this.a.g.b(), (aduu) this.a.a.b(), (yjr) this.a.h.b());
            case 11:
                yjr d = this.a.aS.d();
                d.getClass();
                return d;
            case 12:
                Context context4 = (Context) this.a.f.b();
                acqq acqqVar = (acqq) this.a.aS.bb.b();
                acqqVar.getClass();
                return new acqi(context4, acqqVar, (acrd) this.a.i.b(), (aduu) this.a.a.b(), (adpu) this.a.j.b());
            case 13:
                adpu adpuVar = (adpu) this.a.aS.be.b();
                adpuVar.getClass();
                return adpuVar;
            case 14:
                aduu aduuVar2 = (aduu) this.a.a.b();
                acrm acrmVar = (acrm) this.a.k.b();
                yjr yjrVar = (yjr) this.a.h.b();
                adpu adpuVar2 = (adpu) this.a.j.b();
                ExecutorService executorService = (ExecutorService) this.a.aS.aZ.b();
                executorService.getClass();
                return new adps(aduuVar2, acrmVar, yjrVar, adpuVar2, executorService, (adfg) this.a.l.b());
            case 15:
                acrm acrmVar2 = (acrm) this.a.aS.aW.b();
                acrmVar2.getClass();
                return acrmVar2;
            case 16:
                return new adfg((Context) this.a.f.b());
            case 17:
                return new adti((acoc) this.a.n.b());
            case 18:
                return this.a.aS.k();
            case 19:
                adsj adsjVar = (adsj) this.a.aS.bq.b();
                adsjVar.getClass();
                return adsjVar;
            case 20:
                return new FileTransferEngine((Context) this.a.f.b(), (aduu) this.a.a.b(), (adsj) this.a.p.b(), (acoc) this.a.n.b());
            case 21:
                return new ChatSessionEngine((Context) this.a.f.b(), (adsj) this.a.p.b(), (acoc) this.a.n.b());
            case 22:
                return new LocationSharingEngine((Context) this.a.f.b(), (aduu) this.a.a.b(), (acoc) this.a.n.b());
            case 23:
                adtn r = this.a.aS.r();
                r.getClass();
                return r;
            case 24:
                acyt acytVar = (acyt) this.a.aS.aY.b();
                acytVar.getClass();
                return acytVar;
            case 25:
                acnb acnbVar = (acnb) this.a.aS.bg.b();
                acnbVar.getClass();
                return acnbVar;
            case 26:
                adny p = this.a.aS.p();
                p.getClass();
                return p;
            case 27:
                aneo aneoVar = (aneo) this.a.aS.aX.b();
                aneoVar.getClass();
                return aneoVar;
            case 28:
                Context context5 = (Context) this.a.f.b();
                acoc acocVar = (acoc) this.a.n.b();
                this.a.aS.i().getClass();
                return new acqk(context5, acocVar);
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return new adjw();
            case 30:
                acre acreVar = (acre) this.a.aS.bc.b();
                acreVar.getClass();
                return acreVar;
            case 31:
                return new acts((acqy) this.a.g.b());
            case 32:
                adeq m2 = this.a.aS.m();
                m2.getClass();
                return m2;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                aiim aiimVar = (aiim) this.a.aS.bn.b();
                aiimVar.getClass();
                return aiimVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                adih adihVar = (adih) this.a.aS.bf.b();
                adihVar.getClass();
                return adihVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return new adsb((adps) this.a.m.b(), (adpu) this.a.j.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                adnk adnkVar = (adnk) this.a.aS.aN.b();
                adnkVar.getClass();
                return adnkVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return new adom();
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return this.a.aS.n();
            case 39:
                return new aikc();
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                aduo aduoVar = (aduo) this.a.aS.br.b();
                aduoVar.getClass();
                return aduoVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return new SignupEngine();
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                adeo adeoVar = (adeo) this.a.aS.aj.b();
                adeoVar.getClass();
                return adeoVar;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                aduw s2 = this.a.aS.s();
                s2.getClass();
                return new adqg(s2, (anen) this.a.c.b(), (adba) this.a.N.b(), this.a.O);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                Context context6 = (Context) this.a.f.b();
                Executor executor = (Executor) this.a.c.b();
                adqg adqgVar = (adqg) this.a.H.b();
                aegu aeguVar = (aegu) this.a.G.b();
                ajsg ajsgVar = new ajsg();
                anen anenVar2 = (anen) this.a.c.b();
                yjr yjrVar2 = (yjr) this.a.h.b();
                adov adovVar3 = (adov) this.a.d.b();
                aikc aikcVar = (aikc) this.a.C.b();
                acqy acqyVar2 = (acqy) this.a.g.b();
                adtz adtzVar6 = this.a;
                apya apyaVar19 = adtzVar6.L;
                addq b = adtzVar6.b();
                adaz adazVar = (adaz) apyaVar19.b();
                adtz adtzVar7 = this.a;
                return new adba(context6, executor, adqgVar, aeguVar, ajsgVar, anenVar2, yjrVar2, adovVar3, aikcVar, acqyVar2, b, adazVar, adtzVar7.a(), (addy) adtzVar7.M.b(), (wcf) this.a.K.b(), (aneo) this.a.v.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return new adqg((aegu) this.a.G.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                aegu aeguVar2 = (aegu) this.a.aS.ba.b();
                aeguVar2.getClass();
                return aeguVar2;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                Context context7 = (Context) this.a.f.b();
                Executor executor2 = (Executor) this.a.c.b();
                adqg adqgVar2 = (adqg) this.a.H.b();
                addp addpVar = (addp) this.a.J.b();
                aegu aeguVar3 = (aegu) this.a.G.b();
                ajsg ajsgVar2 = new ajsg();
                anen anenVar3 = (anen) this.a.c.b();
                yjr yjrVar3 = (yjr) this.a.h.b();
                adov adovVar4 = (adov) this.a.d.b();
                aikc aikcVar2 = (aikc) this.a.C.b();
                acqy acqyVar3 = (acqy) this.a.g.b();
                adtz adtzVar8 = this.a;
                return new adaz(context7, executor2, adqgVar2, addpVar, aeguVar3, ajsgVar2, anenVar3, yjrVar3, adovVar4, aikcVar2, acqyVar3, adtzVar8.b(), (wcf) adtzVar8.K.b(), (aneo) this.a.v.b());
            case 48:
                return new addp();
            case 49:
                wcf wcfVar = (wcf) this.a.aS.bz.b();
                wcfVar.getClass();
                return wcfVar;
            case 50:
                adtz adtzVar9 = this.a;
                return new addy(adtzVar9.b(), new addw(new adae((adnk) adtzVar9.A.b())));
            case 51:
                final apya apyaVar20 = this.a.aS.x;
                return new acya() { // from class: acwh
                    @Override // defpackage.acya
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.disable_incoming_messages_listener_for_chat_session_service");
                    }
                };
            case 52:
                return new adtg();
            case 53:
                return new adxs(this.a.T);
            case 54:
                adtz adtzVar10 = this.a;
                return new adxr(adtzVar10.Q, adtzVar10.S);
            case 55:
                aday adayVar = (aday) this.a.aS.bs.b();
                adayVar.getClass();
                return adayVar;
            case 56:
                adtz adtzVar11 = this.a;
                return new adxu(adtzVar11.m(), adtzVar11.R, adtzVar11.Q);
            case 57:
                return new adxt(this.a.Q);
            case 58:
                return new adta(this.a.aa);
            case 59:
                adtz adtzVar12 = this.a;
                return new adsz(adtzVar12.Q, adtzVar12.Z);
            case 60:
                adtz adtzVar13 = this.a;
                return new adtb(adtzVar13.Q, adtzVar13.V, adtzVar13.Y);
            case 61:
                return new adyq(this.a.Q);
            case 62:
                adtz adtzVar14 = this.a;
                return new adyb(adtzVar14.W, adtzVar14.X);
            case 63:
                return new adyd(this.a.Q);
            case 64:
                return new adyh(this.a.Q);
            case 65:
                return new adae((adta) this.a.ab.b());
            case 66:
                return new adze(this.a.ae);
            case 67:
                return new adzd(this.a.ad);
            case 68:
                return new adzg(this.a.ac);
            case 69:
                return new adzc(this.a.Q);
            case 70:
                Context context8 = (Context) this.a.f.b();
                adeo adeoVar2 = (adeo) this.a.F.b();
                adtn adtnVar = (adtn) this.a.t.b();
                anen anenVar4 = (anen) this.a.c.b();
                acnu i3 = this.a.aS.i();
                i3.getClass();
                return new acof(context8, adeoVar2, adtnVar, anenVar4, i3);
            case 71:
                return new acoi();
            case 72:
                return new adfq();
            case 73:
                return mbf.l(altg.a);
            case 74:
                adtz adtzVar15 = this.a;
                apya apyaVar21 = adtzVar15.am;
                adqg n2 = adtzVar15.n();
                acti actiVar = (acti) apyaVar21.b();
                acsn acsnVar = new acsn();
                return n2.k(actiVar, acsnVar, acsnVar, new acss(acsnVar, 1), new acss(acsnVar, i2), new actn(this.a.l(), 1));
            case 75:
                adtz adtzVar16 = this.a;
                return new afxz(adtzVar16.f, adtzVar16.k, adtzVar16.z, adtzVar16.ah, adtzVar16.ai, adtzVar16.aj, null, null, null);
            case 76:
                return new actx();
            case 77:
                aiii aiiiVar = (aiii) this.a.aS.bp.b();
                aiiiVar.getClass();
                return aiiiVar;
            case 78:
                return new acwn() { // from class: acuw
                };
            case 79:
                adtz adtzVar17 = this.a;
                return new adea(adtzVar17.f, adtzVar17.k, adtzVar17.z, adtzVar17.ah, adtzVar17.aj, (short[]) null);
            case 80:
                ahlp ahlpVar = (ahlp) this.a.aS.bo.b();
                ahlpVar.getClass();
                return ahlpVar;
            case 81:
                adtz adtzVar18 = this.a;
                return new adqg(adtzVar18.f, adtzVar18.k, adtzVar18.ah, adtzVar18.aj, null);
            case 82:
                Context context9 = (Context) this.a.f.b();
                adeo adeoVar3 = (adeo) this.a.F.b();
                adtn adtnVar2 = (adtn) this.a.t.b();
                anen anenVar5 = (anen) this.a.c.b();
                acnu i4 = this.a.aS.i();
                i4.getClass();
                return new acob(context9, adeoVar3, adtnVar2, anenVar5, i4);
            case 83:
                final acit acitVar = (acit) this.a.al.b();
                return new acti() { // from class: acsr
                    @Override // defpackage.acti
                    public final acth a(acnv acnvVar, actj actjVar) {
                        return acit.this.i();
                    }
                };
            case 84:
                return new acit(this.a.ak);
            case 85:
                Context context10 = (Context) this.a.f.b();
                aduu aduuVar3 = (aduu) this.a.a.b();
                adih adihVar2 = (adih) this.a.z.b();
                adxs adxsVar = (adxs) this.a.U.b();
                acqo.b(context10);
                acqo.a(context10);
                actx.a(context10);
                return new adqg(aduuVar3, adihVar2, adxsVar);
            case 86:
                return new adpy((adpu) this.a.j.b());
            case 87:
                adtz adtzVar19 = this.a;
                apya apyaVar22 = adtzVar19.f;
                adoi j3 = adtzVar19.j();
                Context context11 = (Context) apyaVar22.b();
                adtn adtnVar3 = (adtn) adtzVar19.t.b();
                adwg adwgVar = new adwg((Context) adtzVar19.f.b(), null);
                acoc acocVar2 = (acoc) adtzVar19.n.b();
                acnx j4 = adtzVar19.aS.j();
                j4.getClass();
                adfv adfvVar = new adfv(context11, adtnVar3, adwgVar, acocVar2, j4, (aneo) adtzVar19.v.b(), (adfq) adtzVar19.ag.b());
                acsu acsuVar2 = (acsu) this.a.au.b();
                adtz adtzVar20 = this.a;
                return j3.a(adwl.SINGLE_REG, adfvVar, acsuVar2, new adqh((adqa) adtzVar20.ap.b(), (acoc) adtzVar20.n.b()));
            case 88:
                adtz adtzVar21 = this.a;
                apya apyaVar23 = adtzVar21.as;
                adqg n3 = adtzVar21.n();
                acti actiVar2 = (acti) apyaVar23.b();
                acsn acsnVar2 = new acsn();
                adtz adtzVar22 = this.a;
                actb actbVar = new actb(adtzVar22.at, adtzVar22.c, adtzVar22.aj);
                actn actnVar = new actn(adtzVar22.l(), 0);
                vhf vhfVar = new vhf(actbVar, acsnVar2, 7, bArr);
                vhf vhfVar2 = new vhf(actbVar, acsnVar2, 8, bArr);
                return n3.k(actiVar2, (actk) vhfVar.b(), (actk) vhfVar2.b(), vhfVar, vhfVar2, actnVar);
            case 89:
                adtz adtzVar23 = this.a;
                final apya apyaVar24 = adtzVar23.ar;
                final apya apyaVar25 = adtzVar23.al;
                return new acti() { // from class: acsq
                    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
                    @Override // defpackage.acti
                    public final acth a(acnv acnvVar, actj actjVar) {
                        if (!aczf.J() && ((!((Boolean) aczf.o().a.M.a()).booleanValue() || aczf.o().M()) && (!((Boolean) aczf.o().a.O.a()).booleanValue() || aczf.o().M()))) {
                            return ((acit) apyaVar25.b()).i();
                        }
                        addy addyVar = (addy) armf.this.b();
                        return new actm((anen) addyVar.a.b(), addyVar.b, acnvVar, actjVar);
                    }
                };
            case 90:
                adtz adtzVar24 = this.a;
                return new addy(adtzVar24.ai, adtzVar24.c, adtzVar24.aj);
            case 91:
                Context context12 = (Context) this.a.f.b();
                anen anenVar6 = (anen) this.a.c.b();
                adtz adtzVar25 = this.a;
                return new actf(adwt.g(context12), anenVar6, new acto((Context) adtzVar25.f.b(), (acoc) adtzVar25.n.b()), acsy.b);
            case 92:
                return new ImsConnectionTrackerEngine((Context) this.a.f.b(), this.a.I);
            case 93:
                return new TransportControlEngine((adod) this.a.I.b(), (adtn) this.a.t.b());
            case 94:
                return new SingleRegistrationVendorImsController((adtl) this.a.b.b(), (adij) this.a.aD.b());
            case 95:
                adtz adtzVar26 = this.a;
                return new adir(adtzVar26.aB, adtzVar26.aC, adtzVar26.A);
            case 96:
                adtz adtzVar27 = this.a;
                return new adej(adtzVar27.f, adtzVar27.A, adtzVar27.ay, adtzVar27.az, adtzVar27.aA, null);
            case 97:
                return this.a.aS.o();
            case 98:
                adko adkoVar = (adko) this.a.aS.aV.b();
                adkoVar.getClass();
                return adkoVar;
            case 99:
                return new adiq((Context) this.a.f.b(), (acoc) this.a.n.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        int i = this.b;
        if (i / 100 != 0) {
            switch (i) {
                case VCardConstants.DEFAULT_PREF /* 100 */:
                    return new adik(0);
                case 101:
                    return new ContactsManager((Context) this.a.f.b(), (adps) this.a.m.b());
                case 102:
                    Context context = (Context) this.a.f.b();
                    aduu aduuVar = (aduu) this.a.a.b();
                    yjr yjrVar = (yjr) this.a.h.b();
                    adnv adnvVar = (adnv) this.a.aS.ai.b();
                    adnvVar.getClass();
                    return new RcsProfileEngine(context, aduuVar, yjrVar, adnvVar, (adnk) this.a.A.b());
                case 103:
                    anen anenVar = (anen) this.a.c.b();
                    adtz adtzVar = this.a;
                    addp addpVar = (addp) adtzVar.J.b();
                    adtz adtzVar2 = this.a;
                    apya apyaVar = adtzVar2.af;
                    adei g = adtzVar2.g();
                    adec d = adtzVar2.d();
                    adea c = adtzVar2.c();
                    adef f = adtzVar2.f();
                    adek i2 = adtzVar2.i();
                    adej h = adtzVar2.h();
                    acof acofVar = (acof) apyaVar.b();
                    addk addkVar = (addk) this.a.aH.b();
                    return new MessagingEngine(anenVar, adtzVar.H, addpVar, g, d, c, f, i2, h, adtzVar2.aJ, acofVar, addkVar);
                case 104:
                    return new ajtk();
                case 105:
                    return new aniz(1);
                case 106:
                    return new addk();
                case 107:
                    return new ajtj();
                case 108:
                    Context context2 = (Context) this.a.f.b();
                    Executor executor = (Executor) this.a.c.b();
                    aegu aeguVar = (aegu) this.a.G.b();
                    anen anenVar2 = (anen) this.a.c.b();
                    aiim aiimVar = (aiim) this.a.y.b();
                    aikc aikcVar = (aikc) this.a.C.b();
                    adpu adpuVar = (adpu) this.a.j.b();
                    adtz adtzVar3 = this.a;
                    apya apyaVar2 = adtzVar3.d;
                    addq b = adtzVar3.b();
                    adov adovVar = (adov) apyaVar2.b();
                    adeo adeoVar = (adeo) this.a.F.b();
                    yjr yjrVar2 = (yjr) this.a.h.b();
                    adaz adazVar = (adaz) this.a.L.b();
                    aneo aneoVar = (aneo) this.a.v.b();
                    adtz adtzVar4 = this.a;
                    aday a = adtzVar4.a();
                    adaw adawVar = new adaw(adtzVar4.aI);
                    aduo aduoVar = (aduo) adtzVar4.D.b();
                    adtn adtnVar = (adtn) this.a.t.b();
                    adnk adnkVar = (adnk) this.a.A.b();
                    addy addyVar = (addy) this.a.M.b();
                    return new adbb(context2, executor, aeguVar, anenVar2, aiimVar, aikcVar, adpuVar, b, adovVar, adeoVar, yjrVar2, adazVar, aneoVar, a, adawVar, aduoVar, adtnVar, adnkVar, addyVar, new adcx());
                case 109:
                    return new addj();
                case 110:
                    return new BusinessInfoEngine((Context) this.a.f.b(), (acnb) this.a.u.b());
                case 111:
                    return new adtf();
                case 112:
                    Context context3 = (Context) this.a.f.b();
                    adtz adtzVar5 = this.a;
                    return new afxz(context3, adtzVar5.b, adtzVar5.I, adtzVar5.a, adtzVar5.aN, adtzVar5.aO);
                case 113:
                    return (acxv) this.a.aS.ax.b();
                case 114:
                    return (aday) this.a.aS.aK.b();
                case 115:
                    return new acrl((Context) this.a.f.b(), (adih) this.a.z.b(), (adod) this.a.I.b(), (aduu) this.a.a.b());
                case 116:
                    return new adtu();
                case 117:
                    return new ajtv((Context) this.a.f.b());
                case 118:
                    return new ajtu();
                case 119:
                    return new ajtl((Context) this.a.f.b());
                case 120:
                    return new ajso((Context) this.a.f.b());
                case 121:
                    return new ajtt((Context) this.a.f.b());
                case 122:
                    return new ajtx((Context) this.a.f.b());
                case 123:
                    return new ajtw((Context) this.a.f.b());
                default:
                    throw new AssertionError(i);
            }
        }
        return a();
    }
}
