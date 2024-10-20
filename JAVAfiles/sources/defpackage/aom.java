package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aom implements aog, cuf {
    public final aon a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final arwe f;
    public final dqv g;
    public final long h;
    public final List i;
    public final int j;
    public final int k;
    private final cuf l;
    private final boolean m;
    private final int n;
    private final boolean o;
    private final ahp p;
    private final int q;
    private final int r;

    public aom(aon aonVar, int i, boolean z, float f, cuf cufVar, float f2, boolean z2, arwe arweVar, dqv dqvVar, long j, List list, int i2, int i3, int i4, boolean z3, ahp ahpVar, int i5, int i6) {
        this.a = aonVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.l = cufVar;
        this.e = f2;
        this.m = z2;
        this.f = arweVar;
        this.g = dqvVar;
        this.h = j;
        this.i = list;
        this.n = i2;
        this.j = i3;
        this.k = i4;
        this.o = z3;
        this.p = ahpVar;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.aog
    public final int a() {
        return this.q;
    }

    @Override // defpackage.aog
    public final int b() {
        return -this.n;
    }

    @Override // defpackage.aog
    public final int c() {
        return this.r;
    }

    @Override // defpackage.aog
    public final int d() {
        return this.k;
    }

    @Override // defpackage.aog
    public final int e() {
        return this.j;
    }

    @Override // defpackage.aog
    public final int f() {
        return this.n;
    }

    @Override // defpackage.aog
    public final long g() {
        return (k() << 32) | (j() & 4294967295L);
    }

    @Override // defpackage.aog
    public final ahp h() {
        return this.p;
    }

    @Override // defpackage.aog
    public final List i() {
        return this.i;
    }

    @Override // defpackage.cuf
    public final int j() {
        return this.l.j();
    }

    @Override // defpackage.cuf
    public final int k() {
        return this.l.k();
    }

    public final aom l(int i, boolean z) {
        aon aonVar;
        int i2;
        boolean z2;
        int i3;
        long b;
        if (this.m || this.i.isEmpty() || (aonVar = this.a) == null || (i2 = this.b - i) < 0 || i2 >= aonVar.h) {
            return null;
        }
        aon aonVar2 = (aon) aqjn.X(this.i);
        aon aonVar3 = (aon) aqjn.ac(this.i);
        if (aonVar2.j || aonVar3.j) {
            return null;
        }
        if (i < 0) {
            if (Math.min((aonVar2.f + aonVar2.h) - this.n, (aonVar3.f + aonVar3.h) - this.j) <= (-i)) {
                return null;
            }
        } else if (Math.min(this.n - aonVar2.f, this.j - aonVar3.f) <= i) {
            return null;
        }
        List list = this.i;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            aon aonVar4 = (aon) list.get(i4);
            if (!aonVar4.j) {
                aonVar4.f += i;
                int length = aonVar4.m.length;
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = i5 & 1;
                    boolean z3 = aonVar4.b;
                    if (z3) {
                        if (i6 == 0) {
                            i6 = 0;
                        }
                        int[] iArr = aonVar4.m;
                        iArr[i5] = iArr[i5] + i;
                    }
                    if (!z3) {
                        if (i6 != 0) {
                        }
                        int[] iArr2 = aonVar4.m;
                        iArr2[i5] = iArr2[i5] + i;
                    }
                }
                if (z) {
                    int h = aonVar4.h();
                    int i7 = 0;
                    while (i7 < h) {
                        arl b2 = aonVar4.e.b(aonVar4.d, i7);
                        if (b2 != null) {
                            boolean z4 = aonVar4.b;
                            long j = b2.b;
                            if (z4) {
                                i3 = i4;
                                b = (dre.a(j) << 32) | (Integer.valueOf(dre.b(j) + i).intValue() & 4294967295L);
                            } else {
                                i3 = i4;
                                b = (dre.b(j) & 4294967295L) | (Integer.valueOf(dre.a(j) + i).intValue() << 32);
                            }
                            b2.b = b;
                        } else {
                            i3 = i4;
                        }
                        i7++;
                        i4 = i3;
                    }
                }
            }
            i4++;
        }
        aon aonVar5 = this.a;
        int i8 = this.b - i;
        if (!this.c && i <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new aom(aonVar5, i8, z2, i, this.l, this.e, this.m, this.f, this.g, this.h, this.i, this.n, this.j, this.k, this.o, this.p, this.q, this.r);
    }

    @Override // defpackage.cuf
    public final Map m() {
        return this.l.m();
    }

    @Override // defpackage.cuf
    public final arqr n() {
        return this.l.n();
    }

    @Override // defpackage.cuf
    public final void o() {
        this.l.o();
    }
}
