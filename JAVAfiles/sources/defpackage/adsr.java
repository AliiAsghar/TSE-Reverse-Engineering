package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsr extends ResumeDownloadResult {
    private final FileTransferResult a;

    public adsr(FileTransferResult fileTransferResult) {
        this.a = fileTransferResult;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult
    public final FileTransferResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResumeDownloadResult) {
            return this.a.equals(((ResumeDownloadResult) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ResumeDownloadResult{result=" + this.a.toString() + "}";
    }
}
