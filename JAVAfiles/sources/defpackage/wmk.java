package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class wmk {
    public final int a;
    public final int b;

    public wmk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wmk) {
            wmk wmkVar = (wmk) obj;
            if (this.a == wmkVar.a && this.b == wmkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.bm(i);
        int i2 = this.b;
        a.bm(i2);
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        return a.bZ(Integer.toString(a.M(this.b)), Integer.toString(a.M(this.a)), "ActionDescription{action=", ", reason=", "}");
    }

    public wmk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
