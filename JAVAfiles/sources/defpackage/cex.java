package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cex {
    public static cev d;
    public static int e;
    public static List g;
    public static List h;
    public static final AtomicReference i;
    private static final ces k;
    private static final cdh l;
    public static final arqr a = AnonymousClass2.a;
    public static final cdq b = new cdq();
    public static final Object c = new Object();
    public static final ceu f = new ceu();
    private static final cfe j = new cfe();

    /* compiled from: PG */
    /* renamed from: cex$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cev, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cex$2 */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cev, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cex$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<Object, arnb> {
        final /* synthetic */ arqr a;
        final /* synthetic */ arqr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqr arqrVar, arqr arqrVar2) {
            super(1);
            this.a = arqrVar;
            this.b = arqrVar2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.a(obj);
            this.b.a(obj);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cex$4 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<Object, arnb> {
        final /* synthetic */ arqr a;
        final /* synthetic */ arqr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(arqr arqrVar, arqr arqrVar2) {
            super(1);
            this.a = arqrVar;
            this.b = arqrVar2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.a(obj);
            this.b.a(obj);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cex$5 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr {
        final /* synthetic */ arqr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arqr arqrVar) {
            super(1);
            this.a = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ces cesVar = (ces) this.a.a((cev) obj);
            synchronized (cex.c) {
                cex.d = cex.d.d(cesVar.v());
            }
            return cesVar;
        }
    }

    static {
        d = cev.a;
        e = 2;
        arnv arnvVar = arnv.a;
        g = arnvVar;
        h = arnvVar;
        int i2 = e;
        e = i2 + 1;
        cel celVar = new cel(i2, cev.a);
        d = d.d(celVar.h);
        AtomicReference atomicReference = new AtomicReference(celVar);
        i = atomicReference;
        k = (ces) atomicReference.get();
        l = new cdh();
    }

    public static final void A() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean B(cfg cfgVar) {
        cfi cfiVar;
        int a2 = f.a(e);
        cfi cfiVar2 = null;
        int i2 = 0;
        cfi cfiVar3 = null;
        for (cfi e2 = cfgVar.e(); e2 != null; e2 = e2.h) {
            int i3 = e2.g;
            if (i3 != 0) {
                if (i3 < a2) {
                    if (cfiVar2 == null) {
                        i2++;
                        cfiVar2 = e2;
                    } else {
                        int i4 = cfiVar2.g;
                        if (i3 < i4) {
                            cfiVar = e2;
                        } else {
                            cfiVar = cfiVar2;
                        }
                        if (i3 >= i4) {
                            cfiVar2 = e2;
                        }
                        if (cfiVar3 == null) {
                            cfiVar3 = cfgVar.e();
                            cfi cfiVar4 = cfiVar3;
                            while (true) {
                                if (cfiVar3 != null) {
                                    int i5 = cfiVar3.g;
                                    if (i5 >= a2) {
                                        break;
                                    }
                                    if (cfiVar4.g < i5) {
                                        cfiVar4 = cfiVar3;
                                    }
                                    cfiVar3 = cfiVar3.h;
                                } else {
                                    cfiVar3 = cfiVar4;
                                    break;
                                }
                            }
                        }
                        cfiVar.g = 0;
                        cfiVar.b(cfiVar3);
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    private static final boolean C(cfi cfiVar, int i2, cev cevVar) {
        int i3 = cfiVar.g;
        if (i3 != 0 && i3 <= i2 && !cevVar.e(i3)) {
            return true;
        }
        return false;
    }

    public static final ces a(ces cesVar, arqr arqrVar, boolean z) {
        cem cemVar;
        boolean z2 = cesVar instanceof cem;
        if (!z2 && cesVar != null) {
            return new cfl(cesVar, arqrVar, z);
        }
        if (z2) {
            cemVar = (cem) cesVar;
        } else {
            cemVar = null;
        }
        return new cfk(cemVar, arqrVar, null, false, z);
    }

    public static final ces b() {
        ces cesVar = (ces) b.a();
        if (cesVar == null) {
            return (ces) i.get();
        }
        return cesVar;
    }

    public static final ces c(arqr arqrVar) {
        return (ces) m(new AnonymousClass5(arqrVar));
    }

    public static final cev d(cev cevVar, int i2, int i3) {
        while (i2 < i3) {
            cevVar = cevVar.d(i2);
            i2++;
        }
        return cevVar;
    }

    public static final cfi e(cfi cfiVar) {
        cfi k2;
        ces b2 = b();
        cfi k3 = k(cfiVar, b2.v(), b2.x());
        if (k3 == null) {
            synchronized (c) {
                ces b3 = b();
                k2 = k(cfiVar, b3.v(), b3.x());
            }
            if (k2 != null) {
                return k2;
            }
            z();
            throw new armj();
        }
        return k3;
    }

    public static final cfi f(cfi cfiVar, ces cesVar) {
        cfi k2 = k(cfiVar, cesVar.v(), cesVar.x());
        if (k2 != null) {
            return k2;
        }
        z();
        throw new armj();
    }

    public static final cfi g(cfi cfiVar, cfg cfgVar) {
        cfi e2 = cfgVar.e();
        int a2 = f.a(e) - 1;
        cev cevVar = cev.a;
        cfi cfiVar2 = null;
        cfi cfiVar3 = null;
        while (true) {
            if (e2 == null) {
                break;
            }
            if (e2.g == 0) {
                break;
            }
            if (C(e2, a2, cevVar)) {
                if (cfiVar3 == null) {
                    cfiVar3 = e2;
                } else if (e2.g >= cfiVar3.g) {
                    cfiVar2 = cfiVar3;
                }
            }
            e2 = e2.h;
        }
        cfiVar2 = e2;
        if (cfiVar2 != null) {
            cfiVar2.g = Integer.MAX_VALUE;
            return cfiVar2;
        }
        cfi a3 = cfiVar.a(Integer.MAX_VALUE);
        a3.h = cfgVar.e();
        cfgVar.f(a3);
        return a3;
    }

    public static final cfi h(cfi cfiVar, cfg cfgVar, ces cesVar) {
        cfi g2 = g(cfiVar, cfgVar);
        g2.b(cfiVar);
        g2.g = cesVar.v();
        return g2;
    }

    public static final cfi i(cfi cfiVar, cfg cfgVar, ces cesVar, cfi cfiVar2) {
        cfi g2;
        if (cesVar.r()) {
            cesVar.n(cfgVar);
        }
        int v = cesVar.v();
        if (cfiVar2.g != v) {
            synchronized (c) {
                g2 = g(cfiVar, cfgVar);
            }
            g2.g = v;
            if (cfiVar2.g != 1) {
                cesVar.n(cfgVar);
            }
            return g2;
        }
        return cfiVar2;
    }

    public static final cfi j(cfi cfiVar, cfg cfgVar) {
        cfi k2;
        ces b2 = b();
        arqr i2 = b2.i();
        if (i2 != null) {
            i2.a(cfgVar);
        }
        cfi k3 = k(cfiVar, b2.v(), b2.x());
        if (k3 == null) {
            synchronized (c) {
                ces b3 = b();
                cfi e2 = cfgVar.e();
                e2.getClass();
                k2 = k(e2, b3.v(), b3.x());
                if (k2 == null) {
                    z();
                    throw new armj();
                }
            }
            return k2;
        }
        return k3;
    }

    public static final cfi k(cfi cfiVar, int i2, cev cevVar) {
        cfi cfiVar2 = null;
        while (cfiVar != null) {
            if (C(cfiVar, i2, cevVar) && (cfiVar2 == null || cfiVar2.g < cfiVar.g)) {
                cfiVar2 = cfiVar;
            }
            cfiVar = cfiVar.h;
        }
        if (cfiVar2 == null) {
            return null;
        }
        return cfiVar2;
    }

    public static final cfi l(cfi cfiVar, cfg cfgVar, ces cesVar) {
        cfi k2;
        if (cesVar.r()) {
            cesVar.n(cfgVar);
        }
        int v = cesVar.v();
        cfi k3 = k(cfiVar, v, cesVar.x());
        if (k3 != null) {
            if (k3.g != cesVar.v()) {
                synchronized (c) {
                    k2 = k(((cez) cfgVar).a, v, cesVar.x());
                    if (k2 != null) {
                        if (k2.g != v) {
                            k2 = h(k2, cfgVar, cesVar);
                        }
                    } else {
                        z();
                        throw new armj();
                    }
                }
                if (k3.g != 1) {
                    cesVar.n(cfgVar);
                }
                return k2;
            }
            return k3;
        }
        z();
        throw new armj();
    }

    public static final Object m(arqr arqrVar) {
        Object obj;
        vh vhVar;
        Object n;
        int i2;
        ces cesVar = k;
        cesVar.getClass();
        synchronized (c) {
            obj = i.get();
            vhVar = ((cel) obj).f;
            if (vhVar != null) {
                l.addAndGet(1);
            }
            n = n((ces) obj, arqrVar);
        }
        if (vhVar != null) {
            try {
                List list = g;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((arqv) list.get(i3)).a(new cbj(vhVar), obj);
                }
            } finally {
                l.addAndGet(-1);
            }
        }
        synchronized (c) {
            s();
            if (vhVar != null) {
                Object[] objArr = vhVar.b;
                long[] jArr = vhVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = ~(i4 - length);
                            int i6 = 0;
                            while (true) {
                                i2 = 8 - (i5 >>> 31);
                                if (i6 >= i2) {
                                    break;
                                }
                                if ((255 & j2) < 128) {
                                    u((cfg) objArr[(i4 << 3) + i6]);
                                }
                                j2 >>= 8;
                                i6++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return n;
    }

    public static final Object n(ces cesVar, arqr arqrVar) {
        Object a2 = arqrVar.a(d.b(cesVar.v()));
        synchronized (c) {
            int i2 = e;
            e = i2 + 1;
            d = d.b(cesVar.v());
            i.set(new cel(i2, d));
            cesVar.d();
            d = d.d(i2);
        }
        return a2;
    }

    public static final Map o(cem cemVar, cem cemVar2, cev cevVar) {
        long[] jArr;
        int i2;
        Object obj;
        cev cevVar2;
        long[] jArr2;
        int i3;
        Object obj2;
        cev cevVar3;
        cfi k2;
        vh s = cemVar2.s();
        int v = cemVar.v();
        Object obj3 = null;
        if (s == null) {
            return null;
        }
        cev c2 = cemVar2.x().d(cemVar2.v()).c(cemVar2.c);
        Object[] objArr = s.b;
        long[] jArr3 = s.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap hashMap = null;
        int i4 = 0;
        while (true) {
            long j2 = jArr3[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length;
                int i6 = 0;
                while (true) {
                    int i7 = 8 - ((~i5) >>> 31);
                    if (i6 < i7) {
                        if ((j2 & 255) < 128) {
                            cfg cfgVar = (cfg) objArr[(i4 << 3) + i6];
                            cfi e2 = cfgVar.e();
                            cfi k3 = k(e2, v, cevVar);
                            jArr2 = jArr3;
                            if (k3 != null && (k2 = k(e2, v, c2)) != null && !d.F(k3, k2)) {
                                i3 = v;
                                cevVar3 = c2;
                                cfi k4 = k(e2, cemVar2.v(), cemVar2.x());
                                if (k4 != null) {
                                    cfi j3 = cfgVar.j(k2, k3, k4);
                                    if (j3 != null) {
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(k3, j3);
                                    } else {
                                        return null;
                                    }
                                } else {
                                    z();
                                    throw new armj();
                                }
                            } else {
                                i3 = v;
                                cevVar3 = c2;
                            }
                            obj2 = null;
                        } else {
                            jArr2 = jArr3;
                            i3 = v;
                            obj2 = obj3;
                            cevVar3 = c2;
                        }
                        j2 >>= 8;
                        i6++;
                        obj3 = obj2;
                        jArr3 = jArr2;
                        v = i3;
                        c2 = cevVar3;
                    } else {
                        jArr = jArr3;
                        i2 = v;
                        obj = obj3;
                        cevVar2 = c2;
                        if (i7 != 8) {
                            break;
                        }
                    }
                }
            } else {
                jArr = jArr3;
                i2 = v;
                obj = obj3;
                cevVar2 = c2;
            }
            if (i4 == length) {
                break;
            }
            i4++;
            obj3 = obj;
            jArr3 = jArr;
            v = i2;
            c2 = cevVar2;
        }
        return hashMap;
    }

    public static final arqr p(arqr arqrVar, arqr arqrVar2, boolean z) {
        if (true != z) {
            arqrVar2 = null;
        }
        if (arqrVar != null && arqrVar2 != null && arqrVar != arqrVar2) {
            return new AnonymousClass3(arqrVar, arqrVar2);
        }
        if (arqrVar == null) {
            return arqrVar2;
        }
        return arqrVar;
    }

    public static final arqr q(arqr arqrVar, arqr arqrVar2) {
        if (arqrVar != null && arqrVar2 != null && arqrVar != arqrVar2) {
            return new AnonymousClass4(arqrVar, arqrVar2);
        }
        if (arqrVar == null) {
            return arqrVar2;
        }
        return arqrVar;
    }

    public static final void r() {
        m(AnonymousClass1.a);
    }

    public static final void s() {
        cfe cfeVar = j;
        int i2 = cfeVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            cdw cdwVar = cfeVar.c[i3];
            if (cdwVar != null) {
                obj = cdwVar.get();
            }
            if (obj != null && B((cfg) obj)) {
                if (i4 != i3) {
                    cfeVar.c[i4] = cdwVar;
                    int[] iArr = cfeVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            cfeVar.c[i5] = null;
            cfeVar.b[i5] = 0;
        }
        if (i4 != i2) {
            cfeVar.a = i4;
        }
    }

    public static final void t(ces cesVar, cfg cfgVar) {
        cesVar.q(cesVar.h() + 1);
        arqr k2 = cesVar.k();
        if (k2 != null) {
            k2.a(cfgVar);
        }
    }

    public static final void u(cfg cfgVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (B(cfgVar)) {
            cfe cfeVar = j;
            int i2 = cfeVar.a;
            int identityHashCode = System.identityHashCode(cfgVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = cfeVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = cfeVar.b[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            cdw cdwVar = cfeVar.c[i6];
                            if (cdwVar != null) {
                                obj = cdwVar.get();
                            } else {
                                obj = null;
                            }
                            if (cfgVar != obj) {
                                i3 = i6 - 1;
                                while (i3 >= 0 && cfeVar.b[i3] == identityHashCode) {
                                    cdw cdwVar2 = cfeVar.c[i3];
                                    if (cdwVar2 != null) {
                                        obj3 = cdwVar2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == cfgVar) {
                                        break;
                                    } else {
                                        i3--;
                                    }
                                }
                                i6++;
                                int i8 = cfeVar.a;
                                while (i6 < i8) {
                                    if (cfeVar.b[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    cdw cdwVar3 = cfeVar.c[i6];
                                    if (cdwVar3 != null) {
                                        obj2 = cdwVar3.get();
                                    } else {
                                        obj2 = null;
                                    }
                                    if (obj2 != cfgVar) {
                                        i6++;
                                    }
                                }
                                i5 = cfeVar.a;
                            }
                            i3 = i6;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3 = -(i5 + 1);
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            cdw[] cdwVarArr = cfeVar.c;
            int length = cdwVarArr.length;
            if (i2 == length) {
                int i11 = length + length;
                cdw[] cdwVarArr2 = new cdw[i11];
                int[] iArr = new int[i11];
                aqil.y(cdwVarArr, cdwVarArr2, i10, i9, i2);
                aqil.K(cfeVar.c, cdwVarArr2, 0, i9, 6);
                aqil.x(cfeVar.b, iArr, i10, i9, i2);
                aqil.A(cfeVar.b, iArr, 0, i9, 6);
                cfeVar.c = cdwVarArr2;
                cfeVar.b = iArr;
            } else {
                aqil.y(cdwVarArr, cdwVarArr, i10, i9, i2);
                int[] iArr2 = cfeVar.b;
                aqil.x(iArr2, iArr2, i10, i9, i2);
            }
            cfeVar.c[i9] = new cdw(cfgVar);
            cfeVar.b[i9] = identityHashCode;
            cfeVar.a++;
        }
    }

    public static final void v(int i2) {
        int i3;
        ceu ceuVar = f;
        int i4 = ceuVar.d[i2];
        ceuVar.c(i4, ceuVar.a - 1);
        ceuVar.a--;
        ceuVar.b(i4);
        int[] iArr = ceuVar.b;
        int i5 = ceuVar.a >> 1;
        while (i4 < i5) {
            int i6 = i4 + 1;
            int i7 = i6 + i6;
            int i8 = i7 - 1;
            if (i7 < ceuVar.a && (i3 = iArr[i7]) < iArr[i8]) {
                if (i3 >= iArr[i4]) {
                    break;
                }
                ceuVar.c(i7, i4);
                i4 = i7;
            } else {
                if (iArr[i8] >= iArr[i4]) {
                    break;
                }
                ceuVar.c(i8, i4);
                i4 = i8;
            }
        }
        ceuVar.d[i2] = ceuVar.e;
        ceuVar.e = i2;
    }

    public static final void w(ces cesVar) {
        cem cemVar;
        Object obj;
        int a2;
        if (!d.e(cesVar.v())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
            sb.append(cesVar.v());
            sb.append(", disposed=");
            sb.append(cesVar.i);
            sb.append(", applied=");
            if (cesVar instanceof cem) {
                cemVar = (cem) cesVar;
            } else {
                cemVar = null;
            }
            if (cemVar != null) {
                obj = Boolean.valueOf(cemVar.e);
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (c) {
                a2 = f.a(-1);
            }
            sb.append(a2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static /* synthetic */ arqr y(arqr arqrVar, arqr arqrVar2) {
        return p(arqrVar, arqrVar2, true);
    }

    public static final void z() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }
}
