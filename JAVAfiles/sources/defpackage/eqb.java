package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eqb implements ert {
    public final ery a = new ery();

    private final int S() {
        int y = y();
        if (y == 1) {
            return 0;
        }
        return y;
    }

    private final void T() {
        int b = b();
        if (b == -1) {
            U();
        } else if (b == u()) {
            V();
        } else {
            r(b);
        }
    }

    private final void U() {
        p(-1, -9223372036854775807L, false);
    }

    private final void V() {
        p(u(), -9223372036854775807L, true);
    }

    private final void W(long j) {
        long A = A() + j;
        long B = B();
        if (B != -9223372036854775807L) {
            A = Math.min(A, B);
        }
        q(Math.max(A, 0L));
    }

    public final int ao() {
        erz H = H();
        if (H.q()) {
            return -1;
        }
        return H.j(u(), S(), Q());
    }

    public final int b() {
        erz H = H();
        if (H.q()) {
            return -1;
        }
        return H.k(u(), S(), Q());
    }

    @Override // defpackage.ert
    public final long c() {
        erz H = H();
        if (H.q()) {
            return -9223372036854775807L;
        }
        return H.p(u(), this.a).b();
    }

    @Override // defpackage.ert
    public final void d() {
        N(false);
    }

    @Override // defpackage.ert
    public final void e() {
        N(true);
    }

    @Override // defpackage.ert
    public final void f() {
        W(-D());
    }

    @Override // defpackage.ert
    public final void g() {
        W(E());
    }

    @Override // defpackage.ert
    public final void h() {
        if (!H().q() && !R()) {
            if (j()) {
                int ao = ao();
                if (ao == -1) {
                    U();
                    return;
                } else if (ao == u()) {
                    V();
                    return;
                } else {
                    r(ao);
                    return;
                }
            }
            if (n() && m()) {
                r(u());
                return;
            } else {
                U();
                return;
            }
        }
        U();
    }

    @Override // defpackage.ert
    public final void i() {
        if (!H().q() && !R()) {
            boolean k = k();
            if (n() && !o()) {
                if (k) {
                    T();
                    return;
                } else {
                    U();
                    return;
                }
            }
            if (k && A() <= C()) {
                T();
                return;
            } else {
                q(0L);
                return;
            }
        }
        U();
    }

    @Override // defpackage.ert
    public final boolean j() {
        if (ao() != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ert
    public final boolean k() {
        if (b() != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ert
    public final boolean l(int i) {
        return G().a.c(i);
    }

    @Override // defpackage.ert
    public final boolean m() {
        erz H = H();
        if (!H.q() && H.p(u(), this.a).i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ert
    public final boolean n() {
        erz H = H();
        if (!H.q() && H.p(u(), this.a).c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ert
    public final boolean o() {
        erz H = H();
        if (!H.q() && H.p(u(), this.a).h) {
            return true;
        }
        return false;
    }

    public abstract void p(int i, long j, boolean z);

    public final void q(long j) {
        p(u(), j, false);
    }

    public final void r(int i) {
        p(i, -9223372036854775807L, false);
    }
}
