package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apvr extends UrlRequest.Callback {
    public final anel a;
    private final ExecutorService b;
    private final apvq c;
    private final apvo d;

    public apvr(ExecutorService executorService) {
        apvo apvoVar = new apvo();
        this.b = executorService;
        apvq apvqVar = new apvq();
        this.c = apvqVar;
        this.a = new anel(apvqVar);
        this.d = apvoVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.a = new asmb(new apvj(apvi.CANCELED, ""));
        this.b.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        boolean z = cronetException instanceof NetworkException;
        apvi apviVar = apvi.UNKNOWN;
        if (z) {
            switch (((NetworkException) cronetException).getErrorCode()) {
                case 1:
                    apviVar = apvi.BAD_URL;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    apviVar = apvi.CONNECTION_ERROR;
                    break;
            }
        }
        apvj apvjVar = new apvj(apviVar, cronetException);
        this.c.a = new asmb(apvjVar);
        this.b.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        apvo apvoVar = this.d;
        albo.T(!apvoVar.a);
        if (byteBuffer != ((ArrayDeque) apvoVar.b).peekLast()) {
            ((ArrayDeque) apvoVar.b).addLast(byteBuffer);
        }
        if (!byteBuffer.hasRemaining()) {
            byteBuffer = ByteBuffer.allocateDirect(8192);
        }
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        long j;
        long j2;
        albo.T(!this.d.a);
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        if (allHeaders.containsKey("content-length")) {
            try {
                j2 = Long.parseLong(allHeaders.get("content-length").get(0));
            } catch (NumberFormatException unused) {
                j2 = 0;
            }
            if (j2 > 0) {
                if (allHeaders.containsKey("content-encoding") && (allHeaders.get("content-encoding").size() != 1 || !Objects.equals(allHeaders.get("content-encoding").get(0), "identity"))) {
                    j = j2 + j2;
                } else {
                    j = j2 + 1;
                }
                urlRequest.read(ByteBuffer.allocateDirect((int) Math.min(j, 524288L)));
            }
        }
        j = 524288;
        urlRequest.read(ByteBuffer.allocateDirect((int) Math.min(j, 524288L)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBuffer;
        apuu apuuVar = new apuu();
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            apuuVar.d(entry.getKey(), entry.getValue());
        }
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        apvo apvoVar = this.d;
        albo.T(!apvoVar.a);
        apvoVar.a = true;
        Iterator it = ((ArrayDeque) apvoVar.b).iterator();
        while (it.hasNext()) {
            ((ByteBuffer) it.next()).flip();
        }
        if (((ArrayDeque) apvoVar.b).isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        } else if (((ArrayDeque) apvoVar.b).size() == 1) {
            byteBuffer = (ByteBuffer) ((ArrayDeque) apvoVar.b).remove();
        } else {
            Iterator it2 = ((ArrayDeque) apvoVar.b).iterator();
            int i = 0;
            while (it2.hasNext()) {
                i += ((ByteBuffer) it2.next()).remaining();
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            while (!((ArrayDeque) apvoVar.b).isEmpty()) {
                allocateDirect.put((ByteBuffer) ((ArrayDeque) apvoVar.b).remove());
            }
            allocateDirect.flip();
            byteBuffer = allocateDirect;
        }
        byteBuffer.position(0);
        this.c.a = new asmb(new apuv(httpStatusCode, apuuVar, new aiuq(byteBuffer)));
        this.b.execute(this.a);
    }
}
