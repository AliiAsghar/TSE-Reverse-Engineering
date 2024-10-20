package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlv {
    public final String a;
    public final String b;
    private final long c;

    public qlv(long j, String str, String str2) {
        this.c = j;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlv)) {
            return false;
        }
        qlv qlvVar = (qlv) obj;
        if (this.c == qlvVar.c && d.F(this.a, qlvVar.a) && d.F(this.b, qlvVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.c;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((a.A(j) * 31) + hashCode) * 31) + i;
    }

    public final String toString() {
        return "RawContactEvents(contactId=" + this.c + ", birthday=" + this.a + ", anniversary=" + this.b + ")";
    }
}
