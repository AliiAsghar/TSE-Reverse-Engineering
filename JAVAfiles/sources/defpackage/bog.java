package defpackage;

import defpackage.bwj;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bog {
    public static final aae a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ arqg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqg arqgVar) {
            super(1);
            this.a = arqgVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            dhl.j((dho) obj, new dgu(((Number) this.a.a()).floatValue(), new arsy(brg.a, 1.0f)));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ int a;
        final /* synthetic */ float b;
        final /* synthetic */ arqg c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;
        final /* synthetic */ arqr f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(int i, float f, arqg arqgVar, long j, long j2, arqr arqrVar) {
            super(1);
            this.a = i;
            this.b = f;
            this.c = arqgVar;
            this.d = j;
            this.e = j2;
            this.f = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            cny cnyVar = (cny) obj;
            float a = cjt.a(cnyVar.o());
            if (!a.bA(this.a, 0) && cjt.a(cnyVar.o()) <= cjt.c(cnyVar.o())) {
                f = this.b + cnyVar.eg(a);
            } else {
                f = this.b;
            }
            float eg = f / cnyVar.eg(cjt.c(cnyVar.o()));
            float floatValue = ((Number) this.c.a()).floatValue();
            float min = floatValue + Math.min(floatValue, eg);
            if (min <= 1.0f) {
                bog.d(cnyVar, min, 1.0f, this.d, a, this.a);
            }
            bog.d(cnyVar, brg.a, floatValue, this.e, a, this.a);
            this.f.a(cnyVar);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ cga b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ int e;
        final /* synthetic */ float f;
        final /* synthetic */ arqr g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(arqg arqgVar, cga cgaVar, long j, long j2, int i, float f, arqr arqrVar, int i2) {
            super(2);
            this.a = arqgVar;
            this.b = cgaVar;
            this.c = j;
            this.d = j2;
            this.e = i;
            this.f = f;
            this.g = arqrVar;
            this.h = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bog.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends arrp implements arqg<Float> {
        final /* synthetic */ arqg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(arqg arqgVar) {
            super(0);
            this.a = arqgVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(arrn.q(((Number) this.a.a()).floatValue(), brg.a, 1.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ int b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ long e;
        final /* synthetic */ cod f;
        final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqg arqgVar, int i, float f, float f2, long j, cod codVar, long j2) {
            super(1);
            this.a = arqgVar;
            this.b = i;
            this.c = f;
            this.d = f2;
            this.e = j;
            this.f = codVar;
            this.g = j2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            cny cnyVar = (cny) obj;
            float floatValue = ((Number) this.a.a()).floatValue() * 360.0f;
            if (!a.bA(this.b, 0) && cjt.a(cnyVar.o()) <= cjt.c(cnyVar.o())) {
                f = this.c + this.d;
            } else {
                f = this.c;
            }
            float eg = (f / ((float) (cnyVar.eg(cjt.c(cnyVar.o())) * 3.141592653589793d))) * 360.0f;
            float min = 270.0f + floatValue + Math.min(floatValue, eg);
            float min2 = Math.min(floatValue, eg);
            bog.c(cnyVar, min, (360.0f - floatValue) - (min2 + min2), this.e, this.f);
            bog.c(cnyVar, 270.0f, floatValue, this.g, this.f);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqg a;
        final /* synthetic */ cga b;
        final /* synthetic */ long c;
        final /* synthetic */ float d;
        final /* synthetic */ long e;
        final /* synthetic */ int f;
        final /* synthetic */ float g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqg arqgVar, cga cgaVar, long j, float f, long j2, int i, float f2, int i2, int i3) {
            super(2);
            this.a = arqgVar;
            this.b = cgaVar;
            this.c = j;
            this.d = f;
            this.e = j2;
            this.f = i;
            this.g = f2;
            this.h = i2;
            this.i = i3;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bog.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1), this.i);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ cas a;
        final /* synthetic */ int b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ cas e;
        final /* synthetic */ cas f;
        final /* synthetic */ long g;
        final /* synthetic */ cod h;
        final /* synthetic */ long i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(cas casVar, int i, float f, float f2, cas casVar2, cas casVar3, long j, cod codVar, long j2) {
            super(1);
            this.a = casVar;
            this.b = i;
            this.c = f;
            this.d = f2;
            this.e = casVar2;
            this.f = casVar3;
            this.g = j;
            this.h = codVar;
            this.i = j2;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            float f;
            long j;
            float min;
            float f2;
            cny cnyVar = (cny) obj;
            float floatValue = ((Number) this.a.a()).floatValue() * 360.0f;
            if (!a.bA(this.b, 0) && cjt.a(cnyVar.o()) <= cjt.c(cnyVar.o())) {
                f = this.c + this.d;
            } else {
                f = this.c;
            }
            float eg = (f / ((float) (cnyVar.eg(cjt.c(cnyVar.o())) * 3.141592653589793d))) * 360.0f;
            float floatValue2 = ((Number) this.e.a()).floatValue() + ((Number) this.f.a()).floatValue();
            long j2 = this.g;
            cod codVar = this.h;
            long j3 = this.i;
            long a = cnyVar.a();
            cnu q = cnyVar.q();
            long a2 = q.a();
            q.b().l();
            try {
                ((cnr.AnonymousClass1) q).a.c(floatValue2, a);
                min = Math.min(floatValue, eg) + floatValue;
                float f3 = 360.0f - floatValue;
                float min2 = Math.min(floatValue, eg);
                f2 = f3 - (min2 + min2);
                j = a2;
            } catch (Throwable th) {
                th = th;
                j = a2;
            }
            try {
                bog.c(cnyVar, min, f2, j2, codVar);
                bog.c(cnyVar, brg.a, floatValue, j3, codVar);
                q.b().j();
                q.h(j);
                return arnb.a;
            } catch (Throwable th2) {
                th = th2;
                q.b().j();
                q.h(j);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ long b;
        final /* synthetic */ float c;
        final /* synthetic */ long d;
        final /* synthetic */ int e;
        final /* synthetic */ float f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(cga cgaVar, long j, float f, long j2, int i, float f2, int i2, int i3) {
            super(2);
            this.a = cgaVar;
            this.b = j;
            this.c = f;
            this.d = j2;
            this.e = i;
            this.f = f2;
            this.g = i2;
            this.h = i3;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bog.a(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1), this.h);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqg<Float> {
        final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(float f) {
            super(0);
            this.a = f;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ float a;
        final /* synthetic */ cga b;
        final /* synthetic */ long c;
        final /* synthetic */ float d;
        final /* synthetic */ long e;
        final /* synthetic */ int f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(float f, cga cgaVar, long j, float f2, long j2, int i, int i2) {
            super(2);
            this.a = f;
            this.b = cgaVar;
            this.c = j;
            this.d = f2;
            this.e = j2;
            this.f = i;
            this.g = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bog.e(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqg<Float> {
        final /* synthetic */ arqg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(arqg arqgVar) {
            super(0);
            this.a = arqgVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(arrn.q(((Number) this.a.a()).floatValue(), brg.a, 1.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bog$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ arqg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(arqg arqgVar) {
            super(1);
            this.a = arqgVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            dhl.j((dho) obj, new dgu(((Number) this.a.a()).floatValue(), new arsy(brg.a, 1.0f)));
            return arnb.a;
        }
    }

    static {
        aae aaeVar = bva.a;
        a = bva.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.cga r32, long r33, float r35, long r36, int r38, float r39, defpackage.bwj r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bog.a(cga, long, float, long, int, float, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.arqg r31, defpackage.cga r32, long r33, float r35, long r36, int r38, float r39, defpackage.bwj r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bog.b(arqg, cga, long, float, long, int, float, bwj, int, int):void");
    }

    public static final void c(cny cnyVar, float f, float f2, long j, cod codVar) {
        float c = cjt.c(cnyVar.o());
        float f3 = codVar.a / 2.0f;
        float f4 = c - (f3 + f3);
        cnyVar.x(j, f, f2, a.z(f3, f3), a.z(f4, f4), codVar);
    }

    public static final void d(cny cnyVar, float f, float f2, long j, float f3, int i) {
        boolean z;
        float f4;
        float f5;
        float c = cjt.c(cnyVar.o());
        float a2 = cjt.a(cnyVar.o());
        float f6 = a2 / 2.0f;
        if (cnyVar.r() == drk.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f7 = f4 * c;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        float f8 = f5 * c;
        if (!a.bA(i, 0) && a2 <= c) {
            float f9 = f3 / 2.0f;
            arsy arsyVar = new arsy(f9, c - f9);
            float floatValue = ((Number) arrn.C(Float.valueOf(f7), arsyVar)).floatValue();
            float floatValue2 = ((Number) arrn.C(Float.valueOf(f8), arsyVar)).floatValue();
            if (Math.abs(f2 - f) > brg.a) {
                cnw.i(cnyVar, j, a.z(floatValue, f6), a.z(floatValue2, f6), f3, i, 480);
                return;
            }
            return;
        }
        cnw.i(cnyVar, j, a.z(f7, f6), a.z(f8, f6), f3, 0, 496);
    }

    @armg
    public static final void e(float f, cga cgaVar, long j, float f2, long j2, int i, bwj bwjVar, int i2) {
        int i3;
        float f3;
        long a2;
        int i4;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8 = i2 & 6;
        bwj c = bwjVar.c(-1472321743);
        int i9 = 1;
        if (i8 == 0) {
            if (true != c.D(f)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        int i10 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            if (true != c.F(j2)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i10 |= i5;
        }
        int i11 = i10 | 196608;
        if ((74899 & i11) == 74898 && c.L()) {
            c.v();
            j3 = j;
            f3 = f2;
            i4 = i;
        } else {
            c.w();
            if ((i2 & 1) != 0 && !c.J()) {
                c.v();
                a2 = j;
                f3 = f2;
                i9 = i;
            } else {
                f3 = 4.0f;
                a2 = bof.a(c);
            }
            c.n();
            int i12 = i11 & 14;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i12 == 4 || T == bwj.a.a) {
                T = new AnonymousClass6(f);
                bwkVar.ad(T);
            }
            b((arqg) T, cgaVar, a2, f3, j2, i9, brg.a, c, i11 & 523376, 64);
            i4 = i9;
            j3 = a2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass7(f, cgaVar, j3, f3, j2, i4, i2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 ??, still in use, count: 1, list:
          (r2v9 ?? I:java.lang.Object) from 0x0184: INVOKE (r10v2 ?? I:bwk), (r2v9 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:389)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final void f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 ??, still in use, count: 1, list:
          (r2v9 ?? I:java.lang.Object) from 0x0184: INVOKE (r10v2 ?? I:bwk), (r2v9 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:389)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
