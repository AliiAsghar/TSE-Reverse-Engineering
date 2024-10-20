package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bml {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<dho, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;
        final /* synthetic */ arqv b;
        final /* synthetic */ arqv c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqv arqvVar, arqv arqvVar2, arqv arqvVar3) {
            super(2);
            this.a = arqvVar;
            this.b = arqvVar2;
            this.c = arqvVar3;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bml.g(this.a, this.b, this.c, bwjVar, 384);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqv c;
        final /* synthetic */ arqv d;
        final /* synthetic */ bmj e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqv arqvVar, cga cgaVar, arqv arqvVar2, arqv arqvVar3, bmj bmjVar, int i) {
            super(2);
            this.a = arqvVar;
            this.b = cgaVar;
            this.c = arqvVar2;
            this.d = arqvVar3;
            this.e = bmjVar;
            this.f = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bml.f(this.a, this.b, this.c, this.d, this.e, (bwj) obj, bzh.a(this.f | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bmj a;
        final /* synthetic */ arqv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bmj bmjVar, arqv arqvVar) {
            super(2);
            this.a = bmjVar;
            this.b = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bmj bmjVar = this.a;
                buo buoVar = buw.a;
                bml.c(bmjVar.b, buw.j, this.b, bwjVar, 48);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bmj a;
        final /* synthetic */ arqv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(bmj bmjVar, arqv arqvVar) {
            super(2);
            this.a = bmjVar;
            this.b = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga j = amh.j(cga.e, brg.a, brg.a, 16.0f, brg.a, 11);
                bmj bmjVar = this.a;
                arqv arqvVar = this.b;
                int i = cfq.a;
                cue a = akc.a(cfq.a.a, false);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, j);
                int i2 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b, cwl.a.c);
                bwx.a(blp.a.c(new cku(bmjVar.c)), arqvVar, bwjVar, 8);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bmj a;
        final /* synthetic */ arqv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(bmj bmjVar, arqv arqvVar) {
            super(2);
            this.a = bmjVar;
            this.b = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga j = amh.j(cga.e, 16.0f, brg.a, brg.a, brg.a, 14);
                bmj bmjVar = this.a;
                arqv arqvVar = this.b;
                int i = cfq.a;
                cue a = akc.a(cfq.a.a, false);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, j);
                int i2 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b, cwl.a.c);
                long j2 = bmjVar.f;
                buo buoVar = buw.a;
                bml.c(j2, buw.q, arqvVar, bwjVar, 48);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;
        final /* synthetic */ arqv b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(arqv arqvVar, arqv arqvVar2, arqv arqvVar3, int i) {
            super(2);
            this.a = arqvVar;
            this.b = arqvVar2;
            this.c = arqvVar3;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            arqv arqvVar = this.a;
            arqv arqvVar2 = this.b;
            int i = this.d;
            bml.g(arqvVar, arqvVar2, this.c, (bwj) obj, bzh.a(i | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bml$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ bvu b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(long j, bvu bvuVar, arqv arqvVar, int i) {
            super(2);
            this.a = j;
            this.b = bvuVar;
            this.c = arqvVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            long j = this.a;
            bvu bvuVar = this.b;
            bml.c(j, bvuVar, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    public static final float a(int i) {
        if (a.bA(i, 3)) {
            return 12.0f;
        }
        return 8.0f;
    }

    public static final int b(ctd ctdVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f;
        if (a.bA(i6, 1)) {
            buo buoVar = buw.a;
            f = buw.l;
        } else if (a.bA(i6, 2)) {
            buo buoVar2 = buw.a;
            f = buw.r;
        } else {
            buo buoVar3 = buw.a;
            f = buw.o;
        }
        return arrn.s(Math.max(Math.max(dqs.c(j), ctdVar.eo(f)), i7 + Math.max(i, Math.max(i3 + i4 + i5, i2))), dqs.a(j));
    }

    public static final void c(long j, bvu bvuVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(1133967795);
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
            if (true != c.G(bvuVar)) {
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
            bto.a(j, bsf.a(bvuVar, c), arqvVar, c, i2 & 910);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass8(j, bvuVar, arqvVar, i);
        }
    }

    public static final boolean d(dqv dqvVar, int i) {
        if (i > dqvVar.en(drn.c(30))) {
            return true;
        }
        return false;
    }

    public static final int e(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (dqs.h(j)) {
            return dqs.b(j);
        }
        return i6 + i + Math.max(i3, Math.max(i4, i5)) + i2;
    }

    public static final void f(arqv arqvVar, cga cgaVar, arqv arqvVar2, arqv arqvVar3, bmj bmjVar, bwj bwjVar, int i) {
        int i2;
        cdi e;
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
        bwj c = bwjVar.c(-1647707763);
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
            if (true != c.G(cgaVar)) {
                i10 = 16;
            } else {
                i10 = 32;
            }
            i2 |= i10;
        }
        cdi cdiVar = null;
        if ((i & 384) == 0) {
            if (true != c.I(null)) {
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
            if (true != c.I(arqvVar2)) {
                i7 = 8192;
            } else {
                i7 = 16384;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (true != c.I(arqvVar3)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (true != c.G(bmjVar)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (true != c.D(brg.a)) {
                i4 = 4194304;
            } else {
                i4 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (true != c.D(brg.a)) {
                i3 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i3 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i2 |= i3;
        }
        if ((i2 & 38347923) == 38347922 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            cdi e2 = cdk.e(-403249643, new AnonymousClass4(bmjVar, arqvVar), c);
            c.y(1640974972);
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            c.y(1640985204);
            bwkVar.Y();
            c.y(1640995230);
            if (arqvVar2 == null) {
                e = null;
            } else {
                e = cdk.e(1400509200, new AnonymousClass5(bmjVar, arqvVar2), c);
            }
            bwkVar.Y();
            c.y(1641008657);
            if (arqvVar3 != null) {
                cdiVar = cdk.e(1512306332, new AnonymousClass6(bmjVar, arqvVar3), c);
            }
            bwkVar.Y();
            cga a = dhb.c(cga.e, true, AnonymousClass1.a).a(cgaVar);
            int i13 = bmk.a;
            buo buoVar = buw.a;
            bqv.c(a, bpl.a(buw.b, c), bmjVar.a, bmjVar.b, brg.a, brg.a, null, cdk.e(1502590376, new AnonymousClass2(e, cdiVar, e2), c), c, 64);
        }
        bzz e3 = c.e();
        if (e3 != null) {
            ((bzf) e3).d = new AnonymousClass3(arqvVar, cgaVar, arqvVar2, arqvVar3, bmjVar, i);
        }
    }

    public static final void g(arqv arqvVar, arqv arqvVar2, arqv arqvVar3, bwj bwjVar, int i) {
        int i2;
        arqv arqvVar4;
        arqv arqvVar5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 6;
        bwj c = bwjVar.c(2052297037);
        if (i8 == 0) {
            if (true != c.I(arqvVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar2)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (true != c.I(arqvVar3)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (true != c.I(null)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (true != c.I(null)) {
                i3 = 8192;
            } else {
                i3 = 16384;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && c.L()) {
            c.v();
        } else {
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bmn();
                bwkVar.ad(T);
            }
            bmn bmnVar = (bmn) T;
            arqv[] arqvVarArr = new arqv[5];
            arqvVarArr[0] = arqvVar3;
            arqvVarArr[1] = bll.a;
            arqvVarArr[2] = bll.b;
            if (arqvVar == null) {
                arqvVar4 = bll.c;
            } else {
                arqvVar4 = arqvVar;
            }
            arqvVarArr[3] = arqvVar4;
            if (arqvVar2 == null) {
                arqvVar5 = bll.d;
            } else {
                arqvVar5 = arqvVar2;
            }
            arqvVarArr[4] = arqvVar5;
            List B = aqjn.B(arqvVarArr);
            cga.a aVar = cga.e;
            arqv a = cto.a(B);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new cuo(bmnVar);
                bwkVar.ad(T2);
            }
            cue cueVar = (cue) T2;
            int a2 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i9 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, cueVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar6 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar6);
            }
            caw.b(c, b, cwl.a.c);
            a.a(c, 0);
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass7(arqvVar, arqvVar2, arqvVar3, i);
        }
    }
}
