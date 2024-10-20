package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
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
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForwardingFileTransferBinder extends IFileTransfer.Stub implements adud<IFileTransfer> {
    private IFileTransfer a;
    private final Context b;

    public ForwardingFileTransferBinder(Context context) {
        this.b = context;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult acceptFileTransferRequest(long j) {
        return ((IFileTransfer) getDelegate()).acceptFileTransferRequest(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult cancelFileTransfer(long j) {
        return ((IFileTransfer) getDelegate()).cancelFileTransfer(j);
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult deleteFileTransfer(long j) {
        return ((IFileTransfer) getDelegate()).deleteFileTransfer(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) {
        return ((IFileTransfer) getDelegate()).downloadFile(fileDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public long[] getActiveFileTransferSessions() {
        return ((IFileTransfer) getDelegate()).getActiveFileTransferSessions();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public long[] getActiveImageSharingSessions() {
        return ((IFileTransfer) getDelegate()).getActiveImageSharingSessions();
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public String getFileTransferOption() {
        return ((IFileTransfer) getDelegate()).getFileTransferOption();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferState getFileTransferState(long j) {
        return ((IFileTransfer) getDelegate()).getFileTransferState(j);
    }

    @Override // defpackage.adud
    public synchronized IFileTransfer getInterface() {
        return this.a;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public long[] getResumeableSessions() {
        return ((IFileTransfer) getDelegate()).getResumeableSessions();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public boolean isResumeable(long j) {
        return ((IFileTransfer) getDelegate()).isResumeable(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) {
        return ((IFileTransfer) getDelegate()).pauseDownload(pauseDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult pauseFileTransfer(long j) {
        return ((IFileTransfer) getDelegate()).pauseFileTransfer(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult rejectFileTransferRequest(long j) {
        return ((IFileTransfer) getDelegate()).rejectFileTransferRequest(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) {
        return ((IFileTransfer) getDelegate()).resumeDownload(resumeDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeFileTransfer(long j) {
        return ((IFileTransfer) getDelegate()).resumeFileTransfer(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeUploadToContentServer(long j) {
        return ((IFileTransfer) getDelegate()).resumeUploadToContentServer(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) {
        return ((IFileTransfer) getDelegate()).sendFileTransferRequest(str, str2, fileTransferInfo);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo) {
        return ((IFileTransfer) getDelegate()).sendGroupFileTransferRequest(j, str, fileTransferInfo);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo) {
        return ((IFileTransfer) getDelegate()).sendImageSharingRequest(str, fileTransferInfo);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (IFileTransfer) iBinder;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr) {
        return ((IFileTransfer) getDelegate()).startNewIncomingFileTransfer(str, str2, str3, j, z, bArr);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo) {
        return ((IFileTransfer) getDelegate()).uploadToContentServer(str, str2, fileTransferInfo);
    }
}
