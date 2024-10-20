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
@Deprecated
/* loaded from: classes3.dex */
public final class xpq extends UrlRequest.Callback {
    public static final alpt a = alpt.s(403, 404, 410);
    private static final alwo b = alwo.o("BugleFileTransfer");
    private final dtq c;
    private final FileOutputStream d;
    private final int e;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicLong g;
    private final Optional h;
    private final String i;

    public xpq(String str, FileOutputStream fileOutputStream, int i, dtq dtqVar, Optional optional) {
        AtomicLong atomicLong = new AtomicLong();
        this.g = atomicLong;
        this.i = str;
        this.d = fileOutputStream;
        atomicLong.set(0L);
        this.e = i;
        this.c = dtqVar;
        this.h = optional;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        alwl alwlVar = (alwl) b.g();
        alwlVar.X(xod.a, this.i);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onCanceled", 153, "DownloadCallback.java")).q("Download from server canceled.");
        this.c.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        alwl alwlVar = (alwl) b.i();
        alwlVar.X(xod.a, this.i);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onFailed", 133, "DownloadCallback.java")).q("Download from server failed.");
        if (urlResponseInfo == null) {
            this.c.d(new xpt(true, "Empty server response during file download.", xoc.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY, (Throwable) cronetException));
            return;
        }
        dtq dtqVar = this.c;
        urlResponseInfo.getHttpStatusCode();
        dtqVar.d(new xpt(true, "Cronet failure during file download.", xoc.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED, (Throwable) cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        long remaining = byteBuffer.remaining();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.d.getChannel()).write(byteBuffer);
        Optional optional = this.h;
        long addAndGet = this.g.addAndGet(remaining);
        if (!optional.isEmpty() && addAndGet >= xoo.b()) {
            xof xofVar = new xof();
            xofVar.b(addAndGet);
            xofVar.c(2147483647L);
            qiu.h(((xoj) this.h.get()).b(this.i, xofVar.a()));
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.f.incrementAndGet() <= this.e) {
            alwo alwoVar = b;
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onRedirectReceived", 79, "DownloadCallback.java")).t("onRedirectReceived: Redirecting to: %s", str);
            alwl alwlVar = (alwl) alwoVar.g();
            alwlVar.X(xod.a, this.i);
            alwlVar.X(xod.c, Integer.valueOf(this.f.intValue()));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onRedirectReceived", 84, "DownloadCallback.java")).o();
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        alwl alwlVar = (alwl) b.g();
        alwlVar.X(xod.a, this.i);
        alwlVar.X(xod.d, Integer.valueOf(httpStatusCode));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onResponseStarted", 99, "DownloadCallback.java")).q("onResponseStarted: Starting to read the response.");
        if (httpStatusCode != 200 && httpStatusCode != 206) {
            this.c.d(new xpt(!a.contains(r2), a.bV(httpStatusCode, "Http failure during file download: "), (byte[]) null));
        } else {
            urlRequest.read(ByteBuffer.allocateDirect(32768));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        alwl alwlVar = (alwl) b.g();
        alwlVar.X(xod.a, this.i);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onSucceeded", 127, "DownloadCallback.java")).q("Download from server succeeded.");
        this.c.b(urlResponseInfo);
    }
}
