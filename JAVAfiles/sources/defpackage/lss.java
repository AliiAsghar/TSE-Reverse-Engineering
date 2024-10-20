package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lss {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationProvisioningEventInfo");
    public final String b;
    public final int c;
    public final boolean d;

    public lss() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lss) {
            lss lssVar = (lss) obj;
            if (this.b.equals(lssVar.b) && this.c == lssVar.c && this.d == lssVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() ^ 1000003;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ this.c) * 1000003) ^ i;
    }

    public final String toString() {
        return "SingleRegistrationProvisioningEventInfo{simId=" + this.b + ", subId=" + this.c + ", setupVendorIms=" + this.d + "}";
    }

    public lss(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }
}
