package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drt {
    public static final float a(float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (f3 == f4) {
            f6 = 0.0f;
        } else {
            f6 = (f5 - f3) / (f4 - f3);
        }
        return f + ((f2 - f) * Math.max(brg.a, Math.min(1.0f, f6)));
    }
}
