package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class l extends m {
    private static final long serialVersionUID = 7766999779862263523L;

    public l(n nVar, n nVar2) {
        super(nVar, nVar2);
    }

    @Override // defpackage.n
    public final boolean a(p pVar) {
        if (this.a.a(pVar) && this.b.a(pVar)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        n nVar = this.b;
        return this.a.toString() + " and " + nVar.toString();
    }
}
