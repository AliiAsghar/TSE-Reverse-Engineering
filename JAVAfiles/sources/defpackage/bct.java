package defpackage;

import defpackage.bcy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bct implements bcw {
    public final long a;
    private final arqg b;
    private final arqg c;
    private diy d;
    private int e = -1;

    public bct(long j, arqg arqgVar, arqg arqgVar2) {
        this.a = j;
        this.b = arqgVar;
        this.c = arqgVar2;
    }

    private final synchronized int m(diy diyVar) {
        int e;
        if (this.d != diyVar) {
            if (diyVar.r() && !diyVar.b.b) {
                int s = arrn.s(diyVar.h((int) (diyVar.c & 4294967295L)), diyVar.e() - 1);
                while (s >= 0 && diyVar.d(s) >= ((int) (diyVar.c & 4294967295L))) {
                    s--;
                }
                e = arrn.r(s, 0);
                this.e = diyVar.f(e, true);
                this.d = diyVar;
            }
            e = diyVar.e() - 1;
            this.e = diyVar.f(e, true);
            this.d = diyVar;
        }
        return this.e;
    }

    @Override // defpackage.bcw
    public final float a(int i) {
        diy diyVar;
        int g;
        Object a = this.c.a();
        if (a != null && (g = (diyVar = (diy) a).g(i)) < diyVar.e()) {
            float d = diyVar.d(g);
            return ((diyVar.a(g) - d) / 2.0f) + d;
        }
        return -1.0f;
    }

    @Override // defpackage.bcw
    public final float b(int i) {
        diy diyVar;
        int g;
        Object a = this.c.a();
        if (a != null && (g = (diyVar = (diy) a).g(i)) < diyVar.e()) {
            return diyVar.b(g);
        }
        return -1.0f;
    }

    @Override // defpackage.bcw
    public final float c(int i) {
        diy diyVar;
        int g;
        Object a = this.c.a();
        if (a != null && (g = (diyVar = (diy) a).g(i)) < diyVar.e()) {
            return diyVar.c(g);
        }
        return -1.0f;
    }

    @Override // defpackage.bcw
    public final int d() {
        Object a = this.c.a();
        if (a == null) {
            return 0;
        }
        return m((diy) a);
    }

    @Override // defpackage.bcw
    public final long e(bcy bcyVar, boolean z) {
        Object a;
        int i;
        if (z) {
            if (bcyVar.a.c != this.a) {
                return 9205357640488583168L;
            }
        }
        if (!z) {
            if (bcyVar.b.c != this.a) {
                return 9205357640488583168L;
            }
        }
        if (j() != null && (a = this.c.a()) != null) {
            if (z) {
                i = bcyVar.a.b;
            } else {
                i = bcyVar.b.b;
            }
            diy diyVar = (diy) a;
            return bfq.a(diyVar, arrn.u(i, 0, m(diyVar)), z, bcyVar.c);
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.bcw
    public final long f(int i) {
        Object a = this.c.a();
        if (a == null) {
            return djc.a;
        }
        diy diyVar = (diy) a;
        int m = m(diyVar);
        if (m <= 0) {
            return djc.a;
        }
        int g = diyVar.g(arrn.u(i, 0, m - 1));
        long a2 = djd.a(diyVar.i(g), diyVar.f(g, true));
        long j = djc.a;
        return a2;
    }

    @Override // defpackage.bcw
    public final long g() {
        return this.a;
    }

    @Override // defpackage.bcw
    public final bcy h() {
        Object a = this.c.a();
        if (a == null) {
            return null;
        }
        diy diyVar = (diy) a;
        int a2 = diyVar.a.a.a();
        return new bcy(new bcy.a(diyVar.p(0), 0, this.a), new bcy.a(diyVar.p(Math.max(a2 - 1, 0)), a2, this.a), false);
    }

    @Override // defpackage.bcw
    public final cjp i(int i) {
        Object a = this.c.a();
        if (a != null) {
            diy diyVar = (diy) a;
            int a2 = diyVar.a.a.a();
            if (a2 > 0) {
                return diyVar.l(arrn.u(i, 0, a2 - 1));
            }
        }
        return cjp.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cti, java.lang.Object] */
    @Override // defpackage.bcw
    public final cti j() {
        ?? a = this.b.a();
        if (a != 0 && a.r()) {
            return a;
        }
        return null;
    }

    @Override // defpackage.bcw
    public final dhv k() {
        Object a = this.c.a();
        if (a == null) {
            return new dhv("");
        }
        return ((diy) a).a.a;
    }

    @Override // defpackage.bcw
    public final void l(bdr bdrVar) {
        Object a;
        long Q;
        bco bcoVar;
        bco bcoVar2;
        long j;
        diy diyVar;
        bcy.a aVar;
        bco c;
        bco bcoVar3;
        bco bcoVar4;
        bco bcoVar5;
        bco bcoVar6;
        long j2;
        int i;
        int i2;
        bcy.a aVar2;
        int a2;
        int i3;
        bcy.a aVar3;
        bcy.a aVar4;
        cti j3 = j();
        if (j3 != null && (a = this.c.a()) != null) {
            cti ctiVar = bdrVar.c;
            long j4 = bdrVar.a;
            long h = ctiVar.h(j3, 0L);
            long Q2 = a.Q(j4, h);
            long j5 = bdrVar.b;
            if ((j5 & 9223372034707292159L) == 9205357640488583168L) {
                Q = 9205357640488583168L;
            } else {
                Q = a.Q(j5, h);
            }
            long j6 = this.a;
            diy diyVar2 = (diy) a;
            long j7 = diyVar2.c;
            cjp cjpVar = new cjp(brg.a, brg.a, (int) (j7 >> 32), (int) (j7 & 4294967295L));
            int i4 = (int) (Q2 >> 32);
            if (Float.intBitsToFloat(i4) < cjpVar.b) {
                bcoVar = bco.a;
            } else if (Float.intBitsToFloat(i4) > cjpVar.d) {
                bcoVar = bco.c;
            } else {
                bcoVar = bco.b;
            }
            bco bcoVar7 = bcoVar;
            int i5 = (int) (Q2 & 4294967295L);
            if (Float.intBitsToFloat(i5) < cjpVar.c) {
                bcoVar2 = bco.a;
            } else if (Float.intBitsToFloat(i5) > cjpVar.e) {
                bcoVar2 = bco.c;
            } else {
                bcoVar2 = bco.b;
            }
            bco bcoVar8 = bcoVar2;
            if (bdrVar.d) {
                bcy bcyVar = bdrVar.e;
                if (bcyVar != null) {
                    aVar4 = bcyVar.b;
                } else {
                    aVar4 = null;
                }
                j = j6;
                diyVar = diyVar2;
                c = bcu.c(bcoVar7, bcoVar8, bdrVar, j6, aVar4);
                bcoVar5 = c;
                bcoVar6 = bcoVar5;
                bcoVar3 = bcoVar7;
                bcoVar4 = bcoVar8;
            } else {
                j = j6;
                diyVar = diyVar2;
                bcy bcyVar2 = bdrVar.e;
                if (bcyVar2 != null) {
                    aVar = bcyVar2.a;
                } else {
                    aVar = null;
                }
                c = bcu.c(bcoVar7, bcoVar8, bdrVar, j, aVar);
                bcoVar3 = c;
                bcoVar4 = bcoVar3;
                bcoVar5 = bcoVar7;
                bcoVar6 = bcoVar8;
            }
            bco a3 = bdt.a(bcoVar7, bcoVar8);
            if (a3 == bco.b || a3 != c) {
                dix dixVar = diyVar.a;
                boolean z = bdrVar.d;
                int a4 = dixVar.a.a();
                if (z) {
                    int a5 = bcu.a(Q2, diyVar);
                    bcy bcyVar3 = bdrVar.e;
                    if (bcyVar3 != null && (aVar3 = bcyVar3.b) != null) {
                        j2 = j;
                        i3 = bcu.b(aVar3, bdrVar.f, j2, a4);
                    } else {
                        j2 = j;
                        i3 = a5;
                    }
                    i2 = i3;
                    i = a5;
                } else {
                    j2 = j;
                    int a6 = bcu.a(Q2, diyVar);
                    bcy bcyVar4 = bdrVar.e;
                    if (bcyVar4 != null && (aVar2 = bcyVar4.a) != null) {
                        i = bcu.b(aVar2, bdrVar.f, j2, a4);
                        i2 = a6;
                    } else {
                        i = a6;
                        i2 = i;
                    }
                }
                if ((9223372034707292159L & Q) == 9205357640488583168L) {
                    a2 = -1;
                } else {
                    a2 = bcu.a(Q, diyVar);
                }
                int i6 = a2;
                int i7 = bdrVar.j + 2;
                bdrVar.j = i7;
                bcx bcxVar = new bcx(j2, i7, i, i2, i6, diyVar);
                bdrVar.h = bdrVar.a(bdrVar.h, bcoVar3, bcoVar4);
                bdrVar.i = bdrVar.a(bdrVar.i, bcoVar5, bcoVar6);
                bdrVar.k.b(j2, bdrVar.g.size());
                bdrVar.g.add(bcxVar);
            }
        }
    }
}
