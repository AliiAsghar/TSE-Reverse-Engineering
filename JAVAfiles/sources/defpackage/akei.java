package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akei extends akec {
    public final akeo a;

    public akei(akeo akeoVar) {
        this.a = akeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akei) && d.F(this.a, ((akei) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(cause=" + this.a + ")";
    }
}
