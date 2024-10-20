package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class koj {
    public final float[] a;
    public double b;

    private koj(float[] fArr) {
        this.a = fArr;
    }

    public static koj a() {
        return new koj(new float[3]);
    }

    public final void b(float[] fArr) {
        for (int i = 0; i < 3; i++) {
            this.a[i] = fArr[i];
        }
        float[] fArr2 = this.a;
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        this.b = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }
}
