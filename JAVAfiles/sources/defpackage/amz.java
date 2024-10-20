package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amz implements and {
    private final and a;
    private final and b;

    public amz(and andVar, and andVar2) {
        this.a = andVar;
        this.b = andVar2;
    }

    @Override // defpackage.and
    public final int a(dqv dqvVar) {
        return Math.max(this.a.a(dqvVar), this.b.a(dqvVar));
    }

    @Override // defpackage.and
    public final int b(dqv dqvVar, drk drkVar) {
        return Math.max(this.a.b(dqvVar, drkVar), this.b.b(dqvVar, drkVar));
    }

    @Override // defpackage.and
    public final int c(dqv dqvVar, drk drkVar) {
        return Math.max(this.a.c(dqvVar, drkVar), this.b.c(dqvVar, drkVar));
    }

    @Override // defpackage.and
    public final int d(dqv dqvVar) {
        return Math.max(this.a.d(dqvVar), this.b.d(dqvVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amz)) {
            return false;
        }
        amz amzVar = (amz) obj;
        if (d.F(amzVar.a, this.a) && d.F(amzVar.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
