package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byq {
    private final String a;

    public byq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof byq) && d.F(this.a, ((byq) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}
