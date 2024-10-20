package defpackage;

import defpackage.dhv;
import defpackage.dqm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dip implements dhv.a {
    public final dqm a;
    public final long b;
    public final dlx c;
    public final dls d;
    public final dlt e;
    public final dli f;
    public final String g;
    public final long h;
    public final dqa i;
    public final dqn j;
    public final dpc k;
    public final long l;
    public final dqj m;
    public final cma n;
    public final din o;
    public final cnz p;

    public dip(dqm dqmVar, long j, dlx dlxVar, dls dlsVar, dlt dltVar, dli dliVar, String str, long j2, dqa dqaVar, dqn dqnVar, dpc dpcVar, long j3, dqj dqjVar, cma cmaVar, din dinVar, cnz cnzVar) {
        this.a = dqmVar;
        this.b = j;
        this.c = dlxVar;
        this.d = dlsVar;
        this.e = dltVar;
        this.f = dliVar;
        this.g = str;
        this.h = j2;
        this.i = dqaVar;
        this.j = dqnVar;
        this.k = dpcVar;
        this.l = j3;
        this.m = dqjVar;
        this.n = cmaVar;
        this.o = dinVar;
        this.p = cnzVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final cko c() {
        return this.a.c();
    }

    public final dip d(dip dipVar) {
        if (dipVar == null) {
            return this;
        }
        dqm dqmVar = dipVar.a;
        return dir.b(this, dqmVar.b(), dqmVar.c(), dqmVar.a(), dipVar.b, dipVar.c, dipVar.d, dipVar.e, dipVar.f, dipVar.g, dipVar.h, dipVar.i, dipVar.j, dipVar.k, dipVar.l, dipVar.m, dipVar.n, dipVar.o, dipVar.p);
    }

    public final boolean e(dip dipVar) {
        if (this == dipVar) {
            return true;
        }
        if (a.bB(this.b, dipVar.b) && d.F(this.c, dipVar.c) && d.F(this.d, dipVar.d) && d.F(this.e, dipVar.e) && d.F(this.f, dipVar.f) && d.F(this.g, dipVar.g) && a.bB(this.h, dipVar.h) && d.F(this.i, dipVar.i) && d.F(this.j, dipVar.j) && d.F(this.k, dipVar.k) && a.bB(this.l, dipVar.l) && d.F(this.o, dipVar.o)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dip)) {
            return false;
        }
        dip dipVar = (dip) obj;
        if (e(dipVar) && f(dipVar)) {
            return true;
        }
        return false;
    }

    public final boolean f(dip dipVar) {
        if (!d.F(this.a, dipVar.a) || !d.F(this.m, dipVar.m) || !d.F(this.n, dipVar.n) || !d.F(this.p, dipVar.p)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int A = a.A(b());
        cko c = c();
        int i13 = 0;
        if (c != null) {
            i = c.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = (((((A * 31) + i) * 31) + Float.floatToIntBits(a())) * 31) + a.A(this.b);
        dlx dlxVar = this.c;
        if (dlxVar != null) {
            i2 = dlxVar.h;
        } else {
            i2 = 0;
        }
        int i14 = ((floatToIntBits * 31) + i2) * 31;
        dls dlsVar = this.d;
        if (dlsVar != null) {
            i3 = dlsVar.a;
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        dlt dltVar = this.e;
        if (dltVar != null) {
            i4 = dltVar.a;
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        dli dliVar = this.f;
        if (dliVar != null) {
            i5 = dliVar.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str = this.g;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int A2 = (((i17 + i6) * 31) + a.A(this.h)) * 31;
        dqa dqaVar = this.i;
        if (dqaVar != null) {
            i7 = Float.floatToIntBits(dqaVar.a);
        } else {
            i7 = 0;
        }
        int i18 = (A2 + i7) * 31;
        dqn dqnVar = this.j;
        if (dqnVar != null) {
            i8 = dqnVar.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        dpc dpcVar = this.k;
        if (dpcVar != null) {
            i9 = dpcVar.hashCode();
        } else {
            i9 = 0;
        }
        int A3 = (((i19 + i9) * 31) + a.A(this.l)) * 31;
        dqj dqjVar = this.m;
        if (dqjVar != null) {
            i10 = dqjVar.d;
        } else {
            i10 = 0;
        }
        int i20 = (A3 + i10) * 31;
        cma cmaVar = this.n;
        if (cmaVar != null) {
            i11 = cmaVar.hashCode();
        } else {
            i11 = 0;
        }
        int i21 = (i20 + i11) * 31;
        din dinVar = this.o;
        if (dinVar != null) {
            i12 = dinVar.hashCode();
        } else {
            i12 = 0;
        }
        int i22 = (i21 + i12) * 31;
        cnz cnzVar = this.p;
        if (cnzVar != null) {
            i13 = cnzVar.hashCode();
        }
        return i22 + i13;
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) cku.g(b())) + ", brush=" + c() + ", alpha=" + a() + ", fontSize=" + ((Object) drm.d(this.b)) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + ((Object) drm.d(this.h)) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + ((Object) cku.g(this.l)) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + this.o + ", drawStyle=" + this.p + ')';
    }

    public /* synthetic */ dip(long j, long j2, dlx dlxVar, dls dlsVar, dlt dltVar, dli dliVar, String str, long j3, dqa dqaVar, dqn dqnVar, long j4, dqj dqjVar, cma cmaVar, int i) {
        this((i & 1) != 0 ? cku.h : j, (i & 2) != 0 ? drm.a : j2, (i & 4) != 0 ? null : dlxVar, (i & 8) != 0 ? null : dlsVar, (i & 16) != 0 ? null : dltVar, (i & 32) != 0 ? null : dliVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? drm.a : j3, (i & 256) != 0 ? null : dqaVar, (i & 512) != 0 ? null : dqnVar, (i & 2048) != 0 ? cku.h : j4, (i & 4096) != 0 ? null : dqjVar, (i & 8192) != 0 ? null : cmaVar);
    }

    public /* synthetic */ dip(long j, long j2, dlx dlxVar, dls dlsVar, dlt dltVar, dli dliVar, String str, long j3, dqa dqaVar, dqn dqnVar, long j4, dqj dqjVar, cma cmaVar) {
        this(dqm.a.a(j), j2, dlxVar, dlsVar, dltVar, dliVar, str, j3, dqaVar, dqnVar, null, j4, dqjVar, cmaVar, null, null);
    }
}
