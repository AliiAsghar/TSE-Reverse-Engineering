package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlb {
    private final jla a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public jlb(jla jlaVar, boolean z, boolean z2, boolean z3, boolean z4) {
        jlaVar.getClass();
        this.a = jlaVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlb)) {
            return false;
        }
        jlb jlbVar = (jlb) obj;
        if (this.a == jlbVar.a && this.b == jlbVar.b && this.c == jlbVar.c && this.d == jlbVar.d && this.e == jlbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.e;
        boolean z2 = this.d;
        return ((((((hashCode + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z2)) * 31) + a.v(z);
    }

    public final String toString() {
        return "TopUiDataLoggingContext(chosenType=" + this.a + ", hasSubjectUrgent=" + this.b + ", hasReply=" + this.c + ", hasScheduledSend=" + this.d + ", hasEdit=" + this.e + ")";
    }
}
