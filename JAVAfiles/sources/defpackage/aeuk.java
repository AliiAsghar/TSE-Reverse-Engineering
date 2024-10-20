package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuk {
    public final boolean a;
    public final long b;
    public final boolean c;
    private final boolean d;
    private final boolean e;

    public aeuk() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeuk)) {
            return false;
        }
        aeuk aeukVar = (aeuk) obj;
        if (this.d != aeukVar.d || this.a != aeukVar.a || this.b != aeukVar.b) {
            return false;
        }
        boolean z = aeukVar.e;
        if (this.c == aeukVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.d);
        boolean z = this.c;
        return (((((((v * 31) + a.v(this.a)) * 31) + a.A(this.b)) * 31) + a.v(false)) * 31) + a.v(z);
    }

    public final String toString() {
        return "Flags(repositionProgressIndicatorForAccessibility=" + this.d + ", useWidthModifier=" + this.a + ", slopMultiplierForHorizontalSwipe=" + this.b + ", enableSwipeToShowTimestamps=false, simplifyBubbleShape=" + this.c + ")";
    }

    public aeuk(boolean z, boolean z2, long j, boolean z3) {
        this.d = z;
        this.a = z2;
        this.b = j;
        this.e = false;
        this.c = z3;
    }

    public /* synthetic */ aeuk(boolean z, int i) {
        this(false, false, (i & 4) != 0 ? 1L : 0L, ((i & 16) == 0) & z);
    }
}
