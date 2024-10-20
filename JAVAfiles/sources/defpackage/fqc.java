package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqc {
    public final fmq a;
    public fql d;
    public fqa e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public final fqk b = new fqk();
    public final euf c = new euf();
    private final euf k = new euf(1);
    private final euf l = new euf();

    public fqc(fmq fmqVar, fql fqlVar, fqa fqaVar) {
        this.a = fmqVar;
        this.d = fqlVar;
        this.e = fqaVar;
        d(fqlVar, fqaVar);
    }

    public final int a() {
        int i;
        if (!this.j) {
            i = this.d.g[this.f];
        } else if (this.b.j[this.f]) {
            i = 1;
        } else {
            i = 0;
        }
        if (g() != null) {
            return i | 1073741824;
        }
        return i;
    }

    public final int b(int i, int i2) {
        euf eufVar;
        boolean z;
        int i3;
        hka g = g();
        if (g == null) {
            return 0;
        }
        int i4 = g.a;
        if (i4 != 0) {
            eufVar = this.b.m;
        } else {
            Object obj = g.d;
            int i5 = eul.a;
            euf eufVar2 = this.l;
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            eufVar2.H(bArr, length);
            eufVar = this.l;
            i4 = length;
        }
        boolean c = this.b.c(this.f);
        if (!c && i2 == 0) {
            z = false;
        } else {
            z = true;
        }
        euf eufVar3 = this.k;
        if (true != z) {
            i3 = 0;
        } else {
            i3 = 128;
        }
        eufVar3.a[0] = (byte) (i3 | i4);
        eufVar3.J(0);
        this.a.m(this.k, 1, 1);
        this.a.m(eufVar, i4, 1);
        if (!z) {
            return i4 + 1;
        }
        if (!c) {
            this.c.F(8);
            euf eufVar4 = this.c;
            byte[] bArr2 = eufVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            this.a.m(eufVar4, 8, 1);
            return i4 + 9;
        }
        int i6 = i4 + 1;
        euf eufVar5 = this.b.m;
        int n = eufVar5.n();
        eufVar5.K(-2);
        int i7 = (n * 6) + 2;
        if (i2 != 0) {
            this.c.F(i7);
            byte[] bArr3 = this.c.a;
            eufVar5.E(bArr3, 0, i7);
            int i8 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i8 >> 8) & 255);
            bArr3[3] = (byte) (i8 & 255);
            eufVar5 = this.c;
        }
        this.a.m(eufVar5, i7, 1);
        return i6 + i7;
    }

    public final long c() {
        if (!this.j) {
            return this.d.c[this.f];
        }
        return this.b.f[this.h];
    }

    public final void d(fql fqlVar, fqa fqaVar) {
        this.d = fqlVar;
        this.e = fqaVar;
        this.a.h(fqlVar.a.g);
        e();
    }

    public final void e() {
        fqk fqkVar = this.b;
        fqkVar.d = 0;
        fqkVar.o = 0L;
        fqkVar.p = false;
        fqkVar.k = false;
        fqkVar.n = false;
        fqkVar.q = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.j = false;
    }

    public final boolean f() {
        this.f++;
        if (!this.j) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final hka g() {
        if (!this.j) {
            return null;
        }
        fqa fqaVar = this.b.a;
        int i = eul.a;
        int i2 = fqaVar.a;
        hka hkaVar = this.b.q;
        if (hkaVar == null) {
            hkaVar = this.d.a.b(i2);
        }
        if (hkaVar == null || !hkaVar.b) {
            return null;
        }
        return hkaVar;
    }
}
