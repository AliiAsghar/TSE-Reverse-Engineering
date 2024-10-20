package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class tsd {
    public final boolean a;
    public final alpx b;

    public tsd(boolean z, alpx alpxVar) {
        this.a = z;
        this.b = alpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsd)) {
            return false;
        }
        tsd tsdVar = (tsd) obj;
        if (this.a == tsdVar.a && d.F(this.b, tsdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DevicesFetchResult(isValid=" + this.a + ", devices=" + this.b + ")";
    }
}
