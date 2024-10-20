package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aero {
    public final boolean a;

    public aero(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aero) && this.a == ((aero) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(useBlurredThumbnailAsGlideFallback=" + this.a + ")";
    }

    public aero() {
        this(true);
    }
}
