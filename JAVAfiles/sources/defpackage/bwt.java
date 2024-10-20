package defpackage;

import android.os.Trace;
import defpackage.bxd;
import defpackage.bxe;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwt implements bxc, bzw, bzi {
    public final bwc a;
    public final AtomicReference b = new AtomicReference(null);
    public final Object c = new Object();
    public final Set d;
    public final cab e;
    public final cay f;
    public final cay g;
    public bwt h;
    public int i;
    public final bwk j;
    public boolean k;
    public final ve l;
    public final ve m;
    public ve n;
    private final bwr o;
    private boolean p;
    private arqv q;
    private final vh r;
    private final vh s;
    private final ve t;

    public /* synthetic */ bwt(bwr bwrVar, bwc bwcVar) {
        this.o = bwrVar;
        this.a = bwcVar;
        ut utVar = new ut(new vh((byte[]) null));
        this.d = utVar;
        cab cabVar = new cab();
        if (bwrVar.q()) {
            cabVar.d();
        }
        if (bwrVar.s()) {
            cabVar.e();
        }
        this.e = cabVar;
        this.l = new ve((byte[]) null);
        this.r = new vh((byte[]) null);
        this.s = new vh((byte[]) null);
        this.m = new ve((byte[]) null);
        cay cayVar = new cay();
        this.f = cayVar;
        cay cayVar2 = new cay();
        this.g = cayVar2;
        this.t = new ve((byte[]) null);
        this.n = new ve((byte[]) null);
        bwk bwkVar = new bwk(bwcVar, bwrVar, cabVar, utVar, cayVar, cayVar2, this);
        bwrVar.l(bwkVar);
        this.j = bwkVar;
        this.q = bwf.a;
    }

    private final void A() {
        Object andSet = this.b.getAndSet(null);
        if (!d.F(andSet, bwu.a)) {
            if (andSet instanceof Set) {
                e((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    e(set, false);
                }
                return;
            }
            if (andSet == null) {
                bwp.g("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new armj();
            }
            AtomicReference atomicReference = this.b;
            Objects.toString(atomicReference);
            bwp.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new armj();
        }
    }

    private final void B(Object obj) {
        int i;
        Object a = this.l.a(obj);
        if (a != null) {
            if (a instanceof vh) {
                vh vhVar = (vh) a;
                Object[] objArr = vhVar.b;
                long[] jArr = vhVar.a;
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
                                    bzf bzfVar = (bzf) objArr[(i2 << 3) + i4];
                                    if (bzfVar.b(obj) == bxu.d) {
                                        cbk.a(this.t, obj, bzfVar);
                                    }
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                return;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                bzf bzfVar2 = (bzf) a;
                if (bzfVar2.b(obj) == bxu.d) {
                    cbk.a(this.t, obj, bzfVar2);
                }
            }
        }
    }

    private final boolean C(bzf bzfVar, Object obj) {
        if (q() && this.j.ag(bzfVar, obj)) {
            return true;
        }
        return false;
    }

    public static final void v() {
        d.F(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r9 < r7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        if (r6 != defpackage.bzy.a) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.bxu w(defpackage.bzf r22, defpackage.bwa r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwt.w(bzf, bwa, java.lang.Object):bxu");
    }

    private final void x(Object obj, boolean z) {
        int i;
        Object a = this.l.a(obj);
        if (a != null) {
            if (a instanceof vh) {
                vh vhVar = (vh) a;
                Object[] objArr = vhVar.b;
                long[] jArr = vhVar.a;
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
                                    bzf bzfVar = (bzf) objArr[(i2 << 3) + i4];
                                    if (!cbk.c(this.t, obj, bzfVar) && bzfVar.b(obj) != bxu.a) {
                                        if (bzfVar.n() && !z) {
                                            this.s.j(bzfVar);
                                        } else {
                                            this.r.j(bzfVar);
                                        }
                                    }
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                return;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                bzf bzfVar2 = (bzf) a;
                if (!cbk.c(this.t, obj, bzfVar2) && bzfVar2.b(obj) != bxu.a) {
                    if (bzfVar2.n() && !z) {
                        this.s.j(bzfVar2);
                    } else {
                        this.r.j(bzfVar2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0146, code lost:
    
        if (((defpackage.bzf) r4).m() == false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(defpackage.cay r31) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwt.y(cay):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (r6.b() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        r1.h(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        if (defpackage.ve.e(r31.l, (defpackage.bxe) r6) == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwt.z():void");
    }

    @Override // defpackage.bzi
    public final bxu a(bzf bzfVar, Object obj) {
        bwt bwtVar;
        if ((bzfVar.a & 2) != 0) {
            bzfVar.d(true);
        }
        bwa bwaVar = bzfVar.c;
        if (bwaVar != null && bwaVar.a()) {
            if (!this.e.f(bwaVar)) {
                synchronized (this.c) {
                    bwtVar = this.h;
                }
                if (bwtVar != null && bwtVar.C(bzfVar, obj)) {
                    return bxu.d;
                }
                return bxu.a;
            }
            if (bzfVar.d != null) {
                return w(bzfVar, bwaVar, obj);
            }
            return bxu.a;
        }
        return bxu.a;
    }

    @Override // defpackage.bwq
    public final void b() {
        boolean z;
        synchronized (this.c) {
            if (this.j.q) {
                byy.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.k) {
                this.k = true;
                this.q = bwf.b;
                cay cayVar = this.j.w;
                if (cayVar != null) {
                    y(cayVar);
                }
                if (this.e.b > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !this.d.isEmpty()) {
                    cdo cdoVar = new cdo(this.d);
                    if (z) {
                        cae c = this.e.c();
                        try {
                            bwp.k(c, cdoVar);
                            c.z(true);
                            this.a.c();
                            this.a.f();
                            cdoVar.c();
                        } catch (Throwable th) {
                            c.z(false);
                            throw th;
                        }
                    }
                    cdoVar.b();
                }
                bwk bwkVar = this.j;
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    bwkVar.b.o(bwkVar);
                    bwkVar.X();
                    bwkVar.a.c();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        this.o.p(this);
    }

    @Override // defpackage.bwq
    public final boolean c() {
        return this.k;
    }

    @Override // defpackage.bxc
    public final void d() {
        this.b.set(null);
        this.f.a();
        this.g.a();
        Set set = this.d;
        if (!set.isEmpty()) {
            new cdo(set).b();
        }
    }

    public final void e(Set set, boolean z) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        boolean a;
        long[] jArr3;
        long[] jArr4;
        int i5;
        long[] jArr5;
        int i6;
        int i7;
        int i8;
        Object[] objArr;
        Object[] objArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c = 7;
        long j = -9187201950435737472L;
        int i15 = 8;
        if (set instanceof cbj) {
            vh vhVar = ((cbj) set).a;
            Object[] objArr3 = vhVar.b;
            long[] jArr6 = vhVar.a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i16 = 0;
                while (true) {
                    long j2 = jArr6[i16];
                    if ((((~j2) << c) & j2 & j) != j) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j2 & 255) < 128) {
                                Object obj = objArr3[(i16 << 3) + i18];
                                if (obj instanceof bzf) {
                                    ((bzf) obj).b(null);
                                    i10 = i17;
                                    i11 = i18;
                                    i14 = i15;
                                    i12 = length;
                                    i13 = i16;
                                } else {
                                    x(obj, z);
                                    Object a2 = this.m.a(obj);
                                    if (a2 != null) {
                                        if (a2 instanceof vh) {
                                            vh vhVar2 = (vh) a2;
                                            Object[] objArr4 = vhVar2.b;
                                            long[] jArr7 = vhVar2.a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                i12 = length;
                                                i13 = i16;
                                                int i19 = 0;
                                                while (true) {
                                                    long j3 = jArr7[i19];
                                                    i10 = i17;
                                                    i11 = i18;
                                                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        for (int i21 = 0; i21 < i20; i21++) {
                                                            if ((j3 & 255) < 128) {
                                                                x((bxe) objArr4[(i19 << 3) + i21], z);
                                                            }
                                                            j3 >>= 8;
                                                        }
                                                        if (i20 != 8) {
                                                            i14 = 8;
                                                            break;
                                                        }
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    i17 = i10;
                                                    i18 = i11;
                                                    c = 7;
                                                }
                                            } else {
                                                i10 = i17;
                                                i11 = i18;
                                                i12 = length;
                                                i13 = i16;
                                            }
                                        } else {
                                            i10 = i17;
                                            i11 = i18;
                                            i12 = length;
                                            i13 = i16;
                                            x((bxe) a2, z);
                                        }
                                        i14 = 8;
                                    }
                                }
                                j2 >>= i14;
                                i18 = i11 + 1;
                                length = i12;
                                i15 = i14;
                                i16 = i13;
                                i17 = i10;
                                c = 7;
                            }
                            i10 = i17;
                            i11 = i18;
                            i12 = length;
                            i13 = i16;
                            i14 = i15;
                            j2 >>= i14;
                            i18 = i11 + 1;
                            length = i12;
                            i15 = i14;
                            i16 = i13;
                            i17 = i10;
                            c = 7;
                        }
                        int i22 = length;
                        i9 = i16;
                        if (i17 != i15) {
                            break;
                        } else {
                            length = i22;
                        }
                    } else {
                        i9 = i16;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i16 = i9 + 1;
                    c = 7;
                    j = -9187201950435737472L;
                    i15 = 8;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (obj2 instanceof bzf) {
                    ((bzf) obj2).b(null);
                } else {
                    x(obj2, z);
                    Object a3 = this.m.a(obj2);
                    if (a3 != null) {
                        if (a3 instanceof vh) {
                            vh vhVar3 = (vh) a3;
                            Object[] objArr5 = vhVar3.b;
                            long[] jArr8 = vhVar3.a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                int i23 = 0;
                                while (true) {
                                    long j4 = jArr8[i23];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                        for (int i25 = 0; i25 < i24; i25++) {
                                            if ((j4 & 255) < 128) {
                                                x((bxe) objArr5[(i23 << 3) + i25], z);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i24 != 8) {
                                            break;
                                        }
                                    }
                                    if (i23 != length3) {
                                        i23++;
                                    }
                                }
                            }
                        } else {
                            x((bxe) a3, z);
                        }
                    }
                }
            }
        }
        vh vhVar4 = this.s;
        vh vhVar5 = this.r;
        if (z && vhVar4.c()) {
            ve veVar = this.l;
            long[] jArr9 = veVar.a;
            int length4 = jArr9.length - 2;
            if (length4 >= 0) {
                int i26 = 0;
                while (true) {
                    long j5 = jArr9[i26];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i27 = 8 - ((~(i26 - length4)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j5 & 255) < 128) {
                                int i29 = (i26 << 3) + i28;
                                Object obj3 = veVar.b[i29];
                                Object obj4 = veVar.c[i29];
                                if (obj4 instanceof vh) {
                                    obj4.getClass();
                                    vh vhVar6 = (vh) obj4;
                                    Object[] objArr6 = vhVar6.b;
                                    long[] jArr10 = vhVar6.a;
                                    int length5 = jArr10.length - 2;
                                    jArr5 = jArr9;
                                    i6 = length4;
                                    i7 = i26;
                                    if (length5 >= 0) {
                                        int i30 = 0;
                                        while (true) {
                                            long j6 = jArr10[i30];
                                            i8 = i27;
                                            long[] jArr11 = jArr10;
                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i31 = 8 - ((~(i30 - length5)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j6 & 255) < 128) {
                                                        int i33 = (i30 << 3) + i32;
                                                        objArr2 = objArr6;
                                                        bzf bzfVar = (bzf) objArr6[i33];
                                                        if (vhVar4.a(bzfVar) || vhVar5.a(bzfVar)) {
                                                            vhVar6.i(i33);
                                                        }
                                                    } else {
                                                        objArr2 = objArr6;
                                                    }
                                                    j6 >>= 8;
                                                    i32++;
                                                    objArr6 = objArr2;
                                                }
                                                objArr = objArr6;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr = objArr6;
                                            }
                                            if (i30 == length5) {
                                                break;
                                            }
                                            i30++;
                                            i27 = i8;
                                            jArr10 = jArr11;
                                            objArr6 = objArr;
                                        }
                                    } else {
                                        i8 = i27;
                                    }
                                    if (!vhVar6.b()) {
                                    }
                                    veVar.h(i29);
                                } else {
                                    jArr5 = jArr9;
                                    i6 = length4;
                                    i7 = i26;
                                    i8 = i27;
                                    obj4.getClass();
                                    bzf bzfVar2 = (bzf) obj4;
                                    if (!vhVar4.a(bzfVar2) && !vhVar5.a(bzfVar2)) {
                                    }
                                    veVar.h(i29);
                                }
                            } else {
                                jArr5 = jArr9;
                                i6 = length4;
                                i7 = i26;
                                i8 = i27;
                            }
                            j5 >>= 8;
                            i28++;
                            length4 = i6;
                            i26 = i7;
                            jArr9 = jArr5;
                            i27 = i8;
                        }
                        jArr4 = jArr9;
                        int i34 = length4;
                        int i35 = i26;
                        if (i27 != 8) {
                            break;
                        }
                        length4 = i34;
                        i5 = i35;
                    } else {
                        jArr4 = jArr9;
                        i5 = i26;
                    }
                    if (i5 == length4) {
                        break;
                    }
                    i26 = i5 + 1;
                    jArr9 = jArr4;
                }
            }
            vhVar4.d();
            z();
            return;
        }
        if (vhVar5.c()) {
            ve veVar2 = this.l;
            long[] jArr12 = veVar2.a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i36 = 0;
                while (true) {
                    long j7 = jArr12[i36];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i37 = 8 - ((~(i36 - length6)) >>> 31);
                        int i38 = 0;
                        while (i38 < i37) {
                            if ((j7 & 255) < 128) {
                                int i39 = (i36 << 3) + i38;
                                Object obj5 = veVar2.b[i39];
                                Object obj6 = veVar2.c[i39];
                                if (obj6 instanceof vh) {
                                    obj6.getClass();
                                    vh vhVar7 = (vh) obj6;
                                    Object[] objArr7 = vhVar7.b;
                                    long[] jArr13 = vhVar7.a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        i2 = length6;
                                        i3 = i36;
                                        int i40 = 0;
                                        while (true) {
                                            long j8 = jArr13[i40];
                                            long[] jArr14 = jArr13;
                                            i4 = i37;
                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                                int i42 = 0;
                                                while (i42 < i41) {
                                                    if ((j8 & 255) < 128) {
                                                        int i43 = (i40 << 3) + i42;
                                                        jArr3 = jArr12;
                                                        if (vhVar5.a((bzf) objArr7[i43])) {
                                                            vhVar7.i(i43);
                                                        }
                                                    } else {
                                                        jArr3 = jArr12;
                                                    }
                                                    j8 >>= 8;
                                                    i42++;
                                                    jArr12 = jArr3;
                                                }
                                                jArr2 = jArr12;
                                                if (i41 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr12;
                                            }
                                            if (i40 == length7) {
                                                break;
                                            }
                                            i40++;
                                            i37 = i4;
                                            jArr13 = jArr14;
                                            jArr12 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr12;
                                        i2 = length6;
                                        i3 = i36;
                                        i4 = i37;
                                    }
                                    a = vhVar7.b();
                                } else {
                                    jArr2 = jArr12;
                                    i2 = length6;
                                    i3 = i36;
                                    i4 = i37;
                                    obj6.getClass();
                                    a = vhVar5.a((bzf) obj6);
                                }
                                if (a) {
                                    veVar2.h(i39);
                                }
                            } else {
                                jArr2 = jArr12;
                                i2 = length6;
                                i3 = i36;
                                i4 = i37;
                            }
                            j7 >>= 8;
                            i38++;
                            length6 = i2;
                            i36 = i3;
                            i37 = i4;
                            jArr12 = jArr2;
                        }
                        jArr = jArr12;
                        int i44 = length6;
                        int i45 = i36;
                        if (i37 != 8) {
                            break;
                        }
                        length6 = i44;
                        i = i45;
                    } else {
                        jArr = jArr12;
                        i = i36;
                    }
                    if (i == length6) {
                        break;
                    }
                    i36 = i + 1;
                    jArr12 = jArr;
                }
            }
            z();
            vhVar5.d();
        }
    }

    @Override // defpackage.bxc
    public final void f() {
        synchronized (this.c) {
            try {
                y(this.f);
                A();
            } catch (Throwable th) {
                try {
                    Set set = this.d;
                    if (!set.isEmpty()) {
                        new cdo(set).b();
                    }
                    throw th;
                } catch (Exception e) {
                    d();
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.bxc
    public final void g() {
        synchronized (this.c) {
            try {
                cay cayVar = this.g;
                if (cayVar.e()) {
                    y(cayVar);
                }
            } catch (Throwable th) {
                try {
                    Set set = this.d;
                    if (!set.isEmpty()) {
                        new cdo(set).b();
                    }
                    throw th;
                } catch (Exception e) {
                    d();
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.bxc
    public final void h() {
        synchronized (this.c) {
            try {
                this.j.A = null;
                Set set = this.d;
                if (!set.isEmpty()) {
                    new cdo(set).b();
                }
            } catch (Throwable th) {
                try {
                    Set set2 = this.d;
                    if (!set2.isEmpty()) {
                        new cdo(set2).b();
                    }
                    throw th;
                } catch (Exception e) {
                    d();
                    throw e;
                }
            }
        }
    }

    public final void i(arqv arqvVar) {
        if (this.k) {
            byy.b("The composition is disposed");
        }
        this.q = arqvVar;
        this.o.e(this, arqvVar);
    }

    public final void j() {
        Object andSet = this.b.getAndSet(bwu.a);
        if (andSet != null) {
            if (!d.F(andSet, bwu.a)) {
                if (andSet instanceof Set) {
                    e((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        e(set, true);
                    }
                    return;
                }
                AtomicReference atomicReference = this.b;
                Objects.toString(atomicReference);
                bwp.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new armj();
            }
            bwp.g("pending composition has not been applied");
            throw new armj();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x01c9, code lost:
    
        if (r10.h == defpackage.cbf.h(r11.c)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017f, code lost:
    
        if (r13 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.bxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwt.k(java.util.List):void");
    }

    @Override // defpackage.bxc
    public final void l() {
        bzf bzfVar;
        synchronized (this.c) {
            for (Object obj : this.e.c) {
                if (obj instanceof bzf) {
                    bzfVar = (bzf) obj;
                } else {
                    bzfVar = null;
                }
                if (bzfVar != null) {
                    bzfVar.a();
                }
            }
        }
    }

    @Override // defpackage.bxc
    public final void m(arqg arqgVar) {
        bwk bwkVar = this.j;
        if (bwkVar.q) {
            bwp.i("Preparing a composition while composing is not supported");
        }
        bwkVar.q = true;
        try {
            arqgVar.a();
        } finally {
            bwkVar.q = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Set[]] */
    @Override // defpackage.bxc
    public final void n(Set set) {
        Object obj;
        Set set2;
        do {
            obj = this.b.get();
            if (obj == null || d.F(obj, bwu.a)) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else if (obj instanceof Object[]) {
                set2 = aqil.f((Set[]) obj, set);
            } else {
                AtomicReference atomicReference = this.b;
                Objects.toString(atomicReference);
                throw new IllegalStateException("corrupt pendingModifications: ".concat(atomicReference.toString()));
            }
        } while (!a.bC(this.b, obj, set2));
        if (obj == null) {
            synchronized (this.c) {
                A();
            }
        }
    }

    @Override // defpackage.bxc, defpackage.bzi
    public final void o(Object obj) {
        bzf R;
        int i;
        bwk bwkVar = this.j;
        if (bwkVar.o <= 0 && (R = bwkVar.R()) != null) {
            R.o();
            if ((R.a & 32) == 0) {
                uv uvVar = R.f;
                if (uvVar == null) {
                    uvVar = new uv((byte[]) null);
                    R.f = uvVar;
                }
                if (uvVar.h(obj, R.e) == R.e) {
                    return;
                }
            }
            if (obj instanceof cfh) {
                ((cfh) obj).k(1);
            }
            cbk.a(this.l, obj, R);
            if (obj instanceof bxe) {
                bxe bxeVar = (bxe) obj;
                bxe.a c = bxeVar.c();
                cbk.b(this.m, obj);
                bxd.a aVar = (bxd.a) c;
                uv uvVar2 = aVar.d;
                Object[] objArr = uvVar2.b;
                long[] jArr = uvVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                char c2 = '\b';
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((j & 255) < 128) {
                                    cfg cfgVar = (cfg) objArr[(i2 << 3) + i4];
                                    if (cfgVar instanceof cfh) {
                                        ((cfh) cfgVar).k(1);
                                    }
                                    cbk.a(this.m, cfgVar, obj);
                                    c2 = '\b';
                                }
                                j >>= c2;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                Object obj2 = aVar.e;
                ve veVar = R.g;
                if (veVar == null) {
                    veVar = new ve((byte[]) null);
                    R.g = veVar;
                }
                veVar.j(bxeVar, obj2);
            }
        }
    }

    @Override // defpackage.bxc
    public final void p(Object obj) {
        int i;
        synchronized (this.c) {
            B(obj);
            Object a = this.m.a(obj);
            if (a != null) {
                if (a instanceof vh) {
                    vh vhVar = (vh) a;
                    Object[] objArr = vhVar.b;
                    long[] jArr = vhVar.a;
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
                                        B((bxe) objArr[(i2 << 3) + i4]);
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
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    B((bxe) a);
                }
            }
        }
    }

    @Override // defpackage.bxc
    public final boolean q() {
        return this.j.q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        return true;
     */
    @Override // defpackage.bxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.cbj
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L5f
            cbj r1 = (defpackage.cbj) r1
            vh r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7e
            r6 = r3
        L18:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5a
            int r9 = r6 - r5
            r10 = r3
        L2b:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            ve r13 = r0.l
            boolean r13 = defpackage.ve.e(r13, r11)
            if (r13 != 0) goto L53
            ve r13 = r0.m
            boolean r11 = defpackage.ve.e(r13, r11)
            if (r11 != 0) goto L53
            goto L54
        L53:
            return r4
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2b
        L58:
            if (r11 != r12) goto L7e
        L5a:
            if (r6 == r5) goto L7e
            int r6 = r6 + 1
            goto L18
        L5f:
            java.util.Iterator r1 = r18.iterator()
        L63:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()
            ve r5 = r0.l
            boolean r5 = defpackage.ve.e(r5, r2)
            if (r5 != 0) goto L7d
            ve r5 = r0.m
            boolean r2 = defpackage.ve.e(r5, r2)
            if (r2 == 0) goto L63
        L7d:
            return r4
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwt.r(java.util.Set):boolean");
    }

    @Override // defpackage.bxc
    public final boolean s() {
        boolean e;
        synchronized (this.c) {
            j();
            try {
                ve t = t();
                try {
                    v();
                    bwk bwkVar = this.j;
                    if (!bwkVar.d.d()) {
                        bwp.i("Expected applyChanges() to have been called");
                    }
                    if (t.e <= 0 && bwkVar.j.isEmpty()) {
                        e = false;
                    } else {
                        bwkVar.ah(t, null);
                        e = bwkVar.d.e();
                    }
                    if (!e) {
                        A();
                    }
                } catch (Exception e2) {
                    this.n = t;
                    throw e2;
                }
            } finally {
            }
        }
        return e;
    }

    public final ve t() {
        ve veVar = this.n;
        this.n = new ve((byte[]) null);
        return veVar;
    }

    @Override // defpackage.bzi
    public final void u() {
        this.p = true;
    }
}
