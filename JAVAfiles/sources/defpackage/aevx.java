package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevx implements aevy {
    public final arqv a;
    private final Boolean b;
    private final aevs c;

    public /* synthetic */ aevx(arqv arqvVar, aevs aevsVar) {
        aevsVar.getClass();
        this.b = null;
        this.a = arqvVar;
        this.c = aevsVar;
    }

    @Override // defpackage.aevy
    public final aevs a() {
        return this.c;
    }

    @Override // defpackage.aevy
    public final Boolean b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevx)) {
            return false;
        }
        aevx aevxVar = (aevx) obj;
        Boolean bool = aevxVar.b;
        if (d.F(null, null) && d.F(this.a, aevxVar.a) && this.c == aevxVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Unassigned(forceClipToCircle=null, backgroundColor=" + this.a + ", monogramBadge=" + this.c + ")";
    }
}
