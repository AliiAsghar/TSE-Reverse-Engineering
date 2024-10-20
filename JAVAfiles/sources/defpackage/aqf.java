package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqf implements apj, asd {
    public final int a;
    public final Object b;
    public final int c;
    public final LazyLayoutItemAnimator d;
    public final int e;
    public final int f;
    public int g = Integer.MIN_VALUE;
    public int h;
    public long i;
    public boolean j;
    private final int k;
    private final drk l;
    private final int m;
    private final List n;
    private final long o;
    private final long p;
    private final int q;
    private final int r;
    private int s;
    private final long t;
    private int u;
    private int v;

    public aqf(int i, Object obj, int i2, int i3, drk drkVar, int i4, int i5, List list, long j, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.k = i2;
        this.l = drkVar;
        this.m = i4;
        this.c = i5;
        this.n = list;
        this.o = j;
        this.d = lazyLayoutItemAnimator;
        this.p = j2;
        this.q = i6;
        this.r = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((cvc) list.get(i9)).b);
        }
        this.e = i8;
        this.f = arrn.r(i3 + i8, 0);
        this.t = (this.k << 32) | (i8 & 4294967295L);
        this.i = 0L;
        this.u = -1;
        this.v = -1;
    }

    @Override // defpackage.apj, defpackage.asd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.apj
    public final int b() {
        return this.v;
    }

    @Override // defpackage.apj
    public final int c() {
        return this.u;
    }

    @Override // defpackage.apj
    public final long d() {
        return this.i;
    }

    @Override // defpackage.asd
    public final Object e() {
        return this.b;
    }

    @Override // defpackage.asd
    public final int f() {
        return this.q;
    }

    @Override // defpackage.asd
    public final int g() {
        return this.f;
    }

    @Override // defpackage.asd
    public final int h() {
        return this.n.size();
    }

    @Override // defpackage.asd
    public final int i() {
        return this.r;
    }

    @Override // defpackage.asd
    public final long j() {
        return this.p;
    }

    @Override // defpackage.asd
    public final long k(int i) {
        return this.i;
    }

    @Override // defpackage.asd
    public final Object l(int i) {
        return ((cvc) this.n.get(i)).f();
    }

    @Override // defpackage.apj
    public final long m() {
        return this.t;
    }

    public final void n(cvc.a aVar) {
        cof cofVar;
        if (this.g == Integer.MIN_VALUE) {
            aju.c("position() should be called first");
        }
        int h = h();
        for (int i = 0; i < h; i++) {
            cvc cvcVar = (cvc) this.n.get(i);
            int i2 = this.s - cvcVar.b;
            int i3 = this.h;
            long j = this.i;
            arl b = this.d.b(this.b, i);
            if (b != null) {
                long d = dre.d(j, b.a());
                if ((dre.b(j) <= i2 && dre.b(d) <= i2) || (dre.b(j) >= i3 && dre.b(d) >= i3)) {
                    b.c();
                }
                cofVar = b.d;
                j = d;
            } else {
                cofVar = null;
            }
            long d2 = dre.d(j, this.o);
            if (b != null) {
                b.c = d2;
            }
            if (cofVar != null) {
                aVar.i(cvcVar, d2, cofVar, brg.a);
            } else {
                aVar.h(cvcVar, d2, brg.a, cvd.a);
            }
        }
    }

    @Override // defpackage.asd
    public final void o(int i, int i2, int i3, int i4) {
        r(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.asd
    public final boolean p() {
        return true;
    }

    @Override // defpackage.asd
    public final void q() {
        this.j = true;
    }

    public final void r(int i, int i2, int i3, int i4, int i5, int i6) {
        this.g = i4;
        if (this.l == drk.b) {
            i2 = (i3 - i2) - this.k;
        }
        this.i = (i2 << 32) | (i & 4294967295L);
        this.u = i5;
        this.v = i6;
        this.s = -this.m;
        this.h = this.g + this.c;
    }
}
