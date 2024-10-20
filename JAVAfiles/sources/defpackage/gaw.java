package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaw extends gaz {
    public final Throwable a;

    public gaw(Throwable th) {
        super(false);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gaw) {
            gaw gawVar = (gaw) obj;
            if (this.c == gawVar.c && d.F(this.a, gawVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.c) + this.a.hashCode();
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.c + ", error=" + this.a + ')';
    }
}
