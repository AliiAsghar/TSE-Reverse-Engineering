package defpackage;

import defpackage.cga;
import defpackage.cnr;
import defpackage.cvc;
import defpackage.dli;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bca extends cga.c implements cxi, cwx, czk {
    private bbs A;
    private arqr B;
    public dhv a;
    public dje b;
    public dli.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public List h;
    public ckx i;
    public arqr j;
    public a k;
    private arqr l;
    private arqr m;
    private bbw n;
    private Map o;

    /* compiled from: PG */
    /* renamed from: bca$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<List<diy>, Boolean> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            diy diyVar;
            boolean z;
            long j;
            List list = (List) obj;
            diy diyVar2 = bca.this.a().b;
            if (diyVar2 != null) {
                bca bcaVar = bca.this;
                dje djeVar = bcaVar.b;
                ckx ckxVar = bcaVar.i;
                if (ckxVar != null) {
                    j = ckxVar.a();
                } else {
                    j = cku.h;
                }
                dje z2 = dje.z(djeVar, j, 0L, 0L, 0, 0L, 16777214);
                dix dixVar = diyVar2.a;
                dix dixVar2 = diyVar2.a;
                diyVar = diyVar2.o(new dix(dixVar.a, z2, dixVar2.c, dixVar2.d, dixVar2.e, dixVar2.f, dixVar2.g, dixVar2.h, dixVar2.i, dixVar2.j), diyVar2.c);
                list.add(diyVar);
            } else {
                diyVar = null;
            }
            if (diyVar != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: bca$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<dhv, Boolean> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dhv dhvVar = (dhv) obj;
            bca bcaVar = bca.this;
            a aVar = bcaVar.k;
            if (aVar != null) {
                if (!d.F(dhvVar, aVar.b)) {
                    aVar.b = dhvVar;
                    bbs bbsVar = aVar.d;
                    if (bbsVar != null) {
                        bbsVar.g(dhvVar, bcaVar.b, bcaVar.c, bcaVar.d, bcaVar.e, bcaVar.f, bcaVar.h);
                    }
                }
            } else {
                a aVar2 = new a(bcaVar.a, dhvVar);
                bbs bbsVar2 = new bbs(dhvVar, bcaVar.b, bcaVar.c, bcaVar.d, bcaVar.e, bcaVar.f, bcaVar.h);
                bbsVar2.f(bcaVar.a().a);
                aVar2.d = bbsVar2;
                bcaVar.k = aVar2;
            }
            bca.this.j();
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: bca$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<Boolean, Boolean> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            bca bcaVar = bca.this;
            a aVar = bcaVar.k;
            if (aVar == null) {
                return false;
            }
            arqr arqrVar = bcaVar.j;
            if (arqrVar != null) {
                arqrVar.a(aVar);
            }
            bca bcaVar2 = bca.this;
            a aVar2 = bcaVar2.k;
            if (aVar2 != null) {
                aVar2.c = booleanValue;
            }
            bcaVar2.j();
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: bca$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bca.this.h();
            bca.this.j();
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: bca$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((cvc.a) obj).e(this.a, 0, 0, brg.a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final dhv a;
        public dhv b;
        public boolean c = false;
        public bbs d = null;

        public a(dhv dhvVar, dhv dhvVar2) {
            this.a = dhvVar;
            this.b = dhvVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(this.a, aVar.a) && d.F(this.b, aVar.b) && this.c == aVar.c && d.F(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
            int v = defpackage.a.v(this.c);
            bbs bbsVar = this.d;
            if (bbsVar == null) {
                hashCode = 0;
            } else {
                hashCode = bbsVar.hashCode();
            }
            return (((hashCode2 * 31) + v) * 31) + hashCode;
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }
    }

    public /* synthetic */ bca(dhv dhvVar, dje djeVar, dli.a aVar, arqr arqrVar, int i, boolean z, int i2, int i3, List list, arqr arqrVar2, bbw bbwVar, ckx ckxVar, arqr arqrVar3) {
        this.a = dhvVar;
        this.b = djeVar;
        this.c = aVar;
        this.l = arqrVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        this.m = arqrVar2;
        this.n = bbwVar;
        this.i = ckxVar;
        this.j = arqrVar3;
    }

    private final bbs v(dqv dqvVar) {
        bbs bbsVar;
        a aVar = this.k;
        if (aVar != null && aVar.c && (bbsVar = aVar.d) != null) {
            bbsVar.f(dqvVar);
            return bbsVar;
        }
        bbs a2 = a();
        a2.f(dqvVar);
        return a2;
    }

    public final bbs a() {
        if (this.A == null) {
            this.A = new bbs(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
        }
        bbs bbsVar = this.A;
        bbsVar.getClass();
        return bbsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r2.b == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    @Override // defpackage.cxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cuf b(defpackage.cuh r8, defpackage.cuc r9, long r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bca.b(cuh, cuc, long):cuf");
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        return v(ctdVar).a(i, ctdVar.q());
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        arqr arqrVar = this.B;
        if (arqrVar == null) {
            arqrVar = new AnonymousClass1();
            this.B = arqrVar;
        }
        dhl.p(dhoVar, this.a);
        a aVar = this.k;
        if (aVar != null) {
            dhl.r(dhoVar, aVar.b);
            dhl.m(dhoVar, aVar.c);
        }
        dhl.E(dhoVar, new AnonymousClass2());
        dhl.G(dhoVar, new AnonymousClass3());
        dhl.v(dhoVar, new AnonymousClass4());
        dhl.x(dhoVar, arqrVar);
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        return ayr.a(v(ctdVar).c(ctdVar.q()).a());
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        return v(ctdVar).a(i, ctdVar.q());
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        return ayr.a(((Number) v(ctdVar).c(ctdVar.q()).c.a()).floatValue());
    }

    public final void h() {
        this.k = null;
    }

    public final void i(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            a().g(this.a, this.b, this.c, this.d, this.e, this.f, this.h);
        }
        if (this.z) {
            if (z2 || (z && this.B != null)) {
                czl.a(this);
            }
            if (z2 || z3 || z4) {
                cxl.b(this);
                cwy.a(this);
            }
            if (z) {
                cwy.a(this);
            }
        }
    }

    public final void j() {
        czl.a(this);
        cxl.b(this);
        cwy.a(this);
    }

    public final boolean k(arqr arqrVar, arqr arqrVar2, bbw bbwVar, arqr arqrVar3) {
        boolean z;
        if (this.l != arqrVar) {
            this.l = arqrVar;
            z = true;
        } else {
            z = false;
        }
        if (this.m != arqrVar2) {
            this.m = arqrVar2;
            z = true;
        }
        if (!d.F(this.n, bbwVar)) {
            this.n = bbwVar;
            z = true;
        }
        if (this.j != arqrVar3) {
            this.j = arqrVar3;
            return true;
        }
        return z;
    }

    public final boolean l(ckx ckxVar, dje djeVar) {
        boolean F = d.F(ckxVar, this.i);
        this.i = ckxVar;
        if (F && djeVar.w(this.b)) {
            return false;
        }
        return true;
    }

    public final boolean m(dhv dhvVar) {
        boolean F = d.F(this.a.b, dhvVar.b);
        boolean F2 = d.F(this.a.a, dhvVar.a);
        boolean z = true;
        if (F && F2) {
            z = false;
        }
        if (z) {
            this.a = dhvVar;
        }
        if (!F) {
            h();
        }
        return z;
    }

    public final boolean n(dje djeVar, List list, int i, int i2, boolean z, dli.a aVar, int i3) {
        boolean z2 = !this.b.x(djeVar);
        this.b = djeVar;
        if (!d.F(this.h, list)) {
            this.h = list;
            z2 = true;
        }
        if (this.g != i) {
            this.g = i;
            z2 = true;
        }
        if (this.f != i2) {
            this.f = i2;
            z2 = true;
        }
        if (this.e != z) {
            this.e = z;
            z2 = true;
        }
        if (!d.F(this.c, aVar)) {
            this.c = aVar;
            z2 = true;
        }
        if (!defpackage.a.bA(this.d, i3)) {
            this.d = i3;
            z2 = true;
        }
        if (!d.F(null, null)) {
            return true;
        }
        return z2;
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        long j;
        List list;
        bcy bcyVar;
        int i;
        int i2;
        int i3;
        clr clrVar;
        long j2;
        if (this.z) {
            bbw bbwVar = this.n;
            boolean z = false;
            if (bbwVar != null && (bcyVar = (bcy) bbwVar.b.b().a(bbwVar.a)) != null) {
                boolean z2 = bcyVar.c;
                if (!z2) {
                    i = bcyVar.a.b;
                } else {
                    i = bcyVar.b.b;
                }
                if (!z2) {
                    i2 = bcyVar.b.b;
                } else {
                    i2 = bcyVar.a.b;
                }
                if (i != i2) {
                    bcw bcwVar = bbwVar.e;
                    if (bcwVar != null) {
                        i3 = bcwVar.d();
                    } else {
                        i3 = 0;
                    }
                    int s = arrn.s(i, i3);
                    int s2 = arrn.s(i2, i3);
                    diy diyVar = bbwVar.d.c;
                    if (diyVar != null) {
                        clrVar = diyVar.n(s, s2);
                    } else {
                        clrVar = null;
                    }
                    clr clrVar2 = clrVar;
                    if (clrVar2 != null) {
                        diy diyVar2 = bbwVar.d.c;
                        if (diyVar2 != null && !defpackage.a.bA(diyVar2.a.f, 3) && diyVar2.s()) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (cntVar.o() >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (cntVar.o() & 4294967295L));
                            cnu q = cntVar.q();
                            long a2 = q.a();
                            q.b().l();
                            try {
                                j2 = a2;
                            } catch (Throwable th) {
                                th = th;
                                j2 = a2;
                            }
                            try {
                                ((cnr.AnonymousClass1) q).a.b(brg.a, brg.a, intBitsToFloat, intBitsToFloat2, 1);
                                cnw.d(cntVar, clrVar2, bbwVar.c, null, 60);
                                q.b().j();
                                q.h(j2);
                            } catch (Throwable th2) {
                                th = th2;
                                q.b().j();
                                q.h(j2);
                                throw th;
                            }
                        } else {
                            cnw.d(cntVar, clrVar2, bbwVar.c, null, 60);
                        }
                    }
                }
            }
            ckr b = cntVar.q().b();
            diy d = v(cntVar).d();
            dia diaVar = d.b;
            if (d.s() && !defpackage.a.bA(this.d, 3)) {
                z = true;
            }
            if (z) {
                long j3 = d.c;
                cjp a3 = cjq.a(0L, (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L));
                b.l();
                b.s(a3);
            }
            try {
                dqj t = this.b.t();
                if (t == null) {
                    t = dqj.a;
                }
                dqj dqjVar = t;
                cma k = this.b.k();
                if (k == null) {
                    k = cma.a;
                }
                cma cmaVar = k;
                cnz l = this.b.l();
                if (l == null) {
                    l = coc.a;
                }
                cnz cnzVar = l;
                cko j4 = this.b.j();
                if (j4 != null) {
                    dia.l(diaVar, b, j4, this.b.a(), cmaVar, dqjVar, cnzVar);
                } else {
                    ckx ckxVar = this.i;
                    if (ckxVar != null) {
                        j = ckxVar.a();
                    } else {
                        j = cku.h;
                    }
                    if (j == 16) {
                        if (this.b.f() != 16) {
                            j = this.b.f();
                        } else {
                            j = cku.a;
                        }
                    }
                    dia.k(diaVar, b, j, cmaVar, dqjVar, cnzVar);
                }
                a aVar = this.k;
                if (((aVar != null && aVar.c) || !bcb.a(this.a)) && ((list = this.h) == null || list.isEmpty())) {
                    return;
                }
                cntVar.p();
            } finally {
                if (z) {
                    b.j();
                }
            }
        }
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }
}
