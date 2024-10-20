package defpackage;

import defpackage.bru;
import defpackage.cfq;
import defpackage.cvc;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class brw implements cue {
    public final boolean a;
    public final bru b;
    public final float c;
    public final amj d;
    public final float e;

    /* compiled from: PG */
    /* renamed from: brw$1, reason: invalid class name */
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
    /* renamed from: brw$2, reason: invalid class name */
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
    /* renamed from: brw$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ arsb a;
        final /* synthetic */ brw b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ cuh e;
        final /* synthetic */ int f;
        final /* synthetic */ int g;
        final /* synthetic */ cvc h;
        final /* synthetic */ cvc i;
        final /* synthetic */ cvc j;
        final /* synthetic */ cvc k;
        final /* synthetic */ cvc l;
        final /* synthetic */ cvc m;
        final /* synthetic */ cvc n;
        final /* synthetic */ cvc o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arsb arsbVar, brw brwVar, int i, int i2, cuh cuhVar, int i3, int i4, cvc cvcVar, cvc cvcVar2, cvc cvcVar3, cvc cvcVar4, cvc cvcVar5, cvc cvcVar6, cvc cvcVar7, cvc cvcVar8) {
            super(1);
            this.a = arsbVar;
            this.b = brwVar;
            this.c = i;
            this.d = i2;
            this.e = cuhVar;
            this.f = i3;
            this.g = i4;
            this.h = cvcVar;
            this.i = cvcVar2;
            this.j = cvcVar3;
            this.k = cvcVar4;
            this.l = cvcVar5;
            this.m = cvcVar6;
            this.n = cvcVar7;
            this.o = cvcVar8;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int eo;
            cvc cvcVar;
            int b;
            int i;
            cvc.a aVar = (cvc.a) obj;
            if (this.a.a != null) {
                brw brwVar = this.b;
                if (brwVar.a) {
                    int i2 = cfq.a;
                    eo = cfq.a.k.a(((cvc) this.a.a).b, this.c);
                } else {
                    eo = this.e.eo(brwVar.e) + this.d;
                }
                int i3 = this.d;
                brw brwVar2 = this.b;
                int i4 = this.f;
                int i5 = this.g;
                cvc cvcVar2 = this.h;
                cvc cvcVar3 = (cvc) this.a.a;
                cvc cvcVar4 = this.i;
                cvc cvcVar5 = this.j;
                cvc cvcVar6 = this.k;
                cvc cvcVar7 = this.l;
                cvc cvcVar8 = this.m;
                cvc cvcVar9 = this.n;
                cvc cvcVar10 = this.o;
                int i6 = cvcVar3.b + i3;
                drk q = this.e.q();
                aVar.e(cvcVar9, 0, 0, brg.a);
                int a = i5 - btf.a(cvcVar10);
                if (cvcVar5 != null) {
                    int i7 = cfq.a;
                    cvcVar = cvcVar10;
                    cvc.a.m(aVar, cvcVar5, 0, cfq.a.k.a(cvcVar5.b, a));
                } else {
                    cvcVar = cvcVar10;
                }
                int c = drv.c(eo, i3, brwVar2.c);
                if (q == drk.a) {
                    b = btf.b(cvcVar5);
                } else {
                    b = btf.b(cvcVar6);
                }
                bru bruVar = brwVar2.b;
                int a2 = ((bru.a) bruVar).b.a(cvcVar3.a, (i4 - btf.b(cvcVar5)) - btf.b(cvcVar6), q) + b;
                bru bruVar2 = brwVar2.b;
                aVar.e(cvcVar3, drv.c(a2, ((bru.a) bruVar2).a.a(cvcVar3.a, (i4 - btf.b(cvcVar5)) - btf.b(cvcVar6), q) + b, brwVar2.c), c, brg.a);
                if (cvcVar7 != null) {
                    cvc.a.m(aVar, cvcVar7, btf.b(cvcVar5), i6);
                }
                int b2 = btf.b(cvcVar5) + btf.b(cvcVar7);
                cvc.a.m(aVar, cvcVar2, b2, i6);
                if (cvcVar4 != null) {
                    cvc.a.m(aVar, cvcVar4, b2, i6);
                }
                if (cvcVar8 != null) {
                    cvc.a.m(aVar, cvcVar8, (i4 - btf.b(cvcVar6)) - cvcVar8.a, i6);
                }
                if (cvcVar6 != null) {
                    int i8 = i4 - cvcVar6.a;
                    int i9 = cfq.a;
                    i = a;
                    cvc.a.m(aVar, cvcVar6, i8, cfq.a.k.a(cvcVar6.b, i));
                } else {
                    i = a;
                }
                if (cvcVar != null) {
                    cvc.a.m(aVar, cvcVar, 0, i);
                }
            } else {
                brw brwVar3 = this.b;
                int i10 = this.f;
                int i11 = this.g;
                cvc cvcVar11 = this.h;
                cvc cvcVar12 = this.i;
                cvc cvcVar13 = this.j;
                cvc cvcVar14 = this.k;
                cvc cvcVar15 = this.l;
                cvc cvcVar16 = this.m;
                cvc cvcVar17 = this.n;
                cvc cvcVar18 = this.o;
                float ec = this.e.ec();
                aVar.f(cvcVar17, 0L, brg.a);
                int a3 = i11 - btf.a(cvcVar18);
                int g = arsk.g(((amk) brwVar3.d).a * ec);
                if (cvcVar13 != null) {
                    int i12 = cfq.a;
                    cvc.a.m(aVar, cvcVar13, 0, cfq.a.k.a(cvcVar13.b, a3));
                }
                if (cvcVar15 != null) {
                    cvc.a.m(aVar, cvcVar15, btf.b(cvcVar13), brw.f(brwVar3, a3, g, cvcVar15));
                }
                int b3 = btf.b(cvcVar13) + btf.b(cvcVar15);
                cvc.a.m(aVar, cvcVar11, b3, brw.f(brwVar3, a3, g, cvcVar11));
                if (cvcVar12 != null) {
                    cvc.a.m(aVar, cvcVar12, b3, brw.f(brwVar3, a3, g, cvcVar12));
                }
                if (cvcVar16 != null) {
                    cvc.a.m(aVar, cvcVar16, (i10 - btf.b(cvcVar14)) - cvcVar16.a, brw.f(brwVar3, a3, g, cvcVar16));
                }
                if (cvcVar14 != null) {
                    int i13 = i10 - cvcVar14.a;
                    int i14 = cfq.a;
                    cvc.a.m(aVar, cvcVar14, i13, cfq.a.k.a(cvcVar14.b, a3));
                }
                if (cvcVar18 != null) {
                    cvc.a.m(aVar, cvcVar18, 0, a3);
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: brw$4, reason: invalid class name */
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
    /* renamed from: brw$5, reason: invalid class name */
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

    public brw(boolean z, bru bruVar, float f, amj amjVar, float f2) {
        this.a = z;
        this.b = bruVar;
        this.c = f;
        this.d = amjVar;
        this.e = f2;
    }

    public static final int f(brw brwVar, int i, int i2, cvc cvcVar) {
        if (brwVar.a) {
            int i3 = cfq.a;
            return cfq.a.k.a(cvcVar.b, i);
        }
        return i2;
    }

    private final int g(ctd ctdVar, List list, int i, arqv arqvVar) {
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
            i3 = btf.c(i, ctcVar.b(Integer.MAX_VALUE));
            i2 = ((Number) arqvVar.a(ctcVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = 0;
            i3 = i;
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
            i3 = btf.c(i3, ctcVar2.b(Integer.MAX_VALUE));
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
            i5 = ((Number) arqvVar.a(obj8, Integer.valueOf(i3))).intValue();
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
            int intValue = ((Number) arqvVar.a(ctcVar3, Integer.valueOf(i3))).intValue();
            i3 = btf.c(i3, ctcVar3.b(Integer.MAX_VALUE));
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
            int intValue2 = ((Number) arqvVar.a(ctcVar4, Integer.valueOf(i3))).intValue();
            i3 = btf.c(i3, ctcVar4.b(Integer.MAX_VALUE));
            i7 = intValue2;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i15 = 0; i15 < size6; i15++) {
            Object obj9 = list.get(i15);
            if (d.F(btf.d((ctc) obj9), "TextField")) {
                int intValue3 = ((Number) arqvVar.a(obj9, Integer.valueOf(i3))).intValue();
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
                    i8 = ((Number) arqvVar.a(obj10, Integer.valueOf(i3))).intValue();
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
                return j(ctdVar, intValue3, i5, i2, i4, i6, i7, i8, i9, dqt.l(0, 0, 15));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final int h(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, dqs.d(j));
    }

    private static final int i(List list, int i, arqv arqvVar) {
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
                        if (d.F(btf.d((ctc) obj4), "Prefix")) {
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
                        if (d.F(btf.d((ctc) obj5), "Suffix")) {
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
                        if (d.F(btf.d((ctc) obj6), "Leading")) {
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
                return h(i6, i3, i4, i5, intValue, i2, i7, dqt.l(0, 0, 15));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int j(dqv dqvVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        amk amkVar = (amk) this.d;
        int eo = dqvVar.eo(amkVar.a + amkVar.b);
        int i9 = 0;
        int r = arrj.r(i, i7, i5, i6, drv.c(i2, 0, this.c));
        if (i2 > 0) {
            float f = this.e;
            int eo2 = dqvVar.eo(f + f);
            aae aaeVar = bva.a;
            i9 = Math.max(eo2, drv.c(0, i2, bva.a.a(this.c)));
        }
        return Math.max(dqs.c(j), Math.max(i3, Math.max(i4, eo + i9 + r)) + i8);
    }

    @Override // defpackage.cue
    public final int a(ctd ctdVar, List list, int i) {
        return g(ctdVar, list, i, AnonymousClass1.a);
    }

    @Override // defpackage.cue
    public final int b(ctd ctdVar, List list, int i) {
        return i(list, i, AnonymousClass2.a);
    }

    @Override // defpackage.cue
    public final int c(ctd ctdVar, List list, int i) {
        return g(ctdVar, list, i, AnonymousClass4.a);
    }

    @Override // defpackage.cue
    public final int d(ctd ctdVar, List list, int i) {
        return i(list, i, AnonymousClass5.a);
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
        Object obj6;
        int i;
        int i2;
        Object obj7;
        cvc cvcVar6;
        cvc cvcVar7;
        int i3;
        int i4;
        cuf et;
        int eo = cuhVar.eo(((amk) this.d).a);
        int eo2 = cuhVar.eo(((amk) this.d).b);
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
        int i10 = -b4;
        cuc cucVar5 = (cuc) obj5;
        arsb arsbVar = new arsb();
        long h = dqt.h(k, i10, -eo2);
        if (cucVar5 != null) {
            cvcVar5 = cucVar5.e(h);
        } else {
            cvcVar5 = null;
        }
        arsbVar.a = cvcVar5;
        int size6 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size6) {
                obj6 = list.get(i11);
                if (d.F(ctk.b((cuc) obj6), "Supporting")) {
                    break;
                }
                i11++;
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
        int a = btf.a((cvc) arsbVar.a) + eo;
        long h2 = dqt.h(dqs.k(j, 0, 0, 0, 0, 11), i10, ((-a) - eo2) - i);
        int size7 = list.size();
        int i12 = 0;
        while (i12 < size7) {
            int i13 = size7;
            cuc cucVar7 = (cuc) list.get(i12);
            int i14 = i12;
            if (d.F(ctk.b(cucVar7), "TextField")) {
                cvc e = cucVar7.e(h2);
                long k2 = dqs.k(h2, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size8) {
                        obj7 = list.get(i15);
                        int i16 = size8;
                        i2 = eo;
                        if (d.F(ctk.b((cuc) obj7), "Hint")) {
                            break;
                        }
                        i15++;
                        size8 = i16;
                        eo = i2;
                    } else {
                        i2 = eo;
                        obj7 = null;
                        break;
                    }
                }
                cuc cucVar8 = (cuc) obj7;
                if (cucVar8 != null) {
                    cvcVar6 = cucVar8.e(k2);
                } else {
                    cvcVar6 = null;
                }
                int max5 = Math.max(max4, Math.max(btf.a(e), btf.a(cvcVar6)) + a + eo2);
                int h3 = h(btf.b(cvcVar), btf.b(cvcVar2), btf.b(cvcVar3), btf.b(cvcVar4), e.a, btf.b((cvc) arsbVar.a), btf.b(cvcVar6), j);
                long k3 = dqs.k(dqt.k(k, 0, -max5, 1), 0, h3, 0, 0, 9);
                if (cucVar6 != null) {
                    cvcVar7 = cucVar6.e(k3);
                } else {
                    cvcVar7 = null;
                }
                int a2 = btf.a(cvcVar7);
                cvc cvcVar8 = cvcVar3;
                int j2 = j(cuhVar, e.b, btf.a((cvc) arsbVar.a), btf.a(cvcVar), btf.a(cvcVar2), btf.a(cvcVar3), btf.a(cvcVar4), btf.a(cvcVar6), btf.a(cvcVar7), j);
                int i17 = j2 - a2;
                int size9 = list.size();
                for (int i18 = 0; i18 < size9; i18++) {
                    cuc cucVar9 = (cuc) list.get(i18);
                    if (d.F(ctk.b(cucVar9), "Container")) {
                        if (h3 != Integer.MAX_VALUE) {
                            i3 = h3;
                        } else {
                            i3 = 0;
                        }
                        if (i17 != Integer.MAX_VALUE) {
                            i4 = i17;
                        } else {
                            i4 = 0;
                        }
                        et = cuhVar.et(h3, j2, arnw.a, new AnonymousClass3(arsbVar, this, i17, i2, cuhVar, h3, j2, e, cvcVar6, cvcVar, cvcVar2, cvcVar8, cvcVar4, cucVar9.e(dqt.d(i3, h3, i4, i17)), cvcVar7));
                        return et;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i12 = i14 + 1;
            size7 = i13;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
