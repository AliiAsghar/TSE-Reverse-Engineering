package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjg {
    private final xku a;
    private final xku b;

    public xjg(xku xkuVar, xku xkuVar2) {
        xkuVar.getClass();
        xkuVar2.getClass();
        this.a = xkuVar;
        this.b = xkuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjg)) {
            return false;
        }
        xjg xjgVar = (xjg) obj;
        if (d.F(this.a, xjgVar.a) && d.F(this.b, xjgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncInterrupted(newActiveSync=" + this.a + ", interruptedSync=" + this.b + ")";
    }
}
