package defpackage;

import defpackage.cvc;
import defpackage.cxn;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxt {
    public final cxn a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public a s;
    public cxn.a c = cxn.a.e;
    public final b r = new b();
    public long t = dqt.l(0, 0, 15);
    public final arqg u = new AnonymousClass1();

    /* compiled from: PG */
    /* renamed from: cxt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cxt cxtVar = cxt.this;
            cxtVar.a().e(cxtVar.t);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends cvc implements cuc, cwf, cyh {
        public boolean f;
        public boolean j;
        public boolean k;
        public dqs l;
        public arqr n;
        public cof o;
        public boolean p;
        public boolean t;
        public Object v;
        public boolean w;
        private boolean y;
        public int g = Integer.MAX_VALUE;
        public int h = Integer.MAX_VALUE;
        public cxn.c i = cxn.c.c;
        public long m = 0;
        public final cwe q = new cxz(this);
        public final cbh r = new cbh(new a[16]);
        public boolean s = true;
        public boolean u = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: cxt$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
            final /* synthetic */ cyc b;
            final /* synthetic */ cxt c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(cyc cycVar, cxt cxtVar) {
                super(0);
                this.b = cycVar;
                this.c = cxtVar;
            }

            @Override // defpackage.arqg
            public final /* synthetic */ Object a() {
                cxt cxtVar = cxt.this;
                int i = 0;
                cxtVar.j = 0;
                cbh o = cxtVar.a.o();
                int i2 = o.b;
                if (i2 > 0) {
                    Object[] objArr = o.a;
                    int i3 = 0;
                    do {
                        a aVar = ((cxn) objArr[i3]).x.s;
                        aVar.getClass();
                        aVar.g = aVar.h;
                        aVar.h = Integer.MAX_VALUE;
                        if (aVar.i == cxn.c.b) {
                            aVar.i = cxn.c.c;
                        }
                        i3++;
                    } while (i3 < i2);
                }
                a.this.j(cxr.a);
                cyc cycVar = ((cxc) a.this.i()).g;
                if (cycVar != null) {
                    cxt cxtVar2 = this.c;
                    boolean z = cycVar.k;
                    List D = cxtVar2.a.D();
                    int size = D.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        cyc z2 = ((cxn) D.get(i4)).y().z();
                        if (z2 != null) {
                            z2.k = z;
                        }
                    }
                }
                this.b.H().o();
                if (((cxc) a.this.i()).g != null) {
                    List D2 = this.c.a.D();
                    int size2 = D2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        cyc z3 = ((cxn) D2.get(i5)).y().z();
                        if (z3 != null) {
                            z3.k = false;
                        }
                    }
                }
                cbh o2 = cxt.this.a.o();
                int i6 = o2.b;
                if (i6 > 0) {
                    Object[] objArr2 = o2.a;
                    do {
                        a aVar2 = ((cxn) objArr2[i]).x.s;
                        aVar2.getClass();
                        int i7 = aVar2.g;
                        int i8 = aVar2.h;
                        if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                            aVar2.o();
                        }
                        i++;
                    } while (i < i6);
                }
                a.this.j(cxs.a);
                return arnb.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: cxt$a$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arrp implements arqg<arnb> {
            final /* synthetic */ cxt a;
            final /* synthetic */ czb b;
            final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(cxt cxtVar, czb czbVar, long j) {
                super(0);
                this.a = cxtVar;
                this.b = czbVar;
                this.c = j;
            }

            @Override // defpackage.arqg
            public final /* synthetic */ Object a() {
                cyc z;
                cvc.a aVar = null;
                if (cxx.a(this.a.a)) {
                    cyn cynVar = this.a.a().v;
                    if (cynVar != null) {
                        aVar = cynVar.l;
                    }
                } else {
                    cyn cynVar2 = this.a.a().v;
                    if (cynVar2 != null && (z = cynVar2.z()) != null) {
                        aVar = z.l;
                    }
                }
                if (aVar == null) {
                    aVar = new cuy(this.b);
                }
                cxt cxtVar = this.a;
                long j = this.c;
                cyc z2 = cxtVar.a().z();
                z2.getClass();
                aVar.f(z2, j, brg.a);
                return arnb.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: cxt$a$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends arrp implements arqr<cwf, arnb> {
            public static final AnonymousClass3 a = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                ((cwf) obj).g().c = false;
                return arnb.a;
            }
        }

        public a() {
            this.v = cxt.this.r.r;
        }

        private final void A() {
            cxn.c cVar;
            cxn.au(cxt.this.a, false, 7);
            cxn cxnVar = cxt.this.a;
            cxn t = cxnVar.t();
            if (t != null && cxnVar.u == cxn.c.c) {
                cxt cxtVar = cxt.this;
                cxn.a q = t.q();
                cxn.a aVar = cxn.a.a;
                int ordinal = q.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        cVar = t.u;
                    } else {
                        cVar = cxn.c.b;
                    }
                } else {
                    cVar = cxn.c.a;
                }
                cxtVar.a.u = cVar;
            }
        }

        private final void z() {
            boolean z = this.p;
            this.p = true;
            if (!z) {
                cxt cxtVar = cxt.this;
                if (cxtVar.g) {
                    cxn.au(cxtVar.a, true, 6);
                }
            }
            cbh o = cxt.this.a.o();
            int i = o.b;
            if (i > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar = (cxn) objArr[i2];
                    a v = cxnVar.v();
                    if (v != null) {
                        if (v.h != Integer.MAX_VALUE) {
                            v.z();
                            cxnVar.ac(cxnVar);
                        }
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                    }
                } while (i2 < i);
            }
        }

        @Override // defpackage.ctc
        public final int a(int i) {
            A();
            cyc z = cxt.this.a().z();
            z.getClass();
            return z.a(i);
        }

        @Override // defpackage.ctc
        public final int b(int i) {
            A();
            cyc z = cxt.this.a().z();
            z.getClass();
            return z.b(i);
        }

        @Override // defpackage.ctc
        public final int c(int i) {
            A();
            cyc z = cxt.this.a().z();
            z.getClass();
            return z.c(i);
        }

        @Override // defpackage.ctc
        public final int d(int i) {
            A();
            cyc z = cxt.this.a().z();
            z.getClass();
            return z.d(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r1 == cxn.a.d) goto L13;
         */
        @Override // defpackage.cuc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.cvc e(long r5) {
            /*
                r4 = this;
                cxt r0 = defpackage.cxt.this
                cxn r0 = r0.a
                cxn r0 = r0.t()
                r1 = 0
                if (r0 == 0) goto L10
                cxn$a r0 = r0.q()
                goto L11
            L10:
                r0 = r1
            L11:
                cxn$a r2 = cxn.a.b
                if (r0 == r2) goto L27
                cxt r0 = defpackage.cxt.this
                cxn r0 = r0.a
                cxn r0 = r0.t()
                if (r0 == 0) goto L23
                cxn$a r1 = r0.q()
            L23:
                cxn$a r0 = cxn.a.d
                if (r1 != r0) goto L2c
            L27:
                cxt r0 = defpackage.cxt.this
                r1 = 0
                r0.b = r1
            L2c:
                cxt r0 = defpackage.cxt.this
                cxn r0 = r0.a
                cxn r1 = r0.t()
                if (r1 == 0) goto L78
                cxn$c r2 = r4.i
                cxn$c r3 = cxn.c.c
                if (r2 == r3) goto L45
                boolean r0 = r0.v
                if (r0 != 0) goto L45
                java.lang.String r0 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
                defpackage.csg.c(r0)
            L45:
                cxn$a r0 = r1.q()
                int r0 = r0.ordinal()
                if (r0 == 0) goto L73
                r2 = 1
                if (r0 == r2) goto L73
                r2 = 2
                if (r0 == r2) goto L70
                r2 = 3
                if (r0 != r2) goto L59
                goto L70
            L59:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                cxn$a r6 = r1.q()
                java.util.Objects.toString(r6)
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
                java.lang.String r6 = r0.concat(r6)
                r5.<init>(r6)
                throw r5
            L70:
                cxn$c r0 = cxn.c.b
                goto L75
            L73:
                cxn$c r0 = cxn.c.a
            L75:
                r4.i = r0
                goto L7c
            L78:
                cxn$c r0 = cxn.c.c
                r4.i = r0
            L7c:
                cxt r0 = defpackage.cxt.this
                cxn r0 = r0.a
                cxn$c r1 = r0.u
                cxn$c r2 = cxn.c.c
                if (r1 != r2) goto L89
                r0.G()
            L89:
                r4.s(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: cxt.a.e(long):cvc");
        }

        @Override // defpackage.cvc
        protected final void ee(long j, float f, arqr arqrVar) {
            y(j, arqrVar, null);
        }

        @Override // defpackage.cui
        public final int ei(csh cshVar) {
            cxn.a aVar;
            cxn t = cxt.this.a.t();
            cxn.a aVar2 = null;
            if (t != null) {
                aVar = t.q();
            } else {
                aVar = null;
            }
            if (aVar == cxn.a.b) {
                this.q.c = true;
            } else {
                cxn t2 = cxt.this.a.t();
                if (t2 != null) {
                    aVar2 = t2.q();
                }
                if (aVar2 == cxn.a.d) {
                    this.q.d = true;
                }
            }
            this.j = true;
            cyc z = cxt.this.a().z();
            z.getClass();
            int ei = z.ei(cshVar);
            this.j = false;
            return ei;
        }

        @Override // defpackage.cyh
        public final void ej(boolean z) {
            Boolean bool;
            cyc z2;
            cyc z3 = cxt.this.a().z();
            if (z3 != null) {
                bool = Boolean.valueOf(z3.i);
            } else {
                bool = null;
            }
            if (!d.F(Boolean.valueOf(z), bool) && (z2 = cxt.this.a().z()) != null) {
                z2.i = z;
            }
        }

        @Override // defpackage.cvc, defpackage.ctc
        public final Object f() {
            return this.v;
        }

        @Override // defpackage.cwf
        public final cwe g() {
            return this.q;
        }

        @Override // defpackage.cwf
        public final cwf h() {
            cxt cxtVar;
            cxn t = cxt.this.a.t();
            if (t != null && (cxtVar = t.x) != null) {
                return cxtVar.s;
            }
            return null;
        }

        @Override // defpackage.cwf
        public final cyn i() {
            return cxt.this.a.x();
        }

        @Override // defpackage.cwf
        public final void j(arqr arqrVar) {
            cbh o = cxt.this.a.o();
            int i = o.b;
            if (i > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    a aVar = ((cxn) objArr[i2]).x.s;
                    aVar.getClass();
                    arqrVar.a(aVar);
                    i2++;
                } while (i2 < i);
            }
        }

        @Override // defpackage.cwf
        public final void k() {
            cbh o;
            int i;
            this.t = true;
            this.q.g();
            cxt cxtVar = cxt.this;
            if (cxtVar.h && (i = (o = cxtVar.a.o()).b) > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar = (cxn) objArr[i2];
                    if (cxnVar.ak() && cxnVar.s() == cxn.c.a) {
                        cxt cxtVar2 = cxnVar.x;
                        a aVar = cxtVar2.s;
                        aVar.getClass();
                        dqs c = cxtVar2.c();
                        c.getClass();
                        if (aVar.s(c.a)) {
                            cxn.au(cxtVar.a, false, 7);
                        }
                    }
                    i2++;
                } while (i2 < i);
            }
            cyc cycVar = ((cxc) i()).g;
            cycVar.getClass();
            cxt cxtVar3 = cxt.this;
            if (cxtVar3.i || (!this.j && !cycVar.k && cxtVar3.h)) {
                cxtVar3.h = false;
                cxn.a aVar2 = cxtVar3.c;
                cxtVar3.c = cxn.a.d;
                cxt cxtVar4 = cxt.this;
                czb a = cxq.a(cxtVar4.a);
                cxtVar4.n(false);
                cze czeVar = ((dai) a).s;
                cxt cxtVar5 = cxt.this;
                czeVar.b(cxtVar5.a, true, new AnonymousClass1(cycVar, cxtVar5));
                cxt cxtVar6 = cxt.this;
                cxtVar6.c = aVar2;
                if (cxtVar6.o && cycVar.k) {
                    l();
                }
                cxt.this.i = false;
            }
            cwe cweVar = this.q;
            if (cweVar.d) {
                cweVar.e = true;
            }
            if (cweVar.b && cweVar.j()) {
                this.q.f();
            }
            this.t = false;
        }

        @Override // defpackage.cwf
        public final void l() {
            cxt.this.a.aa(false);
        }

        @Override // defpackage.cwf
        public final void m() {
            cxn.au(cxt.this.a, false, 7);
        }

        @Override // defpackage.cwf
        public final boolean n() {
            return this.p;
        }

        public final void o() {
            if (this.p) {
                int i = 0;
                this.p = false;
                cbh o = cxt.this.a.o();
                int i2 = o.b;
                if (i2 > 0) {
                    Object[] objArr = o.a;
                    do {
                        a aVar = ((cxn) objArr[i]).x.s;
                        aVar.getClass();
                        aVar.o();
                        i++;
                    } while (i < i2);
                }
            }
        }

        public final void p() {
            cbh o;
            int i;
            cxt cxtVar = cxt.this;
            if (cxtVar.q > 0 && (i = (o = cxtVar.a.o()).b) > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar = (cxn) objArr[i2];
                    cxt cxtVar2 = cxnVar.x;
                    if ((cxtVar2.o || cxtVar2.p) && !cxtVar2.h) {
                        cxnVar.aa(false);
                    }
                    a aVar = cxtVar2.s;
                    if (aVar != null) {
                        aVar.p();
                    }
                    i2++;
                } while (i2 < i);
            }
        }

        public final void q() {
            this.w = true;
            cxn t = cxt.this.a.t();
            if (!this.p) {
                z();
                if (this.f && t != null) {
                    t.aa(false);
                }
            }
            if (t != null) {
                if (!this.f && (t.q() == cxn.a.c || t.q() == cxn.a.d)) {
                    if (this.h != Integer.MAX_VALUE) {
                        csg.c("Place was called on a node which was placed already");
                    }
                    cxt cxtVar = t.x;
                    int i = cxtVar.j;
                    this.h = i;
                    cxtVar.j = i + 1;
                }
            } else {
                this.h = 0;
            }
            k();
        }

        public final boolean s(long j) {
            boolean z;
            long j2;
            dqs dqsVar;
            if (cxt.this.a.C) {
                csg.b("measure is called on a deactivated node");
            }
            cxn cxnVar = cxt.this.a;
            cxn t = cxnVar.t();
            if (!cxnVar.v && (t == null || !t.v)) {
                z = false;
            } else {
                z = true;
            }
            cxnVar.v = z;
            if (!cxnVar.ak() && (dqsVar = this.l) != null && defpackage.a.bB(dqsVar.a, j)) {
                cxn cxnVar2 = cxt.this.a;
                czb czbVar = cxnVar2.l;
                if (czbVar != null) {
                    czbVar.o(cxnVar2, true);
                }
                cxt.this.a.ad();
                return false;
            }
            this.l = new dqs(j);
            x(j);
            this.q.f = false;
            j(AnonymousClass3.a);
            if (this.y) {
                j2 = this.c;
            } else {
                j2 = -9223372034707292160L;
            }
            this.y = true;
            cyc z2 = cxt.this.a().z();
            if (z2 == null) {
                csg.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            cxt cxtVar = cxt.this;
            cxtVar.c = cxn.a.b;
            cxtVar.g = false;
            ((dai) cxq.a(cxtVar.a)).s.c(cxtVar.a, true, new cxw(cxtVar, j));
            cxtVar.f();
            if (cxx.a(cxtVar.a)) {
                cxtVar.e();
            } else {
                cxtVar.g();
            }
            cxtVar.c = cxn.a.e;
            w((z2.b & 4294967295L) | (z2.a << 32));
            if (((int) (j2 >> 32)) == z2.a) {
                if (((int) (j2 & 4294967295L)) == z2.b) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.cvc
        public final int t() {
            cyc z = cxt.this.a().z();
            z.getClass();
            return z.t();
        }

        @Override // defpackage.cvc
        public final int u() {
            cyc z = cxt.this.a().z();
            z.getClass();
            return z.u();
        }

        @Override // defpackage.cvc
        public final void v(long j, float f, cof cofVar) {
            y(j, null, cofVar);
        }

        public final void y(long j, arqr arqrVar, cof cofVar) {
            if (cxt.this.a.C) {
                csg.b("place is called on a deactivated node");
            }
            cxt.this.c = cxn.a.d;
            this.k = true;
            this.w = false;
            if (!defpackage.a.bB(j, this.m)) {
                cxt cxtVar = cxt.this;
                if (cxtVar.p || cxtVar.o) {
                    cxtVar.h = true;
                }
                p();
            }
            cxt cxtVar2 = cxt.this;
            czb a = cxq.a(cxtVar2.a);
            if (!cxtVar2.h && this.p) {
                cyc z = cxtVar2.a().z();
                z.getClass();
                z.B(dre.d(j, z.e));
                q();
            } else {
                cxtVar2.m(false);
                this.q.g = false;
                cze czeVar = ((dai) a).s;
                cxt cxtVar3 = cxt.this;
                czeVar.a(cxtVar3.a, true, new AnonymousClass2(cxtVar3, a, j));
            }
            this.m = j;
            this.n = arqrVar;
            this.o = cofVar;
            cxt.this.c = cxn.a.e;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b extends cvc implements cuc, cwf, cyh {
        public cof A;
        public float C;
        private final arqg G;
        private boolean H;
        public boolean f;
        public boolean i;
        public boolean j;
        public boolean l;
        public arqr n;
        public cof o;
        public float p;
        public Object r;
        public boolean s;
        public boolean t;
        public boolean w;
        public float x;
        public boolean y;
        public arqr z;
        public int g = Integer.MAX_VALUE;
        public int h = Integer.MAX_VALUE;
        public cxn.c k = cxn.c.c;
        public long m = 0;
        public boolean q = true;
        public final cwe u = new cxo(this);
        private final cbh E = new cbh(new b[16]);
        public boolean v = true;
        private final arqg F = new AnonymousClass1();
        public long B = 0;

        /* compiled from: PG */
        /* renamed from: cxt$b$1, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass1 extends arrp implements arqg<arnb> {
            public AnonymousClass1() {
                super(0);
            }

            @Override // defpackage.arqg
            public final /* bridge */ /* synthetic */ Object a() {
                cxt cxtVar = cxt.this;
                int i = 0;
                cxtVar.k = 0;
                cbh o = cxtVar.a.o();
                int i2 = o.b;
                if (i2 > 0) {
                    Object[] objArr = o.a;
                    int i3 = 0;
                    do {
                        b w = ((cxn) objArr[i3]).w();
                        w.g = w.h;
                        w.h = Integer.MAX_VALUE;
                        w.t = false;
                        if (w.k == cxn.c.b) {
                            w.k = cxn.c.c;
                        }
                        i3++;
                    } while (i3 < i2);
                }
                b.this.j(cxu.a);
                b.this.i().H().o();
                cxn cxnVar = cxt.this.a;
                cbh o2 = cxnVar.o();
                int i4 = o2.b;
                if (i4 > 0) {
                    Object[] objArr2 = o2.a;
                    do {
                        cxn cxnVar2 = (cxn) objArr2[i];
                        if (cxnVar2.w().g != cxnVar2.l()) {
                            cxnVar.W();
                            cxnVar.N();
                            if (cxnVar2.l() == Integer.MAX_VALUE) {
                                cxnVar2.w().p();
                            }
                        }
                        i++;
                    } while (i < i4);
                }
                b.this.j(cxv.a);
                return arnb.a;
            }
        }

        /* compiled from: PG */
        /* renamed from: cxt$b$2, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass2 extends arrp implements arqg<arnb> {
            final /* synthetic */ cxt a;
            final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(cxt cxtVar, b bVar) {
                super(0);
                this.a = cxtVar;
                this.b = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v9, types: [cvc$a] */
            @Override // defpackage.arqg
            public final /* synthetic */ Object a() {
                cuy cuyVar;
                ?? r0;
                cyn cynVar = this.a.a().v;
                if (cynVar != null && (r0 = cynVar.l) != 0) {
                    cuyVar = r0;
                } else {
                    cuyVar = new cuy(cxq.a(this.a.a));
                }
                b bVar = this.b;
                cxt cxtVar = this.a;
                arqr arqrVar = bVar.z;
                cof cofVar = bVar.A;
                if (cofVar != null) {
                    cuyVar.i(cxtVar.a(), bVar.B, cofVar, bVar.C);
                } else if (arqrVar == null) {
                    cuyVar.f(cxtVar.a(), bVar.B, bVar.C);
                } else {
                    cuyVar.h(cxtVar.a(), bVar.B, bVar.C, arqrVar);
                }
                return arnb.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: cxt$b$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends arrp implements arqr<cwf, arnb> {
            public static final AnonymousClass3 a = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                ((cwf) obj).g().c = false;
                return arnb.a;
            }
        }

        public b() {
            this.G = new AnonymousClass2(cxt.this, this);
        }

        private final void A() {
            boolean z = this.s;
            this.s = true;
            cxn cxnVar = cxt.this.a;
            if (!z) {
                cxnVar.x().ai();
                if (cxnVar.al()) {
                    cxn.aw(cxnVar, true, 6);
                } else if (cxnVar.ak()) {
                    cxn.au(cxnVar, true, 6);
                }
            }
            cyn cynVar = cxnVar.x().u;
            for (cyn y = cxnVar.y(); !d.F(y, cynVar) && y != null; y = y.u) {
                if (y.B) {
                    y.ae();
                }
            }
            cbh o = cxnVar.o();
            int i = o.b;
            if (i > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar2 = (cxn) objArr[i2];
                    if (cxnVar2.l() != Integer.MAX_VALUE) {
                        cxnVar2.w().A();
                        cxnVar.ac(cxnVar2);
                    }
                    i2++;
                } while (i2 < i);
            }
        }

        private final void B() {
            cxn.c cVar;
            cxn.aw(cxt.this.a, false, 7);
            cxn cxnVar = cxt.this.a;
            cxn t = cxnVar.t();
            if (t != null && cxnVar.u == cxn.c.c) {
                cxt cxtVar = cxt.this;
                cxn.a q = t.q();
                cxn.a aVar = cxn.a.a;
                int ordinal = q.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        cVar = t.u;
                    } else {
                        cVar = cxn.c.b;
                    }
                } else {
                    cVar = cxn.c.a;
                }
                cxtVar.a.u = cVar;
            }
        }

        private final void C(long j, float f, arqr arqrVar, cof cofVar) {
            cvc.a cuyVar;
            this.t = true;
            if (!defpackage.a.bB(j, this.m) || this.H) {
                cxt cxtVar = cxt.this;
                if (cxtVar.m || cxtVar.l || this.H) {
                    cxtVar.e = true;
                    this.H = false;
                }
                q();
            }
            if (cxx.a(cxt.this.a)) {
                cyn cynVar = cxt.this.a().v;
                if (cynVar == null || (cuyVar = cynVar.l) == null) {
                    cuyVar = new cuy(cxq.a(cxt.this.a));
                }
                cxt cxtVar2 = cxt.this;
                a aVar = cxtVar2.s;
                aVar.getClass();
                cxn t = cxtVar2.a.t();
                if (t != null) {
                    t.x.j = 0;
                }
                aVar.h = Integer.MAX_VALUE;
                cuyVar.e(aVar, dre.a(j), dre.b(j), brg.a);
            }
            a aVar2 = cxt.this.s;
            if (aVar2 != null && !aVar2.k) {
                csg.c("Error: Placement happened before lookahead.");
            }
            y(j, f, arqrVar, cofVar);
        }

        @Override // defpackage.ctc
        public final int a(int i) {
            B();
            return cxt.this.a().a(i);
        }

        @Override // defpackage.ctc
        public final int b(int i) {
            B();
            return cxt.this.a().b(i);
        }

        @Override // defpackage.ctc
        public final int c(int i) {
            B();
            return cxt.this.a().c(i);
        }

        @Override // defpackage.ctc
        public final int d(int i) {
            B();
            return cxt.this.a().d(i);
        }

        @Override // defpackage.cuc
        public final cvc e(long j) {
            cxn.c cVar;
            if (cxt.this.a.u == cxn.c.c) {
                cxt.this.a.G();
            }
            if (cxx.a(cxt.this.a)) {
                a aVar = cxt.this.s;
                aVar.getClass();
                aVar.i = cxn.c.c;
                aVar.e(j);
            }
            cxn cxnVar = cxt.this.a;
            cxn t = cxnVar.t();
            if (t != null) {
                if (this.k != cxn.c.c && !cxnVar.v) {
                    csg.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                cxn.a q = t.q();
                cxn.a aVar2 = cxn.a.a;
                int ordinal = q.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        cVar = cxn.c.b;
                    } else {
                        cxn.a q2 = t.q();
                        Objects.toString(q2);
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(String.valueOf(q2)));
                    }
                } else {
                    cVar = cxn.c.a;
                }
                this.k = cVar;
            } else {
                this.k = cxn.c.c;
            }
            z(j);
            return this;
        }

        @Override // defpackage.cvc
        protected final void ee(long j, float f, arqr arqrVar) {
            C(j, f, arqrVar, null);
        }

        @Override // defpackage.cui
        public final int ei(csh cshVar) {
            cxn.a aVar;
            cxn t = cxt.this.a.t();
            cxn.a aVar2 = null;
            if (t != null) {
                aVar = t.q();
            } else {
                aVar = null;
            }
            if (aVar == cxn.a.a) {
                this.u.c = true;
            } else {
                cxn t2 = cxt.this.a.t();
                if (t2 != null) {
                    aVar2 = t2.q();
                }
                if (aVar2 == cxn.a.c) {
                    this.u.d = true;
                }
            }
            this.l = true;
            int ei = cxt.this.a().ei(cshVar);
            this.l = false;
            return ei;
        }

        @Override // defpackage.cyh
        public final void ej(boolean z) {
            boolean z2 = cxt.this.a().i;
            if (z != z2) {
                cxt.this.a().i = z2;
                this.H = true;
            }
        }

        @Override // defpackage.cvc, defpackage.ctc
        public final Object f() {
            return this.r;
        }

        @Override // defpackage.cwf
        public final cwe g() {
            return this.u;
        }

        @Override // defpackage.cwf
        public final cwf h() {
            cxt cxtVar;
            cxn t = cxt.this.a.t();
            if (t != null && (cxtVar = t.x) != null) {
                return cxtVar.r;
            }
            return null;
        }

        @Override // defpackage.cwf
        public final cyn i() {
            return cxt.this.a.x();
        }

        @Override // defpackage.cwf
        public final void j(arqr arqrVar) {
            cbh o = cxt.this.a.o();
            int i = o.b;
            if (i > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    arqrVar.a(((cxn) objArr[i2]).x.r);
                    i2++;
                } while (i2 < i);
            }
        }

        @Override // defpackage.cwf
        public final void k() {
            cbh o;
            int i;
            boolean ap;
            this.w = true;
            this.u.g();
            cxt cxtVar = cxt.this;
            if (cxtVar.e && (i = (o = cxtVar.a.o()).b) > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar = (cxn) objArr[i2];
                    if (cxnVar.al() && cxnVar.r() == cxn.c.a) {
                        ap = cxnVar.ap(cxnVar.x.b());
                        if (ap) {
                            cxn.aw(cxtVar.a, false, 7);
                        }
                    }
                    i2++;
                } while (i2 < i);
            }
            if (cxt.this.f || (!this.l && !i().k && cxt.this.e)) {
                cxt cxtVar2 = cxt.this;
                cxtVar2.e = false;
                cxn.a aVar = cxtVar2.c;
                cxtVar2.c = cxn.a.c;
                cxt.this.l(false);
                cxn cxnVar2 = cxt.this.a;
                ((dai) cxq.a(cxnVar2)).s.b(cxnVar2, false, this.F);
                cxt.this.c = aVar;
                if (i().k && cxt.this.l) {
                    l();
                }
                cxt.this.f = false;
            }
            cwe cweVar = this.u;
            if (cweVar.d) {
                cweVar.e = true;
            }
            if (cweVar.b && cweVar.j()) {
                this.u.f();
            }
            this.w = false;
        }

        @Override // defpackage.cwf
        public final void l() {
            cxt.this.a.ab(false);
        }

        @Override // defpackage.cwf
        public final void m() {
            cxn.aw(cxt.this.a, false, 7);
        }

        @Override // defpackage.cwf
        public final boolean n() {
            return this.s;
        }

        public final List o() {
            cxt.this.a.ag();
            if (!this.v) {
                return this.E.e();
            }
            cxt cxtVar = cxt.this;
            cbh cbhVar = this.E;
            cxn cxnVar = cxtVar.a;
            cbh o = cxnVar.o();
            int i = o.b;
            if (i > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar2 = (cxn) objArr[i2];
                    if (cbhVar.b <= i2) {
                        cbhVar.n(cxnVar2.x.r);
                    } else {
                        cbhVar.d(i2, cxnVar2.x.r);
                    }
                    i2++;
                } while (i2 < i);
            }
            cbhVar.i(cxnVar.D().size(), cbhVar.b);
            this.v = false;
            return this.E.e();
        }

        public final void p() {
            if (this.s) {
                int i = 0;
                this.s = false;
                cxn cxnVar = cxt.this.a;
                cyn cynVar = cxnVar.x().u;
                for (cyn y = cxnVar.y(); !d.F(y, cynVar) && y != null; y = y.u) {
                    y.am();
                }
                cbh o = cxt.this.a.o();
                int i2 = o.b;
                if (i2 > 0) {
                    Object[] objArr = o.a;
                    do {
                        ((cxn) objArr[i]).w().p();
                        i++;
                    } while (i < i2);
                }
            }
        }

        public final void q() {
            cbh o;
            int i;
            cxt cxtVar = cxt.this;
            if (cxtVar.n > 0 && (i = (o = cxtVar.a.o()).b) > 0) {
                Object[] objArr = o.a;
                int i2 = 0;
                do {
                    cxn cxnVar = (cxn) objArr[i2];
                    cxt cxtVar2 = cxnVar.x;
                    if ((cxtVar2.l || cxtVar2.m) && !cxtVar2.e) {
                        cxnVar.ab(false);
                    }
                    cxtVar2.r.q();
                    i2++;
                } while (i2 < i);
            }
        }

        public final void s() {
            this.y = true;
            cxn t = cxt.this.a.t();
            float f = i().y;
            cxn cxnVar = cxt.this.a;
            cyn x = cxnVar.x();
            for (cyn y = cxnVar.y(); y != x; y = y.u) {
                y.getClass();
                f += ((cxj) y).y;
            }
            if (f != this.x) {
                this.x = f;
                if (t != null) {
                    t.W();
                }
                if (t != null) {
                    t.N();
                }
            }
            if (!this.s) {
                if (t != null) {
                    t.N();
                }
                A();
                if (this.f && t != null) {
                    t.ab(false);
                }
            } else {
                cxt.this.a.x().ai();
            }
            if (t != null) {
                if (!this.f && t.q() == cxn.a.c) {
                    if (this.h != Integer.MAX_VALUE) {
                        csg.c("Place was called on a node which was placed already");
                    }
                    cxt cxtVar = t.x;
                    int i = cxtVar.k;
                    this.h = i;
                    cxtVar.k = i + 1;
                }
            } else {
                this.h = 0;
            }
            k();
        }

        @Override // defpackage.cvc
        public final int t() {
            return cxt.this.a().t();
        }

        @Override // defpackage.cvc
        public final int u() {
            return cxt.this.a().u();
        }

        @Override // defpackage.cvc
        public final void v(long j, float f, cof cofVar) {
            C(j, f, null, cofVar);
        }

        public final void y(long j, float f, arqr arqrVar, cof cofVar) {
            if (cxt.this.a.C) {
                csg.b("place is called on a deactivated node");
            }
            cxt.this.c = cxn.a.c;
            boolean z = !this.j;
            this.m = j;
            this.p = f;
            this.n = arqrVar;
            this.o = cofVar;
            this.j = true;
            this.y = false;
            dai daiVar = (dai) cxq.a(cxt.this.a);
            daiVar.O.d(cxt.this.a, j, z);
            cxt cxtVar = cxt.this;
            if (!cxtVar.e && this.s) {
                cyn a = cxtVar.a();
                a.ak(dre.d(j, a.e), f, arqrVar, cofVar);
                s();
            } else {
                this.u.g = false;
                cxtVar.k(false);
                this.z = arqrVar;
                this.B = j;
                this.C = f;
                this.A = cofVar;
                daiVar.s.a(cxt.this.a, false, this.G);
            }
            cxt.this.c = cxn.a.e;
        }

        public final boolean z(long j) {
            boolean z;
            if (cxt.this.a.C) {
                csg.b("measure is called on a deactivated node");
            }
            cxn cxnVar = cxt.this.a;
            czb a = cxq.a(cxnVar);
            cxn t = cxnVar.t();
            boolean z2 = true;
            if (!cxnVar.v && (t == null || !t.v)) {
                z = false;
            } else {
                z = true;
            }
            cxnVar.v = z;
            if (!cxnVar.al() && defpackage.a.bB(this.d, j)) {
                a.o(cxt.this.a, false);
                cxt.this.a.ad();
                return false;
            }
            this.u.f = false;
            j(AnonymousClass3.a);
            this.i = true;
            long j2 = cxt.this.a().c;
            x(j);
            cxt cxtVar = cxt.this;
            if (cxtVar.c != cxn.a.e) {
                csg.c("layout state is not idle before measure starts");
            }
            cxtVar.c = cxn.a.a;
            cxtVar.d = false;
            cxtVar.t = j;
            ((dai) cxq.a(cxtVar.a)).s.c(cxtVar.a, false, cxtVar.u);
            if (cxtVar.c == cxn.a.a) {
                cxtVar.e();
                cxtVar.c = cxn.a.e;
            }
            if (defpackage.a.bB(cxt.this.a().c, j2) && cxt.this.a().a == this.a && cxt.this.a().b == this.b) {
                z2 = false;
            }
            w((cxt.this.a().b & 4294967295L) | (cxt.this.a().a << 32));
            return z2;
        }
    }

    public cxt(cxn cxnVar) {
        this.a = cxnVar;
    }

    public final cyn a() {
        return this.a.w.c;
    }

    public final dqs b() {
        b bVar = this.r;
        if (bVar.i) {
            return new dqs(bVar.d);
        }
        return null;
    }

    public final dqs c() {
        a aVar = this.s;
        if (aVar != null) {
            return aVar.l;
        }
        return null;
    }

    public final void d() {
        this.r.v = true;
        a aVar = this.s;
        if (aVar != null) {
            aVar.s = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    public final void f() {
        this.h = true;
        this.i = true;
    }

    public final void g() {
        this.d = true;
    }

    public final void h() {
        cxn.a q = this.a.q();
        if (q == cxn.a.c || q == cxn.a.d) {
            if (this.r.w) {
                l(true);
            } else {
                k(true);
            }
        }
        if (q == cxn.a.d) {
            a aVar = this.s;
            if (aVar != null && aVar.t) {
                n(true);
            } else {
                m(true);
            }
        }
    }

    public final void i(int i) {
        boolean z;
        cxt cxtVar;
        int i2 = this.n;
        this.n = i;
        boolean z2 = false;
        if (i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            cxn t = this.a.t();
            if (t != null) {
                cxtVar = t.x;
            } else {
                cxtVar = null;
            }
            if (cxtVar != null) {
                if (i == 0) {
                    cxtVar.i(cxtVar.n - 1);
                } else {
                    cxtVar.i(cxtVar.n + 1);
                }
            }
        }
    }

    public final void j(int i) {
        boolean z;
        cxt cxtVar;
        int i2 = this.q;
        this.q = i;
        boolean z2 = false;
        if (i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            cxn t = this.a.t();
            if (t != null) {
                cxtVar = t.x;
            } else {
                cxtVar = null;
            }
            if (cxtVar != null) {
                if (i == 0) {
                    cxtVar.j(cxtVar.q - 1);
                } else {
                    cxtVar.j(cxtVar.q + 1);
                }
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z) {
                if (!this.l) {
                    i(this.n + 1);
                }
            } else if (!this.l) {
                i(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z) {
                if (!this.m) {
                    i(this.n + 1);
                }
            } else if (!this.m) {
                i(this.n - 1);
            }
        }
    }

    public final void m(boolean z) {
        if (this.p != z) {
            this.p = z;
            if (z) {
                if (!this.o) {
                    j(this.q + 1);
                }
            } else if (!this.o) {
                j(this.q - 1);
            }
        }
    }

    public final void n(boolean z) {
        if (this.o != z) {
            this.o = z;
            if (z) {
                if (!this.p) {
                    j(this.q + 1);
                }
            } else if (!this.p) {
                j(this.q - 1);
            }
        }
    }

    public final void o() {
        b bVar = this.r;
        if ((bVar.r != null || cxt.this.a().f() != null) && bVar.q) {
            bVar.q = false;
            bVar.r = cxt.this.a().f();
            cxn t = this.a.t();
            if (t != null) {
                cxn.aw(t, false, 7);
            }
        }
        a aVar = this.s;
        if (aVar != null) {
            if (aVar.v == null) {
                cyc z = cxt.this.a().z();
                z.getClass();
                if (z.f() == null) {
                    return;
                }
            }
            if (aVar.u) {
                aVar.u = false;
                cyc z2 = cxt.this.a().z();
                z2.getClass();
                aVar.v = z2.f();
                if (cxx.a(this.a)) {
                    cxn t2 = this.a.t();
                    if (t2 != null) {
                        cxn.aw(t2, false, 7);
                        return;
                    }
                    return;
                }
                cxn t3 = this.a.t();
                if (t3 != null) {
                    cxn.au(t3, false, 7);
                }
            }
        }
    }
}
