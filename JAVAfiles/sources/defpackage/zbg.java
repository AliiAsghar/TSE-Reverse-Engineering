package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbg {
    public final String a;
    public final aewf b;
    public final zav c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final arqr m;
    public final arqg n;
    public final rg o;
    public final zbf p;

    public zbg() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbg)) {
            return false;
        }
        zbg zbgVar = (zbg) obj;
        if (d.F(this.a, zbgVar.a) && d.F(this.b, zbgVar.b) && d.F(this.c, zbgVar.c) && d.F(this.d, zbgVar.d) && d.F(this.e, zbgVar.e) && d.F(this.f, zbgVar.f) && d.F(this.g, zbgVar.g) && this.h == zbgVar.h && d.F(this.i, zbgVar.i) && this.j == zbgVar.j && this.k == zbgVar.k && this.l == zbgVar.l && d.F(this.m, zbgVar.m) && d.F(this.n, zbgVar.n) && d.F(this.o, zbgVar.o) && d.F(this.p, zbgVar.p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        aewf aewfVar = this.b;
        int i = 0;
        if (aewfVar == null) {
            hashCode = 0;
        } else {
            hashCode = aewfVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        zav zavVar = this.c;
        if (zavVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = zavVar.hashCode();
        }
        int hashCode4 = (((((((((((((((((((((((i2 + hashCode2) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a.v(this.h)) * 31) + this.i.hashCode()) * 31) + a.v(this.j)) * 31) + a.v(this.k)) * 31) + a.v(this.l)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31;
        rg rgVar = this.o;
        if (rgVar != null) {
            i = rgVar.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.p.hashCode();
    }

    public final String toString() {
        return "GroupNameUiData(topBarTitle=" + this.a + ", multiMonogramUiData=" + this.b + ", duplicateGroupNoticeUiData=" + this.c + ", textFieldTitle=" + this.d + ", groupName=" + this.e + ", placeholder=" + this.f + ", actionButtonText=" + this.g + ", actionButtonEnabled=" + this.h + ", groupNameDescriptionText=" + this.i + ", isVisible=" + this.j + ", isEnabled=" + this.k + ", isError=" + this.l + ", onTextChange=" + this.m + ", onDoneClick=" + this.n + ", onBackPressed=" + this.o + ", flags=" + this.p + ")";
    }

    public zbg(String str, aewf aewfVar, zav zavVar, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4, arqr arqrVar, arqg arqgVar, rg rgVar, zbf zbfVar) {
        this.a = str;
        this.b = aewfVar;
        this.c = zavVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = str6;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = arqrVar;
        this.n = arqgVar;
        this.o = rgVar;
        this.p = zbfVar;
    }

    public /* synthetic */ zbg(byte[] bArr) {
        this("", null, null, "", "", "", "", false, "", false, false, false, yzm.d, yyo.g, null, new zbf(null));
    }
}
