package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmr extends hld {
    public final hmu a;

    public hmr(hmu hmuVar) {
        super(null);
        this.a = hmuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hmr) && d.F(this.a, ((hmr) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImmediateGlideSize(size=" + this.a + ")";
    }
}
