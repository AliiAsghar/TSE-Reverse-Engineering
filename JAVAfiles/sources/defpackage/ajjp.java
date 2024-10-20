package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjp {
    final ajiv a;
    final Path b;
    final Path c;
    final PathMeasure d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private float l;
    private boolean m;
    private boolean n;
    private float o;

    public ajjp(ajiv ajivVar) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = ajivVar;
    }

    private final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Paint.Cap cap;
        int i4;
        float f6;
        if (f2 >= f) {
            f5 = f2 - f;
        } else {
            f5 = (f2 + 1.0f) - f;
        }
        float f7 = f % 1.0f;
        if (f7 < brg.a) {
            f7 += 1.0f;
        }
        float f8 = f7;
        if (this.o < 1.0f) {
            float f9 = f8 + f5;
            if (f9 > 1.0f) {
                f(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                f(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f / this.h);
        float f10 = (-0.99f) + f5;
        if (f10 >= brg.a) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f5 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float f12 = this.o;
        float m = ajgk.m(1.0f - f12, 1.0f, f8);
        float m2 = ajgk.m(brg.a, f12, f5);
        float degrees2 = (float) Math.toDegrees(i2 / this.h);
        float degrees3 = ((m2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.h));
        if (degrees3 > brg.a) {
            boolean z2 = false;
            if (this.a.b(this.n) && z && f3 > brg.a) {
                z2 = true;
            }
            float f13 = (m * 360.0f) + degrees2;
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.e);
            float f14 = this.f;
            float f15 = f14 + f14;
            float f16 = degrees + degrees;
            if (degrees3 < f16) {
                float f17 = degrees3 / f16;
                float f18 = f13 + (degrees * f17);
                agrk agrkVar = new agrk();
                if (!z2) {
                    agrkVar.q(f18 + 90.0f);
                    agrkVar.o(-this.h);
                } else {
                    float length = ((f18 / 360.0f) * this.d.getLength()) / 2.0f;
                    float f19 = this.g * f3;
                    float f20 = this.h;
                    if (f20 != this.l || f19 != this.j) {
                        this.j = f19;
                        this.l = f20;
                        e();
                    }
                    this.d.getPosTan(length, (float[]) agrkVar.b, (float[]) agrkVar.a);
                }
                paint.setStyle(Paint.Style.FILL);
                h(canvas, paint, agrkVar, f15, this.e, f17);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (this.m) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f21 = degrees + f13;
            float f22 = degrees3 - f16;
            Pair pair = new Pair(new agrk(), new agrk());
            if (!z2) {
                ((agrk) pair.first).q(f21 + 90.0f);
                ((agrk) pair.first).o(-this.h);
                ((agrk) pair.second).q(f21 + f22 + 90.0f);
                ((agrk) pair.second).o(-this.h);
                float f23 = this.h;
                float f24 = -f23;
                canvas.drawArc(new RectF(f24, f24, f23, f23), f21, f22, false, paint);
            } else {
                PathMeasure pathMeasure = this.d;
                Path path = this.c;
                float f25 = f21 / 360.0f;
                float f26 = f22 / 360.0f;
                float f27 = this.g * f3;
                if (this.n) {
                    i4 = ((ajjg) this.a).h;
                } else {
                    i4 = ((ajjg) this.a).i;
                }
                float f28 = this.h;
                if (f28 != this.l || f27 != this.j || i4 != this.k) {
                    this.j = f27;
                    this.k = i4;
                    this.l = f28;
                    e();
                }
                path.rewind();
                float b = dze.b(f26, brg.a, 1.0f);
                if (this.a.b(this.n)) {
                    float f29 = f4 / ((float) ((this.h * 6.283185307179586d) / this.i));
                    f25 += f29;
                    f6 = -(f29 * 360.0f);
                } else {
                    f6 = 0.0f;
                }
                float f30 = f25 % 1.0f;
                float length2 = (pathMeasure.getLength() * f30) / 2.0f;
                float length3 = ((f30 + b) * pathMeasure.getLength()) / 2.0f;
                pathMeasure.getSegment(length2, length3, path, true);
                agrk agrkVar2 = new agrk();
                pathMeasure.getPosTan(length2, (float[]) agrkVar2.b, (float[]) agrkVar2.a);
                agrk agrkVar3 = new agrk();
                pathMeasure.getPosTan(length3, (float[]) agrkVar3.b, (float[]) agrkVar3.a);
                Matrix matrix = new Matrix();
                matrix.setRotate(f6);
                agrkVar2.q(f6);
                agrkVar3.q(f6);
                path.transform(matrix);
                pair = new Pair(agrkVar2, agrkVar3);
                canvas.drawPath(this.c, paint);
            }
            if (!this.m && this.f > brg.a) {
                paint.setStyle(Paint.Style.FILL);
                g(canvas, paint, (agrk) pair.first, f15, this.e);
                g(canvas, paint, (agrk) pair.second, f15, this.e);
            }
        }
    }

    private final void g(Canvas canvas, Paint paint, agrk agrkVar, float f, float f2) {
        h(canvas, paint, agrkVar, f, f2, 1.0f);
    }

    private final void h(Canvas canvas, Paint paint, agrk agrkVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.e);
        float f4 = -f;
        float f5 = f / 2.0f;
        float min2 = Math.min(f5, (this.f * min) / this.e);
        RectF rectF = new RectF(f4 / 2.0f, (-min) / 2.0f, f5, min / 2.0f);
        canvas.save();
        float[] fArr = (float[]) agrkVar.b;
        canvas.translate(fArr[0], fArr[1]);
        float[] fArr2 = (float[]) agrkVar.a;
        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr2[1], fArr2[0])));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if (r9.f == 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (r9.f == 2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.graphics.Canvas r9, android.graphics.Rect r10, float r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjp.a(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    public final int b() {
        ajjg ajjgVar = (ajjg) this.a;
        int i = ajjgVar.m;
        int i2 = ajjgVar.n;
        return i + i2 + i2;
    }

    public final void c(Canvas canvas, Paint paint, ajjo ajjoVar, int i) {
        int c = ahnz.c(ajjoVar.c, i);
        canvas.save();
        canvas.rotate(ajjoVar.g);
        this.n = ajjoVar.h;
        float f = ajjoVar.a;
        float f2 = ajjoVar.b;
        int i2 = ajjoVar.d;
        f(canvas, paint, f, f2, c, 0, 0, ajjoVar.e, ajjoVar.f, true);
        canvas.restore();
    }

    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int c = ahnz.c(i, i2);
        this.n = false;
        f(canvas, paint, f, f2, c, i3, i3, brg.a, brg.a, false);
    }

    public final void e() {
        int i;
        this.b.rewind();
        this.b.moveTo(1.0f, brg.a);
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, brg.a, 1.0f);
            this.b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, brg.a);
            this.b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, brg.a, -1.0f);
            this.b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, brg.a);
        }
        Matrix matrix = new Matrix();
        float f = this.h;
        matrix.setScale(f, f);
        this.b.transform(matrix);
        if (this.a.b(this.n)) {
            this.d.setPath(this.b, false);
            PathMeasure pathMeasure = this.d;
            Path path = this.b;
            float f2 = this.j;
            path.rewind();
            float length = pathMeasure.getLength();
            if (this.n) {
                i = ((ajjg) this.a).h;
            } else {
                i = ((ajjg) this.a).i;
            }
            int max = Math.max(3, (int) ((length / i) / 2.0f));
            int i3 = max + max;
            this.i = length / i3;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i3; i4++) {
                agrk agrkVar = new agrk();
                float f3 = i4;
                pathMeasure.getPosTan(this.i * f3, (float[]) agrkVar.b, (float[]) agrkVar.a);
                agrk agrkVar2 = new agrk();
                float f4 = this.i;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) agrkVar2.b, (float[]) agrkVar2.a);
                arrayList.add(agrkVar);
                agrkVar2.o(f2 + f2);
                arrayList.add(agrkVar2);
            }
            arrayList.add((agrk) arrayList.get(0));
            agrk agrkVar3 = (agrk) arrayList.get(0);
            float[] fArr = (float[]) agrkVar3.b;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                agrk agrkVar4 = (agrk) arrayList.get(i5);
                float f5 = this.i / 2.0f;
                agrk agrkVar5 = new agrk(agrkVar3);
                agrk agrkVar6 = new agrk(agrkVar4);
                float f6 = f5 * 0.48f;
                agrkVar5.p(f6);
                agrkVar6.p(-f6);
                float[] fArr2 = (float[]) agrkVar5.b;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) agrkVar6.b;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) agrkVar4.b;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i5++;
                agrkVar3 = agrkVar4;
            }
        }
        this.d.setPath(this.b, false);
    }
}
