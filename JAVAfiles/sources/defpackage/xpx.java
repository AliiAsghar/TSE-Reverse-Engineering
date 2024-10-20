package defpackage;

import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xpx implements ancr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xpx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v124, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v136, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v96, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v84, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v51, types: [ahci, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v59, types: [ahiw, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        Locale locale;
        aouz aouzVar = null;
        int i = 3;
        int i2 = 1;
        switch (this.c) {
            case 0:
                xpy xpyVar = (xpy) this.a;
                xot xotVar = (xot) xpyVar.c.b();
                Optional of = Optional.of(xpg.DOWNLOAD);
                Object obj = this.b;
                String str = (String) obj;
                xow xowVar = (xow) xotVar.f(str, of).orElseThrow(new wxx(obj, 11));
                FileInformation fileInformation = (FileInformation) new pwc().fu(xowVar.h());
                if (fileInformation != null) {
                    byte[] q = xowVar.q();
                    if (q != null) {
                        if (xowVar.o() == null) {
                            alwl alwlVar = (alwl) xpy.a.i();
                            alwlVar.X(ydl.b, xowVar.m());
                            alwlVar.X(xod.a, obj);
                            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "resume", 153, "FileDownloadWorker.java")).q("No transfer handle found during resume. Attempting full file download instead.");
                            return xpyVar.b(xowVar.m(), str, fileInformation, aozb.w(q));
                        }
                        byte[] q2 = xowVar.q();
                        q2.getClass();
                        aozb w = aozb.w(q2);
                        String o = xowVar.o();
                        o.getClass();
                        return xpyVar.c(xpy.a(fileInformation, w, str, Optional.of(o)));
                    }
                    throw new xpt(false, xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No opaque data found for resuming download %s", obj));
                }
                throw new xpt(false, xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No FileInformation found for resuming download %s", obj));
            case 1:
                sxy d = MessagesTable.d();
                d.w("getOngoingFileTransferMessages");
                d.g(new xol(this.a, i));
                d.h(new atkn((Object) MessagesTable.c.i, true));
                Stream w2 = d.b().w();
                xoa xoaVar = (xoa) this.b;
                try {
                    Stream filter = w2.map(new xol(xoaVar.c, 4)).filter(new wjl(16));
                    int i3 = alog.d;
                    alog alogVar = (alog) filter.collect(alls.a);
                    if (w2 != null) {
                        w2.close();
                    }
                    return xoaVar.a(alogVar);
                } catch (Throwable th) {
                    if (w2 != null) {
                        try {
                            w2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            case 2:
                xqb xqbVar = (xqb) this.a;
                xot xotVar2 = (xot) xqbVar.c.b();
                Object obj2 = this.b;
                String str2 = (String) obj2;
                List h = xotVar2.h(str2, xpg.DOWNLOAD);
                if (h.isEmpty()) {
                    ((alwl) ((alwl) xqb.a.i()).h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "confirmSingleFileTransferTableEntry", 319, "RcsFileDownloader.java")).q("Could not find the file download entry in database.");
                } else if (((alsx) h).c > 1) {
                    ((alwl) ((alwl) xqb.a.i()).h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "confirmSingleFileTransferTableEntry", 324, "RcsFileDownloader.java")).q("Found more than one file download entry in database.");
                } else {
                    FileTransferService fileTransferService = (FileTransferService) xqbVar.b.b();
                    adtg adtgVar = new adtg();
                    adtgVar.l(str2);
                    PauseDownloadResult pauseDownload = fileTransferService.pauseDownload(adtgVar.k());
                    if (!FileTransferResult.a.equals(pauseDownload.a())) {
                        alwl alwlVar2 = (alwl) xqb.a.g();
                        alwlVar2.X(xod.a, obj2);
                        alwlVar2.X(xod.h, pauseDownload.a());
                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 144, "RcsFileDownloader.java")).q("Paused file download request failed.");
                        return xpt.b("Pause file download request failed");
                    }
                    alwl alwlVar3 = (alwl) xqb.a.g();
                    alwlVar3.X(xod.a, obj2);
                    alwlVar3.X(xod.h, pauseDownload.a());
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 153, "RcsFileDownloader.java")).q("Paused file download request succeeded.");
                    return aktp.ag(true);
                }
                return xpt.a("Failed to pause the download because file transfer entry does not exist in the file transfer table.");
            case 3:
                xse xseVar = (xse) this.a;
                xot xotVar3 = (xot) xseVar.d.b();
                Optional of2 = Optional.of(xpg.UPLOAD);
                String str3 = (String) this.b;
                xov b = xotVar3.b(str3, of2);
                if (!b.a()) {
                    return aktp.ag(vqh.a(3, 0).a());
                }
                Optional optional = b.b;
                Optional optional2 = b.a;
                Object obj3 = optional.get();
                ?? r1 = optional2.get();
                xow xowVar2 = (xow) obj3;
                qep h2 = xowVar2.h();
                h2.getClass();
                pwb pwbVar = new pwb();
                xry xryVar = new xry(null);
                xryVar.d(Uri.parse(h2.f));
                xryVar.e(h2.c);
                xryVar.f(h2.d);
                if ((h2.b & 1) != 0) {
                    qel qelVar = h2.e;
                    if (qelVar == null) {
                        qelVar = qel.a;
                    }
                    xryVar.c((ContentType) pwbVar.fu(qelVar));
                }
                xrz a = xryVar.a();
                String o2 = xowVar2.o();
                if (o2 == null) {
                    ((alwl) ((alwl) xse.a.g()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "resume", 111, "FileUploadWorkScheduler.java")).q("Transfer handle is not populated, i.e. file transfer is not ready to be resumed, falling back to full upload.");
                    return xseVar.b(str3, r1, a);
                }
                aozy c = xse.c(r1.E(), r1.w(), a, str3);
                if (!c.b.isMutable()) {
                    c.u();
                }
                xsb xsbVar = (xsb) c.b;
                xsb xsbVar2 = xsb.a;
                xsbVar.b |= 32;
                xsbVar.h = o2;
                return xseVar.a(str3, (xsb) c.s());
            case 4:
                Object obj4 = this.b;
                xsg xsgVar = (xsg) this.a;
                String str4 = (String) obj4;
                if (xsgVar.d(str4) && ((FileTransferService) xsgVar.b.b()).pauseFileTransfer(Long.parseLong(str4)).succeeded()) {
                    alwl alwlVar4 = (alwl) xsg.a.g();
                    alwlVar4.X(xod.a, obj4);
                    ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "pauseUpload", 173, "LegacyRcsFileUploader.java")).q("Paused file upload.");
                    return aktp.ag(null);
                }
                alwl alwlVar5 = (alwl) xsg.a.g();
                alwlVar5.X(xod.a, obj4);
                ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "pauseUpload", 177, "LegacyRcsFileUploader.java")).q("Failed to pause the upload.");
                return aktp.ag(null);
            case 5:
                Object obj5 = this.a;
                ygs ygsVar = (ygs) obj5;
                if (ygsVar.g == 1) {
                    return aktp.ag(ygh.a(3));
                }
                Object obj6 = this.b;
                MediaPlayer mediaPlayer = ygsVar.e;
                mediaPlayer.getClass();
                return d.m(new gst(obj5, mediaPlayer, obj6, 8, (byte[]) null));
            case 6:
                Object obj7 = this.a;
                ygs ygsVar2 = (ygs) obj7;
                if (ygsVar2.g == 1) {
                    return aktp.ag(ygh.a(3));
                }
                Object obj8 = this.b;
                MediaPlayer mediaPlayer2 = ygsVar2.e;
                mediaPlayer2.getClass();
                ListenableFuture m = d.m(new gst(obj7, mediaPlayer2, obj8, 7, (byte[]) null));
                ygsVar2.b.f.ifPresent(new ybf(obj7, 9));
                try {
                    mediaPlayer2.start();
                    ygsVar2.g = 3;
                    return m;
                } catch (IllegalStateException e) {
                    ygsVar2.b();
                    throw new ygm(e);
                }
            case 7:
                ((adve) ((zfm) ((acak) this.a).a).a).c((aovk) this.b);
                return aneh.a;
            case 8:
                adka adkaVar = (adka) this.a;
                adnk adnkVar = adkaVar.c;
                Optional k = adnkVar.k();
                whm e2 = adnkVar.e();
                if (!k.isPresent() || ((apag) k.get()).equals(whm.a)) {
                    i2 = 0;
                }
                Object obj9 = this.b;
                boolean equals = e2.equals(whm.a);
                if (i2 != 0) {
                    if (!equals) {
                        apct apctVar = e2.g;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        Instant l = aotl.l(apctVar);
                        apct apctVar2 = ((whm) k.get()).g;
                        if (apctVar2 == null) {
                            apctVar2 = apct.a;
                        }
                        if (l.isBefore(aotl.l(apctVar2))) {
                            return adkaVar.e((apkl) obj9, (whm) k.get());
                        }
                        return adkaVar.d((apkl) obj9, e2);
                    }
                } else if (!equals) {
                    return adkaVar.d((apkl) obj9, e2);
                }
                if (i2 != 0) {
                    return adkaVar.e((apkl) obj9, (whm) k.get());
                }
                advr.l(adkaVar.a, "Both RcsDefaultOnConsentCache's and GoogleToSConsentCache's are empty in Storage, hence not Revoking Consent", new Object[0]);
                ((vyv) adkaVar.e.b()).e(3);
                return aneh.a;
            case 9:
                ajxa ajxaVar = (ajxa) this.a;
                ArrayList arrayList = new ArrayList(ajxaVar.b.size());
                Iterator it = ajxaVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ahcd) it.next()).a(this.b));
                }
                return albo.bX(arrayList).a(new aaze(arrayList, 18), ajxaVar.a);
            case 10:
                Object obj10 = this.b;
                Object obj11 = this.a;
                try {
                    ((aiim) obj11).b.remove(obj10);
                    ((aiim) obj11).d.b((String) obj10, ((aiim) obj11).b.size());
                    return aneh.a;
                } catch (Exception e3) {
                    ahiu.e(e3, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", obj10);
                    return albo.bH(e3);
                }
            case 11:
                return ((ahmd) this.a).ap((ashd) this.b, null);
            case 12:
                return ((ahnf) this.a).a((ahng) this.b);
            case 13:
                ahps ahpsVar = (ahps) this.a;
                return ahpsVar.b(((ahpo) ahpsVar.d.b()).c(this.b));
            case 14:
                aozy createBuilder = aouw.a.createBuilder();
                aozy createBuilder2 = aouv.a.createBuilder();
                boolean isMutable = createBuilder2.b.isMutable();
                Object obj12 = this.a;
                if (!isMutable) {
                    createBuilder2.u();
                }
                Object obj13 = this.b;
                aouv aouvVar = (aouv) createBuilder2.b;
                obj13.getClass();
                aouvVar.b = (String) obj13;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aouw aouwVar = (aouw) createBuilder.b;
                aouv aouvVar2 = (aouv) createBuilder2.s();
                aouvVar2.getClass();
                aouwVar.d = aouvVar2;
                aouwVar.b |= 2;
                aiqj aiqjVar = (aiqj) obj12;
                Object obj14 = aiqjVar.j;
                airl airlVar = (airl) obj14;
                String a2 = airlVar.a();
                synchronized (airlVar.a) {
                    airk airkVar = ((airl) obj14).c;
                    if (airkVar == null) {
                        locale = null;
                    } else {
                        locale = airkVar.c;
                    }
                }
                Object obj15 = aiqjVar.j;
                synchronized (((airl) obj15).a) {
                    airk airkVar2 = ((airl) obj15).c;
                    if (airkVar2 != null) {
                        aouzVar = airkVar2.e;
                    }
                }
                aovf aovfVar = (aovf) aiqjVar.l(a2, locale, aouzVar).s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aouw aouwVar2 = (aouw) createBuilder.b;
                aovfVar.getClass();
                aouwVar2.c = aovfVar;
                aouwVar2.b |= 1;
                aouw aouwVar3 = (aouw) createBuilder.s();
                aiqjVar.i();
                aovd aovdVar = (aovd) aiqjVar.d.get();
                aqrs aqrsVar = aovdVar.a;
                aqux aquxVar = aove.b;
                if (aquxVar == null) {
                    synchronized (aove.class) {
                        aquxVar = aove.b;
                        if (aquxVar == null) {
                            aquu a3 = aqux.a();
                            a3.e = aquw.UNARY;
                            a3.a = aqux.c("google.internal.expression.sticker.v1.StickerService", "SearchStickers");
                            a3.b();
                            aouw aouwVar4 = aouw.a;
                            aozs aozsVar = arkx.a;
                            a3.c = new arkw(aouwVar4);
                            a3.d = new arkw(aoux.a);
                            aquxVar = a3.a();
                            aove.b = aquxVar;
                        }
                    }
                }
                return arlj.a(aqrsVar.a(aquxVar, aovdVar.b), aouwVar3);
            case 15:
                aiqj aiqjVar2 = (aiqj) this.a;
                aiqjVar2.i();
                ((airh) aiqjVar2.g).c(3);
                aovd aovdVar2 = (aovd) aiqjVar2.d.get();
                aqrs aqrsVar2 = aovdVar2.a;
                aqux aquxVar2 = aove.a;
                if (aquxVar2 == null) {
                    synchronized (aove.class) {
                        aquxVar2 = aove.a;
                        if (aquxVar2 == null) {
                            aquu a4 = aqux.a();
                            a4.e = aquw.UNARY;
                            a4.a = aqux.c("google.internal.expression.sticker.v1.StickerService", "ListStickerPacks");
                            a4.b();
                            aout aoutVar = aout.a;
                            aozs aozsVar2 = arkx.a;
                            a4.c = new arkw(aoutVar);
                            a4.d = new arkw(aouu.a);
                            aquxVar2 = a4.a();
                            aove.a = aquxVar2;
                        }
                    }
                }
                return arlj.a(aqrsVar2.a(aquxVar2, aovdVar2.b), this.b);
            case 16:
                return ((agxw) this.b).p((ajwt) this.a);
            case 17:
                ajyd ajydVar = (ajyd) this.b.b();
                return ancj.f(ajydVar.a((ajyi) this.a), new ajyn(ajydVar, i2), andi.a);
            case 18:
                Object obj16 = this.a;
                ajzk ajzkVar = (ajzk) obj16;
                ansy ansyVar = (ansy) ajzkVar.c.b();
                alor y = ansyVar.y();
                ArrayList arrayList2 = new ArrayList(1);
                Object obj17 = this.b;
                aluq listIterator = ((alpt) obj17).listIterator();
                while (listIterator.hasNext()) {
                    String str5 = (String) listIterator.next();
                    albo.N(y.containsKey(str5), "No AccountProvider found for type: %s", str5);
                    arrayList2.add(ansyVar.E(str5, (akec) y.get(str5)));
                }
                return ancj.g(ansyVar.z(arrayList2), akto.d(new ahsi(obj16, obj17, 7)), ajzkVar.g);
            case 19:
                return ((ahiy) ((akkd) this.b).c).z(new ajyn(this.a, 6), andi.a);
            default:
                return akkd.c((ajzd) this.a, (Set) ((akkd) this.b).d.b()).a(new agug(8), andi.a);
        }
    }

    public /* synthetic */ xpx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
