package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsn {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationCapabilityInfo");
    public final int b;
    public final boolean c;
    public final int d;

    public lsn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsn) {
            lsn lsnVar = (lsn) obj;
            if (this.b == lsnVar.b && this.d == lsnVar.d && this.c == lsnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.d;
        a.bm(i2);
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i2 ^ ((this.b ^ 1000003) * 1000003)) * 1000003) ^ i;
    }

    public final String toString() {
        return "SingleRegistrationCapabilityInfo{subId=" + this.b + ", capabilityStatus=" + Integer.toString(a.M(this.d)) + ", singleRegistrationCapable=" + this.c + "}";
    }

    public lsn(int i, int i2, boolean z) {
        this.b = i;
        this.d = i2;
        this.c = z;
    }
}
