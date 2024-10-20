package defpackage;

import defpackage.bxe;
import defpackage.ces;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxd<T> extends cfh implements bxe<T> {
    public final arqg a;
    public a b = new a(cex.b().v());
    private final caj c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bxd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<Object, arnb> {
        final /* synthetic */ cdl b;
        final /* synthetic */ int c;
        final /* synthetic */ uv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cdl cdlVar, uv uvVar, int i) {
            super(1);
            this.b = cdlVar;
            this.d = uvVar;
            this.c = i;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            if (obj != bxd.this) {
                if (obj instanceof cfg) {
                    cdl cdlVar = this.b;
                    uv uvVar = this.d;
                    uvVar.g(obj, Math.min(cdlVar.a - this.c, uvVar.c(obj, Integer.MAX_VALUE)));
                }
                return arnb.a;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T> extends cfi implements bxe.a<T> {
        public static final Object a = new Object();
        public int b;
        public int c;
        public uv d;
        public Object e;
        public int f;

        public a(int i) {
            super(i);
            this.d = uw.a();
            this.e = a;
        }

        @Override // defpackage.cfi
        public final cfi a(int i) {
            return new a(i);
        }

        @Override // defpackage.cfi
        public final void b(cfi cfiVar) {
            cfiVar.getClass();
            a aVar = (a) cfiVar;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
        }

        public final int c(ces cesVar) {
            uv uvVar;
            int i;
            int i2;
            int i3;
            int i4;
            cfi f;
            synchronized (cex.c) {
                uvVar = this.d;
            }
            char c = 7;
            if (uvVar.d()) {
                cbh a2 = cal.a();
                int i5 = a2.b;
                int i6 = 1;
                if (i5 > 0) {
                    Object[] objArr = a2.a;
                    int i7 = 0;
                    do {
                        ((bxf) objArr[i7]).b();
                        i7++;
                    } while (i7 < i5);
                }
                try {
                    Object[] objArr2 = uvVar.b;
                    int[] iArr = uvVar.c;
                    long[] jArr = uvVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 7;
                        int i9 = 0;
                        while (true) {
                            long j = jArr[i9];
                            if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = i9 - length;
                                int i11 = 0;
                                while (true) {
                                    i4 = 8 - ((~i10) >>> 31);
                                    if (i11 >= i4) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i12 = (i9 << 3) + i11;
                                        cfg cfgVar = (cfg) objArr2[i12];
                                        if (iArr[i12] == i6) {
                                            if (cfgVar instanceof bxd) {
                                                bxd bxdVar = (bxd) cfgVar;
                                                i = 0;
                                                try {
                                                    f = bxdVar.b((a) cex.f(bxdVar.b, cesVar), cesVar, false, bxdVar.a);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    int i13 = a2.b;
                                                    if (i13 > 0) {
                                                        Object[] objArr3 = a2.a;
                                                        int i14 = i;
                                                        do {
                                                            ((bxf) objArr3[i14]).a();
                                                            i14++;
                                                        } while (i14 < i13);
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i = 0;
                                                f = cex.f(cfgVar.e(), cesVar);
                                            }
                                            i8 = (((i8 * 31) + System.identityHashCode(f)) * 31) + f.g;
                                            j >>= 8;
                                            i11++;
                                            i6 = 1;
                                        }
                                    }
                                    j >>= 8;
                                    i11++;
                                    i6 = 1;
                                }
                                i2 = 0;
                                if (i4 != 8) {
                                    break;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            c = 7;
                            i6 = 1;
                        }
                        i3 = i8;
                    } else {
                        i2 = 0;
                        i3 = 7;
                    }
                    int i15 = a2.b;
                    if (i15 > 0) {
                        Object[] objArr4 = a2.a;
                        int i16 = i2;
                        do {
                            ((bxf) objArr4[i16]).a();
                            i16++;
                        } while (i16 < i15);
                        return i3;
                    }
                    return i3;
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } else {
                return 7;
            }
        }

        public final boolean d(ces cesVar) {
            boolean z;
            boolean z2;
            synchronized (cex.c) {
                z = false;
                if (this.b == cesVar.v()) {
                    if (this.c == cesVar.h()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.e != a && (!z2 || this.f == c(cesVar))) {
                z = true;
            }
            if (z && z2) {
                synchronized (cex.c) {
                    this.b = cesVar.v();
                    this.c = cesVar.h();
                }
            }
            return z;
        }
    }

    public bxd(arqg arqgVar, caj cajVar) {
        this.a = arqgVar;
        this.c = cajVar;
    }

    @Override // defpackage.cas
    public final Object a() {
        arqr i = cex.b().i();
        if (i != null) {
            i.a(this);
        }
        ces b = cex.b();
        return b((a) cex.f(this.b, b), b, true, this.a).e;
    }

    public final a b(a aVar, ces cesVar, boolean z, arqg arqgVar) {
        cbh a2;
        cfi h;
        caj cajVar;
        int i;
        a aVar2 = aVar;
        if (aVar.d(cesVar)) {
            if (z) {
                a2 = cal.a();
                int i2 = a2.b;
                if (i2 > 0) {
                    Object[] objArr = a2.a;
                    int i3 = 0;
                    do {
                        ((bxf) objArr[i3]).b();
                        i3++;
                    } while (i3 < i2);
                }
                try {
                    uv uvVar = aVar2.d;
                    cdl cdlVar = (cdl) cal.a.a();
                    if (cdlVar == null) {
                        cdlVar = new cdl((byte[]) null);
                        cal.a.b(cdlVar);
                    }
                    int i4 = cdlVar.a;
                    Object[] objArr2 = uvVar.b;
                    int[] iArr = uvVar.c;
                    long[] jArr = uvVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = i5 - length;
                                int i7 = 0;
                                while (true) {
                                    char c = '\b';
                                    i = 8 - ((~i6) >>> 31);
                                    if (i7 >= i) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        cfg cfgVar = (cfg) objArr2[i8];
                                        cdlVar.a = iArr[i8] + i4;
                                        arqr i9 = cesVar.i();
                                        if (i9 != null) {
                                            i9.a(cfgVar);
                                        }
                                        c = '\b';
                                    }
                                    j >>= c;
                                    i7++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    cdlVar.a = i4;
                    int i10 = a2.b;
                    if (i10 > 0) {
                        Object[] objArr3 = a2.a;
                        int i11 = 0;
                        do {
                            ((bxf) objArr3[i11]).a();
                            i11++;
                        } while (i11 < i10);
                    }
                } finally {
                }
            }
            return aVar2;
        }
        uv uvVar2 = new uv((byte[]) null);
        cdl cdlVar2 = (cdl) cal.a.a();
        if (cdlVar2 == null) {
            cdlVar2 = new cdl((byte[]) null);
            cal.a.b(cdlVar2);
        }
        int i12 = cdlVar2.a;
        a2 = cal.a();
        int i13 = a2.b;
        if (i13 > 0) {
            Object[] objArr4 = a2.a;
            int i14 = 0;
            do {
                ((bxf) objArr4[i14]).b();
                i14++;
            } while (i14 < i13);
        }
        try {
            cdlVar2.a = i12 + 1;
            Object d = ces.a.d(new AnonymousClass1(cdlVar2, uvVar2, i12), arqgVar);
            cdlVar2.a = i12;
            int i15 = a2.b;
            if (i15 > 0) {
                Object[] objArr5 = a2.a;
                int i16 = 0;
                while (true) {
                    ((bxf) objArr5[i16]).a();
                    int i17 = i16 + 1;
                    if (i17 >= i15) {
                        break;
                    }
                    i16 = i17;
                }
            }
            synchronized (cex.c) {
                ces b = cex.b();
                Object obj = aVar2.e;
                if (obj != a.a && (cajVar = this.c) != null && cajVar.a(d, obj)) {
                    aVar2.d = uvVar2;
                    aVar2.f = aVar2.c(b);
                } else {
                    a aVar3 = this.b;
                    synchronized (cex.c) {
                        h = cex.h(aVar3, this, b);
                    }
                    aVar2 = (a) h;
                    aVar2.d = uvVar2;
                    aVar2.f = aVar2.c(b);
                    aVar2.e = d;
                }
            }
            cdl cdlVar3 = (cdl) cal.a.a();
            if (cdlVar3 != null && cdlVar3.a == 0) {
                ces.a.c();
                synchronized (cex.c) {
                    ces b2 = cex.b();
                    aVar2.b = b2.v();
                    aVar2.c = b2.h();
                }
            }
            return aVar2;
        } finally {
        }
    }

    @Override // defpackage.bxe
    public final bxe.a c() {
        ces b = cex.b();
        return b((a) cex.f(this.b, b), b, false, this.a);
    }

    @Override // defpackage.bxe
    public final caj d() {
        return this.c;
    }

    @Override // defpackage.cfg
    public final cfi e() {
        return this.b;
    }

    @Override // defpackage.cfg
    public final void f(cfi cfiVar) {
        cfiVar.getClass();
        this.b = (a) cfiVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        a aVar = (a) cex.e(this.b);
        if (aVar.d(cex.b())) {
            str = String.valueOf(aVar.e);
        } else {
            str = "<Not calculated>";
        }
        sb.append(str);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
