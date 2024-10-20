package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class czg implements czc {
    public final cuf a;
    public final cya b;

    public czg(cuf cufVar, cya cyaVar) {
        this.a = cufVar;
        this.b = cyaVar;
    }

    @Override // defpackage.czc
    public final boolean J() {
        return this.b.G().r();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czg)) {
            return false;
        }
        czg czgVar = (czg) obj;
        if (d.F(this.a, czgVar.a) && d.F(this.b, czgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.a + ", placeable=" + this.b + ')';
    }
}
