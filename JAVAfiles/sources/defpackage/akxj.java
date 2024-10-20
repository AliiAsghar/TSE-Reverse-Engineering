package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxj {
    public final akzo a;

    public akxj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxj) {
            return this.a.equals(((akxj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Property{softwareInstruction=" + String.valueOf(this.a) + "}";
    }

    public akxj(akzo akzoVar) {
        this.a = akzoVar;
    }
}
