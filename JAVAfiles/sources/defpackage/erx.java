package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erx {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public epy g = epy.a;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
    }

    public final int a(int i) {
        return this.g.a(i).b;
    }

    public final int b(long j) {
        epy epyVar = this.g;
        long j2 = this.d;
        if (j != Long.MIN_VALUE) {
            if (j2 == -9223372036854775807L || j < j2) {
                int i = epyVar.b;
                int i2 = epyVar.b;
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final int c(long j) {
        epy epyVar = this.g;
        int i = epyVar.b;
        epyVar.b();
        return -1;
    }

    public final int d(int i) {
        return this.g.a(i).a();
    }

    public final long e(int i, int i2) {
        epx a = this.g.a(i);
        if (a.b != -1) {
            return a.f[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            erx erxVar = (erx) obj;
            if (Objects.equals(this.a, erxVar.a) && Objects.equals(this.b, erxVar.b) && this.c == erxVar.c && this.d == erxVar.d && this.e == erxVar.e && this.f == erxVar.f && Objects.equals(this.g, erxVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return eul.z(this.e);
    }

    public final void g(int i) {
        long j = this.g.a(i).a;
    }

    public final void h() {
        long j = this.g.c;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i2 = ((((hashCode + 217) * 31) + i) * 31) + this.c;
        long j = this.d;
        long j2 = this.e;
        return (((((((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final void i() {
        int i = this.g.d;
    }

    public final void j(int i) {
        boolean z = this.g.a(i).h;
    }

    public final void k(Object obj, Object obj2, int i, long j, long j2, epy epyVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = epyVar;
        this.f = z;
    }

    public final void l() {
        int i = this.g.b;
    }

    public final void m(Object obj, Object obj2, long j, long j2) {
        k(obj, obj2, 0, j, j2, epy.a, false);
    }

    public final void n(int i) {
        l();
        if (i == -1) {
            this.g.b();
        }
    }
}
