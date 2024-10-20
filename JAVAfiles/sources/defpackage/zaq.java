package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zaq {
    public final ascv a;
    public final arqg b;

    public zaq(ascv ascvVar, arqg arqgVar) {
        this.a = ascvVar;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaq)) {
            return false;
        }
        zaq zaqVar = (zaq) obj;
        if (d.F(this.a, zaqVar.a) && d.F(this.b, zaqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DestinationsDialogUiData(destinations=" + this.a + ", onDismiss=" + this.b + ")";
    }
}
