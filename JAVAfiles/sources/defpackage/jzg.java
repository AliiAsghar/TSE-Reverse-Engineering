package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzg {
    public final boolean a;

    public jzg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jzg) && this.a == ((jzg) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(enableProfileInteractionSharing=" + this.a + ")";
    }

    public jzg() {
        this(false);
    }
}
