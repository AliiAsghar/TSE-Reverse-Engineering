package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzo {
    public final boolean a;

    public zzo(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzo) && this.a == ((zzo) obj).a) {
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

    public zzo() {
        this(true);
    }
}
