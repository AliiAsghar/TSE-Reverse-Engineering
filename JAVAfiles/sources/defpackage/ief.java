package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ief implements iec {
    public final String a;
    public final String b;
    public final String c;
    public final iei d;
    public final iee e;
    public final iee f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final arqg j;
    public final arqg k;

    public /* synthetic */ ief(String str, String str2, String str3, iei ieiVar, iee ieeVar, iee ieeVar2, arqg arqgVar, arqg arqgVar2, int i) {
        arqg arqgVar3;
        arqg arqgVar4;
        boolean z;
        boolean z2;
        iee ieeVar3;
        iee ieeVar4;
        iei ieiVar2;
        String str4;
        if ((i & 512) != 0) {
            arqgVar3 = gqj.h;
        } else {
            arqgVar3 = arqgVar;
        }
        if ((i & 1024) != 0) {
            arqgVar4 = gqj.i;
        } else {
            arqgVar4 = arqgVar2;
        }
        int i2 = i & 128;
        int i3 = i & 64;
        int i4 = i & 32;
        int i5 = i & 16;
        int i6 = i & 8;
        int i7 = i & 4;
        int i8 = i & 2;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = i3 != 0;
        if (i4 != 0) {
            ieeVar3 = null;
        } else {
            ieeVar3 = ieeVar2;
        }
        if (i5 != 0) {
            ieeVar4 = null;
        } else {
            ieeVar4 = ieeVar;
        }
        if (i6 != 0) {
            ieiVar2 = null;
        } else {
            ieiVar2 = ieiVar;
        }
        if (i7 != 0) {
            str4 = null;
        } else {
            str4 = str3;
        }
        String str5 = i8 == 0 ? str2 : null;
        arqgVar3.getClass();
        arqgVar4.getClass();
        this.a = str;
        this.b = str5;
        this.c = str4;
        this.d = ieiVar2;
        this.e = ieeVar4;
        this.f = ieeVar3;
        this.g = z3;
        this.h = z2;
        this.i = z;
        this.j = arqgVar3;
        this.k = arqgVar4;
    }

    @Override // defpackage.iec
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ief)) {
            return false;
        }
        ief iefVar = (ief) obj;
        if (d.F(this.a, iefVar.a) && d.F(this.b, iefVar.b) && d.F(this.c, iefVar.c) && d.F(this.d, iefVar.d) && d.F(this.e, iefVar.e) && d.F(this.f, iefVar.f) && this.g == iefVar.g && this.h == iefVar.h && this.i == iefVar.i && d.F(this.j, iefVar.j) && d.F(this.k, iefVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        iei ieiVar = this.d;
        if (ieiVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ieiVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        iee ieeVar = this.e;
        if (ieeVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = ieeVar.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        iee ieeVar2 = this.f;
        if (ieeVar2 != null) {
            i = ieeVar2.hashCode();
        }
        return ((((((((((i5 + i) * 31) + a.v(this.g)) * 31) + a.v(this.h)) * 31) + a.v(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "FullBannerContent(id=" + this.a + ", title=" + this.b + ", text=" + this.c + ", symbol=" + this.d + ", confirmButton=" + this.e + ", dismissButton=" + this.f + ", showCloseButton=" + this.g + ", dismissAfterClicked=" + this.h + ", collapsible=" + this.i + ", onShownCallback=" + this.j + ", onHiddenCallback=" + this.k + ")";
    }
}
