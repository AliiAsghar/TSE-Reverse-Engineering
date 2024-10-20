package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtv {
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final String a;
    public String b;
    public String c;
    public String d;
    public String e;
    private int g;
    private MessageDigest h;

    public adtv() {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(currentTimeMillis);
        this.a = sb.toString();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = 0;
    }

    private final String d(String str) {
        if (this.h == null) {
            this.h = MessageDigest.getInstance("MD5");
        }
        if (str == null) {
            str = "";
        }
        this.h.update(str.getBytes());
        byte[] digest = this.h.digest();
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : digest) {
            char[] cArr2 = f;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public final String a() {
        String hexString = Integer.toHexString(this.g);
        while (hexString.length() != 8) {
            hexString = "0".concat(String.valueOf(hexString));
        }
        return hexString;
    }

    public final String b(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        if (str != null && (str7 = this.b) != null && str4 != null && this.c != null) {
            String str8 = str + ":" + str7 + ":" + str2;
            String co = a.co(str4, str3, ":");
            String str9 = this.e;
            if (str9 != null) {
                if (str9.startsWith("auth")) {
                    if (str5 != null) {
                        if (this.e.equals("auth-int")) {
                            co = co + ":" + d(str6);
                        }
                        return d(d(str8) + ":" + this.c + ":" + str5 + ":" + this.a + ":" + this.e + ":" + d(co));
                    }
                    throw new IllegalArgumentException("Invalid Authorization header: null/" + this.a);
                }
                throw new IllegalArgumentException("Invalid qop: ".concat(String.valueOf(this.e)));
            }
            return d(d(str8) + ":" + this.c + ":" + d(co));
        }
        throw new IllegalArgumentException("Invalid Authorization header" + str + "/" + this.b + "/" + str4 + "/" + this.c);
    }

    public final void c() {
        String str = this.d;
        str.getClass();
        if (str.equals(this.c)) {
            this.g++;
        } else {
            this.g = 1;
            this.c = this.d;
        }
    }
}
