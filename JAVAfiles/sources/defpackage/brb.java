package defpackage;

import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brb$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<dri, dqs, armo<? extends bsw<brd>, ? extends brd>> {
        final /* synthetic */ brc a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(brc brcVar, boolean z, boolean z2, boolean z3) {
            super(2);
            this.a = brcVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            long j = ((dri) obj).a;
            long j2 = ((dqs) obj2).a;
            return new armo(bsq.a(new bra(this.b, this.c, dri.b(j), this.d)), (brd) this.a.b.l());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: brb$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ brc a;
        final /* synthetic */ arqw b;
        final /* synthetic */ cga c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;
        final /* synthetic */ boolean f;
        final /* synthetic */ arqw g;
        final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(brc brcVar, arqw arqwVar, cga cgaVar, boolean z, boolean z2, boolean z3, arqw arqwVar2, int i) {
            super(2);
            this.a = brcVar;
            this.b = arqwVar;
            this.c = cgaVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = arqwVar2;
            this.h = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            brb.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1));
            return arnb.a;
        }
    }

    public static final void a(brc brcVar, arqw arqwVar, cga cgaVar, boolean z, boolean z2, boolean z3, arqw arqwVar2, bwj bwjVar, int i) {
        int i2;
        boolean z4;
        boolean z5;
        cga a;
        boolean z6;
        boolean z7;
        boolean z8;
        cga cgaVar2;
        boolean z9;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i & 6;
        bwj c = bwjVar.c(-402577235);
        if (i8 == 0) {
            if (true != c.G(brcVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqwVar)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i2 |= i6;
        }
        int i9 = i2 | 384;
        if ((i & 3072) == 0) {
            if (true != c.H(z)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i9 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != c.H(z2)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i9 |= i4;
        }
        int i10 = i9 | 196608;
        if ((1572864 & i) == 0) {
            if (true != c.I(arqwVar2)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i10 |= i3;
        }
        if ((599187 & i10) == 599186 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
            z9 = z3;
        } else {
            cga.a aVar = cga.e;
            if (c.g(dch.i) == drk.b) {
                z4 = true;
            } else {
                z4 = false;
            }
            bsr bsrVar = brcVar.b;
            ahp ahpVar = ahp.b;
            if (brcVar.a() == brd.c) {
                z5 = true;
            } else {
                z5 = false;
            }
            a = ahh.a(aVar, bsrVar.d, ahpVar, z5, null, bsrVar.q(), new bsp(bsrVar, null), false, 32);
            int i11 = cfq.a;
            cue a2 = akc.a(cfq.a.a, true);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, a);
            int i12 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            cga b2 = akf.a.b(cga.e);
            int i13 = (i10 << 6) & 7168;
            cue a4 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a5 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b3 = cfv.b(c, b2);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b3, cwl.a.c);
            arqwVar.a(amu.a, c, Integer.valueOf(((i13 >> 6) & 112) | 6));
            c.p();
            bsr bsrVar2 = brcVar.b;
            if ((i10 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            cga.a aVar2 = cga.e;
            ahp ahpVar2 = ahp.b;
            boolean H = c.H(z4) | z6;
            if ((57344 & i10) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i10 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object T = bwkVar.T();
            if ((H | z7 | z8) || T == bwj.a.a) {
                T = new AnonymousClass1(brcVar, z, z4, z2);
                bwkVar.ad(T);
            }
            cga b4 = bsq.b(aVar2, bsrVar2, ahpVar2, (arqv) T);
            int i14 = (i10 >> 9) & 7168;
            cue a6 = amq.a(ajw.a, cfq.a.j, c, 0);
            int a7 = bwg.a(c);
            byx P3 = bwkVar.P();
            cga b5 = cfv.b(c, b4);
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, a6, cwl.a.e);
            caw.b(c, P3, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a7))) {
                Integer valueOf3 = Integer.valueOf(a7);
                bwkVar.ad(valueOf3);
                c.j(valueOf3, arqvVar3);
            }
            caw.b(c, b5, cwl.a.c);
            arqwVar2.a(amu.a, c, Integer.valueOf(((i14 >> 6) & 112) | 6));
            c.p();
            c.p();
            cgaVar2 = aVar;
            z9 = true;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(brcVar, arqwVar, cgaVar2, z, z2, z9, arqwVar2, i);
        }
    }
}
