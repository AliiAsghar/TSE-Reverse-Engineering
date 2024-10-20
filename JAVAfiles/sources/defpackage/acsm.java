package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsm implements actj {
    private static final advp a = new advp("DigestBasedHttpRequestExecutor");
    private final acnv b;
    private final InstantMessageConfiguration c;

    public acsm(InstantMessageConfiguration instantMessageConfiguration, acnv acnvVar) {
        this.c = instantMessageConfiguration;
        this.b = acnvVar;
    }

    @Override // defpackage.actj
    public final ListenableFuture a(DefaultHttpClient defaultHttpClient, HttpContext httpContext, HttpRequestBase httpRequestBase) {
        advp advpVar = a;
        advr.l(advpVar, "Executing authenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        if (Objects.isNull(httpContext.getAttribute("preemptive-auth"))) {
            advr.l(advpVar, "No preemptive authentication context found. Falling back to the default HTTP context.", new Object[0]);
            return b(defaultHttpClient, httpRequestBase);
        }
        String f = actt.f(httpRequestBase);
        this.b.d(f, actt.k(httpRequestBase.getMethod()), altc.a);
        long longValue = agkx.W().longValue();
        advr.p(advpVar, "Setting up HTTP client authentication!", new Object[0]);
        this.b.a = aphx.AUTHENTICATION_TYPE_DIGEST;
        InstantMessageConfiguration instantMessageConfiguration = this.c;
        defaultHttpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(instantMessageConfiguration.mFtHttpContentServerUser, instantMessageConfiguration.mFtHttpContentServerPassword));
        HttpResponse execute = defaultHttpClient.execute(httpRequestBase, httpContext);
        advr.l(advpVar, "completed HTTP [%s] to host [%s] with result [%d]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost(), Integer.valueOf(execute.getStatusLine().getStatusCode()));
        this.b.b(f, execute.getStatusLine().getStatusCode(), agkx.W().longValue() - longValue);
        return albo.bI(execute);
    }

    @Override // defpackage.actj
    public final ListenableFuture b(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase) {
        advr.l(a, "Executing unauthenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        String f = actt.f(httpRequestBase);
        this.b.d(f, actt.k(httpRequestBase.getMethod()), altc.a);
        long longValue = agkx.W().longValue();
        HttpResponse execute = defaultHttpClient.execute(httpRequestBase);
        this.b.b(f, execute.getStatusLine().getStatusCode(), agkx.W().longValue() - longValue);
        return albo.bI(execute);
    }
}
