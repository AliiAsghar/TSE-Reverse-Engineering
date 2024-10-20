package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agal extends afwv {
    public final agau a;

    public agal(agau agauVar) {
        super(null);
        this.a = agauVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agal) && d.F(this.a, ((agal) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Attached(detector=" + this.a + ")";
    }
}
