package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xfv implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xfv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, apvh] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v60, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r15v80, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v88, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [armf, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul i;
        String O;
        int i2 = 2;
        int i3 = 11;
        int i4 = 6;
        int i5 = 3;
        int i6 = 4;
        int i7 = 17;
        byte[] bArr = null;
        int i8 = 0;
        switch (this.c) {
            case 0:
                return ((xfw) this.a).b((String) this.b);
            case 1:
                Object obj2 = this.a;
                qei c = xfq.c((qgw) obj2);
                Object obj3 = this.b;
                xfq xfqVar = (xfq) obj3;
                return xfqVar.a.a(c).i(new vwx(obj3, obj2, (anji) obj, i7), xfqVar.b);
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    return aktp.ag(false);
                }
                ?? r15 = this.b;
                Object obj4 = this.a;
                ((alwl) ((alwl) xfw.a.g()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "enableTransport", 110, "TachygramLifecycleManager.java")).q("Forcing Tachyon phone registration to enable Tachygram.");
                if (((Boolean) new mst(11).get()).booleanValue()) {
                    xfw xfwVar = (xfw) obj4;
                    return xfwVar.c.f(((psq) xfwVar.f.b()).a((String) r15, false)).i(new xfv(obj4, r15, i6), xfwVar.b).h(new xdh(16), xfwVar.b);
                }
                xfw xfwVar2 = (xfw) obj4;
                vcj vcjVar = xfwVar2.c;
                if (!vcjVar.h()) {
                    vcj.a.l("Tachyon phone registration flag disabled");
                    i = aktp.ag(null);
                } else {
                    vcj.a.l("Tachyon phone registration flag enabled");
                    vcjVar.i.set(true);
                    akul ag = aktp.ag(r15);
                    if (TextUtils.isEmpty(r15)) {
                        vcj.a.q("No phone number provided for registration. Attempting to acquire from profile service");
                        if (!vcjVar.d.isConnected()) {
                            vcj.a.q("Config update received but no phone number could be acquired");
                            i = aktp.ag(null);
                        } else {
                            alvw i9 = vcj.b.i();
                            i9.X(alwp.a, "BugleNetwork");
                            ((alvg) ((alvg) i9).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 137, "TachyonPhoneRegistrationManager.java")).q("Forcing Tachyon phone registration for all self identities");
                            i = vcjVar.e();
                        }
                    } else {
                        i = ag.i(new vbn(vcjVar, i7), vcjVar.g);
                    }
                }
                return i.i(new xfv(obj4, r15, i8), xfwVar2.b).h(new xdh(i7), xfwVar2.b);
            case 3:
                Stream filter = Collection.EL.stream(((alor) obj).entrySet()).filter(new xdm(this.b, i5)).filter(new wjl(10));
                Object obj5 = this.a;
                Stream map = filter.map(new xeo(obj5, i7));
                int i10 = alog.d;
                alog alogVar = (alog) map.collect(alls.a);
                return aktp.am(alogVar).h(new wkf(alogVar, 9), ((xfw) obj5).b);
            case 4:
                return ((xfw) this.a).b((String) this.b);
            case 5:
                ResumeDownloadResult resumeDownload = ((FileTransferService) ((xqb) this.a).b.b()).resumeDownload((ResumeDownloadRequest) obj);
                boolean equals = FileTransferResult.a.equals(resumeDownload.a());
                Object obj6 = this.b;
                if (equals) {
                    alwl alwlVar = (alwl) xqb.a.g();
                    alwlVar.X(xod.h, resumeDownload.a());
                    alwlVar.X(xod.a, obj6);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 233, "RcsFileDownloader.java")).q("Resume download request succeeded.");
                    xjo xjoVar = new xjo();
                    xjoVar.b((String) obj6);
                    return aktp.ag(xjoVar.a());
                }
                alwl alwlVar2 = (alwl) xqb.a.g();
                alwlVar2.X(xod.h, resumeDownload.a());
                alwlVar2.X(xod.a, obj6);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 242, "RcsFileDownloader.java")).q("Resume download request failed.");
                return xpt.b("Resume download request failed.");
            case 6:
                xql xqlVar = (xql) this.a;
                if (((ansy) ((nnw) xqlVar.y).a.b()).e("bugle.enable_download_retries_when_file_was_not_found")) {
                    pwq a = pwr.a();
                    a.f(xoc.FILE_TRANSFER_FAILURE_REASON_FILE_NOT_FOUND_WHILE_TRYING_TO_DECRYPT);
                    a.e(BasePaymentResult.ERROR_REQUEST_FAILED);
                    amrl c2 = pwr.a().a().c(xqlVar.B.a(a.a()));
                    amgl amglVar = (amgl) amgu.a.createBuilder();
                    amxo n = ((hgj) xqlVar.x.b()).n();
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar = (amgu) amglVar.b;
                    amguVar.aa = n.h;
                    amguVar.c |= 2097152;
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    Object obj7 = this.b;
                    amgu amguVar2 = (amgu) amglVar.b;
                    c2.getClass();
                    amguVar2.an = c2;
                    amguVar2.d |= 4;
                    amgu amguVar3 = (amgu) amglVar.s();
                    aozy createBuilder = xqr.a.createBuilder();
                    xqm xqmVar = (xqm) obj7;
                    String str = xqmVar.c;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    xqr xqrVar = (xqr) apagVar;
                    str.getClass();
                    xqrVar.b = 1 | xqrVar.b;
                    xqrVar.c = str;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    xqr xqrVar2 = (xqr) apagVar2;
                    amguVar3.getClass();
                    xqrVar2.e = amguVar3;
                    xqrVar2.b |= 4;
                    String str2 = xqmVar.d;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    xqr xqrVar3 = (xqr) createBuilder.b;
                    str2.getClass();
                    xqrVar3.b |= 8;
                    xqrVar3.f = str2;
                    xqr xqrVar4 = (xqr) createBuilder.s();
                    return ((vyv) xqlVar.r.b()).v(xqrVar4).h(new xpm(xqrVar4, c2, i6, bArr), xqlVar.i);
                }
                return aktp.ag(upm.d());
            case 7:
                pwh pwhVar = (pwh) obj;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) this.a;
                if (vcp.k(bindData) && (O = bindData.O()) != null) {
                    Object obj8 = this.b;
                    aozy createBuilder2 = umk.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar3 = createBuilder2.b;
                    ((umk) apagVar3).b = O;
                    if (!apagVar3.isMutable()) {
                        createBuilder2.u();
                    }
                    ((umk) createBuilder2.b).d = a.am(5);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    xrf xrfVar = (xrf) obj8;
                    lpg lpgVar = xrfVar.N;
                    ((umk) createBuilder2.b).c = a.an(3);
                    return lpgVar.E((umk) createBuilder2.s(), new uta(O, O, null, null, null, null)).h(new xqi(pwhVar, 3), xrfVar.c);
                }
                return aktp.ag(pwhVar);
            case 8:
                ((xrm) this.b).f.e(false, this.a.z());
                return aktp.ag(null);
            case 9:
                alwl alwlVar3 = (alwl) xsl.a.g();
                ?? r0 = this.b;
                alwlVar3.X(xod.b, r0.d());
                pzn pznVar = (pzn) this.a;
                alwlVar3.X(xod.a, pznVar.a);
                alwlVar3.X(xod.j, pznVar.b);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "uploadInternal", 230, "ScottyFileUploader.java")).q("File upload is starting.");
                return r0.b();
            case 10:
                return ((xst) this.a).d((String) this.b);
            case 11:
                wyp wypVar = (wyp) ((xst) this.a).c.b();
                pzn pznVar2 = new pzn((String) this.b, null, null, 6);
                xsl xslVar = (xsl) wypVar.g.b();
                return aktp.ah(new wnc(xslVar, pznVar2, 12), xslVar.b);
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    return aktp.ag(false);
                }
                Object obj9 = this.b;
                Object obj10 = this.a;
                aazm aazmVar = (aazm) obj10;
                return ((zai) aazmVar.b.b()).c().h(new xpm(obj10, obj9, i3, bArr), aazmVar.d);
            case 13:
                return ((ygs) this.a).d((ahjj) this.b);
            case 14:
                ygh yghVar = (ygh) obj;
                if (yghVar.a != 1) {
                    return aktp.ag(yghVar);
                }
                Object obj11 = this.b;
                Object obj12 = this.a;
                return aktp.aj(new xpx(obj12, obj11, i4), ((ygs) obj12).c);
            case 15:
                Object obj13 = this.b;
                obj13.getClass();
                ((Optional) obj).ifPresent(new ybf(obj13, 17));
                alog g = yin.g((String) yig.H.e());
                ArrayList arrayList = new ArrayList();
                int i11 = ((alsx) g).c;
                while (true) {
                    Object obj14 = this.a;
                    if (i8 < i11) {
                        alcs alcsVar = (alcs) g.get(i8);
                        yin yinVar = (yin) obj14;
                        arrayList.add(new akuk(albo.f(alcsVar)).e(new xsj(alcsVar, i2), yinVar.c).f().e(FileNotFoundException.class, new yez(alcsVar, 5), yinVar.d).e(IOException.class, new yez(alcsVar, 6), yinVar.d));
                        i8++;
                    } else {
                        return aktp.am(arrayList).h(new xfb(arrayList, obj13, i7), ((yin) obj14).d);
                    }
                }
            case 16:
                return ((adve) ((yqi) this.a).c.b()).d((aech) this.b);
            case 17:
                return ((adve) ((yqi) this.a).c.b()).d((aech) this.b);
            case 18:
                Throwable th = (Throwable) obj;
                ytw.a.r("Key pair registration on server failed", th);
                Object obj15 = this.b;
                ytw ytwVar = (ytw) this.a;
                return ytwVar.e((anmf) obj15, 4, th).i(new ytu(th, i8), ytwVar.j);
            case 19:
                Throwable th2 = (Throwable) obj;
                ytw.a.r("Key pair registration on client failed", th2);
                Object obj16 = this.b;
                ytw ytwVar2 = (ytw) this.a;
                return ytwVar2.e((anmf) obj16, 5, th2).i(new xfn(th2, 19), ytwVar2.j);
            default:
                yuf yufVar = (yuf) obj;
                xyo c3 = ytw.a.c();
                c3.H("Registering C11N number(s)");
                ?? r2 = this.b;
                alog alogVar2 = (alog) r2;
                c3.x("count", alogVar2.size());
                c3.q();
                alob d = alog.d(alogVar2.size());
                int size = r2.size();
                while (true) {
                    Object obj17 = this.a;
                    if (i8 < size) {
                        yuk yukVar = (yuk) r2.get(i8);
                        d.h(((ytw) obj17).b(yufVar, yukVar.b, yukVar.a));
                        i8++;
                    } else {
                        alog g2 = d.g();
                        return aktp.ao(g2).h(new ytr(g2, i2), ((ytw) obj17).j);
                    }
                }
        }
    }

    public /* synthetic */ xfv(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
