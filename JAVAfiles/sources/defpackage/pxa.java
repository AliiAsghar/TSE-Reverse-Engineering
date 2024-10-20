package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxa extends UrlRequest.Callback {
    final /* synthetic */ pxb a;
    private final UrlRequest.Callback b;

    public pxa(pxb pxbVar, UrlRequest.Callback callback) {
        this.a = pxbVar;
        this.b = callback;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.c();
        this.b.onCanceled(urlRequest, urlResponseInfo);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.c();
        this.b.onFailed(urlRequest, urlResponseInfo, cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ((alwl) pxb.a.n().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest$MonitoredCallback", "onReadCompleted", 158, "MonitoredUrlRequest.java")).t("Reading HTTP response, restarting read timer (%d millis)", pxb.b.e());
        this.a.d(((Integer) pxb.c.e()).intValue());
        this.b.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        ((alwl) pxb.a.n().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest$MonitoredCallback", "onRedirectReceived", 136, "MonitoredUrlRequest.java")).t("HTTP request redirected, restarting connection timer (%d millis)", pxb.b.e());
        this.a.d(((Integer) pxb.b.e()).intValue());
        this.b.onRedirectReceived(urlRequest, urlResponseInfo, str);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ((alwl) pxb.a.n().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest$MonitoredCallback", "onResponseStarted", 147, "MonitoredUrlRequest.java")).t("HTTP response started, starting read timer (%d millis)", pxb.b.e());
        this.a.d(((Integer) pxb.c.e()).intValue());
        this.b.onResponseStarted(urlRequest, urlResponseInfo);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.c();
        this.b.onSucceeded(urlRequest, urlResponseInfo);
    }
}
