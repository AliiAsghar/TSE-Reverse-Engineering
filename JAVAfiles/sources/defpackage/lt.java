package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lt {
    public final lr a;
    public final qm b;
    public final efu f;
    public final List c = new ArrayList();
    public final IdentityHashMap d = new IdentityHashMap();
    public final List e = new ArrayList();
    private ls g = new ls();

    public lt(lr lrVar, lq lqVar) {
        this.a = lrVar;
        if (lqVar.b) {
            this.b = new qi();
        } else {
            this.b = new qk();
        }
        this.f = new efu((byte[]) null, (byte[]) null);
    }

    public final int a(ni niVar) {
        ni niVar2;
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (niVar2 = (ni) it.next()) != niVar) {
            i += niVar2.a;
        }
        return i;
    }

    public final ls b(int i) {
        ls lsVar = this.g;
        if (lsVar.c) {
            lsVar = new ls();
        } else {
            lsVar.c = true;
        }
        Iterator it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ni niVar = (ni) it.next();
            int i3 = niVar.a;
            if (i3 > i2) {
                lsVar.a = niVar;
                lsVar.b = i2;
                break;
            }
            i2 -= i3;
        }
        if (lsVar.a != null) {
            return lsVar;
        }
        throw new IllegalArgumentException(a.bV(i, "Cannot find wrapper for "));
    }

    public final ni c(oo ooVar) {
        ni niVar = (ni) this.d.get(ooVar);
        if (niVar != null) {
            return niVar;
        }
        throw new IllegalStateException(a.cd(this, ooVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
    }

    public final void d() {
        int i;
        Iterator it = this.e.iterator();
        while (true) {
            if (it.hasNext()) {
                ni niVar = (ni) it.next();
                int i2 = ((no) niVar.c).b;
                i = 3;
                if (i2 == 3 || (i2 == 2 && niVar.a == 0)) {
                    break;
                }
            } else {
                i = 1;
                break;
            }
        }
        lr lrVar = this.a;
        if (i != lrVar.b) {
            lrVar.m(i);
        }
    }

    public final void e(ni niVar, int i, int i2, Object obj) {
        this.a.v(i + a(niVar), i2, obj);
    }

    public final void f(ls lsVar) {
        lsVar.c = false;
        lsVar.a = null;
        lsVar.b = -1;
        this.g = lsVar;
    }
}
