package com.google.android.ims.rcsservice.filetransfer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IFileTransfer extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IFileTransfer {
        static final int TRANSACTION_acceptFileTransferRequest = 5;
        static final int TRANSACTION_cancelFileTransfer = 4;
        static final int TRANSACTION_deleteFileTransfer = 14;
        static final int TRANSACTION_downloadFile = 19;
        static final int TRANSACTION_getActiveFileTransferSessions = 1;
        static final int TRANSACTION_getActiveImageSharingSessions = 2;
        static final int TRANSACTION_getFileTransferOption = 7;
        static final int TRANSACTION_getFileTransferState = 3;
        static final int TRANSACTION_getResumeableSessions = 16;
        static final int TRANSACTION_isResumeable = 17;
        static final int TRANSACTION_pauseDownload = 20;
        static final int TRANSACTION_pauseFileTransfer = 11;
        static final int TRANSACTION_rejectFileTransferRequest = 6;
        static final int TRANSACTION_resumeDownload = 21;
        static final int TRANSACTION_resumeFileTransfer = 12;
        static final int TRANSACTION_resumeUploadToContentServer = 13;
        static final int TRANSACTION_sendFileTransferRequest = 8;
        static final int TRANSACTION_sendGroupFileTransferRequest = 15;
        static final int TRANSACTION_sendImageSharingRequest = 10;
        static final int TRANSACTION_startNewIncomingFileTransfer = 18;
        static final int TRANSACTION_uploadToContentServer = 9;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IFileTransfer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.filetransfer.IFileTransfer");
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult acceptFileTransferRequest(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult cancelFileTransfer(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult deleteFileTransfer(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, fileDownloadRequest);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                FileDownloadResult fileDownloadResult = (FileDownloadResult) iax.a(transactAndReadException, FileDownloadResult.CREATOR);
                transactAndReadException.recycle();
                return fileDownloadResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public long[] getActiveFileTransferSessions() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                long[] createLongArray = transactAndReadException.createLongArray();
                transactAndReadException.recycle();
                return createLongArray;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public long[] getActiveImageSharingSessions() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                long[] createLongArray = transactAndReadException.createLongArray();
                transactAndReadException.recycle();
                return createLongArray;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public String getFileTransferOption() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferState getFileTransferState(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                FileTransferState fileTransferState = (FileTransferState) iax.a(transactAndReadException, FileTransferState.CREATOR);
                transactAndReadException.recycle();
                return fileTransferState;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public long[] getResumeableSessions() {
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                long[] createLongArray = transactAndReadException.createLongArray();
                transactAndReadException.recycle();
                return createLongArray;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public boolean isResumeable(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pauseDownloadRequest);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                PauseDownloadResult pauseDownloadResult = (PauseDownloadResult) iax.a(transactAndReadException, PauseDownloadResult.CREATOR);
                transactAndReadException.recycle();
                return pauseDownloadResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult pauseFileTransfer(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult rejectFileTransferRequest(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, resumeDownloadRequest);
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken);
                ResumeDownloadResult resumeDownloadResult = (ResumeDownloadResult) iax.a(transactAndReadException, ResumeDownloadResult.CREATOR);
                transactAndReadException.recycle();
                return resumeDownloadResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult resumeFileTransfer(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult resumeUploadToContentServer(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
                FileTransferServiceResult[] fileTransferServiceResultArr = (FileTransferServiceResult[]) transactAndReadException.createTypedArray(FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResultArr;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeLong(j);
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) iax.a(transactAndReadException, FileTransferServiceResult.CREATOR);
                transactAndReadException.recycle();
                return fileTransferServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.filetransfer.IFileTransfer");
        }

        public static IFileTransfer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.filetransfer.IFileTransfer");
            if (queryLocalInterface instanceof IFileTransfer) {
                return (IFileTransfer) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    long[] activeFileTransferSessions = getActiveFileTransferSessions();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(activeFileTransferSessions);
                    return true;
                case 2:
                    long[] activeImageSharingSessions = getActiveImageSharingSessions();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(activeImageSharingSessions);
                    return true;
                case 3:
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferState fileTransferState = getFileTransferState(readLong);
                    parcel2.writeNoException();
                    iax.e(parcel2, fileTransferState);
                    return true;
                case 4:
                    long readLong2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult cancelFileTransfer = cancelFileTransfer(readLong2);
                    parcel2.writeNoException();
                    iax.e(parcel2, cancelFileTransfer);
                    return true;
                case 5:
                    long readLong3 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult acceptFileTransferRequest = acceptFileTransferRequest(readLong3);
                    parcel2.writeNoException();
                    iax.e(parcel2, acceptFileTransferRequest);
                    return true;
                case 6:
                    long readLong4 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult rejectFileTransferRequest = rejectFileTransferRequest(readLong4);
                    parcel2.writeNoException();
                    iax.e(parcel2, rejectFileTransferRequest);
                    return true;
                case 7:
                    String fileTransferOption = getFileTransferOption();
                    parcel2.writeNoException();
                    parcel2.writeString(fileTransferOption);
                    return true;
                case 8:
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    FileTransferInfo fileTransferInfo = (FileTransferInfo) iax.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult sendFileTransferRequest = sendFileTransferRequest(readString, readString2, fileTransferInfo);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendFileTransferRequest);
                    return true;
                case 9:
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    FileTransferInfo fileTransferInfo2 = (FileTransferInfo) iax.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult uploadToContentServer = uploadToContentServer(readString3, readString4, fileTransferInfo2);
                    parcel2.writeNoException();
                    iax.e(parcel2, uploadToContentServer);
                    return true;
                case 10:
                    String readString5 = parcel.readString();
                    FileTransferInfo fileTransferInfo3 = (FileTransferInfo) iax.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult sendImageSharingRequest = sendImageSharingRequest(readString5, fileTransferInfo3);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendImageSharingRequest);
                    return true;
                case 11:
                    long readLong5 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult pauseFileTransfer = pauseFileTransfer(readLong5);
                    parcel2.writeNoException();
                    iax.e(parcel2, pauseFileTransfer);
                    return true;
                case 12:
                    long readLong6 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult resumeFileTransfer = resumeFileTransfer(readLong6);
                    parcel2.writeNoException();
                    iax.e(parcel2, resumeFileTransfer);
                    return true;
                case 13:
                    long readLong7 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult resumeUploadToContentServer = resumeUploadToContentServer(readLong7);
                    parcel2.writeNoException();
                    iax.e(parcel2, resumeUploadToContentServer);
                    return true;
                case 14:
                    long readLong8 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult deleteFileTransfer = deleteFileTransfer(readLong8);
                    parcel2.writeNoException();
                    iax.e(parcel2, deleteFileTransfer);
                    return true;
                case 15:
                    long readLong9 = parcel.readLong();
                    String readString6 = parcel.readString();
                    FileTransferInfo fileTransferInfo4 = (FileTransferInfo) iax.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult[] sendGroupFileTransferRequest = sendGroupFileTransferRequest(readLong9, readString6, fileTransferInfo4);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(sendGroupFileTransferRequest, 1);
                    return true;
                case 16:
                    long[] resumeableSessions = getResumeableSessions();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(resumeableSessions);
                    return true;
                case 17:
                    long readLong10 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    boolean isResumeable = isResumeable(readLong10);
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isResumeable ? 1 : 0);
                    return true;
                case 18:
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    long readLong11 = parcel.readLong();
                    boolean g = iax.g(parcel);
                    byte[] createByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult startNewIncomingFileTransfer = startNewIncomingFileTransfer(readString7, readString8, readString9, readLong11, g, createByteArray);
                    parcel2.writeNoException();
                    iax.e(parcel2, startNewIncomingFileTransfer);
                    return true;
                case 19:
                    FileDownloadRequest fileDownloadRequest = (FileDownloadRequest) iax.a(parcel, FileDownloadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileDownloadResult downloadFile = downloadFile(fileDownloadRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, downloadFile);
                    return true;
                case 20:
                    PauseDownloadRequest pauseDownloadRequest = (PauseDownloadRequest) iax.a(parcel, PauseDownloadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PauseDownloadResult pauseDownload = pauseDownload(pauseDownloadRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, pauseDownload);
                    return true;
                case 21:
                    ResumeDownloadRequest resumeDownloadRequest = (ResumeDownloadRequest) iax.a(parcel, ResumeDownloadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    ResumeDownloadResult resumeDownload = resumeDownload(resumeDownloadRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, resumeDownload);
                    return true;
                default:
                    return false;
            }
        }
    }

    FileTransferServiceResult acceptFileTransferRequest(long j);

    FileTransferServiceResult cancelFileTransfer(long j);

    FileTransferServiceResult deleteFileTransfer(long j);

    FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest);

    long[] getActiveFileTransferSessions();

    long[] getActiveImageSharingSessions();

    String getFileTransferOption();

    FileTransferState getFileTransferState(long j);

    long[] getResumeableSessions();

    boolean isResumeable(long j);

    PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest);

    FileTransferServiceResult pauseFileTransfer(long j);

    FileTransferServiceResult rejectFileTransferRequest(long j);

    ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest);

    FileTransferServiceResult resumeFileTransfer(long j);

    FileTransferServiceResult resumeUploadToContentServer(long j);

    FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo);

    FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo);

    FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo);

    FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr);

    FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo);
}
