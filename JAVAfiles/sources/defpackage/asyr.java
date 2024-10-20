package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asyr extends asyo {
    public short[][][] c;
    public byte[] d;
    public short[][][] e;
    public short[][][] f;
    public short[][][] g;
    public short[][][] h;
    public short[][][] i;

    public asyr(asyp asypVar, byte[] bArr) {
        super(false, asypVar);
        int i = asypVar.k;
        int i2 = asypVar.j;
        if (this.b.m == 1) {
            this.c = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i; i6++) {
                        if (i4 > i5) {
                            this.c[i6][i4][i5] = 0;
                        } else {
                            this.c[i6][i4][i5] = (short) (bArr[i3] & 255);
                            i3++;
                        }
                    }
                }
            }
            return;
        }
        this.d = atow.S(bArr, 0, 32);
        int i7 = asypVar.h;
        int i8 = asypVar.g;
        int i9 = asypVar.i;
        this.e = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i8, i9);
        this.f = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i7);
        this.g = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i9);
        this.h = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i9, i9);
        this.i = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i9, i9, i9);
        int aw = atow.aw(this.e, bArr, 32, false) + 32;
        int aw2 = aw + atow.aw(this.f, bArr, aw, true);
        int aw3 = aw2 + atow.aw(this.g, bArr, aw2, false);
        int aw4 = aw3 + atow.aw(this.h, bArr, aw3, true);
        if (aw4 + atow.aw(this.i, bArr, aw4, true) != bArr.length) {
            throw new IllegalArgumentException("unparsed data in key encoding");
        }
    }
}
