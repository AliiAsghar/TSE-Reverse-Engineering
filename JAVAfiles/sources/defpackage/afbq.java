package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbq {
    public final boolean a;

    public afbq(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afbq) && this.a == ((afbq) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(fixUriCache=" + this.a + ")";
    }

    public afbq() {
        this(false);
    }
}
