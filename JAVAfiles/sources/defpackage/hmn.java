package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmn extends hld {
    public final arqr a;

    public hmn(arqr arqrVar) {
        super(null);
        this.a = arqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hmn) && d.F(this.a, ((hmn) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AsyncGlideSize(asyncSize=" + this.a + ")";
    }
}
