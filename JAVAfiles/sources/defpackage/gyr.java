package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyr {
    public final String a;
    public final gtk b;
    public final gsi c;
    public final long d;
    public final long e;
    public final long f;
    public final gsf g;
    public final int h;
    public final gry i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public gyr(String str, gtk gtkVar, gsi gsiVar, long j, long j2, long j3, gsf gsfVar, int i, gry gryVar, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        gtkVar.getClass();
        gsiVar.getClass();
        gryVar.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = gtkVar;
        this.c = gsiVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = gsfVar;
        this.h = i;
        this.i = gryVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyr)) {
            return false;
        }
        gyr gyrVar = (gyr) obj;
        if (d.F(this.a, gyrVar.a) && this.b == gyrVar.b && d.F(this.c, gyrVar.c) && this.d == gyrVar.d && this.e == gyrVar.e && this.f == gyrVar.f && d.F(this.g, gyrVar.g) && this.h == gyrVar.h && this.i == gyrVar.i && this.j == gyrVar.j && this.k == gyrVar.k && this.l == gyrVar.l && this.m == gyrVar.m && this.n == gyrVar.n && this.o == gyrVar.o && d.F(this.p, gyrVar.p) && d.F(this.q, gyrVar.q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        gsf gsfVar = this.g;
        long j = this.f;
        int A = (((((((((((hashCode * 31) + a.A(this.d)) * 31) + a.A(this.e)) * 31) + a.A(j)) * 31) + gsfVar.hashCode()) * 31) + this.h) * 31) + this.i.hashCode();
        List list = this.p;
        long j2 = this.n;
        return (((((((((((((((A * 31) + a.A(this.j)) * 31) + a.A(this.k)) * 31) + this.l) * 31) + this.m) * 31) + a.A(j2)) * 31) + this.o) * 31) + list.hashCode()) * 31) + this.q.hashCode();
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
