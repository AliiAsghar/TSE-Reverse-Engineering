package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygg {
    private final int a;
    private final int b;

    public ygg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ygg) {
            ygg yggVar = (ygg) obj;
            if (this.a == yggVar.a && this.b == yggVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PlaybackError{type=" + this.a + ", code=" + this.b + "}";
    }

    public ygg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
