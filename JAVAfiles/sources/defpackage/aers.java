package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aers implements aerq {
    public final Uri a;
    public final Uri b;
    public final Uri c;
    public final aerg d;
    public final aero e;
    public final aeve f;
    public final aerp g;
    public final String h;
    public final String i;
    public final boolean j;
    public final aetk k;
    public final String l;
    public final boolean m;
    public final Integer n;
    public final Integer o;
    public final aezf p;
    public final arqg q;
    public final arqg r;
    public final int s;

    public aers(Uri uri, Uri uri2, Uri uri3, aerg aergVar, aero aeroVar, aeve aeveVar, aerp aerpVar, String str, String str2, boolean z, aetk aetkVar, String str3, boolean z2, Integer num, Integer num2, aezf aezfVar, int i, arqg arqgVar, arqg arqgVar2) {
        aerpVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.c = uri3;
        this.d = aergVar;
        this.e = aeroVar;
        this.f = aeveVar;
        this.g = aerpVar;
        this.h = str;
        this.i = str2;
        this.j = z;
        this.k = aetkVar;
        this.l = str3;
        this.m = z2;
        this.n = num;
        this.o = num2;
        this.p = aezfVar;
        this.s = i;
        this.q = arqgVar;
        this.r = arqgVar2;
    }

    public static /* synthetic */ aers s(aers aersVar, aeve aeveVar, aerp aerpVar, String str, String str2, boolean z, aezf aezfVar, arqg arqgVar, arqg arqgVar2, int i) {
        Uri uri;
        Uri uri2;
        Uri uri3;
        aerg aergVar;
        aero aeroVar;
        aeve aeveVar2;
        aerp aerpVar2;
        String str3;
        String str4;
        boolean z2;
        aetk aetkVar;
        String str5;
        boolean z3;
        Integer num;
        Integer num2;
        aezf aezfVar2;
        int i2;
        arqg arqgVar3;
        arqg arqgVar4;
        if ((i & 1) != 0) {
            uri = aersVar.a;
        } else {
            uri = null;
        }
        if ((i & 2) != 0) {
            uri2 = aersVar.b;
        } else {
            uri2 = null;
        }
        if ((i & 4) != 0) {
            uri3 = aersVar.c;
        } else {
            uri3 = null;
        }
        if ((i & 8) != 0) {
            aergVar = aersVar.d;
        } else {
            aergVar = null;
        }
        if ((i & 16) != 0) {
            aeroVar = aersVar.e;
        } else {
            aeroVar = null;
        }
        if ((i & 32) != 0) {
            aeveVar2 = aersVar.f;
        } else {
            aeveVar2 = aeveVar;
        }
        if ((i & 64) != 0) {
            aerpVar2 = aersVar.g;
        } else {
            aerpVar2 = aerpVar;
        }
        if ((i & 128) != 0) {
            str3 = aersVar.h;
        } else {
            str3 = str;
        }
        if ((i & 256) != 0) {
            str4 = aersVar.i;
        } else {
            str4 = str2;
        }
        if ((i & 512) != 0) {
            z2 = aersVar.j;
        } else {
            z2 = z;
        }
        if ((i & 1024) != 0) {
            aetkVar = aersVar.k;
        } else {
            aetkVar = null;
        }
        if ((i & 2048) != 0) {
            str5 = aersVar.l;
        } else {
            str5 = null;
        }
        if ((i & 4096) != 0) {
            z3 = aersVar.m;
        } else {
            z3 = false;
        }
        if ((i & 8192) != 0) {
            num = aersVar.n;
        } else {
            num = null;
        }
        if ((i & 16384) != 0) {
            num2 = aersVar.o;
        } else {
            num2 = null;
        }
        if ((32768 & i) != 0) {
            aezfVar2 = aersVar.p;
        } else {
            aezfVar2 = aezfVar;
        }
        if ((65536 & i) != 0) {
            i2 = aersVar.s;
        } else {
            i2 = 0;
        }
        if ((131072 & i) != 0) {
            arqgVar3 = aersVar.q;
        } else {
            arqgVar3 = arqgVar;
        }
        if ((i & 262144) != 0) {
            arqgVar4 = aersVar.r;
        } else {
            arqgVar4 = arqgVar2;
        }
        aeroVar.getClass();
        aerpVar2.getClass();
        str3.getClass();
        str4.getClass();
        aetkVar.getClass();
        if (i2 != 0) {
            arqgVar3.getClass();
            arqgVar4.getClass();
            return new aers(uri, uri2, uri3, aergVar, aeroVar, aeveVar2, aerpVar2, str3, str4, z2, aetkVar, str5, z3, num, num2, aezfVar2, i2, arqgVar3, arqgVar4);
        }
        throw null;
    }

    @Override // defpackage.aetv
    public final String a() {
        return this.l;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.q;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        return this.r;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        return this.m;
    }

    @Override // defpackage.aeto
    public final aetk e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aers)) {
            return false;
        }
        aers aersVar = (aers) obj;
        if (d.F(this.a, aersVar.a) && d.F(this.b, aersVar.b) && d.F(this.c, aersVar.c) && d.F(this.d, aersVar.d) && d.F(this.e, aersVar.e) && d.F(this.f, aersVar.f) && this.g == aersVar.g && d.F(this.h, aersVar.h) && d.F(this.i, aersVar.i) && this.j == aersVar.j && d.F(this.k, aersVar.k) && d.F(this.l, aersVar.l) && this.m == aersVar.m && d.F(this.n, aersVar.n) && d.F(this.o, aersVar.o) && d.F(this.p, aersVar.p) && this.s == aersVar.s && d.F(this.q, aersVar.q) && d.F(this.r, aersVar.r)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeto
    public final aezf f() {
        return this.p;
    }

    @Override // defpackage.aeto
    public final Integer g() {
        return this.o;
    }

    @Override // defpackage.aeto
    public final Integer h() {
        return this.n;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        Uri uri = this.a;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        Uri uri2 = this.b;
        if (uri2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri2.hashCode();
        }
        int i2 = hashCode * 31;
        Uri uri3 = this.c;
        if (uri3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri3.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        aerg aergVar = this.d;
        if (aergVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = aergVar.hashCode();
        }
        int hashCode9 = (((i3 + hashCode4) * 31) + this.e.hashCode()) * 31;
        aeve aeveVar = this.f;
        if (aeveVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = aeveVar.hashCode();
        }
        int hashCode10 = (((((((((((hashCode9 + hashCode5) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a.v(this.j)) * 31) + this.k.hashCode()) * 31;
        String str = this.l;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int v = (((hashCode10 + hashCode6) * 31) + a.v(this.m)) * 31;
        Integer num = this.n;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i4 = (v + hashCode7) * 31;
        Integer num2 = this.o;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i5 = (i4 + hashCode8) * 31;
        aezf aezfVar = this.p;
        if (aezfVar != null) {
            i = aezfVar.hashCode();
        }
        int i6 = (i5 + i) * 31;
        int i7 = this.s;
        a.bm(i7);
        return ((((i6 + i7) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    @Override // defpackage.aerq
    public final Uri i() {
        return this.c;
    }

    @Override // defpackage.aeto
    public final int j() {
        return this.s;
    }

    @Override // defpackage.aerq
    public final Uri k() {
        return this.b;
    }

    @Override // defpackage.aerq
    public final Uri l() {
        return this.a;
    }

    @Override // defpackage.aerq
    public final aero m() {
        return this.e;
    }

    @Override // defpackage.aerq
    public final aerp n() {
        return this.g;
    }

    @Override // defpackage.aerq
    public final aeve o() {
        return this.f;
    }

    @Override // defpackage.aerq
    public final String p() {
        return this.i;
    }

    @Override // defpackage.aerq
    public final String q() {
        return this.h;
    }

    @Override // defpackage.aerq
    public final boolean r() {
        return this.j;
    }

    public final String toString() {
        return "ImageBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", fallbackUri=" + this.c + ", requestListener=" + this.d + ", imageBubbleFlags=" + this.e + ", progressBarOverlayUiData=" + this.f + ", state=" + this.g + ", attachmentBubbleTitle=" + this.h + ", attachmentBubbleSubtitle=" + this.i + ", needBlur=" + this.j + ", flags=" + this.k + ", contentDescription=" + this.l + ", isHighlighted=" + this.m + ", width=" + this.n + ", height=" + this.o + ", caption=" + this.p + ", displayMode=" + ((Object) adcx.cv(this.s)) + ", onClick=" + this.q + ", onLayout=" + this.r + ")";
    }
}
