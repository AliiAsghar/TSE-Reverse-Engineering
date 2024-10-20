package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afas implements afat {
    public final String a;
    public final String b;
    public final aewe c;
    public final boolean d;
    public final afam e;
    public final afaq f;
    public final arqg g;
    private final boolean h;

    public /* synthetic */ afas(String str, String str2, aewe aeweVar, boolean z, afam afamVar, afaq afaqVar, arqg arqgVar, int i) {
        boolean z2;
        afaqVar = (i & 64) != 0 ? new afaq((byte[]) null) : afaqVar;
        int i2 = i & 32;
        int i3 = i & 4;
        int i4 = i & 2;
        if ((i & 16) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        afamVar = i2 != 0 ? null : afamVar;
        boolean z3 = z & z2;
        aeweVar = i3 != 0 ? null : aeweVar;
        str2 = i4 != 0 ? null : str2;
        arqgVar = (i & 128) != 0 ? null : arqgVar;
        str.getClass();
        afaqVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = aeweVar;
        this.h = false;
        this.d = z3;
        this.e = afamVar;
        this.f = afaqVar;
        this.g = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afas)) {
            return false;
        }
        afas afasVar = (afas) obj;
        if (!d.F(this.a, afasVar.a) || !d.F(this.b, afasVar.b) || !d.F(this.c, afasVar.c)) {
            return false;
        }
        boolean z = afasVar.h;
        if (this.d == afasVar.d && d.F(this.e, afasVar.e) && d.F(this.f, afasVar.f) && d.F(this.g, afasVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        aewe aeweVar = this.c;
        if (aeweVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aeweVar.hashCode();
        }
        int v = (((i2 + hashCode2) * 31) + a.v(false)) * 31;
        boolean z = this.d;
        if (this.e == null) {
            int v2 = (((v + a.v(z)) * 961) + this.f.hashCode()) * 31;
            arqg arqgVar = this.g;
            if (arqgVar != null) {
                i = arqgVar.hashCode();
            }
            return v2 + i;
        }
        throw null;
    }

    public final String toString() {
        return "Title(title=" + this.a + ", subtitle=" + this.b + ", monogram=" + this.c + ", autoFitTitle=false, highlight=" + this.d + ", tooltip=" + this.e + ", flags=" + this.f + ", onClick=" + this.g + ")";
    }
}
