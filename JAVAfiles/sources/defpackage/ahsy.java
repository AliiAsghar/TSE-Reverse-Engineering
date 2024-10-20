package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahsy {
    public static final /* synthetic */ int a = 0;
    private static final tm b = new tm();

    private ahsy() {
    }

    public static synchronized Uri a(String str) {
        synchronized (ahsy.class) {
            tm tmVar = b;
            Uri uri = (Uri) tmVar.get(str);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
                tmVar.put(str, parse);
                return parse;
            }
            return uri;
        }
    }

    public static String b(String str) {
        int indexOf = str.indexOf("#");
        if (indexOf < 0) {
            if (!str.contains("@")) {
                return str;
            }
            throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str)));
        }
        return str.substring(0, indexOf);
    }

    public static String c(Context context, String str) {
        if (!str.contains("#")) {
            return str + "#" + context.getPackageName();
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
    }
}
