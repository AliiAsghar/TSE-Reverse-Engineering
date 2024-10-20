package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbh {
    public static final void a(float[] fArr, float[] fArr2) {
        float c = c(fArr2, 0, fArr, 0);
        float c2 = c(fArr2, 0, fArr, 1);
        float c3 = c(fArr2, 0, fArr, 2);
        float c4 = c(fArr2, 0, fArr, 3);
        float c5 = c(fArr2, 1, fArr, 0);
        float c6 = c(fArr2, 1, fArr, 1);
        float c7 = c(fArr2, 1, fArr, 2);
        float c8 = c(fArr2, 1, fArr, 3);
        float c9 = c(fArr2, 2, fArr, 0);
        float c10 = c(fArr2, 2, fArr, 1);
        float c11 = c(fArr2, 2, fArr, 2);
        float c12 = c(fArr2, 2, fArr, 3);
        float c13 = c(fArr2, 3, fArr, 0);
        float c14 = c(fArr2, 3, fArr, 1);
        float c15 = c(fArr2, 3, fArr, 2);
        float c16 = c(fArr2, 3, fArr, 3);
        fArr[0] = c;
        fArr[1] = c2;
        fArr[2] = c3;
        fArr[3] = c4;
        fArr[4] = c5;
        fArr[5] = c6;
        fArr[6] = c7;
        fArr[7] = c8;
        fArr[8] = c9;
        fArr[9] = c10;
        fArr[10] = c11;
        fArr[11] = c12;
        fArr[12] = c13;
        fArr[13] = c14;
        fArr[14] = c15;
        fArr[15] = c16;
    }

    public static final void b(float[] fArr, float f, float f2, float[] fArr2) {
        cll.c(fArr2);
        cll.f(fArr2, f, f2);
        a(fArr, fArr2);
    }

    private static final float c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        float f = fArr[i3] * fArr2[i2];
        float f2 = fArr[i3 + 1] * fArr2[i2 + 4];
        return f + f2 + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }
}
