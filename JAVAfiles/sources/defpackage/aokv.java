package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokv {
    public final String a;

    public aokv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof aokv) && this.a.equals(((aokv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 443) * 1000003) ^ 443;
    }

    public final String toString() {
        return "QuicHint{host=" + this.a + ", port=443, alternatePort=443}";
    }

    public aokv(String str) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.a = str;
    }
}
