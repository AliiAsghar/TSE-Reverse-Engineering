package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aseo implements arye {
    public final arve a = new arve(null, arvf.a);
    public final long b;
    private final arve c;
    private final arvc d;

    public aseo(long j, aseo aseoVar, int i) {
        arvf arvfVar = arvf.a;
        this.c = new arve(aseoVar, arvfVar);
        this.b = j;
        this.d = new arvc(i << 16, arvfVar);
    }

    public abstract int a();

    public abstract void l(int i);

    public final Object m() {
        return this.a.a;
    }

    public final aseo n() {
        Object m = m();
        if (m == asen.a) {
            return null;
        }
        return (aseo) m;
    }

    public final aseo o() {
        return (aseo) this.c.a;
    }

    public final void p() {
        this.c.b(null);
    }

    public final void q() {
        Object obj;
        aseo aseoVar;
        aseo n;
        boolean z = arwh.a;
        if (r()) {
            return;
        }
        while (true) {
            aseo o = o();
            while (o != null && o.u()) {
                o = (aseo) o.c.a;
            }
            aseo n2 = n();
            n2.getClass();
            while (n2.u() && (n = n2.n()) != null) {
                n2 = n;
            }
            arve arveVar = n2.c;
            do {
                obj = arveVar.a;
                if (((aseo) obj) == null) {
                    aseoVar = null;
                } else {
                    aseoVar = o;
                }
            } while (!arveVar.d(obj, aseoVar));
            if (o != null) {
                o.a.c(n2);
            }
            if (!n2.u() || n2.r()) {
                if (o == null || !o.u()) {
                    return;
                }
            }
        }
    }

    public final boolean r() {
        if (n() == null) {
            return true;
        }
        return false;
    }

    public final void s() {
        if (this.d.b() == a()) {
            q();
        }
    }

    public final boolean t() {
        if (arvc.a.addAndGet(this.d, -65536) == a() && !r()) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (this.d.b == a() && !r()) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        arvc arvcVar;
        int i;
        do {
            arvcVar = this.d;
            i = arvcVar.b;
            if (i == a() && !r()) {
                return false;
            }
        } while (!arvcVar.c(i, 65536 + i));
        return true;
    }
}
