package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxp {
    private final int a;
    private final int b;

    public akxp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akxp)) {
            return false;
        }
        akxp akxpVar = (akxp) obj;
        int i = this.a;
        int i2 = akxpVar.a;
        if (i != 0) {
            if (i == i2) {
                int i3 = this.b;
                int i4 = akxpVar.b;
                if (i3 != 0) {
                    if (i3 == i4) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.bm(i);
        int i2 = this.b;
        a.bm(i2);
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        String str;
        int i = this.a;
        String str2 = "null";
        if (i == 0) {
            str = "null";
        } else {
            str = Integer.toString(a.am(i));
        }
        int i2 = this.b;
        if (i2 != 0) {
            str2 = Integer.toString(a.ak(i2));
        }
        return a.bZ(str2, str, "RequestMetadata{requestType=", ", syncStatus=", "}");
    }

    public akxp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
