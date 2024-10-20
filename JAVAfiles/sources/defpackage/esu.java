package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esu {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    private final float[] e;

    public esu(int i, int i2, float[] fArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Input channel count must be positive.");
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "Output channel count must be positive.");
        if (fArr.length == i * i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        d.t(z3, "Coefficient array length is invalid.");
        this.a = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < brg.a) {
                throw new IllegalArgumentException(a.cb(i3, "Coefficient at index ", " is negative."));
            }
        }
        this.e = fArr;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                float a = a(i4, i5);
                if (i4 == i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (a != 1.0f && z4) {
                    z7 = false;
                }
                if (a != brg.a) {
                    z5 = false;
                    if (!z4) {
                        z6 = false;
                    }
                }
            }
        }
        this.c = z5;
        this.d = this.a == this.b && z6 && z7;
    }

    public static esu b(int i, int i2) {
        float[] fArr;
        if (i == i2) {
            fArr = new float[i2 * i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[(i2 * i3) + i3] = 1.0f;
            }
        } else {
            int i4 = 2;
            if (i == 1) {
                if (i2 == 2) {
                    i2 = 2;
                    fArr = new float[]{1.0f, 1.0f};
                    i = 1;
                } else {
                    i = 1;
                }
            }
            int i5 = i;
            if (i == 2) {
                if (i2 == 1) {
                    fArr = new float[]{0.5f, 0.5f};
                    i = i5;
                }
            } else {
                i4 = i;
            }
            throw new UnsupportedOperationException(a.cl(i2, i4, "Default channel mixing coefficients for ", "->", " are not yet implemented."));
        }
        return new esu(i, i2, fArr);
    }

    public final float a(int i, int i2) {
        return this.e[(i * this.b) + i2];
    }
}
