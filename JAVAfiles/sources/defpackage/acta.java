package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acta implements actj {
    public static final advp a = new advp("GbaBasedHttpRequestExecutor");
    static final acyz b = acyy.b("enable_http_gba_failure_logging");
    public final actf c;
    public final acnv d;
    public final anen e;
    public final armf f;
    private final InstantMessageConfiguration g;

    public acta(actf actfVar, anen anenVar, armf armfVar, InstantMessageConfiguration instantMessageConfiguration, acnv acnvVar) {
        this.c = actfVar;
        this.d = acnvVar;
        this.e = anenVar;
        this.f = armfVar;
        this.g = instantMessageConfiguration;
    }

    public static final void d(Header[] headerArr, String str) {
        ArrayList arrayList = new ArrayList();
        Collection.EL.forEach(Arrays.asList(headerArr), new acsa(arrayList, 2));
        advr.d(a, "%s headers:\n%s", str, Collection.EL.stream(arrayList).map(new acpr(9)).collect(Collectors.joining("\n")));
    }

    public static final void e(Header[] headerArr) {
        d(headerArr, "Request");
    }

    private final void f(ListenableFuture listenableFuture, long j, String str) {
        albo.bR(listenableFuture, new acsz(this, str, j), this.e);
    }

    @Override // defpackage.actj
    public final ListenableFuture a(DefaultHttpClient defaultHttpClient, HttpContext httpContext, HttpRequestBase httpRequestBase) {
        if (Objects.isNull(httpContext.getAttribute("preemptive-auth"))) {
            advr.r(a, "No preemptive authentication context found. Falling back to the default HTTP context.", new Object[0]);
            return b(defaultHttpClient, httpRequestBase);
        }
        advr.l(a, "Executing authenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        InstantMessageConfiguration instantMessageConfiguration = this.g;
        actf actfVar = this.c;
        String str = instantMessageConfiguration.mFtHttpContentServerUri;
        ListenableFuture g = ancj.g(c(actfVar.a(str, false), defaultHttpClient, httpRequestBase, httpContext), new qcf(this, httpRequestBase, str, defaultHttpClient, httpContext, 15, null), this.e);
        return g;
    }

    @Override // defpackage.actj
    public final ListenableFuture b(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase) {
        long longValue = agkx.W().longValue();
        String method = httpRequestBase.getMethod();
        advr.l(a, "Executing unauthenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        this.d.a = aphx.AUTHENTICATION_TYPE_NONE;
        String f = actt.f(httpRequestBase);
        this.d.d(f, actt.k(method), altc.a);
        e(httpRequestBase.getAllHeaders());
        ListenableFuture submit = this.e.submit(new aakf(defaultHttpClient, httpRequestBase, 9));
        f(submit, longValue, f);
        return submit;
    }

    public final ListenableFuture c(ListenableFuture listenableFuture, DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase, HttpContext httpContext) {
        long longValue = agkx.W().longValue();
        String method = httpRequestBase.getMethod();
        String f = actt.f(httpRequestBase);
        ListenableFuture g = ancj.g(listenableFuture, new vki(this, method, f, defaultHttpClient, httpRequestBase, httpContext, 6), this.e);
        f(g, longValue, f);
        return g;
    }
}
