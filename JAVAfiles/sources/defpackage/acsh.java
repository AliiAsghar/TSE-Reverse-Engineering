package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.filetransfer.http.PendingTransferInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import java.io.IOException;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acsh extends acse {
    static final acyz c = aczd.a(183016660);
    protected final long d;
    protected final String e;
    private final acts f;
    private final acsd g;

    public acsh(Context context, acts actsVar, acsd acsdVar, acrz acrzVar, long j, String str) {
        super(context, acrzVar);
        this.f = actsVar;
        this.g = acsdVar;
        this.d = j;
        this.e = str;
    }

    private final void d() {
        if (this.g.b && ((Boolean) c.a()).booleanValue()) {
            this.b.o(Long.toString(this.d));
        }
    }

    @Override // defpackage.acse
    protected final String a() {
        return Long.toString(this.d);
    }

    @Override // defpackage.acug
    public void b(byte[] bArr, Uri uri) {
        HttpFileTransferPushMessage httpFileTransferPushMessage;
        try {
            httpFileTransferPushMessage = HttpFileTransferPushMessage.a(bArr);
            httpFileTransferPushMessage.mFileId = this.e;
        } catch (IOException e) {
            advr.i(e, "Error parsing HTTP file transfer for session ID %d, file ID %s", Long.valueOf(this.d), this.e);
            httpFileTransferPushMessage = null;
        }
        if (httpFileTransferPushMessage != null) {
            PendingTransferInfo a = this.b.a(Long.toString(this.d));
            if (a == null) {
                advr.g("Pending file transfer info not found after uploading file.", new Object[0]);
                d();
                return;
            }
            a.mPushMessage = httpFileTransferPushMessage;
            a.uploadPushMessageData = bArr;
            actq actqVar = new actq(null);
            actqVar.i(httpFileTransferPushMessage.mFileId);
            actqVar.f(httpFileTransferPushMessage.mFileInfo.mSize);
            actqVar.c(httpFileTransferPushMessage.mFileInfo.mContentType);
            actqVar.h(httpFileTransferPushMessage.mFileInfo.mUrl);
            actqVar.g(this.d);
            actqVar.c = Optional.of(bArr);
            Date date = httpFileTransferPushMessage.mFileInfo.mValidity;
            if (date != null) {
                actqVar.m(date.getTime());
            }
            if (this.g.c) {
                String str = httpFileTransferPushMessage.mFileInfo.mBrandedUrl;
                if (!albo.ah(str)) {
                    actqVar.b = Optional.of(str);
                }
            }
            advz.c(this.a, RcsIntents.ACTION_FILE_TRANSFER_METADATA_UPDATE, this.f.a(actqVar.a()), advy.UPLOAD_LISTENER);
        }
        d();
    }
}
