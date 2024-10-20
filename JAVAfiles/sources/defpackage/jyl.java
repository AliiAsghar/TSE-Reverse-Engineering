package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyl {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    public jyl(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.d = false;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyl)) {
            return false;
        }
        jyl jylVar = (jyl) obj;
        if (this.a != jylVar.a) {
            return false;
        }
        boolean z = jylVar.d;
        if (this.b == jylVar.b && this.c == jylVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        boolean z = this.c;
        return (((((v * 31) + a.v(false)) * 31) + a.v(this.b)) * 31) + a.v(z);
    }

    public final String toString() {
        return "Flags(includeRbmHeaderIfAvailable=" + this.a + ", enableSwipeToShowTimestamps=false, fixCrashInScrollToItem=" + this.b + ", useOnBottomReachedV2=" + this.c + ")";
    }

    public jyl() {
        this(false, false, false);
    }
}
