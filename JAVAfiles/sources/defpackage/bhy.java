package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cvc;
import defpackage.cwl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhy {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqv arqvVar) {
            super(2);
            this.a = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bwx.a(bfx.a.c(Float.valueOf(bfw.a(1.0f, 0.87f, bwjVar))), cdk.e(1939362236, new bhx(this.a), bwjVar), bwjVar, 56);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhy$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ cmb b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ float e;
        final /* synthetic */ arqv f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, cmb cmbVar, long j, long j2, float f, arqv arqvVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = cmbVar;
            this.c = j;
            this.d = j2;
            this.e = f;
            this.f = arqvVar;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bhy.c(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhy$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bhm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(bhm bhmVar) {
            super(2);
            this.a = bhmVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bid.b(this.a.b(), null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, bwjVar, 0, 0, 131070);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhy$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bhm a;
        final /* synthetic */ cga b;
        final /* synthetic */ cmb c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;
        final /* synthetic */ long f;
        final /* synthetic */ float g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bhm bhmVar, cga cgaVar, cmb cmbVar, long j, long j2, long j3, float f, int i) {
            super(2);
            this.a = bhmVar;
            this.b = cgaVar;
            this.c = cmbVar;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = f;
            this.h = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bhy.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhy$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(arqv arqvVar, int i) {
            super(2);
            this.a = arqvVar;
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.b;
            bhy.a(this.a, (bwj) obj, bzh.a(i | 1));
            return arnb.a;
        }
    }

    public static final void a(arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(917397959);
        if (i4 == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c.L()) {
            c.v();
        } else {
            AnonymousClass5 anonymousClass5 = new cue() { // from class: bhy.5

                /* compiled from: PG */
                /* renamed from: bhy$5$1, reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
                    final /* synthetic */ ArrayList a;
                    final /* synthetic */ int b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ArrayList arrayList, int i) {
                        super(1);
                        this.a = arrayList;
                        this.b = i;
                    }

                    @Override // defpackage.arqr
                    public final /* bridge */ /* synthetic */ Object a(Object obj) {
                        cvc.a aVar = (cvc.a) obj;
                        ArrayList arrayList = this.a;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            int i2 = this.b;
                            cvc cvcVar = (cvc) arrayList.get(i);
                            cvc.a.m(aVar, cvcVar, 0, (i2 - cvcVar.b) / 2);
                        }
                        return arnb.a;
                    }
                }

                @Override // defpackage.cue
                public final /* synthetic */ int a(ctd ctdVar, List list, int i5) {
                    return cud.a(this, ctdVar, list, i5);
                }

                @Override // defpackage.cue
                public final /* synthetic */ int b(ctd ctdVar, List list, int i5) {
                    return cud.b(this, ctdVar, list, i5);
                }

                @Override // defpackage.cue
                public final /* synthetic */ int c(ctd ctdVar, List list, int i5) {
                    return cud.c(this, ctdVar, list, i5);
                }

                @Override // defpackage.cue
                public final /* synthetic */ int d(ctd ctdVar, List list, int i5) {
                    return cud.d(this, ctdVar, list, i5);
                }

                @Override // defpackage.cue
                public final cuf e(cuh cuhVar, List list, long j) {
                    float f;
                    cuf et;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    boolean z = false;
                    int i5 = Integer.MIN_VALUE;
                    int i6 = 0;
                    int i7 = Integer.MIN_VALUE;
                    int i8 = Integer.MIN_VALUE;
                    for (int i9 = 0; i9 < size; i9++) {
                        cvc e = ((cuc) list.get(i9)).e(j);
                        arrayList.add(e);
                        if (e.ei(csi.a) != Integer.MIN_VALUE && (i7 == Integer.MIN_VALUE || e.ei(csi.a) < i7)) {
                            i7 = e.ei(csi.a);
                        }
                        if (e.ei(csi.b) != Integer.MIN_VALUE && (i8 == Integer.MIN_VALUE || e.ei(csi.b) > i8)) {
                            i8 = e.ei(csi.b);
                        }
                        i6 = Math.max(i6, e.b);
                    }
                    if (i7 != Integer.MIN_VALUE) {
                        if (i8 != Integer.MIN_VALUE) {
                            z = true;
                        } else {
                            i8 = Integer.MIN_VALUE;
                        }
                        i5 = i7;
                    }
                    if (i5 != i8 && z) {
                        f = 68.0f;
                    } else {
                        f = 48.0f;
                    }
                    int max = Math.max(cuhVar.eo(f), i6);
                    et = cuhVar.et(dqs.b(j), max, arnw.a, new AnonymousClass1(arrayList, max));
                    return et;
                }
            };
            cga.a aVar = cga.e;
            int a = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i5 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, anonymousClass5, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            cga e = amh.e(cga.e, 16.0f, 6.0f);
            int i6 = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, e);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf2 = Integer.valueOf(a3);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar3);
            }
            caw.b(c, b2, cwl.a.c);
            arqvVar.a(c, Integer.valueOf(i2 & 14));
            c.p();
            c.p();
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass6(arqvVar, i);
        }
    }

    public static final void b(bhm bhmVar, cga cgaVar, cmb cmbVar, long j, long j2, long j3, float f, bwj bwjVar, int i) {
        int i2;
        cga cgaVar2;
        cmb cmbVar2;
        long f2;
        long h;
        long l;
        long i3;
        float f3;
        long f4;
        long j4;
        cmb cmbVar3;
        boolean I;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(258660814);
        if (i5 == 0) {
            if ((i & 8) == 0) {
                I = c.G(bhmVar);
            } else {
                I = c.I(bhmVar);
            }
            if (true != I) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 432;
        if ((i & 3072) == 0) {
            i6 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i6 |= 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        int i7 = i6 | 12582912;
        if ((4793491 & i7) == 4793490 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
            cmbVar3 = cmbVar;
            h = j;
            l = j2;
            j4 = j3;
            f3 = f;
        } else {
            int i8 = (-4193281) & i7;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                cgaVar2 = cgaVar;
                cmbVar2 = cmbVar;
                h = j;
                l = j2;
                i3 = j3;
                f3 = f;
            } else {
                cgaVar2 = cga.e;
                cmbVar2 = bgu.b(c).a;
                f2 = ckw.f(cku.d(r7), cku.c(r7), cku.b(r7), 0.8f, cku.f(bgu.a(c).g()));
                h = ckw.h(f2, bgu.a(c).l());
                l = bgu.a(c).l();
                bfs a = bgu.a(c);
                if (a.m()) {
                    long h2 = a.h();
                    f4 = ckw.f(cku.d(r0), cku.c(r0), cku.b(r0), 0.6f, cku.f(a.l()));
                    i3 = ckw.h(f4, h2);
                } else {
                    i3 = a.i();
                }
                f3 = 6.0f;
            }
            c.n();
            bhmVar.d();
            c.y(1991572277);
            ((bwk) c).Y();
            j4 = i3;
            c(amh.d(cgaVar2, 12.0f), cmbVar2, h, l, f3, cdk.e(-261845785, new AnonymousClass3(bhmVar), c), c, (i7 & 896) | 12582912 | ((i8 >> 3) & 3670016));
            cmbVar3 = cmbVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(bhmVar, cgaVar2, cmbVar3, h, l, j4, f3, i);
        }
    }

    public static final void c(cga cgaVar, cmb cmbVar, long j, long j2, float f, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i & 6;
        bwj c = bwjVar.c(-558258760);
        if (i11 == 0) {
            if (true != c.G(cgaVar)) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(null)) {
                i9 = 16;
            } else {
                i9 = 32;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (true != c.H(false)) {
                i8 = 128;
            } else {
                i8 = 256;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (true != c.G(cmbVar)) {
                i7 = 1024;
            } else {
                i7 = 2048;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (true != c.F(j)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (true != c.F(j2)) {
                i5 = 65536;
            } else {
                i5 = 131072;
            }
            i2 |= i5;
        }
        if ((i & 1572864) == 0) {
            if (true != c.D(f)) {
                i4 = 524288;
            } else {
                i4 = 1048576;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 4194304;
            } else {
                i3 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) == 4793490 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            int i12 = i2 >> 6;
            bic.b(cgaVar, cmbVar, j, j2, f, cdk.e(-2084221700, new AnonymousClass1(arqvVar), c), c, (i2 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i2 >> 3) & 458752), 16);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(cgaVar, cmbVar, j, j2, f, arqvVar, i);
        }
    }
}
