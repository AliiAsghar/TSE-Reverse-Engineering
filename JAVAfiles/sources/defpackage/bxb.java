package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxb<T> implements cax<T> {
    public final arqr a;

    public bxb(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cax
    public final Object a(byx byxVar) {
        return this.a.a(byxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bxb) && d.F(this.a, ((bxb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
