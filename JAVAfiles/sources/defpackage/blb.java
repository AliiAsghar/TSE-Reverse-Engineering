package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public blb(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public static final zr a(dhs dhsVar, bwj bwjVar) {
        if (dhsVar == dhs.b) {
            bwjVar.y(650996910);
            aap a = bnu.a(buz.e, bwjVar);
            ((bwk) bwjVar).Y();
            return a;
        }
        bwjVar.y(651090220);
        aap a2 = bnu.a(buz.d, bwjVar);
        ((bwk) bwjVar).Y();
        return a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof blb)) {
            return false;
        }
        blb blbVar = (blb) obj;
        if (a.bB(this.a, blbVar.a) && a.bB(this.b, blbVar.b) && a.bB(this.c, blbVar.c) && a.bB(this.d, blbVar.d) && a.bB(this.e, blbVar.e) && a.bB(this.f, blbVar.f) && a.bB(this.g, blbVar.g) && a.bB(this.h, blbVar.h) && a.bB(this.i, blbVar.i) && a.bB(this.j, blbVar.j) && a.bB(this.k, blbVar.k) && a.bB(this.l, blbVar.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A = a.A(this.a) * 31;
        long j = this.l;
        long j2 = this.k;
        long j3 = this.j;
        long j4 = this.i;
        long j5 = this.h;
        long j6 = this.g;
        long j7 = this.f;
        long j8 = this.e;
        long j9 = this.d;
        return ((((((((((((((((((((A + a.A(this.b)) * 31) + a.A(this.c)) * 31) + a.A(j9)) * 31) + a.A(j8)) * 31) + a.A(j7)) * 31) + a.A(j6)) * 31) + a.A(j5)) * 31) + a.A(j4)) * 31) + a.A(j3)) * 31) + a.A(j2)) * 31) + a.A(j);
    }
}
