package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.abt;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cle, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ abd b;
        final /* synthetic */ byn c;
        final /* synthetic */ cas d;
        final /* synthetic */ cas e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, abd abdVar, byn bynVar, cas casVar, cas casVar2) {
            super(1);
            this.a = z;
            this.b = abdVar;
            this.c = bynVar;
            this.d = casVar;
            this.e = casVar2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            cle cleVar = (cle) obj;
            float f2 = 0.8f;
            float f3 = 1.0f;
            if (!this.a) {
                f = ((Number) this.d.a()).floatValue();
            } else if (((Boolean) this.b.b()).booleanValue()) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            cleVar.x(f);
            if (!this.a) {
                f2 = ((Number) this.d.a()).floatValue();
            } else if (((Boolean) this.b.b()).booleanValue()) {
                f2 = 1.0f;
            }
            cleVar.y(f2);
            if (!this.a) {
                f3 = ((Number) this.e.a()).floatValue();
            } else if (!((Boolean) this.b.b()).booleanValue()) {
                f3 = brg.a;
            }
            cleVar.o(f3);
            cleVar.C(((cmg) this.c.a()).b);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmt$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ afv b;
        final /* synthetic */ arqw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, afv afvVar, arqw arqwVar) {
            super(2);
            this.a = cgaVar;
            this.b = afvVar;
            this.c = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga c = afs.c(alw.b(amh.i(this.a, brg.a, 8.0f, 1), alx.b), this.b, false, 14);
                arqw arqwVar = this.c;
                ajw.e eVar = ajw.c;
                int i = cfq.a;
                cue a = akk.a(eVar, cfq.a.m, bwjVar, 0);
                int a2 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, c);
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
                arqv arqvVar = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar);
                }
                caw.b(bwjVar, b, cwl.a.c);
                arqwVar.a(ako.a, bwjVar, 6);
                bwjVar.p();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmt$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ abd b;
        final /* synthetic */ byn c;
        final /* synthetic */ afv d;
        final /* synthetic */ cmb e;
        final /* synthetic */ long f;
        final /* synthetic */ float g;
        final /* synthetic */ arqw h;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cga cgaVar, abd abdVar, byn bynVar, afv afvVar, cmb cmbVar, long j, float f, arqw arqwVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = abdVar;
            this.c = bynVar;
            this.d = afvVar;
            this.e = cmbVar;
            this.f = j;
            this.g = f;
            this.h = arqwVar;
            this.i = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bmt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (bwj) obj, bzh.a(this.i | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmt$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqw<abt.b<Boolean>, bwj, Integer, aap<Float>> {
        final /* synthetic */ aap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(aap aapVar) {
            super(3);
            this.a = aapVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(-1355418157);
            bwjVar.q();
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmt$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqw<abt.b<Boolean>, bwj, Integer, aap<Float>> {
        final /* synthetic */ aap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(aap aapVar) {
            super(3);
            this.a = aapVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(1033023423);
            bwjVar.q();
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmt$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bms a;
        final /* synthetic */ boolean b;
        final /* synthetic */ amt c;
        final /* synthetic */ arqv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(bms bmsVar, boolean z, amt amtVar, arqv arqvVar) {
            super(2);
            this.a = bmsVar;
            this.b = z;
            this.c = amtVar;
            this.d = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            long j;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bwjVar.y(1264666520);
                bwjVar.q();
                bms bmsVar = this.a;
                boolean z = this.b;
                bzc bzcVar = blp.a;
                if (z) {
                    j = bmsVar.a;
                } else {
                    j = bmsVar.d;
                }
                bwx.a(bzcVar.c(new cku(j)), cdk.e(-1728894036, new bmu(this.c, this.d), bwjVar), bwjVar, 56);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bmt$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqv a;
        final /* synthetic */ arqg b;
        final /* synthetic */ cga c;
        final /* synthetic */ boolean d;
        final /* synthetic */ bms e;
        final /* synthetic */ amj f;
        final /* synthetic */ ajr g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(arqv arqvVar, arqg arqgVar, cga cgaVar, boolean z, bms bmsVar, amj amjVar, ajr ajrVar, int i) {
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
            bmt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aap, java.lang.Object] */
    public static final void a(cga cgaVar, abd abdVar, byn bynVar, afv afvVar, cmb cmbVar, long j, float f, arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        float f2;
        float f3;
        boolean z;
        bwj bwjVar2;
        bwj bwjVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean I;
        int i11;
        int i12;
        int i13 = i & 6;
        bwj c = bwjVar.c(-151448888);
        if (i13 == 0) {
            if (true != c.G(cgaVar)) {
                i12 = 2;
            } else {
                i12 = 4;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                I = c.G(abdVar);
            } else {
                I = c.I(abdVar);
            }
            if (true != I) {
                i11 = 16;
            } else {
                i11 = 32;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (true != c.G(bynVar)) {
                i10 = 128;
            } else {
                i10 = 256;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (true != c.G(afvVar)) {
                i9 = 1024;
            } else {
                i9 = 2048;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (true != c.G(cmbVar)) {
                i8 = 8192;
            } else {
                i8 = 16384;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (true != c.F(j)) {
                i7 = 65536;
            } else {
                i7 = 131072;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (true != c.D(brg.a)) {
                i6 = 524288;
            } else {
                i6 = 1048576;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (true != c.D(f)) {
                i5 = 4194304;
            } else {
                i5 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (true != c.G(null)) {
                i4 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i4 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i2 |= i4;
        }
        if ((805306368 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i3 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
            } else {
                i3 = 536870912;
            }
            i2 |= i3;
        }
        if ((306783379 & i2) == 306783378 && c.L()) {
            c.v();
            bwjVar3 = c;
        } else {
            abt c2 = aby.c(abdVar, "DropDownMenu", c, ((i2 >> 3) & 14) | 48, 0);
            aap a = bnu.a(buz.b, c);
            aap a2 = bnu.a(buz.e, c);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(a);
            acg acgVar = aci.a;
            boolean booleanValue = ((Boolean) c2.e()).booleanValue();
            c.y(2139028452);
            float f4 = 0.8f;
            float f5 = 1.0f;
            if (true != booleanValue) {
                f2 = 0.8f;
            } else {
                f2 = 1.0f;
            }
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            Float valueOf = Float.valueOf(f2);
            boolean booleanValue2 = ((Boolean) c2.f()).booleanValue();
            c.y(2139028452);
            if (true == booleanValue2) {
                f4 = 1.0f;
            }
            bwkVar.Y();
            cas e = aby.e(c2, valueOf, Float.valueOf(f4), anonymousClass5.a(c2.d(), c, 0), acgVar, c, 0);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(a2);
            acg acgVar2 = aci.a;
            boolean booleanValue3 = ((Boolean) c2.e()).booleanValue();
            c.y(-249413128);
            if (true != booleanValue3) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            bwkVar.Y();
            Float valueOf2 = Float.valueOf(f3);
            boolean booleanValue4 = ((Boolean) c2.f()).booleanValue();
            c.y(-249413128);
            if (true != booleanValue4) {
                f5 = 0.0f;
            }
            bwkVar.Y();
            Float valueOf3 = Float.valueOf(f5);
            ?? a3 = anonymousClass4.a(c2.d(), c, 0);
            boolean z2 = true;
            cas e2 = aby.e(c2, valueOf2, valueOf3, a3, acgVar2, c, 0);
            boolean booleanValue5 = ((Boolean) c.g(dda.a)).booleanValue();
            cga.a aVar = cga.e;
            boolean H = c.H(booleanValue5) | c.G(e);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !c.I(abdVar))) {
                z = false;
            } else {
                z = true;
            }
            boolean G = H | z | c.G(e2);
            if ((i2 & 896) != 256) {
                z2 = false;
            }
            Object T = bwkVar.T();
            if (!(z2 | G) && T != bwj.a.a) {
                bwjVar2 = c;
            } else {
                bwjVar2 = c;
                T = new AnonymousClass1(booleanValue5, abdVar, bynVar, e, e2);
                bwkVar.ad(T);
            }
            bwjVar3 = bwjVar2;
            bqv.c(cld.a(aVar, (arqr) T), cmbVar, j, 0L, brg.a, f, null, cdk.e(1573559053, new AnonymousClass2(cgaVar, afvVar, arqwVar), bwjVar2), bwjVar3, 8);
        }
        bzz e3 = bwjVar3.e();
        if (e3 != null) {
            ((bzf) e3).d = new AnonymousClass3(cgaVar, abdVar, bynVar, afvVar, cmbVar, j, f, arqwVar, i);
        }
    }

    public static final void b(arqv arqvVar, arqg arqgVar, cga cgaVar, boolean z, bms bmsVar, amj amjVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        cga c;
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
        bwj c2 = bwjVar.c(-1564716777);
        if (i12 == 0) {
            if (true != c2.I(arqvVar)) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.I(arqgVar)) {
                i10 = 16;
            } else {
                i10 = 32;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (true != c2.G(cgaVar)) {
                i9 = 128;
            } else {
                i9 = 256;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (true != c2.I(null)) {
                i8 = 1024;
            } else {
                i8 = 2048;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (true != c2.I(null)) {
                i7 = 8192;
            } else {
                i7 = 16384;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (true != c2.H(z)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (true != c2.G(bmsVar)) {
                i5 = 524288;
            } else {
                i5 = 1048576;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (true != c2.G(amjVar)) {
                i4 = 4194304;
            } else {
                i4 = VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (true != c2.G(ajrVar)) {
                i3 = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            } else {
                i3 = VCardConfig.FLAG_APPEND_TYPE_PARAM;
            }
            i2 |= i3;
        }
        if ((i2 & 38347923) != 38347922 || !c2.L()) {
            c = amv.c(adw.b(cgaVar, ajrVar, bon.a(true, brg.a, 0L, 6), z, null, null, arqgVar, 24), 1.0f);
            cga c3 = amh.c(amv.s(c, 112.0f, 48.0f, 280.0f, brg.a, 8), amjVar);
            int i13 = cfq.a;
            cue a = amq.a(ajw.a, cfq.a.k, c2, 48);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, c3);
            int i14 = cwl.a;
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar2);
            }
            caw.b(c2, b, cwl.a.c);
            brx.a(bmp.d(c2).m, cdk.e(1065051884, new AnonymousClass6(bmsVar, z, amu.a, arqvVar), c2), c2, 48);
            c2.p();
        } else {
            c2.v();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass7(arqvVar, arqgVar, cgaVar, z, bmsVar, amjVar, ajrVar, i);
        }
    }
}
