package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akze extends akzf {
    private final Enum a;

    public akze(Enum r1) {
        this.a = r1;
    }

    @Override // defpackage.akzf, defpackage.akzn
    public final Enum a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akzn) {
            akzn akznVar = (akzn) obj;
            akznVar.b();
            if (this.a.equals(akznVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PossibleValue{enumValue=" + this.a.toString() + "}";
    }

    @Override // defpackage.akzn
    public final void b() {
    }
}
