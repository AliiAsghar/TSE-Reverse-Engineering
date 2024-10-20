package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrl {
    private final String a;
    private final apef b;
    private final ypk c;
    private final int d;

    public yrl(int i, String str, apef apefVar) {
        this.d = i;
        this.a = str;
        this.b = apefVar;
        uuf uufVar = yrp.a;
        this.c = yyb.B(i);
    }

    public static /* synthetic */ ype a(yrl yrlVar, Integer num, boolean z, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z & z2) {
            return new ype(yrlVar.c(), yrlVar.c, yrlVar.d(), null, yrlVar.b(), 8);
        }
        if (1 == (i & 1)) {
            num = null;
        }
        amzp c = yrlVar.c();
        ypk ypkVar = yrlVar.c;
        String d = yrlVar.d();
        uuf uufVar = yrp.a;
        return new ype(c, ypkVar, d, yyb.A(yrlVar.c(), yrlVar.d, num), yrlVar.b());
    }

    private final ypd b() {
        apef apefVar = this.b;
        if (apefVar != null) {
            return new ypd(apefVar);
        }
        return null;
    }

    private final amzp c() {
        if (this.c.compareTo(ypk.a) > 0) {
            return amzp.SPAM;
        }
        return amzp.NO_VERDICT;
    }

    private final String d() {
        String str = this.a;
        if (str != null && str.length() != 0) {
            return this.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrl)) {
            return false;
        }
        yrl yrlVar = (yrl) obj;
        if (this.d == yrlVar.d && d.F(this.a, yrlVar.a) && d.F(this.b, yrlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.d;
        a.bm(i);
        String str = this.a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = i * 31;
        apef apefVar = this.b;
        if (apefVar != null) {
            i2 = apefVar.hashCode();
        }
        return ((i3 + hashCode) * 31) + i2;
    }

    public final String toString() {
        return "LinkCheckResult(action=" + ((Object) arwi.G(this.d)) + ", initiatedBy=" + this.a + ", serverInfoParams=" + this.b + ")";
    }
}
