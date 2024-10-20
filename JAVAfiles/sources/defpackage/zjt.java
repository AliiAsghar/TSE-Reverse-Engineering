package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjt {
    private final ajzb a;
    private final String b;

    public zjt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zjt) {
            zjt zjtVar = (zjt) obj;
            if (this.a.equals(zjtVar.a) && this.b.equals(zjtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 385623362) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ProfileDiscoveryEligibilityData{shouldShow=false, accountInfo=" + String.valueOf(this.a) + ", phoneNumber=" + this.b + "}";
    }

    public zjt(ajzb ajzbVar) {
        this.a = ajzbVar;
        this.b = "";
    }
}
