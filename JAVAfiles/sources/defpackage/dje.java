package defpackage;

import defpackage.dqm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dje {
    public static final dje a = new dje(0, 0, null, null, 0, 0, 0, 16777215);
    public final dip b;
    public final dij c;
    public final dio d;

    public dje(dip dipVar, dij dijVar, dio dioVar) {
        this.b = dipVar;
        this.c = dijVar;
        this.d = dioVar;
    }

    public static /* synthetic */ dje y(dje djeVar, long j, long j2, dlx dlxVar, dls dlsVar, dli dliVar, String str, long j3, int i, int i2, long j4, dio dioVar, dqg dqgVar, int i3, int i4) {
        dqp dqpVar;
        din dinVar;
        long b = (i4 & 1) != 0 ? djeVar.b.b() : j;
        long j5 = (i4 & 2) != 0 ? djeVar.b.b : j2;
        dlx dlxVar2 = (i4 & 4) != 0 ? djeVar.b.c : dlxVar;
        dls dlsVar2 = (i4 & 8) != 0 ? djeVar.b.d : dlsVar;
        dlt dltVar = (i4 & 16) != 0 ? djeVar.b.e : null;
        dli dliVar2 = (i4 & 32) != 0 ? djeVar.b.f : dliVar;
        String str2 = (i4 & 64) != 0 ? djeVar.b.g : str;
        long j6 = (i4 & 128) != 0 ? djeVar.b.h : j3;
        dqa dqaVar = (i4 & 256) != 0 ? djeVar.b.i : null;
        dqn dqnVar = (i4 & 512) != 0 ? djeVar.b.j : null;
        dpc dpcVar = (i4 & 1024) != 0 ? djeVar.b.k : null;
        long j7 = (i4 & 2048) != 0 ? djeVar.b.l : 0L;
        dqj dqjVar = (i4 & 4096) != 0 ? djeVar.b.m : null;
        cma cmaVar = (i4 & 8192) != 0 ? djeVar.b.n : null;
        cnz cnzVar = (i4 & 16384) != 0 ? djeVar.b.p : null;
        int i5 = (32768 & i4) != 0 ? djeVar.c.a : i;
        int i6 = (65536 & i4) != 0 ? djeVar.c.b : i2;
        long j8 = (131072 & i4) != 0 ? djeVar.c.c : j4;
        dqo dqoVar = (262144 & i4) != 0 ? djeVar.c.d : null;
        dio dioVar2 = (524288 & i4) != 0 ? djeVar.d : dioVar;
        dqg dqgVar2 = (1048576 & i4) != 0 ? djeVar.c.f : dqgVar;
        int i7 = (2097152 & i4) != 0 ? djeVar.c.g : 0;
        int i8 = (i4 & 4194304) != 0 ? djeVar.c.h : i3;
        dqp dqpVar2 = djeVar.c.i;
        String str3 = str2;
        long j9 = j6;
        dqm a2 = a.bB(b, djeVar.b.b()) ? djeVar.b.a : dqm.a.a(b);
        if (dioVar2 != null) {
            dinVar = dioVar2.a;
            dqpVar = dqpVar2;
        } else {
            dqpVar = dqpVar2;
            dinVar = null;
        }
        dio dioVar3 = dioVar2;
        return new dje(new dip(a2, j5, dlxVar2, dlsVar2, dltVar, dliVar2, str3, j9, dqaVar, dqnVar, dpcVar, j7, dqjVar, cmaVar, dinVar, cnzVar), new dij(i5, i6, j8, dqoVar, dioVar3 != null ? dioVar3.b : null, dqgVar2, i7, i8, dqpVar), dioVar3);
    }

    public static /* synthetic */ dje z(dje djeVar, long j, long j2, long j3, int i, long j4, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        int i3;
        long j9;
        if ((i2 & 1) != 0) {
            j5 = cku.h;
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = drm.a;
        } else {
            j6 = j2;
        }
        if ((i2 & 128) != 0) {
            j7 = drm.a;
        } else {
            j7 = j3;
        }
        if ((i2 & 2048) != 0) {
            j8 = cku.h;
        } else {
            j8 = 0;
        }
        long j10 = j8;
        int i4 = Integer.MIN_VALUE;
        if ((32768 & i2) != 0) {
            i3 = Integer.MIN_VALUE;
        } else {
            i3 = i;
        }
        if ((65536 & i2) == 0) {
            i4 = 0;
        }
        if ((i2 & 131072) != 0) {
            j9 = drm.a;
        } else {
            j9 = j4;
        }
        dip b = dir.b(djeVar.b, j5, null, Float.NaN, j6, null, null, null, null, null, j7, null, null, null, j10, null, null, null, null);
        dij a2 = dik.a(djeVar.c, i3, i4, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        if (djeVar.b == b && djeVar.c == a2) {
            return djeVar;
        }
        return new dje(b, a2);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dje)) {
            return false;
        }
        dje djeVar = (dje) obj;
        if (d.F(this.b, djeVar.b) && d.F(this.c, djeVar.c) && d.F(this.d, djeVar.d)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.b.b();
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.b.h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        dio dioVar = this.d;
        if (dioVar != null) {
            i = dioVar.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    public final long i() {
        return this.c.c;
    }

    public final cko j() {
        return this.b.c();
    }

    public final cma k() {
        return this.b.n;
    }

    public final cnz l() {
        return this.b.p;
    }

    public final dje m(dje djeVar) {
        if (djeVar != null && !d.F(djeVar, a)) {
            return new dje(this.b.d(djeVar.b), this.c.a(djeVar.c));
        }
        return this;
    }

    public final dli n() {
        return this.b.f;
    }

    public final dls o() {
        return this.b.d;
    }

    public final dlt p() {
        return this.b.e;
    }

    public final dlx q() {
        return this.b.c;
    }

    public final dpc r() {
        return this.b.k;
    }

    public final dqg s() {
        return this.c.f;
    }

    public final dqj t() {
        return this.b.m;
    }

    public final String toString() {
        return "TextStyle(color=" + ((Object) cku.g(f())) + ", brush=" + j() + ", alpha=" + a() + ", fontSize=" + ((Object) drm.d(g())) + ", fontWeight=" + q() + ", fontStyle=" + o() + ", fontSynthesis=" + p() + ", fontFamily=" + n() + ", fontFeatureSettings=" + this.b.g + ", letterSpacing=" + ((Object) drm.d(h())) + ", baselineShift=" + this.b.i + ", textGeometricTransform=" + this.b.j + ", localeList=" + r() + ", background=" + ((Object) cku.g(e())) + ", textDecoration=" + t() + ", shadow=" + k() + ", drawStyle=" + l() + ", textAlign=" + ((Object) dqi.a(c())) + ", textDirection=" + ((Object) dqk.a(d())) + ", lineHeight=" + ((Object) drm.d(i())) + ", textIndent=" + u() + ", platformStyle=" + this.d + ", lineHeightStyle=" + s() + ", lineBreak=" + ((Object) dqe.a(b())) + ", hyphens=" + ((Object) dqd.a(this.c.h)) + ", textMotion=" + v() + ')';
    }

    public final dqo u() {
        return this.c.d;
    }

    public final dqp v() {
        return this.c.i;
    }

    public final boolean w(dje djeVar) {
        if (this != djeVar && !this.b.f(djeVar.b)) {
            return false;
        }
        return true;
    }

    public final boolean x(dje djeVar) {
        if (this == djeVar) {
            return true;
        }
        if (d.F(this.c, djeVar.c) && this.b.e(djeVar.b)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ dje(long j, long j2, dlx dlxVar, dli dliVar, long j3, int i, long j4, int i2) {
        this(new dip((i2 & 1) != 0 ? cku.h : j, (i2 & 2) != 0 ? drm.a : j2, (i2 & 4) != 0 ? null : dlxVar, null, null, (i2 & 32) != 0 ? null : dliVar, null, (i2 & 128) != 0 ? drm.a : j3, null, null, (i2 & 2048) != 0 ? cku.h : 0L, null, null), new dij((32768 & i2) != 0 ? Integer.MIN_VALUE : i, (65536 & i2) == 0 ? 0 : Integer.MIN_VALUE, (i2 & 131072) != 0 ? drm.a : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dje(defpackage.dip r4, defpackage.dij r5) {
        /*
            r3 = this;
            din r0 = r4.o
            dim r1 = r5.e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            dio r2 = new dio
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dje.<init>(dip, dij):void");
    }
}
