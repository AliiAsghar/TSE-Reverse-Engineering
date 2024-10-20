package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alt implements amj {
    private final and a;
    private final dqv b;

    public alt(and andVar, dqv dqvVar) {
        this.a = andVar;
        this.b = dqvVar;
    }

    @Override // defpackage.amj
    public final float a() {
        and andVar = this.a;
        dqv dqvVar = this.b;
        return dqvVar.eh(andVar.a(dqvVar));
    }

    @Override // defpackage.amj
    public final float b(drk drkVar) {
        and andVar = this.a;
        dqv dqvVar = this.b;
        return dqvVar.eh(andVar.b(dqvVar, drkVar));
    }

    @Override // defpackage.amj
    public final float c(drk drkVar) {
        and andVar = this.a;
        dqv dqvVar = this.b;
        return dqvVar.eh(andVar.c(dqvVar, drkVar));
    }

    @Override // defpackage.amj
    public final float d() {
        and andVar = this.a;
        dqv dqvVar = this.b;
        return dqvVar.eh(andVar.d(dqvVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alt)) {
            return false;
        }
        alt altVar = (alt) obj;
        if (d.F(this.a, altVar.a) && d.F(this.b, altVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
