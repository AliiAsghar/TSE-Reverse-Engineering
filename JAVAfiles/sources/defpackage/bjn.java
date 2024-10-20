package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjn {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ abd b;
        final /* synthetic */ byn c;
        final /* synthetic */ afv d;
        final /* synthetic */ cmb e;
        final /* synthetic */ long f;
        final /* synthetic */ float g;
        final /* synthetic */ arqw h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, abd abdVar, byn bynVar, afv afvVar, cmb cmbVar, long j, float f, arqw arqwVar) {
            super(2);
            this.a = cgaVar;
            this.b = abdVar;
            this.c = bynVar;
            this.d = afvVar;
            this.e = cmbVar;
            this.f = j;
            this.g = f;
            this.h = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bmt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, bwjVar, 384);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjn$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ arqg b;
        final /* synthetic */ cga c;
        final /* synthetic */ long d;
        final /* synthetic */ afv e;
        final /* synthetic */ dtn f;
        final /* synthetic */ cmb g;
        final /* synthetic */ long h;
        final /* synthetic */ float i;
        final /* synthetic */ arqw j;
        final /* synthetic */ int k;
        final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, arqg arqgVar, cga cgaVar, long j, afv afvVar, dtn dtnVar, cmb cmbVar, long j2, float f, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = z;
            this.b = arqgVar;
            this.c = cgaVar;
            this.d = j;
            this.e = afvVar;
            this.f = dtnVar;
            this.g = cmbVar;
            this.h = j2;
            this.i = f;
            this.j = arqwVar;
            this.k = i;
            this.l = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.k;
            int i2 = this.l;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            bjn.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjn$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<drg, drg, arnb> {
        final /* synthetic */ byn a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(byn bynVar) {
            super(2);
            this.a = bynVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
        @Override // defpackage.arqv
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                drg r6 = (defpackage.drg) r6
                drg r7 = (defpackage.drg) r7
                int r0 = r7.b
                int r1 = r6.d
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 0
                if (r0 < r1) goto Lf
            Ld:
                r0 = r3
                goto L3b
            Lf:
                int r0 = r7.d
                int r1 = r6.b
                if (r0 > r1) goto L17
                r0 = r2
                goto L3b
            L17:
                int r0 = r7.b()
                if (r0 != 0) goto L1e
                goto Ld
            L1e:
                int r0 = r6.b
                int r1 = r7.b
                int r0 = java.lang.Math.max(r0, r1)
                int r1 = r6.d
                int r4 = r7.d
                int r1 = java.lang.Math.min(r1, r4)
                int r0 = r0 + r1
                int r0 = r0 / 2
                int r1 = r7.b
                int r0 = r0 - r1
                int r1 = r7.b()
                float r1 = (float) r1
                float r0 = (float) r0
                float r0 = r0 / r1
            L3b:
                int r1 = r7.c
                int r4 = r6.e
                if (r1 < r4) goto L43
            L41:
                r2 = r3
                goto L6f
            L43:
                int r1 = r7.e
                int r4 = r6.c
                if (r1 > r4) goto L4a
                goto L6f
            L4a:
                int r1 = r7.a()
                if (r1 != 0) goto L51
                goto L41
            L51:
                int r1 = r6.c
                int r2 = r7.c
                int r1 = java.lang.Math.max(r1, r2)
                int r6 = r6.e
                int r2 = r7.e
                int r6 = java.lang.Math.min(r6, r2)
                int r1 = r1 + r6
                int r1 = r1 / 2
                int r6 = r7.c
                int r1 = r1 - r6
                int r6 = r7.a()
                float r6 = (float) r6
                float r7 = (float) r1
                float r2 = r7 / r6
            L6f:
                byn r6 = r5.a
                long r0 = defpackage.cmh.a(r0, r2)
                cmg r7 = new cmg
                r7.<init>(r0)
                r6.h(r7)
                arnb r6 = defpackage.arnb.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bjn.AnonymousClass3.a(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjn$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;
        final /* synthetic */ arqg b;
        final /* synthetic */ cga c;
        final /* synthetic */ boolean d;
        final /* synthetic */ bms e;
        final /* synthetic */ amj f;
        final /* synthetic */ ajr g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(arqv arqvVar, arqg arqgVar, cga cgaVar, boolean z, bms bmsVar, amj amjVar, ajr ajrVar, int i) {
            super(2);
            this.a = arqvVar;
            this.b = arqgVar;
            this.c = cgaVar;
            this.d = z;
            this.e = bmsVar;
            this.f = amjVar;
            this.g = ajrVar;
            this.h = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bjn.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    static {
        new dtn(true, false, 14);
    }

    public static final void a(boolean z, arqg arqgVar, cga cgaVar, long j, afv afvVar, dtn dtnVar, cmb cmbVar, long j2, float f, arqw arqwVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i & 6;
        bwj c = bwjVar.c(1431928300);
        if (i17 == 0) {
            if (true != c.H(z)) {
                i16 = 2;
            } else {
                i16 = 4;
            }
            i3 = i16 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqgVar)) {
                i15 = 16;
            } else {
                i15 = 32;
            }
            i3 |= i15;
        }
        if ((i & 384) == 0) {
            if (true != c.G(cgaVar)) {
                i14 = 128;
            } else {
                i14 = 256;
            }
            i3 |= i14;
        }
        if ((i & 3072) == 0) {
            if (true != c.F(j)) {
                i13 = 1024;
            } else {
                i13 = 2048;
            }
            i3 |= i13;
        }
        if ((i & 24576) == 0) {
            if (true != c.G(afvVar)) {
                i12 = 8192;
            } else {
                i12 = 16384;
            }
            i3 |= i12;
        }
        if ((196608 & i) == 0) {
            if (true != c.G(dtnVar)) {
                i11 = 65536;
            } else {
                i11 = 131072;
            }
            i3 |= i11;
        }
        if ((1572864 & i) == 0) {
            if (true != c.G(cmbVar)) {
                i10 = 524288;
            } else {
                i10 = 1048576;
            }
            i3 |= i10;
        }
        if ((12582912 & i) == 0) {
            if (true != c.F(j2)) {
                i9 = 4194304;
            } else {
                i9 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i3 |= i9;
        }
        if ((100663296 & i) == 0) {
            if (true != c.D(brg.a)) {
                i8 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i8 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i3 |= i8;
        }
        if ((805306368 & i) == 0) {
            if (true != c.D(f)) {
                i7 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i7 = 536870912;
            }
            i3 |= i7;
        }
        if ((i2 & 6) == 0) {
            if (true != c.G(null)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.I(arqwVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i4 |= i5;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new abd(false);
                bwkVar.ad(T);
            }
            abd abdVar = (abd) T;
            abdVar.d(Boolean.valueOf(z));
            if (((Boolean) abdVar.a()).booleanValue() || ((Boolean) abdVar.b()).booleanValue()) {
                Object T2 = bwkVar.T();
                if (T2 == bwj.a.a) {
                    T2 = new byu(new cmg(cmg.a), cav.a);
                    bwkVar.ad(T2);
                }
                byn bynVar = (byn) T2;
                dqv dqvVar = (dqv) c.g(dch.d);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean G = z2 | c.G(dqvVar);
                Object T3 = bwkVar.T();
                if (G || T3 == bwj.a.a) {
                    T3 = new bta(j, dqvVar, dqvVar.eo(48.0f), new AnonymousClass3(bynVar));
                    bwkVar.ad(T3);
                }
                dsu.b((bta) T3, arqgVar, dtnVar, cdk.e(2126968933, new AnonymousClass1(cgaVar, abdVar, bynVar, afvVar, cmbVar, j2, f, arqwVar), c), c, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(z, arqgVar, cgaVar, j, afvVar, dtnVar, cmbVar, j2, f, arqwVar, i, i2);
        }
    }

    public static final void b(arqv arqvVar, arqg arqgVar, cga cgaVar, boolean z, bms bmsVar, amj amjVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i & 6;
        bwj c = bwjVar.c(1826340448);
        if (i12 == 0) {
            if (true != c.I(arqvVar)) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqgVar)) {
                i10 = 16;
            } else {
                i10 = 32;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (true != c.G(cgaVar)) {
                i9 = 128;
            } else {
                i9 = 256;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (true != c.I(null)) {
                i8 = 1024;
            } else {
                i8 = 2048;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (true != c.I(null)) {
                i7 = 8192;
            } else {
                i7 = 16384;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (true != c.H(z)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (true != c.G(bmsVar)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (true != c.G(amjVar)) {
                i4 = 4194304;
            } else {
                i4 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (true != c.G(ajrVar)) {
                i3 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i3 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) == 38347922 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            bmt.b(arqvVar, arqgVar, cgaVar, z, bmsVar, amjVar, ajrVar, c, i2 & 268435454);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(arqvVar, arqgVar, cgaVar, z, bmsVar, amjVar, ajrVar, i);
        }
    }
}
