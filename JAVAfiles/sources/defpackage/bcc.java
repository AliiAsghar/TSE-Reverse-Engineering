package defpackage;

import defpackage.cga;
import defpackage.cvc;
import defpackage.dli;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcc extends cga.c implements cxi, cwx, czk {
    public String a;
    public dje b;
    public dli.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public ckx h;
    public arqr i;
    public a j;
    private Map k;
    private bbt l;

    /* compiled from: PG */
    /* renamed from: bcc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<List<diy>, Boolean> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0095  */
        @Override // defpackage.arqr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r28) {
            /*
                r27 = this;
                r0 = r28
                java.util.List r0 = (java.util.List) r0
                r1 = r27
                bcc r2 = defpackage.bcc.this
                bbt r3 = r2.a()
                dje r4 = r2.b
                ckx r2 = r2.h
                if (r2 == 0) goto L17
                long r5 = r2.a()
                goto L19
            L17:
                long r5 = defpackage.cku.h
            L19:
                r12 = 0
                r14 = 16777214(0xfffffe, float:2.3509884E-38)
                r7 = 0
                r9 = 0
                r11 = 0
                dje r2 = defpackage.dje.z(r4, r5, r7, r9, r11, r12, r14)
                drk r4 = r3.k
                r5 = 0
                if (r4 != 0) goto L2f
            L2c:
                r10 = r5
                goto L93
            L2f:
                dqv r6 = r3.f
                if (r6 != 0) goto L34
                goto L2c
            L34:
                dhv r7 = new dhv
                java.lang.String r8 = r3.a
                r7.<init>(r8)
                die r8 = r3.g
                if (r8 != 0) goto L40
                goto L2c
            L40:
                dih r8 = r3.j
                if (r8 != 0) goto L45
                goto L2c
            L45:
                long r8 = r3.l
                r10 = -8589934589(0xfffffffe00000003, double:NaN)
                long r8 = r8 & r10
                diy r10 = new diy
                dix r11 = new dix
                arnv r18 = defpackage.arnv.a
                int r12 = r3.e
                boolean r13 = r3.d
                int r14 = r3.c
                dli$a r15 = r3.b
                r24 = r15
                r15 = r11
                r16 = r7
                r17 = r2
                r19 = r12
                r20 = r13
                r21 = r14
                r22 = r6
                r23 = r4
                r25 = r8
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                dia r4 = new dia
                dic r13 = new dic
                arnv r18 = defpackage.arnv.a
                dli$a r12 = r3.b
                r15 = r13
                r19 = r6
                r20 = r12
                r15.<init>(r16, r17, r18, r19, r20)
                int r2 = r3.e
                int r6 = r3.c
                r12 = r4
                r14 = r8
                r16 = r2
                r17 = r6
                r12.<init>(r13, r14, r16, r17)
                long r2 = r3.i
                r10.<init>(r11, r4, r2)
            L93:
                if (r10 == 0) goto L99
                r0.add(r10)
                r5 = r10
            L99:
                if (r5 == 0) goto L9d
                r0 = 1
                goto L9e
            L9d:
                r0 = 0
            L9e:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bcc.AnonymousClass1.a(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PG */
    /* renamed from: bcc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<dhv, Boolean> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            String str = ((dhv) obj).b;
            bcc bccVar = bcc.this;
            a aVar = bccVar.j;
            if (aVar != null) {
                if (!d.F(str, aVar.a)) {
                    aVar.a = str;
                    bbt bbtVar = aVar.c;
                    if (bbtVar != null) {
                        bbtVar.e(str, bccVar.b, bccVar.c, bccVar.d, bccVar.e, bccVar.f);
                    }
                }
            } else {
                a aVar2 = new a(bccVar.a, str);
                bbt bbtVar2 = new bbt(str, bccVar.b, bccVar.c, bccVar.d, bccVar.e, bccVar.f);
                bbtVar2.d(bccVar.a().f);
                aVar2.c = bbtVar2;
                bccVar.j = aVar2;
            }
            bcc.this.i();
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: bcc$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<Boolean, Boolean> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            bcc bccVar = bcc.this;
            a aVar = bccVar.j;
            if (aVar == null) {
                return false;
            }
            aVar.b = booleanValue;
            bccVar.i();
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: bcc$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bcc.this.h();
            bcc.this.i();
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: bcc$5, reason: invalid class name */
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
        public String a;
        public boolean b = false;
        public bbt c = null;
        private final String d;

        public a(String str, String str2) {
            this.d = str;
            this.a = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(this.d, aVar.d) && d.F(this.a, aVar.a) && this.b == aVar.b && d.F(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.d.hashCode() * 31) + this.a.hashCode();
            int v = defpackage.a.v(this.b);
            bbt bbtVar = this.c;
            if (bbtVar == null) {
                hashCode = 0;
            } else {
                hashCode = bbtVar.hashCode();
            }
            return (((hashCode2 * 31) + v) * 31) + hashCode;
        }

        public final String toString() {
            return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ')';
        }
    }

    public bcc(String str, dje djeVar, dli.a aVar, int i, boolean z, int i2, int i3, ckx ckxVar) {
        this.a = str;
        this.b = djeVar;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = ckxVar;
    }

    private final bbt j(dqv dqvVar) {
        bbt bbtVar;
        a aVar = this.j;
        if (aVar != null && aVar.b && (bbtVar = aVar.c) != null) {
            bbtVar.d(dqvVar);
            return bbtVar;
        }
        bbt a2 = a();
        a2.d(dqvVar);
        return a2;
    }

    public final bbt a() {
        if (this.l == null) {
            this.l = new bbt(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        bbt bbtVar = this.l;
        bbtVar.getClass();
        return bbtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    @Override // defpackage.cxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cuf b(defpackage.cuh r16, defpackage.cuc r17, long r18) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcc.b(cuh, cuc, long):cuf");
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        return j(ctdVar).a(i, ctdVar.q());
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        arqr arqrVar = this.i;
        if (arqrVar == null) {
            arqrVar = new AnonymousClass1();
            this.i = arqrVar;
        }
        dhl.p(dhoVar, new dhv(this.a));
        a aVar = this.j;
        if (aVar != null) {
            dhl.m(dhoVar, aVar.b);
            dhl.r(dhoVar, new dhv(aVar.a));
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
        return ayr.a(j(ctdVar).c(ctdVar.q()).a());
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        return j(ctdVar).a(i, ctdVar.q());
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        return ayr.a(j(ctdVar).c(ctdVar.q()).b());
    }

    public final void h() {
        this.j = null;
    }

    public final void i() {
        czl.a(this);
        cxl.b(this);
        cwy.a(this);
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        long j;
        if (this.z) {
            bbt j2 = j(cntVar);
            die dieVar = j2.g;
            if (dieVar != null) {
                ckr b = cntVar.q().b();
                boolean z = j2.h;
                if (z) {
                    long j3 = j2.i;
                    b.l();
                    b.a(brg.a, brg.a, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
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
                        dieVar.n(b, j4, this.b.a(), cmaVar, dqjVar, cnzVar);
                    } else {
                        ckx ckxVar = this.h;
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
                        dieVar.m(b, j, cmaVar, dqjVar, cnzVar);
                    }
                    if (z) {
                        b.j();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z) {
                        b.j();
                    }
                    throw th;
                }
            }
            aju.a("no paragraph (layoutCache=" + this.l + ", textSubstitution=" + this.j + ')');
            throw new armj();
        }
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }
}
