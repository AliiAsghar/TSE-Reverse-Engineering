package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzf {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public zzf(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        if (d.F(this.a, zzfVar.a) && d.F(this.b, zzfVar.b) && d.F(this.c, zzfVar.c) && this.d == zzfVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((i2 + hashCode2) * 31) + i) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "TitleUiData(title=" + this.a + ", subtitle=" + this.b + ", displayDestination=" + this.c + ", enableCopyTitleToClipBoard=" + this.d + ")";
    }
}
