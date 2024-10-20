package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjk {
    public final xku a;

    public xjk(xku xkuVar) {
        xkuVar.getClass();
        this.a = xkuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xjk) && d.F(this.a, ((xjk) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncResumed(sync=" + this.a + ")";
    }
}
