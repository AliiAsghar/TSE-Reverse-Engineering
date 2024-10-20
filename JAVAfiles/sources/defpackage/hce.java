package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hce implements hcb, hcr, hch {
    float a;
    private final String b;
    private final boolean c;
    private final hfw d;
    private final uj e = new uj();
    private final uj f = new uj();
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final hcw k;
    private final hcw l;
    private final hcw m;
    private final hcw n;
    private hcw o;
    private hdn p;
    private final hbl q;
    private final int r;
    private hcw s;
    private hcz t;
    private final int u;

    public hce(hbl hblVar, hbb hbbVar, hfw hfwVar, hfi hfiVar) {
        Path path = new Path();
        this.g = path;
        this.h = new hbx(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = brg.a;
        this.d = hfwVar;
        this.b = hfiVar.f;
        this.c = hfiVar.g;
        this.q = hblVar;
        this.u = hfiVar.h;
        path.setFillType(hfiVar.a);
        this.r = (int) (hbbVar.a() / 32.0f);
        hcw a = hfiVar.b.a();
        this.k = a;
        a.h(this);
        hfwVar.i(a);
        hcw a2 = hfiVar.c.a();
        this.l = a2;
        a2.h(this);
        hfwVar.i(a2);
        hcw a3 = hfiVar.d.a();
        this.m = a3;
        a3.h(this);
        hfwVar.i(a3);
        hcw a4 = hfiVar.e.a();
        this.n = a4;
        a4.h(this);
        hfwVar.i(a4);
        if (hfwVar.q() != null) {
            hcw a5 = ((heu) hfwVar.q().a).a();
            this.s = a5;
            a5.h(this);
            hfwVar.i(this.s);
        }
        if (hfwVar.r() != null) {
            this.t = new hcz(this, hfwVar, hfwVar.r());
        }
    }

    private final int h() {
        int i;
        float f = this.m.c;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.c * f2);
        int round3 = Math.round(this.k.c * this.r);
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
        hdn hdnVar = this.p;
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

    @Override // defpackage.hep
    public final void a(Object obj, hig higVar) {
        hcz hczVar;
        hcz hczVar2;
        hcz hczVar3;
        hcz hczVar4;
        hcz hczVar5;
        if (obj == hbq.d) {
            this.l.d = higVar;
            return;
        }
        if (obj == hbq.K) {
            hcw hcwVar = this.o;
            if (hcwVar != null) {
                this.d.k(hcwVar);
            }
            if (higVar == null) {
                this.o = null;
                return;
            }
            hdn hdnVar = new hdn(higVar);
            this.o = hdnVar;
            hdnVar.h(this);
            this.d.i(this.o);
            return;
        }
        if (obj == hbq.L) {
            hdn hdnVar2 = this.p;
            if (hdnVar2 != null) {
                this.d.k(hdnVar2);
            }
            if (higVar == null) {
                this.p = null;
                return;
            }
            this.e.g();
            this.f.g();
            hdn hdnVar3 = new hdn(higVar);
            this.p = hdnVar3;
            hdnVar3.h(this);
            this.d.i(this.p);
            return;
        }
        if (obj == hbq.j) {
            hcw hcwVar2 = this.s;
            if (hcwVar2 != null) {
                hcwVar2.d = higVar;
                return;
            }
            hdn hdnVar4 = new hdn(higVar);
            this.s = hdnVar4;
            hdnVar4.h(this);
            this.d.i(this.s);
            return;
        }
        if (obj == hbq.e && (hczVar5 = this.t) != null) {
            hczVar5.b(higVar);
            return;
        }
        if (obj == hbq.G && (hczVar4 = this.t) != null) {
            hczVar4.f(higVar);
            return;
        }
        if (obj == hbq.H && (hczVar3 = this.t) != null) {
            hczVar3.c(higVar);
            return;
        }
        if (obj == hbq.I && (hczVar2 = this.t) != null) {
            hczVar2.e(higVar);
        } else if (obj == hbq.J && (hczVar = this.t) != null) {
            hczVar.g(higVar);
        }
    }

    @Override // defpackage.hcb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.c) {
            return;
        }
        this.g.reset();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.g.addPath(((hcj) this.j.get(i2)).i(), matrix);
        }
        this.g.computeBounds(this.i, false);
        if (this.u == 1) {
            long h = h();
            shader = (LinearGradient) this.e.d(h);
            if (shader == null) {
                PointF pointF = (PointF) this.m.e();
                PointF pointF2 = (PointF) this.n.e();
                ico icoVar = (ico) this.k.e();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i((int[]) icoVar.b), (float[]) icoVar.a, Shader.TileMode.CLAMP);
                this.e.h(h, linearGradient);
                shader = linearGradient;
            }
        } else {
            long h2 = h();
            shader = (RadialGradient) this.f.d(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.m.e();
                PointF pointF4 = (PointF) this.n.e();
                ico icoVar2 = (ico) this.k.e();
                int[] i3 = i((int[]) icoVar2.b);
                Object obj = icoVar2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (hypot <= brg.a) {
                    hypot = 0.001f;
                }
                shader = new RadialGradient(f, f2, hypot, i3, (float[]) obj, Shader.TileMode.CLAMP);
                this.f.h(h2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.h.setShader(shader);
        hcw hcwVar = this.o;
        if (hcwVar != null) {
            this.h.setColorFilter((ColorFilter) hcwVar.e());
        }
        hcw hcwVar2 = this.s;
        if (hcwVar2 != null) {
            float floatValue = ((Float) hcwVar2.e()).floatValue();
            if (floatValue == brg.a) {
                this.h.setMaskFilter(null);
            } else if (floatValue != this.a) {
                this.h.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.a = floatValue;
        }
        hcz hczVar = this.t;
        if (hczVar != null) {
            hczVar.a(this.h);
        }
        this.h.setAlpha(hhy.e((int) ((((i / 255.0f) * ((Integer) this.l.e()).intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.g, this.h);
        hav.a();
    }

    @Override // defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.g.reset();
        for (int i = 0; i < this.j.size(); i++) {
            this.g.addPath(((hcj) this.j.get(i)).i(), matrix);
        }
        this.g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.hcr
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.hep
    public final void e(heo heoVar, int i, List list, heo heoVar2) {
        hhy.d(heoVar, i, list, heoVar2, this);
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            hbz hbzVar = (hbz) list2.get(i);
            if (hbzVar instanceof hcj) {
                this.j.add((hcj) hbzVar);
            }
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.b;
    }
}
