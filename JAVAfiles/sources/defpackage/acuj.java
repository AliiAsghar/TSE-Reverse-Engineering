package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.impl.auth.DigestScheme;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acuj implements HttpResponseInterceptor {
    @Override // org.apache.http.HttpResponseInterceptor
    public final void process(HttpResponse httpResponse, HttpContext httpContext) {
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (authState != null) {
            AuthScheme authScheme = authState.getAuthScheme();
            if (authScheme instanceof DigestScheme) {
                httpContext.setAttribute("preemptive-auth", authScheme);
            }
        }
    }
}
