package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeak extends adcx {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final Duration r;
    private final int s;

    public aeak() {
        this(false, false, false, false, 0L, 0L, false, null, null, false, 524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeak)) {
            return false;
        }
        aeak aeakVar = (aeak) obj;
        if (this.m != aeakVar.m || this.n != aeakVar.n || this.a != aeakVar.a) {
            return false;
        }
        boolean z = aeakVar.o;
        if (this.b != aeakVar.b || this.c != aeakVar.c || this.d != aeakVar.d || this.e != aeakVar.e || this.f != aeakVar.f || this.g != aeakVar.g || this.h != aeakVar.h || !d.F(this.i, aeakVar.i) || !d.F(this.j, aeakVar.j) || !d.F(this.k, aeakVar.k) || this.l != aeakVar.l) {
            return false;
        }
        boolean z2 = aeakVar.p;
        boolean z3 = aeakVar.q;
        if (!d.F(this.r, aeakVar.r)) {
            return false;
        }
        int i = aeakVar.s;
        return true;
    }

    public final int hashCode() {
        int v = a.v(this.m);
        String str = this.i;
        boolean z = this.h;
        long j = this.g;
        long j2 = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        boolean z4 = this.c;
        boolean z5 = this.b;
        return (((((((((((((((((((((((((((((((((((v * 31) + a.v(this.n)) * 31) + a.v(this.a)) * 31) + a.v(false)) * 31) + a.v(z5)) * 31) + a.v(z4)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.A(j2)) * 31) + a.A(j)) * 31) + a.v(z)) * 31) + str.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + a.v(this.l)) * 31) + a.v(true)) * 31) + a.v(false)) * 31) + this.r.hashCode()) * 31) + Integer.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aeak(boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, boolean z5, String str, String str2, boolean z6, int i) {
        super(null, null);
        String str3 = (i & 2048) != 0 ? "ondevicesafety-pa.googleapis.com" : str;
        Duration cb = albo.cb(10);
        str3.getClass();
        String str4 = (i & 4096) != 0 ? "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8" : str2;
        str4.getClass();
        String str5 = (i & 8192) != 0 ? "https://www.gstatic.com" : null;
        str5.getClass();
        this.m = 1 == (((i & 1) ^ 1) & (z ? 1 : 0));
        this.n = ((i & 2) == 0) & z2;
        this.a = (!((i & 4) == 0)) | z3;
        this.o = false;
        this.b = (i & 16) != 0;
        this.c = (i & 32) != 0;
        this.d = ((i & 64) == 0) & z4;
        this.e = (i & 128) != 0;
        this.f = (i & 256) != 0 ? -1L : j;
        this.g = (i & 512) != 0 ? 1000L : j2;
        this.h = ((i & 1024) == 0) & z5;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = ((i & 16384) == 0) & z6;
        this.p = true;
        this.q = false;
        this.r = cb;
        this.s = Integer.MAX_VALUE;
    }
}
