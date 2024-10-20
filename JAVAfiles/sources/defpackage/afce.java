package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afce extends aipn {
    public adtl a;
    public adec b;

    public afce(aipq aipqVar) {
        super(aipqVar, aipqVar);
    }

    public final adtl a() {
        adtl adtlVar = this.a;
        if (adtlVar != null) {
            return adtlVar;
        }
        arro.b("navigator");
        return null;
    }

    public final adec b() {
        adec adecVar = this.b;
        if (adecVar != null) {
            return adecVar;
        }
        arro.b("state");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [byn, java.lang.Object] */
    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        String str2;
        afcg afcgVar;
        webView.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        if (str != null && !arsd.z(str, "data:text/html", false)) {
            adom i = b().i();
            if (i instanceof afcg) {
                str2 = ((afcg) i).a;
            } else if (i instanceof afcf) {
                str2 = null;
            } else {
                throw new armm();
            }
            if (!d.F(str2, str)) {
                adec b = b();
                adom i2 = b().i();
                i2.getClass();
                if (i2 instanceof afcg) {
                    afcgVar = new afcg(str, ((afcg) i2).b);
                } else {
                    afcgVar = new afcg(str, arnw.a);
                }
                b.a.h(afcgVar);
            }
        }
        a().p(webView.canGoBack());
        a().q(webView.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        super.onPageFinished(webView, str);
        b().j(afcb.a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        super.onPageStarted(webView, str, bitmap);
        b().j(new afcd(brg.a));
        ((cez) b().d).clear();
        b().c(null);
        b().b(null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            ((cez) b().d).add(new afch(webResourceRequest, webResourceError));
        }
    }
}
