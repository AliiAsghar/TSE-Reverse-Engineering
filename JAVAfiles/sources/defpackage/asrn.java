package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrn extends asqx {
    public final transient byte[][] e;
    public final transient int[] f;

    public asrn(byte[][] bArr, int[] iArr) {
        super(asqx.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final asqx n() {
        return new asqx(k());
    }

    private final Object writeReplace() {
        return n();
    }

    @Override // defpackage.asqx
    public final byte a(int i) {
        int i2;
        aotl.T(this.f[this.e.length - 1], i, 1L);
        int M = aotl.M(this, i);
        if (M == 0) {
            i2 = 0;
        } else {
            i2 = this.f[M - 1];
        }
        int[] iArr = this.f;
        byte[][] bArr = this.e;
        return bArr[M][(i - i2) + iArr[bArr.length + M]];
    }

    @Override // defpackage.asqx
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.asqx
    public final String d() {
        return n().d();
    }

    @Override // defpackage.asqx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asqx) {
            asqx asqxVar = (asqx) obj;
            if (asqxVar.b() == b() && l(asqxVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.asqx
    public final asqx g() {
        return n().g();
    }

    @Override // defpackage.asqx
    public final boolean h(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int M = aotl.M(this, i);
        while (i < i5) {
            if (M == 0) {
                M = 0;
                i4 = 0;
            } else {
                i4 = this.f[M - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[M] - i4;
            int i7 = iArr[this.e.length + M];
            int min = Math.min(i5, i6 + i4) - i;
            if (!aotl.U(this.e[M], i7 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            M++;
        }
        return true;
    }

    @Override // defpackage.asqx
    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            byte[][] bArr = this.e;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (true) {
                int length = bArr.length;
                if (i2 < length) {
                    int[] iArr = this.f;
                    byte[][] bArr2 = this.e;
                    int i5 = iArr[length + i2];
                    int i6 = iArr[i2];
                    int i7 = (i6 - i4) + i5;
                    byte[] bArr3 = bArr2[i2];
                    while (i5 < i7) {
                        i3 = (i3 * 31) + bArr3[i5];
                        i5++;
                    }
                    i2++;
                    i4 = i6;
                } else {
                    this.c = i3;
                    return i3;
                }
            }
        } else {
            return i;
        }
    }

    @Override // defpackage.asqx
    public final byte[] j() {
        return k();
    }

    @Override // defpackage.asqx
    public final byte[] k() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i < length) {
                int[] iArr = this.f;
                int i4 = iArr[length + i];
                int i5 = iArr[i];
                int i6 = i5 - i2;
                aqil.u(bArr2[i], bArr, i3, i4, i4 + i6);
                i3 += i6;
                i++;
                i2 = i5;
            } else {
                return bArr;
            }
        }
    }

    @Override // defpackage.asqx
    public final boolean l(asqx asqxVar, int i) {
        int i2;
        asqxVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int M = aotl.M(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (M == 0) {
                M = 0;
                i2 = 0;
            } else {
                i2 = this.f[M - 1];
            }
            int[] iArr = this.f;
            int i5 = iArr[M] - i2;
            int i6 = iArr[this.e.length + M];
            int min = Math.min(i, i5 + i2) - i3;
            if (!asqxVar.h(i4, this.e[M], i6 + (i3 - i2), min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            M++;
        }
        return true;
    }

    @Override // defpackage.asqx
    public final void m(asqu asquVar, int i) {
        int i2;
        int M = aotl.M(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (M == 0) {
                M = 0;
                i2 = 0;
            } else {
                i2 = this.f[M - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[M] - i2;
            int i5 = iArr[this.e.length + M];
            int min = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            asrl asrlVar = new asrl(this.e[M], i6, i6 + min, true);
            asrl asrlVar2 = asquVar.a;
            if (asrlVar2 == null) {
                asrlVar.g = asrlVar;
                asrlVar.f = asrlVar.g;
                asquVar.a = asrlVar.f;
            } else {
                asrl asrlVar3 = asrlVar2.g;
                asrlVar3.getClass();
                asrlVar3.d(asrlVar);
            }
            i3 += min;
            M++;
        }
        asquVar.b += i;
    }

    @Override // defpackage.asqx
    public final String toString() {
        return n().toString();
    }
}
