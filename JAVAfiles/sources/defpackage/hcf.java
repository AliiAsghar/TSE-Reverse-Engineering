package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcf extends hby {
    private final String d;
    private final boolean e;
    private final uj f;
    private final uj g;
    private final RectF h;
    private final int i;
    private final hcw j;
    private final hcw k;
    private final hcw l;
    private hdn m;
    private final int n;

    public hcf(hbl hblVar, hfw hfwVar, hfj hfjVar) {
        super(hblVar, hfwVar, gvf.ad(hfjVar.l), gvf.ac(hfjVar.m), hfjVar.g, hfjVar.c, hfjVar.f, hfjVar.h, hfjVar.i);
        this.f = new uj();
        this.g = new uj();
        this.h = new RectF();
        this.d = hfjVar.a;
        this.n = hfjVar.k;
        this.e = hfjVar.j;
        this.i = (int) (hblVar.a.a() / 32.0f);
        hcw a = hfjVar.b.a();
        this.j = a;
        a.h(this);
        hfwVar.i(a);
        hcw a2 = hfjVar.d.a();
        this.k = a2;
        a2.h(this);
        hfwVar.i(a2);
        hcw a3 = hfjVar.e.a();
        this.l = a3;
        a3.h(this);
        hfwVar.i(a3);
    }

    private final int h() {
        int i;
        float f = this.k.c;
        float f2 = this.i;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.l.c * f2);
        int round3 = Math.round(this.j.c * this.i);
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    private final int[] i(int[] iArr) {
        hdn hdnVar = this.m;
        if (hdnVar != null) {
            Integer[] numArr = (Integer[]) hdnVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.hby, defpackage.hep
    public final void a(Object obj, hig higVar) {
        super.a(obj, higVar);
        if (obj == hbq.L) {
            hdn hdnVar = this.m;
            if (hdnVar != null) {
                this.a.k(hdnVar);
            }
            if (higVar == null) {
                this.m = null;
                return;
            }
            hdn hdnVar2 = new hdn(higVar);
            this.m = hdnVar2;
            hdnVar2.h(this);
            this.a.i(this.m);
        }
    }

    @Override // defpackage.hby, defpackage.hcb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            long h = h();
            shader = (LinearGradient) this.f.d(h);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                ico icoVar = (ico) this.j.e();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i((int[]) icoVar.b), (float[]) icoVar.a, Shader.TileMode.CLAMP);
                this.f.h(h, shader);
            }
        } else {
            long h2 = h();
            shader = (RadialGradient) this.g.d(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.k.e();
                PointF pointF4 = (PointF) this.l.e();
                ico icoVar2 = (ico) this.j.e();
                int[] i2 = i((int[]) icoVar2.b);
                Object obj = icoVar2.a;
                shader = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r9, pointF4.y - r10), i2, (float[]) obj, Shader.TileMode.CLAMP);
                this.g.h(h2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.d;
    }
}
