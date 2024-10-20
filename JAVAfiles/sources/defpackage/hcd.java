package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcd implements hcb, hcr, hch {
    float a;
    private final Path b;
    private final Paint c;
    private final hfw d;
    private final String e;
    private final boolean f;
    private final List g;
    private final hcw h;
    private final hcw i;
    private hcw j;
    private final hbl k;
    private hcw l;
    private hcz m;

    public hcd(hbl hblVar, hfw hfwVar, hfq hfqVar) {
        Path path = new Path();
        this.b = path;
        this.c = new hbx(1);
        this.g = new ArrayList();
        this.d = hfwVar;
        this.e = hfqVar.b;
        this.f = hfqVar.e;
        this.k = hblVar;
        if (hfwVar.q() != null) {
            hcw a = ((heu) hfwVar.q().a).a();
            this.l = a;
            a.h(this);
            hfwVar.i(this.l);
        }
        if (hfwVar.r() != null) {
            this.m = new hcz(this, hfwVar, hfwVar.r());
        }
        if (hfqVar.c != null) {
            path.setFillType(hfqVar.a);
            hcw a2 = hfqVar.c.a();
            this.h = a2;
            a2.h(this);
            hfwVar.i(a2);
            hcw a3 = hfqVar.d.a();
            this.i = a3;
            a3.h(this);
            hfwVar.i(a3);
            return;
        }
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.hep
    public final void a(Object obj, hig higVar) {
        hcz hczVar;
        hcz hczVar2;
        hcz hczVar3;
        hcz hczVar4;
        hcz hczVar5;
        if (obj == hbq.a) {
            this.h.d = higVar;
            return;
        }
        if (obj == hbq.d) {
            this.i.d = higVar;
            return;
        }
        if (obj == hbq.K) {
            hcw hcwVar = this.j;
            if (hcwVar != null) {
                this.d.k(hcwVar);
            }
            if (higVar == null) {
                this.j = null;
                return;
            }
            hdn hdnVar = new hdn(higVar);
            this.j = hdnVar;
            hdnVar.h(this);
            this.d.i(this.j);
            return;
        }
        if (obj == hbq.j) {
            hcw hcwVar2 = this.l;
            if (hcwVar2 != null) {
                hcwVar2.d = higVar;
                return;
            }
            hdn hdnVar2 = new hdn(higVar);
            this.l = hdnVar2;
            hdnVar2.h(this);
            this.d.i(this.l);
            return;
        }
        if (obj == hbq.e && (hczVar5 = this.m) != null) {
            hczVar5.b(higVar);
            return;
        }
        if (obj == hbq.G && (hczVar4 = this.m) != null) {
            hczVar4.f(higVar);
            return;
        }
        if (obj == hbq.H && (hczVar3 = this.m) != null) {
            hczVar3.c(higVar);
            return;
        }
        if (obj == hbq.I && (hczVar2 = this.m) != null) {
            hczVar2.e(higVar);
        } else if (obj == hbq.J && (hczVar = this.m) != null) {
            hczVar.g(higVar);
        }
    }

    @Override // defpackage.hcb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        hcw hcwVar = this.h;
        hcw hcwVar2 = this.i;
        this.c.setColor((hhy.e((int) ((((i / 255.0f) * ((Integer) hcwVar2.e()).intValue()) / 100.0f) * 255.0f)) << 24) | (((hcx) hcwVar).k() & 16777215));
        hcw hcwVar3 = this.j;
        if (hcwVar3 != null) {
            this.c.setColorFilter((ColorFilter) hcwVar3.e());
        }
        hcw hcwVar4 = this.l;
        if (hcwVar4 != null) {
            float floatValue = ((Float) hcwVar4.e()).floatValue();
            if (floatValue == brg.a) {
                this.c.setMaskFilter(null);
            } else if (floatValue != this.a) {
                this.c.setMaskFilter(this.d.h(floatValue));
            }
            this.a = floatValue;
        }
        hcz hczVar = this.m;
        if (hczVar != null) {
            hczVar.a(this.c);
        }
        this.b.reset();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.b.addPath(((hcj) this.g.get(i2)).i(), matrix);
        }
        canvas.drawPath(this.b, this.c);
        hav.a();
    }

    @Override // defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            this.b.addPath(((hcj) this.g.get(i)).i(), matrix);
        }
        this.b.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.hcr
    public final void d() {
        this.k.invalidateSelf();
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
                this.g.add((hcj) hbzVar);
            }
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.e;
    }
}
