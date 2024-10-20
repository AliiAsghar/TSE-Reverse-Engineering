package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetk {
    public final boolean a;
    private final boolean b;
    private final boolean c;

    public aetk() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aetk)) {
            return false;
        }
        aetk aetkVar = (aetk) obj;
        if (this.a != aetkVar.a) {
            return false;
        }
        boolean z = aetkVar.b;
        boolean z2 = aetkVar.c;
        return true;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + a.v(false)) * 31) + a.v(false);
    }

    public final String toString() {
        return "Flags(enableDownsampleStrategy=" + this.a + ", enableSwipeToShowTimestamps=false, simplifyBubbleShape=false)";
    }

    public /* synthetic */ aetk(boolean z, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.b = false;
        this.c = false;
    }
}
