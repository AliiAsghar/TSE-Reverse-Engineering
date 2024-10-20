package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgb extends fif {
    private final long d;
    private final boolean f;
    private final ArrayList g;
    private final ery h;
    private ffz i;
    private fga j;
    private long k;
    private long l;

    public fgb(fgx fgxVar, long j, boolean z) {
        super(fgxVar);
        boolean z2;
        if (j >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        this.d = j;
        this.f = true;
        this.g = new ArrayList();
        this.h = new ery();
    }

    private final void E(erz erzVar) {
        long j;
        erzVar.p(0, this.h);
        long j2 = this.h.p;
        if (this.i != null && !this.g.isEmpty()) {
            j = this.k - j2;
        } else {
            j = this.d;
            this.k = j2 + j;
            this.l = Long.MIN_VALUE;
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((ffy) this.g.get(i)).m(this.k, this.l);
            }
        }
        try {
            ffz ffzVar = new ffz(erzVar, j, Long.MIN_VALUE);
            this.i = ffzVar;
            j(ffzVar);
        } catch (fga e) {
            this.j = e;
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                ((ffy) this.g.get(i2)).d = this.j;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fge, defpackage.ffv
    public final void l() {
        super.l();
        this.j = null;
        this.i = null;
    }

    @Override // defpackage.fge, defpackage.fgx
    public final void t() {
        fga fgaVar = this.j;
        if (fgaVar == null) {
            super.t();
            return;
        }
        throw fgaVar;
    }

    @Override // defpackage.fif
    protected final void u(erz erzVar) {
        if (this.j != null) {
            return;
        }
        E(erzVar);
    }

    @Override // defpackage.fif, defpackage.fgx
    public final void v(fgt fgtVar) {
        dzg.d(this.g.remove(fgtVar));
        this.e.v(((ffy) fgtVar).a);
        if (this.g.isEmpty()) {
            ffz ffzVar = this.i;
            dzg.g(ffzVar);
            E(ffzVar.b);
        }
    }

    @Override // defpackage.fif, defpackage.fgx
    public final fgt w(fgv fgvVar, fjl fjlVar, long j) {
        ffy ffyVar = new ffy(this.e.w(fgvVar, fjlVar, j), true, this.k, this.l);
        this.g.add(ffyVar);
        return ffyVar;
    }
}
