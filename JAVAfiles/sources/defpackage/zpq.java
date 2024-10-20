package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpq {
    public final int a;
    public final int b;

    public zpq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zpq) {
            zpq zpqVar = (zpq) obj;
            if (this.a == zpqVar.a && this.b == zpqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * (-721379959)) ^ this.b;
    }

    public final String toString() {
        return "MessageTextColorAndResId{getColor=" + this.a + ", statusColorResId=0, getStatusColor=" + this.b + "}";
    }

    public zpq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
