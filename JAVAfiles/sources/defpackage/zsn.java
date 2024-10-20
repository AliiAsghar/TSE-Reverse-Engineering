package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsn {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public zsn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zsn) {
            zsn zsnVar = (zsn) obj;
            if (this.a == zsnVar.a && this.b == zsnVar.b && this.c == zsnVar.c && this.d == zsnVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = this.a;
        if (true != this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = i ^ ((i4 ^ 1000003) * 1000003);
        if (true == this.d) {
            i3 = 1231;
        }
        return (((i5 * 1000003) ^ i2) * 1000003) ^ i3;
    }

    public final String toString() {
        return "Priority{getWeight=" + this.a + ", canBeShownAgain=" + this.b + ", canShowAfterAnotherBanner=" + this.c + ", anyOtherBannersCanShowAfterThis=" + this.d + "}";
    }

    public zsn(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
