package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface acue {
    FileDownloadResult c(FileDownloadRequest fileDownloadRequest);

    FileTransferServiceResult d(long j);

    FileTransferServiceResult e(long j);

    FileTransferServiceResult f(long j);

    FileTransferServiceResult g(String str, String str2, String str3, long j, boolean z, byte[] bArr);

    FileTransferServiceResult i(long j);

    FileTransferServiceResult j(long j);

    FileTransferServiceResult k(String str, String str2, long j, FileTransferInfo fileTransferInfo);

    FileTransferServiceResult l(String str, String str2, long j, FileTransferInfo fileTransferInfo);

    PauseDownloadResult m(PauseDownloadRequest pauseDownloadRequest);

    ResumeDownloadResult n(ResumeDownloadRequest resumeDownloadRequest);

    boolean q(int i);

    boolean r(adst adstVar);

    long[] t();

    FileTransferServiceResult[] v(long j, String str, FileTransferInfo fileTransferInfo);
}
