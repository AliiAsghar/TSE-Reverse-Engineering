package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaps {
    public final long a;
    public final String b;

    public aaps() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaps) {
            aaps aapsVar = (aaps) obj;
            if (this.a == aapsVar.a && this.b.equals(aapsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ContactTableRow{contactId=" + this.a + ", displayName=" + this.b + "}";
    }

    public aaps(long j, String str) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.b = str;
    }
}
