package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aipn extends WebViewClient {
    private static final alwo a = alwo.o("SaferWebViewClient");
    private final aipq b;
    private final aipq c;

    public aipn(aipq aipqVar, aipq aipqVar2) {
        this.b = aipqVar;
        this.c = aipqVar2;
    }

    private final boolean a(Uri uri) {
        boolean z = true;
        if (!aipp.a.matcher(uri.toString()).find() && !this.c.a(uri)) {
            z = false;
        }
        if (!z) {
            ((alwl) a.m().h("com/google/android/libraries/saferwebview/AbstractSaferWebViewClient", "isResourceAllowlisted", 290, "AbstractSaferWebViewClient.java")).t("Uri '%s' is not allowed as resource", aipp.a(uri));
        }
        return z;
    }

    private static boolean b(WebView webView, boolean z) {
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        if (a(webResourceRequest.getUrl())) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean a2 = this.b.a(webResourceRequest.getUrl());
        if (a2) {
            webResourceRequest.getUrl().toString();
        } else {
            webResourceRequest.getUrl().toString();
        }
        return b(webView, a2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri.parse(str);
        if (a(Uri.parse(str))) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return b(webView, this.b.a(Uri.parse(str)));
    }
}
