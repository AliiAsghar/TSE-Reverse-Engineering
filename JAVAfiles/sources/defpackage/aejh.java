package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejh implements aejj {
    public final aekf a;
    public final String b;
    public final String c;
    public final aevr d;
    private final String e;

    public aejh(aekf aekfVar, String str, String str2, String str3, byte[] bArr) {
        aekfVar.getClass();
        str.getClass();
        str3.getClass();
        this.a = aekfVar;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.d = null;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aejh)) {
            return false;
        }
        aejh aejhVar = (aejh) obj;
        if (this.a != aejhVar.a || !d.F(this.b, aejhVar.b) || !d.F(this.c, aejhVar.c) || !d.F(this.e, aejhVar.e)) {
            return false;
        }
        aevr aevrVar = aejhVar.d;
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
        return ((((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode()) * 31;
    }

    public final String toString() {
        return "Loaded(fileType=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", contentDescription=" + this.e + ", statusUiData=null)";
    }

    public /* synthetic */ aejh(aekf aekfVar, String str, String str2, String str3) {
        this(aekfVar, str, str2, str3, null);
    }
}
