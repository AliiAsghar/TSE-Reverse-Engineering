package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mos {
    public final qry a;
    public final boolean b;

    public mos(qry qryVar, boolean z) {
        this.a = qryVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mos)) {
            return false;
        }
        mos mosVar = (mos) obj;
        if (d.F(this.a, mosVar.a) && this.b == mosVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "RcsCapabilitiesWithSource(rcsCapabilities=" + this.a + ", isFetchedFromNetwork=" + this.b + ")";
    }
}
