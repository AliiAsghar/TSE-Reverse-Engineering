package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjl {
    public final xku a;

    public xjl(xku xkuVar) {
        xkuVar.getClass();
        this.a = xkuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xjl) && d.F(this.a, ((xjl) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncStarted(sync=" + this.a + ")";
    }
}
