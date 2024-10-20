package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkt {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public fkt(int i, float[] fArr, float[] fArr2, int i2) {
        this.a = i;
        long length = fArr2.length;
        long length2 = fArr.length;
        d.s(length2 + length2 == length * 3);
        this.c = fArr;
        this.d = fArr2;
        this.b = i2;
    }

    public fkt(fkt fktVar) {
        float[] fArr = (float[]) fktVar.c;
        this.a = fArr.length / 3;
        this.c = ett.k(fArr);
        this.d = ett.k((float[]) fktVar.d);
        int i = fktVar.b;
        this.b = i != 1 ? i != 2 ? 4 : 6 : 5;
    }
}
