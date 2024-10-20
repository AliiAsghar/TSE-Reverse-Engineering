package defpackage;

import defpackage.bru;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btq {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cjt, arnb> {
        final /* synthetic */ cas a;
        final /* synthetic */ byn b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cas casVar, byn bynVar) {
            super(1);
            this.a = casVar;
            this.b = bynVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjt) obj).a;
            float floatValue = ((Number) this.a.a()).floatValue();
            float c = cjt.c(j) * floatValue;
            float a = cjt.a(j) * floatValue;
            if (cjt.c(((cjt) this.b.a()).a) != c || cjt.a(((cjt) this.b.a()).a) != a) {
                this.b.h(new cjt(defpackage.a.z(c, a)));
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqg<Boolean> {
        final /* synthetic */ cas a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(cas casVar) {
            super(0);
            this.a = casVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            if (((Number) this.a.a()).floatValue() > brg.a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bub a;
        final /* synthetic */ CharSequence b;
        final /* synthetic */ arqv c;
        final /* synthetic */ bru d;
        final /* synthetic */ arqw e;
        final /* synthetic */ arqv f;
        final /* synthetic */ arqv g;
        final /* synthetic */ arqv h;
        final /* synthetic */ boolean i;
        final /* synthetic */ boolean j;
        final /* synthetic */ boolean k;
        final /* synthetic */ ajq l;
        final /* synthetic */ amj m;
        final /* synthetic */ brr n;
        final /* synthetic */ arqv o;
        final /* synthetic */ int p;
        final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(bub bubVar, CharSequence charSequence, arqv arqvVar, bru bruVar, arqw arqwVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, boolean z, boolean z2, boolean z3, ajq ajqVar, amj amjVar, brr brrVar, arqv arqvVar5, int i, int i2) {
            super(2);
            this.a = bubVar;
            this.b = charSequence;
            this.c = arqvVar;
            this.d = bruVar;
            this.e = arqwVar;
            this.f = arqvVar2;
            this.g = arqvVar3;
            this.h = arqvVar4;
            this.i = z;
            this.j = z2;
            this.k = z3;
            this.l = ajqVar;
            this.m = amjVar;
            this.n = brrVar;
            this.o = arqvVar5;
            this.p = i;
            this.q = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.p;
            int i2 = this.q;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            btq.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ dje b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(long j, dje djeVar, arqv arqvVar, int i) {
            super(2);
            this.a = j;
            this.b = djeVar;
            this.c = arqvVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            long j = this.a;
            dje djeVar = this.b;
            btq.b(j, djeVar, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass13 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(long j, arqv arqvVar, int i) {
            super(2);
            this.a = j;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            long j = this.a;
            int i = this.c;
            btq.c(j, this.b, (bwj) obj, bzh.a(i | 1));
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: btq$14, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass14 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(String str) {
            super(1);
            this.a = str;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            artm[] artmVarArr = dhl.a;
            dhn dhnVar = dhh.a;
            ((dho) obj).c(dhh.G, this.a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ byn a;
        final /* synthetic */ bru b;
        final /* synthetic */ amj c;
        final /* synthetic */ arqv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(byn bynVar, bru bruVar, amj amjVar, arqv arqvVar) {
            super(2);
            this.a = bynVar;
            this.b = bruVar;
            this.c = amjVar;
            this.d = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga a = ctk.a(cga.e, "Container");
                final byn bynVar = this.a;
                cga c = cho.c(a, new boc(new arrq(bynVar) { // from class: btr
                    @Override // defpackage.arrq
                    public final Object b() {
                        return ((byn) this.e).a();
                    }
                }, this.c, ((bru.a) this.b).a));
                arqv arqvVar = this.d;
                int i = cfq.a;
                cue a2 = akc.a(cfq.a.a, true);
                int a3 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, c);
                int i2 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a2, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                    Integer valueOf = Integer.valueOf(a3);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b, cwl.a.c);
                arqvVar.a(bwjVar, 0);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqv arqvVar) {
            super(2);
            this.a = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga a = ctk.a(cga.e, "Container");
                arqv arqvVar = this.a;
                int i = cfq.a;
                cue a2 = akc.a(cfq.a.a, true);
                int a3 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, a);
                int i2 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a2, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                    Integer valueOf = Integer.valueOf(a3);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b, cwl.a.c);
                arqvVar.a(bwjVar, 0);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dje a;
        final /* synthetic */ dje b;
        final /* synthetic */ cas c;
        final /* synthetic */ cas d;
        final /* synthetic */ boolean e;
        final /* synthetic */ cas f;
        final /* synthetic */ arqw g;
        final /* synthetic */ AnonymousClass8 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(dje djeVar, dje djeVar2, cas casVar, cas casVar2, boolean z, cas casVar3, arqw arqwVar, AnonymousClass8 anonymousClass8) {
            super(2);
            this.a = djeVar;
            this.b = djeVar2;
            this.c = casVar;
            this.d = casVar2;
            this.e = z;
            this.f = casVar3;
            this.g = arqwVar;
            this.h = anonymousClass8;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0173 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0202 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
        @Override // defpackage.arqv
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r38, java.lang.Object r39) {
            /*
                Method dump skipped, instructions count: 748
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.btq.AnonymousClass4.a(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqw<cga, bwj, Integer, arnb> {
        final /* synthetic */ cas a;
        final /* synthetic */ long b;
        final /* synthetic */ dje c;
        final /* synthetic */ arqv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(cas casVar, long j, dje djeVar, arqv arqvVar) {
            super(3);
            this.a = casVar;
            this.b = j;
            this.c = djeVar;
            this.d = arqvVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            int i;
            cga cgaVar = (cga) obj;
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                if (true != bwjVar.G(cgaVar)) {
                    i = 2;
                } else {
                    i = 4;
                }
                intValue |= i;
            }
            if ((intValue & 19) == 18 && bwjVar.L()) {
                bwjVar.v();
            } else {
                boolean G = bwjVar.G(this.a);
                cas casVar = this.a;
                Object h = bwjVar.h();
                if (G || h == bwj.a.a) {
                    h = new btt(casVar);
                    bwjVar.B(h);
                }
                cga a = cld.a(cgaVar, (arqr) h);
                long j = this.b;
                dje djeVar = this.c;
                arqv arqvVar = this.d;
                int i2 = cfq.a;
                cue a2 = akc.a(cfq.a.a, false);
                int a3 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, a);
                int i3 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a2, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                    Integer valueOf = Integer.valueOf(a3);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b, cwl.a.c);
                btq.b(j, djeVar, arqvVar, bwjVar, 0);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ dje b;
        final /* synthetic */ arqv c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(long j, dje djeVar, arqv arqvVar) {
            super(2);
            this.a = j;
            this.b = djeVar;
            this.c = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                btq.b(this.a, this.b, this.c, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ arqv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(long j, arqv arqvVar) {
            super(2);
            this.a = j;
            this.b = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                btq.c(this.a, this.b, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: btq$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqg<Boolean> {
        final /* synthetic */ cas a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(cas casVar) {
            super(0);
            this.a = casVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            if (((Number) this.a.a()).floatValue() > brg.a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bub.values().length];
            try {
                iArr[bub.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bub.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[btd.values().length];
            try {
                iArr2[btd.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[btd.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[btd.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
        }
    }

    public static final cga a(cga cgaVar, boolean z, String str) {
        cga c;
        if (z) {
            c = dhb.c(cgaVar, false, new AnonymousClass14(str));
            return c;
        }
        return cgaVar;
    }

    public static final void b(long j, dje djeVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(1208685580);
        if (i6 == 0) {
            if (true != c.F(j)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(djeVar)) {
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
            bto.a(j, djeVar, arqvVar, c, i2 & 1022);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass12(j, djeVar, arqvVar, i);
        }
    }

    public static final void c(long j, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(660142980);
        if (i5 == 0) {
            if (true != c.F(j)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c.L()) {
            c.v();
        } else {
            bwx.a(blp.a.c(new cku(j)), arqvVar, c, (i2 & 112) | 8);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass13(j, arqvVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0268, code lost:
    
        if (r1 == 2) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0299, code lost:
    
        throw new defpackage.armm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0291, code lost:
    
        if (r1 == 2) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e8, code lost:
    
        if (r10 == 2) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x030e, code lost:
    
        if (r10 == 2) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0353, code lost:
    
        if (r1 == 2) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0381, code lost:
    
        throw new defpackage.armm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0379, code lost:
    
        if (r1 == 2) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0318, code lost:
    
        if (r8 != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0317, code lost:
    
        throw new defpackage.armm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x02ec, code lost:
    
        if (r8 != false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03c6  */
    /* JADX WARN: Type inference failed for: r19v1, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v2, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v3, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v4, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v5, types: [aap, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(defpackage.bub r36, java.lang.CharSequence r37, defpackage.arqv r38, defpackage.bru r39, defpackage.arqw r40, defpackage.arqv r41, defpackage.arqv r42, defpackage.arqv r43, boolean r44, boolean r45, boolean r46, defpackage.ajq r47, defpackage.amj r48, defpackage.brr r49, defpackage.arqv r50, defpackage.bwj r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btq.d(bub, java.lang.CharSequence, arqv, bru, arqw, arqv, arqv, arqv, boolean, boolean, boolean, ajq, amj, brr, arqv, bwj, int, int):void");
    }

    public static final float e(bwj bwjVar) {
        long i = bmp.d(bwjVar).l.i();
        dlz dlzVar = bvs.a;
        long j = bvs.l;
        if (drm.b(i) != 4294967296L) {
            i = j;
        }
        return ((dqv) bwjVar.g(dch.d)).ef(i) / 2.0f;
    }

    public static final float f(bwj bwjVar) {
        float f = ((dqy) bwjVar.g(bmi.a)).a;
        if (true == Float.isNaN(f)) {
            f = 0.0f;
        }
        bvg bvgVar = bvk.a;
        return arrn.o((f - bvk.b) / 2.0f, brg.a);
    }
}
