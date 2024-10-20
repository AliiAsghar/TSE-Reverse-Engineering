package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class s extends m {
    private static final long serialVersionUID = 1405488568664762222L;

    public s(n nVar, n nVar2) {
        super(nVar, nVar2);
    }

    @Override // defpackage.n
    public final boolean a(p pVar) {
        if (!this.a.a(pVar) && !this.b.a(pVar)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        n nVar = this.b;
        return this.a.toString() + " or " + nVar.toString();
    }
}
