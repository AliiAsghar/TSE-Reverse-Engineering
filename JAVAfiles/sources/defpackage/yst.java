package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yst {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/text/Base32Utils");
    private static final alhr b = albo.D(new xyn(12));
    private static final amcn c = amcn.g.f();

    public final String a(String str) {
        if (b(str)) {
            try {
                return new String(c.k(str), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                alvw h = a.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/text/Base32Utils", "decode", 'c', "Base32Utils.java")).q("UTF-8 unsupported, cannot decode Base32");
                return str;
            } catch (IllegalArgumentException unused) {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/text/Base32Utils", "decode", 96, "Base32Utils.java")).t("Base32Utils. %s is not Base32 encoded.", str);
            }
        }
        return str;
    }

    public final boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((Pattern) b.get()).matcher(str).matches();
    }

    public final String c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "@");
        if (stringTokenizer.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder(a(stringTokenizer.nextToken()));
            while (stringTokenizer.hasMoreTokens()) {
                sb.append("@");
                sb.append(stringTokenizer.nextToken());
            }
            return sb.toString();
        }
        return null;
    }

    public final String d(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "@");
        StringBuilder sb = new StringBuilder();
        if (stringTokenizer.hasMoreTokens()) {
            sb.append(c.j(stringTokenizer.nextToken().getBytes(StandardCharsets.UTF_8)));
            while (stringTokenizer.hasMoreTokens()) {
                sb.append("@");
                sb.append(stringTokenizer.nextToken());
            }
        }
        return sb.toString();
    }
}
