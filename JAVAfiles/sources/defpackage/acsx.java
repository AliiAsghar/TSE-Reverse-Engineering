package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsx extends acuh {
    static final acyz a = acyy.b("enable_get_upload_info_retry");
    private static final Uri k = Uri.EMPTY;
    public HttpRequestBase b;
    private final FileTransferInfo l;
    private final String m;
    private final boolean n;
    private final adih o;
    private final actj p;
    private final String q;
    private final String r;
    private final armf s;

    public acsx(Context context, acrm acrmVar, adih adihVar, armf armfVar, long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, acug acugVar, boolean z, acnv acnvVar, actj actjVar, String str3) {
        super(context, j, str, instantMessageConfiguration, acugVar, acrmVar, acnvVar, armfVar);
        this.l = fileTransferInfo;
        this.m = str2;
        this.n = z;
        this.o = adihVar;
        this.s = armfVar;
        this.p = actjVar;
        this.q = str3;
        this.r = instantMessageConfiguration.mFtHttpContentServerUri;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, acyz] */
    private final HttpResponse j(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase, HttpContext httpContext) {
        ListenableFuture a2;
        if (httpContext == null) {
            a2 = this.p.b(defaultHttpClient, httpRequestBase);
        } else {
            a2 = this.p.a(defaultHttpClient, httpContext, httpRequestBase);
        }
        try {
            return (HttpResponse) a2.get(((Integer) aczs.c().a.b.a()).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException("Couldn't obtain HttpReponse from future.", e);
        }
    }

    private final HttpPost k() {
        HttpPost httpPost = new HttpPost(this.d.mFtHttpContentServerUri);
        httpPost.setHeader("User-Agent", this.q);
        return httpPost;
    }

    private final void l(Exception exc) {
        int i;
        if (this.j) {
            advr.o("HTTP file transfer canceled", new Object[0]);
            i = 5;
        } else {
            advr.i(exc, "Unable to perform HTTP file transfer", new Object[0]);
            b(acrt.c);
            if (!this.j && this.i <= 1) {
                this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR);
                i = 8;
            } else {
                this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_MAX_RETRIES_REACHED);
                i = 11;
            }
        }
        d(20013, i);
    }

    private final void m(HttpResponse httpResponse, Set set) {
        advr.c("Received %s, expecting %s", httpResponse.getStatusLine(), set);
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (set.contains(Integer.valueOf(statusCode))) {
            return;
        }
        this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE);
        try {
            throw new acui(statusCode, actt.c(httpResponse));
        } catch (IllegalArgumentException e) {
            this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
            throw new IOException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final byte[] n(org.apache.http.impl.client.DefaultHttpClient r12, org.apache.http.protocol.HttpContext r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsx.n(org.apache.http.impl.client.DefaultHttpClient, org.apache.http.protocol.HttpContext):byte[]");
    }

    private static final void o(HttpEntity httpEntity) {
        if (httpEntity == null) {
            return;
        }
        httpEntity.consumeContent();
    }

    private static final void p(byte[] bArr) {
        advr.o("Response:\n%s", new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // defpackage.acuh
    public final void a() {
        super.a();
        synchronized (this) {
            notifyAll();
        }
        HttpRequestBase httpRequestBase = this.b;
        if (httpRequestBase != null && !httpRequestBase.isAborted()) {
            new acsw(this).start();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:15|(2:17|(1:19))|20|(1:22)(2:39|(4:41|11|12|13))|23|24|25|26|(2:28|(4:30|11|12|13))|31|(4:33|11|12|13)(2:34|35)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0295, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0296, code lost:
    
        r25.h.e(r25.r);
        defpackage.advr.q("Unable to parse file resume info: %s", r0.getMessage());
        r2 = n(r4, r3);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsx.run():void");
    }

    @Override // defpackage.acuh
    public final String toString() {
        return "Upload: " + super.toString() + ", TID " + this.m + ", isExplicitResume " + this.n;
    }
}
