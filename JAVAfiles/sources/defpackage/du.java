package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class du {
    public final cg a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public du(int i, int i2, cg cgVar) {
        this.h = i;
        this.i = i2;
        this.a = cgVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (!this.c) {
            if (da.Y(2)) {
                Log.v("FragmentManager", a.cc(this, "SpecialEffectsController: ", " has called complete."));
            }
            this.c = true;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(ds dsVar) {
        this.k.add(dsVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (!this.b) {
            this.b = true;
            if (this.k.isEmpty()) {
                a();
                return;
            }
            for (ds dsVar : aqjn.ax(this.g)) {
                if (!dsVar.d) {
                    dsVar.a(viewGroup);
                }
                dsVar.d = true;
            }
        }
    }

    public final void f(ds dsVar) {
        if (this.k.remove(dsVar) && this.k.isEmpty()) {
            a();
        }
    }

    public final void g(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 != 1) {
            if (i3 != 2) {
                if (this.h != 1) {
                    if (da.Y(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) ef.d(this.h)) + " -> " + ((Object) ef.d(i)) + '.');
                    }
                    this.h = i;
                    return;
                }
                return;
            }
            if (da.Y(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) ef.d(this.h)) + " -> REMOVED. mLifecycleImpact  = " + ((Object) a.bt(this.i)) + " to REMOVING.");
            }
            this.h = 1;
            this.i = 3;
            this.f = true;
            return;
        }
        if (this.h == 1) {
            if (da.Y(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ((Object) a.bt(this.i)) + " to ADDING.");
            }
            this.h = 2;
            this.i = 2;
            this.f = true;
        }
    }

    public final void h() {
        this.f = false;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) ef.d(this.h)) + " lifecycleImpact = " + ((Object) a.bt(this.i)) + " fragment = " + this.a + '}';
    }
}
