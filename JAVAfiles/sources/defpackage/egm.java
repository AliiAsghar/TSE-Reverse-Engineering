package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egm {
    public int a;
    public int b;
    public float c;
    public float d;
    public float h;
    public int i;
    public long e = Long.MIN_VALUE;
    public long g = -1;
    public long f = 0;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return brg.a;
        }
        long j3 = this.g;
        if (j3 >= 0 && j >= j3) {
            float f = this.h;
            return (1.0f - f) + (f * egn.a(((float) (j - j3)) / this.i, brg.a, 1.0f));
        }
        return egn.a(((float) (j - j2)) / this.a, brg.a, 1.0f) * 0.5f;
    }
}
