package defpackage;

import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adso extends PauseDownloadRequest {
    private final String a;

    public adso(String str) {
        this.a = str;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseDownloadRequest) {
            return this.a.equals(((PauseDownloadRequest) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "PauseDownloadRequest{downloadId=" + this.a + "}";
    }
}
