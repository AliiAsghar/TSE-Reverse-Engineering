package defpackage;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpt extends RequestFinishedInfo.Listener {
    private static final aegu a = new aegx();
    private final aegu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahpt(Executor executor) {
        super(executor);
        aegu aeguVar = a;
        this.b = aeguVar;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        long time;
        Map<String, List<String>> allHeaders;
        List<String> list;
        if (!ahkc.a().a.g()) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 61, "RequestFinishedListener.java")).q("onRequestFinished is skipped as primes preconditions failed.");
            return;
        }
        if (requestFinishedInfo == null) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 65, "RequestFinishedListener.java")).q("Un-expected null UrlRequestInfo from cronet's RequestFinishedListener,  skipping current NetworkEvent");
            return;
        }
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics == null) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 72, "RequestFinishedListener.java")).q("un-expected null metrics from cronet's RequestFinishedListener, skipping current request");
            return;
        }
        if (requestFinishedInfo.getAnnotations() != null) {
            Iterator<Object> it = requestFinishedInfo.getAnnotations().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof agqs) {
                    ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 81, "RequestFinishedListener.java")).q("onRequestFinished is skipped due to PrimesCronetMonitorIgnoreAnnotation");
                    return;
                }
            }
        }
        Date requestStart = metrics.getRequestStart();
        if (requestStart == null) {
            time = this.b.f().toEpochMilli();
        } else {
            time = requestStart.getTime();
        }
        ahpn ahpnVar = new ahpn(null, requestFinishedInfo.getUrl(), false, time);
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null && (allHeaders = responseInfo.getAllHeaders()) != null && (list = allHeaders.get(assi.a)) != null && !list.isEmpty()) {
            ahpnVar.k = list.get(0);
        }
        Long receivedByteCount = metrics.getReceivedByteCount();
        if (receivedByteCount != null) {
            ahpnVar.d = receivedByteCount.intValue();
        }
        Long sentByteCount = metrics.getSentByteCount();
        if (sentByteCount != null) {
            ahpnVar.e = sentByteCount.intValue();
        }
        Long ttfbMs = metrics.getTtfbMs();
        if (ttfbMs != null) {
            ahpnVar.b = ttfbMs.longValue();
        }
        Long totalTimeMs = metrics.getTotalTimeMs();
        if (totalTimeMs != null) {
            ahpnVar.c = totalTimeMs.longValue();
        }
        UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
        if (responseInfo2 != null) {
            int httpStatusCode = responseInfo2.getHttpStatusCode();
            if (httpStatusCode >= 0) {
                ahpnVar.j = httpStatusCode;
            }
            String negotiatedProtocol = responseInfo2.getNegotiatedProtocol();
            if (negotiatedProtocol != null && !negotiatedProtocol.isEmpty()) {
                ahpnVar.i = negotiatedProtocol;
            }
        }
        int finishedReason = requestFinishedInfo.getFinishedReason();
        int i = 4;
        int i2 = 2;
        if (finishedReason != 0) {
            if (finishedReason != 1) {
                if (finishedReason != 2) {
                    i2 = 1;
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
        }
        ahpnVar.w = i2;
        CronetException exception = requestFinishedInfo.getException();
        if (exception != null) {
            if (exception instanceof NetworkException) {
                switch (((NetworkException) exception).getErrorCode()) {
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    case 9:
                        i = 11;
                        break;
                    case 10:
                        i = 12;
                        break;
                    case 11:
                        i = 13;
                        break;
                    default:
                        i = 1;
                        break;
                }
                ahpnVar.o = i - 1;
            } else if (exception instanceof CallbackException) {
                ahpnVar.o = 1;
            } else {
                ahpnVar.o = 0;
            }
            if (exception instanceof QuicException) {
                ahpnVar.p = ((QuicException) exception).getQuicDetailedErrorCode();
            }
        }
        ahpnVar.m = 1;
        ahkc.a().c(ahpnVar);
    }
}
