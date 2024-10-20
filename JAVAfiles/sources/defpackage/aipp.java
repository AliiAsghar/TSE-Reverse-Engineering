package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aipp {
    public static final Pattern a = Pattern.compile("^data:[-\\w]+/[-+\\w]+;(charset=(utf|UTF)-8;)?base64,");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Uri uri) {
        if (uri == null) {
            return "<NULL>";
        }
        String trim = uri.toString().trim();
        if (trim.isEmpty()) {
            return "<EMPTY>";
        }
        if (albo.ah(uri.getScheme())) {
            return "<REDACTED>";
        }
        if (!URLUtil.isNetworkUrl(trim)) {
            return String.format("%s:%s", uri.getScheme(), "<REDACTED>");
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(uri.getScheme());
        sb.append("://");
        if (!albo.ah(uri.getHost())) {
            sb.append(uri.getHost());
        }
        if (uri.getPort() != -1) {
            sb.append(":");
            sb.append(uri.getPort());
        }
        sb.append("/<REDACTED>");
        return sb.toString();
    }
}
