package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffx implements fhv {
    public final fhv a;
    public boolean b;
    final /* synthetic */ ffy c;

    public ffx(ffy ffyVar, fhv fhvVar) {
        this.c = ffyVar;
        this.a = fhvVar;
    }

    @Override // defpackage.fhv
    public final int a(long j) {
        if (this.c.p()) {
            return -3;
        }
        return this.a.a(j);
    }

    @Override // defpackage.fhv
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.fhv
    public final boolean c() {
        if (!this.c.p() && this.a.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fhv
    public final int d(fqu fquVar, ewl ewlVar, int i) {
        ffy ffyVar = this.c;
        if (ffyVar.p()) {
            return -3;
        }
        if (this.b) {
            ewlVar.a = 4;
            return -4;
        }
        long d = ffyVar.d();
        int d2 = this.a.d(fquVar, ewlVar, i);
        if (d2 == -5) {
            eqn eqnVar = fquVar.a;
            dzg.g(eqnVar);
            int i2 = eqnVar.G;
            int i3 = 0;
            if (i2 == 0) {
                if (eqnVar.H != 0) {
                    i2 = 0;
                }
                return -5;
            }
            ffy ffyVar2 = this.c;
            if (ffyVar2.b != 0) {
                i2 = 0;
            }
            if (ffyVar2.c == Long.MIN_VALUE) {
                i3 = eqnVar.H;
            }
            eqm eqmVar = new eqm(eqnVar);
            eqmVar.E = i2;
            eqmVar.F = i3;
            fquVar.a = new eqn(eqmVar);
            return -5;
        }
        long j = this.c.c;
        if (j != Long.MIN_VALUE && ((d2 == -4 && ewlVar.f >= j) || (d2 == -3 && d == Long.MIN_VALUE && !ewlVar.e))) {
            ewlVar.eO();
            ewlVar.a = 4;
            this.b = true;
            return -4;
        }
        return d2;
    }
}
