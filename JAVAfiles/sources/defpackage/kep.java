package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kep implements aeto {
    public final Uri a;
    public final Uri b;
    public final long c;
    public final aeve d;
    public final keo e;
    public final String f;
    public final String g;
    public final aerg h;
    public final String i;
    public final boolean j;
    public final Integer k;
    public final Integer l;
    public final arqg m;
    public final arqg n;
    public final int o;
    private final boolean p;
    private final aetk q;
    private final aezf r;

    public kep(Uri uri, Uri uri2, long j, aeve aeveVar, keo keoVar, String str, String str2, aerg aergVar, aetk aetkVar, String str3, boolean z, Integer num, Integer num2, int i, arqg arqgVar, arqg arqgVar2) {
        keoVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.p = false;
        this.c = j;
        this.d = aeveVar;
        this.e = keoVar;
        this.f = str;
        this.g = str2;
        this.h = aergVar;
        this.q = aetkVar;
        this.i = str3;
        this.j = z;
        this.k = num;
        this.l = num2;
        this.r = null;
        this.o = i;
        this.m = arqgVar;
        this.n = arqgVar2;
    }

    public static /* synthetic */ kep i(kep kepVar, aeve aeveVar, keo keoVar, String str, String str2, arqg arqgVar, arqg arqgVar2, int i) {
        Uri uri;
        Uri uri2;
        long j;
        aeve aeveVar2;
        keo keoVar2;
        String str3;
        String str4;
        aerg aergVar;
        aetk aetkVar;
        String str5;
        boolean z;
        Integer num;
        Integer num2;
        int i2;
        arqg arqgVar3;
        arqg arqgVar4;
        if ((i & 1) != 0) {
            uri = kepVar.a;
        } else {
            uri = null;
        }
        if ((i & 2) != 0) {
            uri2 = kepVar.b;
        } else {
            uri2 = null;
        }
        if ((i & 8) != 0) {
            j = kepVar.c;
        } else {
            j = 0;
        }
        if ((i & 16) != 0) {
            aeveVar2 = kepVar.d;
        } else {
            aeveVar2 = aeveVar;
        }
        if ((i & 32) != 0) {
            keoVar2 = kepVar.e;
        } else {
            keoVar2 = keoVar;
        }
        if ((i & 64) != 0) {
            str3 = kepVar.f;
        } else {
            str3 = str;
        }
        if ((i & 128) != 0) {
            str4 = kepVar.g;
        } else {
            str4 = str2;
        }
        if ((i & 256) != 0) {
            aergVar = kepVar.h;
        } else {
            aergVar = null;
        }
        if ((i & 512) != 0) {
            aetkVar = kepVar.q;
        } else {
            aetkVar = null;
        }
        if ((i & 1024) != 0) {
            str5 = kepVar.i;
        } else {
            str5 = null;
        }
        if ((i & 2048) != 0) {
            z = kepVar.j;
        } else {
            z = false;
        }
        if ((i & 4096) != 0) {
            num = kepVar.k;
        } else {
            num = null;
        }
        if ((i & 8192) != 0) {
            num2 = kepVar.l;
        } else {
            num2 = null;
        }
        if ((32768 & i) != 0) {
            i2 = kepVar.o;
        } else {
            i2 = 0;
        }
        if ((65536 & i) != 0) {
            arqgVar3 = kepVar.m;
        } else {
            arqgVar3 = arqgVar;
        }
        if ((i & 131072) != 0) {
            arqgVar4 = kepVar.n;
        } else {
            arqgVar4 = arqgVar2;
        }
        uri.getClass();
        keoVar2.getClass();
        str3.getClass();
        str4.getClass();
        aetkVar.getClass();
        if (i2 != 0) {
            arqgVar3.getClass();
            arqgVar4.getClass();
            return new kep(uri, uri2, j, aeveVar2, keoVar2, str3, str4, aergVar, aetkVar, str5, z, num, num2, i2, arqgVar3, arqgVar4);
        }
        throw null;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.m;
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
        if (!(obj instanceof kep)) {
            return false;
        }
        kep kepVar = (kep) obj;
        if (!d.F(this.a, kepVar.a) || !d.F(this.b, kepVar.b)) {
            return false;
        }
        boolean z = kepVar.p;
        if (this.c != kepVar.c || !d.F(this.d, kepVar.d) || this.e != kepVar.e || !d.F(this.f, kepVar.f) || !d.F(this.g, kepVar.g) || !d.F(this.h, kepVar.h) || !d.F(this.q, kepVar.q) || !d.F(this.i, kepVar.i) || this.j != kepVar.j || !d.F(this.k, kepVar.k) || !d.F(this.l, kepVar.l)) {
            return false;
        }
        aezf aezfVar = kepVar.r;
        if (d.F(null, null) && this.o == kepVar.o && d.F(this.m, kepVar.m) && d.F(this.n, kepVar.n)) {
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
        int v = (((((hashCode6 + hashCode) * 31) + a.v(false)) * 31) + a.A(this.c)) * 31;
        aeve aeveVar = this.d;
        if (aeveVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aeveVar.hashCode();
        }
        int hashCode7 = (((((((v + hashCode2) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        aerg aergVar = this.h;
        if (aergVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aergVar.hashCode();
        }
        int hashCode8 = (((hashCode7 + hashCode3) * 31) + this.q.hashCode()) * 31;
        String str = this.i;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int v2 = (((hashCode8 + hashCode4) * 31) + a.v(this.j)) * 31;
        Integer num = this.k;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i2 = (v2 + hashCode5) * 31;
        Integer num2 = this.l;
        if (num2 != null) {
            i = num2.hashCode();
        }
        int i3 = this.o;
        a.bm(i3);
        return ((((((i2 + i) * 961) + i3) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    @Override // defpackage.aeto
    public final int j() {
        return this.o;
    }

    public final String toString() {
        return "VideoBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", isTransferring=false, durationMillis=" + this.c + ", progressBarOverlayUiData=" + this.d + ", state=" + this.e + ", attachmentBubbleTitle=" + this.f + ", attachmentBubbleSubtitle=" + this.g + ", requestListener=" + this.h + ", flags=" + this.q + ", contentDescription=" + this.i + ", isHighlighted=" + this.j + ", width=" + this.k + ", height=" + this.l + ", caption=null, displayMode=" + ((Object) adcx.cv(this.o)) + ", onClick=" + this.m + ", onLayout=" + this.n + ")";
    }
}
