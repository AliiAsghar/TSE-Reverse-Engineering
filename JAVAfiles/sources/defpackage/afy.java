package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afy {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    private final long e;

    public afy(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof afy)) {
            return false;
        }
        afy afyVar = (afy) obj;
        if (a.bB(this.a, afyVar.a) && a.bB(this.b, afyVar.b) && a.bB(this.c, afyVar.c) && a.bB(this.d, afyVar.d) && a.bB(this.e, afyVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.e;
        long j2 = this.d;
        return ((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j2)) * 31) + a.A(j);
    }

    public final String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) cku.g(this.a)) + ", textColor=" + ((Object) cku.g(this.b)) + ", iconColor=" + ((Object) cku.g(this.c)) + ", disabledTextColor=" + ((Object) cku.g(this.d)) + ", disabledIconColor=" + ((Object) cku.g(this.e)) + ')';
    }
}
