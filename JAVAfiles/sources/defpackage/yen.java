package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yen {
    public final String a;

    public yen() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yen) {
            return this.a.equals(((yen) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TenorRegisterShareResponse{status=" + this.a + "}";
    }

    public yen(String str) {
        if (str == null) {
            throw new NullPointerException("Null status");
        }
        this.a = str;
    }
}
