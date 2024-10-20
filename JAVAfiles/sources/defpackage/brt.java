package defpackage;

import com.android.vcard.VCardConfig;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ arqv b;
        final /* synthetic */ arqv c;
        final /* synthetic */ arqw d;
        final /* synthetic */ arqv e;
        final /* synthetic */ boolean f;
        final /* synthetic */ bru g;
        final /* synthetic */ float h;
        final /* synthetic */ arqv i;
        final /* synthetic */ arqv j;
        final /* synthetic */ amj k;
        final /* synthetic */ int l;
        final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, arqv arqvVar, arqv arqvVar2, arqw arqwVar, arqv arqvVar3, boolean z, bru bruVar, float f, arqv arqvVar4, arqv arqvVar5, amj amjVar, int i, int i2) {
            super(2);
            this.a = cgaVar;
            this.b = arqvVar;
            this.c = arqvVar2;
            this.d = arqwVar;
            this.e = arqvVar3;
            this.f = z;
            this.g = bruVar;
            this.h = f;
            this.i = arqvVar4;
            this.j = arqvVar5;
            this.k = amjVar;
            this.l = i;
            this.m = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.l;
            int i2 = this.m;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            brt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    public static final void a(cga cgaVar, arqv arqvVar, arqv arqvVar2, arqw arqwVar, arqv arqvVar3, boolean z, bru bruVar, float f, arqv arqvVar4, arqv arqvVar5, amj amjVar, bwj bwjVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        bwj bwjVar2;
        int i6 = i & 6;
        bwj c = bwjVar.c(-208045858);
        if (i6 == 0) {
            i3 = (true != c.G(cgaVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != c.I(arqvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != c.I(arqvVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != c.I(arqwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != c.I(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != c.I(arqvVar3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != c.I(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != c.I(null) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != c.H(z) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            z2 = true;
            i3 |= true != c.G(bruVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            z2 = true;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = (z2 != c.D(f) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= z2 == c.I(arqvVar4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= z2 == c.I(arqvVar5) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= z2 == c.G(amjVar) ? 2048 : 1024;
        }
        int i8 = i4;
        if ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            float e = btq.e(c);
            boolean z3 = (i7 & 234881024) == 67108864;
            boolean z4 = (i7 & 1879048192) == 536870912;
            boolean D = z3 | z4 | ((i8 & 14) == 4) | ((i8 & 7168) == 2048) | c.D(e);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (D || T == bwj.a.a) {
                i5 = i8;
                bwjVar2 = c;
                brw brwVar = new brw(z, bruVar, f, amjVar, e);
                bwkVar.ad(brwVar);
                T = brwVar;
            } else {
                bwjVar2 = c;
                i5 = i8;
            }
            brw brwVar2 = (brw) T;
            drk drkVar = (drk) bwjVar2.g(dch.i);
            int a = bwg.a(bwjVar2);
            byx P = bwkVar.P();
            cga b = cfv.b(bwjVar2, cgaVar);
            int i9 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar2.A();
            if (bwkVar.y) {
                bwjVar2.l(arqgVar);
            } else {
                bwjVar2.C();
            }
            caw.b(bwjVar2, brwVar2, cwl.a.e);
            caw.b(bwjVar2, P, cwl.a.d);
            arqv arqvVar6 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                bwjVar2.j(valueOf, arqvVar6);
            }
            caw.b(bwjVar2, b, cwl.a.c);
            arqvVar4.a(bwjVar2, Integer.valueOf((i5 >> 3) & 14));
            bwjVar2.y(1341896391);
            bwkVar.Y();
            bwjVar2.y(1341905642);
            if (arqvVar3 != null) {
                cga a2 = bmi.a(ctk.a(cga.e, "Trailing"));
                int i10 = cfq.a;
                cue a3 = akc.a(cfq.a.e, false);
                int a4 = bwg.a(bwjVar2);
                byx P2 = bwkVar.P();
                cga b2 = cfv.b(bwjVar2, a2);
                arqg arqgVar2 = cwl.a.a;
                bwjVar2.A();
                if (bwkVar.y) {
                    bwjVar2.l(arqgVar2);
                } else {
                    bwjVar2.C();
                }
                caw.b(bwjVar2, a3, cwl.a.e);
                caw.b(bwjVar2, P2, cwl.a.d);
                arqv arqvVar7 = cwl.a.f;
                if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    bwkVar.ad(valueOf2);
                    bwjVar2.j(valueOf2, arqvVar7);
                }
                caw.b(bwjVar2, b2, cwl.a.c);
                arqvVar3.a(bwjVar2, Integer.valueOf((i7 >> 15) & 14));
                bwjVar2.p();
            }
            bwkVar.Y();
            float b3 = amh.b(amjVar, drkVar);
            float a5 = amh.a(amjVar, drkVar);
            float f2 = btq.f(bwjVar2);
            if (arqvVar3 != null) {
                a5 = arrn.o(a5 - f2, brg.a);
            }
            bwjVar2.y(1341938716);
            bwkVar.Y();
            bwjVar2.y(1341950682);
            bwkVar.Y();
            cga j = amh.j(cga.e, b3, brg.a, a5, brg.a, 10);
            bwjVar2.y(1341977333);
            if (arqvVar2 != null) {
                int i11 = i7 >> 6;
                cga a6 = amv.u(amv.q(ctk.a(cga.e, "Label"), drv.b(24.0f, 16.0f, f), brg.a, 2)).a(j);
                int i12 = cfq.a;
                cue a7 = akc.a(cfq.a.a, false);
                int a8 = bwg.a(bwjVar2);
                byx P3 = bwkVar.P();
                cga b4 = cfv.b(bwjVar2, a6);
                arqg arqgVar3 = cwl.a.a;
                bwjVar2.A();
                if (bwkVar.y) {
                    bwjVar2.l(arqgVar3);
                } else {
                    bwjVar2.C();
                }
                caw.b(bwjVar2, a7, cwl.a.e);
                caw.b(bwjVar2, P3, cwl.a.d);
                arqv arqvVar8 = cwl.a.f;
                if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                    Integer valueOf3 = Integer.valueOf(a8);
                    bwkVar.ad(valueOf3);
                    bwjVar2.j(valueOf3, arqvVar8);
                }
                caw.b(bwjVar2, b4, cwl.a.c);
                arqvVar2.a(bwjVar2, Integer.valueOf(i11 & 14));
                bwjVar2.p();
            }
            bwkVar.Y();
            cga j2 = amh.j(amv.u(amv.q(cga.e, 24.0f, brg.a, 2)), b3, brg.a, a5, brg.a, 10);
            bwjVar2.y(1342001451);
            if (arqwVar != null) {
                arqwVar.a(ctk.a(cga.e, "Hint").a(j2), bwjVar2, Integer.valueOf((i7 >> 6) & 112));
            }
            bwkVar.Y();
            cga a9 = ctk.a(cga.e, "TextField").a(j2);
            int i13 = cfq.a;
            cue a10 = akc.a(cfq.a.a, true);
            int a11 = bwg.a(bwjVar2);
            byx P4 = bwkVar.P();
            cga b5 = cfv.b(bwjVar2, a9);
            arqg arqgVar4 = cwl.a.a;
            bwjVar2.A();
            if (bwkVar.y) {
                bwjVar2.l(arqgVar4);
            } else {
                bwjVar2.C();
            }
            caw.b(bwjVar2, a10, cwl.a.e);
            caw.b(bwjVar2, P4, cwl.a.d);
            arqv arqvVar9 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a11))) {
                Integer valueOf4 = Integer.valueOf(a11);
                bwkVar.ad(valueOf4);
                bwjVar2.j(valueOf4, arqvVar9);
            }
            caw.b(bwjVar2, b5, cwl.a.c);
            arqvVar.a(bwjVar2, Integer.valueOf((i7 >> 3) & 14));
            bwjVar2.p();
            bwjVar2.y(1342012448);
            if (arqvVar5 != null) {
                cga c2 = amh.c(amv.u(amv.q(ctk.a(cga.e, "Supporting"), 16.0f, brg.a, 2)), new amk(16.0f, 4.0f, 16.0f, brg.a));
                cue a12 = akc.a(cfq.a.a, false);
                int a13 = bwg.a(bwjVar2);
                byx P5 = bwkVar.P();
                cga b6 = cfv.b(bwjVar2, c2);
                arqg arqgVar5 = cwl.a.a;
                bwjVar2.A();
                if (bwkVar.y) {
                    bwjVar2.l(arqgVar5);
                } else {
                    bwjVar2.C();
                }
                caw.b(bwjVar2, a12, cwl.a.e);
                caw.b(bwjVar2, P5, cwl.a.d);
                arqv arqvVar10 = cwl.a.f;
                if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a13))) {
                    Integer valueOf5 = Integer.valueOf(a13);
                    bwkVar.ad(valueOf5);
                    bwjVar2.j(valueOf5, arqvVar10);
                }
                caw.b(bwjVar2, b6, cwl.a.c);
                arqvVar5.a(bwjVar2, Integer.valueOf((i5 >> 6) & 14));
                bwjVar2.p();
            }
            bwkVar.Y();
            bwjVar2.p();
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass1(cgaVar, arqvVar, arqvVar2, arqwVar, arqvVar3, z, bruVar, f, arqvVar4, arqvVar5, amjVar, i, i2);
        }
    }
}
