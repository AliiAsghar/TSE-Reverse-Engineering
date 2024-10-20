package defpackage;

import j$.nio.channels.DesugarChannels;
import j$.util.Optional;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pyf extends UrlRequest.Callback {
    private static final alwo a = alwo.o("BugleFileTransfer");
    private final FileOutputStream b;
    private final int c;
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicLong e;
    private final int f;
    private final Optional g;
    private final String h;
    private final qdq i;

    public pyf(String str, int i, long j, FileOutputStream fileOutputStream, int i2, qdq qdqVar, Optional optional) {
        AtomicLong atomicLong = new AtomicLong();
        this.e = atomicLong;
        this.h = str;
        this.f = i;
        this.b = fileOutputStream;
        atomicLong.set(j);
        this.c = i2;
        this.i = qdqVar;
        this.g = optional;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int i;
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(xod.a, this.h);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onCanceled", 137, "DownloadCallback.java")).q("Download canceled.");
        pwq a2 = pwr.a();
        if (urlResponseInfo != null) {
            i = urlResponseInfo.getHttpStatusCode();
        } else {
            i = 0;
        }
        qdq qdqVar = this.i;
        a2.e(i);
        a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_CANCELLATION);
        qdqVar.b(a2.a());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        alwo alwoVar = a;
        alwl alwlVar = (alwl) alwoVar.i();
        alwlVar.X(xod.a, this.h);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onFailed", 116, "DownloadCallback.java")).q("Download failed.");
        if (urlResponseInfo == null) {
            alvw n = alwoVar.n();
            n.X(xod.a, this.h);
            ((alwl) n.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onFailed", 118, "DownloadCallback.java")).q("Download response null.");
            qdq qdqVar = this.i;
            pwq a2 = pwr.a();
            a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
            a2.b(cronetException);
            qdqVar.b(a2.a());
            return;
        }
        qdq qdqVar2 = this.i;
        pwq a3 = pwr.a();
        a3.e(urlResponseInfo.getHttpStatusCode());
        a3.f(xoc.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
        a3.b(cronetException);
        qdqVar2.b(a3.a());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [xoj, java.lang.Object] */
    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        long remaining = byteBuffer.remaining();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.b.getChannel()).write(byteBuffer);
        Optional optional = this.g;
        long addAndGet = this.e.addAndGet(remaining);
        if (!optional.isEmpty() && addAndGet >= xoo.b()) {
            xof xofVar = new xof();
            xofVar.b(addAndGet);
            xofVar.c(this.f);
            qiu.h(this.g.get().b(this.h, xofVar.a()));
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.d.incrementAndGet() <= this.c) {
            alwo alwoVar = a;
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 66, "DownloadCallback.java")).t("onRedirectReceived: Redirecting to: %s", str);
            alwl alwlVar = (alwl) alwoVar.g();
            alwlVar.X(xod.a, this.h);
            alwlVar.X(xod.c, Integer.valueOf(this.d.intValue()));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 71, "DownloadCallback.java")).o();
            urlRequest.followRedirect();
            return;
        }
        alwl alwlVar2 = (alwl) a.i();
        alwlVar2.X(xod.a, this.h);
        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 76, "DownloadCallback.java")).q("MaxRedirects reached.");
        qdq qdqVar = this.i;
        pwq a2 = pwr.a();
        a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_MAX_REDIRECTS_REACHED);
        qdqVar.b(a2.a());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(xod.a, this.h);
        alwlVar.X(xod.d, Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onResponseStarted", 89, "DownloadCallback.java")).q("onResponseStarted: Starting to read the response.");
        urlRequest.read(ByteBuffer.allocateDirect(32768));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(xod.a, this.h);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onSucceeded", 110, "DownloadCallback.java")).q("HTTP request completed.");
        pwt pwtVar = new pwt(urlResponseInfo, aozb.b);
        UrlResponseInfo urlResponseInfo2 = pwtVar.a;
        qdq qdqVar = this.i;
        if (!((pww) qdqVar.a).a.d.b(urlResponseInfo2)) {
            Object obj = qdqVar.a;
            pwk pwkVar = new pwk(pwtVar);
            pwz pwzVar = ((pww) obj).a;
            pwzVar.a(pwzVar.h, pwkVar);
            return;
        }
        Object obj2 = qdqVar.a;
        pwl pwlVar = pwl.a;
        pwz pwzVar2 = ((pww) obj2).a;
        pwzVar2.a(pwzVar2.f, pwlVar);
    }
}
