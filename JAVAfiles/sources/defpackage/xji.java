package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xji {
    private final xku a;
    private final xjd b;

    public xji(xku xkuVar, xjd xjdVar) {
        xkuVar.getClass();
        this.a = xkuVar;
        this.b = xjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xji)) {
            return false;
        }
        xji xjiVar = (xji) obj;
        if (d.F(this.a, xjiVar.a) && d.F(this.b, xjiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SyncProgress(sync=" + this.a + ", update=" + this.b + ")";
    }
}
