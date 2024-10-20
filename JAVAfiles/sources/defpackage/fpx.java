package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpx implements fpv {
    private final int a;
    private final int b;
    private final euf c;

    public fpx(euo euoVar, eqn eqnVar) {
        euf eufVar = euoVar.a;
        this.c = eufVar;
        eufVar.J(12);
        int m = eufVar.m();
        if ("audio/raw".equals(eqnVar.o)) {
            int n = eul.n(eqnVar.F, eqnVar.D);
            if (m == 0 || m % n != 0) {
                eub.f("BoxParsers", a.bU(m, n, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                m = n;
            }
        }
        this.a = m == 0 ? -1 : m;
        this.b = eufVar.m();
    }

    @Override // defpackage.fpv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.fpv
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fpv
    public final int c() {
        int i = this.a;
        if (i == -1) {
            return this.c.m();
        }
        return i;
    }
}
