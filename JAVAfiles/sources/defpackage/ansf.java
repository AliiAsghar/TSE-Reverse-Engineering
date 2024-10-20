package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansf {
    public static final byte[] a = b(1, 0);
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;

    static {
        b(1, 2);
        b = b(2, 32);
        c = b(2, 16);
        d = b(2, 17);
        e = b(2, 18);
        f = b(2, 1);
        g = b(2, 2);
        h = b(2, 3);
        i = b(2, 1);
        j = b(2, 2);
        k = b(2, 3);
        l = new byte[0];
        n = "KEM".getBytes(anuk.a);
        m = "HPKE".getBytes(anuk.a);
        o = "HPKE-v1".getBytes(anuk.a);
    }

    public static int a(anrd anrdVar) {
        if (anrdVar == anrd.f || anrdVar == anrd.a) {
            return 32;
        }
        if (anrdVar == anrd.b) {
            return 48;
        }
        if (anrdVar == anrd.c) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static byte[] b(int i2, int i3) {
        if (i3 >= 0 && i3 < (1 << (i2 * 8))) {
            byte[] bArr = new byte[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & 255);
            }
            return bArr;
        }
        throw new IllegalArgumentException("value too large");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(byte[] bArr) {
        return aode.O(n, bArr);
    }

    public static byte[] d(String str, byte[] bArr, byte[] bArr2) {
        return aode.O(o, bArr2, str.getBytes(anuk.a), bArr);
    }

    public static byte[] e(String str, byte[] bArr, byte[] bArr2, int i2) {
        return aode.O(b(2, i2), o, bArr2, str.getBytes(anuk.a), bArr);
    }
}
