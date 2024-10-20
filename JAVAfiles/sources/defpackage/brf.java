package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.material3.ThumbElement;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brf {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final abk f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brf$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ arqr b;
        final /* synthetic */ cga c;
        final /* synthetic */ bre d;
        final /* synthetic */ ajr e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, arqr arqrVar, cga cgaVar, bre breVar, ajr ajrVar, int i) {
            super(2);
            this.a = z;
            this.b = arqrVar;
            this.c = cgaVar;
            this.d = breVar;
            this.e = ajrVar;
            this.f = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            brf.a(this.a, this.b, this.c, this.d, this.e, (bwj) obj, bzh.a(this.f | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brf$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ boolean b;
        final /* synthetic */ bre c;
        final /* synthetic */ ajq d;
        final /* synthetic */ cmb e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, boolean z, bre breVar, ajq ajqVar, cmb cmbVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = z;
            this.c = breVar;
            this.d = ajqVar;
            this.e = cmbVar;
            this.f = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            brf.b(this.a, this.b, this.c, this.d, this.e, (bwj) obj, bzh.a(this.f | 1));
            return arnb.a;
        }
    }

    static {
        bvg bvgVar = bvn.a;
        float f2 = bvn.c;
        a = f2;
        b = bvn.i;
        c = bvn.h;
        float f3 = bvn.e;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new abk((byte[]) null);
    }

    public static final void a(boolean z, arqr arqrVar, cga cgaVar, bre breVar, ajr ajrVar, bwj bwjVar, int i) {
        int i2;
        ajr ajrVar2;
        cga cgaVar2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        bwj c2 = bwjVar.c(1580463220);
        if ((i & 6) == 0) {
            if (true != c2.H(z)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.I(arqrVar)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (true != c2.G(cgaVar)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (true != c2.I(null)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (true != c2.H(true)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (true != c2.G(breVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (true != c2.G(ajrVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((599187 & i10) == 599186 && c2.L()) {
            c2.v();
            bwjVar2 = c2;
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            }
            c2.n();
            c2.y(783534771);
            if (ajrVar == null) {
                bwk bwkVar = (bwk) c2;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                ajrVar2 = (ajr) T;
            } else {
                ajrVar2 = ajrVar;
            }
            ((bwk) c2).Y();
            if (arqrVar != null) {
                cgaVar2 = avw.a(bmi.a(cga.e), z, ajrVar2, null, new dgv(2), arqrVar);
            } else {
                cgaVar2 = cga.e;
            }
            int i11 = cfq.a;
            cga v = amv.v(cgaVar2, cfq.a.e, 2);
            float f2 = c;
            float f3 = d;
            cga a2 = v.a(new SizeElement(f2, f3, f2, f3, false));
            bvg bvgVar = bvn.a;
            int i12 = i10 << 3;
            int i13 = i10 >> 6;
            ajr ajrVar3 = ajrVar2;
            bwjVar2 = c2;
            b(a2, z, breVar, ajrVar3, bpl.a(bvn.a, c2), c2, (i12 & 57344) | (i13 & 7168) | (i12 & 112) | (i13 & 896));
        }
        bzz e2 = bwjVar2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass1(z, arqrVar, cgaVar, breVar, ajrVar, i);
        }
    }

    public static final void b(cga cgaVar, boolean z, bre breVar, ajq ajqVar, cmb cmbVar, bwj bwjVar, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        bwj c2 = bwjVar.c(-1594099146);
        if ((i & 6) == 0) {
            if (true != c2.G(cgaVar)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.H(z)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (true != c2.H(true)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (true != c2.G(breVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (true != c2.I(null)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (true != c2.G(ajqVar)) {
                i4 = 65536;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (true != c2.G(cmbVar)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i2 |= i3;
        }
        if ((i2 & 599187) == 599186 && c2.L()) {
            c2.v();
            z2 = z;
        } else {
            if (z) {
                j = breVar.b;
            } else {
                j = breVar.e;
            }
            if (z) {
                j2 = breVar.a;
            } else {
                j2 = breVar.d;
            }
            bvg bvgVar = bvn.a;
            cmb a2 = bpl.a(bvn.g, c2);
            float f2 = bvn.f;
            if (z) {
                j3 = breVar.c;
                z2 = true;
            } else {
                j3 = breVar.f;
                z2 = false;
            }
            cga a3 = adf.a(adl.c(cgaVar, f2, j3, a2), j, a2);
            int i10 = cfq.a;
            cue a4 = akc.a(cfq.a.a, false);
            int a5 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c2, a3);
            int i11 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a4, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b2, cwl.a.c);
            cga a6 = adf.a(aex.a(akf.a.a(cga.e, cfq.a.d).a(new ThumbElement(ajqVar, z, bnu.a(buz.b, c2))), ajqVar, bon.a(false, bvn.d / 2.0f, 0L, 4)), j2, cmbVar);
            cue a7 = akc.a(cfq.a.e, false);
            int a8 = bwg.a(c2);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c2, a6);
            arqg arqgVar2 = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar2);
            } else {
                c2.C();
            }
            caw.b(c2, a7, cwl.a.e);
            caw.b(c2, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a8))) {
                Integer valueOf2 = Integer.valueOf(a8);
                bwkVar.ad(valueOf2);
                c2.j(valueOf2, arqvVar2);
            }
            caw.b(c2, b3, cwl.a.c);
            c2.y(1163467170);
            bwkVar.Y();
            c2.p();
            c2.p();
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass2(cgaVar, z2, breVar, ajqVar, cmbVar, i);
        }
    }
}
