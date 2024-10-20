package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wxc {
    public final adiv a;
    private final int b;

    public wxc(int i, adiv adivVar) {
        this.b = i;
        this.a = adivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxc)) {
            return false;
        }
        wxc wxcVar = (wxc) obj;
        if (a.bA(this.b, wxcVar.b) && d.F(this.a, wxcVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SubscriptionIdToRcsProvisioningMapping(subId=" + adix.a(this.b) + ", rcsProvisioningId=" + this.a + ")";
    }
}
