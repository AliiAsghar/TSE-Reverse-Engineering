package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevw implements aevy {
    public final int a;
    private final Boolean b;
    private final aevs c;

    public aevw(int i, aevs aevsVar) {
        aevsVar.getClass();
        this.a = i;
        this.b = null;
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
        if (!(obj instanceof aevw)) {
            return false;
        }
        aevw aevwVar = (aevw) obj;
        if (this.a != aevwVar.a) {
            return false;
        }
        Boolean bool = aevwVar.b;
        if (d.F(null, null) && this.c == aevwVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 961) + this.c.hashCode();
    }

    public final String toString() {
        return "Overflow(count=" + this.a + ", forceClipToCircle=null, monogramBadge=" + this.c + ")";
    }
}
