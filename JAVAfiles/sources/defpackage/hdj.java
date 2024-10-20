package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdj extends hcw {
    protected hig e;
    protected hig f;
    private final PointF g;
    private final PointF h;
    private final hcw i;
    private final hcw j;

    public hdj(hcw hcwVar, hcw hcwVar2) {
        super(Collections.emptyList());
        this.g = new PointF();
        this.h = new PointF();
        this.i = hcwVar;
        this.j = hcwVar2;
        j(this.c);
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object e() {
        return k(brg.a);
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        return k(f);
    }

    @Override // defpackage.hcw
    public final void j(float f) {
        this.i.j(f);
        this.j.j(f);
        this.g.set(((Float) this.i.e()).floatValue(), ((Float) this.j.e()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((hcr) this.a.get(i)).d();
        }
    }

    final PointF k(float f) {
        Float f2;
        hie d;
        float floatValue;
        hie d2;
        float floatValue2;
        Float f3 = null;
        if (this.e != null && (d2 = this.i.d()) != null) {
            float b = this.i.b();
            Float f4 = d2.h;
            hig higVar = this.e;
            if (f4 == null) {
                floatValue2 = d2.g;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = (Float) higVar.b(d2.g, floatValue2, (Float) d2.b, (Float) d2.c, f, f, b);
        } else {
            f2 = null;
        }
        if (this.f != null && (d = this.j.d()) != null) {
            float b2 = this.j.b();
            Float f5 = d.h;
            hig higVar2 = this.f;
            if (f5 == null) {
                floatValue = d.g;
            } else {
                floatValue = f5.floatValue();
            }
            f3 = (Float) higVar2.b(d.g, floatValue, (Float) d.b, (Float) d.c, f, f, b2);
        }
        if (f2 == null) {
            this.h.set(this.g.x, brg.a);
        } else {
            this.h.set(f2.floatValue(), brg.a);
        }
        if (f3 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.h;
    }
}
