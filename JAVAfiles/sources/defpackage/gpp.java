package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpp {
    public static final gpp a = new gpp(0);
    public static final gpp b = new gpp(1);
    public static final gpp c = new gpp(2);
    public static final gpp d = new gpp(3);
    public final int e;

    public gpp(int i) {
        this.e = i;
        if (i >= 0 && i < 4) {
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gpp) && this.e == ((gpp) obj).e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "unknown position:" + this.e;
                    }
                    return "bottom";
                }
                return "right";
            }
            return "top";
        }
        return "left";
    }
}
