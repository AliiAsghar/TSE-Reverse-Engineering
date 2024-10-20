package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hby implements hcr, hch, hcb {
    protected final hfw a;
    final Paint b;
    float c;
    private final hbl h;
    private final float[] j;
    private final hcw k;
    private final hcw l;
    private final List m;
    private final hcw n;
    private hcw o;
    private hcw p;
    private hcz q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public hby(hbl hblVar, hfw hfwVar, Paint.Cap cap, Paint.Join join, float f, hew hewVar, heu heuVar, List list, heu heuVar2) {
        hbx hbxVar = new hbx(1);
        this.b = hbxVar;
        this.c = brg.a;
        this.h = hblVar;
        this.a = hfwVar;
        hbxVar.setStyle(Paint.Style.STROKE);
        hbxVar.setStrokeCap(cap);
        hbxVar.setStrokeJoin(join);
        hbxVar.setStrokeMiter(f);
        this.l = hewVar.a();
        this.k = heuVar.a();
        if (heuVar2 == null) {
            this.n = null;
        } else {
            this.n = heuVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((heu) list.get(i)).a());
        }
        hfwVar.i(this.l);
        hfwVar.i(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            hfwVar.i((hcw) this.m.get(i2));
        }
        hcw hcwVar = this.n;
        if (hcwVar != null) {
            hfwVar.i(hcwVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((hcw) this.m.get(i3)).h(this);
        }
        hcw hcwVar2 = this.n;
        if (hcwVar2 != null) {
            hcwVar2.h(this);
        }
        if (hfwVar.q() != null) {
            hcw a = ((heu) hfwVar.q().a).a();
            this.p = a;
            a.h(this);
            hfwVar.i(this.p);
        }
        if (hfwVar.r() != null) {
            this.q = new hcz(this, hfwVar, hfwVar.r());
        }
    }

    @Override // defpackage.hep
    public void a(Object obj, hig higVar) {
        hcz hczVar;
        hcz hczVar2;
        hcz hczVar3;
        hcz hczVar4;
        hcz hczVar5;
        if (obj == hbq.d) {
            this.l.d = higVar;
            return;
        }
        if (obj == hbq.s) {
            this.k.d = higVar;
            return;
        }
        if (obj == hbq.K) {
            hcw hcwVar = this.o;
            if (hcwVar != null) {
                this.a.k(hcwVar);
            }
            if (higVar == null) {
                this.o = null;
                return;
            }
            hdn hdnVar = new hdn(higVar);
            this.o = hdnVar;
            hdnVar.h(this);
            this.a.i(this.o);
            return;
        }
        if (obj == hbq.j) {
            hcw hcwVar2 = this.p;
            if (hcwVar2 != null) {
                hcwVar2.d = higVar;
                return;
            }
            hdn hdnVar2 = new hdn(higVar);
            this.p = hdnVar2;
            hdnVar2.h(this);
            this.a.i(this.p);
            return;
        }
        if (obj == hbq.e && (hczVar5 = this.q) != null) {
            hczVar5.b(higVar);
            return;
        }
        if (obj == hbq.G && (hczVar4 = this.q) != null) {
            hczVar4.f(higVar);
            return;
        }
        if (obj == hbq.H && (hczVar3 = this.q) != null) {
            hczVar3.c(higVar);
            return;
        }
        if (obj == hbq.I && (hczVar2 = this.q) != null) {
            hczVar2.e(higVar);
        } else if (obj == hbq.J && (hczVar = this.q) != null) {
            hczVar.g(higVar);
        }
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hcb
    public void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue;
        float f;
        float f2;
        float f3;
        float[] fArr = (float[]) hid.a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            hdc hdcVar = (hdc) this.l;
            this.b.setAlpha(hhy.e((int) ((((i / 255.0f) * hdcVar.k(hdcVar.d(), hdcVar.b())) / 100.0f) * 255.0f)));
            this.b.setStrokeWidth(((hda) this.k).k() * hid.c(matrix));
            if (this.b.getStrokeWidth() > brg.a) {
                if (this.m.isEmpty()) {
                    hav.a();
                } else {
                    float c = hid.c(matrix);
                    for (int i2 = 0; i2 < this.m.size(); i2++) {
                        this.j[i2] = ((Float) ((hcw) this.m.get(i2)).e()).floatValue();
                        if (i2 % 2 == 0) {
                            float[] fArr2 = this.j;
                            if (fArr2[i2] < 1.0f) {
                                fArr2[i2] = 1.0f;
                            }
                        } else {
                            float[] fArr3 = this.j;
                            if (fArr3[i2] < 0.1f) {
                                fArr3[i2] = 0.1f;
                            }
                        }
                        float[] fArr4 = this.j;
                        fArr4[i2] = fArr4[i2] * c;
                    }
                    hcw hcwVar = this.n;
                    if (hcwVar == null) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) hcwVar.e()).floatValue() * c;
                    }
                    this.b.setPathEffect(new DashPathEffect(this.j, floatValue));
                    hav.a();
                }
                hcw hcwVar2 = this.o;
                if (hcwVar2 != null) {
                    this.b.setColorFilter((ColorFilter) hcwVar2.e());
                }
                hcw hcwVar3 = this.p;
                if (hcwVar3 != null) {
                    float floatValue2 = ((Float) hcwVar3.e()).floatValue();
                    if (floatValue2 == brg.a) {
                        this.b.setMaskFilter(null);
                    } else if (floatValue2 != this.c) {
                        this.b.setMaskFilter(this.a.h(floatValue2));
                    }
                    this.c = floatValue2;
                }
                hcz hczVar = this.q;
                if (hczVar != null) {
                    hczVar.a(this.b);
                }
                int i3 = 0;
                while (i3 < this.i.size()) {
                    ico icoVar = (ico) this.i.get(i3);
                    if (icoVar.a != null) {
                        this.e.reset();
                        int size = icoVar.b.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            } else {
                                this.e.addPath(((hcj) icoVar.b.get(size)).i(), matrix);
                            }
                        }
                        float floatValue3 = ((Float) ((hcq) icoVar.a).b.e()).floatValue() / 100.0f;
                        float floatValue4 = ((Float) ((hcq) icoVar.a).c.e()).floatValue() / 100.0f;
                        float floatValue5 = ((Float) ((hcq) icoVar.a).d.e()).floatValue() / 360.0f;
                        if (floatValue3 < 0.01f && floatValue4 > 0.99f) {
                            canvas.drawPath(this.e, this.b);
                            hav.a();
                        } else {
                            this.d.setPath(this.e, z);
                            float length = this.d.getLength();
                            while (this.d.nextContour()) {
                                length += this.d.getLength();
                            }
                            float f4 = floatValue5 * length;
                            float f5 = (floatValue3 * length) + f4;
                            float min = Math.min((floatValue4 * length) + f4, (f5 + length) - 1.0f);
                            int size2 = icoVar.b.size() - 1;
                            float f6 = 0.0f;
                            while (size2 >= 0) {
                                this.f.set(((hcj) icoVar.b.get(size2)).i());
                                this.f.transform(matrix);
                                this.d.setPath(this.f, z);
                                float length2 = this.d.getLength();
                                float f7 = f6 + length2;
                                if (min > length) {
                                    float f8 = min - length;
                                    if (f8 < f7 && f6 < f8) {
                                        if (f5 > length) {
                                            f3 = (f5 - length) / length2;
                                        } else {
                                            f3 = 0.0f;
                                        }
                                        hid.e(this.f, f3, Math.min(f8 / length2, 1.0f), brg.a);
                                        canvas.drawPath(this.f, this.b);
                                        size2--;
                                        f6 = f7;
                                        z = false;
                                    }
                                }
                                if (f7 >= f5 && f6 <= min) {
                                    if (f7 <= min && f5 < f6) {
                                        canvas.drawPath(this.f, this.b);
                                    } else {
                                        if (f5 < f6) {
                                            f = 0.0f;
                                        } else {
                                            f = (f5 - f6) / length2;
                                        }
                                        if (min > f7) {
                                            f2 = 1.0f;
                                        } else {
                                            f2 = (min - f6) / length2;
                                        }
                                        hid.e(this.f, f, f2, brg.a);
                                        canvas.drawPath(this.f, this.b);
                                    }
                                }
                                size2--;
                                f6 = f7;
                                z = false;
                            }
                            hav.a();
                        }
                    } else {
                        this.e.reset();
                        int size3 = icoVar.b.size();
                        while (true) {
                            size3--;
                            if (size3 < 0) {
                                break;
                            } else {
                                this.e.addPath(((hcj) icoVar.b.get(size3)).i(), matrix);
                            }
                        }
                        hav.a();
                        canvas.drawPath(this.e, this.b);
                        hav.a();
                    }
                    i3++;
                    z = false;
                }
                hav.a();
                return;
            }
            hav.a();
            return;
        }
        hav.a();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.e.reset();
        for (int i = 0; i < this.i.size(); i++) {
            ico icoVar = (ico) this.i.get(i);
            for (int i2 = 0; i2 < icoVar.b.size(); i2++) {
                this.e.addPath(((hcj) icoVar.b.get(i2)).i(), matrix);
            }
        }
        this.e.computeBounds(this.g, false);
        hcw hcwVar = this.k;
        RectF rectF2 = this.g;
        float k = ((hda) hcwVar).k() / 2.0f;
        rectF2.set(rectF2.left - k, this.g.top - k, this.g.right + k, this.g.bottom + k);
        rectF.set(this.g);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        hav.a();
    }

    @Override // defpackage.hcr
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.hep
    public final void e(heo heoVar, int i, List list, heo heoVar2) {
        hhy.d(heoVar, i, list, heoVar2, this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hbz
    public final void f(List list, List list2) {
        ico icoVar = null;
        hcq hcqVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            hbz hbzVar = (hbz) list.get(size);
            if (hbzVar instanceof hcq) {
                hcq hcqVar2 = (hcq) hbzVar;
                if (hcqVar2.e == 2) {
                    hcqVar = hcqVar2;
                }
            }
        }
        if (hcqVar != null) {
            hcqVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            hbz hbzVar2 = (hbz) list2.get(size2);
            if (hbzVar2 instanceof hcq) {
                hcq hcqVar3 = (hcq) hbzVar2;
                if (hcqVar3.e == 2) {
                    if (icoVar != null) {
                        this.i.add(icoVar);
                    }
                    ico icoVar2 = new ico(hcqVar3);
                    hcqVar3.a(this);
                    icoVar = icoVar2;
                }
            }
            if (hbzVar2 instanceof hcj) {
                if (icoVar == null) {
                    icoVar = new ico(hcqVar);
                }
                icoVar.b.add((hcj) hbzVar2);
            }
        }
        if (icoVar != null) {
            this.i.add(icoVar);
        }
    }
}
