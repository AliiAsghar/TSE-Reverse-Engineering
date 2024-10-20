package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akt implements and {
    private final and a;
    private final and b;

    public akt(and andVar, and andVar2) {
        this.a = andVar;
        this.b = andVar2;
    }

    @Override // defpackage.and
    public final int a(dqv dqvVar) {
        return arrn.r(this.a.a(dqvVar) - this.b.a(dqvVar), 0);
    }

    @Override // defpackage.and
    public final int b(dqv dqvVar, drk drkVar) {
        return arrn.r(this.a.b(dqvVar, drkVar) - this.b.b(dqvVar, drkVar), 0);
    }

    @Override // defpackage.and
    public final int c(dqv dqvVar, drk drkVar) {
        return arrn.r(this.a.c(dqvVar, drkVar) - this.b.c(dqvVar, drkVar), 0);
    }

    @Override // defpackage.and
    public final int d(dqv dqvVar) {
        return arrn.r(this.a.d(dqvVar) - this.b.d(dqvVar), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akt)) {
            return false;
        }
        akt aktVar = (akt) obj;
        if (d.F(aktVar.a, this.a) && d.F(aktVar.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
