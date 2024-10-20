package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actm implements acth {
    public final acnv a;
    public final actj b;
    public final armf d;
    public DefaultHttpClient e;
    private final anen g;
    private HttpGet h;
    public final Set c = alzz.K(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));
    public String f = "";

    public actm(anen anenVar, armf armfVar, acnv acnvVar, actj actjVar) {
        this.g = anenVar;
        this.d = armfVar;
        this.a = acnvVar;
        this.b = actjVar;
    }

    @Override // defpackage.acth
    public final ListenableFuture a() {
        HttpGet httpGet = this.h;
        httpGet.getClass();
        DefaultHttpClient defaultHttpClient = this.e;
        if (defaultHttpClient != null) {
            this.a.d(this.f, 2, altc.a);
            return aktp.ai(new aakf(defaultHttpClient, httpGet, 10), this.g).i(new actl(this, agkx.W().longValue(), defaultHttpClient, httpGet, 0), this.g).i(new aang(this, 20), this.g);
        }
        throw new IllegalStateException("The HTTP client is null. Call init() method first");
    }

    @Override // defpackage.acth
    public final void b(String str, String str2) {
        this.e = aiii.a(str2);
        HttpGet httpGet = new HttpGet(str2);
        this.h = httpGet;
        httpGet.setHeader("User-Agent", str);
        this.f = actt.e(str2);
    }

    @Override // defpackage.acth
    public final void c(String str, String str2, long j) {
        b(str, str2);
        if (j > 0) {
            HttpGet httpGet = this.h;
            httpGet.getClass();
            httpGet.setHeader("Range", a.cn(j, "bytes=", "-"));
            this.c.add(206);
        }
    }

    @Override // defpackage.acth, java.lang.AutoCloseable
    public final void close() {
        DefaultHttpClient defaultHttpClient = this.e;
        defaultHttpClient.getClass();
        defaultHttpClient.getConnectionManager().shutdown();
    }
}
