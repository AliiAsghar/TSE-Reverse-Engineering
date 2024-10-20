package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class atma {
    private static Integer[] f = new Integer[64];
    public final String c;
    public final int d;
    private String g;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public int e = Integer.MAX_VALUE;

    static {
        int i = 0;
        while (true) {
            int length = f.length;
            if (i < 64) {
                f[i] = new Integer(i);
                i++;
            } else {
                return;
            }
        }
    }

    public atma(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public static Integer b(int i) {
        if (i >= 0) {
            Integer[] numArr = f;
            int length = numArr.length;
            if (i < 64) {
                return numArr[i];
            }
        }
        return new Integer(i);
    }

    private final String g(String str) {
        if (this.d == 2) {
            return str.toUpperCase();
        }
        return str.toLowerCase();
    }

    public void a(int i) {
        if (i >= 0 && i <= this.e) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(i);
        stringBuffer.append("is out of range");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public final String c(int i) {
        a(i);
        String str = (String) this.b.get(b(i));
        if (str != null) {
            return str;
        }
        String num = Integer.toString(i);
        if (this.g != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.g);
            stringBuffer.append(num);
            return stringBuffer.toString();
        }
        return num;
    }

    public final void d(int i, String str) {
        a(i);
        Integer b = b(i);
        HashMap hashMap = this.a;
        String g = g(str);
        hashMap.put(g, b);
        this.b.put(b, g);
    }

    public final void e(int i, String str) {
        a(i);
        this.a.put(g(str), b(i));
    }

    public final void f(String str) {
        this.g = g(str);
    }
}
