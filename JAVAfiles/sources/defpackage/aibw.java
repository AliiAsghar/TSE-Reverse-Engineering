package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibw {
    private final Boolean a;

    public aibw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aibw)) {
            return false;
        }
        Boolean bool = this.a;
        Boolean bool2 = ((aibw) obj).a;
        if (bool == null) {
            if (bool2 == null) {
                return true;
            }
            return false;
        }
        return bool.equals(bool2);
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "IsOpenResponse{isOpen=" + this.a + "}";
    }

    public aibw(Boolean bool) {
        this.a = bool;
    }
}
