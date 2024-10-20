package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etq {
    public final String a;
    public final int b;
    public final int c;
    public final float[] d = new float[16];
    public final int[] e = new int[4];
    public int f;
    public int g;

    public etq(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final void a(float[] fArr) {
        System.arraycopy(fArr, 0, this.d, 0, fArr.length);
    }
}
