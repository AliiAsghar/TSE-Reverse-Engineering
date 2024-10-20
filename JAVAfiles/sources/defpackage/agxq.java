package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxq {
    public static final agxq a = new agxq("", 0, 0);
    public final String b;
    public final int c;
    public final int d;

    public agxq() {
        throw null;
    }

    public final agxq a(String str) {
        if (this.b.equals(str)) {
            return this;
        }
        return new agxq(str, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agxq) {
            agxq agxqVar = (agxq) obj;
            if (this.b.equals(agxqVar.b) && this.c == agxqVar.c && this.d == agxqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "DrawParams{text=" + this.b + ", width=" + this.c + ", height=" + this.d + "}";
    }

    public agxq(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
        this.c = i;
        this.d = i2;
    }
}
