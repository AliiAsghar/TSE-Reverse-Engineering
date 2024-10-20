package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevu implements aevy {
    public final arqv a;
    public final char b;
    private final Boolean c;
    private final aevs d;

    public /* synthetic */ aevu(arqv arqvVar, char c, aevs aevsVar) {
        aevsVar.getClass();
        this.a = arqvVar;
        this.b = c;
        this.c = null;
        this.d = aevsVar;
    }

    @Override // defpackage.aevy
    public final aevs a() {
        return this.d;
    }

    @Override // defpackage.aevy
    public final Boolean b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevu)) {
            return false;
        }
        aevu aevuVar = (aevu) obj;
        if (!d.F(this.a, aevuVar.a) || this.b != aevuVar.b) {
            return false;
        }
        Boolean bool = aevuVar.c;
        if (d.F(null, null) && this.d == aevuVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 961) + this.d.hashCode();
    }

    public final String toString() {
        return "Character(backgroundColor=" + this.a + ", character=" + this.b + ", forceClipToCircle=null, monogramBadge=" + this.d + ")";
    }
}
