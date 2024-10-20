package defpackage;

import defpackage.bru;
import defpackage.cfq;
import defpackage.cvc;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bod implements cue {
    public final boolean a;
    public final bru b;
    public final float c;
    public final amj d;
    public final float e;
    private final arqr f;

    /* compiled from: PG */
    /* renamed from: bod$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).a(((Number) obj2).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: bod$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).b(((Number) obj2).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: bod$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ cvc d;
        final /* synthetic */ cvc e;
        final /* synthetic */ cvc f;
        final /* synthetic */ cvc g;
        final /* synthetic */ cvc h;
        final /* synthetic */ arsb i;
        final /* synthetic */ cvc j;
        final /* synthetic */ cvc k;
        final /* synthetic */ cvc l;
        final /* synthetic */ cuh m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, int i2, cvc cvcVar, cvc cvcVar2, cvc cvcVar3, cvc cvcVar4, cvc cvcVar5, arsb arsbVar, cvc cvcVar6, cvc cvcVar7, cvc cvcVar8, cuh cuhVar) {
            super(1);
            this.b = i;
            this.c = i2;
            this.d = cvcVar;
            this.e = cvcVar2;
            this.f = cvcVar3;
            this.g = cvcVar4;
            this.h = cvcVar5;
            this.i = arsbVar;
            this.j = cvcVar6;
            this.k = cvcVar7;
            this.l = cvcVar8;
            this.m = cuhVar;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            cvc cvcVar;
            int i;
            int i2;
            cvc cvcVar2;
            int i3;
            int i4;
            int i5;
            float o;
            float o2;
            float f;
            float f2;
            cvc.a aVar = (cvc.a) obj;
            cvc cvcVar3 = (cvc) this.i.a;
            cvc cvcVar4 = this.k;
            bod bodVar = bod.this;
            cuh cuhVar = this.m;
            float f3 = bodVar.e;
            float ec = cuhVar.ec();
            drk q = cuhVar.q();
            float em = cuhVar.em(f3);
            aVar.e(cvcVar4, 0, 0, brg.a);
            cvc cvcVar5 = this.l;
            int a = this.b - btf.a(cvcVar5);
            bod bodVar2 = bod.this;
            int g = arsk.g(((amk) bodVar2.d).a * ec);
            cvc cvcVar6 = this.d;
            if (cvcVar6 != null) {
                int i6 = cfq.a;
                cvc.a.m(aVar, cvcVar6, 0, cfq.a.k.a(cvcVar6.b, a));
            }
            cvc cvcVar7 = this.e;
            int i7 = this.c;
            if (cvcVar3 != null) {
                if (bodVar2.a) {
                    int i8 = cfq.a;
                    i5 = cfq.a.k.a(cvcVar3.b, a);
                } else {
                    i5 = g;
                }
                int i9 = -(cvcVar3.b / 2);
                float f4 = bodVar2.c;
                cvcVar = cvcVar5;
                amj amjVar = bodVar2.d;
                int c = drv.c(i5, i9, f4);
                float b = amh.b(amjVar, q) * ec;
                float a2 = amh.a(bodVar2.d, q) * ec;
                if (cvcVar6 == null) {
                    o = b;
                    i2 = g;
                } else {
                    i2 = g;
                    o = cvcVar6.a + arrn.o(b - em, brg.a);
                }
                if (cvcVar7 == null) {
                    o2 = a2;
                } else {
                    o2 = cvcVar7.a + arrn.o(a2 - em, brg.a);
                }
                if (q == drk.a) {
                    f = b;
                } else {
                    f = a2;
                }
                if (q == drk.a) {
                    f2 = o;
                } else {
                    f2 = o2;
                }
                cvcVar2 = cvcVar7;
                i = a;
                float a3 = ((bru.a) bodVar2.b).b.a(cvcVar3.a, i7 - arsk.g(o + o2), q);
                bru bruVar = bodVar2.b;
                aVar.e(cvcVar3, arsk.g(drv.b(a3 + f2, ((bru.a) bruVar).a.a(cvcVar3.a, i7 - arsk.g(b + a2), q) + f, bodVar2.c)), c, brg.a);
            } else {
                cvcVar = cvcVar5;
                i = a;
                i2 = g;
                cvcVar2 = cvcVar7;
            }
            cvc cvcVar8 = this.f;
            if (cvcVar8 != null) {
                i3 = i7;
                cvc.a.m(aVar, cvcVar8, btf.b(cvcVar6), bod.f(0, bodVar2, i, i2, cvcVar3, cvcVar8));
            } else {
                i3 = i7;
            }
            cvc cvcVar9 = this.j;
            cvc cvcVar10 = this.h;
            int b2 = btf.b(cvcVar6) + btf.b(cvcVar8);
            cvc.a.m(aVar, cvcVar10, b2, bod.f(0, bodVar2, i, i2, cvcVar3, cvcVar10));
            if (cvcVar9 != null) {
                cvc.a.m(aVar, cvcVar9, b2, bod.f(0, bodVar2, i, i2, cvcVar3, cvcVar9));
            }
            cvc cvcVar11 = this.g;
            if (cvcVar11 != null) {
                cvc.a.m(aVar, cvcVar11, (i3 - btf.b(cvcVar2)) - cvcVar11.a, bod.f(0, bodVar2, i, i2, cvcVar3, cvcVar11));
            }
            if (cvcVar2 != null) {
                cvc cvcVar12 = cvcVar2;
                int i10 = i3 - cvcVar12.a;
                int i11 = cfq.a;
                i4 = i;
                cvc.a.m(aVar, cvcVar12, i10, cfq.a.k.a(cvcVar12.b, i4));
            } else {
                i4 = i;
            }
            if (cvcVar != null) {
                cvc.a.m(aVar, cvcVar, 0, i4);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bod$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).c(((Number) obj2).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: bod$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).d(((Number) obj2).intValue()));
        }
    }

    public bod(arqr arqrVar, boolean z, bru bruVar, float f, amj amjVar, float f2) {
        this.f = arqrVar;
        this.a = z;
        this.b = bruVar;
        this.c = f;
        this.d = amjVar;
        this.e = f2;
    }

    public static final int f(int i, bod bodVar, int i2, int i3, cvc cvcVar, cvc cvcVar2) {
        if (bodVar.a) {
            int i4 = cfq.a;
            i3 = cfq.a.k.a(cvcVar2.b, i2);
        }
        return Math.max(i3, btf.a(cvcVar) / 2);
    }

    private final int g(dqv dqvVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, drv.c(i6, 0, this.c))) + i2, Math.max(arsk.g((i6 + dqvVar.em(this.d.b(drk.a) + this.d.c(drk.a))) * this.c), dqs.d(j)));
    }

    private final int h(ctd ctdVar, List list, int i, arqv arqvVar) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        int i8;
        Object obj7;
        int i9;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (d.F(btf.d((ctc) obj), "Leading")) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        ctc ctcVar = (ctc) obj;
        if (ctcVar != null) {
            i2 = btf.c(i, ctcVar.b(Integer.MAX_VALUE));
            i3 = ((Number) arqvVar.a(ctcVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                obj2 = list.get(i11);
                if (d.F(btf.d((ctc) obj2), "Trailing")) {
                    break;
                }
                i11++;
            } else {
                obj2 = null;
                break;
            }
        }
        ctc ctcVar2 = (ctc) obj2;
        if (ctcVar2 != null) {
            i2 = btf.c(i2, ctcVar2.b(Integer.MAX_VALUE));
            i4 = ((Number) arqvVar.a(ctcVar2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 < size3) {
                obj3 = list.get(i12);
                if (d.F(btf.d((ctc) obj3), "Label")) {
                    break;
                }
                i12++;
            } else {
                obj3 = null;
                break;
            }
        }
        Object obj8 = (ctc) obj3;
        if (obj8 != null) {
            i5 = ((Number) arqvVar.a(obj8, Integer.valueOf(drv.c(i2, i, this.c)))).intValue();
        } else {
            i5 = 0;
        }
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size4) {
                obj4 = list.get(i13);
                if (d.F(btf.d((ctc) obj4), "Prefix")) {
                    break;
                }
                i13++;
            } else {
                obj4 = null;
                break;
            }
        }
        ctc ctcVar3 = (ctc) obj4;
        if (ctcVar3 != null) {
            int intValue = ((Number) arqvVar.a(ctcVar3, Integer.valueOf(i2))).intValue();
            i2 = btf.c(i2, ctcVar3.b(Integer.MAX_VALUE));
            i6 = intValue;
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size5) {
                obj5 = list.get(i14);
                if (d.F(btf.d((ctc) obj5), "Suffix")) {
                    break;
                }
                i14++;
            } else {
                obj5 = null;
                break;
            }
        }
        ctc ctcVar4 = (ctc) obj5;
        if (ctcVar4 != null) {
            int intValue2 = ((Number) arqvVar.a(ctcVar4, Integer.valueOf(i2))).intValue();
            i2 = btf.c(i2, ctcVar4.b(Integer.MAX_VALUE));
            i7 = intValue2;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i15 = 0; i15 < size6; i15++) {
            Object obj9 = list.get(i15);
            if (d.F(btf.d((ctc) obj9), "TextField")) {
                int intValue3 = ((Number) arqvVar.a(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size7) {
                        obj6 = list.get(i16);
                        if (d.F(btf.d((ctc) obj6), "Hint")) {
                            break;
                        }
                        i16++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                Object obj10 = (ctc) obj6;
                if (obj10 != null) {
                    i8 = ((Number) arqvVar.a(obj10, Integer.valueOf(i2))).intValue();
                } else {
                    i8 = 0;
                }
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size8) {
                        obj7 = list.get(i17);
                        if (d.F(btf.d((ctc) obj7), "Supporting")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                Object obj11 = (ctc) obj7;
                if (obj11 != null) {
                    i9 = ((Number) arqvVar.a(obj11, Integer.valueOf(i))).intValue();
                } else {
                    i9 = 0;
                }
                return j(ctdVar, i3, i4, i6, i7, intValue3, i5, i8, i9, dqt.l(0, 0, 15));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int i(ctd ctdVar, List list, int i, arqv arqvVar) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        Object obj5;
        int i5;
        Object obj6;
        int i6;
        int i7;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj7 = list.get(i8);
            if (d.F(btf.d((ctc) obj7), "TextField")) {
                int intValue = ((Number) arqvVar.a(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i9 = 0;
                while (true) {
                    obj = null;
                    if (i9 < size2) {
                        obj2 = list.get(i9);
                        if (d.F(btf.d((ctc) obj2), "Label")) {
                            break;
                        }
                        i9++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ctc ctcVar = (ctc) obj2;
                if (ctcVar != null) {
                    i2 = ((Number) arqvVar.a(ctcVar, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                int size3 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size3) {
                        obj3 = list.get(i10);
                        if (d.F(btf.d((ctc) obj3), "Trailing")) {
                            break;
                        }
                        i10++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                ctc ctcVar2 = (ctc) obj3;
                if (ctcVar2 != null) {
                    i3 = ((Number) arqvVar.a(ctcVar2, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                int size4 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size4) {
                        obj4 = list.get(i11);
                        if (d.F(btf.d((ctc) obj4), "Leading")) {
                            break;
                        }
                        i11++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                ctc ctcVar3 = (ctc) obj4;
                if (ctcVar3 != null) {
                    i4 = ((Number) arqvVar.a(ctcVar3, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size5) {
                        obj5 = list.get(i12);
                        if (d.F(btf.d((ctc) obj5), "Prefix")) {
                            break;
                        }
                        i12++;
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                ctc ctcVar4 = (ctc) obj5;
                if (ctcVar4 != null) {
                    i5 = ((Number) arqvVar.a(ctcVar4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                int size6 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size6) {
                        obj6 = list.get(i13);
                        if (d.F(btf.d((ctc) obj6), "Suffix")) {
                            break;
                        }
                        i13++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                ctc ctcVar5 = (ctc) obj6;
                if (ctcVar5 != null) {
                    i6 = ((Number) arqvVar.a(ctcVar5, Integer.valueOf(i))).intValue();
                } else {
                    i6 = 0;
                }
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i14);
                    if (d.F(btf.d((ctc) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i14++;
                }
                ctc ctcVar6 = (ctc) obj;
                if (ctcVar6 != null) {
                    i7 = ((Number) arqvVar.a(ctcVar6, Integer.valueOf(i))).intValue();
                } else {
                    i7 = 0;
                }
                return g(ctdVar, i4, i3, i5, i6, intValue, i2, i7, dqt.l(0, 0, 15));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int j(dqv dqvVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        int r = arrj.r(i5, i7, i3, i4, drv.c(i6, 0, this.c));
        float em = dqvVar.em(((amk) this.d).a);
        return Math.max(dqs.c(j), Math.max(i, Math.max(i2, arsk.g(drv.b(em, Math.max(em, i6 / 2.0f), this.c) + r + dqvVar.em(((amk) this.d).b)))) + i8);
    }

    @Override // defpackage.cue
    public final int a(ctd ctdVar, List list, int i) {
        return h(ctdVar, list, i, AnonymousClass1.a);
    }

    @Override // defpackage.cue
    public final int b(ctd ctdVar, List list, int i) {
        return i(ctdVar, list, i, AnonymousClass2.a);
    }

    @Override // defpackage.cue
    public final int c(ctd ctdVar, List list, int i) {
        return h(ctdVar, list, i, AnonymousClass4.a);
    }

    @Override // defpackage.cue
    public final int d(ctd ctdVar, List list, int i) {
        return i(ctdVar, list, i, AnonymousClass5.a);
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        Object obj;
        cvc cvcVar;
        Object obj2;
        cvc cvcVar2;
        Object obj3;
        cvc cvcVar3;
        Object obj4;
        cvc cvcVar4;
        Object obj5;
        cvc cvcVar5;
        long j2;
        Object obj6;
        int i;
        Object obj7;
        cvc cvcVar6;
        cvc cvcVar7;
        int i2;
        int i3;
        cuf et;
        int eo = cuhVar.eo(((amk) this.d).b);
        int i4 = -eo;
        long k = dqs.k(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                obj = list.get(i5);
                if (d.F(ctk.b((cuc) obj), "Leading")) {
                    break;
                }
                i5++;
            } else {
                obj = null;
                break;
            }
        }
        cuc cucVar = (cuc) obj;
        if (cucVar != null) {
            cvcVar = cucVar.e(k);
        } else {
            cvcVar = null;
        }
        int b = btf.b(cvcVar);
        int max = Math.max(0, btf.a(cvcVar));
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 < size2) {
                obj2 = list.get(i6);
                if (d.F(ctk.b((cuc) obj2), "Trailing")) {
                    break;
                }
                i6++;
            } else {
                obj2 = null;
                break;
            }
        }
        cuc cucVar2 = (cuc) obj2;
        if (cucVar2 != null) {
            cvcVar2 = cucVar2.e(dqt.k(k, -b, 0, 2));
        } else {
            cvcVar2 = null;
        }
        int b2 = b + btf.b(cvcVar2);
        int max2 = Math.max(max, btf.a(cvcVar2));
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 < size3) {
                obj3 = list.get(i7);
                if (d.F(ctk.b((cuc) obj3), "Prefix")) {
                    break;
                }
                i7++;
            } else {
                obj3 = null;
                break;
            }
        }
        cuc cucVar3 = (cuc) obj3;
        if (cucVar3 != null) {
            cvcVar3 = cucVar3.e(dqt.k(k, -b2, 0, 2));
        } else {
            cvcVar3 = null;
        }
        int b3 = b2 + btf.b(cvcVar3);
        int max3 = Math.max(max2, btf.a(cvcVar3));
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 < size4) {
                obj4 = list.get(i8);
                if (d.F(ctk.b((cuc) obj4), "Suffix")) {
                    break;
                }
                i8++;
            } else {
                obj4 = null;
                break;
            }
        }
        cuc cucVar4 = (cuc) obj4;
        if (cucVar4 != null) {
            cvcVar4 = cucVar4.e(dqt.k(k, -b3, 0, 2));
        } else {
            cvcVar4 = null;
        }
        int b4 = b3 + btf.b(cvcVar4);
        int max4 = Math.max(max3, btf.a(cvcVar4));
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 < size5) {
                obj5 = list.get(i9);
                if (d.F(ctk.b((cuc) obj5), "Label")) {
                    break;
                }
                i9++;
            } else {
                obj5 = null;
                break;
            }
        }
        cuc cucVar5 = (cuc) obj5;
        arsb arsbVar = new arsb();
        int eo2 = cuhVar.eo(this.d.b(cuhVar.q())) + cuhVar.eo(this.d.c(cuhVar.q()));
        long h = dqt.h(k, -drv.c(b4 + eo2, eo2, this.c), i4);
        if (cucVar5 != null) {
            cvcVar5 = cucVar5.e(h);
        } else {
            cvcVar5 = null;
        }
        arsbVar.a = cvcVar5;
        if (((cvc) arsbVar.a) != null) {
            j2 = a.z(r5.a, r5.b);
        } else {
            j2 = 0;
        }
        this.f.a(new cjt(j2));
        int size6 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size6) {
                obj6 = list.get(i10);
                if (d.F(ctk.b((cuc) obj6), "Supporting")) {
                    break;
                }
                i10++;
            } else {
                obj6 = null;
                break;
            }
        }
        cuc cucVar6 = (cuc) obj6;
        if (cucVar6 != null) {
            i = cucVar6.c(dqs.d(j));
        } else {
            i = 0;
        }
        int max5 = Math.max(btf.a((cvc) arsbVar.a) / 2, cuhVar.eo(((amk) this.d).a));
        long k2 = dqs.k(dqt.h(j, -b4, (i4 - max5) - i), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i11 = 0;
        while (i11 < size7) {
            int i12 = size7;
            cuc cucVar7 = (cuc) list.get(i11);
            if (d.F(ctk.b(cucVar7), "TextField")) {
                cvc e = cucVar7.e(k2);
                long k3 = dqs.k(k2, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size8) {
                        Object obj8 = list.get(i13);
                        int i14 = size8;
                        if (d.F(ctk.b((cuc) obj8), "Hint")) {
                            obj7 = obj8;
                            break;
                        }
                        i13++;
                        size8 = i14;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                cuc cucVar8 = (cuc) obj7;
                if (cucVar8 != null) {
                    cvcVar6 = cucVar8.e(k3);
                } else {
                    cvcVar6 = null;
                }
                int max6 = Math.max(max4, Math.max(btf.a(e), btf.a(cvcVar6)) + max5 + eo);
                int g = g(cuhVar, btf.b(cvcVar), btf.b(cvcVar2), btf.b(cvcVar3), btf.b(cvcVar4), e.a, btf.b((cvc) arsbVar.a), btf.b(cvcVar6), j);
                long k4 = dqs.k(dqt.k(k, 0, -max6, 1), 0, g, 0, 0, 9);
                if (cucVar6 != null) {
                    cvcVar7 = cucVar6.e(k4);
                } else {
                    cvcVar7 = null;
                }
                int a = btf.a(cvcVar7);
                int j3 = j(cuhVar, btf.a(cvcVar), btf.a(cvcVar2), btf.a(cvcVar3), btf.a(cvcVar4), e.b, btf.a((cvc) arsbVar.a), btf.a(cvcVar6), btf.a(cvcVar7), j);
                int i15 = j3 - a;
                int size9 = list.size();
                for (int i16 = 0; i16 < size9; i16++) {
                    cuc cucVar9 = (cuc) list.get(i16);
                    if (d.F(ctk.b(cucVar9), "Container")) {
                        if (g != Integer.MAX_VALUE) {
                            i2 = g;
                        } else {
                            i2 = 0;
                        }
                        if (i15 != Integer.MAX_VALUE) {
                            i3 = i15;
                        } else {
                            i3 = 0;
                        }
                        et = cuhVar.et(g, j3, arnw.a, new AnonymousClass3(j3, g, cvcVar, cvcVar2, cvcVar3, cvcVar4, e, arsbVar, cvcVar6, cucVar9.e(dqt.d(i2, g, i3, i15)), cvcVar7, cuhVar));
                        return et;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i11++;
            k = k;
            size7 = i12;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
