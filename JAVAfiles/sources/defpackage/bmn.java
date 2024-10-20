package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmn implements cun {

    /* compiled from: PG */
    /* renamed from: bmn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass1 extends arrm implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, ctc.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).a(((Number) obj2).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: bmn$2, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass2 extends arrm implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(2, ctc.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).b(((Number) obj2).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: bmn$3, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass3 extends arrm implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(2, ctc.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).c(((Number) obj2).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: bmn$4, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass4 extends arrm implements arqv<ctc, Integer, Integer> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(2, ctc.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((ctc) obj).d(((Number) obj2).intValue()));
        }
    }

    private static final int f(ctd ctdVar, List list, int i, arqv arqvVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        List list2 = (List) list.get(0);
        boolean z2 = true;
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        int c = btf.c(i, ctdVar.eo(32.0f));
        ctc ctcVar = (ctc) aqjn.Z(list5);
        if (ctcVar != null) {
            i2 = ((Number) arqvVar.a(ctcVar, Integer.valueOf(c))).intValue();
            c = btf.c(c, ctcVar.b(Integer.MAX_VALUE));
        } else {
            i2 = 0;
        }
        ctc ctcVar2 = (ctc) aqjn.Z(list6);
        if (ctcVar2 != null) {
            i3 = ((Number) arqvVar.a(ctcVar2, Integer.valueOf(c))).intValue();
            c = btf.c(c, ctcVar2.b(Integer.MAX_VALUE));
        } else {
            i3 = 0;
        }
        Object obj = (ctc) aqjn.Z(list3);
        if (obj != null) {
            i4 = ((Number) arqvVar.a(obj, Integer.valueOf(c))).intValue();
        } else {
            i4 = 0;
        }
        Object obj2 = (ctc) aqjn.Z(list4);
        if (obj2 != null) {
            i5 = ((Number) arqvVar.a(obj2, Integer.valueOf(c))).intValue();
        } else {
            i5 = 0;
        }
        boolean d = bml.d(ctdVar, i5);
        if (i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i5 <= 0) {
            z2 = false;
        }
        int a = bmo.a(z, z2, d);
        Object obj3 = (ctc) aqjn.Z(list2);
        if (obj3 != null) {
            i6 = ((Number) arqvVar.a(obj3, Integer.valueOf(i))).intValue();
        } else {
            i6 = 0;
        }
        float a2 = bml.a(a);
        return bml.b(ctdVar, i2, i3, i6, i4, i5, a, ctdVar.eo(a2 + a2), dqt.l(0, 0, 15));
    }

    private static final int g(ctd ctdVar, List list, int i, arqv arqvVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        ctc ctcVar = (ctc) aqjn.Z(list5);
        if (ctcVar != null) {
            i2 = ((Number) arqvVar.a(ctcVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = 0;
        }
        ctc ctcVar2 = (ctc) aqjn.Z(list6);
        if (ctcVar2 != null) {
            i3 = ((Number) arqvVar.a(ctcVar2, Integer.valueOf(i))).intValue();
        } else {
            i3 = 0;
        }
        ctc ctcVar3 = (ctc) aqjn.Z(list2);
        if (ctcVar3 != null) {
            i4 = ((Number) arqvVar.a(ctcVar3, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        ctc ctcVar4 = (ctc) aqjn.Z(list3);
        if (ctcVar4 != null) {
            i5 = ((Number) arqvVar.a(ctcVar4, Integer.valueOf(i))).intValue();
        } else {
            i5 = 0;
        }
        ctc ctcVar5 = (ctc) aqjn.Z(list4);
        if (ctcVar5 != null) {
            i6 = ((Number) arqvVar.a(ctcVar5, Integer.valueOf(i))).intValue();
        } else {
            i6 = 0;
        }
        return bml.e(i2, i3, i4, i5, i6, ctdVar.eo(32.0f), dqt.l(0, 0, 15));
    }

    @Override // defpackage.cun
    public final int a(ctd ctdVar, List list, int i) {
        return f(ctdVar, list, i, AnonymousClass1.a);
    }

    @Override // defpackage.cun
    public final int b(ctd ctdVar, List list, int i) {
        return g(ctdVar, list, i, AnonymousClass2.a);
    }

    @Override // defpackage.cun
    public final int c(ctd ctdVar, List list, int i) {
        return f(ctdVar, list, i, AnonymousClass3.a);
    }

    @Override // defpackage.cun
    public final int d(ctd ctdVar, List list, int i) {
        return g(ctdVar, list, i, AnonymousClass4.a);
    }

    @Override // defpackage.cun
    public final cuf e(cuh cuhVar, List list, long j) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        cvc cvcVar;
        cvc cvcVar2;
        cvc cvcVar3;
        cvc cvcVar4;
        boolean z3;
        boolean z4;
        cuf et;
        boolean z5 = false;
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        long k = dqs.k(j, 0, 0, 0, 0, 10);
        int eo = cuhVar.eo(32.0f);
        cuc cucVar = (cuc) aqjn.Z(list5);
        if (cucVar != null) {
            i = cucVar.d(dqs.a(j));
        } else {
            i = 0;
        }
        cuc cucVar2 = (cuc) aqjn.Z(list6);
        if (cucVar2 != null) {
            i2 = cucVar2.d(dqs.a(j));
        } else {
            i2 = 0;
        }
        int b = dqs.b(k);
        int i4 = i + i2 + eo;
        cuc cucVar3 = (cuc) aqjn.Z(list4);
        if (cucVar3 != null) {
            i3 = cucVar3.c(btf.c(b, i4));
        } else {
            i3 = 0;
        }
        boolean d = bml.d(cuhVar, i3);
        if (aqjn.Z(list3) != null) {
            z = true;
        } else {
            z = false;
        }
        if (aqjn.Z(list4) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        float a = bml.a(bmo.a(z, z2, d));
        long h = dqt.h(k, -eo, -cuhVar.eo(a + a));
        cuc cucVar4 = (cuc) aqjn.Z(list5);
        cvc cvcVar5 = null;
        if (cucVar4 != null) {
            cvcVar = cucVar4.e(h);
        } else {
            cvcVar = null;
        }
        int b2 = btf.b(cvcVar);
        cuc cucVar5 = (cuc) aqjn.Z(list6);
        if (cucVar5 != null) {
            cvcVar2 = cucVar5.e(dqt.k(h, -b2, 0, 2));
        } else {
            cvcVar2 = null;
        }
        int b3 = b2 + btf.b(cvcVar2);
        cuc cucVar6 = (cuc) aqjn.Z(list2);
        if (cucVar6 != null) {
            cvcVar3 = cucVar6.e(dqt.k(h, -b3, 0, 2));
        } else {
            cvcVar3 = null;
        }
        int a2 = btf.a(cvcVar3);
        cuc cucVar7 = (cuc) aqjn.Z(list4);
        if (cucVar7 != null) {
            cvcVar4 = cucVar7.e(dqt.h(h, -b3, -a2));
        } else {
            cvcVar4 = null;
        }
        int a3 = a2 + btf.a(cvcVar4);
        if (cvcVar4 != null && cvcVar4.ei(csi.a) != cvcVar4.ei(csi.b)) {
            z3 = true;
        } else {
            z3 = false;
        }
        cuc cucVar8 = (cuc) aqjn.Z(list3);
        if (cucVar8 != null) {
            cvcVar5 = cucVar8.e(dqt.h(h, -b3, -a3));
        }
        cvc cvcVar6 = cvcVar5;
        if (cvcVar6 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (cvcVar4 != null) {
            z5 = true;
        }
        int a4 = bmo.a(z4, z5, z3);
        int e = bml.e(btf.b(cvcVar), btf.b(cvcVar2), btf.b(cvcVar3), btf.b(cvcVar6), btf.b(cvcVar4), eo, j);
        int a5 = btf.a(cvcVar);
        int a6 = btf.a(cvcVar2);
        int a7 = btf.a(cvcVar3);
        int a8 = btf.a(cvcVar6);
        int a9 = btf.a(cvcVar4);
        float a10 = bml.a(a4);
        int b4 = bml.b(cuhVar, a5, a6, a7, a8, a9, a4, cuhVar.eo(a10 + a10), j);
        boolean bA = a.bA(a4, 3);
        cvc cvcVar7 = cvcVar;
        cvc cvcVar8 = cvcVar2;
        et = cuhVar.et(e, b4, arnw.a, new bmm(cvcVar7, cvcVar8, cuhVar.eo(16.0f), bA, cuhVar.eo(a10), cvcVar3, cvcVar6, cvcVar4, b4, e, cuhVar.eo(16.0f)));
        return et;
    }
}
