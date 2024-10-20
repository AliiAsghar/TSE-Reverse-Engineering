package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelk {
    public final String a;
    public final aelj b;
    public final aelj c;
    public final aelq d;
    public final String e;
    public final arqg f;
    private final boolean g;

    public aelk() {
        this(null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aelk)) {
            return false;
        }
        aelk aelkVar = (aelk) obj;
        if (!d.F(this.a, aelkVar.a) || !d.F(this.b, aelkVar.b) || !d.F(this.c, aelkVar.c) || !d.F(this.d, aelkVar.d) || !d.F(this.e, aelkVar.e)) {
            return false;
        }
        boolean z = aelkVar.g;
        if (d.F(this.f, aelkVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        aelj aeljVar = this.b;
        if (aeljVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aeljVar.hashCode();
        }
        int i2 = hashCode * 31;
        aelj aeljVar2 = this.c;
        if (aeljVar2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aeljVar2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        aelq aelqVar = this.d;
        if (aelqVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = aelqVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i5 = (((i4 + hashCode5) * 31) + 1237) * 31;
        arqg arqgVar = this.f;
        if (arqgVar != null) {
            i = arqgVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "Full(title=" + this.a + ", confirmButtonData=" + this.b + ", dismissButtonData=" + this.c + ", symbol=" + this.d + ", text=" + this.e + ", isError=false, onClose=" + this.f + ")";
    }

    public /* synthetic */ aelk(String str, aelj aeljVar, aelj aeljVar2, aelq aelqVar, String str2, arqg arqgVar, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : aeljVar;
        this.c = (i & 4) != 0 ? null : aeljVar2;
        this.d = (i & 8) != 0 ? null : aelqVar;
        this.e = (i & 16) != 0 ? null : str2;
        this.g = false;
        this.f = (i & 64) != 0 ? null : arqgVar;
    }
}
