package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcp extends hby {
    private final hfw d;
    private final String e;
    private final boolean f;
    private final hcw g;
    private hcw h;

    public hcp(hbl hblVar, hfw hfwVar, hft hftVar) {
        super(hblVar, hfwVar, gvf.ad(hftVar.i), gvf.ac(hftVar.j), hftVar.g, hftVar.e, hftVar.f, hftVar.c, hftVar.b);
        this.d = hfwVar;
        this.e = hftVar.a;
        this.f = hftVar.h;
        hcw a = hftVar.d.a();
        this.g = a;
        a.h(this);
        hfwVar.i(a);
    }

    @Override // defpackage.hby, defpackage.hep
    public final void a(Object obj, hig higVar) {
        super.a(obj, higVar);
        if (obj == hbq.b) {
            this.g.d = higVar;
            return;
        }
        if (obj == hbq.K) {
            hcw hcwVar = this.h;
            if (hcwVar != null) {
                this.d.k(hcwVar);
            }
            if (higVar == null) {
                this.h = null;
                return;
            }
            hdn hdnVar = new hdn(higVar);
            this.h = hdnVar;
            hdnVar.h(this);
            this.d.i(this.g);
        }
    }

    @Override // defpackage.hby, defpackage.hcb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        this.b.setColor(((hcx) this.g).k());
        hcw hcwVar = this.h;
        if (hcwVar != null) {
            this.b.setColorFilter((ColorFilter) hcwVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.hbz
    public final String g() {
        return this.e;
    }
}
