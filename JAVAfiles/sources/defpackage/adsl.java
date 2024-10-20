package defpackage;

import android.app.PendingIntent;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsl extends FileDownloadRequest {
    private final PendingIntent a;
    private final FileInformation b;

    public adsl(PendingIntent pendingIntent, FileInformation fileInformation) {
        this.a = pendingIntent;
        this.b = fileInformation;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest
    public final FileInformation b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileDownloadRequest) {
            FileDownloadRequest fileDownloadRequest = (FileDownloadRequest) obj;
            if (this.a.equals(fileDownloadRequest.a()) && this.b.equals(fileDownloadRequest.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        FileInformation fileInformation = this.b;
        return "FileDownloadRequest{intent=" + this.a.toString() + ", fileInformation=" + fileInformation.toString() + "}";
    }
}
