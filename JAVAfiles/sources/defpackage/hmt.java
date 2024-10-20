package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmt extends hmq {
    public final Object a;
    private final hmv b;

    public hmt(hmv hmvVar, Object obj) {
        hmvVar.getClass();
        this.b = hmvVar;
        this.a = obj;
        int ordinal = hmvVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new armm();
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.hmq
    public final hmv a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmt)) {
            return false;
        }
        hmt hmtVar = (hmt) obj;
        if (this.b == hmtVar.b && d.F(this.a, hmtVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Resource(status=" + this.b + ", resource=" + this.a + ")";
    }
}
