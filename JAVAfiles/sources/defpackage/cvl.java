package defpackage;

import defpackage.bwj;
import defpackage.ctt;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvl {
    public static final AnonymousClass1 a = new Object() { // from class: cvl.1
        public final String toString() {
            return "ReusedSlotId";
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cvl$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, arqv arqvVar, int i, int i2) {
            super(2);
            this.a = cgaVar;
            this.b = arqvVar;
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            int i = this.d;
            cvl.a(this.a, this.b, (bwj) obj, a, i);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cvl$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        final /* synthetic */ cvm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cvm cvmVar) {
            super(0);
            this.a = cvmVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            int i;
            ctt a = this.a.a();
            if (a.i != a.a.E().size()) {
                ve veVar = a.l;
                Object[] objArr = veVar.c;
                long[] jArr = veVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    ((ctt.a) objArr[(i2 << 3) + i4]).d = true;
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                if (!a.a.al()) {
                    cxn.aw(a.a, false, 7);
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cvl$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cvm a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(cvm cvmVar, cga cgaVar, arqv arqvVar, int i) {
            super(2);
            this.a = cvmVar;
            this.b = cgaVar;
            this.c = arqvVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            cvl.b(this.a, this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    public static final void a(cga cgaVar, arqv arqvVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        bwj c = bwjVar.c(-1298353104);
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
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c.L()) {
            c.v();
        } else {
            if (i2 != 0) {
                cgaVar = cga.e;
            }
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new cvm(cup.a);
                bwkVar.ad(T);
            }
            b((cvm) T, cgaVar, arqvVar, c, (i3 << 3) & 1008);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(cgaVar, arqvVar, i, i2);
        }
    }

    public static final void b(cvm cvmVar, cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-511989831);
        if (i6 == 0) {
            if (true != c.I(cvmVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            int a2 = bwg.a(c);
            bwr c2 = bwg.c(c);
            cga b = cfv.b(c, cgaVar);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            arqg arqgVar = cxn.b;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, cvmVar, cvmVar.c);
            caw.b(c, c2, cvmVar.d);
            caw.b(c, arqvVar, cvmVar.e);
            caw.b(c, P, cwl.a.d);
            caw.b(c, b, cwl.a.c);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            c.p();
            if (!c.L()) {
                boolean I = c.I(cvmVar);
                Object T = bwkVar.T();
                if (I || T == bwj.a.a) {
                    T = new AnonymousClass3(cvmVar);
                    bwkVar.ad(T);
                }
                bxl.h((arqg) T, c);
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(cvmVar, cgaVar, arqvVar, i);
        }
    }
}
