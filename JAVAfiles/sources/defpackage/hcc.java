package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcc implements hcj, hcr, hch {
    private final String b;
    private final hbl c;
    private final hcw d;
    private final hcw e;
    private final hfg f;
    private boolean g;
    private final Path a = new Path();
    private final hgi h = new hgi();

    public hcc(hbl hblVar, hfw hfwVar, hfg hfgVar) {
        this.b = hfgVar.a;
        this.c = hblVar;
        hcw a = hfgVar.c.a();
        this.d = a;
        hcw a2 = hfgVar.b.a();
        this.e = a2;
        this.f = hfgVar;
        hfwVar.i(a);
        hfwVar.i(a2);
        a.h(this);
        a2.h(this);
    }

    @Override // defpackage.hep
    public final void a(Object obj, hig higVar) {
        hcw hcwVar;
        if (obj == hbq.k) {
            hcwVar = this.d;
        } else if (obj == hbq.n) {
            hcwVar = this.e;
        } else {
            return;
        }
        hcwVar.d = higVar;
    }

    @Override // defpackage.hcr
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.hep
    public final void e(heo heoVar, int i, List list, heo heoVar2) {
        hhy.d(heoVar, i, list, heoVar2, this);
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            hbz hbzVar = (hbz) list.get(i);
            if (hbzVar instanceof hcq) {
                hcq hcqVar = (hcq) hbzVar;
                if (hcqVar.e == 1) {
                    this.h.d(hcqVar);
                    hcqVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.b;
    }

    @Override // defpackage.hcj
    public final Path i() {
        if (this.g) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.g = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        this.a.reset();
        hfg hfgVar = this.f;
        float f3 = f2 * 0.55228f;
        float f4 = -f;
        float f5 = -f3;
        float f6 = f3 + brg.a;
        float f7 = 0.55228f * f;
        float f8 = -f7;
        float f9 = f7 + brg.a;
        float f10 = -f2;
        if (hfgVar.d) {
            this.a.moveTo(brg.a, f10);
            this.a.cubicTo(f8, f10, f4, f5, f4, brg.a);
            this.a.cubicTo(f4, f6, f8, f2, brg.a, f2);
            this.a.cubicTo(f9, f2, f, f6, f, brg.a);
            this.a.cubicTo(f, f5, f9, f10, brg.a, f10);
        } else {
            this.a.moveTo(brg.a, f10);
            this.a.cubicTo(f9, f10, f, f5, f, brg.a);
            this.a.cubicTo(f, f6, f9, f2, brg.a, f2);
            this.a.cubicTo(f8, f2, f4, f6, f4, brg.a);
            this.a.cubicTo(f4, f5, f8, f10, brg.a, f10);
        }
        PointF pointF2 = (PointF) this.e.e();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.h.e(this.a);
        this.g = true;
        return this.a;
    }
}
