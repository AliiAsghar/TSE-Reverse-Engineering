package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcb extends amaz implements Serializable {
    public static final ambk a = new amcb();
    private static final long serialVersionUID = 0;
    private final int b = 0;
    private final boolean c = true;

    static {
        int i = ambp.a;
    }

    public static int h(byte[] bArr, int i) {
        return albo.cr(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    public static int i(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    public static int j(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public static long k(char c) {
        int i = ((c >>> 6) & 63) | 128;
        return (c >>> '\f') | 224 | (i << 8) | (((c & '?') | 128) << 16);
    }

    public static long l(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    public static long m(int i) {
        return (((i & 63) | 128) << 24) | ((((i >>> 12) & 63) | 128) << 8) | (i >>> 18) | 240 | ((((i >>> 6) & 63) | 128) << 16);
    }

    public static ambj n(int i, int i2) {
        int i3 = ambj.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new ambh(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.amaz
    public final ambj e(byte[] bArr, int i) {
        int i2 = 0;
        albo.S(0, i, bArr.length);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            if (i5 > i) {
                break;
            }
            i4 = i(i4, j(h(bArr, i3)));
            i3 = i5;
        }
        int i6 = 0;
        while (i3 < i) {
            i2 ^= albo.ci(bArr[i3]) << i6;
            i3++;
            i6 += 8;
        }
        return n(j(i2) ^ i4, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amcb) {
            amcb amcbVar = (amcb) obj;
            int i = amcbVar.b;
            boolean z = amcbVar.c;
            return true;
        }
        return false;
    }

    @Override // defpackage.ambk
    public final ambl f() {
        return new amca();
    }

    @Override // defpackage.ambk
    public final int g() {
        throw null;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
