package defpackage;

import defpackage.ajw;
import defpackage.akx;
import defpackage.alf;
import defpackage.cvc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alm implements cun, all {
    public final ajw.b a;
    public final akr b;
    private final ajw.e d;
    private final float e;
    private final float f;
    private final ali i;
    private final boolean c = true;
    private final int g = Integer.MAX_VALUE;
    private final int h = Integer.MAX_VALUE;
    private final arqw j = AnonymousClass1.a;
    private final arqw k = AnonymousClass4.a;
    private final arqw l = AnonymousClass5.a;

    /* compiled from: PG */
    /* renamed from: alm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqw<ctc, Integer, Integer, Integer> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            ((Number) obj2).intValue();
            return Integer.valueOf(((ctc) obj).b(((Number) obj3).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: alm$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return a.bF(obj);
        }
    }

    /* compiled from: PG */
    /* renamed from: alm$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return a.bF(obj);
        }
    }

    /* compiled from: PG */
    /* renamed from: alm$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqw<ctc, Integer, Integer, Integer> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            ((Number) obj2).intValue();
            return Integer.valueOf(((ctc) obj).c(((Number) obj3).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: alm$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqw<ctc, Integer, Integer, Integer> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            ((Number) obj2).intValue();
            return Integer.valueOf(((ctc) obj).d(((Number) obj3).intValue()));
        }
    }

    public alm(ajw.b bVar, ajw.e eVar, float f, akr akrVar, float f2, ali aliVar) {
        this.a = bVar;
        this.d = eVar;
        this.e = f;
        this.b = akrVar;
        this.f = f2;
        this.i = aliVar;
    }

    @Override // defpackage.cun
    public final int a(ctd ctdVar, List list, int i) {
        ctc ctcVar;
        List list2 = (List) aqjn.aa(list, 1);
        ctc ctcVar2 = null;
        if (list2 != null) {
            ctcVar = (ctc) aqjn.Z(list2);
        } else {
            ctcVar = null;
        }
        List list3 = (List) aqjn.aa(list, 2);
        if (list3 != null) {
            ctcVar2 = (ctc) aqjn.Z(list3);
        }
        this.i.b(ctcVar, ctcVar2, dqt.l(i, 0, 13));
        List list4 = (List) aqjn.Z(list);
        if (list4 == null) {
            list4 = arnv.a;
        }
        return k(list4, i, ctdVar.eo(this.e), ctdVar.eo(this.f), this.i);
    }

    @Override // defpackage.cun
    public final int b(ctd ctdVar, List list, int i) {
        ctc ctcVar;
        List list2 = (List) aqjn.aa(list, 1);
        ctc ctcVar2 = null;
        if (list2 != null) {
            ctcVar = (ctc) aqjn.Z(list2);
        } else {
            ctcVar = null;
        }
        List list3 = (List) aqjn.aa(list, 2);
        if (list3 != null) {
            ctcVar2 = (ctc) aqjn.Z(list3);
        }
        this.i.b(ctcVar, ctcVar2, dqt.l(0, i, 7));
        List list4 = (List) aqjn.Z(list);
        if (list4 == null) {
            list4 = arnv.a;
        }
        int eo = ctdVar.eo(this.e);
        arqw arqwVar = this.j;
        int i2 = akz.a;
        int size = list4.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            i5 += ((Number) arqwVar.a((ctc) list4.get(i3), Integer.valueOf(i3), Integer.valueOf(i))).intValue() + eo;
            int i7 = i3 + 1;
            if (i7 - i6 == Integer.MAX_VALUE || i7 == list4.size()) {
                i4 = Math.max(i4, i5 - eo);
                i6 = i3;
                i5 = 0;
            }
            i3 = i7;
        }
        return i4;
    }

    @Override // defpackage.cun
    public final int c(ctd ctdVar, List list, int i) {
        ctc ctcVar;
        List list2 = (List) aqjn.aa(list, 1);
        ctc ctcVar2 = null;
        if (list2 != null) {
            ctcVar = (ctc) aqjn.Z(list2);
        } else {
            ctcVar = null;
        }
        List list3 = (List) aqjn.aa(list, 2);
        if (list3 != null) {
            ctcVar2 = (ctc) aqjn.Z(list3);
        }
        this.i.b(ctcVar, ctcVar2, dqt.l(i, 0, 13));
        List list4 = (List) aqjn.Z(list);
        if (list4 == null) {
            list4 = arnv.a;
        }
        return k(list4, i, ctdVar.eo(this.e), ctdVar.eo(this.f), this.i);
    }

    @Override // defpackage.cun
    public final int d(ctd ctdVar, List list, int i) {
        ctc ctcVar;
        int i2;
        List list2 = (List) aqjn.aa(list, 1);
        ctc ctcVar2 = null;
        if (list2 != null) {
            ctcVar = (ctc) aqjn.Z(list2);
        } else {
            ctcVar = null;
        }
        List list3 = (List) aqjn.aa(list, 2);
        if (list3 != null) {
            ctcVar2 = (ctc) aqjn.Z(list3);
        }
        this.i.b(ctcVar, ctcVar2, dqt.l(0, i, 7));
        List list4 = (List) aqjn.Z(list);
        if (list4 == null) {
            list4 = arnv.a;
        }
        int eo = ctdVar.eo(this.e);
        int eo2 = ctdVar.eo(this.f);
        ali aliVar = this.i;
        arqw arqwVar = this.l;
        arqw arqwVar2 = this.k;
        int i3 = akz.a;
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr = new int[size];
        int size2 = list4.size();
        int[] iArr2 = new int[size2];
        int size3 = list4.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ctc ctcVar3 = (ctc) list4.get(i4);
            Integer valueOf = Integer.valueOf(i4);
            int intValue = ((Number) arqwVar.a(ctcVar3, valueOf, Integer.valueOf(i))).intValue();
            iArr[i4] = intValue;
            iArr2[i4] = ((Number) arqwVar2.a(ctcVar3, valueOf, Integer.valueOf(intValue))).intValue();
        }
        list4.size();
        list4.size();
        if (aliVar.a == alf.a.d) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int min = Math.min(Integer.MAX_VALUE - i2, list4.size());
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += iArr[i6];
        }
        int size4 = i5 + ((list4.size() - 1) * eo);
        if (size2 != 0) {
            int i7 = iArr2[0];
            arob it = new artb(1, aqil.g(iArr2)).iterator();
            while (it.a) {
                int i8 = iArr2[it.a()];
                if (i7 < i8) {
                    i7 = i8;
                }
            }
            if (size != 0) {
                int i9 = iArr[0];
                arob it2 = new artb(1, aqil.g(iArr)).iterator();
                while (it2.a) {
                    int i10 = iArr[it2.a()];
                    if (i9 < i10) {
                        i9 = i10;
                    }
                }
                int i11 = size4;
                while (i9 <= size4 && i7 != i) {
                    i11 = (i9 + size4) / 2;
                    int[] iArr3 = iArr2;
                    int[] iArr4 = iArr;
                    long d = akz.d(list4, new alc(iArr), new ald(iArr2), i11, eo, eo2, aliVar);
                    int a = tu.a(d);
                    int b = tu.b(d);
                    if (a <= i && b >= min) {
                        if (a >= i) {
                            return i11;
                        }
                        size4 = i11 - 1;
                    } else {
                        i9 = i11 + 1;
                        if (i9 > size4) {
                            return i9;
                        }
                    }
                    iArr2 = iArr3;
                    i7 = a;
                    iArr = iArr4;
                }
                return i11;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.cun
    public final cuf e(cuh cuhVar, List list, long j) {
        cuf et;
        cuc cucVar;
        cuc cucVar2;
        alj aljVar;
        cbh cbhVar;
        cuc a;
        long j2;
        tu tuVar;
        Integer num;
        boolean z;
        long j3;
        float f;
        Integer num2;
        akx.a aVar;
        tx txVar;
        cuf et2;
        boolean z2;
        tx txVar2;
        Object obj;
        alj aljVar2;
        long j4;
        int i;
        int i2;
        tu tuVar2;
        Integer num3;
        boolean z3;
        long j5;
        Integer num4;
        int i3;
        tu tuVar3;
        int i4;
        tv tvVar;
        int i5;
        tv tvVar2;
        int i6;
        akx.a aVar2;
        Integer num5;
        int i7;
        int i8;
        cuf et3;
        cuh cuhVar2 = cuhVar;
        if (list.isEmpty() || (dqs.a(j) == 0 && this.i.a != alf.a.a)) {
            et = cuhVar2.et(0, 0, arnw.a, AnonymousClass2.a);
            return et;
        }
        List list2 = (List) aqjn.X(list);
        if (list2.isEmpty()) {
            et3 = cuhVar2.et(0, 0, arnw.a, AnonymousClass3.a);
            return et3;
        }
        List list3 = (List) aqjn.aa(list, 1);
        if (list3 != null) {
            cucVar = (cuc) aqjn.Z(list3);
        } else {
            cucVar = null;
        }
        List list4 = (List) aqjn.aa(list, 2);
        if (list4 != null) {
            cucVar2 = (cuc) aqjn.Z(list4);
        } else {
            cucVar2 = null;
        }
        list2.size();
        ali aliVar = this.i;
        ama amaVar = ama.a;
        long b = amg.b(amg.c(amg.a(j, amaVar), 10), amaVar);
        if (cucVar != null) {
            akz.f(cucVar, b, new alg(aliVar));
            aliVar.b = cucVar;
        }
        if (cucVar2 != null) {
            akz.f(cucVar2, b, new alh(aliVar));
            aliVar.d = cucVar2;
        }
        Iterator it = list2.iterator();
        float f2 = this.e;
        float f3 = this.f;
        long a2 = amg.a(j, ama.a);
        ali aliVar2 = this.i;
        cbh cbhVar2 = new cbh(new cuf[16]);
        int b2 = dqs.b(a2);
        int d = dqs.d(a2);
        int a3 = dqs.a(a2);
        tx txVar3 = new tx((byte[]) null);
        ArrayList arrayList = new ArrayList();
        float ceil = (float) Math.ceil(cuhVar2.em(f2));
        float ceil2 = (float) Math.ceil(cuhVar2.em(f3));
        long d2 = dqt.d(0, b2, 0, a3);
        long b3 = amg.b(amg.c(d2, 14), ama.a);
        arsb arsbVar = new arsb();
        if (it instanceof akq) {
            cuhVar2.eh(b2);
            cuhVar2.eh(a3);
            aljVar = new alj();
        } else {
            aljVar = null;
        }
        if (!it.hasNext()) {
            cbhVar = cbhVar2;
            a = null;
        } else {
            cbhVar = cbhVar2;
            a = akz.a(it, aljVar);
        }
        if (a != null) {
            j2 = d2;
            tuVar = new tu(akz.f(a, b3, new alb(arsbVar)));
        } else {
            j2 = d2;
            tuVar = null;
        }
        if (tuVar != null) {
            num = Integer.valueOf(tu.a(tuVar.a));
        } else {
            num = null;
        }
        if (tuVar != null) {
            z = false;
        } else {
            z = true;
        }
        if (tuVar != null) {
            j3 = b3;
            num2 = Integer.valueOf(tu.b(tuVar.a));
            f = ceil2;
        } else {
            j3 = b3;
            f = ceil2;
            num2 = null;
        }
        int i9 = (int) f;
        int i10 = (int) ceil;
        Integer num6 = num2;
        Integer num7 = num;
        tv tvVar3 = new tv((byte[]) null);
        cuc cucVar3 = a;
        tv tvVar4 = new tv((byte[]) null);
        akx akxVar = new akx(aliVar2, a2, i10, i9);
        akx.b b4 = akxVar.b(it.hasNext(), 0, tu.c(b2, a3), tuVar, 0, 0, 0, false, false);
        if (b4.b) {
            aVar = akxVar.a(b4, !z, -1, 0, b2, 0);
        } else {
            aVar = null;
        }
        int i11 = d;
        cuc cucVar4 = cucVar3;
        int i12 = b2;
        tv tvVar5 = tvVar3;
        akx.a aVar3 = aVar;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (!b4.b && cucVar4 != null) {
            num7.getClass();
            int intValue = num7.intValue();
            num6.getClass();
            tv tvVar6 = tvVar4;
            int i19 = i15 + intValue;
            int i20 = b2;
            int max = Math.max(i14, num6.intValue());
            int i21 = i12 - intValue;
            arrayList.add(cucVar4);
            txVar3.f(i13, arsbVar.a);
            int i22 = i13 + 1;
            int i23 = i22 - i16;
            if (i23 < Integer.MAX_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (aljVar != null) {
                if (z2) {
                    int i24 = i21 - i10;
                    if (i24 < 0) {
                        txVar2 = txVar3;
                        i7 = 0;
                    } else {
                        txVar2 = txVar3;
                        i7 = i24;
                    }
                } else {
                    txVar2 = txVar3;
                    i7 = i20;
                }
                cuhVar2.eh(i7);
                if (z2) {
                    i8 = a3;
                } else {
                    i8 = (a3 - max) - i9;
                    if (i8 < 0) {
                        i8 = 0;
                    }
                }
                cuhVar2.eh(i8);
            } else {
                txVar2 = txVar3;
            }
            if (!it.hasNext()) {
                obj = null;
                cucVar4 = null;
            } else {
                cucVar4 = akz.a(it, aljVar);
                obj = null;
            }
            arsbVar.a = obj;
            if (cucVar4 != null) {
                aljVar2 = aljVar;
                j4 = j3;
                i = i22;
                i2 = i9;
                tuVar2 = new tu(akz.f(cucVar4, j4, new ala(arsbVar)));
            } else {
                aljVar2 = aljVar;
                j4 = j3;
                i = i22;
                i2 = i9;
                tuVar2 = null;
            }
            if (tuVar2 != null) {
                num3 = Integer.valueOf(tu.a(tuVar2.a) + i10);
            } else {
                num3 = null;
            }
            if (tuVar2 != null) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (tuVar2 != null) {
                j5 = j4;
                num4 = Integer.valueOf(tu.b(tuVar2.a));
            } else {
                j5 = j4;
                num4 = null;
            }
            boolean hasNext = it.hasNext();
            long c = tu.c(i21, a3);
            if (tuVar2 == null) {
                i3 = a3;
                tuVar3 = null;
            } else {
                num3.getClass();
                int intValue2 = num3.intValue();
                num4.getClass();
                i3 = a3;
                tuVar3 = new tu(tu.c(intValue2, num4.intValue()));
            }
            akx.b b5 = akxVar.b(hasNext, i23, c, tuVar3, i17, i18, max, false, false);
            if (b5.a) {
                i4 = i20;
                int min = Math.min(Math.max(i11, i19), i4);
                int i25 = i18 + max;
                aVar2 = akxVar.a(b5, !z3, i17, i25, i21, i23);
                tvVar2 = tvVar6;
                tvVar2.e(max);
                int i26 = (a3 - i25) - i2;
                tvVar = tvVar5;
                int i27 = i;
                tvVar.e(i27);
                if (num3 != null) {
                    num5 = Integer.valueOf(num3.intValue() - i10);
                } else {
                    num5 = null;
                }
                i17++;
                i18 = i25 + i2;
                i3 = i26;
                num7 = num5;
                i16 = i27;
                i6 = i4;
                max = 0;
                i15 = 0;
                i11 = min;
                i5 = i16;
            } else {
                i4 = i20;
                tvVar = tvVar5;
                i5 = i;
                tvVar2 = tvVar6;
                num7 = num3;
                i15 = i19;
                i6 = i21;
                aVar2 = aVar3;
            }
            aVar3 = aVar2;
            tvVar5 = tvVar;
            tvVar4 = tvVar2;
            b4 = b5;
            a3 = i3;
            i9 = i2;
            j3 = j5;
            i14 = max;
            b2 = i4;
            aljVar = aljVar2;
            num6 = num4;
            cuhVar2 = cuhVar;
            tx txVar4 = txVar2;
            i12 = i6;
            i13 = i5;
            txVar3 = txVar4;
        }
        tx txVar5 = txVar3;
        tv tvVar7 = tvVar4;
        tv tvVar8 = tvVar5;
        if (aVar3 != null) {
            akx.a aVar4 = aVar3;
            arrayList.add(aVar4.a);
            txVar = txVar5;
            txVar.f(arrayList.size() - 1, aVar4.b);
            int i28 = tvVar8.b - 1;
            if (aVar4.d) {
                tvVar7.f(i28, Math.max(tvVar7.a(i28), tu.b(aVar4.c)));
                tvVar8.f(i28, tvVar8.b() + 1);
            } else {
                tvVar7.e(tu.b(aVar4.c));
                tvVar8.e(tvVar8.b() + 1);
            }
        } else {
            txVar = txVar5;
        }
        int size = arrayList.size();
        cvc[] cvcVarArr = new cvc[size];
        for (int i29 = 0; i29 < size; i29++) {
            cvcVarArr[i29] = (cvc) txVar.a(i29);
        }
        int i30 = tvVar8.b;
        int[] iArr = new int[i30];
        int[] iArr2 = new int[i30];
        int[] iArr3 = tvVar8.a;
        int i31 = i11;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (i32 < i30) {
            int i35 = iArr3[i32];
            int i36 = i10;
            int i37 = i32;
            int[] iArr4 = iArr3;
            int i38 = i33;
            int[] iArr5 = iArr2;
            cuf a4 = amo.a(this, i31, dqs.c(j2), dqs.b(j2), tvVar7.a(i32), i36, cuhVar, arrayList, cvcVarArr, i38, i35, iArr, i37);
            int k = a4.k();
            int j6 = a4.j();
            iArr5[i37] = j6;
            i34 += j6;
            i31 = Math.max(i31, k);
            cbhVar.n(a4);
            i32 = i37 + 1;
            iArr2 = iArr5;
            i33 = i35;
            i10 = i36;
            tvVar7 = tvVar7;
            i30 = i30;
            iArr3 = iArr4;
            arrayList = arrayList;
            cvcVarArr = cvcVarArr;
            iArr = iArr;
        }
        cbh cbhVar3 = cbhVar;
        int i39 = i31;
        int[] iArr6 = iArr2;
        int[] iArr7 = iArr;
        int i40 = cbhVar3.b;
        if (i40 == 0) {
            i34 = 0;
        }
        if (i40 == 0) {
            i39 = 0;
        }
        ajw.e eVar = this.d;
        int eo = cuhVar.eo(eVar.a()) * (cbhVar3.b - 1);
        int c2 = dqs.c(a2);
        int a5 = dqs.a(a2);
        int i41 = i34 + eo;
        if (i41 >= c2) {
            c2 = i41;
        }
        if (c2 <= a5) {
            a5 = c2;
        }
        eVar.b(cuhVar, a5, iArr6, iArr7);
        int d3 = dqs.d(a2);
        int b6 = dqs.b(a2);
        ale aleVar = new ale(cbhVar3);
        if (i39 < d3) {
            i39 = d3;
        }
        if (i39 <= b6) {
            b6 = i39;
        }
        et2 = cuhVar.et(b6, a5, arnw.a, aleVar);
        return et2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alm)) {
            return false;
        }
        alm almVar = (alm) obj;
        boolean z = almVar.c;
        if (!d.F(this.a, almVar.a) || !d.F(this.d, almVar.d) || !dqy.b(this.e, almVar.e) || !d.F(this.b, almVar.b) || !dqy.b(this.f, almVar.f)) {
            return false;
        }
        int i = almVar.g;
        int i2 = almVar.h;
        if (d.F(this.i, almVar.i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.amn
    public final /* synthetic */ int f(cvc cvcVar) {
        return cvcVar.t();
    }

    @Override // defpackage.amn
    public final /* synthetic */ int g(cvc cvcVar) {
        return cvcVar.u();
    }

    @Override // defpackage.amn
    public final /* synthetic */ void h(int i, int[] iArr, int[] iArr2, cuh cuhVar) {
        this.a.b(cuhVar, i, iArr, cuhVar.q(), iArr2);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 38161) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(this.f)) * 31) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.i.hashCode();
    }

    @Override // defpackage.amn
    public final /* synthetic */ long i(int i, int i2, int i3, boolean z) {
        return amq.b(z, i, i2, i3);
    }

    @Override // defpackage.amn
    public final /* synthetic */ cuf j(cvc[] cvcVarArr, cuh cuhVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        cuf et;
        et = cuhVar.et(i, i2, arnw.a, new alk(iArr2, i3, i4, i5, cvcVarArr, this, i2, drk.a, iArr));
        return et;
    }

    public final int k(List list, int i, int i2, int i3, ali aliVar) {
        return tu.a(akz.d(list, this.l, this.k, i, i2, i3, aliVar));
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.d + ", mainAxisSpacing=" + ((Object) dqy.a(this.e)) + ", crossAxisAlignment=" + this.b + ", crossAxisArrangementSpacing=" + ((Object) dqy.a(this.f)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.i + ')';
    }
}
