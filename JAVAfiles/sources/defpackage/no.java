package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class no {
    private final np fp = new np();
    public boolean a = false;
    public int b = 1;

    public final void A(boolean z) {
        if (!this.fp.h()) {
            this.a = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final boolean B() {
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return false;
                }
                return true;
            }
            if (b() <= 0) {
                return false;
            }
            return true;
        }
        throw null;
    }

    public final void C(int i) {
        this.b = i;
        this.fp.g();
    }

    public final void D(nq nqVar) {
        this.fp.registerObserver(nqVar);
    }

    public final void E(nq nqVar) {
        this.fp.unregisterObserver(nqVar);
    }

    public abstract int b();

    public int c(int i) {
        return 0;
    }

    public abstract oo e(ViewGroup viewGroup, int i);

    public abstract void g(oo ooVar, int i);

    public long gI(int i) {
        return -1L;
    }

    public int gL(no noVar, oo ooVar, int i) {
        if (noVar == this) {
            return i;
        }
        return -1;
    }

    public boolean l(oo ooVar) {
        return false;
    }

    public final oo n(ViewGroup viewGroup, int i) {
        try {
            if (ebl.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            oo e = e(viewGroup, i);
            if (e.a.getParent() == null) {
                e.f = i;
                return e;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            Trace.endSection();
        }
    }

    public final void o(oo ooVar, int i) {
        boolean z;
        if (ooVar.r == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ooVar.c = i;
            if (this.a) {
                ooVar.e = gI(i);
            }
            ooVar.m(1, 519);
            if (ebl.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(ooVar.f)));
            }
        }
        ooVar.r = this;
        int i2 = RecyclerView.aa;
        z(ooVar, i, ooVar.gf());
        if (z) {
            ooVar.h();
            ViewGroup.LayoutParams layoutParams = ooVar.a.getLayoutParams();
            if (layoutParams instanceof nx) {
                ((nx) layoutParams).e = true;
            }
            Trace.endSection();
        }
    }

    public final void p() {
        this.fp.a();
    }

    public final void q(int i) {
        this.fp.c(i, 1);
    }

    public final void r(int i, Object obj) {
        this.fp.d(i, 1, obj);
    }

    public final void s(int i) {
        this.fp.e(i, 1);
    }

    public final void t(int i, int i2) {
        this.fp.b(i, i2);
    }

    public final void u(int i, int i2) {
        this.fp.c(i, i2);
    }

    public final void v(int i, int i2, Object obj) {
        this.fp.d(i, i2, obj);
    }

    public final void w(int i, int i2) {
        this.fp.e(i, i2);
    }

    public final void x(int i, int i2) {
        this.fp.f(i, i2);
    }

    public final void y(int i) {
        this.fp.f(i, 1);
    }

    public void z(oo ooVar, int i, List list) {
        g(ooVar, i);
    }

    public void gH(oo ooVar) {
    }

    public void gJ(RecyclerView recyclerView) {
    }

    public void gK(RecyclerView recyclerView) {
    }

    public void j(oo ooVar) {
    }

    public void k(oo ooVar) {
    }
}
