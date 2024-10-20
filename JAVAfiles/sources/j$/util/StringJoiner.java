package j$.util;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class StringJoiner {
    private final String a;
    private final String b;
    private final String c;
    private String[] d;
    private int e;
    private int f;

    public StringJoiner(CharSequence charSequence) {
        this(charSequence, "", "");
    }

    private void a() {
        String[] strArr;
        if (this.e > 1) {
            char[] cArr = new char[this.f];
            int b = b(this.d[0], cArr, 0);
            int i = 1;
            do {
                int b2 = b + b(this.b, cArr, b);
                b = b2 + b(this.d[i], cArr, b2);
                strArr = this.d;
                strArr[i] = null;
                i++;
            } while (i < this.e);
            this.e = 1;
            strArr[0] = new String(cArr);
        }
    }

    private static int b(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public StringJoiner add(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.d;
        if (strArr == null) {
            this.d = new String[8];
        } else {
            int i = this.e;
            if (i == strArr.length) {
                this.d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = valueOf.length() + this.f;
        String[] strArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        strArr2[i2] = valueOf;
        return this;
    }

    public final StringJoiner c(StringJoiner stringJoiner) {
        stringJoiner.getClass();
        if (stringJoiner.d == null) {
            return this;
        }
        stringJoiner.a();
        return add(stringJoiner.d[0]);
    }

    public String toString() {
        String[] strArr = this.d;
        int i = this.e;
        String str = this.a;
        int length = str.length();
        String str2 = this.c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            a();
            if (i == 0) {
                return "";
            }
            return strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int b = b(str, cArr, 0);
        if (i > 0) {
            b += b(strArr[0], cArr, b);
            for (int i2 = 1; i2 < i; i2++) {
                int b2 = b + b(this.b, cArr, b);
                b = b2 + b(strArr[i2], cArr, b2);
            }
        }
        b(str2, cArr, b);
        return new String(cArr);
    }

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.a(charSequence2, "The prefix must not be null");
        Objects.a(charSequence, "The delimiter must not be null");
        Objects.a(charSequence3, "The suffix must not be null");
        this.a = charSequence2.toString();
        this.b = charSequence.toString();
        this.c = charSequence3.toString();
    }
}
