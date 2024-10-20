package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezk {
    public final long a;
    public final long b;
    private final long c;

    public aezk(long j, long j2, long j3) {
        this.a = j;
        this.c = j2;
        this.b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezk)) {
            return false;
        }
        aezk aezkVar = (aezk) obj;
        if (a.bB(this.a, aezkVar.a) && a.bB(this.c, aezkVar.c) && a.bB(this.b, aezkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.A(this.a) * 31) + a.A(this.c)) * 31) + a.A(this.b);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        return "AbcBackgroundColors(background=" + cku.g(this.a) + ", decoration=" + cku.g(j2) + ", decorationAccent=" + cku.g(j) + ")";
    }
}
