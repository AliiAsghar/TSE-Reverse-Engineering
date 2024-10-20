package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anb implements and {
    private final String a;
    private final byn b;

    public anb(alu aluVar, String str) {
        this.a = str;
        this.b = new byu(aluVar, cav.a);
    }

    @Override // defpackage.and
    public final int a(dqv dqvVar) {
        return e().d;
    }

    @Override // defpackage.and
    public final int b(dqv dqvVar, drk drkVar) {
        return e().a;
    }

    @Override // defpackage.and
    public final int c(dqv dqvVar, drk drkVar) {
        return e().c;
    }

    @Override // defpackage.and
    public final int d(dqv dqvVar) {
        return e().b;
    }

    public final alu e() {
        return (alu) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anb)) {
            return false;
        }
        return d.F(e(), ((anb) obj).e());
    }

    public final void f(alu aluVar) {
        this.b.h(aluVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ')';
    }
}
