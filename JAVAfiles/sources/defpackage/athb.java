package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class athb extends athw {
    private final atgv a;

    public athb(atgv atgvVar) {
        super(atfy.k, 31556952000L);
        this.a = atgvVar;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        return this.a.X(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.atfw
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        return h(j, a(j) + i);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long g(long j) {
        long g = this.a.l.g(j);
        if (this.a.U(g) > 1) {
            return g - ((r0 - 1) * 604800000);
        }
        return g;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        atow.q(this, Math.abs(i), -292275054, 292278993);
        int a = a(j);
        if (a == i) {
            return j;
        }
        int O = this.a.O(j);
        atgv atgvVar = this.a;
        int W = atgvVar.W(a);
        int W2 = atgvVar.W(i);
        if (W2 < W) {
            W = W2;
        }
        int U = this.a.U(j);
        if (U <= W) {
            W = U;
        }
        long ae = this.a.ae(j, i);
        int a2 = a(ae);
        if (a2 < i) {
            ae += 604800000;
        } else if (a2 > i) {
            ae -= 604800000;
        }
        return this.a.j.h(ae + ((W - this.a.U(ae)) * 604800000), O);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd r() {
        return this.a.d;
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return null;
    }

    @Override // defpackage.athq, defpackage.atfw
    public final boolean t(long j) {
        atgv atgvVar = this.a;
        if (atgvVar.W(atgvVar.X(j)) > 52) {
            return true;
        }
        return false;
    }

    @Override // defpackage.athw
    public final long x(long j, long j2) {
        return e(j, atow.o(j2));
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
