package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yte {
    public static final akwe a;

    static {
        String str = (String) yux.a.e();
        if (str == null) {
            str = "null";
        }
        int i = akwe.c;
        a = new akwe(Pattern.compile(str, 1), false);
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str) && Pattern.matches("(http(s?)://)?((maps\\.google\\.(\\w)+/)|((www\\.)?google\\.(\\w)+/maps[/?])|(maps.app.goo.gl/)|(goo.gl/maps/)).*", str)) {
            return true;
        }
        return false;
    }
}
