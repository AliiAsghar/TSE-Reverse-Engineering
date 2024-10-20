package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlt {
    public final long a;
    public final int b;
    public final String c;

    public qlt(long j, int i, String str) {
        this.a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlt)) {
            return false;
        }
        qlt qltVar = (qlt) obj;
        if (this.a == qltVar.a && this.b == qltVar.b && d.F(this.c, qltVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.A(this.a) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactEventRow(contactId=" + this.a + ", type=" + this.b + ", startDate=" + this.c + ")";
    }
}
