package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsc {
    public final psv a;
    public final boolean b;

    public lsc(psv psvVar, boolean z) {
        this.a = psvVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsc)) {
            return false;
        }
        lsc lscVar = (lsc) obj;
        if (d.F(this.a, lscVar.a) && this.b == lscVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "RcsCapabilitiesWithExpiry(capabilities=" + this.a + ", expired=" + this.b + ")";
    }
}
