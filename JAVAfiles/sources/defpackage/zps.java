package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zps {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public zps() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zps) {
            zps zpsVar = (zps) obj;
            if (this.a == zpsVar.a && this.b == zpsVar.b && this.c == zpsVar.c && this.d == zpsVar.d && this.e == zpsVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = this.b;
        if (true != this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = ((i ^ 1000003) * 1000003) ^ i4;
        if (true == this.d) {
            i3 = 1231;
        }
        return (((((i5 * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "TextColorAndResIdConfig{isIncoming=" + this.a + ", status=" + this.b + ", overrideAsFailure=" + this.c + ", isSelected=" + this.d + ", protocol=" + this.e + "}";
    }

    public zps(boolean z, int i, boolean z2, boolean z3, int i2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = i2;
    }
}
