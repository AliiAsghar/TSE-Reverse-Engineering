package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qmk {
    public final long a;
    public final long b;

    public qmk(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmk)) {
            return false;
        }
        qmk qmkVar = (qmk) obj;
        if (this.a == qmkVar.a && this.b == qmkVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        return "Cp2IdWithContactId(cp2Id=" + this.a + ", contactId=" + this.b + ")";
    }
}
