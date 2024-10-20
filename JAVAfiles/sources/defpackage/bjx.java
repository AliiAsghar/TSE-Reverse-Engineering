package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cvc;
import defpackage.cwl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjx {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;
        final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqw arqwVar, float f) {
            super(2);
            this.a = arqwVar;
            this.b = f;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                this.a.a(amh.h(brg.a, brg.a, brg.a, this.b, 7), bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqv<dri, dqs, armo<? extends bsw<bps>, ? extends bps>> {
        final /* synthetic */ bpq a;
        final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(bpq bpqVar, float f) {
            super(2);
            this.a = bpqVar;
            this.b = f;
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            long j = ((dri) obj).a;
            bsw a = bsq.a(new bjy(this.a, dqs.a(((dqs) obj2).a), this.b, dri.a(j)));
            bps bpsVar = (bps) this.a.d.l();
            bps bpsVar2 = bps.a;
            int ordinal = bpsVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (a.g(bps.c)) {
                            bpsVar = bps.c;
                        } else if (a.g(bps.b)) {
                            bpsVar = bps.b;
                        } else if (a.g(bps.a)) {
                            bpsVar = bps.a;
                        }
                    } else {
                        throw new armm();
                    }
                } else if (a.g(bps.b)) {
                    bpsVar = bps.b;
                } else if (a.g(bps.c)) {
                    bpsVar = bps.c;
                } else if (a.g(bps.a)) {
                    bpsVar = bps.a;
                }
            } else if (a.g(bps.a)) {
                bpsVar = bps.a;
            }
            return new armo(a, bpsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bpq a;
        final /* synthetic */ arqv b;
        final /* synthetic */ arwe c;
        final /* synthetic */ boolean d;
        final /* synthetic */ arqw e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(bpq bpqVar, arqv arqvVar, arwe arweVar, boolean z, arqw arqwVar) {
            super(2);
            this.a = bpqVar;
            this.b = arqvVar;
            this.c = arweVar;
            this.d = z;
            this.e = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga c;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) != 2 || !bwjVar.L()) {
                c = amv.c(cga.e, 1.0f);
                cga a = bjx.a(c, this.a);
                arqv arqvVar = this.b;
                bpq bpqVar = this.a;
                arwe arweVar = this.c;
                boolean z = this.d;
                arqw arqwVar = this.e;
                ajw.e eVar = ajw.c;
                int i = cfq.a;
                cue a2 = akk.a(eVar, cfq.a.m, bwjVar, 0);
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
                ako akoVar = ako.a;
                bwjVar.y(-1168026632);
                if (arqvVar != null) {
                    String a4 = btp.a(R.string.m3c_bottom_sheet_collapse_description, bwjVar);
                    String a5 = btp.a(R.string.m3c_bottom_sheet_dismiss_description, bwjVar);
                    String a6 = btp.a(R.string.m3c_bottom_sheet_expand_description, bwjVar);
                    cga a7 = akoVar.a(cga.e, cfq.a.n);
                    boolean G = bwjVar.G(bpqVar) | bwjVar.I(arweVar);
                    Object h = bwjVar.h();
                    if (G || h == bwj.a.a) {
                        h = new bkc(bpqVar, arweVar);
                        bwjVar.B(h);
                    }
                    cga c2 = adw.c(a7, false, null, (arqg) h, 7);
                    boolean G2 = bwjVar.G(bpqVar) | bwjVar.H(z) | bwjVar.G(a6) | bwjVar.I(arweVar) | bwjVar.G(a4) | bwjVar.G(a5);
                    Object h2 = bwjVar.h();
                    if (G2 || h2 == bwj.a.a) {
                        h2 = new bkj(bpqVar, z, a6, a4, a5, arweVar);
                        bwjVar.B(h2);
                    }
                    cga c3 = dhb.c(c2, true, (arqr) h2);
                    cue a8 = akc.a(cfq.a.a, false);
                    int a9 = bwg.a(bwjVar);
                    bwy d2 = bwjVar.d();
                    cga b2 = cfv.b(bwjVar, c3);
                    arqg arqgVar2 = cwl.a.a;
                    bwjVar.N();
                    bwjVar.A();
                    if (bwjVar.K()) {
                        bwjVar.l(arqgVar2);
                    } else {
                        bwjVar.C();
                    }
                    caw.b(bwjVar, a8, cwl.a.e);
                    caw.b(bwjVar, d2, cwl.a.d);
                    arqv arqvVar3 = cwl.a.f;
                    if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a9))) {
                        Integer valueOf2 = Integer.valueOf(a9);
                        bwjVar.B(valueOf2);
                        bwjVar.j(valueOf2, arqvVar3);
                    }
                    caw.b(bwjVar, b2, cwl.a.c);
                    arqvVar.a(bwjVar, 0);
                    bwjVar.p();
                }
                bwjVar.q();
                arqwVar.a(akoVar, bwjVar, 6);
                bwjVar.p();
            } else {
                bwjVar.v();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bpq a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ boolean d;
        final /* synthetic */ cmb e;
        final /* synthetic */ long f;
        final /* synthetic */ long g;
        final /* synthetic */ float h;
        final /* synthetic */ float i;
        final /* synthetic */ arqv j;
        final /* synthetic */ arqw k;
        final /* synthetic */ int l;
        final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(bpq bpqVar, float f, float f2, boolean z, cmb cmbVar, long j, long j2, float f3, float f4, arqv arqvVar, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = bpqVar;
            this.b = f;
            this.c = f2;
            this.d = z;
            this.e = cmbVar;
            this.f = j;
            this.g = j2;
            this.h = f3;
            this.i = f4;
            this.j = arqvVar;
            this.k = arqwVar;
            this.l = i;
            this.m = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bpq bpqVar = this.a;
            float f = this.b;
            float f2 = this.c;
            boolean z = this.d;
            cmb cmbVar = this.e;
            long j = this.f;
            long j2 = this.g;
            float f3 = this.h;
            float f4 = this.i;
            arqv arqvVar = this.j;
            int i = this.l;
            bjx.d(bpqVar, f, f2, z, cmbVar, j, j2, f3, f4, arqvVar, this.k, (bwj) obj, bzh.a(i | 1), bzh.a(this.m));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass13 extends arrp implements arqr<Float, arnb> {
        final /* synthetic */ arwe a;
        final /* synthetic */ bpq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(arwe arweVar, bpq bpqVar) {
            super(1);
            this.a = arweVar;
            this.b = bpqVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            arrn.J(this.a, null, null, new bkk(this.b, ((Number) obj).floatValue(), null), 3);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$14, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass14 extends arrp implements arqr<cle, arnb> {
        final /* synthetic */ bpq a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(bpq bpqVar) {
            super(1);
            this.a = bpqVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            cle cleVar = (cle) obj;
            float c = this.a.d.c();
            float b = this.a.d.f().b();
            if (c < b) {
                f = b - c;
            } else {
                f = 0.0f;
            }
            float f2 = 1.0f;
            if (f > brg.a) {
                f2 = 1.0f / ((cjt.a(cleVar.a()) + f) / cjt.a(cleVar.a()));
            }
            cleVar.y(f2);
            cleVar.C(cmh.a(0.5f, brg.a));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$15, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass15 extends arrp implements arqr<cle, arnb> {
        final /* synthetic */ bpq a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(bpq bpqVar) {
            super(1);
            this.a = bpqVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            float f2;
            cle cleVar = (cle) obj;
            float c = this.a.d.c();
            float b = this.a.d.f().b();
            if (c < b) {
                f = b - c;
            } else {
                f = 0.0f;
            }
            if (f > brg.a) {
                f2 = (cjt.a(cleVar.a()) + f) / cjt.a(cleVar.a());
            } else {
                f2 = 1.0f;
            }
            cleVar.y(f2);
            cleVar.C(cmh.a(0.5f, brg.a));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bkm a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ boolean d;
        final /* synthetic */ cmb e;
        final /* synthetic */ long f;
        final /* synthetic */ long g;
        final /* synthetic */ float h;
        final /* synthetic */ float i;
        final /* synthetic */ arqv j;
        final /* synthetic */ arqw k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bkm bkmVar, float f, float f2, boolean z, cmb cmbVar, long j, long j2, float f3, float f4, arqv arqvVar, arqw arqwVar) {
            super(2);
            this.a = bkmVar;
            this.b = f;
            this.c = f2;
            this.d = z;
            this.e = cmbVar;
            this.f = j;
            this.g = j2;
            this.h = f3;
            this.i = f4;
            this.j = arqvVar;
            this.k = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bkm bkmVar = this.a;
                bjx.d(bkmVar.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, bwjVar, 0, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;
        final /* synthetic */ bkm b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqw arqwVar, bkm bkmVar) {
            super(2);
            this.a = arqwVar;
            this.b = bkmVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                this.a.a(this.b.b, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqg<Float> {
        final /* synthetic */ bkm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bkm bkmVar) {
            super(0);
            this.a = bkmVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(this.a.a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;
        final /* synthetic */ cga b;
        final /* synthetic */ bkm c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;
        final /* synthetic */ cmb f;
        final /* synthetic */ long g;
        final /* synthetic */ long h;
        final /* synthetic */ float i;
        final /* synthetic */ float j;
        final /* synthetic */ arqv k;
        final /* synthetic */ boolean l;
        final /* synthetic */ arqv m;
        final /* synthetic */ arqw n;
        final /* synthetic */ long o;
        final /* synthetic */ long p;
        final /* synthetic */ arqw q;
        final /* synthetic */ int r;
        final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arqw arqwVar, cga cgaVar, bkm bkmVar, float f, float f2, cmb cmbVar, long j, long j2, float f3, float f4, arqv arqvVar, boolean z, arqv arqvVar2, arqw arqwVar2, long j3, long j4, arqw arqwVar3, int i, int i2) {
            super(2);
            this.a = arqwVar;
            this.b = cgaVar;
            this.c = bkmVar;
            this.d = f;
            this.e = f2;
            this.f = cmbVar;
            this.g = j;
            this.h = j2;
            this.i = f3;
            this.j = f4;
            this.k = arqvVar;
            this.l = z;
            this.m = arqvVar2;
            this.n = arqwVar2;
            this.o = j3;
            this.p = j4;
            this.q = arqwVar3;
            this.r = i;
            this.s = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.r;
            int i2 = this.s;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            bjx.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ arqv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(cga cgaVar, long j, long j2, arqv arqvVar) {
            super(2);
            this.a = cgaVar;
            this.b = j;
            this.c = j2;
            this.d = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bqv.c(this.a, null, this.b, this.c, brg.a, brg.a, null, this.d, bwjVar, 114);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ arqv b;
        final /* synthetic */ arqv c;
        final /* synthetic */ arqv d;
        final /* synthetic */ arqv e;
        final /* synthetic */ arqg f;
        final /* synthetic */ bpq g;
        final /* synthetic */ long h;
        final /* synthetic */ long i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(cga cgaVar, arqv arqvVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, arqg arqgVar, bpq bpqVar, long j, long j2, int i) {
            super(2);
            this.a = cgaVar;
            this.b = arqvVar;
            this.c = arqvVar2;
            this.d = arqvVar3;
            this.e = arqvVar4;
            this.f = arqgVar;
            this.g = bpqVar;
            this.h = j;
            this.i = j2;
            this.j = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            cga cgaVar = this.a;
            arqv arqvVar = this.b;
            arqv arqvVar2 = this.c;
            arqv arqvVar3 = this.d;
            arqv arqvVar4 = this.e;
            arqg arqgVar = this.f;
            bpq bpqVar = this.g;
            long j = this.h;
            bjx.c(cgaVar, arqvVar, arqvVar2, arqvVar3, arqvVar4, arqgVar, bpqVar, j, this.i, (bwj) obj, bzh.a(this.j | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjx$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqg<arnb> {
        final /* synthetic */ bpq a;
        final /* synthetic */ aap b;
        final /* synthetic */ aap c;
        final /* synthetic */ aap d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(bpq bpqVar, aap aapVar, aap aapVar2, aap aapVar3) {
            super(0);
            this.a = bpqVar;
            this.b = aapVar;
            this.c = aapVar2;
            this.d = aapVar3;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bpq bpqVar = this.a;
            bpqVar.e = this.b;
            bpqVar.f = this.c;
            bpqVar.c = this.d;
            return arnb.a;
        }
    }

    public static final cga a(cga cgaVar, bpq bpqVar) {
        return cld.a(cgaVar, new AnonymousClass14(bpqVar));
    }

    public static final cga b(cga cgaVar, bpq bpqVar) {
        return cld.a(cgaVar, new AnonymousClass15(bpqVar));
    }

    public static final void c(cga cgaVar, arqv arqvVar, arqv arqvVar2, arqv arqvVar3, arqv arqvVar4, final arqg arqgVar, final bpq bpqVar, long j, long j2, bwj bwjVar, int i) {
        int i2;
        arqv arqvVar5;
        boolean z;
        boolean z2;
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
        bwj c = bwjVar.c(-1651214892);
        if (i12 == 0) {
            if (true != c.G(cgaVar)) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i10 = 16;
            } else {
                i10 = 32;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (true != c.I(arqvVar2)) {
                i9 = 128;
            } else {
                i9 = 256;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (true != c.I(arqvVar3)) {
                i8 = 1024;
            } else {
                i8 = 2048;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (true != c.I(arqvVar4)) {
                i7 = 8192;
            } else {
                i7 = 16384;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (true != c.I(arqgVar)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (true != c.G(bpqVar)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (true != c.F(j)) {
                i4 = 4194304;
            } else {
                i4 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (true != c.F(j2)) {
                i3 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i3 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) == 38347922 && c.L()) {
            c.v();
        } else {
            arqv[] arqvVarArr = new arqv[4];
            if (arqvVar == null) {
                arqvVar5 = blk.a;
            } else {
                arqvVar5 = arqvVar;
            }
            arqvVarArr[0] = arqvVar5;
            arqvVarArr[1] = cdk.e(398963586, new AnonymousClass6(cgaVar, j, j2, arqvVar2), c);
            arqvVarArr[2] = arqvVar3;
            arqvVarArr[3] = arqvVar4;
            List B = aqjn.B(arqvVarArr);
            if ((3670016 & i2) == 1048576) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if ((z | z2) || T == bwj.a.a) {
                T = new cun() { // from class: bjx.7

                    /* compiled from: PG */
                    /* renamed from: bjx$7$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
                        final /* synthetic */ List a;
                        final /* synthetic */ int b;
                        final /* synthetic */ List c;
                        final /* synthetic */ bpq d;
                        final /* synthetic */ arqg e;
                        final /* synthetic */ int f;
                        final /* synthetic */ List g;
                        final /* synthetic */ List h;
                        final /* synthetic */ int i;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(List list, int i, List list2, bpq bpqVar, arqg arqgVar, int i2, List list3, List list4, int i3) {
                            super(1);
                            this.a = list;
                            this.b = i;
                            this.c = list2;
                            this.d = bpqVar;
                            this.e = arqgVar;
                            this.f = i2;
                            this.g = list3;
                            this.h = list4;
                            this.i = i3;
                        }

                        @Override // defpackage.arqr
                        public final /* bridge */ /* synthetic */ Object a(Object obj) {
                            Integer valueOf;
                            int i;
                            Integer valueOf2;
                            int i2;
                            int i3;
                            int i4;
                            List list = this.a;
                            cvc.a aVar = (cvc.a) obj;
                            Integer num = null;
                            if (list.isEmpty()) {
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(((cvc) list.get(0)).a);
                                int z = aqjn.z(list);
                                if (z > 0) {
                                    int i5 = 1;
                                    while (true) {
                                        Integer valueOf3 = Integer.valueOf(((cvc) list.get(i5)).a);
                                        if (valueOf3.compareTo(valueOf) > 0) {
                                            valueOf = valueOf3;
                                        }
                                        if (i5 == z) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            }
                            if (valueOf != null) {
                                i = valueOf.intValue();
                            } else {
                                i = 0;
                            }
                            int max = Math.max(0, (this.b - i) / 2);
                            List list2 = this.c;
                            if (list2.isEmpty()) {
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(((cvc) list2.get(0)).a);
                                int z2 = aqjn.z(list2);
                                if (z2 > 0) {
                                    int i6 = 1;
                                    while (true) {
                                        Integer valueOf4 = Integer.valueOf(((cvc) list2.get(i6)).a);
                                        if (valueOf4.compareTo(valueOf2) > 0) {
                                            valueOf2 = valueOf4;
                                        }
                                        if (i6 == z2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                            if (valueOf2 != null) {
                                i2 = valueOf2.intValue();
                            } else {
                                i2 = 0;
                            }
                            List list3 = this.c;
                            if (!list3.isEmpty()) {
                                num = Integer.valueOf(((cvc) list3.get(0)).b);
                                int z3 = aqjn.z(list3);
                                if (z3 > 0) {
                                    int i7 = 1;
                                    while (true) {
                                        Integer valueOf5 = Integer.valueOf(((cvc) list3.get(i7)).b);
                                        if (valueOf5.compareTo(num) > 0) {
                                            num = valueOf5;
                                        }
                                        if (i7 == z3) {
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                            }
                            if (num != null) {
                                i3 = num.intValue();
                            } else {
                                i3 = 0;
                            }
                            int i8 = (this.b - i2) / 2;
                            bps c = this.d.c();
                            bps bpsVar = bps.a;
                            int ordinal = c.ordinal();
                            if (ordinal != 0 && ordinal != 1) {
                                if (ordinal == 2) {
                                    i4 = arsk.g(((Number) this.e.a()).floatValue());
                                } else {
                                    throw new armm();
                                }
                            } else {
                                i4 = this.f;
                            }
                            int i9 = i4 - i3;
                            List list4 = this.g;
                            int i10 = this.i;
                            int size = list4.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                cvc.a.m(aVar, (cvc) list4.get(i11), 0, i10);
                            }
                            List list5 = this.h;
                            int size2 = list5.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                cvc.a.m(aVar, (cvc) list5.get(i12), 0, 0);
                            }
                            List list6 = this.a;
                            int size3 = list6.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                cvc.a.m(aVar, (cvc) list6.get(i13), max, 0);
                            }
                            List list7 = this.c;
                            int size4 = list7.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                cvc.a.m(aVar, (cvc) list7.get(i14), i8, i9);
                            }
                            return arnb.a;
                        }
                    }

                    @Override // defpackage.cun
                    public final /* synthetic */ int a(ctd ctdVar, List list, int i13) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            List list2 = (List) list.get(i14);
                            ArrayList arrayList2 = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                arrayList2.add(new csx((ctc) list2.get(i15), cte.b, ctf.b));
                            }
                            arrayList.add(arrayList2);
                        }
                        return e(new ctg(ctdVar, ctdVar.q()), arrayList, dqt.l(i13, 0, 13)).j();
                    }

                    @Override // defpackage.cun
                    public final /* synthetic */ int b(ctd ctdVar, List list, int i13) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            List list2 = (List) list.get(i14);
                            ArrayList arrayList2 = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                arrayList2.add(new csx((ctc) list2.get(i15), cte.b, ctf.a));
                            }
                            arrayList.add(arrayList2);
                        }
                        return e(new ctg(ctdVar, ctdVar.q()), arrayList, dqt.l(0, i13, 7)).k();
                    }

                    @Override // defpackage.cun
                    public final /* synthetic */ int c(ctd ctdVar, List list, int i13) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            List list2 = (List) list.get(i14);
                            ArrayList arrayList2 = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                arrayList2.add(new csx((ctc) list2.get(i15), cte.a, ctf.b));
                            }
                            arrayList.add(arrayList2);
                        }
                        return e(new ctg(ctdVar, ctdVar.q()), arrayList, dqt.l(i13, 0, 13)).j();
                    }

                    @Override // defpackage.cun
                    public final /* synthetic */ int d(ctd ctdVar, List list, int i13) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            List list2 = (List) list.get(i14);
                            ArrayList arrayList2 = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                arrayList2.add(new csx((ctc) list2.get(i15), cte.a, ctf.a));
                            }
                            arrayList.add(arrayList2);
                        }
                        return e(new ctg(ctdVar, ctdVar.q()), arrayList, dqt.l(0, i13, 7)).k();
                    }

                    @Override // defpackage.cun
                    public final cuf e(cuh cuhVar, List list, long j3) {
                        Integer valueOf;
                        int i13;
                        cuf et;
                        List list2 = (List) list.get(0);
                        int i14 = 1;
                        List list3 = (List) list.get(1);
                        List list4 = (List) list.get(2);
                        List list5 = (List) list.get(3);
                        long k = dqs.k(j3, 0, 0, 0, 0, 10);
                        ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            arrayList.add(((cuc) list4.get(i15)).e(k));
                        }
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            arrayList2.add(((cuc) list2.get(i16)).e(k));
                        }
                        if (arrayList2.isEmpty()) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(((cvc) arrayList2.get(0)).b);
                            int z3 = aqjn.z(arrayList2);
                            if (z3 > 0) {
                                while (true) {
                                    Integer valueOf2 = Integer.valueOf(((cvc) arrayList2.get(i14)).b);
                                    if (valueOf2.compareTo(valueOf) > 0) {
                                        valueOf = valueOf2;
                                    }
                                    if (i14 == z3) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                        if (valueOf != null) {
                            i13 = valueOf.intValue();
                        } else {
                            i13 = 0;
                        }
                        int a = dqs.a(j3);
                        long k2 = dqs.k(k, 0, 0, 0, a - i13, 7);
                        ArrayList arrayList3 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            arrayList3.add(((cuc) list3.get(i17)).e(k2));
                        }
                        ArrayList arrayList4 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i18 = 0; i18 < size4; i18++) {
                            arrayList4.add(((cuc) list5.get(i18)).e(k));
                        }
                        int b = dqs.b(j3);
                        et = cuhVar.et(b, a, arnw.a, new AnonymousClass1(arrayList, b, arrayList4, bpq.this, arqgVar, a, arrayList3, arrayList2, i13));
                        return et;
                    }
                };
                bwkVar.ad(T);
            }
            cun cunVar = (cun) T;
            cga.a aVar = cga.e;
            arqv a = cto.a(B);
            boolean G = c.G(cunVar);
            Object T2 = bwkVar.T();
            if (G || T2 == bwj.a.a) {
                T2 = new cuo(cunVar);
                bwkVar.ad(T2);
            }
            cue cueVar = (cue) T2;
            int a2 = bwg.a(c);
            byx P = bwkVar.P();
            cga b = cfv.b(c, aVar);
            int i13 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
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
            ((bzf) e).d = new AnonymousClass8(cgaVar, arqvVar, arqvVar2, arqvVar3, arqvVar4, arqgVar, bpqVar, j, j2, i);
        }
    }

    public static final void d(bpq bpqVar, float f, float f2, boolean z, cmb cmbVar, long j, long j2, float f3, float f4, arqv arqvVar, arqw arqwVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        cga cgaVar;
        cga c;
        cga a;
        int i5 = i & 6;
        bwj c2 = bwjVar.c(721467526);
        if (i5 == 0) {
            i3 = (true != c2.G(bpqVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != c2.D(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != c2.D(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != c2.H(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != c2.G(cmbVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != c2.F(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != c2.F(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != c2.D(f3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != c2.D(f4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != c2.I(arqvVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != c2.I(arqwVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && c2.L()) {
            c2.v();
        } else {
            aap a2 = bnu.a(buz.a, c2);
            aap a3 = bnu.a(buz.a, c2);
            aap a4 = bnu.a(buz.e, c2);
            boolean z2 = (i3 & 14) == 4;
            boolean I = c2.I(a3) | z2 | c2.I(a4) | c2.I(a2);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (I || T == bwj.a.a) {
                T = new AnonymousClass9(bpqVar, a3, a4, a2);
                bwkVar.ad(T);
            }
            bxl.h((arqg) T, c2);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = bxl.a(arpj.a, c2);
                bwkVar.ad(T2);
            }
            arwe arweVar = (arwe) T2;
            ahp ahpVar = ahp.a;
            float em = ((dqv) c2.g(dch.d)).em(f);
            c2.y(-1831582108);
            if (z) {
                cga.a aVar = cga.e;
                boolean G = c2.G(bpqVar.d);
                Object T3 = bwkVar.T();
                if (G || T3 == bwj.a.a) {
                    T3 = new bpm(bpqVar, new AnonymousClass13(arweVar, bpqVar), ahpVar);
                    bwkVar.ad(T3);
                }
                cgaVar = cqb.a(aVar, (cpz) T3, null);
            } else {
                cgaVar = cga.e;
            }
            bwkVar.Y();
            c = amv.c(amv.t(cga.e, brg.a, f2, 1), 1.0f);
            cga a5 = amv.r(c, f, brg.a, 2).a(cgaVar);
            bsr bsrVar = bpqVar.d;
            boolean D = z2 | c2.D(em);
            Object T4 = bwkVar.T();
            if (D || T4 == bwj.a.a) {
                T4 = new AnonymousClass10(bpqVar, em);
                bwkVar.ad(T4);
            }
            a = ahh.a(bsq.b(a5, bsrVar, ahpVar, (arqv) T4), r2.d, ahpVar, z, null, r2.q(), new bsp(bpqVar.d, null), false, 32);
            bqv.c(b(a, bpqVar), cmbVar, j, j2, f3, f4, null, cdk.e(390720907, new AnonymousClass11(bpqVar, arqvVar, arweVar, z, arqwVar), c2), c2, 64);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass12(bpqVar, f, f2, z, cmbVar, j, j2, f3, f4, arqvVar, arqwVar, i, i2);
        }
    }

    public static final void e(arqw arqwVar, cga cgaVar, bkm bkmVar, float f, float f2, cmb cmbVar, long j, long j2, float f3, float f4, arqv arqvVar, boolean z, arqv arqvVar2, arqw arqwVar2, long j3, long j4, arqw arqwVar3, bwj bwjVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        float f5;
        bwj bwjVar2;
        float f6;
        int i5 = i & 6;
        bwj c = bwjVar.c(-1523924135);
        if (i5 == 0) {
            i3 = (true != c.I(arqwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != c.G(cgaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != c.G(bkmVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != c.D(f) ? 1024 : 2048;
        }
        int i6 = i3 | 24576;
        if ((i & 196608) == 0) {
            i6 |= true != c.G(cmbVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            z2 = true;
            i6 |= true != c.F(j) ? 524288 : 1048576;
        } else {
            z2 = true;
        }
        if ((12582912 & i) == 0) {
            i6 |= z2 != c.F(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i6 |= true != c.D(f3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i6 |= true != c.D(f4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i7 = i6;
        if ((i2 & 6) == 0) {
            z3 = true;
            i4 = i2 | (true != c.I(arqvVar) ? 2 : 4);
        } else {
            z3 = true;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= z3 != c.H(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= z3 == c.I(arqvVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= z3 != c.I(arqwVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= z3 != c.F(j3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= z3 == c.F(j4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= z3 == c.I(arqwVar3) ? 1048576 : 524288;
        }
        int i8 = i4;
        if ((306783379 & i7) == 306783378 && (i8 & 599187) == 599186 && c.L()) {
            c.v();
            f6 = f2;
            bwjVar2 = c;
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                f5 = f2;
            } else {
                float f7 = bjw.a;
                f5 = bjw.a;
            }
            c.n();
            bpq bpqVar = bkmVar.a;
            cdi e = cdk.e(-459880832, new AnonymousClass1(arqwVar3, f), c);
            bwjVar2 = c;
            cdi e2 = cdk.e(1961872927, new AnonymousClass2(bkmVar, f, f5, z, cmbVar, j, j2, f3, f4, arqvVar, arqwVar), bwjVar2);
            cdi e3 = cdk.e(88659390, new AnonymousClass3(arqwVar2, bkmVar), bwjVar2);
            boolean z4 = (((i7 & 896) ^ 384) > 256 && bwjVar2.G(bkmVar)) || (i7 & 384) == 256;
            bwk bwkVar = (bwk) bwjVar2;
            Object T = bwkVar.T();
            if (z4 || T == bwj.a.a) {
                T = new AnonymousClass4(bkmVar);
                bwkVar.ad(T);
            }
            int i9 = i8 << 9;
            c(cgaVar, arqvVar2, e, e2, e3, (arqg) T, bpqVar, j3, j4, bwjVar2, ((i7 >> 3) & 14) | 28032 | ((i8 >> 3) & 112) | (29360128 & i9) | (234881024 & i9));
            f6 = f5;
        }
        bzz e4 = bwjVar2.e();
        if (e4 != null) {
            ((bzf) e4).d = new AnonymousClass5(arqwVar, cgaVar, bkmVar, f, f6, cmbVar, j, j2, f3, f4, arqvVar, z, arqvVar2, arqwVar2, j3, j4, arqwVar3, i, i2);
        }
    }
}
