package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsg extends acse {
    private final long c;
    private final long d;
    private final HttpFileTransferPushMessage e;
    private final int f;
    private final acts g;
    private final String h;

    public acsg(acrz acrzVar, long j, long j2, HttpFileTransferPushMessage httpFileTransferPushMessage, Context context, acts actsVar, String str) {
        super(context, acrzVar);
        this.c = j;
        this.d = j2;
        this.e = httpFileTransferPushMessage;
        this.f = advh.a("Bugle.RcsEngine.FileTransfer.ThumbnailDownload.Duration");
        this.g = actsVar;
        this.h = str;
    }

    @Override // defpackage.acse
    protected final String a() {
        return Long.toString(this.c);
    }

    @Override // defpackage.acug
    public final void b(byte[] bArr, Uri uri) {
        advr.c("Thumbnail download completed for session ID %d, file ID %s. Received %d bytes.", Long.valueOf(this.c), this.h, Integer.valueOf(bArr.length));
        advh.g(this.f);
        actq actqVar = new actq(null);
        actqVar.j(this.e.mSender);
        actqVar.i(this.h);
        actqVar.f(this.e.mFileInfo.mSize);
        actqVar.c(this.e.mFileInfo.mContentType);
        actqVar.h(this.e.mFileInfo.mUrl);
        actqVar.g(this.c);
        actqVar.b(this.d);
        actqVar.l(bArr);
        String str = this.e.mFileInfo.mFileName;
        if (str != null) {
            actqVar.e(str);
        }
        FileInfo fileInfo = this.e.mThumbnailInfo;
        if (fileInfo != null) {
            actqVar.k(fileInfo.mContentType);
        }
        try {
            advz.c(this.a, RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE, this.g.a(actqVar.a()), advy.THUMBNAIL_DOWNLOAD_LISTENER);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof TransactionTooLargeException) {
                advr.i(e, "Failed to notify file transfer preview update: thumbnail is too big.", new Object[0]);
                return;
            }
            throw e;
        }
    }

    @Override // defpackage.acse, defpackage.acug
    public final void c(acrt acrtVar) {
        super.c(acrtVar);
        advh.c(this.f);
        advh.d("Bugle.RcsEngine.FileTransfer.ThumbnailDownload.Failed");
    }
}
