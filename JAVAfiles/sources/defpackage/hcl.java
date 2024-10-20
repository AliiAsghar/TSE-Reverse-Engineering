package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcl implements hcr, hch, hcj {
    private final String c;
    private final boolean d;
    private final hbl e;
    private final hcw f;
    private final hcw g;
    private final hcw h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final hgi k = new hgi();
    private hcw i = null;

    public hcl(hbl hblVar, hfw hfwVar, hfm hfmVar) {
        this.c = hfmVar.a;
        this.d = hfmVar.e;
        this.e = hblVar;
        hcw a = hfmVar.b.a();
        this.f = a;
        hcw a2 = hfmVar.c.a();
        this.g = a2;
        hcw a3 = hfmVar.d.a();
        this.h = a3;
        hfwVar.i(a);
        hfwVar.i(a2);
        hfwVar.i(a3);
        a.h(this);
        a2.h(this);
        a3.h(this);
    }

    @Override // defpackage.hep
    public final void a(Object obj, hig higVar) {
        hcw hcwVar;
        if (obj == hbq.l) {
            hcwVar = this.g;
        } else if (obj == hbq.n) {
            hcwVar = this.f;
        } else if (obj == hbq.m) {
            hcwVar = this.h;
        } else {
            return;
        }
        hcwVar.d = higVar;
    }

    @Override // defpackage.hcr
    public final void d() {
        this.j = false;
        this.e.invalidateSelf();
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
                    this.k.d(hcqVar);
                    hcqVar.a(this);
                }
            }
            if (hbzVar instanceof hcn) {
                this.i = ((hcn) hbzVar).a;
            }
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.c;
    }

    @Override // defpackage.hcj
    public final Path i() {
        hcw hcwVar;
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float k = ((hda) this.h).k();
        if (k == brg.a && (hcwVar = this.i) != null) {
            k = Math.min(((Float) hcwVar.e()).floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (k > min) {
            k = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + k);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - k);
        if (k > brg.a) {
            float f3 = k + k;
            this.b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.a.arcTo(this.b, brg.a, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + k, pointF2.y + f2);
        if (k > brg.a) {
            float f4 = k + k;
            this.b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + k);
        if (k > brg.a) {
            float f5 = k + k;
            this.b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - k, pointF2.y - f2);
        if (k > brg.a) {
            float f6 = k + k;
            this.b.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.k.e(this.a);
        this.j = true;
        return this.a;
    }
}
