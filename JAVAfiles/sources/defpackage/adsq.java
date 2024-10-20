package defpackage;

import android.app.PendingIntent;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsq extends ResumeDownloadRequest {
    private final PendingIntent a;
    private final String b;
    private final FileInformation c;

    public adsq(PendingIntent pendingIntent, String str, FileInformation fileInformation) {
        this.a = pendingIntent;
        this.b = str;
        this.c = fileInformation;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest
    public final FileInformation b() {
        return this.c;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResumeDownloadRequest) {
            ResumeDownloadRequest resumeDownloadRequest = (ResumeDownloadRequest) obj;
            if (this.a.equals(resumeDownloadRequest.a()) && this.b.equals(resumeDownloadRequest.c()) && this.c.equals(resumeDownloadRequest.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        FileInformation fileInformation = this.c;
        return "ResumeDownloadRequest{intent=" + this.a.toString() + ", downloadId=" + this.b + ", fileInformation=" + fileInformation.toString() + "}";
    }
}
