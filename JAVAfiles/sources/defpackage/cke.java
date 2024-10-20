package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cke implements clr {
    public final Path a;
    public RectF b;
    public float[] c;
    private Matrix d;

    public cke() {
        this((byte[]) null);
    }

    @Override // defpackage.clr
    public final int a() {
        if (this.a.getFillType() == Path.FillType.EVEN_ODD) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.clr
    public final cjp b() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new cjp(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.clr
    public final void c() {
        this.a.close();
    }

    @Override // defpackage.clr
    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.clr
    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    @Override // defpackage.clr
    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.clr
    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.clr
    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.clr
    public final void i(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // defpackage.clr
    public final void j(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.clr
    public final void k() {
        this.a.reset();
    }

    @Override // defpackage.clr
    public final void l() {
        this.a.rewind();
    }

    @Override // defpackage.clr
    public final void m(int i) {
        Path.FillType fillType;
        if (a.bA(i, 1)) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }

    @Override // defpackage.clr
    public final void n(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Path path = this.a;
        Matrix matrix3 = this.d;
        matrix3.getClass();
        path.transform(matrix3);
    }

    @Override // defpackage.clr
    public final boolean o() {
        return this.a.isConvex();
    }

    @Override // defpackage.clr
    public final void p(clr clrVar, clr clrVar2, int i) {
        Path.Op op;
        if (a.bA(i, 0)) {
            op = Path.Op.DIFFERENCE;
        } else if (a.bA(i, 1)) {
            op = Path.Op.INTERSECT;
        } else if (a.bA(i, 4)) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (a.bA(i, 2)) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        this.a.op(((cke) clrVar).a, ((cke) clrVar2).a, op);
    }

    public cke(Path path) {
        this.a = path;
    }

    public /* synthetic */ cke(byte[] bArr) {
        this(new Path());
    }
}
