package defpackage;

import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fap {
    public final fgv a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public fap(fgv fgvVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        if (z3 && !z) {
            z4 = false;
        } else {
            z4 = true;
        }
        d.s(z4);
        if (z2 && !z) {
            z5 = false;
        } else {
            z5 = true;
        }
        d.s(z5);
        d.s(true);
        this.a = fgvVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final fap a(long j) {
        if (j == this.c) {
            return this;
        }
        return new fap(this.a, this.b, j, this.d, this.e, this.g, this.h, this.i);
    }

    public final fap b(long j) {
        if (j == this.b) {
            return this;
        }
        return new fap(this.a, j, this.c, this.d, this.e, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fap fapVar = (fap) obj;
            if (this.b == fapVar.b && this.c == fapVar.c && this.d == fapVar.d && this.e == fapVar.e && this.g == fapVar.g && this.h == fapVar.h && this.i == fapVar.i && Objects.equals(this.a, fapVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((((((((hashCode * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
