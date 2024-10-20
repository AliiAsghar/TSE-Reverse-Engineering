package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeta implements aesg {
    public final aeyo a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final arqg f;

    public aeta(aeyo aeyoVar, String str, String str2, boolean z, boolean z2, arqg arqgVar) {
        this.a = aeyoVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeta)) {
            return false;
        }
        aeta aetaVar = (aeta) obj;
        if (d.F(this.a, aetaVar.a) && d.F(this.b, aetaVar.b) && d.F(this.c, aetaVar.c) && this.d == aetaVar.d && this.e == aetaVar.e && d.F(this.f, aetaVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((((hashCode2 * 31) + hashCode) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SimRadioButtonListItemUiData(simIconUiData=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", isSelected=" + this.d + ", isDefault=" + this.e + ", onClick=" + this.f + ")";
    }
}
