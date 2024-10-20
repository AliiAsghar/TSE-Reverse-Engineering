package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edq {
    public final float[] a = new float[20];
    public final long[] b = new long[20];
    public float c = brg.a;
    public int d = 0;
    public int e = 0;

    public static float a(float f) {
        float f2;
        float abs = Math.abs(f);
        float sqrt = (float) Math.sqrt(abs + abs);
        if (f < brg.a) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        return f2 * sqrt;
    }
}
