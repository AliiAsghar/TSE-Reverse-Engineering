package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyw extends BidirectionalStream.Callback {
    final /* synthetic */ aqyz a;
    private List b;

    public aqyw(aqyz aqyzVar) {
        this.a = aqyzVar;
    }

    private final void a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(StandardCharsets.UTF_8);
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(StandardCharsets.UTF_8);
        }
        byte[][] b = arht.b(bArr);
        Charset charset = aqth.a;
        aqut aqutVar = new aqut(b);
        aqyz aqyzVar = this.a;
        int i3 = aqyy.i;
        synchronized (aqyzVar.o.a) {
            aqyy aqyyVar = this.a.o;
            if (z) {
                aqyyVar.p(aqutVar);
            } else {
                aqyyVar.o(aqutVar);
            }
        }
    }

    private static final Status b(UrlResponseInfo urlResponseInfo) {
        return arcb.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        Status status;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onCanceled");
        }
        aqyz aqyzVar = this.a;
        int i = aqyy.i;
        synchronized (aqyzVar.o.a) {
            status = this.a.o.e;
            if (status == null) {
                if (urlResponseInfo != null) {
                    status = b(urlResponseInfo);
                } else {
                    status = Status.c.withDescription("stream cancelled without reason");
                }
            }
        }
        this.a.r(status);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onFailed");
        }
        this.a.r(Status.n.d(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onReadCompleted. Size=" + byteBuffer.remaining());
        }
        aqyz aqyzVar = this.a;
        int i = aqyy.i;
        synchronized (aqyzVar.o.a) {
            this.a.o.f = z;
            if (byteBuffer.remaining() != 0) {
                aqyy.f(this.a.o, byteBuffer);
            }
        }
        if (z && (list = this.b) != null) {
            a(list, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseHeadersReceived. Header=".concat(String.valueOf(String.valueOf(urlResponseInfo.getAllHeadersAsList()))));
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List<Map.Entry<String, String>> asList = headerBlock.getAsList();
        this.b = asList;
        int i = aqyy.i;
        synchronized (this.a.o.a) {
            z = this.a.o.f;
        }
        if (z) {
            a(asList, true);
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseTrailersReceived. Trailer=".concat(String.valueOf(asList.toString())));
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onStreamReady");
        }
        aqyz aqyzVar = this.a;
        int i = aqyy.i;
        synchronized (aqyzVar.o.a) {
            this.a.o.d();
            aqyy aqyyVar = this.a.o;
            aqyyVar.c = true;
            for (aqyx aqyxVar : aqyyVar.b) {
                aqyyVar.h.s((ByteBuffer) aqyxVar.c, aqyxVar.a, aqyxVar.b);
            }
            aqyyVar.b.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onSucceeded");
        }
        aqyz aqyzVar = this.a;
        int i = aqyy.i;
        synchronized (aqyzVar.o.a) {
            z = false;
            if (this.b != null && this.a.o.f) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else if (urlResponseInfo != null) {
                a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.a.r(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onWriteCompleted");
        }
        aqyz aqyzVar = this.a;
        int i = aqyy.i;
        synchronized (aqyzVar.o.a) {
            aqyz aqyzVar2 = this.a;
            aqyy aqyyVar = aqyzVar2.o;
            if (!aqyyVar.g) {
                aqyyVar.g = true;
                aqyzVar2.f.a();
            }
            this.a.o.h(byteBuffer.position());
        }
    }
}
