package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiv {
    public final int a;
    public final int b;

    public iiv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iiv) {
            iiv iivVar = (iiv) obj;
            if (this.b == iivVar.b && this.a == iivVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "DELETION";
                } else {
                    str = "CHANGE";
                }
            } else {
                str = "INSERTION";
            }
        } else {
            str = "NO_CHANGE";
        }
        return "BadgesDifference{differenceType=" + str + ", differencePosition=" + this.a + "}";
    }

    public iiv(int i, int i2) {
        this.b = i;
        this.a = i2;
    }
}
