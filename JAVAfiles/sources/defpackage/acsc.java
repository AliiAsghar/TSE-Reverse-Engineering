package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsc extends acse {
    private final acts c;
    private final HttpFileTransferPushMessage d;
    private final long e;

    public acsc(acrz acrzVar, Context context, acts actsVar, HttpFileTransferPushMessage httpFileTransferPushMessage, long j) {
        super(context, acrzVar);
        this.c = actsVar;
        this.d = httpFileTransferPushMessage;
        this.e = j;
    }

    @Override // defpackage.acse
    protected final String a() {
        return Long.toString(this.e);
    }

    @Override // defpackage.acug
    public final void b(byte[] bArr, Uri uri) {
        String l = Long.toString(this.e);
        advr.c("HTTP file transfer download successful for pending transfer key %s", l);
        actq actqVar = new actq(null);
        actqVar.i(this.d.mFileId);
        actqVar.g(this.e);
        actqVar.j(this.d.mSender);
        actqVar.f(this.d.mFileInfo.mSize);
        actqVar.c(this.d.mFileInfo.mContentType);
        actqVar.h(this.d.mFileInfo.mUrl);
        actqVar.d(uri);
        String str = this.d.mFileInfo.mFileName;
        if (str != null) {
            actqVar.e(str);
        }
        advz.c(this.a, RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED, this.c.a(actqVar.a()), advy.FILE_DOWNLOAD_LISTENER);
        this.b.o(l);
    }
}
