package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dud implements ctm {
    public final dtz a;
    public final arqr b;
    private final Object c;

    public dud(dtz dtzVar, arqr arqrVar) {
        this.a = dtzVar;
        this.b = arqrVar;
        this.c = dtzVar.a;
    }

    @Override // defpackage.ctm
    public final Object b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dud) {
            dtz dtzVar = this.a;
            dud dudVar = (dud) obj;
            if (d.F(dtzVar.a, dudVar.a.a) && this.b == dudVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + this.b.hashCode();
    }
}
