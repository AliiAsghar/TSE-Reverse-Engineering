package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlw {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public qlw(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlw)) {
            return false;
        }
        qlw qlwVar = (qlw) obj;
        if (this.a == qlwVar.a && d.F(this.b, qlwVar.b) && d.F(this.c, qlwVar.c) && d.F(this.d, qlwVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int A = (a.A(this.a) * 31) + this.b.hashCode();
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((A * 31) + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "RawContactName(contactId=" + this.a + ", displayName=" + this.b + ", givenName=" + this.c + ", familyName=" + this.d + ")";
    }
}
