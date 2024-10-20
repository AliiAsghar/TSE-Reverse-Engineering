package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alkd extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    static final Logger a = Logger.getLogger(alkd.class.getName());
    static final aljs b = new alik();
    static final Queue c = new alil();
    public static final /* synthetic */ int x = 0;
    final int d;
    final int e;
    final aljj[] f;
    final int g;
    final algj h;
    final algj i;
    final aljl j;
    final aljl k;
    final long l;
    final long m;
    final long n;
    final Queue o;
    final alhz p;
    final alix q;
    Set r;
    Collection s;
    Set t;
    final alif u;
    final alie v;
    final asqc w;

    public alkd(alig aligVar, asqc asqcVar) {
        long j;
        Queue concurrentLinkedQueue;
        boolean z;
        char c2;
        boolean z2;
        int i;
        int i2 = aligVar.d;
        this.g = Math.min(i2 == -1 ? 4 : i2, 65536);
        aljl b2 = aligVar.b();
        this.j = b2;
        this.k = aligVar.c();
        this.h = (algj) albo.ak(aligVar.k, aligVar.b().a());
        this.i = (algj) albo.ak(aligVar.l, aligVar.c().a());
        if (aligVar.i != 0 && aligVar.j != 0) {
            if (aligVar.o == null) {
                j = aligVar.e;
            } else {
                j = aligVar.f;
            }
        } else {
            j = 0;
        }
        this.l = j;
        this.u = (alif) albo.ak(aligVar.o, alif.a);
        long j2 = aligVar.j;
        this.m = j2 == -1 ? 0L : j2;
        long j3 = aligVar.i;
        this.n = j3 != -1 ? j3 : 0L;
        alie alieVar = (alie) albo.ak(aligVar.p, alie.a);
        this.v = alieVar;
        if (alieVar == alie.a) {
            concurrentLinkedQueue = c;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.o = concurrentLinkedQueue;
        int i3 = 1;
        if (!l() && !i()) {
            z = false;
        } else {
            z = true;
        }
        alhz alhzVar = aligVar.m;
        if (alhzVar == null) {
            if (z) {
                alhzVar = alhz.b;
            } else {
                alhzVar = alig.b;
            }
        }
        this.p = alhzVar;
        if (!m() && !i()) {
            c2 = 0;
        } else {
            c2 = 1;
        }
        if (!j() && !l()) {
            z2 = false;
        } else {
            z2 = true;
        }
        alix alixVar = alix.a;
        int i4 = (b2 != aljl.WEAK ? (char) 0 : (char) 4) | c2;
        if (true != z2) {
            i = 0;
        } else {
            i = 2;
        }
        this.q = alix.i[i4 | i];
        this.w = asqcVar;
        int min = Math.min(16, 1073741824);
        if (h() && !g()) {
            min = (int) Math.min(min, j);
        }
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.g && (!h() || i6 * 20 <= this.l)) {
            i5++;
            i6 += i6;
        }
        this.e = 32 - i5;
        this.d = i6 - 1;
        this.f = new aljj[i6];
        int i7 = min / i6;
        while (i3 < (i7 * i6 < min ? i7 + 1 : i7)) {
            i3 += i3;
        }
        if (h()) {
            long j4 = i6;
            long j5 = this.l;
            long j6 = j5 % j4;
            long j7 = (j5 / j4) + 1;
            int i8 = 0;
            while (true) {
                aljj[] aljjVarArr = this.f;
                if (i8 < aljjVarArr.length) {
                    if (i8 == j6) {
                        j7--;
                    }
                    long j8 = j7;
                    aljjVarArr[i8] = new aljj(this, i3, j8, (albo) ((alhw) aligVar.n).a);
                    i8++;
                    j7 = j8;
                } else {
                    return;
                }
            }
        } else {
            int i9 = 0;
            while (true) {
                aljj[] aljjVarArr2 = this.f;
                if (i9 < aljjVarArr2.length) {
                    aljjVarArr2[i9] = new aljj(this, i3, -1L, (albo) ((alhw) aligVar.n).a);
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(alke alkeVar, alke alkeVar2) {
        alkeVar.l(alkeVar2);
        alkeVar2.n(alkeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(alke alkeVar, alke alkeVar2) {
        alkeVar.m(alkeVar2);
        alkeVar2.o(alkeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(alke alkeVar) {
        alji aljiVar = alji.a;
        alkeVar.l(aljiVar);
        alkeVar.n(aljiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(alke alkeVar) {
        alji aljiVar = alji.a;
        alkeVar.m(aljiVar);
        alkeVar.o(aljiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(Object obj) {
        int c2 = this.h.c(obj);
        int i = c2 + ((c2 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aljj b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r4.a.n() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (r4.h.poll() != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r4.a.o() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r4.i.poll() != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r4.l.clear();
        r4.m.clear();
        r4.k.set(0);
        r4.d++;
        r4.b = 0;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r13 = this;
            aljj[] r0 = r13.f
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto Lb7
            r4 = r0[r3]
            int r5 = r4.b
            if (r5 == 0) goto Lb3
            r4.lock()
            alkd r5 = r4.a     // Catch: java.lang.Throwable -> Lab
            alhz r5 = r5.p     // Catch: java.lang.Throwable -> Lab
            long r5 = r5.a()     // Catch: java.lang.Throwable -> Lab
            r4.s(r5)     // Catch: java.lang.Throwable -> Lab
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r4.f     // Catch: java.lang.Throwable -> Lab
            r6 = r2
        L1e:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lab
            r8 = 1
            if (r6 >= r7) goto L60
            java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> Lab
            alke r7 = (defpackage.alke) r7     // Catch: java.lang.Throwable -> Lab
        L2b:
            if (r7 == 0) goto L5d
            aljs r9 = r7.d()     // Catch: java.lang.Throwable -> Lab
            boolean r9 = r9.f()     // Catch: java.lang.Throwable -> Lab
            if (r9 == 0) goto L58
            java.lang.Object r9 = r7.j()     // Catch: java.lang.Throwable -> Lab
            aljs r10 = r7.d()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> Lab
            r11 = 3
            if (r9 == 0) goto L4a
            if (r10 != 0) goto L49
            goto L4a
        L49:
            r11 = r8
        L4a:
            r7.a()     // Catch: java.lang.Throwable -> Lab
            aljs r12 = r7.d()     // Catch: java.lang.Throwable -> Lab
            int r12 = r12.a()     // Catch: java.lang.Throwable -> Lab
            r4.x(r9, r10, r12, r11)     // Catch: java.lang.Throwable -> Lab
        L58:
            alke r7 = r7.e()     // Catch: java.lang.Throwable -> Lab
            goto L2b
        L5d:
            int r6 = r6 + 1
            goto L1e
        L60:
            r6 = r2
        L61:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lab
            if (r6 >= r7) goto L6e
            r7 = 0
            r5.set(r6, r7)     // Catch: java.lang.Throwable -> Lab
            int r6 = r6 + 1
            goto L61
        L6e:
            alkd r5 = r4.a     // Catch: java.lang.Throwable -> Lab
            boolean r5 = r5.n()     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L7e
        L76:
            java.lang.ref.ReferenceQueue r5 = r4.h     // Catch: java.lang.Throwable -> Lab
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lab
            if (r5 != 0) goto L76
        L7e:
            alkd r5 = r4.a     // Catch: java.lang.Throwable -> Lab
            boolean r5 = r5.o()     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L8e
        L86:
            java.lang.ref.ReferenceQueue r5 = r4.i     // Catch: java.lang.Throwable -> Lab
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lab
            if (r5 != 0) goto L86
        L8e:
            java.util.Queue r5 = r4.l     // Catch: java.lang.Throwable -> Lab
            r5.clear()     // Catch: java.lang.Throwable -> Lab
            java.util.Queue r5 = r4.m     // Catch: java.lang.Throwable -> Lab
            r5.clear()     // Catch: java.lang.Throwable -> Lab
            java.util.concurrent.atomic.AtomicInteger r5 = r4.k     // Catch: java.lang.Throwable -> Lab
            r5.set(r2)     // Catch: java.lang.Throwable -> Lab
            int r5 = r4.d     // Catch: java.lang.Throwable -> Lab
            int r5 = r5 + r8
            r4.d = r5     // Catch: java.lang.Throwable -> Lab
            r4.b = r2     // Catch: java.lang.Throwable -> Lab
            r4.unlock()
            r4.t()
            goto Lb3
        Lab:
            r0 = move-exception
            r4.unlock()
            r4.t()
            throw r0
        Lb3:
            int r3 = r3 + 1
            goto L5
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkd.clear():void");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        alke c2;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        aljj b2 = b(a2);
        try {
            if (b2.b != 0 && (c2 = b2.c(obj, a2, b2.a.p.a())) != null) {
                if (c2.d().get() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            b2.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            alhz r3 = r0.p
            aljj[] r4 = r0.f
            long r5 = r3.a()
            r7 = -1
            r3 = r2
        L13:
            r9 = 3
            if (r3 >= r9) goto L77
            int r9 = r4.length
            r10 = 0
            r12 = r2
        L1a:
            if (r12 >= r9) goto L64
            r13 = r4[r12]
            int r14 = r13.b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f
            r15 = r2
        L23:
            int r2 = r14.length()
            if (r15 >= r2) goto L54
            java.lang.Object r2 = r14.get(r15)
            alke r2 = (defpackage.alke) r2
        L2f:
            r16 = r4
            if (r2 == 0) goto L4f
            java.lang.Object r4 = r13.g(r2, r5)
            r17 = r5
            if (r4 == 0) goto L46
            algj r5 = r0.i
            boolean r4 = r5.d(r1, r4)
            if (r4 != 0) goto L44
            goto L46
        L44:
            r1 = 1
            return r1
        L46:
            alke r2 = r2.e()
            r4 = r16
            r5 = r17
            goto L2f
        L4f:
            r17 = r5
            int r15 = r15 + 1
            goto L23
        L54:
            r16 = r4
            r17 = r5
            int r2 = r13.d
            long r4 = (long) r2
            long r10 = r10 + r4
            int r12 = r12 + 1
            r4 = r16
            r5 = r17
            r2 = 0
            goto L1a
        L64:
            r16 = r4
            r17 = r5
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L6e
            r1 = 0
            goto L78
        L6e:
            int r3 = r3 + 1
            r7 = r10
            r4 = r16
            r5 = r17
            r2 = 0
            goto L13
        L77:
            r1 = r2
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkd.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.t;
        if (set != null) {
            return set;
        }
        aliz alizVar = new aliz(this);
        this.t = alizVar;
        return alizVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (this.u != alif.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return b(a2).f(obj, a2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        if (this.l >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        if (this.m > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        aljj[] aljjVarArr = this.f;
        long j = 0;
        for (aljj aljjVar : aljjVarArr) {
            if (aljjVar.b != 0) {
                return false;
            }
            j += r8.d;
        }
        if (j == 0) {
            return true;
        }
        for (aljj aljjVar2 : aljjVarArr) {
            if (aljjVar2.b != 0) {
                return false;
            }
            j -= r9.d;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        if (this.n > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(alke alkeVar, long j) {
        alkeVar.getClass();
        if (i() && j - alkeVar.b() >= this.m) {
            return true;
        }
        if (j() && j - alkeVar.c() >= this.n) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.r;
        if (set != null) {
            return set;
        }
        aljc aljcVar = new aljc(this);
        this.r = aljcVar;
        return aljcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        if (!j()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        if (!i() && !h()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        if (this.j != aljl.STRONG) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        if (this.k != aljl.STRONG) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        return b(a2).h(obj, a2, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        return b(a2).h(obj, a2, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r7 = r4.d();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r13 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r9.d++;
        r0 = r9.y(r3, r4, r5, r13, r7, r8);
        r1 = r9.b - 1;
        r10.set(r11, r0);
        r9.b = r1;
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r7.f() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r8 = 3;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r1 = r12.a(r13)
            aljj r9 = r12.b(r1)
            r9.lock()
            alkd r2 = r9.a     // Catch: java.lang.Throwable -> L7d
            alhz r2 = r2.p     // Catch: java.lang.Throwable -> L7d
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L7d
            r9.s(r2)     // Catch: java.lang.Throwable -> L7d
            int r2 = r9.b     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f     // Catch: java.lang.Throwable -> L7d
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L7d
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L7d
            r3 = r2
            alke r3 = (defpackage.alke) r3     // Catch: java.lang.Throwable -> L7d
            r4 = r3
        L2e:
            if (r4 == 0) goto L76
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L7d
            int r2 = r4.a()     // Catch: java.lang.Throwable -> L7d
            if (r2 != r1) goto L71
            if (r5 == 0) goto L71
            alkd r2 = r9.a     // Catch: java.lang.Throwable -> L7d
            algj r2 = r2.h     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r2.d(r13, r5)     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L71
            aljs r7 = r4.d()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L7d
            r1 = 1
            if (r13 == 0) goto L53
            r8 = r1
            goto L5b
        L53:
            boolean r2 = r7.f()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L76
            r0 = 3
            r8 = r0
        L5b:
            int r0 = r9.d     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + r1
            r9.d = r0     // Catch: java.lang.Throwable -> L7d
            r2 = r9
            r6 = r13
            alke r0 = r2.y(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7d
            int r1 = r9.b     // Catch: java.lang.Throwable -> L7d
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> L7d
            r9.b = r1     // Catch: java.lang.Throwable -> L7d
            r0 = r13
            goto L76
        L71:
            alke r4 = r4.e()     // Catch: java.lang.Throwable -> L7d
            goto L2e
        L76:
            r9.unlock()
            r9.t()
            return r0
        L7d:
            r13 = move-exception
            r9.unlock()
            r9.t()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkd.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int a2 = a(obj);
        aljj b2 = b(a2);
        b2.lock();
        try {
            long a3 = b2.a.p.a();
            b2.s(a3);
            AtomicReferenceArray atomicReferenceArray = b2.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            alke alkeVar = (alke) atomicReferenceArray.get(length);
            alke alkeVar2 = alkeVar;
            while (true) {
                obj3 = null;
                if (alkeVar2 == null) {
                    break;
                }
                Object j = alkeVar2.j();
                if (alkeVar2.a() == a2 && j != null && b2.a.h.d(obj, j)) {
                    aljs d = alkeVar2.d();
                    Object obj4 = d.get();
                    if (obj4 == null) {
                        if (d.f()) {
                            int i = b2.b;
                            b2.d++;
                            alke y = b2.y(alkeVar, alkeVar2, j, null, d, 3);
                            int i2 = b2.b - 1;
                            atomicReferenceArray.set(length, y);
                            b2.b = i2;
                        }
                    } else {
                        b2.d++;
                        b2.x(obj, obj4, d.a(), 2);
                        b2.z(alkeVar2, obj2, a3);
                        b2.l(alkeVar2);
                        obj3 = obj4;
                    }
                } else {
                    alkeVar2 = alkeVar2.e();
                }
            }
            return obj3;
        } finally {
            b2.unlock();
            b2.t();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.f.length; i++) {
            j += Math.max(0, r0[i].b);
        }
        return albo.cu(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.s;
        if (collection != null) {
            return collection;
        }
        aljt aljtVar = new aljt(this);
        this.s = aljtVar;
        return aljtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r7 = r4.d();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r9.a.i.d(r14, r13) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r6 = r13;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r9.d++;
        r14 = r9.y(r3, r4, r5, r6, r7, r13);
        r2 = r9.b - 1;
        r10.set(r11, r14);
        r9.b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r13 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r13 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7.f() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r13 = 3;
        r6 = null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L96
            if (r14 != 0) goto L7
            goto L96
        L7:
            int r1 = r12.a(r13)
            aljj r9 = r12.b(r1)
            r9.lock()
            alkd r2 = r9.a     // Catch: java.lang.Throwable -> L8e
            alhz r2 = r2.p     // Catch: java.lang.Throwable -> L8e
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L8e
            r9.s(r2)     // Catch: java.lang.Throwable -> L8e
            int r2 = r9.b     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f     // Catch: java.lang.Throwable -> L8e
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L8e
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L8e
            r3 = r2
            alke r3 = (defpackage.alke) r3     // Catch: java.lang.Throwable -> L8e
            r4 = r3
        L31:
            if (r4 == 0) goto L87
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L8e
            int r2 = r4.a()     // Catch: java.lang.Throwable -> L8e
            if (r2 != r1) goto L82
            if (r5 == 0) goto L82
            alkd r2 = r9.a     // Catch: java.lang.Throwable -> L8e
            algj r2 = r2.h     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r2.d(r13, r5)     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L82
            aljs r7 = r4.d()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L8e
            alkd r1 = r9.a     // Catch: java.lang.Throwable -> L8e
            algj r1 = r1.i     // Catch: java.lang.Throwable -> L8e
            boolean r14 = r1.d(r14, r13)     // Catch: java.lang.Throwable -> L8e
            r1 = 1
            if (r14 == 0) goto L5f
            r6 = r13
            r13 = r1
            goto L6a
        L5f:
            if (r13 != 0) goto L87
            boolean r13 = r7.f()     // Catch: java.lang.Throwable -> L8e
            if (r13 == 0) goto L87
            r13 = 3
            r14 = 0
            r6 = r14
        L6a:
            int r14 = r9.d     // Catch: java.lang.Throwable -> L8e
            int r14 = r14 + r1
            r9.d = r14     // Catch: java.lang.Throwable -> L8e
            r2 = r9
            r8 = r13
            alke r14 = r2.y(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8e
            int r2 = r9.b     // Catch: java.lang.Throwable -> L8e
            int r2 = r2 + (-1)
            r10.set(r11, r14)     // Catch: java.lang.Throwable -> L8e
            r9.b = r2     // Catch: java.lang.Throwable -> L8e
            if (r13 != r1) goto L87
            r0 = r1
            goto L87
        L82:
            alke r4 = r4.e()     // Catch: java.lang.Throwable -> L8e
            goto L31
        L87:
            r9.unlock()
            r9.t()
            return r0
        L8e:
            r13 = move-exception
            r9.unlock()
            r9.t()
            throw r13
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkd.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        aljj b2 = b(a2);
        b2.lock();
        try {
            long a3 = b2.a.p.a();
            b2.s(a3);
            AtomicReferenceArray atomicReferenceArray = b2.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            alke alkeVar = (alke) atomicReferenceArray.get(length);
            alke alkeVar2 = alkeVar;
            while (true) {
                if (alkeVar2 == null) {
                    break;
                }
                Object j = alkeVar2.j();
                if (alkeVar2.a() == a2 && j != null && b2.a.h.d(obj, j)) {
                    aljs d = alkeVar2.d();
                    Object obj4 = d.get();
                    if (obj4 == null) {
                        if (d.f()) {
                            int i = b2.b;
                            b2.d++;
                            alke y = b2.y(alkeVar, alkeVar2, j, null, d, 3);
                            int i2 = b2.b - 1;
                            atomicReferenceArray.set(length, y);
                            b2.b = i2;
                        }
                    } else if (b2.a.i.d(obj2, obj4)) {
                        b2.d++;
                        b2.x(obj, obj4, d.a(), 2);
                        b2.z(alkeVar2, obj3, a3);
                        b2.l(alkeVar2);
                        z = true;
                    } else {
                        b2.p(alkeVar2, a3);
                    }
                } else {
                    alkeVar2 = alkeVar2.e();
                }
            }
            return z;
        } finally {
            b2.unlock();
            b2.t();
        }
    }
}
