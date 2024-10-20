package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addz {
    public final adrc a;
    public final int b;

    public addz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof addz)) {
            return false;
        }
        addz addzVar = (addz) obj;
        int i = this.b;
        int i2 = addzVar.b;
        if (i != 0) {
            if (i == i2 && this.a.equals(addzVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "REPLACED";
                }
            } else {
                str = "REUSED";
            }
        } else {
            str = "CREATED";
        }
        return "SessionStoreResult{action=" + str + ", session=" + String.valueOf(this.a) + "}";
    }

    public addz(int i, adrc adrcVar) {
        this.b = i;
        this.a = adrcVar;
    }
}
