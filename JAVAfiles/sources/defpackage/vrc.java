package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrc {
    private final String a;

    public vrc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrc) {
            return this.a.equals(((vrc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LegacyTransactionId{transactionId=" + this.a + "}";
    }

    public vrc(String str) {
        this.a = str;
    }
}
