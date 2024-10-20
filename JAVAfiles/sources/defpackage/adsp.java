package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsp extends PauseDownloadResult {
    private final FileTransferResult a;

    public adsp(FileTransferResult fileTransferResult) {
        this.a = fileTransferResult;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult
    public final FileTransferResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseDownloadResult) {
            return this.a.equals(((PauseDownloadResult) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "PauseDownloadResult{result=" + this.a.toString() + "}";
    }
}
