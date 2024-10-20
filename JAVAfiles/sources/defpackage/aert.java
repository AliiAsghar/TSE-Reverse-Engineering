package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aert implements aerq {
    public final aers a;
    public final boolean b;
    public final arqg c;
    public final String d;
    public final arqg e;

    public /* synthetic */ aert(aers aersVar, boolean z, arqg arqgVar, String str, arqg arqgVar2, int i) {
        boolean z2;
        this.a = aersVar;
        if ((i & 2) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.b = z2 & z;
        this.c = (i & 4) != 0 ? null : arqgVar;
        this.d = (i & 8) != 0 ? null : str;
        this.e = (i & 16) != 0 ? null : arqgVar2;
    }

    @Override // defpackage.aetv
    public final String a() {
        return this.a.l;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.a.q;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        return this.a.r;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        return this.a.m;
    }

    @Override // defpackage.aeto
    public final aetk e() {
        return this.a.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aert)) {
            return false;
        }
        aert aertVar = (aert) obj;
        if (d.F(this.a, aertVar.a) && this.b == aertVar.b && d.F(this.c, aertVar.c) && d.F(this.d, aertVar.d) && d.F(this.e, aertVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeto
    public final aezf f() {
        return this.a.p;
    }

    @Override // defpackage.aeto
    public final Integer g() {
        return this.a.o;
    }

    @Override // defpackage.aeto
    public final Integer h() {
        return this.a.n;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        arqg arqgVar = this.c;
        int i = 0;
        if (arqgVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqgVar.hashCode();
        }
        int v = (((hashCode3 + a.v(this.b)) * 31) + hashCode) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (v + hashCode2) * 31;
        arqg arqgVar2 = this.e;
        if (arqgVar2 != null) {
            i = arqgVar2.hashCode();
        }
        return i2 + i;
    }

    @Override // defpackage.aerq
    public final Uri i() {
        return this.a.c;
    }

    @Override // defpackage.aeto
    public final int j() {
        return this.a.s;
    }

    @Override // defpackage.aerq
    public final Uri k() {
        return this.a.b;
    }

    @Override // defpackage.aerq
    public final Uri l() {
        return this.a.a;
    }

    @Override // defpackage.aerq
    public final aero m() {
        return this.a.e;
    }

    @Override // defpackage.aerq
    public final aerp n() {
        return this.a.g;
    }

    @Override // defpackage.aerq
    public final aeve o() {
        return this.a.f;
    }

    @Override // defpackage.aerq
    public final String p() {
        return this.a.i;
    }

    @Override // defpackage.aerq
    public final String q() {
        return this.a.h;
    }

    @Override // defpackage.aerq
    public final boolean r() {
        return this.a.j;
    }

    public final String toString() {
        return "MaskedImageBubbleUiData(imageBubbleUiData=" + this.a + ", showLoadingIndicator=" + this.b + ", onClickToggle=" + this.c + ", contentMaskText=" + this.d + ", onClickContentMask=" + this.e + ")";
    }
}
