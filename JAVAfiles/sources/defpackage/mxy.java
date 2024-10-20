package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxy implements mym {
    public final int a;
    private final String b;

    public mxy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxy) {
            mxy mxyVar = (mxy) obj;
            if (this.b.equals(mxyVar.b)) {
                int i = this.a;
                int i2 = mxyVar.a;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ 1000003;
        int i = this.a;
        a.aS(i);
        return (hashCode * 1000003) ^ i;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.b;
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "SATELLITE";
                }
            } else {
                str = "SUGGESTED_STAR";
            }
        } else {
            str = "UNKNOWN";
        }
        return "BugleToolstoneContent{contentType=" + this.b + ", toolstoneType=" + str + "}";
    }

    public mxy(int i) {
        this.b = "text/plain";
        this.a = i;
    }
}
