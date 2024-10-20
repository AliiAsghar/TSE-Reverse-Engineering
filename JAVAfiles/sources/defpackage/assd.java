package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class assd {
    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static String b(String str, char c) {
        if (str == null) {
            return null;
        }
        int length = 2 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            String valueOf = String.valueOf(c);
            int i = 1;
            if (true == a(valueOf)) {
                valueOf = " ";
            }
            int length2 = 2 - str.length();
            int length3 = valueOf.length();
            if (length2 > 0) {
                if (length3 == 1) {
                    if (length2 <= 8192) {
                        return b(str, valueOf.charAt(0));
                    }
                } else {
                    i = length3;
                }
                if (length2 == i) {
                    return valueOf.concat(str);
                }
                if (length2 < i) {
                    return valueOf.substring(0, length2).concat(str);
                }
                char[] cArr = new char[length2];
                char[] charArray = valueOf.toCharArray();
                for (int i2 = 0; i2 < length2; i2++) {
                    cArr[i2] = charArray[i2 % i];
                }
                return new String(cArr).concat(str);
            }
            return str;
        }
        char[] cArr2 = new char[length];
        Arrays.fill(cArr2, c);
        return new String(cArr2).concat(str);
    }
}
