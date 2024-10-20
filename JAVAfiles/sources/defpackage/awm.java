package defpackage;

import defpackage.cga;
import defpackage.cvc;
import defpackage.cwl;
import defpackage.dhv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awm {
    public static final armo a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awm$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dhv a;
        final /* synthetic */ List b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dhv dhvVar, List list, int i) {
            super(2);
            this.a = dhvVar;
            this.b = list;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            awm.a(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    static {
        arnv arnvVar = arnv.a;
        a = new armo(arnvVar, arnvVar);
    }

    public static final void a(dhv dhvVar, List list, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(-1794596951);
        if (i5 == 0) {
            if (true != c.G(dhvVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(list)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c.L()) {
            c.v();
        } else {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                dhv.c cVar = (dhv.c) list.get(i6);
                arqw arqwVar = (arqw) cVar.a;
                int i7 = cVar.b;
                int i8 = cVar.c;
                AnonymousClass1 anonymousClass1 = new cue() { // from class: awm.1

                    /* compiled from: PG */
                    /* renamed from: awm$1$1, reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes.dex */
                    static final class C00201 extends arrp implements arqr<cvc.a, arnb> {
                        final /* synthetic */ List a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00201(List list) {
                            super(1);
                            this.a = list;
                        }

                        @Override // defpackage.arqr
                        public final /* bridge */ /* synthetic */ Object a(Object obj) {
                            List list = this.a;
                            cvc.a aVar = (cvc.a) obj;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                cvc.a.m(aVar, (cvc) list.get(i), 0, 0);
                            }
                            return arnb.a;
                        }
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int a(ctd ctdVar, List list2, int i9) {
                        return cud.a(this, ctdVar, list2, i9);
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int b(ctd ctdVar, List list2, int i9) {
                        return cud.b(this, ctdVar, list2, i9);
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int c(ctd ctdVar, List list2, int i9) {
                        return cud.c(this, ctdVar, list2, i9);
                    }

                    @Override // defpackage.cue
                    public final /* synthetic */ int d(ctd ctdVar, List list2, int i9) {
                        return cud.d(this, ctdVar, list2, i9);
                    }

                    @Override // defpackage.cue
                    public final cuf e(cuh cuhVar, List list2, long j) {
                        cuf et;
                        ArrayList arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            arrayList.add(((cuc) list2.get(i9)).e(j));
                        }
                        et = cuhVar.et(dqs.b(j), dqs.a(j), arnw.a, new C00201(arrayList));
                        return et;
                    }
                };
                cga.a aVar = cga.e;
                int a2 = bwg.a(c);
                bwk bwkVar = (bwk) c;
                byx P = bwkVar.P();
                cga b = cfv.b(c, aVar);
                int i9 = cwl.a;
                arqg arqgVar = cwl.a.a;
                c.A();
                if (bwkVar.y) {
                    c.l(arqgVar);
                } else {
                    c.C();
                }
                caw.b(c, anonymousClass1, cwl.a.e);
                caw.b(c, P, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwkVar.ad(valueOf);
                    c.j(valueOf, arqvVar);
                }
                caw.b(c, b, cwl.a.c);
                arqwVar.a(dhvVar.subSequence(i7, i8).b, c, 0);
                c.p();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(dhvVar, list, i);
        }
    }
}
