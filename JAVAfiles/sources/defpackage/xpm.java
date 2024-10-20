package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xpm implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xpm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v113, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [j$.time.temporal.TemporalAmount, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        long epochMilli;
        int i = 1;
        switch (this.c) {
            case 0:
                alwl alwlVar = (alwl) xpn.a.g();
                alwlVar.X(ydl.e, ((xqr) this.a).c);
                alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadFailed", 143, "BugleFileDownloadCallbackHandler.java");
                pwr pwrVar = (pwr) this.b;
                int aR = a.aR(pwrVar.b().e);
                if (aR != 0) {
                    i = aR;
                }
                amrm amrmVar = pwrVar.b().f;
                if (amrmVar == null) {
                    amrmVar = amrm.a;
                }
                alwlVar2.J("File download failed with reason: %s and http response code: %s, queued work item to process failure. Error details: %s", akec.ak(i), Long.valueOf(amrmVar.c), pwrVar.e());
                return null;
            case 1:
                xov xovVar = (xov) obj;
                boolean isEmpty = xovVar.a.isEmpty();
                Object obj2 = this.a;
                if (!isEmpty && !xovVar.b.isEmpty()) {
                    Object obj3 = this.b;
                    ?? r6 = xovVar.a.get();
                    xpg n = ((xow) xovVar.b.get()).n();
                    if (xpg.DOWNLOAD.equals(n)) {
                        epochMilli = r6.n();
                    } else {
                        epochMilli = ((xok) obj3).e.f().toEpochMilli();
                    }
                    if (xpg.DOWNLOAD.equals(n)) {
                        ((MessageData) r6).aR(epochMilli);
                    } else {
                        ((MessageData) r6).bb(epochMilli);
                    }
                    alwl alwlVar3 = (alwl) xok.a.g();
                    alwlVar3.X(xod.a, obj2);
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 77, "FileTransferStartedCallbackHandler.java")).q("File transfer starting. Marking message in progress.");
                    ((rwd) ((xok) obj3).c.b()).N(r6);
                } else {
                    alwl alwlVar4 = (alwl) xok.a.i();
                    alwlVar4.X(xod.a, obj2);
                    ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 59, "FileTransferStartedCallbackHandler.java")).q("Could not find a valid FileTransferMessageCoreData to handle file transfer starting callback.");
                }
                return null;
            case 2:
                alwo alwoVar = xpy.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj4 = this.b;
                Object obj5 = this.a;
                if (!booleanValue) {
                    alwl alwlVar5 = (alwl) xpy.a.i();
                    alwlVar5.X(xod.a, obj5);
                    alwl alwlVar6 = (alwl) alwlVar5.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "queueFileDownloadAsync", 242, "FileDownloadWorker.java");
                    xpu b = xpu.b(((xpv) obj4).c);
                    if (b == null) {
                        b = xpu.FILE;
                    }
                    alwlVar6.t("Download not queued for %s.", b.name());
                } else {
                    alwl alwlVar7 = (alwl) xpy.a.g();
                    alwlVar7.X(xod.a, obj5);
                    alwl alwlVar8 = (alwl) alwlVar7.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "queueFileDownloadAsync", 250, "FileDownloadWorker.java");
                    xpu b2 = xpu.b(((xpv) obj4).c);
                    if (b2 == null) {
                        b2 = xpu.FILE;
                    }
                    alwlVar8.t("Download is queued for %s.", b2.name());
                }
                return obj5;
            case 3:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    Iterator it = ((Set) ((xql) this.a).v.b()).iterator();
                    while (it.hasNext()) {
                        ((xcs) ((wfh) it.next()).a).o(this.b.E().f(), new ahka("ToFileDownloaded"), xcr.TACHYGRAM_MESSAGE_ARRIVED);
                    }
                }
                return bool;
            case 4:
                alvw g = xql.a.g();
                g.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.e, ((xqr) this.b).c);
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processFileDownloadForFileNotFound", 428, "FileDownloadCompletedHandler.java");
                amrl amrlVar = (amrl) this.a;
                int aR2 = a.aR(amrlVar.e);
                if (aR2 != 0) {
                    i = aR2;
                }
                amrm amrmVar2 = amrlVar.f;
                if (amrmVar2 == null) {
                    amrmVar2 = amrm.a;
                }
                alvgVar2.C("File download failed with reason: %s and http response code: %s, queued work item to process failure.", akec.ak(i), amrmVar2.c);
                return upm.c(alog.r(vjs.g()));
            case 5:
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isPresent()) {
                    return (BusinessInfoData) optional.get();
                }
                return ((wfh) ((xrf) this.a).i.b()).o(((qei) this.b).d);
            case 6:
                rwd rwdVar = (rwd) ((xrg) this.a).b.b();
                Object obj6 = this.b;
                MessageCoreData r = rwdVar.r((rve) obj6);
                if (r == null) {
                    alwl alwlVar9 = (alwl) xrg.a.i();
                    alwlVar9.X(ydl.e, ((rvf) obj6).b);
                    ((alwl) alwlVar9.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 69, "MessageCoreDataGetter.java")).q("Message does not exist");
                    return Optional.empty();
                }
                if (r.G() == null) {
                    alwl alwlVar10 = (alwl) xrg.a.i();
                    alwlVar10.X(ydl.e, ((rvf) obj6).b);
                    ((alwl) alwlVar10.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 78, "MessageCoreDataGetter.java")).q("Message has no attachments");
                    return Optional.empty();
                }
                if (r.t() == null) {
                    alwl alwlVar11 = (alwl) xrg.a.i();
                    alwlVar11.X(ydl.e, ((rvf) obj6).b);
                    ((alwl) alwlVar11.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 86, "MessageCoreDataGetter.java")).q("Message SMS URI is null");
                    return Optional.empty();
                }
                return Optional.of(r);
            case 7:
                alwl alwlVar12 = (alwl) xrk.a.g();
                Object obj7 = this.b;
                alwlVar12.X(ydl.e, ((rvf) obj7).b);
                ((alwl) alwlVar12.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "addFutureForRcsMessage", 55, "TelephonyInsertionFutureRepository.java")).q("Processing of Telephony insertion finished. Removing from repository.");
                return null;
            case 8:
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) obj;
                boolean succeeded = fileTransferServiceResult.succeeded();
                Object obj8 = this.a;
                if (succeeded) {
                    Object obj9 = this.b;
                    ((xsg) obj9).c.e("RcsFileUploader#uploadFile", new vri(obj9, obj8, fileTransferServiceResult, 15, (int[]) null));
                    return vqh.a;
                }
                alwl alwlVar13 = (alwl) xsg.a.i();
                alwlVar13.X(ydl.b, ((xsq) obj8).a.B());
                ((alwl) alwlVar13.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "uploadFile", 97, "LegacyRcsFileUploader.java")).r("Failed to schedule the file upload: %s.", fileTransferServiceResult.getCode());
                return vqh.a(3, 0).a();
            case 9:
                yyb yybVar = (yyb) obj;
                if (yybVar instanceof xsz) {
                    Object obj10 = this.b;
                    Object obj11 = this.a;
                    qiu.h(aktp.ai(new xqt(obj11, obj10, ((xsz) yybVar).a.a, 5, (char[]) null), ((wyp) obj11).d));
                }
                return yybVar;
            case 10:
                return Boolean.valueOf(((xnv) ((zas) this.b).i).f().minus(this.a).isBefore((Instant) obj));
            case 11:
                yfb yfbVar = (yfb) obj;
                if (!((alog) this.a).contains(yfbVar.d()) && !((Boolean) yfe.s.e()).booleanValue()) {
                    return false;
                }
                aazm aazmVar = (aazm) this.b;
                aazmVar.e = yfbVar;
                aazmVar.a.b();
                return true;
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    return this.b;
                }
                return ((zai) this.a).d;
            case 13:
                return ((yin) this.b).f((Optional) obj, (aloi) this.a);
            case 14:
                vqh vqhVar = (vqh) obj;
                int i2 = vqhVar.b;
                Object obj12 = this.a;
                Object obj13 = this.b;
                if (i2 != -1) {
                    if (i2 != 0) {
                        ((alwl) ((alwl) yrd.a.i()).h("com/google/android/apps/messaging/shared/util/spam/rbm/RbmSpamReporter", "handleSendRbmSpamReport", 112, "RbmSpamReporter.java")).q("RbmSpamReporter: Failed to send RBM Spam Report.");
                        ((yra) ((yrd) obj12).g.b()).b((rve) obj13, vqhVar.g);
                    } else {
                        ((alwl) yrd.a.n().h("com/google/android/apps/messaging/shared/util/spam/rbm/RbmSpamReporter", "handleSendRbmSpamReport", 107, "RbmSpamReporter.java")).q("RbmSpamReporter: The RBM Spam report immediately sent successfully");
                        ((yra) ((yrd) obj12).g.b()).c((rve) obj13);
                    }
                } else {
                    ((alwl) yrd.a.n().h("com/google/android/apps/messaging/shared/util/spam/rbm/RbmSpamReporter", "handleSendRbmSpamReport", 101, "RbmSpamReporter.java")).q("RbmSpamReporter: Transport accepted the RBM Spam report for sending");
                }
                return null;
            case 15:
                Object obj14 = this.a;
                alnr alnrVar = yul.a;
                if (((yub) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((yuf) obj).e), obj14, yub.a)).b.contains(this.b)) {
                    return null;
                }
                throw new IllegalStateException("Keypair was not saved for: " + ((String) obj14).hashCode());
            case 16:
                return ((yup) this.b).a((KeyPair) this.a, (ansm) obj);
            case 17:
                aozy builder = ((aaaw) obj).toBuilder();
                Object obj15 = this.b;
                obj15.getClass();
                Object obj16 = this.a;
                obj16.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                aaaw aaawVar = (aaaw) builder.b;
                apbo apboVar = aaawVar.b;
                if (!apboVar.b) {
                    aaawVar.b = apboVar.a();
                }
                aaawVar.b.put(obj15, obj16);
                return (aaaw) builder.s();
            case 18:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                Object obj17 = this.b;
                if (!booleanValue2) {
                    return obj17;
                }
                Object obj18 = this.a;
                AtomicReference atomicReference = new AtomicReference(obj17);
                wyp wypVar = (wyp) obj18;
                aacp aacpVar = (aacp) wypVar.e;
                aacpVar.w = ((rry) wypVar.f).l;
                aacpVar.x = aacpVar.h.isSelected();
                ((Optional) ((apxx) ((aacp) wypVar.e).g).a).ifPresent(new zcd(obj18, atomicReference, 5));
                return (Spannable) atomicReference.get();
            case 19:
                alog alogVar = (alog) obj;
                xze xzeVar = aalt.c;
                Object obj19 = this.b;
                if (alogVar != null && !alogVar.isEmpty()) {
                    String join = TextUtils.join("\n--\n", Collection.EL.stream(alogVar).map(new aakq(11)).toArray());
                    ((ClipboardManager) ((Activity) obj19).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Annotation", join));
                    new AlertDialog.Builder((Context) obj19).setTitle("Annotations").setMessage(join).setCancelable(true).show();
                } else {
                    new AlertDialog.Builder((Context) obj19).setTitle("No annotations").setMessage(String.format("Message %s doesn't exist or has no annotations.", this.a)).setCancelable(true).show();
                }
                return true;
            default:
                Object obj20 = this.a;
                aalt aaltVar = (aalt) obj20;
                Context context = aaltVar.y;
                File file = (File) obj;
                Object obj21 = this.b;
                File e = uti.e(context, "bugle_backup_db");
                try {
                    file.getClass();
                    amcp.a(new FileInputStream(file), new FileOutputStream(e));
                    Uri d = uti.d(((aalt) obj20).y, "bugle_backup_db");
                    fcp fcpVar = new fcp((Context) obj21, (byte[]) null);
                    fcpVar.g("Share Backup db");
                    fcpVar.h("application/sql");
                    fcpVar.f(d);
                    Intent e2 = fcpVar.e();
                    e2.setFlags(1);
                    akto.n((Context) obj21, e2);
                } catch (IOException e3) {
                    ((alvg) ((alvg) ((alvg) aalt.d.i()).g(e3)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionWriteBackup", (char) 2413, "DebugUtilsImpl.java")).q("Failed to copy BackupDb");
                    ((abbu) aaltVar.Z.b()).l("Failed to copy BackupDb");
                }
                return null;
        }
    }

    public /* synthetic */ xpm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
