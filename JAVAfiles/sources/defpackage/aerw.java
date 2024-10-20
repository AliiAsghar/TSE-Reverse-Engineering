package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aerw {
    public final aerb a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final arqg g;

    public /* synthetic */ aerw(aerb aerbVar, String str, String str2, boolean z, boolean z2, int i) {
        boolean z3;
        aerbVar.getClass();
        str.getClass();
        this.a = aerbVar;
        this.b = str;
        this.c = (i & 4) != 0 ? null : str2;
        this.f = false;
        if ((i & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.d = z3 & z;
        this.e = ((i & 32) == 0) & z2;
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aerw)) {
            return false;
        }
        aerw aerwVar = (aerw) obj;
        if (this.a != aerwVar.a || !d.F(this.b, aerwVar.b) || !d.F(this.c, aerwVar.c)) {
            return false;
        }
        boolean z = aerwVar.f;
        if (this.d != aerwVar.d || this.e != aerwVar.e) {
            return false;
        }
        arqg arqgVar = aerwVar.g;
        if (d.F(null, null)) {
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
        return ((((((((hashCode2 * 31) + hashCode) * 31) + a.v(false)) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31;
    }

    public final String toString() {
        return "InfoBubbleUiData(icon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", drawRoundedBorder=false, isIconHighlighted=" + this.d + ", isBackgroundTransparent=" + this.e + ", onClick=null)";
    }
}
