package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhp extends ffv {
    private final evf d;
    private final fdu e;
    private boolean f = true;
    private long g = -9223372036854775807L;
    private boolean h;
    private boolean i;
    private ewc j;
    private ere k;
    private final qdq l;

    public fhp(ere ereVar, evf evfVar, qdq qdqVar, fdu fduVar) {
        this.k = ereVar;
        this.d = evfVar;
        this.l = qdqVar;
        this.e = fduVar;
    }

    private final void x() {
        erz fhyVar = new fhy(this.g, this.h, this.i, F());
        if (this.f) {
            fhyVar = new fhn(fhyVar);
        }
        j(fhyVar);
    }

    @Override // defpackage.fgx
    public final synchronized ere F() {
        return this.k;
    }

    @Override // defpackage.ffv
    protected final void i(ewc ewcVar) {
        this.j = ewcVar;
        Looper myLooper = Looper.myLooper();
        dzg.g(myLooper);
        this.e.e(myLooper, a());
        this.e.c();
        x();
    }

    @Override // defpackage.ffv
    protected final void l() {
        this.e.d();
    }

    @Override // defpackage.ffv, defpackage.fgx
    public final synchronized void o(ere ereVar) {
        this.k = ereVar;
    }

    public final void u(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.g;
        }
        if (!this.f && this.g == j && this.h == z && this.i == z2) {
            return;
        }
        this.g = j;
        this.h = z;
        this.i = z2;
        this.f = false;
        x();
    }

    @Override // defpackage.fgx
    public final void v(fgt fgtVar) {
        fhm fhmVar = (fhm) fgtVar;
        if (fhmVar.j) {
            for (fhu fhuVar : fhmVar.i) {
                fhuVar.g();
                fhuVar.i();
            }
        }
        fjq fjqVar = fhmVar.c;
        fjo fjoVar = fjqVar.c;
        if (fjoVar != null) {
            fjoVar.a(true);
        }
        fjqVar.a.execute(new gwc(fhmVar, 1));
        fjqVar.b.run();
        fhmVar.f.removeCallbacksAndMessages(null);
        fhmVar.g = null;
        fhmVar.u = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [flx, java.lang.Object] */
    @Override // defpackage.fgx
    public final fgt w(fgv fgvVar, fjl fjlVar, long j) {
        evn a = ((evm) this.d).a();
        ewc ewcVar = this.j;
        if (ewcVar != null) {
            a.f(ewcVar);
        }
        erb erbVar = F().b;
        dzg.g(erbVar);
        qdq qdqVar = this.l;
        a();
        return new fhm(erbVar.a, a, new lxs((flx) qdqVar.a), this.e, s(fgvVar), r(fgvVar), this, fjlVar, eul.u(erbVar.i));
    }

    @Override // defpackage.fgx
    public final void t() {
    }
}
