package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdf {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdf$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<bcy, arnb> {
        final /* synthetic */ byn a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(byn bynVar) {
            super(1);
            this.a = bynVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.h((bcy) obj);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdf$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, arqv arqvVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            bdf.b(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdf$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ beu a;
        final /* synthetic */ cga b;
        final /* synthetic */ bdy c;
        final /* synthetic */ arqv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(beu beuVar, cga cgaVar, bdy bdyVar, arqv arqvVar) {
            super(2);
            this.a = beuVar;
            this.b = cgaVar;
            this.c = bdyVar;
            this.d = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bwx.a(bev.a.c(this.a), cdk.e(935424596, new bdk(this.c, this.d), bwjVar), bwjVar, 56);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdf$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ bdy a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bdy bdyVar) {
            super(1);
            this.a = bdyVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new bdl(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdf$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ bcy b;
        final /* synthetic */ arqr c;
        final /* synthetic */ arqv d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(cga cgaVar, bcy bcyVar, arqr arqrVar, arqv arqvVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = bcyVar;
            this.c = arqrVar;
            this.d = arqvVar;
            this.e = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bdf.a(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bdf$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqg<beu> {
        public static final AnonymousClass6 a = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return new beu(1L);
        }
    }

    /* compiled from: PG */
    /* renamed from: bdf$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 implements bcv, arrk {
        private final /* synthetic */ arqg a;

        public AnonymousClass7(arqg arqgVar) {
            this.a = arqgVar;
        }

        @Override // defpackage.bcv
        public final /* synthetic */ long a() {
            return ((cjn) this.a.a()).a;
        }

        @Override // defpackage.arrk
        public final armh b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof bcv) && (obj instanceof arrk)) {
                return d.F(this.a, ((arrk) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final void a(cga cgaVar, bcy bcyVar, arqr arqrVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 6;
        bwj c = bwjVar.c(2078139907);
        if (i7 == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(bcyVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (true != c.I(arqrVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            beu beuVar = (beu) cdy.b(new Object[0], beu.a, AnonymousClass6.a, c, 3072, 4);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bdy(beuVar);
                bwkVar.ad(T);
            }
            bdy bdyVar = (bdy) T;
            bdyVar.c = (cpm) c.g(dch.g);
            bdyVar.d = (dcf) c.g(dch.b);
            bdyVar.e = (dec) c.g(dch.k);
            bdyVar.b = new bei(bdyVar, arqrVar);
            bdyVar.t(bcyVar);
            aws.a(bdyVar, cdk.e(-123806316, new AnonymousClass3(beuVar, cgaVar, bdyVar, arqvVar), c), c, 48);
            boolean I = c.I(bdyVar);
            Object T2 = bwkVar.T();
            if (I || T2 == bwj.a.a) {
                T2 = new AnonymousClass4(bdyVar);
                bwkVar.ad(T2);
            }
            bxl.c(bdyVar, (arqr) T2, c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass5(cgaVar, bcyVar, arqrVar, arqvVar, i);
        }
    }

    public static final void b(cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3 = i & 48;
        int i4 = i | 6;
        bwj c = bwjVar.c(-1075498320);
        if (i3 == 0) {
            if (true != c.I(arqvVar)) {
                i2 = 16;
            } else {
                i2 = 32;
            }
            i4 |= i2;
        }
        if ((i4 & 19) == 18 && c.L()) {
            c.v();
        } else {
            cgaVar = cga.e;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(null, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bcy bcyVar = (bcy) bynVar.a();
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new AnonymousClass1(bynVar);
                bwkVar.ad(T2);
            }
            arqr arqrVar = (arqr) T2;
            a(cgaVar, bcyVar, arqrVar, arqvVar, c, (i4 & 14) | 384 | ((i4 << 6) & 7168));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(cgaVar, arqvVar, i);
        }
    }
}
