package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awi {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ cga b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, cga cgaVar) {
            super(2);
            this.a = j;
            this.b = cgaVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga a;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else if (this.a != 9205357640488583168L) {
                bwjVar.y(1828931592);
                cga cgaVar = this.b;
                long j = this.a;
                a = cgaVar.a(new SizeElement(dra.b(j), dra.a(j), Float.NaN, Float.NaN, false));
                int i = cfq.a;
                cue a2 = akc.a(cfq.a.b, false);
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
                arqv arqvVar = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                    Integer valueOf = Integer.valueOf(a3);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar);
                }
                caw.b(bwjVar, b, cwl.a.c);
                awi.a(null, bwjVar, 0, 1);
                bwjVar.p();
                bwjVar.q();
            } else {
                bwjVar.y(1829298756);
                awi.a(this.b, bwjVar, 0, 0);
                bwjVar.q();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awi$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bcv a;
        final /* synthetic */ cga b;
        final /* synthetic */ long c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bcv bcvVar, cga cgaVar, long j, int i) {
            super(2);
            this.a = bcvVar;
            this.b = cgaVar;
            this.c = j;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            awi.b(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awi$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<dho, arnb> {
        final /* synthetic */ bcv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(bcv bcvVar) {
            super(1);
            this.a = bcvVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((dho) obj).c(bdp.a, new bdo(axp.a, this.a.a(), bdn.b, true));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awi$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(cga cgaVar, int i, int i2) {
            super(2);
            this.a = cgaVar;
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.b;
            awi.a(this.a, (bwj) obj, bzh.a(i | 1), this.c);
            return arnb.a;
        }
    }

    public static final void a(cga cgaVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        cga g;
        bwj c = bwjVar.c(694251107);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c.L()) {
            c.v();
        } else {
            if (i2 != 0) {
                cgaVar = cga.e;
            }
            g = cfv.g(amv.j(cgaVar, 20.710678f, 25.0f), awl.a);
            amx.a(g, c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(cgaVar, i, i2);
        }
    }

    public static final void b(bcv bcvVar, cga cgaVar, long j, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        boolean I;
        int i4;
        int i5 = i & 6;
        bwj c2 = bwjVar.c(1776202187);
        boolean z = true;
        if (i5 == 0) {
            if ((i & 8) == 0) {
                I = c2.G(bcvVar);
            } else {
                I = c2.I(bcvVar);
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
        if ((i & 48) == 0) {
            if (true != c2.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i2 & 147) == 146 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            } else {
                j = 9205357640488583168L;
            }
            c2.n();
            int i6 = i2 & 14;
            if (i6 != 4 && ((i2 & 8) == 0 || !c2.I(bcvVar))) {
                z = false;
            }
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (z || T == bwj.a.a) {
                T = new AnonymousClass3(bcvVar);
                bwkVar.ad(T);
            }
            c = dhb.c(cgaVar, false, (arqr) T);
            int i7 = cfq.a;
            bcd.b(bcvVar, cfq.a.b, cdk.e(-1653527038, new AnonymousClass1(j, c), c2), c2, i6 | 432);
        }
        long j2 = j;
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(bcvVar, cgaVar, j2, i);
        }
    }
}
