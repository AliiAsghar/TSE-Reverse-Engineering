package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kga {
    public final boolean a;
    public final gpx b;

    public kga(boolean z, gpx gpxVar) {
        gpxVar.getClass();
        this.a = z;
        this.b = gpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kga)) {
            return false;
        }
        kga kgaVar = (kga) obj;
        if (this.a == kgaVar.a && d.F(this.b, kgaVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Pages(fromNewPagingSource=" + this.a + ", pagingData=" + this.b + ")";
    }
}
