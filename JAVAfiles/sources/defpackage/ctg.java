package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctg implements cuh, ctd {
    private final drk a;
    private final /* synthetic */ ctd b;

    public ctg(ctd ctdVar, drk drkVar) {
        this.a = drkVar;
        this.b = ctdVar;
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.b.ec();
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.b.ed();
    }

    @Override // defpackage.drc
    public final float ef(long j) {
        return this.b.ef(j);
    }

    @Override // defpackage.dqv
    public final float eg(float f) {
        return this.b.eg(f);
    }

    @Override // defpackage.dqv
    public final float eh(int i) {
        return this.b.eh(i);
    }

    @Override // defpackage.dqv
    public final float el(long j) {
        return this.b.el(j);
    }

    @Override // defpackage.dqv
    public final float em(float f) {
        return this.b.em(f);
    }

    @Override // defpackage.dqv
    public final int en(long j) {
        return this.b.en(j);
    }

    @Override // defpackage.dqv
    public final int eo(float f) {
        return this.b.eo(f);
    }

    @Override // defpackage.dqv
    public final long ep(long j) {
        return this.b.ep(j);
    }

    @Override // defpackage.dqv
    public final long eq(long j) {
        return this.b.eq(j);
    }

    @Override // defpackage.drc
    public final long er(float f) {
        return this.b.er(f);
    }

    @Override // defpackage.dqv
    public final long es(float f) {
        return this.b.es(f);
    }

    @Override // defpackage.cuh
    public final /* synthetic */ cuf et(int i, int i2, Map map, arqr arqrVar) {
        return cug.a(this, i, i2, map, arqrVar);
    }

    @Override // defpackage.cuh
    public final cuf eu(final int i, final int i2, final Map map, final arqr arqrVar, arqr arqrVar2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            csg.c(a.cl(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new cuf() { // from class: ctg.1
            @Override // defpackage.cuf
            public final int j() {
                return i2;
            }

            @Override // defpackage.cuf
            public final int k() {
                return i;
            }

            @Override // defpackage.cuf
            public final Map m() {
                return map;
            }

            @Override // defpackage.cuf
            public final arqr n() {
                return arqrVar;
            }

            @Override // defpackage.cuf
            public final void o() {
            }
        };
    }

    @Override // defpackage.ctd
    public final boolean ev() {
        return this.b.ev();
    }

    @Override // defpackage.ctd
    public final drk q() {
        return this.a;
    }
}
