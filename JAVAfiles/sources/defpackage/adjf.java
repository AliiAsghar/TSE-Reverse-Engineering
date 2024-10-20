package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjf {
    public final adiv a;
    public final adit b;
    public final int c;

    public adjf(adiv adivVar, adit aditVar, int i) {
        this.a = adivVar;
        this.b = aditVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adjf)) {
            return false;
        }
        adjf adjfVar = (adjf) obj;
        if (d.F(this.a, adjfVar.a) && d.F(this.b, adjfVar.b) && a.bA(this.c, adjfVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        adit aditVar = this.b;
        if (aditVar == null) {
            hashCode = 0;
        } else {
            hashCode = aditVar.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c;
    }

    public final String toString() {
        return "IdentityMappingInfo(rcsProvisioningId=" + this.a + ", phoneNumber=" + this.b + ", subscriptionId=" + adix.a(this.c) + ")";
    }
}
