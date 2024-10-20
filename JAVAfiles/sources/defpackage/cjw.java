package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjw implements ckr {
    public Canvas a = cjx.a;
    private Rect b;
    private Rect c;

    public static final Region.Op q(int i) {
        if (a.bA(i, 0)) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    @Override // defpackage.ckr
    public final void a(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, q(i));
    }

    @Override // defpackage.ckr
    public final void b(float[] fArr) {
        if (!clm.a(fArr)) {
            Matrix matrix = new Matrix();
            ckb.a(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.ckr
    public final void c() {
        ckt.a(this.a, false);
    }

    @Override // defpackage.ckr
    public final void d(long j, float f, clp clpVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, ((ckc) clpVar).a);
    }

    @Override // defpackage.ckr
    public final void e(long j, long j2, clp clpVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), ((ckc) clpVar).a);
    }

    @Override // defpackage.ckr
    public final void f(clr clrVar, clp clpVar) {
        boolean z = clrVar instanceof cke;
        Canvas canvas = this.a;
        if (z) {
            canvas.drawPath(((cke) clrVar).a, ((ckc) clpVar).a);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.ckr
    public final void g(float f, float f2, float f3, float f4, clp clpVar) {
        this.a.drawRect(f, f2, f3, f4, ((ckc) clpVar).a);
    }

    @Override // defpackage.ckr
    public final void h(float f, float f2, float f3, float f4, float f5, float f6, clp clpVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, ((ckc) clpVar).a);
    }

    @Override // defpackage.ckr
    public final void i() {
        ckt.a(this.a, true);
    }

    @Override // defpackage.ckr
    public final void j() {
        this.a.restore();
    }

    @Override // defpackage.ckr
    public final void k(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.ckr
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.ckr
    public final void m(cjp cjpVar, clp clpVar) {
        this.a.saveLayer(cjpVar.b, cjpVar.c, cjpVar.d, cjpVar.e, clpVar.h(), 31);
    }

    @Override // defpackage.ckr
    public final void n(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ckr
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ckr
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, clp clpVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, ((ckc) clpVar).a);
    }

    @Override // defpackage.ckr
    public final void r(clr clrVar) {
        this.a.clipPath(((cke) clrVar).a, q(1));
    }

    @Override // defpackage.ckr
    public final /* synthetic */ void s(cjp cjpVar) {
        ckq.d(this, cjpVar);
    }

    @Override // defpackage.ckr
    public final void t(clg clgVar, clp clpVar) {
        this.a.drawBitmap(cka.a(clgVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), ((ckc) clpVar).a);
    }

    @Override // defpackage.ckr
    public final void u(clg clgVar, long j, long j2, clp clpVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap a = cka.a(clgVar);
        Rect rect = this.b;
        rect.getClass();
        rect.left = dre.a(0L);
        rect.top = dre.b(0L);
        rect.right = dre.a(0L) + ((int) (j >> 32));
        rect.bottom = dre.b(0L) + ((int) (j & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = dre.a(0L);
        rect2.top = dre.b(0L);
        rect2.right = dre.a(0L) + ((int) (j2 >> 32));
        rect2.bottom = dre.b(0L) + ((int) (j2 & 4294967295L));
        canvas.drawBitmap(a, rect, rect2, ((ckc) clpVar).a);
    }
}
