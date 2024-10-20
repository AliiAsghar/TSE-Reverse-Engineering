package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.ims.filetransfer.http.PendingTransferInfo;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acry implements acrz, adjr {
    static final acyz a = aczd.a(170131477);
    public final Context b;
    public final acnj c;
    public final acrm d;
    public final acts e;
    public final HashMap f;
    public final adve g;
    final acua h;
    public final ahjj i;
    private final adps j;
    private final FileTransferEngine k;
    private final adih l;
    private final acsu m;
    private final ThreadPoolExecutor n;
    private final ThreadPoolExecutor o;
    private final adut p;
    private InstantMessageConfiguration q;

    public acry(Context context, InstantMessageConfiguration instantMessageConfiguration, acnj acnjVar, acub acubVar, FileTransferEngine fileTransferEngine, adps adpsVar, acrm acrmVar, adih adihVar, acsu acsuVar, acts actsVar, ahjj ahjjVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 1L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.n = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(3, 3, 1L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.o = threadPoolExecutor2;
        this.f = new HashMap();
        this.g = new adve();
        acnl acnlVar = new acnl(this, 5);
        this.h = acnlVar;
        this.b = context;
        this.c = acnjVar;
        this.q = instantMessageConfiguration;
        this.k = fileTransferEngine;
        this.j = adpsVar;
        this.d = acrmVar;
        this.l = adihVar;
        this.m = acsuVar;
        this.e = actsVar;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.p = new adut(context, "httpft_pending");
        this.i = ahjjVar;
        acubVar.w("application/vnd.gsma.rcs-ft-http+xml", acnlVar);
    }

    private final void A(long j, PendingTransferInfo pendingTransferInfo) {
        this.p.i(Long.toString(j), pendingTransferInfo);
    }

    private final FileDownloadResult w(String str, FileInformation fileInformation, PendingIntent pendingIntent) {
        String str2;
        Runnable a2;
        acsb acsbVar = new acsb(this.b, this, this.e, fileInformation, pendingIntent, str);
        Optional g = fileInformation.g();
        if (!g.isEmpty() && !ajqd.FILE.equals(g.get())) {
            advr.c("Downloading thumbnail. Size: %d", Integer.valueOf(fileInformation.a()));
            str2 = str;
            a2 = this.m.d(-1L, str, this.q, acsbVar, fileInformation.i(), fileInformation.a());
        } else {
            str2 = str;
            advr.c("Downloading file. Size: %d", Integer.valueOf(fileInformation.a()));
            a2 = this.m.a(-1L, str, this.q, acsbVar, fileInformation.i(), fileInformation.h(), fileInformation.a());
        }
        this.n.execute(a2);
        this.f.put(str2, a2);
        adtg adtgVar = new adtg();
        adtgVar.p(str2);
        return adtgVar.o();
    }

    private final FileTransferServiceResult x(long j, PendingTransferInfo pendingTransferInfo, acsh acshVar) {
        if (pendingTransferInfo.mType == PendingTransferInfo.Type.UPLOAD) {
            String l = Long.toString(j);
            if (((acuh) this.f.get(l)) != null) {
                advr.c("Upload already in progress for session ID %d, ignoring", Long.valueOf(j));
                return new FileTransferServiceResult(j, null, 0, "HTTP FT already uploading");
            }
            if (!this.c.i()) {
                return new FileTransferServiceResult(j, pendingTransferInfo.mRemoteParty, 4, "Not registered to RCS");
            }
            String str = pendingTransferInfo.mTransactionId;
            String str2 = pendingTransferInfo.mFileId;
            String str3 = pendingTransferInfo.mRemoteParty;
            FileTransferInfo fileTransferInfo = pendingTransferInfo.mFileTransferInfo;
            acsu acsuVar = this.m;
            InstantMessageConfiguration instantMessageConfiguration = this.q;
            acnv d = acsuVar.c.d(true, str2);
            acsx i = acsuVar.d.i(j, str2, str, fileTransferInfo, instantMessageConfiguration, acshVar, true, d, acsuVar.c().a(instantMessageConfiguration, d), acsuVar.b.b());
            this.f.put(l, i);
            this.n.execute(i);
            return new FileTransferServiceResult(j, str3, 0, "HTTP FT resume pending", str2);
        }
        throw new IllegalArgumentException("Attempting to resume upload with a pending download: ".concat(pendingTransferInfo.toString()));
    }

    private final FileTransferServiceResult y(String str, String str2, long j, FileTransferInfo fileTransferInfo, armf armfVar, long j2) {
        if (!this.c.i()) {
            return new FileTransferServiceResult(j, null, 4, "Not registered to RCS");
        }
        acug acugVar = (acug) armfVar.b();
        if (fileTransferInfo.f == -1) {
            fileTransferInfo.f = actt.a(fileTransferInfo.a(), this.b.getContentResolver());
        }
        String uuid = UUID.randomUUID().toString();
        z(j, str, -1L, uuid, str2, fileTransferInfo);
        advr.c("sending file [%s], session ID = %d, file ID = %s, TID = %s", fileTransferInfo, Long.valueOf(j), str2, uuid);
        acsx b = this.m.b(j, str2, uuid, fileTransferInfo, this.q, acugVar);
        this.n.execute(b);
        this.f.put(Long.toString(j), b);
        return new FileTransferServiceResult(j, j2, null, 0, "HTTP FT Pending", str2);
    }

    private final void z(long j, String str, long j2, String str2, String str3, FileTransferInfo fileTransferInfo) {
        A(j, new PendingTransferInfo(str, j2, str2, str3, fileTransferInfo));
    }

    @Override // defpackage.acrz
    public final PendingTransferInfo a(String str) {
        Serializable serializable;
        adut adutVar = this.p;
        synchronized (adutVar) {
            adutVar.d();
            serializable = (Serializable) adutVar.d.get(str);
            if (serializable == null) {
                serializable = null;
            }
        }
        return (PendingTransferInfo) serializable;
    }

    public final PendingTransferInfo b(String str) {
        adut adutVar = this.p;
        PendingTransferInfo a2 = a(str);
        adutVar.f(str);
        return a2;
    }

    @Override // defpackage.acue
    public final FileDownloadResult c(FileDownloadRequest fileDownloadRequest) {
        return w(UUID.randomUUID().toString(), fileDownloadRequest.b(), fileDownloadRequest.a());
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult d(long j) {
        Long valueOf = Long.valueOf(j);
        advr.c("Accept file for session ID %d", valueOf);
        HashMap hashMap = this.f;
        String l = Long.toString(j);
        acuh acuhVar = (acuh) hashMap.get(l);
        if (acuhVar != null) {
            if (acuhVar instanceof acsx) {
                return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
            }
            advr.c("Download already in progress for session ID %s, ignoring", valueOf);
            return new FileTransferServiceResult(j, null, 0, "HTTP FT already downloading");
        }
        PendingTransferInfo a2 = a(l);
        if (a2 == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (a2.mType != PendingTransferInfo.Type.UPLOAD) {
            HttpFileTransferPushMessage httpFileTransferPushMessage = a2.mPushMessage;
            FileInfo fileInfo = httpFileTransferPushMessage.mFileInfo;
            if (q((int) fileInfo.mSize)) {
                advr.c("Not enough space available. Rejecting", new Object[0]);
                h(j);
                return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 4, "Not enough space on the device.");
            }
            if (fileInfo.c()) {
                advr.c("File transfer has expired.", new Object[0]);
                h(j);
                return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 3, "HTTP file transfer has expired.");
            }
            acsp a3 = this.m.a(j, httpFileTransferPushMessage.mFileId, this.q, new acsc(this, this.b, this.e, httpFileTransferPushMessage, j), fileInfo.mUrl, Optional.ofNullable(fileInfo.mFileName), (int) fileInfo.mSize);
            this.n.execute(a3);
            this.f.put(l, a3);
            return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 0, "HTTP FT downloading");
        }
        return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult e(long j) {
        if (this.f.containsKey(Long.toString(j))) {
            Long valueOf = Long.valueOf(j);
            advr.c("Terminating ongoing file transfer due to deletion request, file transfer session ID = %d", valueOf);
            advr.c("Cancelling file transfer, session ID: %d", valueOf);
            String l = Long.toString(j);
            acuh acuhVar = (acuh) this.f.remove(l);
            if (acuhVar == null) {
                return h(j);
            }
            b(l);
            acuhVar.a();
            return new FileTransferServiceResult(j, null, 0, "HTTP FT terminating");
        }
        String l2 = Long.toString(j);
        this.g.a(l2);
        PendingTransferInfo b = b(l2);
        if (b == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        return new FileTransferServiceResult(j, b.mRemoteParty, 0, "File transfer deleted");
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult f(long j) {
        advr.c("Pausing file transfer for session ID %d", Long.valueOf(j));
        acuh acuhVar = (acuh) this.f.remove(Long.toString(j));
        if (acuhVar == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        acuhVar.a();
        return new FileTransferServiceResult(j, null, 0, "Pausing HTTP FT");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0149 A[Catch: IllegalStateException -> 0x01fb, IOException | IllegalStateException -> 0x01fd, TryCatch #3 {IOException | IllegalStateException -> 0x01fd, blocks: (B:3:0x0014, B:5:0x005f, B:8:0x006c, B:11:0x0075, B:22:0x00b9, B:25:0x010f, B:27:0x0118, B:29:0x0137, B:31:0x0149, B:32:0x0151, B:34:0x015b, B:36:0x0161, B:37:0x0166, B:39:0x016a, B:40:0x0173, B:42:0x0180, B:44:0x019b, B:45:0x01ae, B:47:0x01b4, B:48:0x01bd, B:49:0x01ee, B:53:0x0122, B:55:0x0128, B:57:0x00fa, B:59:0x0102), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015b A[Catch: IllegalStateException -> 0x01fb, IOException | IllegalStateException -> 0x01fd, TryCatch #3 {IOException | IllegalStateException -> 0x01fd, blocks: (B:3:0x0014, B:5:0x005f, B:8:0x006c, B:11:0x0075, B:22:0x00b9, B:25:0x010f, B:27:0x0118, B:29:0x0137, B:31:0x0149, B:32:0x0151, B:34:0x015b, B:36:0x0161, B:37:0x0166, B:39:0x016a, B:40:0x0173, B:42:0x0180, B:44:0x019b, B:45:0x01ae, B:47:0x01b4, B:48:0x01bd, B:49:0x01ee, B:53:0x0122, B:55:0x0128, B:57:0x00fa, B:59:0x0102), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a A[Catch: IllegalStateException -> 0x01fb, IOException | IllegalStateException -> 0x01fd, TryCatch #3 {IOException | IllegalStateException -> 0x01fd, blocks: (B:3:0x0014, B:5:0x005f, B:8:0x006c, B:11:0x0075, B:22:0x00b9, B:25:0x010f, B:27:0x0118, B:29:0x0137, B:31:0x0149, B:32:0x0151, B:34:0x015b, B:36:0x0161, B:37:0x0166, B:39:0x016a, B:40:0x0173, B:42:0x0180, B:44:0x019b, B:45:0x01ae, B:47:0x01b4, B:48:0x01bd, B:49:0x01ee, B:53:0x0122, B:55:0x0128, B:57:0x00fa, B:59:0x0102), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180 A[Catch: IllegalStateException -> 0x01fb, IOException | IllegalStateException -> 0x01fd, TryCatch #3 {IOException | IllegalStateException -> 0x01fd, blocks: (B:3:0x0014, B:5:0x005f, B:8:0x006c, B:11:0x0075, B:22:0x00b9, B:25:0x010f, B:27:0x0118, B:29:0x0137, B:31:0x0149, B:32:0x0151, B:34:0x015b, B:36:0x0161, B:37:0x0166, B:39:0x016a, B:40:0x0173, B:42:0x0180, B:44:0x019b, B:45:0x01ae, B:47:0x01b4, B:48:0x01bd, B:49:0x01ee, B:53:0x0122, B:55:0x0128, B:57:0x00fa, B:59:0x0102), top: B:2:0x0014 }] */
    @Override // defpackage.acue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult g(java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, boolean r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acry.g(java.lang.String, java.lang.String, java.lang.String, long, boolean, byte[]):com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult");
    }

    public final FileTransferServiceResult h(long j) {
        advr.c("Reject file for session ID %d", Long.valueOf(j));
        PendingTransferInfo a2 = a(Long.toString(j));
        if (a2 == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (a2.mType == PendingTransferInfo.Type.UPLOAD) {
            return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
        }
        HttpFileTransferPushMessage httpFileTransferPushMessage = a2.mPushMessage;
        this.d.c(new FileTransferEvent(20013, j, 4L, httpFileTransferPushMessage.mFileId), advy.HTTP_FILE_TRANSFER_PROVIDER);
        return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 0, "HTTP FT rejected");
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult i(long j) {
        acsf e;
        ChatSessionServiceResult e2;
        Long valueOf = Long.valueOf(j);
        advr.c("Resuming file for session ID %d", valueOf);
        if (this.c.i()) {
            String l = Long.toString(j);
            this.g.a(l);
            PendingTransferInfo a2 = a(l);
            if (a2 == null) {
                advr.k("File transfer for session ID %d not found", valueOf);
                return new FileTransferServiceResult(j, null, 9, "Session not found");
            }
            if (a2.mType != PendingTransferInfo.Type.DOWNLOAD) {
                if (a2.uploadPushMessageData != null) {
                    HttpFileTransferPushMessage httpFileTransferPushMessage = a2.mPushMessage;
                    if (httpFileTransferPushMessage != null && !httpFileTransferPushMessage.mFileInfo.c()) {
                        String str = a2.mRemoteParty;
                        long j2 = a2.mGroupSessionId;
                        String str2 = a2.mFileId;
                        byte[] bArr = a2.uploadPushMessageData;
                        boolean a3 = a2.a();
                        acrx acrxVar = new acrx(this, j, str2);
                        int subscribe = this.d.a.subscribe(5, acrxVar);
                        acrxVar.a = subscribe;
                        if (a3) {
                            e2 = this.c.d(j2, str2, "application/vnd.gsma.rcs-ft-http+xml", bArr);
                        } else {
                            e2 = this.c.e(str, bArr, "application/vnd.gsma.rcs-ft-http+xml", str2);
                        }
                        if (e2.getCode() != 0) {
                            this.d.d(subscribe);
                        }
                        return new FileTransferServiceResult(j, str, e2.getCode(), e2.getDescription());
                    }
                    String l2 = Long.toString(j);
                    this.f.remove(l2);
                    b(l2);
                    return new FileTransferServiceResult(j, null, 9, "File transfer XML has expired");
                }
                String str3 = a2.mTransactionId;
                String str4 = a2.mFileId;
                String str5 = a2.mRemoteParty;
                if (a2.a()) {
                    advr.c("Resuming file upload to group, group session ID = %d, file transfer session ID = %s, file ID = %s, TID = %s", Long.valueOf(a2.mGroupSessionId), valueOf, str4, str3);
                    e = acsf.d(this, this.b, this.c, j, a2.mGroupSessionId, this.e, this.d, str4);
                } else {
                    advr.c("Resuming file upload, session ID = %d file ID = %s, TID = %s", valueOf, str4, str3);
                    e = acsf.e(this, this.b, this.c, j, this.c.a(str5), str5, this.e, this.d, str4, s(str5));
                }
                return x(j, a2, e);
            }
            return d(j);
        }
        advr.k("Resuming file for session ID %d failed since devices is not registered to RCS", valueOf);
        return new FileTransferServiceResult(j, null, 4, "Not registered to RCS");
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult j(long j) {
        acsh acshVar;
        Long valueOf = Long.valueOf(j);
        advr.c("Resuming upload for session ID %d", valueOf);
        adve adveVar = this.g;
        String l = Long.toString(j);
        adveVar.a(l);
        PendingTransferInfo a2 = a(l);
        if (a2 == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (a2.mType != PendingTransferInfo.Type.DOWNLOAD) {
            String str = a2.mTransactionId;
            String str2 = a2.mFileId;
            if (a2.a()) {
                advr.c("Resuming file upload to group, group session ID = %d, file transfer session ID = %d, file ID = %s, TID = %s", Long.valueOf(a2.mGroupSessionId), valueOf, str2, str);
                Context context = this.b;
                acts actsVar = this.e;
                aomk aomkVar = new aomk();
                aomkVar.e(true);
                aomkVar.f(false);
                acshVar = new acsh(context, actsVar, aomkVar.d(), this, j, str2);
            } else {
                advr.c("Resuming file upload, session ID = %d, file ID = %s, TID = %s", valueOf, str2, str);
                Context context2 = this.b;
                acts actsVar2 = this.e;
                aomk aomkVar2 = new aomk();
                aomkVar2.e(true);
                aomkVar2.f(s(a2.mRemoteParty));
                acshVar = new acsh(context2, actsVar2, aomkVar2.d(), this, j, str2);
            }
            return x(j, a2, acshVar);
        }
        return new FileTransferServiceResult(j, null, 12, "Attempted to resume upload of an incoming file");
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult k(final String str, final String str2, final long j, FileTransferInfo fileTransferInfo) {
        final long a2 = this.c.a(str);
        return y(str, str2, j, fileTransferInfo, new armf() { // from class: acrw
            @Override // defpackage.armf, defpackage.arme
            public final Object b() {
                acry acryVar = acry.this;
                Context context = acryVar.b;
                String str3 = str;
                acts actsVar = acryVar.e;
                acnj acnjVar = acryVar.c;
                acrm acrmVar = acryVar.d;
                return acsf.e(acryVar, context, acnjVar, j, a2, str3, actsVar, acrmVar, str2, acryVar.s(str3));
            }
        }, a2);
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult l(final String str, final String str2, final long j, FileTransferInfo fileTransferInfo) {
        return y("", str2, j, fileTransferInfo, new armf() { // from class: acrv
            @Override // defpackage.armf, defpackage.arme
            public final Object b() {
                aomk aomkVar = new aomk();
                aomkVar.e(true);
                acry acryVar = acry.this;
                aomkVar.f(acryVar.s(str));
                return new acsh(acryVar.b, acryVar.e, aomkVar.d(), acryVar, j, str2);
            }
        }, -1L);
    }

    @Override // defpackage.acue
    public final PauseDownloadResult m(PauseDownloadRequest pauseDownloadRequest) {
        HashMap hashMap = this.f;
        String a2 = pauseDownloadRequest.a();
        acuh acuhVar = (acuh) hashMap.remove(a2);
        if (acuhVar == null) {
            advr.q("Unable to pause download. No active download runnable. Download ID: %s", a2);
            adtg adtgVar = new adtg();
            adtgVar.j(FileTransferResult.b);
            return adtgVar.i();
        }
        advr.c("Pausing file download for download ID: %s", a2);
        acuhVar.a();
        adtg adtgVar2 = new adtg();
        adtgVar2.j(FileTransferResult.a);
        return adtgVar2.i();
    }

    @Override // defpackage.acue
    public final ResumeDownloadResult n(ResumeDownloadRequest resumeDownloadRequest) {
        HashMap hashMap = this.f;
        String c = resumeDownloadRequest.c();
        acuh acuhVar = (acuh) hashMap.get(c);
        if (acuhVar != null) {
            if (acuhVar.j) {
                advr.q("Attempting to resume a file download but there is still an ongoing download runnable that will be cancelled in the near future.", new Object[0]);
            }
            advr.c("File download is already in progress. No need to resume. Download ID: %s", c);
            adtg adtgVar = new adtg();
            adtgVar.h(FileTransferResult.a);
            return adtgVar.g();
        }
        advr.c("Resuming file download for download ID: %s", c);
        w(c, resumeDownloadRequest.b(), resumeDownloadRequest.a());
        adtg adtgVar2 = new adtg();
        adtgVar2.h(FileTransferResult.a);
        return adtgVar2.g();
    }

    @Override // defpackage.acrz
    public final void o(String str) {
        this.f.remove(str);
        b(str);
    }

    public final void p(adqu adquVar, String str, long j, boolean z) {
        String str2;
        advr.c("Received incoming HTTP file transfer push message!", new Object[0]);
        byte[] bArr = adquVar.f;
        try {
            advr.c("%s", HttpFileTransferPushMessage.a(bArr).toString());
            String str3 = adquVar.e;
            if (!Objects.isNull(adquVar)) {
                str2 = adquVar.k;
            } else {
                str2 = null;
            }
            if (Objects.isNull(str2)) {
                str2 = agkx.ah();
                advr.q("message.getId() was not available, generating new file id=%s", str2);
            }
            g(str2, str, str3, j, z, bArr);
        } catch (IOException e) {
            advr.i(e, "Unable to parse HTTP FT push message", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [yjf, java.lang.Object] */
    @Override // defpackage.acue
    public final boolean q(int i) {
        String e;
        adih adihVar = this.l;
        if (adihVar.a.n()) {
            e = Environment.getExternalStorageDirectory().getPath();
        } else {
            e = adihVar.e();
        }
        long j = i;
        StatFs statFs = new StatFs(e);
        if (j > statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.acue
    public final boolean r(adst adstVar) {
        if (TextUtils.isEmpty(this.q.mFtHttpContentServerUri) || adstVar != adst.FILE_TRANSFER) {
            return false;
        }
        return true;
    }

    public final boolean s(String str) {
        ImsCapabilities c = this.j.c(str);
        if (c != null && c.B()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.acue
    public final long[] t() {
        return adom.p((Collection) Collection.EL.stream(this.f.keySet()).map(new acpr(8)).collect(Collectors.toList()));
    }

    @Override // defpackage.adjr
    public final void u(Configuration configuration) {
        this.q = configuration.mInstantMessageConfiguration;
    }

    @Override // defpackage.acue
    public final FileTransferServiceResult[] v(long j, String str, FileTransferInfo fileTransferInfo) {
        if (!this.c.i()) {
            return actt.i(4, "Not registered to RCS");
        }
        if (((Boolean) a.a()).booleanValue() && j <= 0) {
            advr.c("Failed to send a file since the group id (%d) is invalid", Long.valueOf(j));
            return actt.i(9, "Invalid groupChatSessionId");
        }
        if (fileTransferInfo.f == -1) {
            fileTransferInfo.f = actt.a(fileTransferInfo.a(), this.b.getContentResolver());
        }
        String uuid = UUID.randomUUID().toString();
        long registerSession = this.k.registerSession((acue) this);
        z(registerSession, " ", j, uuid, str, fileTransferInfo);
        advr.c("Sending file to group, group session ID = %d, file transfer session ID = %d, file ID = %s, TID = %s", Long.valueOf(j), Long.valueOf(registerSession), str, uuid);
        acsx b = this.m.b(registerSession, str, uuid, fileTransferInfo, this.q, acsf.d(this, this.b, this.c, registerSession, j, this.e, this.d, str));
        this.n.execute(b);
        this.f.put(Long.toString(registerSession), b);
        return new FileTransferServiceResult[]{new FileTransferServiceResult(registerSession, " ", 0, "HTTP FT Pending", str)};
    }
}
