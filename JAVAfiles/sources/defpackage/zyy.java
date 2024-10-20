package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyy {
    public final boolean a;

    public zyy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zyy) && this.a == ((zyy) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(disableSharedElementTransitionsInTests=" + this.a + ")";
    }

    public zyy() {
        this(true);
    }
}
