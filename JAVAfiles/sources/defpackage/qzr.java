package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzr {
    public final boolean a;
    public final int b;
    private final FileTransferServiceResult c;

    public qzr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        FileTransferServiceResult fileTransferServiceResult;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qzr) {
            qzr qzrVar = (qzr) obj;
            if (this.a == qzrVar.a && ((fileTransferServiceResult = this.c) != null ? fileTransferServiceResult.equals(qzrVar.c) : qzrVar.c == null) && this.b == qzrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        FileTransferServiceResult fileTransferServiceResult = this.c;
        if (fileTransferServiceResult == null) {
            hashCode = 0;
        } else {
            hashCode = fileTransferServiceResult.hashCode();
        }
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "AutoDownloadResult{shouldAutoDownload=" + this.a + ", serviceResult=" + String.valueOf(this.c) + ", messageStatus=" + this.b + "}";
    }

    public qzr(boolean z, FileTransferServiceResult fileTransferServiceResult, int i) {
        this.a = z;
        this.c = fileTransferServiceResult;
        this.b = i;
    }
}
