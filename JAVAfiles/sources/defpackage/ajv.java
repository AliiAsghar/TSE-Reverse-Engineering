package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajv implements and {
    private final int a;
    private final String b;
    private final byn c = new byu(eaq.a, cav.a);
    private final byn d = new byu(true, cav.a);

    public ajv(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.and
    public final int a(dqv dqvVar) {
        return e().e;
    }

    @Override // defpackage.and
    public final int b(dqv dqvVar, drk drkVar) {
        return e().b;
    }

    @Override // defpackage.and
    public final int c(dqv dqvVar, drk drkVar) {
        return e().d;
    }

    @Override // defpackage.and
    public final int d(dqv dqvVar) {
        return e().c;
    }

    public final eaq e() {
        return (eaq) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ajv) && this.a == ((ajv) obj).a) {
            return true;
        }
        return false;
    }

    public final void f(efo efoVar) {
        this.c.h(efoVar.f(this.a));
        this.d.h(Boolean.valueOf(efoVar.b.l(this.a)));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + '(' + e().b + ", " + e().c + ", " + e().d + ", " + e().e + ')';
    }
}
