package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcm implements hcb, hcj, hcg, hcr, hch {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final hbl c;
    private final hfw d;
    private final String e;
    private final boolean f;
    private final hcw g;
    private final hcw h;
    private final hdm i;
    private hca j;

    public hcm(hbl hblVar, hfw hfwVar, hfn hfnVar) {
        this.c = hblVar;
        this.d = hfwVar;
        this.e = hfnVar.a;
        this.f = hfnVar.e;
        hcw a = hfnVar.b.a();
        this.g = a;
        hfwVar.i(a);
        a.h(this);
        hcw a2 = hfnVar.c.a();
        this.h = a2;
        hfwVar.i(a2);
        a2.h(this);
        hdm hdmVar = new hdm(hfnVar.d);
        this.i = hdmVar;
        hdmVar.c(hfwVar);
        hdmVar.d(this);
    }

    @Override // defpackage.hep
    public final void a(Object obj, hig higVar) {
        hcw hcwVar;
        if (!this.i.e(obj, higVar)) {
            if (obj == hbq.u) {
                hcwVar = this.g;
            } else if (obj == hbq.v) {
                hcwVar = this.h;
            } else {
                return;
            }
            hcwVar.d = higVar;
        }
    }

    @Override // defpackage.hcb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        float floatValue3 = ((Float) this.i.h.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.e()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(matrix);
                float f = i2;
                this.a.preConcat(this.i.b(f + floatValue2));
                PointF pointF = hhy.a;
                this.j.b(canvas, this.a, (int) (i * (((f / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
            } else {
                return;
            }
        }
    }

    @Override // defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.hcr
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.hep
    public final void e(heo heoVar, int i, List list, heo heoVar2) {
        hhy.d(heoVar, i, list, heoVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            hbz hbzVar = (hbz) this.j.a.get(i2);
            if (hbzVar instanceof hch) {
                hhy.d(heoVar, i, list, heoVar2, (hch) hbzVar);
            }
        }
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.e;
    }

    @Override // defpackage.hcg
    public final void h(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((hbz) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new hca(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.hcj
    public final Path i() {
        Path i = this.j.i();
        this.b.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(this.i.b(i2 + floatValue2));
                this.b.addPath(i, this.a);
            } else {
                return this.b;
            }
        }
    }
}
