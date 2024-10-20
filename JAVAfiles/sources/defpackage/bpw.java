package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.android.vcard.VCardConfig;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cru;
import defpackage.cvc;
import defpackage.cwl;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpw {
    public static final float a;
    private static final float b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bqb a;
        final /* synthetic */ cga b;
        final /* synthetic */ boolean c;
        final /* synthetic */ bpt d;
        final /* synthetic */ ajr e;
        final /* synthetic */ arqw f;
        final /* synthetic */ arqw g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bqb bqbVar, cga cgaVar, boolean z, bpt bptVar, ajr ajrVar, arqw arqwVar, arqw arqwVar2, int i) {
            super(2);
            this.a = bqbVar;
            this.b = cgaVar;
            this.c = z;
            this.d = bptVar;
            this.e = ajrVar;
            this.f = arqwVar;
            this.g = arqwVar2;
            this.h = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bpw.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpw$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<dri, arnb> {
        final /* synthetic */ bqb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bqb bqbVar) {
            super(1);
            this.a = bqbVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            this.a.g.d(dri.b(((dri) obj).a));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpw$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ bqb b;
        final /* synthetic */ boolean c;
        final /* synthetic */ ajr d;
        final /* synthetic */ arqw e;
        final /* synthetic */ arqw f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(cga cgaVar, bqb bqbVar, boolean z, ajr ajrVar, arqw arqwVar, arqw arqwVar2, int i) {
            super(2);
            this.a = cgaVar;
            this.b = bqbVar;
            this.c = z;
            this.d = ajrVar;
            this.e = arqwVar;
            this.f = arqwVar2;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            cga cgaVar = this.a;
            bqb bqbVar = this.b;
            boolean z = this.c;
            ajr ajrVar = this.d;
            arqw arqwVar = this.e;
            bpw.c(cgaVar, bqbVar, z, ajrVar, arqwVar, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpw$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arpw implements arqw<arwe, Float, arpe<? super arnb>, Object> {
        final /* synthetic */ bqb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(bqb bqbVar, arpe arpeVar) {
            super(3, arpeVar);
            this.a = bqbVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            ((Number) obj2).floatValue();
            return new AnonymousClass5(this.a, (arpe) obj3).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            this.a.h.a();
            return arnb.a;
        }
    }

    static {
        buo buoVar = bvj.a;
        a = bvj.m;
        float f = bvj.k;
        b = f;
        a.z(f, bvj.i);
    }

    public static final float a(float f, float f2, float f3) {
        float f4;
        float f5 = f2 - f;
        if (f5 == brg.a) {
            f4 = 0.0f;
        } else {
            f4 = (f3 - f) / f5;
        }
        return arrn.q(f4, brg.a, 1.0f);
    }

    public static final float b(float f, float f2, float f3, float f4, float f5) {
        return drv.b(f4, f5, a(f, f2, f3));
    }

    public static final void c(cga cgaVar, final bqb bqbVar, boolean z, ajr ajrVar, arqw arqwVar, arqw arqwVar2, bwj bwjVar, int i) {
        int i2;
        boolean z2;
        arpe arpeVar;
        cga cgaVar2;
        bwk bwkVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 6;
        bwj c = bwjVar.c(1390990089);
        if (i9 == 0) {
            if (true != c.G(cgaVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(bqbVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (true != c.H(z)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (true != c.G(ajrVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != c.I(arqwVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (true != c.I(arqwVar2)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((i10 & 74899) == 74898 && c.L()) {
            c.v();
        } else {
            if (c.g(dch.i) == drk.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            bqbVar.e = z2;
            cga cgaVar3 = cga.e;
            if (z) {
                arpeVar = null;
                cgaVar2 = new SuspendPointerInputElement(bqbVar, ajrVar, null, new cru.AnonymousClass1(new bqa(bqbVar, null)), 4);
            } else {
                arpeVar = null;
                cgaVar2 = cgaVar3;
            }
            cga.a aVar = cga.e;
            ahp ahpVar = ahp.b;
            boolean z3 = bqbVar.e;
            boolean k = bqbVar.k();
            boolean I = c.I(bqbVar);
            bwk bwkVar2 = (bwk) c;
            Object T = bwkVar2.T();
            if (I || T == bwj.a.a) {
                T = new AnonymousClass5(bqbVar, arpeVar);
                bwkVar2.ad(T);
            }
            cga a2 = aem.a(dhb.c(dhb.d(amv.x(bmi.a(cgaVar), b, a), new bpz(z, bqbVar)).a(bsh.a), true, new afq(bqbVar.e(), new arsy(((Number) bqbVar.k.c()).floatValue(), ((Number) bqbVar.k.b()).floatValue()))), z, ajrVar).a(cgaVar2).a(ahh.a(aVar, bqbVar, ahpVar, z, ajrVar, k, (arqw) T, z3, 32));
            boolean I2 = c.I(bqbVar);
            Object T2 = bwkVar2.T();
            if (!I2 && T2 != bwj.a.a) {
                bwkVar = bwkVar2;
            } else {
                T2 = new cue() { // from class: bpw.3

                    /* compiled from: PG */
                    /* renamed from: bpw$3$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
                        final /* synthetic */ cvc a;
                        final /* synthetic */ int b;
                        final /* synthetic */ int c;
                        final /* synthetic */ cvc d;
                        final /* synthetic */ int e;
                        final /* synthetic */ int f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(cvc cvcVar, int i, int i2, cvc cvcVar2, int i3, int i4) {
                            super(1);
                            this.a = cvcVar;
                            this.b = i;
                            this.c = i2;
                            this.d = cvcVar2;
                            this.e = i3;
                            this.f = i4;
                        }

                        @Override // defpackage.arqr
                        public final /* bridge */ /* synthetic */ Object a(Object obj) {
                            cvc.a aVar = (cvc.a) obj;
                            cvc.a.m(aVar, this.a, this.b, this.c);
                            cvc.a.m(aVar, this.d, this.e, this.f);
                            return arnb.a;
                        }
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int a(ctd ctdVar, List list, int i11) {
                        return cud.a(this, ctdVar, list, i11);
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int b(ctd ctdVar, List list, int i11) {
                        return cud.b(this, ctdVar, list, i11);
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int c(ctd ctdVar, List list, int i11) {
                        return cud.c(this, ctdVar, list, i11);
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int d(ctd ctdVar, List list, int i11) {
                        return cud.d(this, ctdVar, list, i11);
                    }

                    @Override // defpackage.cue
                    public final cuf e(cuh cuhVar, List list, long j) {
                        cuf et;
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            cuc cucVar = (cuc) list.get(i11);
                            if (ctk.b(cucVar) == bpu.a) {
                                cvc e = cucVar.e(j);
                                int size2 = list.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    cuc cucVar2 = (cuc) list.get(i12);
                                    if (ctk.b(cucVar2) == bpu.b) {
                                        cvc e2 = cucVar2.e(dqs.k(dqt.k(j, -e.a, 0, 2), 0, 0, 0, 0, 11));
                                        int i13 = e.a + e2.a;
                                        int max = Math.max(e2.b, e.b);
                                        bqb bqbVar2 = bqb.this;
                                        bqbVar2.f.d(e2.b);
                                        bqbVar2.d.d(i13);
                                        et = cuhVar.et(i13, max, arnw.a, new AnonymousClass1(e2, e.a / 2, (max - e2.b) / 2, e, arsk.g(e2.a * bqb.this.b()), (max - e.b) / 2));
                                        return et;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                bwkVar = bwkVar2;
                bwkVar.ad(T2);
            }
            cue cueVar = (cue) T2;
            int a3 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, a2);
            int i11 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, cueVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            cga w = amv.w(ctk.a(cga.e, bpu.a));
            boolean I3 = c.I(bqbVar);
            Object T3 = bwkVar.T();
            if (I3 || T3 == bwj.a.a) {
                T3 = new AnonymousClass2(bqbVar);
                bwkVar.ad(T3);
            }
            cga a4 = cuw.a(w, (arqr) T3);
            int i12 = cfq.a;
            cue a5 = akc.a(cfq.a.a, false);
            int a6 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, a4);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a5, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b3, cwl.a.c);
            int i13 = (i10 >> 3) & 14;
            arqwVar.a(bqbVar, c, Integer.valueOf(((i10 >> 9) & 112) | i13));
            c.p();
            cga a7 = ctk.a(cga.e, bpu.b);
            cue a8 = akc.a(cfq.a.a, false);
            int a9 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b4 = cfv.b(c, a7);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a8, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a9))) {
                Integer valueOf3 = Integer.valueOf(a9);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar3);
            }
            caw.b(c, b4, cwl.a.c);
            arqwVar2.a(bqbVar, c, Integer.valueOf(i13 | ((i10 >> 12) & 112)));
            c.p();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(cgaVar, bqbVar, z, ajrVar, arqwVar, arqwVar2, i);
        }
    }

    public static final void d(bqb bqbVar, cga cgaVar, boolean z, bpt bptVar, ajr ajrVar, arqw arqwVar, arqw arqwVar2, bwj bwjVar, int i) {
        int i2;
        bpt b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 6;
        bwj c = bwjVar.c(-1303883986);
        if (i9 == 0) {
            if (true != c.I(bqbVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (true != c.H(z)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            if (true != c.G(ajrVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (true != c.I(arqwVar2)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i2 |= i3;
        }
        if ((599187 & i2) == 599186 && c.L()) {
            c.v();
            b2 = bptVar;
        } else {
            int i10 = i2 & (-7169);
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                b2 = bptVar;
            } else {
                bpv bpvVar = bpv.a;
                b2 = bpv.b(bmp.a(c));
            }
            c.n();
            int i11 = i10 >> 3;
            c(cgaVar, bqbVar, z, ajrVar, arqwVar, arqwVar2, c, (i2 & 896) | ((i10 << 3) & 112) | (i11 & 14) | (i11 & 7168) | (57344 & i11) | (458752 & i11));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(bqbVar, cgaVar, z, b2, ajrVar, arqwVar, arqwVar2, i);
        }
    }

    public static final void e(float f, arqr arqrVar, cga cgaVar, boolean z, arqg arqgVar, bpt bptVar, ajr ajrVar, arqw arqwVar, arqw arqwVar2, arsy arsyVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
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
        int i16 = i & 6;
        bwj c = bwjVar.c(1191170377);
        if (i16 == 0) {
            if (true != c.D(f)) {
                i15 = 2;
            } else {
                i15 = 4;
            }
            i3 = i15 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqrVar)) {
                i14 = 16;
            } else {
                i14 = 32;
            }
            i3 |= i14;
        }
        if ((i & 384) == 0) {
            if (true != c.G(cgaVar)) {
                i13 = 128;
            } else {
                i13 = 256;
            }
            i3 |= i13;
        }
        if ((i & 3072) == 0) {
            if (true != c.H(z)) {
                i12 = 1024;
            } else {
                i12 = 2048;
            }
            i3 |= i12;
        }
        if ((i & 24576) == 0) {
            if (true != c.I(arqgVar)) {
                i11 = 8192;
            } else {
                i11 = 16384;
            }
            i3 |= i11;
        }
        if ((196608 & i) == 0) {
            if (true != c.G(bptVar)) {
                i10 = 65536;
            } else {
                i10 = 131072;
            }
            i3 |= i10;
        }
        if ((1572864 & i) == 0) {
            if (true != c.G(ajrVar)) {
                i9 = 524288;
            } else {
                i9 = 1048576;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            if (true != c.E(0)) {
                i8 = 4194304;
            } else {
                i8 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i3 |= i8;
        }
        if ((100663296 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i7 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i7 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i3 |= i7;
        }
        if ((805306368 & i) == 0) {
            if (true != c.I(arqwVar2)) {
                i6 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i6 = 536870912;
            }
            i3 |= i6;
        }
        if ((i2 & 6) == 0) {
            if (true != c.G(arsyVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i4 = i2 | i5;
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            if ((29360128 & i3) == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((((i4 & 14) ^ 6) > 4 && c.G(arsyVar)) || (i4 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (z4 || T == bwj.a.a) {
                T = new bqb(f, arqgVar, arsyVar);
                bwkVar.ad(T);
            }
            bqb bqbVar = (bqb) T;
            bqbVar.a = arqgVar;
            bqbVar.b = arqrVar;
            bqbVar.j(f);
            int i17 = i3 >> 3;
            int i18 = i3 >> 6;
            int i19 = i3 >> 9;
            d(bqbVar, cgaVar, z, null, ajrVar, arqwVar, arqwVar2, c, (i17 & 1008) | (i18 & 57344) | (458752 & i19) | (i19 & 3670016));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new bpx(f, arqrVar, cgaVar, z, arqgVar, bptVar, ajrVar, arqwVar, arqwVar2, arsyVar, i, i2);
        }
    }
}
