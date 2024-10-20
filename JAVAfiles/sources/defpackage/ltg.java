package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltg {
    private final String a;
    private final long b;
    private final String c;
    private final String d;
    private final boolean e;

    public ltg(ssi ssiVar) {
        String q = ssiVar.q();
        q.getClass();
        long h = ssiVar.h();
        String p = ssiVar.p();
        String o = ssiVar.o();
        boolean r = ssiVar.r();
        this.a = q;
        this.b = h;
        this.c = p;
        this.d = o;
        this.e = r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltg)) {
            return false;
        }
        ltg ltgVar = (ltg) obj;
        if (d.F(this.a, ltgVar.a) && this.b == ltgVar.b && d.F(this.c, ltgVar.c) && d.F(this.d, ltgVar.d) && this.e == ltgVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int A = (((hashCode2 + a.A(this.b)) * 31) + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((A + i) * 31) + a.v(this.e);
    }

    public final String toString() {
        return "LinkPreview(triggerUrlString=" + this.a + ", expirationTimeMsEpoch=" + this.b + ", linkTitle=" + this.c + ", linkImageUrlString=" + this.d + ", linkPreviewFailed=" + this.e + ")";
    }
}
