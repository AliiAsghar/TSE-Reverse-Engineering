package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dde<T> {
    private final arqv a;
    private Matrix b;
    private Matrix c;
    private boolean f;
    private boolean g;
    private final float[] d = cll.e();
    private final float[] e = cll.e();
    private boolean h = true;
    private boolean i = true;

    public dde(arqv arqvVar) {
        this.a = arqvVar;
    }

    public final long a(Object obj, long j) {
        float[] h = h(obj);
        if (!this.i) {
            return cll.a(h, j);
        }
        return j;
    }

    public final long b(Object obj, long j) {
        float[] g = g(obj);
        if (g == null) {
            return 9187343241974906880L;
        }
        if (this.i) {
            return j;
        }
        return cll.a(g, j);
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }

    public final void d(Object obj, cjl cjlVar) {
        float[] h = h(obj);
        if (!this.i) {
            cll.b(h, cjlVar);
        }
    }

    public final void e(Object obj, cjl cjlVar) {
        float[] g = g(obj);
        if (g == null) {
            cjlVar.b(brg.a, brg.a, brg.a, brg.a);
        } else if (!this.i) {
            cll.b(g, cjlVar);
        }
    }

    public final void f() {
        this.f = false;
        this.g = false;
        this.i = true;
        this.h = true;
        cll.c(this.d);
        cll.c(this.e);
    }

    public final float[] g(Object obj) {
        float[] fArr = this.e;
        if (this.g) {
            this.h = ddc.a(h(obj), fArr);
            this.g = false;
        }
        if (this.h) {
            return fArr;
        }
        return null;
    }

    public final float[] h(Object obj) {
        float[] fArr = this.d;
        if (!this.f) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.a(obj, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !d.F(matrix, matrix2)) {
            ckb.b(fArr, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        this.i = clm.a(fArr);
        return fArr;
    }
}
