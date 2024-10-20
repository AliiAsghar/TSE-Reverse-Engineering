package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aife {
    public final String a;
    private final String b;

    public aife(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    public static aife a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(60);
            if (indexOf == -1) {
                return new aife(b(str));
            }
            if (indexOf > 0) {
                String trim = str.substring(0, indexOf).trim();
                if (trim.startsWith("\"")) {
                    trim = trim.substring(1);
                }
                if (trim.endsWith("\"")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                str2 = trim.trim();
            } else {
                str2 = null;
            }
            return new aife(str2, b(str.substring(indexOf)));
        }
        throw new IllegalArgumentException("Address must not be null");
    }

    private static String b(String str) {
        String trim = str.trim();
        if (trim.startsWith("<")) {
            trim = trim.substring(1);
        }
        if (trim.endsWith(">")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        return trim.trim();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aife)) {
            return false;
        }
        aife aifeVar = (aife) obj;
        if (!TextUtils.equals(this.b, aifeVar.b) || !TextUtils.equals(this.a, aifeVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{String.valueOf(this.b), this.a});
    }

    public final String toString() {
        String bW;
        String str = this.b;
        if (str == null) {
            bW = "<";
        } else {
            bW = a.bW(str, "\"", "\" <");
        }
        return bW + this.a + ">";
    }

    public aife(String str) {
        this(null, str);
    }
}
