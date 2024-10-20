package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bwj;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brm {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int a;
        final /* synthetic */ cga b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ float e;
        final /* synthetic */ arqw f;
        final /* synthetic */ arqv g;
        final /* synthetic */ arqv h;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, cga cgaVar, long j, long j2, float f, arqw arqwVar, arqv arqvVar, arqv arqvVar2, int i2) {
            super(2);
            this.a = i;
            this.b = cgaVar;
            this.c = j;
            this.d = j2;
            this.e = f;
            this.f = arqwVar;
            this.g = arqvVar;
            this.h = arqvVar2;
            this.i = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            brm.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (bwj) obj, bzh.a(this.i | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brm$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ afv a;
        final /* synthetic */ float b;
        final /* synthetic */ arqv c;
        final /* synthetic */ arqv d;
        final /* synthetic */ arqw e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(afv afvVar, float f, arqv arqvVar, arqv arqvVar2, arqw arqwVar, int i) {
            super(2);
            this.a = afvVar;
            this.b = f;
            this.c = arqvVar;
            this.d = arqvVar2;
            this.e = arqwVar;
            this.f = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga c;
            cga d;
            cga c2;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                Object h = bwjVar.h();
                if (h == bwj.a.a) {
                    h = bxl.a(arpj.a, bwjVar);
                    bwjVar.B(h);
                }
                arwe arweVar = (arwe) h;
                aap a = bnu.a(buz.a, bwjVar);
                boolean G = bwjVar.G(this.a) | bwjVar.G(arweVar);
                afv afvVar = this.a;
                Object h2 = bwjVar.h();
                if (G || h2 == bwj.a.a) {
                    h2 = new bpd(afvVar, arweVar, a);
                    bwjVar.B(h2);
                }
                bpd bpdVar = (bpd) h2;
                c = amv.c(cga.e, 1.0f);
                int i = cfq.a;
                d = afs.d(amv.v(c, cfq.a.d, 2), this.a, false, true, false);
                c2 = dhb.c(d, false, avr.a);
                cga b = chk.b(c2);
                boolean D = bwjVar.D(this.b) | bwjVar.G(this.c) | bwjVar.G(this.d) | bwjVar.G(this.e) | bwjVar.I(bpdVar) | bwjVar.E(this.f);
                float f = this.b;
                arqv arqvVar = this.c;
                arqv arqvVar2 = this.d;
                int i2 = this.f;
                arqw arqwVar = this.e;
                Object h3 = bwjVar.h();
                if (D || h3 == bwj.a.a) {
                    h3 = new brp(f, arqvVar, arqvVar2, bpdVar, i2, arqwVar);
                    bwjVar.B(h3);
                }
                cvl.a(b, (arqv) h3, bwjVar, 0, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brm$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int a;
        final /* synthetic */ arqw b;
        final /* synthetic */ cga c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;
        final /* synthetic */ float f;
        final /* synthetic */ arqv g;
        final /* synthetic */ arqv h;
        final /* synthetic */ afv i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, arqw arqwVar, cga cgaVar, long j, long j2, float f, arqv arqvVar, arqv arqvVar2, afv afvVar, int i2) {
            super(2);
            this.a = i;
            this.b = arqwVar;
            this.c = cgaVar;
            this.d = j;
            this.e = j2;
            this.f = f;
            this.g = arqvVar;
            this.h = arqvVar2;
            this.i = afvVar;
            this.j = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            brm.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (bwj) obj, bzh.a(this.j | 1));
            return arnb.a;
        }
    }

    public static final void a(int i, cga cgaVar, long j, long j2, float f, arqw arqwVar, arqv arqvVar, arqv arqvVar2, bwj bwjVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i2 & 6;
        bwj c = bwjVar.c(-497821003);
        if (i12 == 0) {
            if (true != c.E(i)) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i10 = 16;
            } else {
                i10 = 32;
            }
            i3 |= i10;
        }
        if ((i2 & 384) == 0) {
            if (true != c.F(j)) {
                i9 = 128;
            } else {
                i9 = 256;
            }
            i3 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (true != c.F(j2)) {
                i8 = 1024;
            } else {
                i8 = 2048;
            }
            i3 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (true != c.D(f)) {
                i7 = 8192;
            } else {
                i7 = 16384;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (true != c.I(arqwVar)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            if (true != c.I(arqvVar)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            i3 |= i5;
        }
        if ((12582912 & i2) == 0) {
            if (true != c.I(arqvVar2)) {
                i4 = 4194304;
            } else {
                i4 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i3 |= i4;
        }
        if ((4793491 & i3) == 4793490 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i2 & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            int i13 = i3 << 3;
            int i14 = i3 & 3670016;
            b(i, arqwVar, cgaVar, j, j2, f, arqvVar, arqvVar2, afs.b(c, 0), c, (i3 & 14) | ((i3 >> 12) & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | i14 | (i3 & 29360128));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(i, cgaVar, j, j2, f, arqwVar, arqvVar, arqvVar2, i2);
        }
    }

    public static final void b(int i, arqw arqwVar, cga cgaVar, long j, long j2, float f, arqv arqvVar, arqv arqvVar2, afv afvVar, bwj bwjVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i2 & 6;
        bwj c = bwjVar.c(-955409947);
        if (i13 == 0) {
            if (true != c.E(i)) {
                i12 = 2;
            } else {
                i12 = 4;
            }
            i3 = i12 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.I(arqwVar)) {
                i11 = 16;
            } else {
                i11 = 32;
            }
            i3 |= i11;
        }
        if ((i2 & 384) == 0) {
            if (true != c.G(cgaVar)) {
                i10 = 128;
            } else {
                i10 = 256;
            }
            i3 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if (true != c.F(j)) {
                i9 = 1024;
            } else {
                i9 = 2048;
            }
            i3 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (true != c.F(j2)) {
                i8 = 8192;
            } else {
                i8 = 16384;
            }
            i3 |= i8;
        }
        if ((196608 & i2) == 0) {
            if (true != c.D(f)) {
                i7 = 65536;
            } else {
                i7 = 131072;
            }
            i3 |= i7;
        }
        if ((1572864 & i2) == 0) {
            if (true != c.I(arqvVar)) {
                i6 = 524288;
            } else {
                i6 = 1048576;
            }
            i3 |= i6;
        }
        if ((12582912 & i2) == 0) {
            if (true != c.I(arqvVar2)) {
                i5 = 4194304;
            } else {
                i5 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i3 |= i5;
        }
        if ((100663296 & i2) == 0) {
            if (true != c.G(afvVar)) {
                i4 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i4 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i3 |= i4;
        }
        if ((i3 & 38347923) == 38347922 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i2 & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            bqv.c(cgaVar, null, j, j2, brg.a, brg.a, null, cdk.e(-1572959552, new AnonymousClass2(afvVar, f, arqvVar2, arqvVar, arqwVar, i), c), c, 114);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(i, arqwVar, cgaVar, j, j2, f, arqvVar, arqvVar2, afvVar, i2);
        }
    }
}
