package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjf {
    public final xku a;
    private final xkk b;

    public xjf(xku xkuVar, xkk xkkVar) {
        xkuVar.getClass();
        xkkVar.getClass();
        this.a = xkuVar;
        this.b = xkkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjf)) {
            return false;
        }
        xjf xjfVar = (xjf) obj;
        if (d.F(this.a, xjfVar.a) && this.b == xjfVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncCompleted(sync=" + this.a + ", status=" + this.b + ")";
    }
}
