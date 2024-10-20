package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msx {
    private final apwt k;
    private final apwt l;
    private static final alhr b = albo.D(new msu(4));
    public static final alhr a = albo.D(new msu(5));
    private static final xyw c = new xyw(TimeUnit.SECONDS.toMillis(10));
    private static final alhr d = albo.D(new msu(6));
    private static final xze e = xze.g("Bugle", "MessagingIdentitySanitizer");
    private static final Pattern f = Pattern.compile("\\A[ -~[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]+?@([0-9a-zA-Z:\\-\\(\\)\\[\\]]+\\.)*[0-9a-zA-Z:\\-\\(\\)\\[\\]]*?[a-zA-Z:\\-\\(\\)\\[\\]][0-9a-zA-Z:\\-\\(\\)\\[\\]]*\\z");
    private static final alhr g = albo.D(new msu(7));
    private static final alhr h = albo.D(new msu(8));
    private static final alhr i = albo.D(new msu(9));
    private static final alhr j = albo.D(new msu(10));

    public msx(apwt apwtVar, apwt apwtVar2) {
        this.k = apwtVar;
        this.l = apwtVar2;
    }

    public static String c(String str) {
        if (g(str)) {
            Matcher matcher = ((Pattern) g.get()).matcher(str);
            if (matcher.find()) {
                String group = matcher.group();
                if (group.length() > 1) {
                    return group.substring(1);
                }
                return "";
            }
            return "";
        }
        return "";
    }

    static String e(String str) {
        return ((Pattern) h.get()).matcher(str).replaceFirst("");
    }

    public static boolean f(String str) {
        boolean z;
        String e2 = e(str);
        if (!TextUtils.isEmpty(e2) && Character.isAlphabetic(Character.codePointAt(e2, 0))) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        int i3 = 0;
        for (char c2 : e2.toCharArray()) {
            if (Character.isDigit(c2)) {
                i2++;
            } else if (!Character.isWhitespace(c2) && Character.getType(c2) != 20) {
                i3++;
            }
        }
        if (i2 < 3 || i3 >= i2) {
            return true;
        }
        if (z && i2 <= 6) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 254) {
            return f.matcher(str).find();
        }
        return false;
    }

    @Deprecated
    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String replace = e(str).replace("-", "");
        if (!f(replace) && replace.length() > 6) {
            if (replace.length() > 8) {
                return false;
            }
            if (!replace.startsWith("19") && !replace.startsWith("9")) {
                return false;
            }
        }
        return true;
    }

    public final Optional a(String str) {
        Matcher matcher = ((Pattern) i.get()).matcher(str);
        if (matcher.find()) {
            return Optional.ofNullable(matcher.group(1)).map(new mqm(17));
        }
        return Optional.empty();
    }

    public final Optional b(String str) {
        Matcher matcher = ((Pattern) j.get()).matcher(str);
        if (matcher.find()) {
            return Optional.ofNullable(matcher.group(2));
        }
        return Optional.empty();
    }

    public final String d(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str) || str.trim().length() == 0) {
            return "";
        }
        String ap = d.ap(str);
        if (g(ap)) {
            return str;
        }
        if (i(ap)) {
            d.s(i(ap));
            if (!TextUtils.isEmpty(ap)) {
                if (!f(ap)) {
                    str2 = ap.replace("-", "");
                } else {
                    str2 = ap;
                }
                if (TextUtils.isEmpty(str2)) {
                    xyo b2 = e.b();
                    b2.H("short code could not be sanitized.");
                    b2.j(ap);
                    b2.q();
                    return ap;
                }
            }
            return str2;
        }
        String u = ((yjr) this.k.b()).u(((Pattern) b.get()).matcher(ap).replaceAll(""), anhl.E164);
        if (!u.equals(str)) {
            xyo a2 = e.a();
            a2.J(c, str);
            a2.H("sanitize");
            a2.j(str);
            a2.H("to");
            a2.j(u);
            a2.q();
        }
        if (TextUtils.isEmpty(u)) {
            xyo b3 = e.b();
            b3.H("could not sanitize");
            b3.j(str);
            b3.q();
            return str;
        }
        return u;
    }

    public final boolean h(String str) {
        return ((Boolean) ((Optional) this.l.b()).map(new moh(str, 20)).orElse(false)).booleanValue();
    }

    public final boolean j(String str) {
        String d2 = d(str);
        if (TextUtils.isEmpty(d2)) {
            return false;
        }
        if (!Patterns.PHONE.matcher(d2).matches() && !((Pattern) d.get()).matcher(d2).matches()) {
            return false;
        }
        return true;
    }

    public final boolean k(String str) {
        return ((Pattern) i.get()).matcher(str).matches();
    }
}
