package defpackage;

import defpackage.bcy;
import defpackage.dhv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdy {
    public final beu a;
    public cpm c;
    public dcf d;
    public dec e;
    public cjn g;
    public cti h;
    public bdq j;
    private boolean s;
    private final byn k = new byu(null, cav.a);
    private final byn l = new byu(true, cav.a);
    public arqr b = new AnonymousClass7();
    public final cit f = new cit();
    private final byn m = new byu(false, cav.a);
    private final byn n = new byu(new cjn(0), cav.a);
    private final byn o = new byu(new cjn(0), cav.a);
    private final byn p = new byu(null, cav.a);
    private final byn q = new byu(null, cav.a);
    private final byn r = new byu(null, cav.a);
    public final byn i = new byu(null, cav.a);

    /* compiled from: PG */
    /* renamed from: bdy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Long, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            if (bdy.this.a.b().b(((Number) obj).longValue())) {
                bdy.this.w();
                bdy.this.x();
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bdy$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqx<Boolean, cti, cjn, bdd, arnb> {
        public AnonymousClass2() {
            super(4);
        }

        @Override // defpackage.arqx
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            cti ctiVar = (cti) obj2;
            long j = ((cjn) obj3).a;
            bdd bddVar = (bdd) obj4;
            long g = ctiVar.g();
            cjp cjpVar = new cjp(brg.a, brg.a, (int) (g >> 32), (int) (g & 4294967295L));
            if (!bej.c(cjpVar, j)) {
                j = a.bv(j, cjpVar);
            }
            long a = bdy.this.a(ctiVar, j);
            if ((9223372034707292159L & a) != 9205357640488583168L) {
                bdy.this.s(booleanValue);
                bdy bdyVar = bdy.this;
                bdyVar.j = null;
                bdyVar.D(a, 9205357640488583168L, false, bddVar);
                bdy.this.f.b();
                bdy.this.u(false);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bdy$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqz<Boolean, cti, cjn, cjn, Boolean, bdd, Boolean> {
        public AnonymousClass3() {
            super(6);
        }

        @Override // defpackage.arqz
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            cti ctiVar = (cti) obj2;
            long j = ((cjn) obj3).a;
            long j2 = ((cjn) obj4).a;
            long a = bdy.this.a(ctiVar, j);
            long a2 = bdy.this.a(ctiVar, j2);
            bdy.this.s(booleanValue);
            cjn cjnVar = new cjn(a);
            return Boolean.valueOf(bdy.this.E(cjnVar, a2, ((Boolean) obj5).booleanValue(), (bdd) obj6));
        }
    }

    /* compiled from: PG */
    /* renamed from: bdy$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg<arnb> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bdy.this.u(true);
            bdy.this.p(null);
            bdy.this.m(null);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bdy$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<Long, arnb> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            if (bdy.this.a.b().b(((Number) obj).longValue())) {
                bdy.this.k();
                bdy.this.t(null);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bdy$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arrp implements arqr<Long, arnb> {
        public AnonymousClass6() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            bcy.a aVar;
            bcy.a aVar2;
            long longValue = ((Number) obj).longValue();
            bcy f = bdy.this.f();
            if (f != null && (aVar2 = f.a) != null && longValue == aVar2.c) {
                bdy.this.v(null);
            }
            bcy f2 = bdy.this.f();
            if (f2 != null && (aVar = f2.b) != null && longValue == aVar.c) {
                bdy.this.q(null);
            }
            if (bdy.this.a.b().b(longValue)) {
                bdy.this.x();
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bdy$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arrp implements arqr<bcy, arnb> {
        public AnonymousClass7() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            bdy.this.t((bcy) obj);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdy$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass8 extends arrm implements arqg<arnb> {
        public AnonymousClass8(Object obj) {
            super(0, obj, bdy.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bdy bdyVar = (bdy) this.e;
            bdyVar.j();
            bdyVar.k();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdy$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass9 extends arrm implements arqg<arnb> {
        public AnonymousClass9(Object obj) {
            super(0, obj, bdy.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            ((bdy) this.e).l();
            return arnb.a;
        }
    }

    public bdy(beu beuVar) {
        this.a = beuVar;
        beuVar.d = new AnonymousClass1();
        beuVar.e = new AnonymousClass2();
        beuVar.f = new AnonymousClass3();
        beuVar.g = new AnonymousClass4();
        beuVar.h = new AnonymousClass5();
        beuVar.i = new AnonymousClass6();
    }

    public final boolean A() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    public final boolean B() {
        bcy f = f();
        if (f == null || d.F(f.a, f.b)) {
            return false;
        }
        if (f.a.c == f.b.c) {
            return true;
        }
        List j = this.a.j(i());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            bcy bcyVar = (bcy) this.a.b().a(((bcw) j.get(i)).g());
            if (bcyVar != null) {
                if (bcyVar.a.b != bcyVar.b.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean C() {
        bcy f = f();
        if (f == null) {
            return true;
        }
        return d.F(f.a, f.b);
    }

    public final boolean D(long j, long j2, boolean z, bdd bddVar) {
        axp axpVar;
        bcy f;
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            axpVar = axp.b;
        } else {
            axpVar = axp.c;
        }
        p(axpVar);
        m(new cjn(j));
        cti i5 = i();
        List j3 = this.a.j(i5);
        bdq bdqVar = null;
        ud udVar = new ud((byte[]) null);
        int size = j3.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            udVar.b(((bcw) j3.get(i7)).g(), i7);
        }
        bea beaVar = new bea(udVar);
        if ((j2 & 9223372034707292159L) == 9205357640488583168L) {
            f = null;
        } else {
            f = f();
        }
        bdr bdrVar = new bdr(j, j2, i5, z, f, beaVar);
        int size2 = j3.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((bcw) j3.get(i8)).l(bdrVar);
        }
        int i9 = bdrVar.j + 1;
        int size3 = bdrVar.g.size();
        if (size3 != 0) {
            if (size3 != 1) {
                ud udVar2 = bdrVar.k;
                List list = bdrVar.g;
                int i10 = bdrVar.h;
                if (i10 == -1) {
                    i3 = i9;
                } else {
                    i3 = i10;
                }
                int i11 = bdrVar.i;
                if (i11 != -1) {
                    i4 = i11;
                } else {
                    i4 = i9;
                }
                bdqVar = new bcs(udVar2, list, i3, i4, bdrVar.d, bdrVar.e);
            } else {
                bcx bcxVar = (bcx) aqjn.ag(bdrVar.g);
                int i12 = bdrVar.h;
                if (i12 == -1) {
                    i = i9;
                } else {
                    i = i12;
                }
                int i13 = bdrVar.i;
                if (i13 != -1) {
                    i2 = i13;
                } else {
                    i2 = i9;
                }
                bdqVar = new bex(bdrVar.d, i, i2, bdrVar.e, bcxVar);
            }
        }
        if (bdqVar == null || !bdqVar.n(this.j)) {
            return false;
        }
        bcy a = bddVar.a(bdqVar);
        if (!d.F(a, f())) {
            if (A()) {
                List list2 = this.a.b;
                int size4 = list2.size();
                while (true) {
                    if (i6 >= size4) {
                        break;
                    }
                    if (((bcw) list2.get(i6)).k().a() > 0) {
                        cpm cpmVar = this.c;
                        if (cpmVar != null) {
                            cpmVar.a(9);
                        }
                    } else {
                        i6++;
                    }
                }
            }
            this.a.k(bdqVar.d(a));
            this.b.a(a);
        }
        this.j = bdqVar;
        return true;
    }

    public final boolean E(cjn cjnVar, long j, boolean z, bdd bddVar) {
        return D(cjnVar.a, j, z, bddVar);
    }

    public final long a(cti ctiVar, long j) {
        cti ctiVar2 = this.h;
        if (ctiVar2 != null && ctiVar2.r()) {
            return i().h(ctiVar, j);
        }
        return 9205357640488583168L;
    }

    public final long b() {
        return ((cjn) this.n.a()).a;
    }

    public final long c() {
        return ((cjn) this.o.a()).a;
    }

    public final axp d() {
        return (axp) this.r.a();
    }

    public final bcw e(bcy.a aVar) {
        return (bcw) this.a.j.a(aVar.c);
    }

    public final bcy f() {
        return (bcy) this.k.a();
    }

    public final cjn g() {
        return (cjn) this.q.a();
    }

    public final cjn h() {
        return (cjn) this.p.a();
    }

    public final cti i() {
        cti ctiVar = this.h;
        if (ctiVar != null) {
            if (!ctiVar.r()) {
                aju.c("unattached coordinates");
            }
            return ctiVar;
        }
        aju.a("null coordinates");
        throw new armj();
    }

    public final void j() {
        dhv dhvVar;
        dcf dcfVar;
        dhv subSequence;
        dhv dhvVar2 = null;
        if (f() != null && !this.a.b().c()) {
            dhv.b bVar = new dhv.b((byte[]) null);
            List j = this.a.j(i());
            int size = j.size();
            for (int i = 0; i < size; i++) {
                bcw bcwVar = (bcw) j.get(i);
                bcy bcyVar = (bcy) this.a.b().a(bcwVar.g());
                if (bcyVar != null) {
                    dhv k = bcwVar.k();
                    if (bcyVar.c) {
                        subSequence = k.subSequence(bcyVar.b.b, bcyVar.a.b);
                    } else {
                        subSequence = k.subSequence(bcyVar.a.b, bcyVar.b.b);
                    }
                    bVar.e(subSequence);
                }
            }
            dhvVar = bVar.b();
        } else {
            dhvVar = null;
        }
        if (dhvVar != null) {
            if (dhvVar.a() > 0) {
                dhvVar2 = dhvVar;
            }
            if (dhvVar2 != null && (dcfVar = this.d) != null) {
                dcfVar.c(dhvVar2);
            }
        }
    }

    public final void k() {
        cpm cpmVar;
        this.a.k(ug.a());
        u(false);
        if (f() != null) {
            this.b.a(null);
            if (A() && (cpmVar = this.c) != null) {
                cpmVar.a(9);
            }
        }
    }

    public final void l() {
        List j = this.a.j(i());
        if (!j.isEmpty()) {
            uf ufVar = new uf((byte[]) null);
            int size = j.size();
            bcy bcyVar = null;
            bcy bcyVar2 = null;
            for (int i = 0; i < size; i++) {
                bcw bcwVar = (bcw) j.get(i);
                bcy h = bcwVar.h();
                if (h != null) {
                    if (bcyVar == null) {
                        bcyVar = h;
                    }
                    ufVar.g(bcwVar.g(), h);
                    bcyVar2 = h;
                }
            }
            if (!ufVar.c()) {
                if (bcyVar != bcyVar2) {
                    bcyVar.getClass();
                    bcyVar2.getClass();
                    bcyVar = new bcy(bcyVar.a, bcyVar2.b, false);
                }
                this.a.k(ufVar);
                this.b.a(bcyVar);
                this.j = null;
            }
        }
    }

    public final void m(cjn cjnVar) {
        this.i.h(cjnVar);
    }

    public final void n(long j) {
        this.n.h(new cjn(j));
    }

    public final void o(long j) {
        this.o.h(new cjn(j));
    }

    public final void p(axp axpVar) {
        this.r.h(axpVar);
    }

    public final void q(cjn cjnVar) {
        this.q.h(cjnVar);
    }

    public final void r(boolean z) {
        this.m.h(Boolean.valueOf(z));
    }

    public final void s(boolean z) {
        if (((Boolean) this.l.a()).booleanValue() != z) {
            this.l.h(Boolean.valueOf(z));
            x();
        }
    }

    public final void t(bcy bcyVar) {
        this.k.h(bcyVar);
        if (bcyVar != null) {
            w();
        }
    }

    public final void u(boolean z) {
        this.s = z;
        x();
    }

    public final void v(cjn cjnVar) {
        this.p.h(cjnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (defpackage.bej.c(r8, r13) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            r17 = this;
            r0 = r17
            bcy r1 = r17.f()
            cti r2 = r0.h
            r3 = 0
            if (r1 == 0) goto L14
            bcy$a r4 = r1.a
            if (r4 == 0) goto L14
            bcw r4 = r0.e(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            bcy$a r5 = r1.b
            if (r5 == 0) goto L20
            bcw r5 = r0.e(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            cti r6 = r4.j()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            cti r7 = r5.j()
            goto L31
        L30:
            r7 = r3
        L31:
            if (r1 == 0) goto La4
            if (r2 == 0) goto La4
            boolean r8 = r2.r()
            if (r8 == 0) goto La4
            if (r6 != 0) goto L3f
            if (r7 == 0) goto La4
        L3f:
            cjp r8 = defpackage.bej.b(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L74
            r13 = 1
            long r13 = r4.e(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L5b
            goto L74
        L5b:
            long r13 = r2.h(r6, r13)
            cjn r4 = new cjn
            r4.<init>(r13)
            long r13 = r4.a
            axp r6 = r17.d()
            axp r15 = defpackage.axp.b
            if (r6 == r15) goto L75
            boolean r6 = defpackage.bej.c(r8, r13)
            if (r6 != 0) goto L75
        L74:
            r4 = r3
        L75:
            r0.v(r4)
            if (r7 == 0) goto La0
            r4 = 0
            long r4 = r5.e(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L85
            goto La0
        L85:
            long r1 = r2.h(r7, r4)
            cjn r4 = new cjn
            r4.<init>(r1)
            long r1 = r4.a
            axp r5 = r17.d()
            axp r6 = defpackage.axp.c
            if (r5 == r6) goto L9f
            boolean r1 = defpackage.bej.c(r8, r1)
            if (r1 != 0) goto L9f
            goto La0
        L9f:
            r3 = r4
        La0:
            r0.q(r3)
            return
        La4:
            r0.v(r3)
            r0.q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdy.w():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdy.x():void");
    }

    public final boolean y() {
        return ((Boolean) this.m.a()).booleanValue();
    }

    public final boolean z() {
        List j = this.a.j(i());
        if (j.isEmpty()) {
            return true;
        }
        int size = j.size();
        for (int i = 0; i < size; i++) {
            bcw bcwVar = (bcw) j.get(i);
            dhv k = bcwVar.k();
            if (k.a() != 0) {
                bcy bcyVar = (bcy) this.a.b().a(bcwVar.g());
                if (bcyVar != null) {
                    if (Math.abs(bcyVar.a.b - bcyVar.b.b) != k.a()) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
