package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfo {
    public final boolean a;
    public final boolean b;
    public final int c;
    private final boolean d;

    public nfo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nfo) {
            nfo nfoVar = (nfo) obj;
            if (this.a == nfoVar.a && this.b == nfoVar.b && this.d == nfoVar.d && this.c == nfoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = i ^ 1000003;
        if (true == this.d) {
            i3 = 1231;
        }
        return (((((i4 * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "BugleVideoCallingOptions{duoEnabled=" + this.a + ", duoSetupRequired=" + this.b + ", reachable=" + this.d + ", rawDuoStatus=" + this.c + "}";
    }

    public nfo(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.d = z3;
        this.c = i;
    }
}
