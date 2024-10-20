package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejg implements aejj {
    public final String a;
    public final String b;
    private final String c;

    public aejg(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aejg)) {
            return false;
        }
        aejg aejgVar = (aejg) obj;
        if (d.F(this.a, aejgVar.a) && d.F(this.b, aejgVar.b) && d.F(this.c, aejgVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Error(title=" + this.a + ", subtitle=" + this.b + ", contentDescription=" + this.c + ")";
    }

    public /* synthetic */ aejg(String str, String str2) {
        this(str, null, str2);
    }
}
