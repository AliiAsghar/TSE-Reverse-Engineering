package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import defpackage.cln;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cof {
    public final cog a;
    public clr d;
    public clr e;
    public boolean f;
    public clp g;
    public int h;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    private Outline r;
    private float u;
    private cln v;
    private RectF w;
    private dqv o = cnv.a;
    private drk p = drk.a;
    public arqr b = AnonymousClass2.a;
    private final arqr q = new AnonymousClass1();
    public boolean c = true;
    private long s = 0;
    private long t = 9205357640488583168L;
    public final coe i = new coe();

    /* compiled from: PG */
    /* renamed from: cof$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cny, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            cof cofVar = cof.this;
            cny cnyVar = (cny) obj;
            clr clrVar = cofVar.d;
            if (cofVar.f && cofVar.n && clrVar != null) {
                arqr arqrVar = cofVar.b;
                cnu q = cnyVar.q();
                long a = q.a();
                q.b().l();
                try {
                    ((cnr.AnonymousClass1) q).a.g(clrVar);
                    arqrVar.a(cnyVar);
                } finally {
                    q.b().j();
                    q.h(a);
                }
            } else {
                cofVar.b.a(cnyVar);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cof$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cny, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    static {
        int i = col.a;
    }

    public cof(cog cogVar) {
        this.a = cogVar;
        cogVar.v(false);
        this.k = 0L;
        this.l = 0L;
        this.m = 9205357640488583168L;
    }

    private final Outline m() {
        Outline outline = this.r;
        if (outline == null) {
            Outline outline2 = new Outline();
            this.r = outline2;
            return outline2;
        }
        return outline;
    }

    private final void n() {
        this.h--;
        e();
    }

    private final void o() {
        this.v = null;
        this.d = null;
        this.t = 9205357640488583168L;
        this.s = 0L;
        this.u = brg.a;
        this.c = true;
        this.f = false;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.h();
    }

    public final cln c() {
        cln bVar;
        cln clnVar = this.v;
        clr clrVar = this.d;
        if (clnVar == null) {
            if (clrVar != null) {
                cln.a aVar = new cln.a(clrVar);
                this.v = aVar;
                return aVar;
            }
            long c = drj.c(this.l);
            long j = this.s;
            long j2 = this.t;
            if (j2 != 9205357640488583168L) {
                c = j2;
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float intBitsToFloat3 = intBitsToFloat + Float.intBitsToFloat((int) (c >> 32));
            float intBitsToFloat4 = intBitsToFloat2 + Float.intBitsToFloat((int) (c & 4294967295L));
            if (this.u > brg.a) {
                bVar = new cln.c(cjs.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L)));
            } else {
                bVar = new cln.b(new cjp(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
            }
            this.v = bVar;
            return bVar;
        }
        return clnVar;
    }

    public final void d() {
        Outline m;
        if (this.c) {
            boolean z = this.n;
            Outline outline = null;
            if (!z && b() <= brg.a) {
                this.a.v(false);
                this.a.x(null, 0L);
            } else {
                clr clrVar = this.d;
                if (clrVar != null) {
                    RectF rectF = this.w;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.w = rectF;
                    }
                    cke ckeVar = (cke) clrVar;
                    ckeVar.a.computeBounds(rectF, false);
                    if (Build.VERSION.SDK_INT <= 28 && !clrVar.o()) {
                        Outline outline2 = this.r;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.f = true;
                        m = null;
                    } else {
                        m = m();
                        if (Build.VERSION.SDK_INT >= 30) {
                            m.setPath(ckeVar.a);
                        } else {
                            m.setConvexPath(ckeVar.a);
                        }
                        this.f = !m.canClip();
                    }
                    this.d = clrVar;
                    if (m != null) {
                        m.setAlpha(a());
                        outline = m;
                    }
                    this.a.x(outline, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f && this.n) {
                        this.a.v(false);
                        this.a.p();
                    } else {
                        this.a.v(this.n);
                    }
                } else {
                    this.a.v(z);
                    Outline m2 = m();
                    long c = drj.c(this.l);
                    long j = this.s;
                    long j2 = this.t;
                    if (j2 != 9205357640488583168L) {
                        c = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    m2.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (c >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (4294967295L & c))), this.u);
                    m2.setAlpha(a());
                    this.a.x(m2, drj.b(c));
                }
            }
        }
        this.c = false;
    }

    public final void e() {
        int i;
        if (this.j && this.h == 0) {
            coe coeVar = this.i;
            cof cofVar = coeVar.a;
            if (cofVar != null) {
                cofVar.n();
                coeVar.a = null;
            }
            vh vhVar = coeVar.d;
            if (vhVar != null) {
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
                                    ((cof) objArr[(i2 << 3) + i4]).n();
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
                vhVar.d();
            }
            this.a.p();
        }
    }

    public final void f(dqv dqvVar, drk drkVar, long j, arqr arqrVar) {
        if (!a.bB(this.l, j)) {
            this.l = j;
            k(this.k, j);
            if (this.t == 9205357640488583168L) {
                this.c = true;
                d();
            }
        }
        this.o = dqvVar;
        this.p = drkVar;
        this.b = arqrVar;
        g();
    }

    public final void g() {
        int i;
        coe coeVar = this.i;
        coeVar.b = coeVar.a;
        vh vhVar = coeVar.d;
        if (vhVar != null && vhVar.c()) {
            vh vhVar2 = coeVar.e;
            if (vhVar2 == null) {
                vhVar2 = new vh((byte[]) null);
                coeVar.e = vhVar2;
            }
            vhVar2.f(vhVar);
            vhVar.d();
        }
        coeVar.c = true;
        this.a.r(this.o, this.p, this, this.q);
        coeVar.c = false;
        cof cofVar = coeVar.b;
        if (cofVar != null) {
            cofVar.n();
        }
        vh vhVar3 = coeVar.e;
        if (vhVar3 != null && vhVar3.c()) {
            Object[] objArr = vhVar3.b;
            long[] jArr = vhVar3.a;
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
                                ((cof) objArr[(i2 << 3) + i4]).n();
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
            vhVar3.d();
        }
    }

    public final void h(float f) {
        cog cogVar = this.a;
        if (cogVar.a() == f) {
            return;
        }
        cogVar.s(f);
    }

    public final void i(clr clrVar) {
        o();
        this.d = clrVar;
        d();
    }

    public final void j(long j) {
        if (!a.bB(this.m, j)) {
            this.m = j;
            this.a.y(j);
        }
    }

    public final void k(long j, long j2) {
        this.a.z(dre.a(j), dre.b(j), j2);
    }

    public final void l(long j, long j2, float f) {
        if (a.bB(this.s, j) && a.bB(this.t, j2) && this.u == f && this.d == null) {
            return;
        }
        o();
        this.s = j;
        this.t = j2;
        this.u = f;
        d();
    }
}
