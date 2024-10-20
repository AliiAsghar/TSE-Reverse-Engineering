package defpackage;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acuk implements HttpRequestInterceptor {
    @Override // org.apache.http.HttpRequestInterceptor
    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (authState.getAuthScheme() == null) {
            AuthScheme authScheme = (AuthScheme) httpContext.getAttribute("preemptive-auth");
            CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute("http.auth.credentials-provider");
            HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
            if (authScheme != null) {
                Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort()));
                if (credentials != null) {
                    authState.setAuthScheme(authScheme);
                    authState.setCredentials(credentials);
                    return;
                }
                throw new HttpException("No credentials for preemptive authentication");
            }
        }
    }
}
