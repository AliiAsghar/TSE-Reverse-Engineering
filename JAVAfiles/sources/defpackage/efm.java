package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efm {
    static final efo d;
    final efo e;

    static {
        efg efdVar;
        if (Build.VERSION.SDK_INT >= 30) {
            efdVar = new eff();
        } else if (Build.VERSION.SDK_INT >= 29) {
            efdVar = new efe();
        } else {
            efdVar = new efd();
        }
        d = efdVar.a().k().l().m();
    }

    public efm(efo efoVar) {
        this.e = efoVar;
    }

    public eaq a(int i) {
        return eaq.a;
    }

    public eaq c(int i) {
        if ((i & 8) == 0) {
            return eaq.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public eaq d() {
        return eaq.a;
    }

    public efo e(int i, int i2, int i3, int i4) {
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efm)) {
            return false;
        }
        efm efmVar = (efm) obj;
        if (j() == efmVar.j() && q() == efmVar.q() && Objects.equals(d(), efmVar.d()) && Objects.equals(m(), efmVar.m()) && Objects.equals(r(), efmVar.r())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(j()), Boolean.valueOf(q()), d(), m(), r());
    }

    public boolean j() {
        return false;
    }

    public boolean l(int i) {
        return true;
    }

    public eaq m() {
        return eaq.a;
    }

    public efo n() {
        return this.e;
    }

    public efo o() {
        return this.e;
    }

    public boolean q() {
        return false;
    }

    public ecy r() {
        return null;
    }

    public efo s() {
        return this.e;
    }

    public eaq t() {
        return d();
    }

    public eaq u() {
        return d();
    }

    public eaq v() {
        return d();
    }

    public void f(View view) {
    }

    public void g(eaq[] eaqVarArr) {
    }

    public void i(efo efoVar) {
    }

    public void p(eaq eaqVar) {
    }
}
