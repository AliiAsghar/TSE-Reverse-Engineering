package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkt {
    private final ajlb[] a = new ajlb[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final ajlb g = new ajlb();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public ajkt() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new ajlb();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final ajkg b(int i, ajkr ajkrVar) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return ajkrVar.c;
                }
                return ajkrVar.b;
            }
            return ajkrVar.e;
        }
        return ajkrVar.d;
    }

    private final boolean d(Path path, int i) {
        this.k.reset();
        this.a[i].c(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    private static final float e(int i) {
        return ((i + 1) % 4) * 90;
    }

    public final void a(ajkr ajkrVar, RectF rectF, Path path) {
        c(ajkrVar, null, 1.0f, rectF, null, path);
    }

    public final void c(ajkr ajkrVar, float[] fArr, float f, RectF rectF, asqc asqcVar, Path path) {
        int i;
        char c;
        char c2;
        char c3;
        char c4;
        ajkg ajkfVar;
        ajki ajkiVar;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            c = 1;
            if (i2 >= 4) {
                break;
            }
            if (fArr == null) {
                ajkfVar = b(i2, ajkrVar);
            } else {
                ajkfVar = new ajkf(fArr[i2]);
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ajkiVar = ajkrVar.k;
                    } else {
                        ajkiVar = ajkrVar.j;
                    }
                } else {
                    ajkiVar = ajkrVar.m;
                }
            } else {
                ajkiVar = ajkrVar.l;
            }
            ajkiVar.a(this.a[i2], f, ajkfVar.a(rectF));
            float e = e(i2);
            this.b[i2].reset();
            PointF pointF = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
            }
            Matrix matrix = this.b[i2];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[i2].preRotate(e);
            float[] fArr2 = this.h;
            ajlb ajlbVar = this.a[i2];
            fArr2[0] = ajlbVar.b;
            fArr2[1] = ajlbVar.c;
            this.b[i2].mapPoints(fArr2);
            float e2 = e(i2);
            this.c[i2].reset();
            Matrix matrix2 = this.c[i2];
            float[] fArr3 = this.h;
            matrix2.setTranslate(fArr3[0], fArr3[1]);
            this.c[i2].preRotate(e2);
            i2++;
        }
        int i3 = 0;
        for (i = 4; i3 < i; i = 4) {
            float[] fArr4 = this.h;
            ajlb ajlbVar2 = this.a[i3];
            fArr4[0] = 0.0f;
            fArr4[c] = ajlbVar2.a;
            this.b[i3].mapPoints(fArr4);
            if (i3 == 0) {
                float[] fArr5 = this.h;
                path.moveTo(fArr5[0], fArr5[c]);
            } else {
                float[] fArr6 = this.h;
                path.lineTo(fArr6[0], fArr6[c]);
            }
            this.a[i3].c(this.b[i3], path);
            if (asqcVar != null) {
                ajlb ajlbVar3 = this.a[i3];
                Matrix matrix3 = this.b[i3];
                ((ajkm) asqcVar.a).r.set(i3, false);
                ((ajkm) asqcVar.a).p[i3] = ajlbVar3.a(matrix3);
            }
            int i4 = i3 + 1;
            float[] fArr7 = this.h;
            ajlb ajlbVar4 = this.a[i3];
            fArr7[0] = ajlbVar4.b;
            fArr7[c] = ajlbVar4.c;
            this.b[i3].mapPoints(fArr7);
            float[] fArr8 = this.i;
            int i5 = i4 % 4;
            ajlb ajlbVar5 = this.a[i5];
            fArr8[0] = 0.0f;
            fArr8[c] = ajlbVar5.a;
            this.b[i5].mapPoints(fArr8);
            float f2 = this.h[0];
            float[] fArr9 = this.i;
            float max = Math.max(((float) Math.hypot(f2 - fArr9[0], r12[c] - fArr9[c])) - 0.001f, brg.a);
            float[] fArr10 = this.h;
            ajlb ajlbVar6 = this.a[i3];
            fArr10[0] = ajlbVar6.b;
            fArr10[1] = ajlbVar6.c;
            this.b[i3].mapPoints(fArr10);
            if (i3 != 1 && i3 != 3) {
                Math.abs(rectF.centerY() - this.h[1]);
            } else {
                Math.abs(rectF.centerX() - this.h[0]);
            }
            this.g.e();
            if (i3 != 1) {
                c2 = 2;
                if (i3 != 2) {
                    c3 = 3;
                    if (i3 != 3) {
                        ajki ajkiVar2 = ajkrVar.g;
                    } else {
                        ajki ajkiVar3 = ajkrVar.f;
                    }
                } else {
                    c3 = 3;
                    ajki ajkiVar4 = ajkrVar.i;
                }
            } else {
                c2 = 2;
                c3 = 3;
                ajki ajkiVar5 = ajkrVar.h;
            }
            this.g.d(max, brg.a);
            this.j.reset();
            this.g.c(this.c[i3], this.j);
            if (this.l && (d(this.j, i3) || d(this.j, i5))) {
                Path path2 = this.j;
                path2.op(path2, this.f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.h;
                fArr11[0] = 0.0f;
                c4 = 1;
                fArr11[1] = this.g.a;
                this.c[i3].mapPoints(fArr11);
                Path path3 = this.e;
                float[] fArr12 = this.h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.g.c(this.c[i3], this.e);
            } else {
                c4 = 1;
                this.g.c(this.c[i3], path);
            }
            if (asqcVar != null) {
                ajlb ajlbVar7 = this.g;
                Matrix matrix4 = this.c[i3];
                ((ajkm) asqcVar.a).r.set(i3 + 4, false);
                ((ajkm) asqcVar.a).q[i3] = ajlbVar7.a(matrix4);
            }
            i3 = i4;
            c = c4;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}
