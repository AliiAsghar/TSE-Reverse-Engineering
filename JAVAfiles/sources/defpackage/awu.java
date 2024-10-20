package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bwj;
import defpackage.ces;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import defpackage.dqm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awu {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ayd b;
        final /* synthetic */ cas c;
        final /* synthetic */ dol d;
        final /* synthetic */ bfb e;
        final /* synthetic */ dno f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: awu$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00211 extends arrp implements arqg<Boolean> {
            final /* synthetic */ cas a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00211(cas casVar) {
                super(0);
                this.a = casVar;
            }

            @Override // defpackage.arqg
            public final /* bridge */ /* synthetic */ Object a() {
                boolean booleanValue;
                booleanValue = ((Boolean) this.a.a()).booleanValue();
                return Boolean.valueOf(booleanValue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ayd aydVar, cas casVar, dol dolVar, bfb bfbVar, dno dnoVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = aydVar;
            this.c = casVar;
            this.d = dolVar;
            this.e = bfbVar;
            this.f = dnoVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            try {
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    asai a = cao.a(new C00211(this.c));
                    final ayd aydVar = this.b;
                    final dol dolVar = this.d;
                    final bfb bfbVar = this.e;
                    final dno dnoVar = this.f;
                    asaj asajVar = new asaj() { // from class: awu.1.2
                        @Override // defpackage.asaj
                        public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                            if (((Boolean) obj2).booleanValue() && ayd.this.n()) {
                                dol dolVar2 = dolVar;
                                ayd aydVar2 = ayd.this;
                                bfb bfbVar2 = bfbVar;
                                awu.f(dolVar2, aydVar2, bfbVar2.f(), dnoVar, bfbVar2.a);
                            } else {
                                awu.d(ayd.this);
                            }
                            return arnb.a;
                        }
                    };
                    this.a = 1;
                    if (a.a(asajVar, this) == arplVar) {
                        return arplVar;
                    }
                }
                awu.d(this.b);
                return arnb.a;
            } catch (Throwable th) {
                awu.d(this.b);
                throw th;
            }
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, this.c, this.d, this.e, this.f, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqr<Boolean, arnb> {
        final /* synthetic */ ayd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(ayd aydVar) {
            super(1);
            this.a = aydVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.h(((Boolean) obj).booleanValue());
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqr<cjn, arnb> {
        final /* synthetic */ ayd a;
        final /* synthetic */ cit b;
        final /* synthetic */ boolean c;
        final /* synthetic */ bfb d;
        final /* synthetic */ dob e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(ayd aydVar, cit citVar, boolean z, bfb bfbVar, dob dobVar) {
            super(1);
            this.a = aydVar;
            this.b = citVar;
            this.c = z;
            this.d = bfbVar;
            this.e = dobVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int a;
            long j = ((cjn) obj).a;
            awu.h(this.a, this.b);
            if (this.a.n() && this.c) {
                if (this.a.c() != axq.b) {
                    baa d = this.a.d();
                    if (d != null) {
                        ayd aydVar = this.a;
                        dob dobVar = this.e;
                        a = d.a(j, true);
                        int b = dobVar.b(a);
                        doj dojVar = aydVar.d.a;
                        long a2 = djd.a(b, b);
                        long j2 = djc.a;
                        aydVar.q.a(doj.b(dojVar, null, a2, 5));
                        if (aydVar.a.a.a() > 0) {
                            aydVar.g(axq.c);
                        }
                    }
                } else {
                    this.d.i(new cjn(j));
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends arrp implements arqg<azv> {
        final /* synthetic */ ahp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(ahp ahpVar) {
            super(0);
            this.a = ahpVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new azv(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass13 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ dow a;
        final /* synthetic */ doj b;
        final /* synthetic */ boolean c;
        final /* synthetic */ dno d;
        final /* synthetic */ ayd e;
        final /* synthetic */ dob f;
        final /* synthetic */ bfb g;
        final /* synthetic */ cit h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(dow dowVar, doj dojVar, boolean z, dno dnoVar, ayd aydVar, dob dobVar, bfb bfbVar, cit citVar) {
            super(1);
            this.a = dowVar;
            this.b = dojVar;
            this.c = z;
            this.d = dnoVar;
            this.e = aydVar;
            this.f = dobVar;
            this.g = bfbVar;
            this.h = citVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dho dhoVar = (dho) obj;
            artm[] artmVarArr = dhl.a;
            dhn dhnVar = dhh.a;
            dhn dhnVar2 = dhh.A;
            artm artmVar = dhl.a[16];
            dhnVar2.a(dhoVar, this.a.a);
            dhl.q(dhoVar, this.b.b);
            if (!this.c) {
                dhl.b(dhoVar);
            }
            boolean z = this.c;
            dhn dhnVar3 = dhh.I;
            artm artmVar2 = dhl.a[23];
            dhnVar3.a(dhoVar, Boolean.valueOf(z));
            dhl.x(dhoVar, new axd(this.e));
            if (z) {
                dhl.D(dhoVar, new axe(this.e));
                dhl.y(dhoVar, new axf(this.c, this.e, this.b));
            }
            dhl.C(dhoVar, new axg(this.f, this.c, this.b, this.g, this.e));
            dno dnoVar = this.d;
            axh axhVar = new axh(this.e, dnoVar);
            dhoVar.c(dhh.C, new dnn(dnoVar.f));
            dhn dhnVar4 = dgx.a;
            dhoVar.c(dgx.n, new dgn(null, axhVar));
            dhl.e(dhoVar, null, new axi(this.e, this.h));
            dhl.H(dhoVar, new axj(this.g));
            if (!djc.h(this.b.b)) {
                dhoVar.c(dgx.o, new dgn(null, new axk(this.g)));
                if (this.c) {
                    dhoVar.c(dgx.p, new dgn(null, new axl(this.g)));
                }
            }
            if (this.c) {
                dhoVar.c(dgx.q, new dgn(null, new axc(this.g)));
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$14, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass14 extends arrp implements arqg<Boolean> {
        final /* synthetic */ ayd a;
        final /* synthetic */ cit b;
        final /* synthetic */ dno c;
        final /* synthetic */ bbk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(ayd aydVar, cit citVar, dno dnoVar, bbk bbkVar) {
            super(0);
            this.a = aydVar;
            this.b = citVar;
            this.c = dnoVar;
            this.d = bbkVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            if (!this.a.n()) {
                this.b.b();
            }
            int i = this.c.e;
            if (!a.bA(i, 7) && !a.bA(i, 8)) {
                this.d.e();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$15, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass15 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ bfb b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(cga cgaVar, bfb bfbVar, arqv arqvVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = bfbVar;
            this.c = arqvVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            cga cgaVar = this.a;
            bfb bfbVar = this.b;
            int i = this.d;
            awu.a(cgaVar, bfbVar, this.c, (bwj) obj, bzh.a(i | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$16, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass16 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bfb a;
        final /* synthetic */ boolean b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(bfb bfbVar, boolean z, int i) {
            super(2);
            this.a = bfbVar;
            this.b = z;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bfb bfbVar = this.a;
            int i = this.c;
            awu.b(bfbVar, this.b, (bwj) obj, bzh.a(i | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$19, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass19 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass19(long j) {
            super(1);
            this.a = j;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((dho) obj).c(bdp.a, new bdo(axp.a, this.a, bdn.b, true));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ bfb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bfb bfbVar) {
            super(1);
            this.a = bfbVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new awv(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$20, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass20 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bfb a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass20(bfb bfbVar, int i) {
            super(2);
            this.a = bfbVar;
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            awu.c(this.a, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ ayd a;
        final /* synthetic */ dol b;
        final /* synthetic */ doj c;
        final /* synthetic */ dno d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ayd aydVar, dol dolVar, doj dojVar, dno dnoVar) {
            super(1);
            this.a = aydVar;
            this.b = dolVar;
            this.c = dojVar;
            this.d = dnoVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            if (this.a.n()) {
                ayd aydVar = this.a;
                aydVar.e = ayw.c(this.b, this.c, aydVar.d, this.d, aydVar.q, aydVar.r);
            }
            return new aww();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;
        final /* synthetic */ ayd b;
        final /* synthetic */ dje c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ azv f;
        final /* synthetic */ doj g;
        final /* synthetic */ doy h;
        final /* synthetic */ cga i;
        final /* synthetic */ cga j;
        final /* synthetic */ cga k;
        final /* synthetic */ cga l;
        final /* synthetic */ avj m;
        final /* synthetic */ bfb n;
        final /* synthetic */ boolean o;
        final /* synthetic */ arqr p;
        final /* synthetic */ dob q;
        final /* synthetic */ dqv r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(arqw arqwVar, ayd aydVar, dje djeVar, int i, int i2, azv azvVar, doj dojVar, doy doyVar, cga cgaVar, cga cgaVar2, cga cgaVar3, cga cgaVar4, avj avjVar, bfb bfbVar, boolean z, arqr arqrVar, dob dobVar, dqv dqvVar) {
            super(2);
            this.a = arqwVar;
            this.b = aydVar;
            this.c = djeVar;
            this.d = i;
            this.e = i2;
            this.f = azvVar;
            this.g = dojVar;
            this.h = doyVar;
            this.i = cgaVar;
            this.j = cgaVar2;
            this.k = cgaVar3;
            this.l = cgaVar4;
            this.m = avjVar;
            this.n = bfbVar;
            this.o = z;
            this.p = arqrVar;
            this.q = dobVar;
            this.r = dqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                this.a.a(cdk.e(2032502107, new axa(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r), bwjVar), bwjVar, 6);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ doj a;
        final /* synthetic */ arqr b;
        final /* synthetic */ cga c;
        final /* synthetic */ dje d;
        final /* synthetic */ doy e;
        final /* synthetic */ arqr f;
        final /* synthetic */ ajr g;
        final /* synthetic */ cko h;
        final /* synthetic */ boolean i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;
        final /* synthetic */ dno l;
        final /* synthetic */ ayb m;
        final /* synthetic */ boolean n;
        final /* synthetic */ arqw o;
        final /* synthetic */ int p;
        final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(doj dojVar, arqr arqrVar, cga cgaVar, dje djeVar, doy doyVar, arqr arqrVar2, ajr ajrVar, cko ckoVar, boolean z, int i, int i2, dno dnoVar, ayb aybVar, boolean z2, arqw arqwVar, int i3, int i4) {
            super(2);
            this.a = dojVar;
            this.b = arqrVar;
            this.c = cgaVar;
            this.d = djeVar;
            this.e = doyVar;
            this.f = arqrVar2;
            this.g = ajrVar;
            this.h = ckoVar;
            this.i = z;
            this.j = i;
            this.k = i2;
            this.l = dnoVar;
            this.m = aybVar;
            this.n = z2;
            this.o = arqwVar;
            this.p = i3;
            this.q = i4;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.p;
            int i2 = this.q;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            awu.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqr<cti, arnb> {
        final /* synthetic */ ayd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ayd aydVar) {
            super(1);
            this.a = aydVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cti ctiVar = (cti) obj;
            baa d = this.a.d();
            if (d != null) {
                d.c = ctiVar;
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ ayd a;
        final /* synthetic */ doj b;
        final /* synthetic */ dob c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ayd aydVar, doj dojVar, dob dobVar) {
            super(1);
            this.a = aydVar;
            this.b = dojVar;
            this.c = dobVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            long j;
            long f;
            long j2;
            float f2;
            cny cnyVar = (cny) obj;
            baa d = this.a.d();
            if (d != null) {
                doj dojVar = this.b;
                ayd aydVar = this.a;
                dob dobVar = this.c;
                ckr b = cnyVar.q().b();
                long b2 = aydVar.b();
                long a = aydVar.a();
                long j3 = aydVar.t;
                boolean h = djc.h(b2);
                diy diyVar = d.a;
                clp clpVar = aydVar.s;
                if (!h) {
                    clpVar.k(j3);
                    ayw.a(b, b2, dobVar, diyVar, clpVar);
                } else if (!djc.h(a)) {
                    cku ckuVar = new cku(diyVar.a.b.f());
                    if (ckuVar.i == 16) {
                        ckuVar = null;
                    }
                    if (ckuVar != null) {
                        j = ckuVar.i;
                    } else {
                        j = cku.a;
                    }
                    f = ckw.f(cku.d(j), cku.c(j), cku.b(j), cku.a(j) * 0.2f, cku.f(j));
                    clpVar.k(f);
                    ayw.a(b, a, dobVar, diyVar, clpVar);
                } else if (!djc.h(dojVar.b)) {
                    clpVar.k(j3);
                    ayw.a(b, dojVar.b, dobVar, diyVar, clpVar);
                }
                boolean z = false;
                if (diyVar.s() && !a.bA(diyVar.a.f, 3)) {
                    z = true;
                }
                if (z) {
                    long j4 = diyVar.c;
                    cjp a2 = cjq.a(0L, (Float.floatToRawIntBits((int) (j4 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j4 >> 32)) << 32));
                    b.l();
                    b.s(a2);
                }
                dip dipVar = diyVar.a.b.b;
                dqj dqjVar = dipVar.m;
                if (dqjVar == null) {
                    dqjVar = dqj.a;
                }
                dqj dqjVar2 = dqjVar;
                cma cmaVar = dipVar.n;
                if (cmaVar == null) {
                    cmaVar = cma.a;
                }
                cma cmaVar2 = cmaVar;
                cnz cnzVar = dipVar.p;
                if (cnzVar == null) {
                    cnzVar = coc.a;
                }
                cnz cnzVar2 = cnzVar;
                try {
                    cko c = dipVar.c();
                    if (c != null) {
                        dqm dqmVar = dipVar.a;
                        if (dqmVar != dqm.b.a) {
                            f2 = dqmVar.a();
                        } else {
                            f2 = 1.0f;
                        }
                        dia.l(diyVar.b, b, c, f2, cmaVar2, dqjVar2, cnzVar2);
                    } else {
                        dqm dqmVar2 = dipVar.a;
                        if (dqmVar2 != dqm.b.a) {
                            j2 = dqmVar2.b();
                        } else {
                            j2 = cku.a;
                        }
                        dia.k(diyVar.b, b, j2, cmaVar2, dqjVar2, cnzVar2);
                    }
                    if (z) {
                        b.j();
                    }
                } catch (Throwable th) {
                    if (z) {
                        b.j();
                    }
                    throw th;
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqr<ciy, arnb> {
        final /* synthetic */ ayd a;
        final /* synthetic */ boolean b;
        final /* synthetic */ dol c;
        final /* synthetic */ doj d;
        final /* synthetic */ dno e;
        final /* synthetic */ dob f;
        final /* synthetic */ bfb g;
        final /* synthetic */ arwe h;
        final /* synthetic */ avj i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(ayd aydVar, boolean z, dol dolVar, doj dojVar, dno dnoVar, dob dobVar, bfb bfbVar, arwe arweVar, avj avjVar) {
            super(1);
            this.a = aydVar;
            this.b = z;
            this.c = dolVar;
            this.d = dojVar;
            this.e = dnoVar;
            this.f = dobVar;
            this.g = bfbVar;
            this.h = arweVar;
            this.i = avjVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            baa d;
            ciy ciyVar = (ciy) obj;
            if (this.a.n() != ciyVar.b()) {
                this.a.f.h(Boolean.valueOf(ciyVar.b()));
                if (this.a.n() && this.b) {
                    awu.f(this.c, this.a, this.d, this.e, this.f);
                } else {
                    awu.d(this.a);
                }
                if (ciyVar.b() && (d = this.a.d()) != null) {
                    arrn.J(this.h, null, null, new axb(this.i, this.d, this.a, d, this.f, null), 3);
                }
                if (!ciyVar.b()) {
                    this.g.i(null);
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awu$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqr<cti, arnb> {
        final /* synthetic */ ayd a;
        final /* synthetic */ boolean b;
        final /* synthetic */ des c;
        final /* synthetic */ bfb d;
        final /* synthetic */ doj e;
        final /* synthetic */ dob f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(ayd aydVar, boolean z, des desVar, bfb bfbVar, doj dojVar, dob dobVar) {
            super(1);
            this.a = aydVar;
            this.b = z;
            this.c = desVar;
            this.d = bfbVar;
            this.e = dojVar;
            this.f = dobVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cti ctiVar;
            cti ctiVar2;
            ayd aydVar = this.a;
            cti ctiVar3 = (cti) obj;
            aydVar.h = ctiVar3;
            baa d = aydVar.d();
            if (d != null) {
                d.b = ctiVar3;
            }
            if (this.b) {
                if (this.a.c() == axq.b) {
                    if (this.a.o() && this.c.a()) {
                        this.d.t();
                    } else {
                        this.d.l();
                    }
                    this.a.m(bfc.b(this.d, true));
                    this.a.l(bfc.b(this.d, false));
                    this.a.j(djc.h(this.e.b));
                } else if (this.a.c() == axq.c) {
                    this.a.j(bfc.b(this.d, true));
                }
                awu.e(this.a, this.e, this.f);
                baa d2 = this.a.d();
                if (d2 != null) {
                    ayd aydVar2 = this.a;
                    doj dojVar = this.e;
                    dob dobVar = this.f;
                    dov dovVar = aydVar2.e;
                    if (dovVar != null && aydVar2.n() && (ctiVar = d2.b) != null && ctiVar.r() && (ctiVar2 = d2.c) != null) {
                        diy diyVar = d2.a;
                        ayx ayxVar = new ayx(ctiVar);
                        cjp b = bej.b(ctiVar);
                        cjp n = ctiVar.n(ctiVar2, false);
                        if (dovVar.a()) {
                            dovVar.b.h(dojVar, dobVar, diyVar, ayxVar, b, n);
                        }
                    }
                }
            }
            return arnb.a;
        }
    }

    public static final void a(cga cgaVar, bfb bfbVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-20551815);
        if (i6 == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(bfbVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            int i7 = cfq.a;
            cue a = akc.a(cfq.a.a, true);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i8 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            aws.b(bfbVar, arqvVar, c, (i2 >> 3) & 126);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass15(cgaVar, bfbVar, arqvVar, i);
        }
    }

    public static final void b(bfb bfbVar, boolean z, bwj bwjVar, int i) {
        int i2;
        baa d;
        diy diyVar;
        ayd aydVar;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(626339208);
        if (i5 == 0) {
            if (true != c.I(bfbVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.H(z)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c.L()) {
            c.v();
        } else {
            c.y(1730062411);
            if (z) {
                ayd aydVar2 = bfbVar.c;
                diy diyVar2 = null;
                if (aydVar2 != null && (d = aydVar2.d()) != null && (diyVar = d.a) != null && (aydVar = bfbVar.c) != null && !aydVar.n) {
                    diyVar2 = diyVar;
                }
                if (diyVar2 != null) {
                    c.y(651298255);
                    if (!djc.h(bfbVar.f().b)) {
                        int a = bfbVar.a.a(djc.e(bfbVar.f().b));
                        int a2 = bfbVar.a.a(djc.a(bfbVar.f().b));
                        dqh p = diyVar2.p(a);
                        dqh p2 = diyVar2.p(Math.max(a2 - 1, 0));
                        c.y(500032624);
                        ayd aydVar3 = bfbVar.c;
                        if (aydVar3 != null && ((Boolean) aydVar3.k.a()).booleanValue()) {
                            bfc.a(true, p, bfbVar, c, ((i2 << 6) & 896) | 6);
                        }
                        ((bwk) c).Y();
                        ayd aydVar4 = bfbVar.c;
                        if (aydVar4 != null && ((Boolean) aydVar4.l.a()).booleanValue()) {
                            bfc.a(false, p2, bfbVar, c, ((i2 << 6) & 896) | 6);
                        }
                    }
                    ((bwk) c).Y();
                    ayd aydVar5 = bfbVar.c;
                    if (aydVar5 != null) {
                        if (!d.F(bfbVar.o.a(), bfbVar.f().a())) {
                            aydVar5.k(false);
                        }
                        if (aydVar5.n()) {
                            if (aydVar5.o()) {
                                bfbVar.t();
                            } else {
                                bfbVar.l();
                            }
                        }
                    }
                }
            } else {
                bfbVar.l();
            }
            ((bwk) c).Y();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass16(bfbVar, z, i);
        }
    }

    public static final void c(final bfb bfbVar, bwj bwjVar, int i) {
        int i2;
        dhv e;
        baa baaVar;
        cga c;
        int i3;
        int i4 = i & 6;
        bwj c2 = bwjVar.c(-1436003720);
        if (i4 == 0) {
            if (true != c2.I(bfbVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c2.L()) {
            c2.v();
        } else {
            ayd aydVar = bfbVar.c;
            if (aydVar != null && ((Boolean) aydVar.m.a()).booleanValue() && (e = bfbVar.e()) != null && e.a() > 0) {
                boolean G = c2.G(bfbVar);
                bwk bwkVar = (bwk) c2;
                Object T = bwkVar.T();
                if (G || T == bwj.a.a) {
                    T = new bez(bfbVar);
                    bwkVar.ad(T);
                }
                final ays aysVar = (ays) T;
                dqv dqvVar = (dqv) c2.g(dch.d);
                int a = bfbVar.a.a(djc.e(bfbVar.f().b));
                ayd aydVar2 = bfbVar.c;
                if (aydVar2 != null) {
                    baaVar = aydVar2.d();
                } else {
                    baaVar = null;
                }
                baaVar.getClass();
                diy diyVar = baaVar.a;
                cjp m = diyVar.m(arrn.u(a, 0, diyVar.a.a.a()));
                final long floatToRawIntBits = (Float.floatToRawIntBits(m.b + (dqvVar.em(2.0f) / 2.0f)) << 32) | (Float.floatToRawIntBits(m.e) & 4294967295L);
                boolean F = c2.F(floatToRawIntBits);
                Object T2 = bwkVar.T();
                if (F || T2 == bwj.a.a) {
                    T2 = new bcv() { // from class: awu.17
                        @Override // defpackage.bcv
                        public final long a() {
                            return floatToRawIntBits;
                        }
                    };
                    bwkVar.ad(T2);
                }
                bcv bcvVar = (bcv) T2;
                cga.a aVar = cga.e;
                boolean I = c2.I(aysVar) | c2.I(bfbVar);
                Object T3 = bwkVar.T();
                if (I || T3 == bwj.a.a) {
                    T3 = new PointerInputEventHandler() { // from class: awu.18

                        /* compiled from: PG */
                        /* renamed from: awu$18$1, reason: invalid class name */
                        /* loaded from: classes.dex */
                        static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
                            final /* synthetic */ crk a;
                            final /* synthetic */ ays b;
                            final /* synthetic */ bfb c;
                            private /* synthetic */ Object d;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* compiled from: PG */
                            /* renamed from: awu$18$1$1, reason: invalid class name and collision with other inner class name */
                            /* loaded from: classes.dex */
                            public static final class C00221 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
                                int a;
                                final /* synthetic */ crk b;
                                final /* synthetic */ ays c;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00221(crk crkVar, ays aysVar, arpe arpeVar) {
                                    super(2, arpeVar);
                                    this.b = crkVar;
                                    this.c = aysVar;
                                }

                                @Override // defpackage.arqv
                                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                                    return ((C00221) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                                }

                                @Override // defpackage.arpq
                                public final Object b(Object obj) {
                                    arpl arplVar = arpl.a;
                                    int i = this.a;
                                    aqil.P(obj);
                                    if (i == 0) {
                                        crk crkVar = this.b;
                                        ays aysVar = this.c;
                                        this.a = 1;
                                        if (ayf.a(crkVar, aysVar, this) == arplVar) {
                                            return arplVar;
                                        }
                                    }
                                    return arnb.a;
                                }

                                @Override // defpackage.arpq
                                public final arpe c(Object obj, arpe arpeVar) {
                                    return new C00221(this.b, this.c, arpeVar);
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* compiled from: PG */
                            /* renamed from: awu$18$1$2, reason: invalid class name */
                            /* loaded from: classes.dex */
                            public static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
                                int a;
                                final /* synthetic */ crk b;
                                final /* synthetic */ bfb c;

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: PG */
                                /* renamed from: awu$18$1$2$1, reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes.dex */
                                public static final class C00231 extends arrp implements arqr<cjn, arnb> {
                                    final /* synthetic */ bfb a;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C00231(bfb bfbVar) {
                                        super(1);
                                        this.a = bfbVar;
                                    }

                                    @Override // defpackage.arqr
                                    public final /* synthetic */ Object a(Object obj) {
                                        long j = ((cjn) obj).a;
                                        this.a.t();
                                        return arnb.a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(crk crkVar, bfb bfbVar, arpe arpeVar) {
                                    super(2, arpeVar);
                                    this.b = crkVar;
                                    this.c = bfbVar;
                                }

                                @Override // defpackage.arqv
                                public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                                    return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                                }

                                @Override // defpackage.arpq
                                public final Object b(Object obj) {
                                    arpl arplVar = arpl.a;
                                    int i = this.a;
                                    aqil.P(obj);
                                    if (i == 0) {
                                        crk crkVar = this.b;
                                        C00231 c00231 = new C00231(this.c);
                                        this.a = 1;
                                        if (aik.g(crkVar, null, null, null, c00231, this, 7) == arplVar) {
                                            return arplVar;
                                        }
                                    }
                                    return arnb.a;
                                }

                                @Override // defpackage.arpq
                                public final arpe c(Object obj, arpe arpeVar) {
                                    return new AnonymousClass2(this.b, this.c, arpeVar);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(crk crkVar, ays aysVar, bfb bfbVar, arpe arpeVar) {
                                super(2, arpeVar);
                                this.a = crkVar;
                                this.b = aysVar;
                                this.c = bfbVar;
                            }

                            @Override // defpackage.arqv
                            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                                return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                            }

                            @Override // defpackage.arpq
                            public final Object b(Object obj) {
                                aqil.P(obj);
                                arwe arweVar = (arwe) this.d;
                                arrn.J(arweVar, null, arwf.d, new C00221(this.a, this.b, null), 1);
                                arrn.J(arweVar, null, arwf.d, new AnonymousClass2(this.a, this.c, null), 1);
                                return arnb.a;
                            }

                            @Override // defpackage.arpq
                            public final arpe c(Object obj, arpe arpeVar) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, this.b, this.c, arpeVar);
                                anonymousClass1.d = obj;
                                return anonymousClass1;
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                            Object d = arwi.d(new AnonymousClass1(crkVar, ays.this, bfbVar, null), arpeVar);
                            if (d == arpl.a) {
                                return d;
                            }
                            return arnb.a;
                        }
                    };
                    bwkVar.ad(T3);
                }
                cga a2 = cru.a(aVar, aysVar, (PointerInputEventHandler) T3);
                boolean F2 = c2.F(floatToRawIntBits);
                Object T4 = bwkVar.T();
                if (F2 || T4 == bwj.a.a) {
                    T4 = new AnonymousClass19(floatToRawIntBits);
                    bwkVar.ad(T4);
                }
                c = dhb.c(a2, false, (arqr) T4);
                awi.b(bcvVar, c, 0L, c2, 0);
            }
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass20(bfbVar, i);
        }
    }

    public static final void d(ayd aydVar) {
        dov dovVar = aydVar.e;
        if (dovVar != null) {
            aydVar.q.a(doj.b(aydVar.d.a, null, 0L, 3));
            dol dolVar = dovVar.a;
            if (a.bD(dolVar.b, dovVar)) {
                dolVar.a.f();
            }
        }
        aydVar.e = null;
    }

    public static final void e(ayd aydVar, doj dojVar, dob dobVar) {
        arqr arqrVar;
        dov dovVar;
        cti e;
        long a;
        cjp cjpVar;
        ces a2 = ces.a.a();
        if (a2 != null) {
            arqrVar = a2.i();
        } else {
            arqrVar = null;
        }
        ces b = ces.a.b(a2);
        try {
            baa d = aydVar.d();
            if (d != null && (dovVar = aydVar.e) != null && (e = aydVar.e()) != null) {
                ayq ayqVar = aydVar.a;
                diy diyVar = d.a;
                if (aydVar.n()) {
                    int a3 = dobVar.a(djc.c(dojVar.b));
                    if (a3 < diyVar.a.a.a()) {
                        cjpVar = diyVar.l(a3);
                    } else if (a3 == 0) {
                        a = ayy.a(ayqVar.b, ayqVar.e, ayqVar.f, ayy.a, 1);
                        cjpVar = new cjp(brg.a, brg.a, 1.0f, (int) (a & 4294967295L));
                    } else {
                        cjpVar = diyVar.l(a3 - 1);
                    }
                    float f = cjpVar.b;
                    long i = e.i((Float.floatToRawIntBits(cjpVar.c) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    float intBitsToFloat = Float.intBitsToFloat((int) (i >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (i & 4294967295L));
                    long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                    float f2 = cjpVar.d - cjpVar.b;
                    cjp a4 = cjq.a((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (floatToRawIntBits << 32), (Float.floatToRawIntBits(cjpVar.e - cjpVar.c) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    if (dovVar.a()) {
                        dovVar.b.b(a4);
                    }
                }
            }
        } finally {
            ces.a.f(a2, b, arqrVar);
        }
    }

    public static final void f(dol dolVar, ayd aydVar, doj dojVar, dno dnoVar, dob dobVar) {
        aydVar.e = ayw.c(dolVar, dojVar, aydVar.d, dnoVar, aydVar.q, aydVar.r);
        e(aydVar, dojVar, dobVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x039c, code lost:
    
        if (r0.f != r5) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0482, code lost:
    
        if (r0 > ((r2 != null ? r2.longValue() : 0) + 5000)) goto L236;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0555 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(defpackage.doj r75, defpackage.arqr r76, defpackage.cga r77, defpackage.dje r78, defpackage.doy r79, defpackage.arqr r80, defpackage.ajr r81, defpackage.cko r82, boolean r83, int r84, int r85, defpackage.dno r86, defpackage.ayb r87, boolean r88, defpackage.arqw r89, defpackage.bwj r90, int r91, int r92) {
        /*
            Method dump skipped, instructions count: 2517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awu.g(doj, arqr, cga, dje, doy, arqr, ajr, cko, boolean, int, int, dno, ayb, boolean, arqw, bwj, int, int):void");
    }

    public static final void h(ayd aydVar, cit citVar) {
        if (!aydVar.n()) {
            citVar.b();
            return;
        }
        ddz ddzVar = aydVar.c;
        if (ddzVar != null) {
            ddzVar.b();
        }
    }
}
