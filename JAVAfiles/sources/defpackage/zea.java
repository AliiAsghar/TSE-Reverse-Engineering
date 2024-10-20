package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zea {
    public final afaw a;
    public final boolean b;

    public zea(afaw afawVar, boolean z) {
        this.a = afawVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zea)) {
            return false;
        }
        zea zeaVar = (zea) obj;
        if (d.F(this.a, zeaVar.a) && this.b == zeaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "ExtendedTopAppBarUiData(topAppBarUiData=" + this.a + ", overrideSystemBack=" + this.b + ")";
    }
}
