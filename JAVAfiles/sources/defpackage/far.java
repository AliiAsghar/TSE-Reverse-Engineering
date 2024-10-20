package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class far {
    public int a;
    public boolean b;
    public ezt c;
    public fao d;
    public fao e;
    public fao f;
    public fao g;
    public int h;
    public Object i;
    public final fbt k;
    public final qdq l;
    private final etu o;
    private long p;
    private long q;
    private final erx m = new erx();
    private final ery n = new ery();
    public List j = new ArrayList();

    public far(fbt fbtVar, etu etuVar, qdq qdqVar, ezt eztVar) {
        this.k = fbtVar;
        this.o = etuVar;
        this.l = qdqVar;
        this.c = eztVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(long j, long j2) {
        if (j != -9223372036854775807L && j != j2) {
            return false;
        }
        return true;
    }

    private final long p(Object obj) {
        for (int i = 0; i < this.j.size(); i++) {
            fao faoVar = (fao) this.j.get(i);
            if (faoVar.b.equals(obj)) {
                return faoVar.g.a.d;
            }
        }
        return -1L;
    }

    private final fap q(erz erzVar, Object obj, int i, int i2, long j, long j2) {
        long j3;
        fgv fgvVar = new fgv(obj, i, i2, j2);
        long e = erzVar.o(fgvVar.a, this.m).e(fgvVar.b, fgvVar.c);
        if (i2 == this.m.d(i)) {
            this.m.h();
        }
        this.m.j(fgvVar.b);
        if (e != -9223372036854775807L && e <= 0) {
            j3 = Math.max(0L, (-1) + e);
        } else {
            j3 = 0;
        }
        return new fap(fgvVar, j3, j, -9223372036854775807L, e, false, false, false);
    }

    private final fap r(erz erzVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        erzVar.o(obj, this.m);
        int b = this.m.b(j7);
        if (b != -1) {
            this.m.n(b);
        }
        if (b == -1) {
            this.m.l();
        } else {
            this.m.j(b);
        }
        fgv fgvVar = new fgv(obj, j3, b);
        boolean v = v(fgvVar);
        boolean u = u(erzVar, fgvVar);
        boolean t = t(erzVar, fgvVar, v);
        if (b != -1) {
            this.m.j(b);
        }
        if (b != -1) {
            this.m.g(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.m.d;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new fap(fgvVar, j7, j2, j6, j5, v, u, t);
    }

    private static fgv s(erz erzVar, Object obj, long j, long j2, ery eryVar, erx erxVar) {
        erzVar.o(obj, erxVar);
        erzVar.p(erxVar.c, eryVar);
        erzVar.a(obj);
        erxVar.l();
        erzVar.o(obj, erxVar);
        int c = erxVar.c(j);
        if (c == -1) {
            return new fgv(obj, j2, erxVar.b(j));
        }
        return new fgv(obj, c, erxVar.d(c), j2);
    }

    private final boolean t(erz erzVar, fgv fgvVar, boolean z) {
        int a = erzVar.a(fgvVar.a);
        if (!erzVar.p(erzVar.n(a, this.m).c, this.n).i && erzVar.i(a, this.m, this.n, this.a, this.b) == -1 && z) {
            return true;
        }
        return false;
    }

    private final boolean u(erz erzVar, fgv fgvVar) {
        if (!v(fgvVar)) {
            return false;
        }
        int i = erzVar.o(fgvVar.a, this.m).c;
        if (erzVar.p(i, this.n).o != erzVar.a(fgvVar.a)) {
            return false;
        }
        return true;
    }

    private static final boolean v(fgv fgvVar) {
        if (!fgvVar.b() && fgvVar.e == -1) {
            return true;
        }
        return false;
    }

    private final void w(erz erzVar, Object obj, int i) {
        erzVar.o(obj, this.m);
        this.m.g(i);
        long j = this.m.g.a(i).g;
    }

    public final fao a() {
        fao faoVar = this.d;
        if (faoVar == null) {
            return null;
        }
        if (faoVar == this.e) {
            this.e = faoVar.i;
        }
        faoVar.h();
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            this.f = null;
            fao faoVar2 = this.d;
            this.i = faoVar2.b;
            this.q = faoVar2.g.a.d;
        }
        this.d = this.d.i;
        h();
        return this.d;
    }

    public final fap b(erz erzVar, fao faoVar, long j) {
        long j2;
        fap fapVar = faoVar.g;
        long j3 = (faoVar.k + fapVar.e) - j;
        if (fapVar.g) {
            long j4 = 0;
            int i = erzVar.i(erzVar.a(fapVar.a.a), this.m, this.n, this.a, this.b);
            if (i != -1) {
                int i2 = erzVar.d(i, this.m, true).c;
                Object obj = this.m.b;
                dzg.g(obj);
                long j5 = fapVar.a.d;
                if (erzVar.p(i2, this.n).n == i) {
                    Pair m = erzVar.m(this.n, this.m, i2, -9223372036854775807L, Math.max(0L, j3));
                    if (m != null) {
                        obj = m.first;
                        long longValue = ((Long) m.second).longValue();
                        fao faoVar2 = faoVar.i;
                        if (faoVar2 != null && faoVar2.b.equals(obj)) {
                            j5 = faoVar2.g.a.d;
                        } else {
                            j5 = p(obj);
                            if (j5 == -1) {
                                j5 = this.p;
                                this.p = 1 + j5;
                            }
                        }
                        j2 = longValue;
                        j4 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                fgv s = s(erzVar, obj, j2, j5, this.n, this.m);
                if (j4 != -9223372036854775807L && fapVar.c != -9223372036854775807L) {
                    erzVar.o(fapVar.a.a, this.m).l();
                    this.m.i();
                }
                return c(erzVar, s, j4, j2);
            }
        } else {
            fgv fgvVar = fapVar.a;
            erzVar.o(fgvVar.a, this.m);
            if (fgvVar.b()) {
                int i3 = fgvVar.b;
                if (this.m.a(i3) != -1) {
                    int b = this.m.g.a(i3).b(fgvVar.c);
                    if (b < 0) {
                        return q(erzVar, fgvVar.a, i3, b, fapVar.c, fgvVar.d);
                    }
                    long j6 = fapVar.c;
                    if (j6 == -9223372036854775807L) {
                        ery eryVar = this.n;
                        erx erxVar = this.m;
                        Pair m2 = erzVar.m(eryVar, erxVar, erxVar.c, -9223372036854775807L, Math.max(0L, j3));
                        if (m2 != null) {
                            j6 = ((Long) m2.second).longValue();
                        }
                    }
                    w(erzVar, fgvVar.a, fgvVar.b);
                    return r(erzVar, fgvVar.a, Math.max(0L, j6), fapVar.c, fgvVar.d);
                }
            } else {
                int i4 = fgvVar.e;
                if (i4 != -1) {
                    this.m.n(i4);
                }
                erx erxVar2 = this.m;
                int i5 = fgvVar.e;
                int d = erxVar2.d(i5);
                erxVar2.j(i5);
                if (d != this.m.a(fgvVar.e)) {
                    return q(erzVar, fgvVar.a, fgvVar.e, d, fapVar.e, fgvVar.d);
                }
                w(erzVar, fgvVar.a, fgvVar.e);
                return r(erzVar, fgvVar.a, 0L, fapVar.e, fgvVar.d);
            }
        }
        return null;
    }

    public final fap c(erz erzVar, fgv fgvVar, long j, long j2) {
        erzVar.o(fgvVar.a, this.m);
        if (fgvVar.b()) {
            return q(erzVar, fgvVar.a, fgvVar.b, fgvVar.c, j, fgvVar.d);
        }
        return r(erzVar, fgvVar.a, j2, j, fgvVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fap d(defpackage.erz r14, defpackage.fap r15) {
        /*
            r13 = this;
            fgv r1 = r15.a
            boolean r10 = v(r1)
            boolean r11 = r13.u(r14, r1)
            boolean r12 = r13.t(r14, r1, r10)
            fgv r0 = r15.a
            java.lang.Object r0 = r0.a
            erx r2 = r13.m
            r14.o(r0, r2)
            boolean r14 = r1.b()
            r0 = -1
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 != 0) goto L31
            int r14 = r1.e
            if (r14 != r0) goto L2a
            goto L31
        L2a:
            erx r6 = r13.m
            r6.g(r14)
            r6 = r2
            goto L32
        L31:
            r6 = r4
        L32:
            boolean r14 = r1.b()
            if (r14 == 0) goto L44
            erx r14 = r13.m
            int r2 = r1.b
            int r3 = r1.c
            long r2 = r14.e(r2, r3)
        L42:
            r8 = r2
            goto L50
        L44:
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 == 0) goto L4b
            r6 = r2
            r8 = r6
            goto L50
        L4b:
            erx r14 = r13.m
            long r2 = r14.d
            goto L42
        L50:
            boolean r14 = r1.b()
            if (r14 == 0) goto L5e
            erx r14 = r13.m
            int r0 = r1.b
            r14.j(r0)
            goto L67
        L5e:
            int r14 = r1.e
            if (r14 == r0) goto L67
            erx r0 = r13.m
            r0.j(r14)
        L67:
            fap r14 = new fap
            long r2 = r15.b
            long r4 = r15.c
            r0 = r14
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.far.d(erz, fap):fap");
    }

    public final fgv e(erz erzVar, Object obj, long j) {
        long p;
        int a;
        int i = erzVar.o(obj, this.m).c;
        Object obj2 = this.i;
        if (obj2 != null && (a = erzVar.a(obj2)) != -1 && erzVar.n(a, this.m).c == i) {
            p = this.q;
        } else {
            fao faoVar = this.d;
            while (true) {
                if (faoVar != null) {
                    if (faoVar.b.equals(obj)) {
                        p = faoVar.g.a.d;
                        break;
                    }
                    faoVar = faoVar.i;
                } else {
                    fao faoVar2 = this.d;
                    while (true) {
                        if (faoVar2 != null) {
                            int a2 = erzVar.a(faoVar2.b);
                            if (a2 != -1 && erzVar.n(a2, this.m).c == i) {
                                p = faoVar2.g.a.d;
                                break;
                            }
                            faoVar2 = faoVar2.i;
                        } else {
                            p = p(obj);
                            if (p == -1) {
                                p = this.p;
                                this.p = 1 + p;
                                if (this.d == null) {
                                    this.i = obj;
                                    this.q = p;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j2 = p;
        erzVar.o(obj, this.m);
        erzVar.p(this.m.c, this.n);
        int a3 = erzVar.a(obj);
        Object obj3 = obj;
        while (true) {
            ery eryVar = this.n;
            if (a3 >= eryVar.n) {
                erzVar.d(a3, this.m, true);
                this.m.l();
                erx erxVar = this.m;
                if (erxVar.c(erxVar.d) != -1) {
                    obj3 = this.m.b;
                    dzg.g(obj3);
                }
                a3--;
            } else {
                return s(erzVar, obj3, j, j2, eryVar, this.m);
            }
        }
    }

    public final void f() {
        if (this.h == 0) {
            return;
        }
        fao faoVar = this.d;
        dzg.h(faoVar);
        this.i = faoVar.b;
        this.q = faoVar.g.a.d;
        while (faoVar != null) {
            faoVar.h();
            faoVar = faoVar.i;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.h = 0;
        h();
    }

    public final void g() {
        fao faoVar = this.g;
        if (faoVar == null || faoVar.l()) {
            this.g = null;
            for (int i = 0; i < this.j.size(); i++) {
                fao faoVar2 = (fao) this.j.get(i);
                if (!faoVar2.l()) {
                    this.g = faoVar2;
                    return;
                }
            }
        }
    }

    public final void h() {
        fgv fgvVar;
        alob alobVar = new alob();
        for (fao faoVar = this.d; faoVar != null; faoVar = faoVar.i) {
            alobVar.h(faoVar.g.a);
        }
        fao faoVar2 = this.e;
        if (faoVar2 == null) {
            fgvVar = null;
        } else {
            fgvVar = faoVar2.g.a;
        }
        this.o.b(new faq(this, alobVar, fgvVar, 0));
    }

    public final void i(long j) {
        fao faoVar = this.f;
        if (faoVar != null) {
            dzg.d(faoVar.m());
            if (faoVar.e) {
                faoVar.a.l(faoVar.d(j));
            }
        }
    }

    public final void j() {
        if (!this.j.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.j.size(); i++) {
                ((fao) this.j.get(i)).h();
            }
            this.j = arrayList;
            this.g = null;
            g();
        }
    }

    public final boolean l(fgt fgtVar) {
        fao faoVar = this.f;
        if (faoVar != null && faoVar.a == fgtVar) {
            return true;
        }
        return false;
    }

    public final boolean m(fgt fgtVar) {
        fao faoVar = this.g;
        if (faoVar != null && faoVar.a == fgtVar) {
            return true;
        }
        return false;
    }

    public final boolean n(fao faoVar) {
        dzg.h(faoVar);
        boolean z = false;
        if (faoVar.equals(this.f)) {
            return false;
        }
        this.f = faoVar;
        while (true) {
            faoVar = faoVar.i;
            if (faoVar != null) {
                if (faoVar == this.e) {
                    this.e = this.d;
                    z = true;
                }
                faoVar.h();
                this.h--;
            } else {
                fao faoVar2 = this.f;
                dzg.g(faoVar2);
                faoVar2.i(null);
                h();
                return z;
            }
        }
    }

    public final boolean o(erz erzVar) {
        fao faoVar;
        fao faoVar2 = this.d;
        if (faoVar2 == null) {
            return true;
        }
        int a = erzVar.a(faoVar2.b);
        while (true) {
            a = erzVar.i(a, this.m, this.n, this.a, this.b);
            while (true) {
                dzg.g(faoVar2);
                faoVar = faoVar2.i;
                if (faoVar == null || faoVar2.g.g) {
                    break;
                }
                faoVar2 = faoVar;
            }
            if (a == -1 || faoVar == null || erzVar.a(faoVar.b) != a) {
                break;
            }
            faoVar2 = faoVar;
        }
        boolean n = n(faoVar2);
        faoVar2.g = d(erzVar, faoVar2.g);
        if (!n) {
            return true;
        }
        return false;
    }
}
