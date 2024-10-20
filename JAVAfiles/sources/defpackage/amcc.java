package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcc {
    private static final alut a;

    static {
        char[][] cArr;
        HashMap hashMap = new HashMap();
        alzz.z('\"', "&quot;", hashMap);
        alzz.z('\'', "&#39;", hashMap);
        alzz.z('&', "&amp;", hashMap);
        alzz.z('<', "&lt;", hashMap);
        alzz.z('>', "&gt;", hashMap);
        if (hashMap.isEmpty()) {
            cArr = alus.a;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(hashMap.keySet())).charValue() + 1];
            for (Character ch : hashMap.keySet()) {
                cArr2[ch.charValue()] = ((String) hashMap.get(ch)).toCharArray();
            }
            cArr = cArr2;
        }
        a = new alut(new alus(cArr));
    }

    public static String a(String str) {
        char[] cArr;
        alut alutVar = a;
        str.getClass();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < alutVar.b && alutVar.a[charAt] != null) {
                int length = str.length();
                char[] cArr2 = (char[]) aluv.a.get();
                cArr2.getClass();
                int length2 = cArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i < length) {
                    int i4 = i + 1;
                    char charAt2 = str.charAt(i);
                    if (charAt2 >= alutVar.b || (cArr = alutVar.a[charAt2]) == null) {
                        char c = alutVar.c;
                        cArr = null;
                    }
                    if (cArr != null) {
                        int i5 = i - i2;
                        int i6 = i3 + i5;
                        int length3 = cArr.length;
                        int i7 = i6 + length3;
                        if (length2 < i7) {
                            int i8 = length - i;
                            length2 = i8 + i8 + i7;
                            cArr2 = alut.a(cArr2, i3, length2);
                        }
                        if (i5 > 0) {
                            str.getChars(i2, i, cArr2, i3);
                            i3 = i6;
                        }
                        if (length3 > 0) {
                            System.arraycopy(cArr, 0, cArr2, i3, length3);
                            i3 += length3;
                        }
                        i2 = i4;
                    }
                    i = i4;
                }
                int i9 = length - i2;
                if (i9 > 0) {
                    int i10 = i9 + i3;
                    if (length2 < i10) {
                        cArr2 = alut.a(cArr2, i3, i10);
                    }
                    str.getChars(i2, length, cArr2, i3);
                    i3 = i10;
                }
                return new String(cArr2, 0, i3);
            }
            char c2 = alutVar.c;
            i++;
        }
        return str;
    }
}
