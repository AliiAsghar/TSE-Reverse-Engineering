package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcz implements hcr {
    private final hcr a;
    private final hcw b;
    private final hcw c;
    private final hcw d;
    private final hcw e;
    private final hcw f;
    private boolean g = true;

    public hcz(hcr hcrVar, hfw hfwVar, ifq ifqVar) {
        this.a = hcrVar;
        hcw a = ((het) ifqVar.b).a();
        this.b = a;
        a.h(this);
        hfwVar.i(a);
        hcw a2 = ((heu) ifqVar.a).a();
        this.c = a2;
        a2.h(this);
        hfwVar.i(a2);
        hcw a3 = ((heu) ifqVar.d).a();
        this.d = a3;
        a3.h(this);
        hfwVar.i(a3);
        hcw a4 = ((heu) ifqVar.c).a();
        this.e = a4;
        a4.h(this);
        hfwVar.i(a4);
        hcw a5 = ((heu) ifqVar.e).a();
        this.f = a5;
        a5.h(this);
        hfwVar.i(a5);
    }

    public final void a(Paint paint) {
        if (!this.g) {
            return;
        }
        this.g = false;
        double floatValue = ((Float) this.d.e()).floatValue();
        float floatValue2 = ((Float) this.e.e()).floatValue();
        double d = floatValue * 0.017453292519943295d;
        float sin = ((float) Math.sin(d)) * floatValue2;
        float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.b.e()).intValue();
        paint.setShadowLayer(((Float) this.f.e()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public final void b(hig higVar) {
        this.b.d = higVar;
    }

    public final void c(hig higVar) {
        this.d.d = higVar;
    }

    @Override // defpackage.hcr
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(hig higVar) {
        this.e.d = higVar;
    }

    public final void f(hig higVar) {
        if (higVar == null) {
            this.c.d = null;
        } else {
            this.c.d = new hcy(higVar);
        }
    }

    public final void g(hig higVar) {
        this.f.d = higVar;
    }
}
