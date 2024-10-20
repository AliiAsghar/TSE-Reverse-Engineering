package defpackage;

import androidx.compose.animation.SkipToLookaheadElement;
import defpackage.bwj;
import defpackage.cga;
import defpackage.csv;
import defpackage.yg;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yi implements yg, ctz {
    public static final arml a = armd.b(3, AnonymousClass1.a);
    public final arwe b;
    public boolean c;
    public cti f;
    public cti g;
    private final /* synthetic */ ctz j;
    public final byn d = new byu(false, cav.a);
    private final arqg k = new AnonymousClass2();
    public final arqr e = new AnonymousClass5();
    public final cez h = new cez();
    public final ve i = new ve((byte[]) null);

    /* compiled from: PG */
    /* renamed from: yi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<cfc> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cfc cfcVar = new cfc(yh.a);
            cfcVar.d();
            return cfcVar;
        }
    }

    /* compiled from: PG */
    /* renamed from: yi$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<arnb> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            ve veVar = yi.this.i;
            Object[] objArr = veVar.b;
            Object[] objArr2 = veVar.c;
            long[] jArr = veVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = i - length;
                        int i3 = 0;
                        while (true) {
                            int i4 = 8 - ((~i2) >>> 31);
                            if (i3 < i4) {
                                if ((255 & j) < 128) {
                                    int i5 = (i << 3) + i3;
                                    Object obj = objArr[i5];
                                    if (((yd) objArr2[i5]).k()) {
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                                i3++;
                            } else if (i4 != 8) {
                                break;
                            }
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: yi$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<wv, Boolean> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean z;
            if (((wv) obj) == wv.b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: yi$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ wh a;
        final /* synthetic */ xl b;
        final /* synthetic */ xn c;
        final /* synthetic */ yg.d d;
        final /* synthetic */ yg.c e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(wh whVar, xl xlVar, xn xnVar, yg.d dVar, yg.c cVar) {
            super(3);
            this.a = whVar;
            this.b = xlVar;
            this.c = xnVar;
            this.d = dVar;
            this.e = cVar;
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            cga cgaVar;
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(-419341573);
            yg.d dVar = this.d;
            abt a = this.a.a();
            boolean I = bwjVar.I(dVar);
            Object h = bwjVar.h();
            if (I || h == bwj.a.a) {
                h = new yl(this.d);
                bwjVar.B(h);
            }
            xn xnVar = this.c;
            Object obj4 = this.d.a;
            Objects.toString(obj4);
            cga d = wx.d(a, this.b, xnVar, (arqg) h, "enter/exit for ".concat((String) obj4), bwjVar, 0, 0);
            yg.c cVar = this.e;
            yg.d dVar2 = this.d;
            cga.a aVar = cga.e;
            boolean I2 = bwjVar.I(dVar2);
            yg.d dVar3 = this.d;
            Object h2 = bwjVar.h();
            if (I2 || h2 == bwj.a.a) {
                h2 = new ym(dVar3);
                bwjVar.B(h2);
            }
            xx xxVar = (xx) cVar;
            arqg arqgVar = (arqg) h2;
            if (d.F(xxVar.a, csv.a.a)) {
                cgaVar = cld.a(cga.e, new yv(arqgVar));
            } else {
                cgaVar = cga.e;
            }
            cga a2 = d.a(cgaVar.a(new SkipToLookaheadElement(xxVar, arqgVar)));
            bwjVar.q();
            return a2;
        }
    }

    /* compiled from: PG */
    /* renamed from: yi$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<yg, arnb> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean z;
            boolean z2;
            yi yiVar = yi.this;
            ve veVar = yiVar.i;
            Object[] objArr = veVar.b;
            Object[] objArr2 = veVar.c;
            long[] jArr = veVar.a;
            int length = jArr.length - 2;
            long j = -9187201950435737472L;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j2 = jArr[i];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j2 & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = objArr[i4];
                                if (((yd) objArr2[i4]).k()) {
                                    z = true;
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            z = false;
            if (z != yiVar.a()) {
                yiVar.d.h(Boolean.valueOf(z));
                if (!z) {
                    ve veVar2 = yiVar.i;
                    Object[] objArr3 = veVar2.b;
                    Object[] objArr4 = veVar2.c;
                    long[] jArr2 = veVar2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j3 = jArr2[i5];
                            if ((((~j3) << 7) & j3 & j) != j) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j3 & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        Object obj3 = objArr3[i8];
                                        yd ydVar = (yd) objArr4[i8];
                                        if (ydVar.d.a() > 1 && ydVar.j()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        ydVar.e(z2);
                                        ydVar.f(null);
                                    }
                                    j3 >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length2) {
                                break;
                            }
                            i5++;
                            j = -9187201950435737472L;
                        }
                    }
                }
            }
            ve veVar3 = yiVar.i;
            Object[] objArr5 = veVar3.b;
            Object[] objArr6 = veVar3.c;
            long[] jArr3 = veVar3.a;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i9 = 0;
                while (true) {
                    long j4 = jArr3[i9];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length3)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j4 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj4 = objArr5[i12];
                                ((yd) objArr6[i12]).g();
                            }
                            j4 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i9 == length3) {
                        break;
                    }
                    i9++;
                }
            }
            yiVar.f();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final cfc a() {
            return (cfc) yi.a.a();
        }
    }

    public yi(ctz ctzVar, arwe arweVar) {
        this.b = arweVar;
        this.j = ctzVar;
    }

    @Override // defpackage.yg
    public final boolean a() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    @Override // defpackage.yg
    public final yg.d b(bwj bwjVar) {
        bwjVar.y(799702514);
        boolean G = bwjVar.G("photoSelector_0");
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            T = new yg.d();
            bwkVar.ad(T);
        }
        yg.d dVar = (yg.d) T;
        bwkVar.Y();
        return dVar;
    }

    @Override // defpackage.yg
    public final cga c(cga cgaVar, yg.d dVar, wh whVar, xl xlVar, xn xnVar, wm wmVar, yg.c cVar, yg.b bVar, yg.a aVar) {
        cga g;
        cga g2;
        g = cfv.g(cgaVar, new yn(dVar, whVar.a(), AnonymousClass3.a, this, bVar, aVar, wmVar));
        g2 = cfv.g(g, new AnonymousClass4(whVar, xlVar, xnVar, dVar, cVar));
        return g2;
    }

    public final cti d() {
        cti ctiVar = this.g;
        if (ctiVar != null) {
            return ctiVar;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // defpackage.ctz
    public final cti dV(cti ctiVar) {
        return this.j.dV(ctiVar);
    }

    public final void f() {
        if (!this.c) {
            a.a().c(this, this.e, this.k);
        }
    }

    public final void g(yd ydVar, arqr arqrVar, arqg arqgVar) {
        if (!this.c) {
            a.a().c(ydVar, arqrVar, arqgVar);
        }
    }
}
