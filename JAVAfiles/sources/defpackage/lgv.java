package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgv implements lgw {
    public final jhc a;

    public lgv(jhc jhcVar) {
        jhcVar.getClass();
        this.a = jhcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lgv) && d.F(this.a, ((lgv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Enabled(draft=" + this.a + ")";
    }
}
