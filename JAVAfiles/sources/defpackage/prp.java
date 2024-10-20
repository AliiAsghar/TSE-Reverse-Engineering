package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prp extends UrlRequest.Callback {
    final /* synthetic */ prq a;
    private final dtq c;
    private final alvi b = alvi.m("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback");
    private aozb d = aozb.b;

    public prp(prq prqVar, dtq dtqVar) {
        this.a = prqVar;
        this.c = dtqVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo != null && urlResponseInfo.getHttpStatusCode() > 0) {
            alvw g = this.b.g();
            g.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onCanceled", 437, "RbmBusinessInfoJsonRetriever.java")).r("Response was cancelled, but contains status code, response code: %d", urlResponseInfo.getHttpStatusCode());
            this.c.b(new pro(urlResponseInfo.getHttpStatusCode()));
            return;
        }
        alvw i = this.b.i();
        i.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onCanceled", 445, "RbmBusinessInfoJsonRetriever.java")).q("Business Info JSON HTTP retrieval cancelled without response code");
        this.c.d(new prr("Business Info JSON HTTP retrieval was cancelled", 8));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        String str;
        alvw i = this.b.i();
        i.X(alwp.a, "Bugle");
        ((alvg) ((alvg) ((alvg) i).g(cronetException)).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onFailed", (char) 423, "RbmBusinessInfoJsonRetriever.java")).q("Business Info JSON HTTP retrieval failed");
        if (cronetException.getMessage() != null) {
            str = cronetException.getMessage();
        } else {
            str = "Cronet exception has null message";
        }
        this.c.d(new prr(str, 7, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        aozb aozbVar = this.d;
        aozb aozbVar2 = aozb.b;
        int remaining = byteBuffer.remaining();
        aozb.s(0, remaining, byteBuffer.remaining());
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        this.d = aozbVar.u(new aoyz(bArr));
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        alvw g = this.b.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onRedirectReceived", 341, "RbmBusinessInfoJsonRetriever.java")).q("onRedirectReceived method called.");
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode != 200 && httpStatusCode != 304) {
            alvw g = this.b.g();
            g.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onResponseStarted", 358, "RbmBusinessInfoJsonRetriever.java")).r("Response started, and response code was not 200 OK or 304. response code: %d", httpStatusCode);
            this.c.b(new pro(httpStatusCode));
            urlRequest.cancel();
            return;
        }
        alvw g2 = this.b.g();
        g2.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onResponseStarted", 353, "RbmBusinessInfoJsonRetriever.java")).r("Response started. status: %d", httpStatusCode);
        urlRequest.read(ByteBuffer.allocateDirect(8192));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0170  */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSucceeded(org.chromium.net.UrlRequest r19, org.chromium.net.UrlResponseInfo r20) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prp.onSucceeded(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
    }
}
