package defpackage;

import defpackage.cwl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cto {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cto$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cxn, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((cxn) obj).v = true;
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cto$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ arqv b;
        final /* synthetic */ cue c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, arqv arqvVar, cue cueVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = arqvVar;
            this.c = cueVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            cto.b(this.a, this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cto$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List list) {
            super(2);
            this.a = list;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                List list = this.a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arqv arqvVar = (arqv) list.get(i);
                    int a = bwg.a(bwjVar);
                    int i2 = cwl.a;
                    arqg arqgVar = cwl.a.b;
                    bwjVar.N();
                    bwjVar.A();
                    if (bwjVar.K()) {
                        bwjVar.l(arqgVar);
                    } else {
                        bwjVar.C();
                    }
                    arqv arqvVar2 = cwl.a.f;
                    if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a))) {
                        Integer valueOf = Integer.valueOf(a);
                        bwjVar.B(valueOf);
                        bwjVar.j(valueOf, arqvVar2);
                    }
                    arqvVar.a(bwjVar, 0);
                    bwjVar.p();
                }
            }
            return arnb.a;
        }
    }

    public static final arqv a(List list) {
        return new cdj(-1953651383, true, new AnonymousClass3(list));
    }

    @armg
    public static final void b(cga cgaVar, arqv arqvVar, cue cueVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(1949933075);
        if (i6 == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.G(cueVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            int a = bwg.a(c);
            cga b = cfv.b(c, cgaVar);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            int i7 = ((i2 << 3) & 896) | 6;
            arqg arqgVar = cxn.b;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, cueVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            caw.a(c, AnonymousClass1.a);
            caw.b(c, b, cwl.a.c);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            arqvVar.a(c, Integer.valueOf((i7 >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(cgaVar, arqvVar, cueVar, i);
        }
    }
}
