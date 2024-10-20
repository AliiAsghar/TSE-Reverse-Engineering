package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahky {
    public final asjj a;

    public ahky() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahky) {
            return this.a.equals(((ahky) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Snapshot{debugLogs=" + this.a.toString() + "}";
    }

    public ahky(asjj asjjVar) {
        if (asjjVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = asjjVar;
    }
}
