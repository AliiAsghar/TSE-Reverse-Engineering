package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class amcn {
    public static final amcn e = new amck("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final amcn f = new amck("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final amcn g = new amcm("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final amcn h;

    static {
        new amcm("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        h = new amcj(new amci("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void c(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract amcn f();

    public abstract amcn g();

    public CharSequence h(CharSequence charSequence) {
        throw null;
    }

    public final String j(byte[] bArr) {
        int length = bArr.length;
        albo.S(0, length, length);
        StringBuilder sb = new StringBuilder(e(length));
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] k(CharSequence charSequence) {
        try {
            CharSequence h2 = h(charSequence);
            int d = d(h2.length());
            byte[] bArr = new byte[d];
            int a = a(bArr, h2);
            if (a != d) {
                byte[] bArr2 = new byte[a];
                System.arraycopy(bArr, 0, bArr2, 0, a);
                return bArr2;
            }
            return bArr;
        } catch (amcl e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
