package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhc implements fje {
    private final fje a;
    private final esa b;

    public fhc(fje fjeVar, esa esaVar) {
        this.a = fjeVar;
        this.b = esaVar;
    }

    @Override // defpackage.fjg
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.fje
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.fjg
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.fjg
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.fjg
    public final eqn e(int i) {
        return this.b.a(this.a.a(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhc)) {
            return false;
        }
        fhc fhcVar = (fhc) obj;
        if (this.a.equals(fhcVar.a) && this.b.equals(fhcVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fje
    public final eqn f() {
        return this.b.a(this.a.b());
    }

    @Override // defpackage.fjg
    public final esa g() {
        return this.b;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }
}
