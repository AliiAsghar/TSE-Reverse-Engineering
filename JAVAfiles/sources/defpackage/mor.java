package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mor {
    public final mpb a;
    public final int b;

    public mor(mpb mpbVar, int i) {
        mpbVar.getClass();
        this.a = mpbVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mor)) {
            return false;
        }
        mor morVar = (mor) obj;
        if (this.a == morVar.a && this.b == morVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "EligibilityResult(upgradeEligibilityStatus=" + this.a + ", capabilitiesNetworkRequestCount=" + this.b + ")";
    }

    public /* synthetic */ mor(mpb mpbVar) {
        this(mpbVar, 0);
    }
}
