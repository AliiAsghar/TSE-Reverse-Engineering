package defpackage;

import defpackage.cga;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhe {
    public final cga.c a;
    public final cxn b;
    public final dgy c;
    public boolean d;
    public final int e;
    private final boolean f;
    private dhe g;

    /* compiled from: PG */
    /* renamed from: dhe$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends cga.c implements czk {
        final /* synthetic */ arqr a;

        public AnonymousClass1(arqr arqrVar) {
            this.a = arqrVar;
        }

        @Override // defpackage.czk
        public final void dM(dho dhoVar) {
            this.a.a(dhoVar);
        }

        @Override // defpackage.czk
        public final /* synthetic */ boolean dY() {
            return false;
        }

        @Override // defpackage.czk
        public final /* synthetic */ boolean dZ() {
            return false;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhe$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cxn, Boolean> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return d.aJ((cxn) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dhe$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<cxn, Boolean> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return d.aJ((cxn) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dhe$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<cxn, Boolean> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(((cxn) obj).w.j(8));
        }
    }

    public dhe(cga.c cVar, boolean z, cxn cxnVar, dgy dgyVar) {
        this.a = cVar;
        this.f = z;
        this.b = cxnVar;
        this.c = dgyVar;
        this.e = cxnVar.d;
    }

    public static /* synthetic */ List m(dhe dheVar, boolean z, int i) {
        boolean z2;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z2 = !dheVar.f;
        } else {
            z2 = false;
        }
        if ((i & 2) == 0) {
            z3 = true;
        }
        return dheVar.l(z2, z & z3);
    }

    private final dhe p(dgv dgvVar, arqr arqrVar) {
        int i;
        int i2;
        dgy dgyVar = new dgy();
        dgyVar.a = false;
        dgyVar.b = false;
        arqrVar.a(dgyVar);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(arqrVar);
        if (dgvVar != null) {
            i = this.e;
            i2 = 1000000000;
        } else {
            i = this.e;
            i2 = 2000000000;
        }
        dhe dheVar = new dhe(anonymousClass1, false, new cxn(true, i + i2), dgyVar);
        dheVar.d = true;
        dheVar.g = this;
        return dheVar;
    }

    private final void q(List list, dgy dgyVar) {
        int i;
        long[] jArr;
        int i2;
        int i3;
        long[] jArr2;
        if (!this.c.b) {
            int size = list.size();
            n(list, false);
            int size2 = list.size();
            while (size < size2) {
                dhe dheVar = (dhe) list.get(size);
                if (!dheVar.r()) {
                    ve veVar = dheVar.c.c;
                    Object[] objArr = veVar.b;
                    Object[] objArr2 = veVar.c;
                    long[] jArr3 = veVar.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr3[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = i4 - length;
                                int i6 = 0;
                                while (true) {
                                    char c = '\b';
                                    i2 = 8 - ((~i5) >>> 31);
                                    if (i6 >= i2) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i7 = (i4 << 3) + i6;
                                        Object obj = objArr[i7];
                                        Object obj2 = objArr2[i7];
                                        dhn dhnVar = (dhn) obj;
                                        i3 = size2;
                                        Object a = dgyVar.c.a(dhnVar);
                                        dhnVar.getClass();
                                        jArr2 = jArr3;
                                        Object a2 = dhnVar.b.a(a, obj2);
                                        if (a2 != null) {
                                            dgyVar.c.j(dhnVar, a2);
                                        }
                                        c = '\b';
                                    } else {
                                        i3 = size2;
                                        jArr2 = jArr3;
                                    }
                                    j >>= c;
                                    i6++;
                                    size2 = i3;
                                    jArr3 = jArr2;
                                }
                                i = size2;
                                jArr = jArr3;
                                if (i2 != 8) {
                                    break;
                                }
                            } else {
                                i = size2;
                                jArr = jArr3;
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                            size2 = i;
                            jArr3 = jArr;
                        }
                    } else {
                        i = size2;
                    }
                    dheVar.q(list, dgyVar);
                } else {
                    i = size2;
                }
                size++;
                size2 = i;
            }
        }
    }

    private final boolean r() {
        if (this.f && this.c.a) {
            return true;
        }
        return false;
    }

    private final void s(cxn cxnVar, List list) {
        cbh n = cxnVar.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                cxn cxnVar2 = (cxn) objArr[i2];
                if (cxnVar2.am() && !cxnVar2.C) {
                    if (cxnVar2.w.j(8)) {
                        list.add(dhf.b(cxnVar2, this.f));
                    } else {
                        s(cxnVar2, list);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void t(List list, List list2) {
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            dhe dheVar = (dhe) list.get(size2);
            if (dheVar.r()) {
                list2.add(dheVar);
            } else if (!dheVar.c.b) {
                dheVar.t(list, list2);
            }
        }
    }

    public final long a() {
        cyn d = d();
        if (d != null) {
            if (true != d.r()) {
                d = null;
            }
            if (d != null) {
                return ctj.a(d);
            }
        }
        return 0L;
    }

    public final cjp b() {
        cyn d = d();
        if (d != null) {
            if (true != d.r()) {
                d = null;
            }
            if (d != null) {
                return ctj.d(d);
            }
        }
        return cjp.a;
    }

    public final cjp c() {
        cyn d = d();
        if (d != null) {
            if (true != d.r()) {
                d = null;
            }
            if (d != null) {
                return ctj.e(d);
            }
        }
        return cjp.a;
    }

    public final cyn d() {
        if (this.d) {
            dhe g = g();
            if (g != null) {
                return g.d();
            }
            return null;
        }
        cwo a = dhf.a(this.b);
        if (a == null) {
            a = this.a;
        }
        return cwp.f(a, 8);
    }

    public final dgy e() {
        int i;
        if (r()) {
            dgy dgyVar = this.c;
            dgy dgyVar2 = new dgy();
            dgyVar2.a = dgyVar.a;
            dgyVar2.b = dgyVar.b;
            ve veVar = dgyVar2.c;
            ve veVar2 = dgyVar.c;
            Object[] objArr = veVar2.b;
            Object[] objArr2 = veVar2.c;
            long[] jArr = veVar2.a;
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
                                int i5 = (i2 << 3) + i4;
                                veVar.j(objArr[i5], objArr2[i5]);
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
            q(new ArrayList(), dgyVar2);
            return dgyVar2;
        }
        return this.c;
    }

    public final dhe f() {
        return new dhe(this.a, true, this.b, this.c);
    }

    public final dhe g() {
        cxn cxnVar;
        dhe dheVar = this.g;
        if (dheVar != null) {
            return dheVar;
        }
        if (this.f) {
            cxnVar = d.aK(this.b, AnonymousClass3.a);
        } else {
            cxnVar = null;
        }
        if (cxnVar == null) {
            cxnVar = d.aK(this.b, AnonymousClass4.a);
        }
        if (cxnVar == null) {
            return null;
        }
        return dhf.b(cxnVar, this.f);
    }

    public final List h() {
        return m(this, false, 7);
    }

    public final List i() {
        return m(this, true, 4);
    }

    public final boolean j() {
        cyn d = d();
        if (d != null) {
            return d.aq();
        }
        return false;
    }

    public final boolean k() {
        if (!this.d && i().isEmpty() && d.aK(this.b, AnonymousClass2.a) == null) {
            return true;
        }
        return false;
    }

    public final List l(boolean z, boolean z2) {
        if (!z && this.c.b) {
            return arnv.a;
        }
        ArrayList arrayList = new ArrayList();
        if (r()) {
            ArrayList arrayList2 = new ArrayList();
            t(arrayList, arrayList2);
            return arrayList2;
        }
        return n(arrayList, z2);
    }

    public final List n(List list, boolean z) {
        String str;
        if (this.d) {
            return arnv.a;
        }
        s(this.b, list);
        if (z) {
            dgy dgyVar = this.c;
            dhn dhnVar = dhh.a;
            dgv dgvVar = (dgv) dgz.a(dgyVar, dhh.u);
            if (dgvVar != null && this.c.a && !list.isEmpty()) {
                list.add(p(dgvVar, new dhc(dgvVar)));
            }
            if (this.c.d(dhh.a) && !list.isEmpty()) {
                dgy dgyVar2 = this.c;
                if (dgyVar2.a) {
                    List list2 = (List) dgz.a(dgyVar2, dhh.a);
                    if (list2 != null) {
                        str = (String) aqjn.Z(list2);
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        list.add(0, p(null, new dhd(str)));
                    }
                }
            }
        }
        return list;
    }
}
