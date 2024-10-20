package defpackage;

import defpackage.cxn;
import defpackage.cxt;
import defpackage.czb;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyd {
    public final cxn a;
    public boolean c;
    public boolean d;
    public dqs h;
    public final cwu b = new cwu();
    public final cyy e = new cyy();
    public final cbh f = new cbh(new czb.a[16]);
    public final cbh g = new cbh(new a[16]);
    public final cxy i = null;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final cxn a;
        public final boolean b;
        public final boolean c;

        public a(cxn cxnVar, boolean z, boolean z2) {
            this.a = cxnVar;
            this.b = z;
            this.c = z2;
        }
    }

    public cyd(cxn cxnVar) {
        this.a = cxnVar;
    }

    public static final boolean l(cxn cxnVar, dqs dqsVar) {
        boolean ao;
        if (cxnVar.k == null) {
            return false;
        }
        if (dqsVar != null) {
            ao = cxnVar.ao(dqsVar);
        } else {
            ao = cxnVar.ao(cxnVar.x.c());
        }
        cxn t = cxnVar.t();
        if (ao && t != null) {
            if (t.k == null) {
                cxn.aw(t, false, 3);
            } else if (cxnVar.s() == cxn.c.a) {
                cxn.au(t, false, 3);
            } else if (cxnVar.s() == cxn.c.b) {
                t.aa(false);
                return true;
            }
        }
        return ao;
    }

    public static final boolean m(cxn cxnVar, dqs dqsVar) {
        boolean ap;
        if (dqsVar != null) {
            ap = cxnVar.ap(dqsVar);
        } else {
            ap = cxnVar.ap(cxnVar.x.b());
        }
        cxn t = cxnVar.t();
        if (ap && t != null) {
            if (cxnVar.r() == cxn.c.a) {
                cxn.aw(t, false, 3);
            } else if (cxnVar.r() == cxn.c.b) {
                t.ab(false);
                return true;
            }
        }
        return ap;
    }

    public static final boolean n(cxn cxnVar) {
        if (cxnVar.al() && s(cxnVar)) {
            return true;
        }
        return false;
    }

    public static final boolean o(cxn cxnVar) {
        if (cxnVar.ak() && t(cxnVar)) {
            return true;
        }
        return false;
    }

    private final void p(cxn cxnVar, boolean z) {
        cbh o = cxnVar.o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar2 = (cxn) objArr[i2];
                if ((!z && s(cxnVar2)) || (z && t(cxnVar2))) {
                    if (cxx.a(cxnVar2) && !z) {
                        if (cxnVar2.ak() && this.b.b(cxnVar2, true)) {
                            r(cxnVar2, true, false);
                        } else {
                            e(cxnVar2, true);
                        }
                    }
                    q(cxnVar2, z);
                    if (!u(cxnVar2, z)) {
                        p(cxnVar2, z);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        q(cxnVar, z);
    }

    private final void q(cxn cxnVar, boolean z) {
        if (u(cxnVar, z) && this.b.b(cxnVar, z)) {
            r(cxnVar, z, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r0.j() != true) goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean r(defpackage.cxn r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r5.C
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r5.ew()
            r2 = 1
            if (r0 != 0) goto L47
            boolean r0 = r5.an()
            if (r0 != 0) goto L47
            boolean r0 = n(r5)
            if (r0 != 0) goto L47
            java.lang.Boolean r0 = r5.A()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            boolean r0 = defpackage.d.F(r0, r3)
            if (r0 != 0) goto L47
            boolean r0 = o(r5)
            if (r0 != 0) goto L47
            cxt r0 = r5.x
            cxt$b r3 = r0.r
            cwe r3 = r3.u
            boolean r3 = r3.j()
            if (r3 != 0) goto L47
            cxt$a r0 = r0.s
            if (r0 == 0) goto Ldd
            cwe r0 = r0.q
            if (r0 == 0) goto Ldd
            boolean r0 = r0.j()
            if (r0 != r2) goto Ldd
        L47:
            cxn r0 = r4.a
            if (r5 != r0) goto L51
            dqs r0 = r4.h
            r0.getClass()
            goto L52
        L51:
            r0 = 0
        L52:
            if (r6 == 0) goto L7a
            boolean r6 = r5.ak()
            if (r6 == 0) goto L5e
            boolean r1 = l(r5, r0)
        L5e:
            if (r7 == 0) goto Lda
            if (r1 != 0) goto L68
            boolean r6 = r5.aj()
            if (r6 == 0) goto Lda
        L68:
            java.lang.Boolean r6 = r5.A()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            boolean r6 = defpackage.d.F(r6, r7)
            if (r6 == 0) goto Lda
            r5.R()
            goto Lda
        L7a:
            boolean r6 = r5.al()
            if (r6 == 0) goto L85
            boolean r6 = m(r5, r0)
            goto L86
        L85:
            r6 = r1
        L86:
            if (r7 == 0) goto Ld9
            boolean r7 = r5.ai()
            if (r7 == 0) goto Ld9
            cxn r7 = r4.a
            if (r5 == r7) goto La4
            cxn r7 = r5.t()
            if (r7 == 0) goto Ld9
            boolean r7 = r7.ew()
            if (r7 != r2) goto Ld9
            boolean r7 = r5.an()
            if (r7 == 0) goto Ld9
        La4:
            cxn r7 = r4.a
            if (r5 != r7) goto Ld1
            cxn$c r7 = r5.u
            cxn$c r0 = cxn.c.c
            if (r7 != r0) goto Lb1
            r5.H()
        Lb1:
            cxn r7 = r5.t()
            if (r7 == 0) goto Lbf
            cyn r7 = r7.x()
            cvc$a r7 = r7.l
            if (r7 != 0) goto Lc9
        Lbf:
            czb r7 = defpackage.cxq.a(r5)
            cuy r0 = new cuy
            r0.<init>(r7)
            r7 = r0
        Lc9:
            cxt$b r0 = r5.w()
            cvc.a.m(r7, r0, r1, r1)
            goto Ld4
        Ld1:
            r5.Z()
        Ld4:
            cyy r7 = r4.e
            r7.b(r5)
        Ld9:
            r1 = r6
        Lda:
            r4.c()
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyd.r(cxn, boolean, boolean):boolean");
    }

    private static final boolean s(cxn cxnVar) {
        if (cxnVar.r() != cxn.c.a && !cxnVar.x.r.u.j()) {
            return false;
        }
        return true;
    }

    private static final boolean t(cxn cxnVar) {
        cwe cweVar;
        if (cxnVar.s() == cxn.c.a) {
            return true;
        }
        cxt.a aVar = cxnVar.x.s;
        if (aVar == null || (cweVar = aVar.q) == null) {
            return false;
        }
        if (cweVar.j()) {
            return true;
        }
        return false;
    }

    private static final boolean u(cxn cxnVar, boolean z) {
        if (z) {
            return cxnVar.ak();
        }
        return cxnVar.al();
    }

    public final void a() {
        cbh cbhVar = this.f;
        int i = cbhVar.b;
        if (i > 0) {
            Object[] objArr = cbhVar.a;
            int i2 = 0;
            do {
                ((czb.a) objArr[i2]).a();
                i2++;
            } while (i2 < i);
        }
        this.f.g();
    }

    public final void b(boolean z) {
        if (z) {
            cyy cyyVar = this.e;
            cxn cxnVar = this.a;
            cyyVar.a.g();
            cyyVar.a.n(cxnVar);
            cxnVar.B = true;
        }
        cyy cyyVar2 = this.e;
        cyyVar2.a.j(cyx.a);
        int i = cyyVar2.a.b;
        cxn[] cxnVarArr = cyyVar2.b;
        if (cxnVarArr == null || cxnVarArr.length < i) {
            cxnVarArr = new cxn[Math.max(16, i)];
        }
        cyyVar2.b = null;
        for (int i2 = 0; i2 < i; i2++) {
            cxnVarArr[i2] = (cxn) cyyVar2.a.a[i2];
        }
        cyyVar2.a.g();
        while (true) {
            i--;
            if (i >= 0) {
                cxn cxnVar2 = cxnVarArr[i];
                cxnVar2.getClass();
                if (cxnVar2.B) {
                    cyyVar2.a(cxnVar2);
                }
            } else {
                cyyVar2.b = cxnVarArr;
                return;
            }
        }
    }

    public final void c() {
        cbh cbhVar = this.g;
        int i = cbhVar.b;
        if (i != 0) {
            if (i > 0) {
                Object[] objArr = cbhVar.a;
                int i2 = 0;
                do {
                    a aVar = (a) objArr[i2];
                    if (aVar.a.am()) {
                        if (!aVar.b) {
                            cxn.aw(aVar.a, aVar.c, 2);
                        } else {
                            cxn.au(aVar.a, aVar.c, 2);
                        }
                    }
                    i2++;
                } while (i2 < i);
            }
            this.g.g();
        }
    }

    public final void d(cxn cxnVar) {
        cbh o = cxnVar.o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar2 = (cxn) objArr[i2];
                if (d.F(cxnVar2.A(), true) && !cxnVar2.C) {
                    if (this.b.b(cxnVar2, true)) {
                        cxnVar2.R();
                    }
                    d(cxnVar2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void e(cxn cxnVar, boolean z) {
        if (this.b.c(z)) {
            return;
        }
        if (!this.c) {
            csg.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(cxnVar, z)) {
            csg.b("node not yet measured");
        }
        p(cxnVar, z);
    }

    public final void f(cxn cxnVar) {
        cbh o = cxnVar.o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar2 = (cxn) objArr[i2];
                if (s(cxnVar2)) {
                    if (cxx.a(cxnVar2)) {
                        g(cxnVar2, true);
                    } else {
                        f(cxnVar2);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void g(cxn cxnVar, boolean z) {
        dqs dqsVar;
        if (cxnVar.C) {
            return;
        }
        if (cxnVar == this.a) {
            dqsVar = this.h;
            dqsVar.getClass();
        } else {
            dqsVar = null;
        }
        if (z) {
            l(cxnVar, dqsVar);
        } else {
            m(cxnVar, dqsVar);
        }
    }

    public final boolean h() {
        return this.b.d();
    }

    public final boolean i(arqg arqgVar) {
        boolean z;
        cws cwsVar;
        if (!this.a.am()) {
            csg.b("performMeasureAndLayout called with unattached root");
        }
        if (!this.a.ew()) {
            csg.b("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            csg.b("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                if (this.b.d()) {
                    cwu cwuVar = this.b;
                    z = false;
                    while (cwuVar.d()) {
                        boolean d = cwuVar.a.d();
                        boolean z3 = !d;
                        if (!d) {
                            cwsVar = cwuVar.a;
                        } else {
                            cwsVar = cwuVar.b;
                        }
                        cxn a2 = cwsVar.a();
                        boolean r = r(a2, z3, true);
                        if (a2 == this.a && r) {
                            z = true;
                        }
                    }
                    if (arqgVar != null) {
                        arqgVar.a();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z2 = z;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        }
        a();
        return z2;
    }

    public final boolean j(cxn cxnVar, boolean z) {
        cxn.a q = cxnVar.q();
        cxn.a aVar = cxn.a.a;
        int ordinal = q.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    if (!cxnVar.al() || z) {
                        cxnVar.U();
                        if (!cxnVar.C && (cxnVar.ew() || n(cxnVar))) {
                            cxn t = cxnVar.t();
                            if (t == null || !t.al()) {
                                this.b.a(cxnVar, false);
                            }
                            if (!this.d) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new armm();
                }
            } else {
                this.g.n(new a(cxnVar, false, z));
            }
        }
        return false;
    }
}
