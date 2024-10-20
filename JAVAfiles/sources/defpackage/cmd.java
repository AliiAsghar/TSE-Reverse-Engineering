package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmd extends cko {
    public final long a;

    public cmd(long j) {
        this.a = j;
    }

    @Override // defpackage.cko
    public final void a(long j, clp clpVar, float f) {
        long f2;
        clpVar.i(1.0f);
        if (f == 1.0f) {
            f2 = this.a;
        } else {
            long j2 = this.a;
            f2 = ckw.f(cku.d(j2), cku.c(j2), cku.b(j2), cku.a(j2) * f, cku.f(j2));
        }
        clpVar.k(f2);
        if (((ckc) clpVar).c != null) {
            clpVar.n(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cmd) && a.bB(this.a, ((cmd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) cku.g(this.a)) + ')';
    }
}
