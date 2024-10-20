package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsm extends FileDownloadResult {
    private final String a;

    public adsm(String str) {
        this.a = str;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.FileDownloadResult
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileDownloadResult) {
            return this.a.equals(((FileDownloadResult) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FileDownloadResult{fileDownloadId=" + this.a + "}";
    }
}
