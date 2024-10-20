package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afca extends WebChromeClient {
    public adec a;

    public final adec a() {
        adec adecVar = this.a;
        if (adecVar != null) {
            return adecVar;
        }
        arro.b("state");
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [cas, java.lang.Object] */
    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        webView.getClass();
        super.onProgressChanged(webView, i);
        if (((adom) a().b.a()) instanceof afcb) {
            return;
        }
        a().j(new afcd(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        webView.getClass();
        super.onReceivedIcon(webView, bitmap);
        a().b(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        webView.getClass();
        super.onReceivedTitle(webView, str);
        a().c(str);
    }
}
