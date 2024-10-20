package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hfw implements hcb, hcr, hep {
    final Matrix a;
    final hbl b;
    final hfz c;
    public hda d;
    public hfw e;
    public hfw f;
    final hdm g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new hbx(1);
    private final Paint n = new hbx(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new hbx(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private List w;
    private final List x;
    private boolean y;
    private kkc z;

    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.List, java.lang.Object] */
    public hfw(hbl hblVar, hfz hfzVar) {
        hbx hbxVar = new hbx(1);
        this.p = hbxVar;
        this.q = new hbx(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.x = new ArrayList();
        this.y = true;
        this.h = brg.a;
        this.b = hblVar;
        this.c = hfzVar;
        String str = hfzVar.c;
        if (hfzVar.u == 3) {
            hbxVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            hbxVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        hdm hdmVar = new hdm(hfzVar.h);
        this.g = hdmVar;
        hdmVar.d(this);
        List list = hfzVar.g;
        if (list != null && !list.isEmpty()) {
            kkc kkcVar = new kkc(hfzVar.g);
            this.z = kkcVar;
            Iterator it = kkcVar.b.iterator();
            while (it.hasNext()) {
                ((hcw) it.next()).h(this);
            }
            for (hcw hcwVar : this.z.a) {
                i(hcwVar);
                hcwVar.h(this);
            }
        }
        if (!this.c.r.isEmpty()) {
            hda hdaVar = new hda(this.c.r);
            this.d = hdaVar;
            hdaVar.b = true;
            hdaVar.h(new hcr() { // from class: hfv
                @Override // defpackage.hcr
                public final void d() {
                    boolean z;
                    hfw hfwVar = hfw.this;
                    if (hfwVar.d.k() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hfwVar.n(z);
                }
            });
            n(((Float) this.d.e()).floatValue() == 1.0f);
            i(this.d);
            return;
        }
        n(true);
    }

    private final void s() {
        if (this.w == null) {
            if (this.f == null) {
                this.w = Collections.emptyList();
                return;
            }
            this.w = new ArrayList();
            for (hfw hfwVar = this.f; hfwVar != null; hfwVar = hfwVar.f) {
                this.w.add(hfwVar);
            }
        }
    }

    private final void t(Canvas canvas) {
        canvas.drawRect(this.r.left - 1.0f, this.r.top - 1.0f, this.r.right + 1.0f, this.r.bottom + 1.0f, this.q);
        hav.a();
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        gvf gvfVar = this.b.a.n;
        String str = this.c.c;
    }

    @Override // defpackage.hep
    public void a(Object obj, hig higVar) {
        this.g.e(obj, higVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012f  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hcb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfw.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.hcb
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(brg.a, brg.a, brg.a, brg.a);
        s();
        this.a.set(matrix);
        if (z) {
            List list = this.w;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.a.preConcat(((hfw) this.w.get(size)).g.a());
                    }
                }
            } else {
                hfw hfwVar = this.f;
                if (hfwVar != null) {
                    this.a.preConcat(hfwVar.g.a());
                }
            }
        }
        this.a.preConcat(this.g.a());
    }

    @Override // defpackage.hcr
    public final void d() {
        u();
    }

    @Override // defpackage.hep
    public final void e(heo heoVar, int i, List list, heo heoVar2) {
        hfw hfwVar = this.e;
        if (hfwVar != null) {
            heo b = heoVar2.b(hfwVar.g());
            if (heoVar.d(this.e.g(), i)) {
                list.add(b.c(this.e));
            }
            if (heoVar.f(g(), i)) {
                this.e.l(heoVar, heoVar.a(this.e.g(), i) + i, list, b);
            }
        }
        if (heoVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                heoVar2 = heoVar2.b(g());
                if (heoVar.d(g(), i)) {
                    list.add(heoVar2.c(this));
                }
            }
            if (heoVar.f(g(), i)) {
                l(heoVar, i + heoVar.a(g(), i), list, heoVar2);
            }
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.c.c;
    }

    public final BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public final void i(hcw hcwVar) {
        if (hcwVar == null) {
            return;
        }
        this.x.add(hcwVar);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public final void k(hcw hcwVar) {
        this.x.remove(hcwVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    public void m(float f) {
        hdm hdmVar = this.g;
        hcw hcwVar = hdmVar.e;
        if (hcwVar != null) {
            hcwVar.j(f);
        }
        hcw hcwVar2 = hdmVar.h;
        if (hcwVar2 != null) {
            hcwVar2.j(f);
        }
        hcw hcwVar3 = hdmVar.i;
        if (hcwVar3 != null) {
            hcwVar3.j(f);
        }
        hcw hcwVar4 = hdmVar.a;
        if (hcwVar4 != null) {
            hcwVar4.j(f);
        }
        hcw hcwVar5 = hdmVar.b;
        if (hcwVar5 != null) {
            hcwVar5.j(f);
        }
        hcw hcwVar6 = hdmVar.c;
        if (hcwVar6 != null) {
            hcwVar6.j(f);
        }
        hcw hcwVar7 = hdmVar.d;
        if (hcwVar7 != null) {
            hcwVar7.j(f);
        }
        hda hdaVar = hdmVar.f;
        if (hdaVar != null) {
            hdaVar.j(f);
        }
        hda hdaVar2 = hdmVar.g;
        if (hdaVar2 != null) {
            hdaVar2.j(f);
        }
        if (this.z != null) {
            for (int i = 0; i < this.z.b.size(); i++) {
                ((hcw) this.z.b.get(i)).j(f);
            }
        }
        hda hdaVar3 = this.d;
        if (hdaVar3 != null) {
            hdaVar3.j(f);
        }
        hfw hfwVar = this.e;
        if (hfwVar != null) {
            hfwVar.m(f);
        }
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            ((hcw) this.x.get(i2)).j(f);
        }
    }

    public final void n(boolean z) {
        if (z != this.y) {
            this.y = z;
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    final boolean o() {
        kkc kkcVar = this.z;
        if (kkcVar != null && !kkcVar.b.isEmpty()) {
            return true;
        }
        return false;
    }

    final boolean p() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public hgi q() {
        return this.c.v;
    }

    public ifq r() {
        return this.c.w;
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
    }

    public void l(heo heoVar, int i, List list, heo heoVar2) {
    }
}
