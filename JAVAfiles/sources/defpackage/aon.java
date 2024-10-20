package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import defpackage.cfq;
import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aon implements anw, asd {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;
    public final LazyLayoutItemAnimator e;
    public int f;
    public final int g;
    public final int h;
    public final int i;
    public boolean j;
    public int k = Integer.MIN_VALUE;
    public int l;
    public final int[] m;
    private final List n;
    private final cfq.b o;
    private final cfq.c p;
    private final drk q;
    private final boolean r;
    private final int s;
    private final int t;
    private final long u;
    private final Object v;
    private final long w;
    private int x;

    public aon(int i, List list, boolean z, cfq.b bVar, cfq.c cVar, drk drkVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        int i5;
        int i6;
        this.a = i;
        this.n = list;
        this.b = z;
        this.o = bVar;
        this.p = cVar;
        this.q = drkVar;
        this.r = z2;
        this.s = i2;
        this.c = i3;
        this.t = i4;
        this.u = j;
        this.d = obj;
        this.v = obj2;
        this.e = lazyLayoutItemAnimator;
        this.w = j2;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            cvc cvcVar = (cvc) list.get(i9);
            boolean z3 = this.b;
            if (z3) {
                i5 = cvcVar.b;
            } else {
                i5 = cvcVar.a;
            }
            i7 += i5;
            if (!z3) {
                i6 = cvcVar.b;
            } else {
                i6 = cvcVar.a;
            }
            i8 = Math.max(i8, i6);
        }
        this.g = i7;
        this.h = arrn.r(i7 + this.t, 0);
        this.i = i8;
        int size2 = this.n.size();
        this.m = new int[size2 + size2];
    }

    private final int r(long j) {
        if (this.b) {
            return dre.b(j);
        }
        return dre.a(j);
    }

    private final int s(cvc cvcVar) {
        if (this.b) {
            return cvcVar.b;
        }
        return cvcVar.a;
    }

    @Override // defpackage.anw, defpackage.asd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.anw
    public final int b() {
        return this.f;
    }

    @Override // defpackage.anw
    public final int c() {
        return this.g;
    }

    @Override // defpackage.anw
    public final Object d() {
        return this.v;
    }

    @Override // defpackage.anw, defpackage.asd
    public final Object e() {
        return this.d;
    }

    @Override // defpackage.asd
    public final int f() {
        return 0;
    }

    @Override // defpackage.asd
    public final int g() {
        return this.h;
    }

    @Override // defpackage.asd
    public final int h() {
        return this.n.size();
    }

    @Override // defpackage.asd
    public final int i() {
        return 1;
    }

    @Override // defpackage.asd
    public final long j() {
        return this.w;
    }

    @Override // defpackage.asd
    public final long k(int i) {
        int[] iArr = this.m;
        int i2 = i + i;
        return (iArr[i2] << 32) | (iArr[i2 + 1] & 4294967295L);
    }

    @Override // defpackage.asd
    public final Object l(int i) {
        return ((cvc) this.n.get(i)).f();
    }

    public final void m(cvc.a aVar, boolean z) {
        cof cofVar;
        long a;
        if (this.k == Integer.MIN_VALUE) {
            aju.c("position() should be called first");
        }
        int h = h();
        for (int i = 0; i < h; i++) {
            cvc cvcVar = (cvc) this.n.get(i);
            int s = this.x - s(cvcVar);
            int i2 = this.l;
            long k = k(i);
            arl b = this.e.b(this.d, i);
            if (b != null) {
                if (z) {
                    b.g = k;
                } else {
                    long j = b.g;
                    if (true != a.bB(j, 9223372034707292159L)) {
                        k = j;
                    }
                    long d = dre.d(k, b.a());
                    if ((r(k) <= s && r(d) <= s) || (r(k) >= i2 && r(d) >= i2)) {
                        b.c();
                    }
                    k = d;
                }
                cofVar = b.d;
            } else {
                cofVar = null;
            }
            if (this.r) {
                if (this.b) {
                    a = (dre.a(k) << 32) | (((this.k - dre.b(k)) - s(cvcVar)) & 4294967295L);
                } else {
                    a = (((this.k - dre.a(k)) - s(cvcVar)) << 32) | (dre.b(k) & 4294967295L);
                }
                k = a;
            }
            long d2 = dre.d(k, this.u);
            if (!z && b != null) {
                b.c = d2;
            }
            if (this.b) {
                if (cofVar != null) {
                    aVar.i(cvcVar, d2, cofVar, brg.a);
                } else {
                    aVar.h(cvcVar, d2, brg.a, cvd.a);
                }
            } else if (cofVar != null) {
                if (aVar.c() != drk.a && aVar.a() != 0) {
                    aVar.d(cvcVar);
                    cvcVar.v(dre.d((((aVar.a() - cvcVar.a) - dre.a(d2)) << 32) | (dre.b(d2) & 4294967295L), cvcVar.e), brg.a, cofVar);
                } else {
                    aVar.d(cvcVar);
                    cvcVar.v(dre.d(d2, cvcVar.e), brg.a, cofVar);
                }
            } else {
                cvc.a.p(aVar, cvcVar, d2);
            }
        }
    }

    public final void n(int i, int i2, int i3) {
        int i4;
        int i5;
        this.f = i;
        if (true != this.b) {
            i4 = i2;
        } else {
            i4 = i3;
        }
        this.k = i4;
        List list = this.n;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            cvc cvcVar = (cvc) list.get(i6);
            int i7 = i6 + i6;
            if (this.b) {
                int[] iArr = this.m;
                cfq.b bVar = this.o;
                if (bVar != null) {
                    iArr[i7] = bVar.a(cvcVar.a, i2, this.q);
                    this.m[i7 + 1] = i;
                    i5 = cvcVar.b;
                } else {
                    aju.a("null horizontalAlignment when isVertical == true");
                    throw new armj();
                }
            } else {
                int i8 = i7 + 1;
                int[] iArr2 = this.m;
                iArr2[i7] = i;
                cfq.c cVar = this.p;
                if (cVar != null) {
                    iArr2[i8] = cVar.a(cvcVar.b, i3);
                    i5 = cvcVar.a;
                } else {
                    aju.a("null verticalAlignment when isVertical == false");
                    throw new armj();
                }
            }
            i += i5;
        }
        this.x = -this.s;
        this.l = this.k + this.c;
    }

    @Override // defpackage.asd
    public final void o(int i, int i2, int i3, int i4) {
        n(i, i3, i4);
    }

    @Override // defpackage.asd
    public final boolean p() {
        return this.b;
    }

    @Override // defpackage.asd
    public final void q() {
        this.j = true;
    }
}
