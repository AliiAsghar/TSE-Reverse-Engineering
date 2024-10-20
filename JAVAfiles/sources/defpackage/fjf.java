package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjf {
    public final int a;
    public final fid[] b;
    public final int[] c;
    public final int[][][] d;
    public final fid e;
    private final int[] f;

    public fjf(int[] iArr, fid[] fidVarArr, int[] iArr2, int[][][] iArr3, fid fidVar) {
        this.f = iArr;
        this.b = fidVarArr;
        this.d = iArr3;
        this.c = iArr2;
        this.e = fidVar;
        this.a = iArr.length;
    }

    public final int a(int i) {
        return this.f[i];
    }

    public final int b(int i, int i2, int i3) {
        return dzn.h(this.d[i][i2][i3]);
    }

    public final fid c(int i) {
        return this.b[i];
    }
}
