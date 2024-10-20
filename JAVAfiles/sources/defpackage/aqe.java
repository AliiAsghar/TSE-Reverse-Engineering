package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqe implements apy, cuf {
    public final aqh a;
    public final int b;
    public final boolean c;
    public final float d;
    public final cuf e;
    public final boolean f;
    public final arwe g;
    public final dqv h;
    public final int i;
    public final arqr j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o = false;
    public final ahp p;
    public final int q;
    public final int r;

    public aqe(aqh aqhVar, int i, boolean z, float f, cuf cufVar, boolean z2, arwe arweVar, dqv dqvVar, int i2, arqr arqrVar, List list, int i3, int i4, int i5, ahp ahpVar, int i6, int i7) {
        this.a = aqhVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = cufVar;
        this.f = z2;
        this.g = arweVar;
        this.h = dqvVar;
        this.i = i2;
        this.j = arqrVar;
        this.k = list;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.p = ahpVar;
        this.q = i6;
        this.r = i7;
    }

    @Override // defpackage.apy
    public final int a() {
        return this.q;
    }

    @Override // defpackage.apy
    public final int b() {
        return -this.l;
    }

    @Override // defpackage.apy
    public final int c() {
        return this.r;
    }

    @Override // defpackage.apy
    public final int d() {
        return this.n;
    }

    @Override // defpackage.apy
    public final int e() {
        return this.m;
    }

    @Override // defpackage.apy
    public final int f() {
        return this.l;
    }

    @Override // defpackage.apy
    public final long g() {
        return (k() << 32) | (j() & 4294967295L);
    }

    @Override // defpackage.apy
    public final ahp h() {
        return this.p;
    }

    @Override // defpackage.apy
    public final List i() {
        return this.k;
    }

    @Override // defpackage.cuf
    public final int j() {
        return this.e.j();
    }

    @Override // defpackage.cuf
    public final int k() {
        return this.e.k();
    }

    @Override // defpackage.cuf
    public final Map m() {
        return this.e.m();
    }

    @Override // defpackage.cuf
    public final arqr n() {
        return this.e.n();
    }

    @Override // defpackage.cuf
    public final void o() {
        this.e.o();
    }
}
