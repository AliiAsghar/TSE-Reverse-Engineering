package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckc implements clp {
    public Paint a;
    public int b;
    public Shader c;
    public ckv d;

    public ckc(Paint paint) {
        this.a = paint;
        this.b = 3;
    }

    @Override // defpackage.clp
    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    @Override // defpackage.clp
    public final float b() {
        return this.a.getStrokeMiter();
    }

    @Override // defpackage.clp
    public final float c() {
        return this.a.getStrokeWidth();
    }

    @Override // defpackage.clp
    public final int d() {
        if (!this.a.isFilterBitmap()) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.clp
    public final int e() {
        int i;
        Paint.Cap strokeCap = this.a.getStrokeCap();
        if (strokeCap == null || (i = ckd.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return 0;
        }
        return 2;
    }

    @Override // defpackage.clp
    public final int f() {
        int i;
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        if (strokeJoin == null || (i = ckd.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.clp
    public final long g() {
        return ckw.c(this.a.getColor());
    }

    @Override // defpackage.clp
    public final Paint h() {
        return this.a;
    }

    @Override // defpackage.clp
    public final void i(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // defpackage.clp
    public final void j(int i) {
        if (!a.bA(this.b, i)) {
            this.b = i;
            Paint paint = this.a;
            if (Build.VERSION.SDK_INT >= 29) {
                paint.setBlendMode(cjv.a(i));
            } else {
                paint.setXfermode(new PorterDuffXfermode(cjv.b(i)));
            }
        }
    }

    @Override // defpackage.clp
    public final void k(long j) {
        this.a.setColor(ckw.b(j));
    }

    @Override // defpackage.clp
    public final void l(ckv ckvVar) {
        ColorFilter colorFilter;
        this.d = ckvVar;
        Paint paint = this.a;
        if (ckvVar != null) {
            colorFilter = ckvVar.b;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // defpackage.clp
    public final void m(int i) {
        this.a.setFilterBitmap(!a.bA(i, 0));
    }

    @Override // defpackage.clp
    public final void n(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    @Override // defpackage.clp
    public final void o(int i) {
        Paint.Cap cap;
        Paint paint = this.a;
        if (a.bA(i, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (a.bA(i, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            a.bA(i, 0);
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    @Override // defpackage.clp
    public final void p(int i) {
        Paint.Join join;
        Paint paint = this.a;
        if (!a.bA(i, 0)) {
            if (a.bA(i, 2)) {
                join = Paint.Join.BEVEL;
            } else if (a.bA(i, 1)) {
                join = Paint.Join.ROUND;
            }
            paint.setStrokeJoin(join);
        }
        join = Paint.Join.MITER;
        paint.setStrokeJoin(join);
    }

    @Override // defpackage.clp
    public final void q(float f) {
        this.a.setStrokeMiter(f);
    }

    @Override // defpackage.clp
    public final void r(float f) {
        this.a.setStrokeWidth(f);
    }

    @Override // defpackage.clp
    public final void s(int i) {
        Paint.Style style;
        Paint paint = this.a;
        if (a.bA(i, 1)) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    @Override // defpackage.clp
    public final void t() {
        this.a.setPathEffect(null);
    }

    public ckc() {
        this(new Paint(7));
    }
}
