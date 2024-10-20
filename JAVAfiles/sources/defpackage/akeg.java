package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akeg extends akec {
    public final akec a;

    public akeg(akec akecVar) {
        this.a = akecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akeg) && d.F(this.a, ((akeg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Complete(outcome=" + this.a + ")";
    }
}
