package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmf {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public fmf() {
    }

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (fmg.c(i) && (i2 = (i >>> 19) & 3) != 1 && (i3 = (i >>> 17) & 3) != 0 && (i4 = (i >>> 12) & 15) != 0 && i4 != 15 && (i5 = (i >>> 10) & 3) != 3) {
            int i8 = i4 - 1;
            this.a = i2;
            this.b = fmg.a[3 - i3];
            int i9 = fmg.b[i5];
            this.d = i9;
            int i10 = 2;
            if (i2 == 2) {
                i9 /= 2;
                this.d = i9;
            } else if (i2 == 0) {
                i9 /= 4;
                this.d = i9;
            }
            int i11 = (i >>> 9) & 1;
            this.g = fmg.b(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = fmg.c[i8];
                } else {
                    i7 = fmg.d[i8];
                }
                this.f = i7;
                this.c = (((i7 * 12) / i9) + i11) * 4;
            } else {
                int i12 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = fmg.e[i8];
                    } else {
                        i6 = fmg.f[i8];
                    }
                    this.f = i6;
                    this.c = ((i6 * 144) / i9) + i11;
                } else {
                    int i13 = fmg.g[i8];
                    this.f = i13;
                    if (i3 == 1) {
                        i12 = 72;
                    }
                    this.c = ((i12 * i13) / i9) + i11;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i10 = 1;
            }
            this.e = i10;
            return true;
        }
        return false;
    }

    public fmf(fmf fmfVar) {
        this.a = fmfVar.a;
        this.b = fmfVar.b;
        this.c = fmfVar.c;
        this.d = fmfVar.d;
        this.e = fmfVar.e;
        this.f = fmfVar.f;
        this.g = fmfVar.g;
    }
}
