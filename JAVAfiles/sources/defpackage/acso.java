package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acso implements acth {
    private HttpURLConnection a;
    private final Set b = alzz.K(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));
    private final ahlp c;

    public acso(ahlp ahlpVar) {
        this.c = ahlpVar;
    }

    @Override // defpackage.acth
    public final ListenableFuture a() {
        Optional empty;
        HashMap hashMap = new HashMap();
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            httpURLConnection.connect();
            String headerField = this.a.getHeaderField("Accept-Ranges");
            if (headerField != null) {
                hashMap.put("Accept-Ranges", headerField);
            }
            String headerField2 = this.a.getHeaderField("Retry-After");
            if (headerField2 != null) {
                hashMap.put("Retry-After", headerField2);
            }
            int responseCode = this.a.getResponseCode();
            if (this.b.contains(Integer.valueOf(responseCode))) {
                empty = Optional.of(this.a.getInputStream());
            } else {
                empty = Optional.empty();
            }
            return albo.bI(actg.a(responseCode, empty, hashMap));
        }
        throw new IOException("HttpURLConnection is null. Call init() method first");
    }

    @Override // defpackage.acth
    public final void b(String str, String str2) {
        this.a = this.c.f(str, str2);
    }

    @Override // defpackage.acth
    public final void c(String str, String str2, long j) {
        this.b.add(206);
        HttpURLConnection f = this.c.f(str, str2);
        advr.c("Preparing to resume, starting at offset:%d bytes", Long.valueOf(j));
        f.setRequestProperty("Range", a.cn(j, "bytes=", "-"));
        f.setUseCaches(false);
        this.a = f;
    }

    @Override // defpackage.acth, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
