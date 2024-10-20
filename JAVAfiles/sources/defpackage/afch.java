package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afch {
    private final WebResourceRequest a;
    private final WebResourceError b;

    public afch(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afch)) {
            return false;
        }
        afch afchVar = (afch) obj;
        if (d.F(this.a, afchVar.a) && d.F(this.b, afchVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        WebResourceRequest webResourceRequest = this.a;
        if (webResourceRequest == null) {
            hashCode = 0;
        } else {
            hashCode = webResourceRequest.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "WebViewError(request=" + this.a + ", error=" + this.b + ")";
    }
}
