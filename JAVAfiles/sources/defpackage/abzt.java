package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzt {
    private final int a;

    public abzt() {
        throw null;
    }

    public final boolean a() {
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abzt)) {
            return false;
        }
        int i = this.a;
        if (i != ((abzt) obj).a) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aS(i);
        return i ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "DO_NOT_ENFORCE";
                }
                return "UNKNOWN";
            }
            return "NOT_SET";
        }
        return "ENFORCE";
    }

    public abzt(int i) {
        this.a = i;
    }
}
