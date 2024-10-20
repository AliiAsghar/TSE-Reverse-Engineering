package com.google.android.rcs.client.filetransfer;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import defpackage.advr;
import defpackage.adwi;
import defpackage.ajnv;
import defpackage.ajnw;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.apfi;
import defpackage.uuf;
import defpackage.uuh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FileTransferService extends ajnv<IFileTransfer> {
    private static final uuf j = uuh.q(178973012);
    static final uuf h = uuh.r(183913756, "check_for_null_pause_download_result");
    static final uuf i = uuh.r(183913756, "check_for_null_resume_download_result");

    public FileTransferService(Context context, ajoa ajoaVar, Optional<ajnw> optional) {
        super(IFileTransfer.class, context, ajoaVar, 1, optional);
    }

    public FileTransferServiceResult acceptFileTransferRequest(long j2) {
        b();
        try {
            return ((IFileTransfer) a()).acceptFileTransferRequest(j2);
        } catch (Exception e) {
            advr.i(e, "Error while accepting file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileTransferServiceResult deleteFileTransfer(long j2) {
        b();
        try {
            return ((IFileTransfer) a()).deleteFileTransfer(j2);
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error while deleting file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) {
        b();
        try {
            FileDownloadResult downloadFile = ((IFileTransfer) a()).downloadFile(fileDownloadRequest);
            if (((Boolean) j.e()).booleanValue() && downloadFile == null) {
                throw new ajny("Null DownloadResult returned from downloadFile() IPC.");
            }
            return downloadFile;
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error while downloading new incoming file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "FileTransferServiceVersions";
    }

    @Override // defpackage.ajnv
    public apfi getServiceNameLoggingEnum() {
        return apfi.FILE_TRANSFER_SERVICE;
    }

    public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) {
        b();
        try {
            PauseDownloadResult pauseDownload = ((IFileTransfer) a()).pauseDownload(pauseDownloadRequest);
            if (((Boolean) h.e()).booleanValue() && pauseDownload == null) {
                throw new ajny("Null PauseDownloadResult returned from pauseDownload() IPC.");
            }
            return pauseDownload;
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error while downloading new incoming file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileTransferServiceResult pauseFileTransfer(long j2) {
        b();
        try {
            return ((IFileTransfer) a()).pauseFileTransfer(j2);
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error while pausing file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) {
        b();
        try {
            ResumeDownloadResult resumeDownload = ((IFileTransfer) a()).resumeDownload(resumeDownloadRequest);
            if (((Boolean) i.e()).booleanValue() && resumeDownload == null) {
                throw new ajny("Null ResumeDownloadResult returned from resumeDownload() IPC.");
            }
            return resumeDownload;
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error while downloading new incoming file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileTransferServiceResult resumeFileTransfer(long j2) {
        b();
        try {
            return ((IFileTransfer) a()).resumeFileTransfer(j2);
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error resuming file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileTransferServiceResult resumeUploadToContentServer(long j2) {
        b();
        try {
            return ((IFileTransfer) a()).resumeUploadToContentServer(j2);
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error resuming upload to content server: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) {
        b();
        if (str != null) {
            try {
                return ((IFileTransfer) a()).sendFileTransferRequest(str, str2, fileTransferInfo);
            } catch (Exception e) {
                advr.i(e, "Error while starting filetransfer: ", new Object[0]);
                throw new ajny(e.getMessage());
            }
        }
        throw new IllegalArgumentException("userId MUST NOT be null");
    }

    public FileTransferServiceResult[] sendGroupFileTransferRequest(long j2, String str, FileTransferInfo fileTransferInfo) {
        b();
        try {
            return ((IFileTransfer) a()).sendGroupFileTransferRequest(j2, str, fileTransferInfo);
        } catch (Exception e) {
            advr.i(e, "Error while starting group filetransfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j2, boolean z, byte[] bArr) {
        b();
        if (adwi.k(this.e) && !adwi.g(this.e, getRcsServiceMetaDataKey(), 2)) {
            advr.g("CSApk version does not support incoming file transfer.", new Object[0]);
            return new FileTransferServiceResult(j2, str, 12, "CSApk version does not support incoming file transfer.");
        }
        try {
            return ((IFileTransfer) a()).startNewIncomingFileTransfer(str, str2, str3, j2, z, bArr);
        } catch (RemoteException | IllegalStateException e) {
            advr.i(e, "Error while starting new incoming file transfer: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }

    public FileTransferServiceResult uploadToContentServer(String str, FileTransferInfo fileTransferInfo) {
        b();
        try {
            return ((IFileTransfer) a()).uploadToContentServer("unused-user-id", str, fileTransferInfo);
        } catch (Exception e) {
            advr.i(e, "Error while starting upload to content server: ", new Object[0]);
            throw new ajny(e.getMessage());
        }
    }
}
