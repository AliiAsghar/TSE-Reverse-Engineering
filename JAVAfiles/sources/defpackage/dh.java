package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class dh extends gnd {
    public final da a;
    public dk b = null;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public cg e = null;
    private boolean h;

    public dh(da daVar) {
        this.a = daVar;
    }

    @Override // defpackage.gnd
    public final Parcelable a() {
        Bundle bundle;
        if (this.c.size() > 0) {
            bundle = new Bundle();
            cf[] cfVarArr = new cf[this.c.size()];
            this.c.toArray(cfVarArr);
            bundle.putParcelableArray("states", cfVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.d.size(); i++) {
            cg cgVar = (cg) this.d.get(i);
            if (cgVar != null && cgVar.aw()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.a.N(bundle, a.bV(i, "f"), cgVar);
            }
        }
        return bundle;
    }

    public abstract cg b(int i);

    @Override // defpackage.gnd
    public final Object c(ViewGroup viewGroup, int i) {
        cf cfVar;
        cg cgVar;
        if (this.d.size() > i && (cgVar = (cg) this.d.get(i)) != null) {
            return cgVar;
        }
        if (this.b == null) {
            this.b = new bd(this.a);
        }
        cg b = b(i);
        if (this.c.size() > i && (cfVar = (cf) this.c.get(i)) != null) {
            b.an(cfVar);
        }
        while (this.d.size() <= i) {
            this.d.add(null);
        }
        b.ao(false);
        this.d.set(i, b);
        this.b.q(viewGroup.getId(), b);
        this.b.o(b, eng.STARTED);
        return b;
    }

    @Override // defpackage.gnd
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.c.clear();
            this.d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.c.add((cf) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    cg g = this.a.g(bundle, str);
                    if (g != null) {
                        while (this.d.size() <= parseInt) {
                            this.d.add(null);
                        }
                        g.ao(false);
                        this.d.set(parseInt, g);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(String.valueOf(str)));
                    }
                }
            }
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
            if (!this.h) {
                try {
                    this.h = true;
                    dkVar.c();
                } finally {
                    this.h = false;
                }
            }
            this.b = null;
        }
    }

    @Override // defpackage.gnd
    public final void i(Object obj) {
        cg cgVar = (cg) obj;
        cg cgVar2 = this.e;
        if (cgVar != cgVar2) {
            if (cgVar2 != null) {
                cgVar2.ao(false);
                if (this.b == null) {
                    this.b = new bd(this.a);
                }
                this.b.o(this.e, eng.STARTED);
            }
            cgVar.ao(true);
            if (this.b == null) {
                this.b = new bd(this.a);
            }
            this.b.o(cgVar, eng.RESUMED);
            this.e = cgVar;
        }
    }
}
