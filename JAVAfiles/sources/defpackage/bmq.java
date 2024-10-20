package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmq {

    /* compiled from: PG */
    /* renamed from: bmq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return a.bz();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ blh a;
        final /* synthetic */ bpk b;
        final /* synthetic */ bse c;
        final /* synthetic */ arqv d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(blh blhVar, bpk bpkVar, bse bseVar, arqv arqvVar, int i) {
            super(2);
            this.a = blhVar;
            this.b = bpkVar;
            this.c = bseVar;
            this.d = arqvVar;
            this.e = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bmq.b(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bse a;
        final /* synthetic */ arqv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(bse bseVar, arqv arqvVar) {
            super(2);
            this.a = bseVar;
            this.b = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bse bseVar = this.a;
                brx.a(bseVar.j, this.b, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmq$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ blh a;
        final /* synthetic */ bnt b;
        final /* synthetic */ bpk c;
        final /* synthetic */ bse d;
        final /* synthetic */ arqv e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(blh blhVar, bnt bntVar, bpk bpkVar, bse bseVar, arqv arqvVar, int i) {
            super(2);
            this.a = blhVar;
            this.b = bntVar;
            this.c = bpkVar;
            this.d = bseVar;
            this.e = arqvVar;
            this.f = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bmq.a(this.a, this.b, this.c, this.d, this.e, (bwj) obj, bzh.a(this.f | 1));
            return arnb.a;
        }
    }

    static {
        new cat(AnonymousClass1.a);
    }

    public static final void a(blh blhVar, bnt bntVar, bpk bpkVar, bse bseVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        long f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 6;
        bwj c = bwjVar.c(1317723617);
        if (i8 == 0) {
            if (true != c.G(blhVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(bntVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (true != c.G(bpkVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (true != c.G(bseVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            afa a = bon.a(false, brg.a, 0L, 7);
            long j = blhVar.a;
            boolean F = c.F(j);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (F || T == bwj.a.a) {
                f = ckw.f(cku.d(j), cku.c(j), cku.b(j), 0.4f, cku.f(j));
                T = new bfo(j, f);
                bwkVar.ad(T);
            }
            bwx.b(new bzd[]{bli.a.c(blhVar), bnu.a.c(bntVar), aex.a.c(a), bpl.a.c(bpkVar), bfp.a.c((bfo) T), bsf.a.c(bseVar)}, cdk.e(-2097082079, new AnonymousClass3(bseVar, arqvVar), c), c, 56);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(blhVar, bntVar, bpkVar, bseVar, arqvVar, i);
        }
    }

    public static final void b(blh blhVar, bpk bpkVar, bse bseVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        bpk c;
        bpk bpkVar2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c2 = bwjVar.c(-2127166334);
        if (i6 == 0) {
            if (true != c2.G(blhVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            if (true != c2.G(bseVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (true != c2.I(arqvVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c2.L()) {
            c2.v();
            bpkVar2 = bpkVar;
        } else {
            int i7 = i2 & (-113);
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
                c = bpkVar;
            } else {
                c = bmp.c(c2);
            }
            c2.n();
            int i8 = i7 << 3;
            a(blhVar, bmp.b(c2), c, bseVar, arqvVar, c2, (i2 & 14) | (i8 & 7168) | (i8 & 57344));
            bpkVar2 = c;
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(blhVar, bpkVar2, bseVar, arqvVar, i);
        }
    }
}
