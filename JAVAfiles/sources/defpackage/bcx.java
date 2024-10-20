package defpackage;

import defpackage.bcy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcx {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final diy f;

    public bcx(long j, int i, int i2, int i3, int i4, diy diyVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = diyVar;
    }

    public final int a() {
        return e().length();
    }

    public final bcn b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return bcn.b;
        }
        if (i > i2) {
            return bcn.a;
        }
        return bcn.c;
    }

    public final bcy.a c(int i) {
        return new bcy.a(bdt.b(this.f, i), i, this.a);
    }

    public final bcy d(int i, int i2) {
        boolean z;
        bcy.a c = c(i);
        bcy.a c2 = c(i2);
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        return new bcy(c, c2, z);
    }

    public final String e() {
        return this.f.a.a.b;
    }

    public final boolean f(bcx bcxVar) {
        if (this.a == bcxVar.a && this.c == bcxVar.c && this.d == bcxVar.d) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "SelectionInfo(id=" + this.a + ", range=(" + this.c + '-' + bdt.b(this.f, this.c) + ',' + this.d + '-' + bdt.b(this.f, this.d) + "), prevOffset=" + this.e + ')';
    }
}
