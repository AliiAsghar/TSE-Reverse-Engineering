package defpackage;

import defpackage.bwj;
import defpackage.ces;
import defpackage.cva;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ask {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ask$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ asi a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(asi asiVar) {
            super(1);
            this.a = asiVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new asj(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ask$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object a;
        final /* synthetic */ int b;
        final /* synthetic */ asl c;
        final /* synthetic */ arqv d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, int i, asl aslVar, arqv arqvVar, int i2) {
            super(2);
            this.a = obj;
            this.b = i;
            this.c = aslVar;
            this.d = arqvVar;
            this.e = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            ask.a(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1));
            return arnb.a;
        }
    }

    public static final void a(Object obj, int i, asl aslVar, arqv arqvVar, bwj bwjVar, int i2) {
        int i3;
        arqr arqrVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2 & 6;
        bwj c = bwjVar.c(-2079116560);
        if (i8 == 0) {
            if (true != c.I(obj)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.E(i)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (true != c.I(aslVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (true != c.I(arqvVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            boolean G = c.G(obj) | c.G(aslVar);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new asi(obj, aslVar);
                bwkVar.ad(T);
            }
            asi asiVar = (asi) T;
            asiVar.a = i;
            cva cvaVar = (cva) c.g(cvb.a);
            ces a = ces.a.a();
            cva.a aVar = null;
            if (a != null) {
                arqrVar = a.i();
            } else {
                arqrVar = null;
            }
            ces b = ces.a.b(a);
            try {
                if (cvaVar != asiVar.c()) {
                    asiVar.d.h(cvaVar);
                    if (asiVar.b > 0) {
                        cva.a aVar2 = asiVar.c;
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        if (cvaVar != null) {
                            aVar = cvaVar.b();
                        }
                        asiVar.c = aVar;
                    }
                }
                ces.a.f(a, b, arqrVar);
                boolean G2 = c.G(asiVar);
                Object T2 = bwkVar.T();
                if (G2 || T2 == bwj.a.a) {
                    T2 = new AnonymousClass1(asiVar);
                    bwkVar.ad(T2);
                }
                bxl.c(asiVar, (arqr) T2, c);
                bwx.a(cvb.a.c(asiVar), arqvVar, c, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ces.a.f(a, b, arqrVar);
                throw th;
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(obj, i, aslVar, arqvVar, i2);
        }
    }
}
