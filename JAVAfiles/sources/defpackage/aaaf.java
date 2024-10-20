package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaf {
    public final boolean a;

    public aaaf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aaaf) && this.a == ((aaaf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(enablePhotoSelector=" + this.a + ")";
    }

    public aaaf() {
        this(true);
    }
}
