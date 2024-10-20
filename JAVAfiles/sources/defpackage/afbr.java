package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbr implements aeto {
    public final Uri a;
    public final Uri b;
    public final arqg c;
    public final String d;
    public final aerg e;
    public final afbq f;
    public final String g;
    public final aetk h;
    private final boolean i;
    private final boolean j;
    private final Integer k;
    private final Integer l;
    private final aezf m;
    private final arqg n;
    private final arqg o;
    private final int p;

    public afbr(Uri uri, Uri uri2, arqg arqgVar, String str, aerg aergVar, afbq afbqVar, String str2, boolean z, Integer num, Integer num2, int i, arqg arqgVar2, arqg arqgVar3, aetk aetkVar) {
        arqgVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.i = false;
        this.c = arqgVar;
        this.d = str;
        this.e = aergVar;
        this.f = afbqVar;
        this.g = str2;
        this.j = z;
        this.k = num;
        this.l = num2;
        this.m = null;
        this.p = i;
        this.n = arqgVar2;
        this.o = arqgVar3;
        this.h = aetkVar;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.n;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        throw null;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        return this.j;
    }

    @Override // defpackage.aeto
    public final aetk e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afbr)) {
            return false;
        }
        afbr afbrVar = (afbr) obj;
        if (!d.F(this.a, afbrVar.a) || !d.F(this.b, afbrVar.b)) {
            return false;
        }
        boolean z = afbrVar.i;
        if (!d.F(this.c, afbrVar.c) || !d.F(this.d, afbrVar.d) || !d.F(this.e, afbrVar.e) || !d.F(this.f, afbrVar.f) || !d.F(this.g, afbrVar.g) || this.j != afbrVar.j || !d.F(this.k, afbrVar.k) || !d.F(this.l, afbrVar.l)) {
            return false;
        }
        aezf aezfVar = afbrVar.m;
        if (d.F(null, null) && this.p == afbrVar.p && d.F(this.n, afbrVar.n) && d.F(this.o, afbrVar.o) && d.F(this.h, afbrVar.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeto
    public final aezf f() {
        return null;
    }

    @Override // defpackage.aeto
    public final Integer g() {
        return this.l;
    }

    @Override // defpackage.aeto
    public final Integer h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.a.hashCode() * 31;
        Uri uri = this.b;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int v = (((((hashCode6 + hashCode) * 31) + a.v(false)) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (v + hashCode2) * 31;
        aerg aergVar = this.e;
        if (aergVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aergVar.hashCode();
        }
        int hashCode7 = (((i2 + hashCode3) * 31) + this.f.hashCode()) * 31;
        String str2 = this.g;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int v2 = (((hashCode7 + hashCode4) * 31) + a.v(this.j)) * 31;
        Integer num = this.k;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i3 = (v2 + hashCode5) * 31;
        Integer num2 = this.l;
        if (num2 != null) {
            i = num2.hashCode();
        }
        int i4 = this.p;
        a.bm(i4);
        return ((((((((i3 + i) * 961) + i4) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.h.hashCode();
    }

    @Override // defpackage.aeto
    public final int j() {
        return this.p;
    }

    public final String toString() {
        return "VideoBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", isTransferring=false, onPlayButtonClick=" + this.c + ", formattedTimeString=" + this.d + ", requestListener=" + this.e + ", videoBubbleFlags=" + this.f + ", contentDescription=" + this.g + ", isHighlighted=" + this.j + ", width=" + this.k + ", height=" + this.l + ", caption=null, displayMode=" + ((Object) adcx.cv(this.p)) + ", onClick=" + this.n + ", onLayout=" + this.o + ", flags=" + this.h + ")";
    }
}
