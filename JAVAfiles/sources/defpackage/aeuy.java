package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuy implements aeur {
    public final String a;
    public final arqg b;
    public final boolean c;
    public final String d;
    public final Integer e;
    public final boolean f;
    private final arqg g;

    public /* synthetic */ aeuy(String str, arqg arqgVar, boolean z, String str2, Integer num, boolean z2, int i) {
        boolean z3;
        str.getClass();
        this.a = str;
        this.b = (i & 2) != 0 ? null : arqgVar;
        this.g = null;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.c = z3 & z;
        this.d = (i & 16) != 0 ? null : str2;
        this.e = (i & 32) != 0 ? null : num;
        this.f = ((i & 64) == 0) & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeuy)) {
            return false;
        }
        aeuy aeuyVar = (aeuy) obj;
        if (!d.F(this.a, aeuyVar.a) || !d.F(this.b, aeuyVar.b)) {
            return false;
        }
        arqg arqgVar = aeuyVar.g;
        if (d.F(null, null) && this.c == aeuyVar.c && d.F(this.d, aeuyVar.d) && d.F(this.e, aeuyVar.e) && this.f == aeuyVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        arqg arqgVar = this.b;
        int i = 0;
        if (arqgVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqgVar.hashCode();
        }
        int v = (((hashCode3 + hashCode) * 961) + a.v(this.c)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (v + hashCode2) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return ((i2 + i) * 31) + a.v(this.f);
    }

    public final String toString() {
        return "MetatextTextItemUiData(text=" + this.a + ", onClick=" + this.b + ", onLayout=null, shouldTruncate=" + this.c + ", colorIdentifier=" + this.d + ", colorInt=" + this.e + ", useMediumWeight=" + this.f + ")";
    }
}
