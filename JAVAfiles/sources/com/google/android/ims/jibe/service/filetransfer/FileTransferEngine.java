package com.google.android.ims.jibe.service.filetransfer;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferState;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import defpackage.a;
import defpackage.acoc;
import defpackage.actt;
import defpackage.acue;
import defpackage.acuf;
import defpackage.adsj;
import defpackage.adtw;
import defpackage.aduu;
import defpackage.advr;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apfg;
import defpackage.apfh;
import defpackage.yyb;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileTransferEngine extends IFileTransfer.Stub {
    private static final long[] a = new long[0];
    private final Context b;
    private final aduu c;
    private final adsj d;
    private final acoc e;
    private acue f;

    public FileTransferEngine(Context context, aduu aduuVar, adsj adsjVar, acoc acocVar) {
        this.b = context;
        this.c = aduuVar;
        this.d = adsjVar;
        this.e = acocVar;
    }

    private final long a() {
        return this.d.a();
    }

    private final void b(Optional optional, String str, FileTransferInfo fileTransferInfo) {
        aozy createBuilder = apfg.a.createBuilder();
        int aR = yyb.aR(fileTransferInfo.f);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apfg apfgVar = (apfg) createBuilder.b;
        apfgVar.c = a.aq(aR);
        apfgVar.b |= 1;
        apfg apfgVar2 = (apfg) createBuilder.s();
        aozy createBuilder2 = apfh.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apfh apfhVar = (apfh) apagVar;
        apfhVar.e = 2;
        apfhVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        apfh apfhVar2 = (apfh) apagVar2;
        str.getClass();
        apfhVar2.b |= 4;
        apfhVar2.g = str;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apfh apfhVar3 = (apfh) createBuilder2.b;
        apfgVar2.getClass();
        apfhVar3.d = apfgVar2;
        apfhVar3.c = 102;
        if (optional.isPresent()) {
            String obj = optional.get().toString();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apfh apfhVar4 = (apfh) createBuilder2.b;
            apfhVar4.b |= 2;
            apfhVar4.f = obj;
        }
        this.e.e(this.b, (apfh) createBuilder2.s());
    }

    private static boolean c(acue acueVar) {
        if (!Objects.isNull(acueVar)) {
            return false;
        }
        advr.q("FileTransferEngine#fileTransferProvider is null", new Object[0]);
        return true;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult acceptFileTransferRequest(long j) {
        adtw.d(this.b, Binder.getCallingUid());
        advr.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "REQUEST ACCEPTED");
        acue acueVar = this.f;
        if (c(acueVar)) {
            return new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null");
        }
        return acueVar.d(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult cancelFileTransfer(long j) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult deleteFileTransfer(long j) {
        adtw.d(this.b, Binder.getCallingUid());
        advr.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "DELETED");
        acue acueVar = this.f;
        if (c(acueVar)) {
            return new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null");
        }
        return acueVar.e(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) {
        if (!c(this.f)) {
            if (!this.f.q(fileDownloadRequest.b().a())) {
                return this.f.c(fileDownloadRequest);
            }
            throw new acuf("Not enough space available.");
        }
        throw new acuf("File transfer provider is not initialized.");
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public long[] getActiveFileTransferSessions() {
        adtw.d(this.b, Binder.getCallingUid());
        return getActiveSessions();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public long[] getActiveImageSharingSessions() {
        return a;
    }

    public long[] getActiveSessions() {
        acue acueVar = this.f;
        if (c(acueVar)) {
            return a;
        }
        return acueVar.t();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public String getFileTransferOption() {
        return "";
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferState getFileTransferState(long j) {
        return null;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public long[] getResumeableSessions() {
        return a;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public boolean isResumeable(long j) {
        return false;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) {
        if (!c(this.f)) {
            return this.f.m(pauseDownloadRequest);
        }
        throw new acuf("File transfer provider is not initialized.");
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult pauseFileTransfer(long j) {
        adtw.d(this.b, Binder.getCallingUid());
        advr.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "PAUSED");
        acue acueVar = this.f;
        if (c(acueVar)) {
            return new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null");
        }
        return acueVar.f(j);
    }

    public void registerProvider(acue acueVar) {
        if (acueVar == null) {
            advr.q("FileTransferEngineProvider initialized with null value", new Object[0]);
        }
        this.f = acueVar;
    }

    public long registerSession(acue acueVar) {
        return a();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult rejectFileTransferRequest(long j) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) {
        if (!c(this.f)) {
            if (!this.f.q(resumeDownloadRequest.b().a())) {
                return this.f.n(resumeDownloadRequest);
            }
            throw new acuf("Not enough space available.");
        }
        throw new acuf("File transfer provider is not initialized.");
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeFileTransfer(long j) {
        adtw.d(this.b, Binder.getCallingUid());
        advr.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "RESUMED");
        acue acueVar = this.f;
        if (c(acueVar)) {
            return new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null");
        }
        return acueVar.i(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeUploadToContentServer(long j) {
        adtw.d(this.b, Binder.getCallingUid());
        advr.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "UPLOAD RESUMED");
        acue acueVar = this.f;
        if (c(acueVar)) {
            return new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null");
        }
        return acueVar.j(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) {
        b(Optional.empty(), str2, fileTransferInfo);
        adtw.d(this.b, Binder.getCallingUid());
        acue acueVar = this.f;
        if (!c(acueVar) && !this.c.s()) {
            if (!acueVar.r(fileTransferInfo.a)) {
                return new FileTransferServiceResult(-1L, str, 12, "Upload to content server not supported");
            }
            long a2 = a();
            Long valueOf = Long.valueOf(a2);
            advr.k("File Transfer [%d] state change [%s]", valueOf, "CREATED");
            FileTransferServiceResult k = acueVar.k(str, str2, a2, fileTransferInfo);
            if (k.succeeded()) {
                advr.k("File Transfer [%d] state change [%s]", valueOf, "SENT");
            }
            return k;
        }
        return new FileTransferServiceResult(0L, str, 2, "fileTransferProvider is null");
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo) {
        b(Optional.of(Long.valueOf(j)), str, fileTransferInfo);
        adtw.d(this.b, Binder.getCallingUid());
        acue acueVar = this.f;
        if (!c(acueVar)) {
            if (!acueVar.r(fileTransferInfo.a)) {
                return new FileTransferServiceResult[]{new FileTransferServiceResult(-1L, " ", 12, "Upload to content server not supported")};
            }
            FileTransferServiceResult[] v = acueVar.v(j, str, fileTransferInfo);
            for (int i = 0; i <= 0; i++) {
                FileTransferServiceResult fileTransferServiceResult = v[i];
                if (fileTransferServiceResult.succeeded()) {
                    advr.k("File Transfer [%d] state change [%s]", Long.valueOf(fileTransferServiceResult.a), "GROUP REQUEST SENT");
                }
            }
            return v;
        }
        return actt.i(2, "fileTransferProvider is null");
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr) {
        acue acueVar = this.f;
        if (c(acueVar)) {
            return new FileTransferServiceResult(0L, str, 2, "fileTransferProvider is null");
        }
        return acueVar.g(str3, str, str2, j, z, bArr);
    }

    public void unregisterProvider(acue acueVar) {
        advr.c("FileTransferEngineProvider reset to null in unregisterProvider", new Object[0]);
        this.f = null;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo) {
        b(Optional.empty(), str2, fileTransferInfo);
        adtw.d(this.b, Binder.getCallingUid());
        acue acueVar = this.f;
        if (!c(acueVar)) {
            if (!acueVar.r(fileTransferInfo.a)) {
                return new FileTransferServiceResult(-1L, null, 12, "Upload to content server not supported");
            }
            long a2 = a();
            Long valueOf = Long.valueOf(a2);
            advr.k("File Transfer [%d] state change [%s]", valueOf, "CREATED FOR UPLOAD");
            FileTransferServiceResult l = acueVar.l(str, str2, a2, fileTransferInfo);
            if (l.succeeded()) {
                advr.k("File Transfer [%d] state change [%s]", valueOf, "SENT FOR UPLOAD");
            }
            return l;
        }
        return new FileTransferServiceResult(-1L, null, 2, "fileTransferProvider is null");
    }

    public void unregisterSession(long j) {
    }
}
