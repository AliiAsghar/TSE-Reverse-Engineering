package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzt {
    public final aewg a;
    public final vox b;
    public final String c;
    public final boolean d;
    public final String e;
    public final arqg f;

    public zzt(aewg aewgVar, vox voxVar, String str, boolean z, String str2, arqg arqgVar) {
        this.a = aewgVar;
        this.b = voxVar;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzt)) {
            return false;
        }
        zzt zztVar = (zzt) obj;
        if (d.F(this.a, zztVar.a) && this.b == zztVar.b && d.F(this.c, zztVar.c) && this.d == zztVar.d && d.F(this.e, zztVar.e) && d.F(this.f, zztVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((hashCode2 * 31) + a.v(this.d)) * 31) + hashCode) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "PhotoUiData(singleMonogramUiData=" + this.a + ", photoSource=" + this.b + ", title=" + this.c + ", isCurrentSelection=" + this.d + ", subTitle=" + this.e + ", onSubTitleClick=" + this.f + ")";
    }
}
