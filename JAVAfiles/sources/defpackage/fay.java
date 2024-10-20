package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fay {
    public static final fgv a = new fgv(new Object());
    public final erz b;
    public final fgv c;
    public final long d;
    public final long e;
    public final int f;
    public final ezo g;
    public final boolean h;
    public final fid i;
    public final List j;
    public final fgv k;
    public final boolean l;
    public final int m;
    public final int n;
    public final ero o;
    public final boolean p = false;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    public final agoe u;

    public fay(erz erzVar, fgv fgvVar, long j, long j2, int i, ezo ezoVar, boolean z, fid fidVar, agoe agoeVar, List list, fgv fgvVar2, boolean z2, int i2, int i3, ero eroVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.b = erzVar;
        this.c = fgvVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = ezoVar;
        this.h = z;
        this.i = fidVar;
        this.u = agoeVar;
        this.j = list;
        this.k = fgvVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = eroVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
    }

    public static fay i(agoe agoeVar) {
        erz erzVar = erz.a;
        fgv fgvVar = a;
        fid fidVar = fid.a;
        int i = alog.d;
        return new fay(erzVar, fgvVar, -9223372036854775807L, 0L, 1, null, false, fidVar, agoeVar, alsx.a, fgvVar, false, 1, 0, ero.a, 0L, 0L, 0L, 0L, false);
    }

    public final fay a(fgv fgvVar) {
        return new fay(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, fgvVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, false);
    }

    public final fay b(boolean z, int i, int i2) {
        return new fay(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, false);
    }

    public final fay c(ezo ezoVar) {
        return new fay(this.b, this.c, this.d, this.e, this.f, ezoVar, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, false);
    }

    public final fay d(ero eroVar) {
        return new fay(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, eroVar, this.q, this.r, this.s, this.t, false);
    }

    public final fay e(int i) {
        return new fay(this.b, this.c, this.d, this.e, i, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, false);
    }

    public final fay f(erz erzVar) {
        return new fay(erzVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, false);
    }

    public final boolean g() {
        if (this.f == 3 && this.l && this.n == 0) {
            return true;
        }
        return false;
    }

    public final fay h(fgv fgvVar, long j, long j2, long j3, long j4, fid fidVar, agoe agoeVar, List list) {
        fgv fgvVar2 = this.k;
        boolean z = this.l;
        int i = this.m;
        int i2 = this.n;
        ero eroVar = this.o;
        long j5 = this.q;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new fay(this.b, fgvVar, j2, j3, this.f, this.g, this.h, fidVar, agoeVar, list, fgvVar2, z, i, i2, eroVar, j5, j4, j, elapsedRealtime, false);
    }
}
