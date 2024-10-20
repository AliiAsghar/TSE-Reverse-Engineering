package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jmj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Long d;
    public final Float e;

    public jmj(boolean z, boolean z2, boolean z3, Long l, Float f) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = l;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmj)) {
            return false;
        }
        jmj jmjVar = (jmj) obj;
        if (this.a == jmjVar.a && this.b == jmjVar.b && this.c == jmjVar.c && d.F(this.d, jmjVar.d) && d.F(this.e, jmjVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.d;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        boolean z = this.c;
        boolean z2 = this.b;
        boolean z3 = this.a;
        Float f = this.e;
        if (f != null) {
            i = f.hashCode();
        }
        return (((((((a.v(z3) * 31) + a.v(z2)) * 31) + a.v(z)) * 31) + hashCode) * 31) + i;
    }

    public final String toString() {
        return "DraftAudioFlowRequirements(isPlaying=" + this.a + ", isLoading=" + this.b + ", hasError=" + this.c + ", currentPositionInMillis=" + this.d + ", seekProgress=" + this.e + ")";
    }
}
