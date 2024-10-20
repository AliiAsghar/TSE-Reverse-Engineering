package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckk {
    public static final int a(float f, float[] fArr, int i) {
        float f2 = brg.a;
        if (f >= brg.a) {
            f2 = f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        if (Float.isNaN(f2)) {
            return 0;
        }
        return 1;
    }
}
