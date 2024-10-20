package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kky {
    public final int a;
    public final int b;
    public final int c;

    public kky() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kky) {
            kky kkyVar = (kky) obj;
            if (this.a == kkyVar.a && this.b == kkyVar.b && this.c == kkyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "EditDistanceResult{insertions=" + this.a + ", deletions=" + this.b + ", substitutions=" + this.c + "}";
    }

    public kky(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
