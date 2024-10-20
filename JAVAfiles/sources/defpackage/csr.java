package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csr implements csq, cuh, ctz {
    public final cxj a;
    public csp b;
    public boolean c;

    public csr(cxj cxjVar, csp cspVar) {
        this.a = cxjVar;
        this.b = cspVar;
    }

    @Override // defpackage.ctz
    public final cti dV(cti ctiVar) {
        ctx ctxVar;
        cyc z = ((cyn) ctiVar).z();
        if (z != null && (ctxVar = z.n) != null) {
            return ctxVar;
        }
        return ctiVar;
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.a.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.a.ed();
    }

    @Override // defpackage.drc
    public final float ef(long j) {
        return drb.a(this.a, j);
    }

    @Override // defpackage.dqv
    public final float eg(float f) {
        return dqu.a(this.a, f);
    }

    @Override // defpackage.dqv
    public final float eh(int i) {
        return dqu.b(this.a, i);
    }

    @Override // defpackage.dqv
    public final float el(long j) {
        return dqu.c(this.a, j);
    }

    @Override // defpackage.dqv
    public final float em(float f) {
        return dqu.d(this.a, f);
    }

    @Override // defpackage.dqv
    public final int en(long j) {
        return dqu.e(this.a, j);
    }

    @Override // defpackage.dqv
    public final int eo(float f) {
        return dqu.f(this.a, f);
    }

    @Override // defpackage.dqv
    public final long ep(long j) {
        return dqu.g(this.a, j);
    }

    @Override // defpackage.dqv
    public final long eq(long j) {
        return dqu.h(this.a, j);
    }

    @Override // defpackage.drc
    public final long er(float f) {
        return drb.b(this.a, f);
    }

    @Override // defpackage.dqv
    public final long es(float f) {
        return dqu.i(this.a, f);
    }

    @Override // defpackage.cuh
    public final cuf et(int i, int i2, Map map, arqr arqrVar) {
        return cug.a(this.a, i, i2, map, arqrVar);
    }

    @Override // defpackage.cuh
    public final cuf eu(int i, int i2, Map map, arqr arqrVar, arqr arqrVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            csg.c(a.cl(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new cuf(i, i2, map, arqrVar, arqrVar2, this) { // from class: csr.1
            final /* synthetic */ arqr a;
            final /* synthetic */ csr b;
            private final int c;
            private final int d;
            private final Map e;
            private final arqr f;

            {
                this.a = arqrVar2;
                this.b = this;
                this.c = i;
                this.d = i2;
                this.e = map;
                this.f = arqrVar;
            }

            @Override // defpackage.cuf
            public final int j() {
                return this.d;
            }

            @Override // defpackage.cuf
            public final int k() {
                return this.c;
            }

            @Override // defpackage.cuf
            public final Map m() {
                return this.e;
            }

            @Override // defpackage.cuf
            public final arqr n() {
                return this.f;
            }

            @Override // defpackage.cuf
            public final void o() {
                this.a.a(this.b.a.l);
            }
        };
    }

    @Override // defpackage.ctd
    public final boolean ev() {
        return false;
    }

    @Override // defpackage.ctd
    public final drk q() {
        return this.a.q();
    }
}
