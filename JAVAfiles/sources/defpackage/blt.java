package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ float b;
        final /* synthetic */ long c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, float f, long j, int i) {
            super(2);
            this.a = cgaVar;
            this.b = f;
            this.c = j;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            blt.a(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blt$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ float a;
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, long j) {
            super(1);
            this.a = f;
            this.b = j;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cny cnyVar = (cny) obj;
            float em = cnyVar.em(this.a);
            cnw.i(cnyVar, this.b, a.z(brg.a, cnyVar.em(this.a) / 2.0f), a.z(cjt.c(cnyVar.o()), cnyVar.em(this.a) / 2.0f), em, 0, 496);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blt$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ float b;
        final /* synthetic */ long c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cga cgaVar, float f, long j, int i) {
            super(2);
            this.a = cgaVar;
            this.b = f;
            this.c = j;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            blt.b(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blt$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(long j) {
            super(1);
            this.a = j;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cny cnyVar = (cny) obj;
            float em = cnyVar.em(1.0f);
            cnw.i(cnyVar, this.a, a.z(cnyVar.em(1.0f) / 2.0f, brg.a), a.z(cnyVar.em(1.0f) / 2.0f, cjt.a(cnyVar.o())), em, 0, 496);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: blt$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ long b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(cga cgaVar, long j, int i) {
            super(2);
            this.a = cgaVar;
            this.b = j;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            blt.c(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    @armg
    public static final void a(cga cgaVar, float f, long j, bwj bwjVar, int i) {
        int i2;
        float f2;
        cga c;
        cga a;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c2 = bwjVar.c(1562471785);
        if (i6 == 0) {
            if (true != c2.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.D(f)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c2.F(j)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            }
            c2.n();
            c2.y(-433645095);
            if (dqy.b(f, brg.a)) {
                f2 = 1.0f / ((dqv) c2.g(dch.d)).ec();
            } else {
                f2 = f;
            }
            ((bwk) c2).Y();
            c = amv.c(cgaVar, 1.0f);
            a = adf.a(amv.d(c, f2), j, clw.a);
            akc.b(a, c2, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(cgaVar, f, j, i);
        }
    }

    public static final void b(cga cgaVar, float f, long j, bwj bwjVar, int i) {
        int i2;
        cga c;
        boolean z;
        int i3;
        int i4;
        int i5;
        bwj c2 = bwjVar.c(75144485);
        boolean z2 = true;
        if ((i & 6) == 0) {
            if (true != c2.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.D(f)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c2.F(j)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            }
            c2.n();
            c = amv.c(cgaVar, 1.0f);
            cga d = amv.d(c, f);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((((i2 & 896) ^ 384) <= 256 || !c2.F(j)) && (i2 & 384) != 256) {
                z2 = false;
            }
            boolean z3 = z | z2;
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (z3 || T == bwj.a.a) {
                T = new AnonymousClass2(f, j);
                bwkVar.ad(T);
            }
            adt.a(d, (arqr) T, c2, 0);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(cgaVar, f, j, i);
        }
    }

    public static final void c(cga cgaVar, long j, bwj bwjVar, int i) {
        int i2;
        cga a;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-1534852205);
        boolean z2 = true;
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
            if (true != c.D(1.0f)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.F(j)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            a = cgaVar.a(amv.b);
            cga l = amv.l(a, 1.0f);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((((i2 & 896) ^ 384) <= 256 || !c.F(j)) && (i2 & 384) != 256) {
                z2 = false;
            }
            boolean z3 = z | z2;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (z3 || T == bwj.a.a) {
                T = new AnonymousClass4(j);
                bwkVar.ad(T);
            }
            adt.a(l, (arqr) T, c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass5(cgaVar, j, i);
        }
    }
}
