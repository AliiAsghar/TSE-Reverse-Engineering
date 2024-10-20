package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rux {
    public final qfe a;

    public rux() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rux) {
            return this.a.equals(((rux) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RcsGroupJoinStatus{value=" + this.a.toString() + "}";
    }

    public rux(qfe qfeVar) {
        if (qfeVar == null) {
            throw new NullPointerException("Null value");
        }
        this.a = qfeVar;
    }
}
