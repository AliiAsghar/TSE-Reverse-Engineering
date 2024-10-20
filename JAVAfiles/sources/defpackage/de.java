package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class de extends gnd {
    private final da a;
    private dk b = null;
    private cg c = null;
    private boolean d;

    @Deprecated
    public de(da daVar) {
        this.a = daVar;
    }

    private static String m(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.gnd
    public final Parcelable a() {
        return null;
    }

    public abstract cg b(int i);

    @Override // defpackage.gnd
    public final Object c(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = new bd(this.a);
        }
        long j = i;
        cg e = this.a.e(m(viewGroup.getId(), j));
        if (e != null) {
            this.b.p(new dj(7, e));
        } else {
            e = b(i);
            this.b.r(viewGroup.getId(), e, m(viewGroup.getId(), j));
        }
        if (e != this.c) {
            e.ao(false);
            e.at(false);
        }
        return e;
    }

    @Override // defpackage.gnd
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        cg cgVar = (cg) obj;
        if (this.b == null) {
            this.b = new bd(this.a);
        }
        dk dkVar = this.b;
        da daVar = cgVar.B;
        if (daVar != null && daVar != ((bd) dkVar).a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + cgVar.toString() + " is already attached to a FragmentManager.");
        }
        dkVar.p(new dj(6, cgVar));
        if (cgVar.equals(this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.gnd
    public final void f(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
        } else {
            throw new IllegalStateException(a.cc(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.gnd
    public final boolean g(View view, Object obj) {
        if (((cg) obj).Q == view) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gnd
    public final void h() {
        dk dkVar = this.b;
        if (dkVar != null) {
            if (!this.d) {
                try {
                    this.d = true;
                    dkVar.c();
                } finally {
                    this.d = false;
                }
            }
            this.b = null;
        }
    }

    @Override // defpackage.gnd
    public final void i(Object obj) {
        cg cgVar = (cg) obj;
        cg cgVar2 = this.c;
        if (cgVar != cgVar2) {
            if (cgVar2 != null) {
                cgVar2.ao(false);
                this.c.at(false);
            }
            cgVar.ao(true);
            cgVar.at(true);
            this.c = cgVar;
        }
    }

    @Override // defpackage.gnd
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
    }
}
