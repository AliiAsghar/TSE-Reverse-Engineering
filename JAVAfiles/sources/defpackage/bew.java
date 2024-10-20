package defpackage;

import defpackage.cvc;
import defpackage.cwl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bew {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bew$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, arqv arqvVar, int i) {
            super(2);
            this.a = cgaVar;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            bew.a(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    public static final void a(cga cgaVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(-2105228848);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c.L()) {
            c.v();
        } else {
            int i6 = i2 >> 3;
            AnonymousClass1 anonymousClass1 = new cue() { // from class: bew.1

                /* compiled from: PG */
                /* renamed from: bew$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                static final class C00311 extends arrp implements arqr<cvc.a, arnb> {
                    final /* synthetic */ List a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00311(List list) {
                        super(1);
                        this.a = list;
                    }

                    @Override // defpackage.arqr
                    public final /* bridge */ /* synthetic */ Object a(Object obj) {
                        List list = this.a;
                        cvc.a aVar = (cvc.a) obj;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            aVar.e((cvc) list.get(i), 0, 0, brg.a);
                        }
                        return arnb.a;
                    }
                }

                @Override // defpackage.cue
                public final /* synthetic */ int a(ctd ctdVar, List list, int i7) {
                    return cud.a(this, ctdVar, list, i7);
                }

                @Override // defpackage.cue
                public final /* synthetic */ int b(ctd ctdVar, List list, int i7) {
                    return cud.b(this, ctdVar, list, i7);
                }

                @Override // defpackage.cue
                public final /* synthetic */ int c(ctd ctdVar, List list, int i7) {
                    return cud.c(this, ctdVar, list, i7);
                }

                @Override // defpackage.cue
                public final /* synthetic */ int d(ctd ctdVar, List list, int i7) {
                    return cud.d(this, ctdVar, list, i7);
                }

                @Override // defpackage.cue
                public final cuf e(cuh cuhVar, List list, long j) {
                    cuf et;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        cvc e = ((cuc) list.get(i9)).e(j);
                        i7 = Math.max(i7, e.a);
                        i8 = Math.max(i8, e.b);
                        arrayList.add(e);
                    }
                    et = cuhVar.et(i7, i8, arnw.a, new C00311(arrayList));
                    return et;
                }
            };
            int a = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, cgaVar);
            int i7 = cwl.a;
            int i8 = (((((i2 << 3) & 112) | ((i6 & 14) | 384)) << 6) & 896) | 6;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, anonymousClass1, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar2);
            }
            caw.b(c, b, cwl.a.c);
            arqvVar.a(c, Integer.valueOf((i8 >> 6) & 14));
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(cgaVar, arqvVar, i);
        }
    }
}
