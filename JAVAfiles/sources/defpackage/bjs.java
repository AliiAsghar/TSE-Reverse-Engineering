package defpackage;

import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjs {
    public static final ctb a = new ctb();
    public static final cvq b = new cvq();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bjs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, long j, long j2, int i) {
            super(2);
            this.a = cgaVar;
            this.b = j;
            this.c = j2;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bjs.a(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    public static final void a(cga cgaVar, long j, long j2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 6;
        bwj c = bwjVar.c(1298144073);
        if (i7 == 0) {
            if (true != c.G(cgaVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.F(j)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (true != c.F(j2)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (true != c.I(null)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
            }
            c.n();
            bvg bvgVar = bui.a;
            float f = bui.b;
            c.y(-1273597837);
            cmb a2 = bpl.a(bui.a, c);
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            cga a3 = adf.a(amv.a(cgaVar, f, f), j, a2).a(cga.e);
            int i8 = cfq.a;
            cue a4 = amq.a(ajw.e, cfq.a.k, c, 54);
            int a5 = bwg.a(c);
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, a3);
            int i9 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a4, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            c.y(-1705354649);
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(cgaVar, j, j2, i);
        }
    }
}
