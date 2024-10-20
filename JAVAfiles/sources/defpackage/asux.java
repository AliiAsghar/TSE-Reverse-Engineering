package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asux extends asuy {
    public int e;
    asvb f;
    private int g;
    private int[] h;

    public asux() {
        throw null;
    }

    public final int a() {
        int i = this.e;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        asuy asuyVar = this;
        int i2 = 1;
        while (numberOfLeadingZeros > 0) {
            asuyVar = asuyVar.l(i2).c(asuyVar);
            numberOfLeadingZeros--;
            i2 = i >>> numberOfLeadingZeros;
            if ((i2 & 1) != 0) {
                asuyVar = asuyVar.j().c(this);
            }
        }
        if (asuyVar.n()) {
            return 0;
        }
        if (asuyVar.m()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }

    @Override // defpackage.asuy
    public final BigInteger b() {
        asvb asvbVar = this.f;
        int c = asvbVar.c();
        if (c == 0) {
            return asuu.a;
        }
        int i = c - 1;
        long j = asvbVar.b[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (!z && b == 0) {
                z = false;
            } else {
                bArr[i2] = b;
                i2++;
                z = true;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = c - 2; i5 >= 0; i5--) {
            long j2 = asvbVar.b[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    @Override // defpackage.asuy
    public final asuy c(asuy asuyVar) {
        asvb asvbVar = (asvb) this.f.clone();
        asvbVar.m(((asux) asuyVar).f);
        return new asux(this.e, this.h, asvbVar);
    }

    @Override // defpackage.asuy
    public final asuy d() {
        asvb asvbVar;
        int i = this.e;
        int[] iArr = this.h;
        asvb asvbVar2 = this.f;
        if (asvbVar2.b.length == 0) {
            asvbVar = new asvb(new long[]{1});
        } else {
            long[] l = asvbVar2.l(Math.max(1, asvbVar2.c()));
            l[0] = l[0] ^ 1;
            asvbVar = new asvb(l);
        }
        return new asux(i, iArr, asvbVar);
    }

    @Override // defpackage.asuy
    public final asuy e(asuy asuyVar) {
        return g(asuyVar.f());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof asux)) {
            return false;
        }
        asux asuxVar = (asux) obj;
        if (this.e == asuxVar.e && this.g == asuxVar.g && Arrays.equals(this.h, asuxVar.h) && this.f.equals(asuxVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.asuy
    public final asuy f() {
        int i;
        int i2 = this.e;
        int[] iArr = this.h;
        asvb asvbVar = this.f;
        int a = asvbVar.a();
        if (a != 0) {
            int i3 = 1;
            if (a != 1) {
                Object clone = asvbVar.clone();
                int i4 = (i2 + 63) >>> 6;
                asvb asvbVar2 = new asvb(i4);
                asvb.p(asvbVar2.b, i2, i2, iArr);
                asvb asvbVar3 = new asvb(i4);
                int i5 = 0;
                asvbVar3.b[0] = 1;
                asvb asvbVar4 = new asvb(i4);
                int[] iArr2 = new int[2];
                iArr2[0] = a;
                int i6 = i2 + 1;
                iArr2[1] = i6;
                asvb[] asvbVarArr = {(asvb) clone, asvbVar2};
                int[] iArr3 = new int[2];
                iArr3[0] = 1;
                iArr3[1] = 0;
                asvb[] asvbVarArr2 = {asvbVar3, asvbVar4};
                int i7 = i6 - iArr2[0];
                while (true) {
                    if (i7 < 0) {
                        i7 = -i7;
                        iArr2[i3] = i6;
                        iArr3[i3] = i5;
                        int i8 = 1 - i3;
                        int i9 = iArr2[i8];
                        i5 = iArr3[i8];
                        i3 = i8;
                        i6 = i9;
                    }
                    i = 1 - i3;
                    asvbVarArr[i3].h(asvbVarArr[i], iArr2[i], i7);
                    int b = asvbVarArr[i3].b(i6);
                    if (b == 0) {
                        break;
                    }
                    int i10 = iArr3[i];
                    asvbVarArr2[i3].h(asvbVarArr2[i], i10, i7);
                    int i11 = i10 + i7;
                    if (i11 > i5) {
                        i5 = i11;
                    } else if (i11 == i5) {
                        i5 = asvbVarArr2[i3].b(i5);
                    }
                    i7 += b - i6;
                    i6 = b;
                }
                asvbVar = asvbVarArr2[i];
            }
            return new asux(i2, iArr, asvbVar);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.asuy
    public final asuy g(asuy asuyVar) {
        asvb asvbVar;
        int i;
        long[] jArr;
        int[] iArr;
        int i2;
        int i3;
        int i4 = this.e;
        int[] iArr2 = this.h;
        asvb asvbVar2 = this.f;
        asvb asvbVar3 = ((asux) asuyVar).f;
        int a = asvbVar2.a();
        if (a != 0) {
            int a2 = asvbVar3.a();
            if (a2 == 0) {
                asvbVar2 = asvbVar3;
            } else {
                if (a > a2) {
                    asvbVar = asvbVar2;
                } else {
                    asvbVar = asvbVar3;
                }
                if (a > a2) {
                    asvbVar2 = asvbVar3;
                }
                if (a > a2) {
                    i = a;
                } else {
                    i = a2;
                }
                if (a > a2) {
                    a = a2;
                }
                int i5 = a + i + 62;
                int i6 = (a + 63) >>> 6;
                int i7 = i5 >>> 6;
                int i8 = (i + 63) >>> 6;
                if (i6 == 1) {
                    long j = asvbVar2.b[0];
                    if (j != 1) {
                        long[] jArr2 = new long[i7];
                        asvb.o(j, asvbVar.b, i8, jArr2);
                        asvbVar2 = asvb.r(jArr2, i7, i4, iArr2);
                    } else {
                        asvbVar2 = asvbVar;
                    }
                } else {
                    int i9 = (i + 70) >>> 6;
                    int i10 = i9 << 4;
                    int i11 = 16;
                    int[] iArr3 = new int[16];
                    long[] jArr3 = new long[i10];
                    iArr3[1] = i9;
                    System.arraycopy(asvbVar.b, 0, jArr3, i9, i8);
                    int i12 = 2;
                    int i13 = i9;
                    while (i12 < i11) {
                        i13 += i9;
                        iArr3[i12] = i13;
                        if ((i12 & 1) == 0) {
                            jArr = jArr3;
                            iArr = iArr3;
                            i2 = i11;
                            i3 = i10;
                            asvb.s(jArr3, i13 >>> 1, jArr, i13, i9, 1);
                        } else {
                            jArr = jArr3;
                            iArr = iArr3;
                            i2 = i11;
                            i3 = i10;
                            asvb.f(jArr3, i9, jArr, i13 - i9, jArr, i13, i9);
                        }
                        i12++;
                        i10 = i3;
                        i11 = i2;
                        jArr3 = jArr;
                        iArr3 = iArr;
                    }
                    long[] jArr4 = jArr3;
                    int[] iArr4 = iArr3;
                    int i14 = i10;
                    long[] jArr5 = new long[i14];
                    asvb.s(jArr3, 0, jArr5, 0, i14, 4);
                    long[] jArr6 = asvbVar2.b;
                    int i15 = i7 << 3;
                    long[] jArr7 = new long[i15];
                    for (int i16 = 0; i16 < i6; i16++) {
                        int i17 = i16;
                        long j2 = jArr6[i16];
                        while (true) {
                            asvb.g(jArr7, i17, jArr4, iArr4[((int) j2) & 15], jArr5, iArr4[((int) (j2 >>> 4)) & 15], i9);
                            j2 >>>= 8;
                            if (j2 == 0) {
                                break;
                            }
                            i17 += i7;
                        }
                    }
                    while (true) {
                        i15 -= i7;
                        if (i15 == 0) {
                            break;
                        }
                        long[] jArr8 = jArr7;
                        asvb.d(jArr7, i15 - i7, jArr8, i15, i7, 8);
                        jArr7 = jArr8;
                    }
                    asvbVar2 = asvb.r(jArr7, i7, i4, iArr2);
                }
            }
        }
        return new asux(i4, iArr2, asvbVar2);
    }

    @Override // defpackage.asuy
    public final asuy h(asuy asuyVar, asuy asuyVar2, asuy asuyVar3) {
        asvb asvbVar = this.f;
        asvb asvbVar2 = ((asux) asuyVar).f;
        asvb asvbVar3 = ((asux) asuyVar2).f;
        asvb asvbVar4 = ((asux) asuyVar3).f;
        asvb n = asvbVar.n(asvbVar2);
        asvb n2 = asvbVar3.n(asvbVar4);
        Object obj = n;
        if (n == asvbVar || n == asvbVar2) {
            obj = n.clone();
        }
        asvb asvbVar5 = (asvb) obj;
        asvbVar5.m(n2);
        asvbVar5.i(this.e, this.h);
        return new asux(this.e, this.h, asvbVar5);
    }

    public final int hashCode() {
        return (this.f.hashCode() ^ this.e) ^ atow.N(this.h);
    }

    @Override // defpackage.asuy
    public final asuy i() {
        if (!this.f.k() && !this.f.j()) {
            return l(this.e - 1);
        }
        return this;
    }

    @Override // defpackage.asuy
    public final asuy j() {
        int i = this.e;
        int[] iArr = this.h;
        asvb asvbVar = this.f;
        int c = asvbVar.c();
        if (c != 0) {
            int i2 = c + c;
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3 += 2) {
                long j = asvbVar.b[i3 >>> 1];
                jArr[i3] = asvb.e((int) j);
                jArr[i3 + 1] = asvb.e((int) (j >>> 32));
            }
            asvbVar = new asvb(jArr, asvb.q(jArr, i2, i, iArr));
        }
        return new asux(i, iArr, asvbVar);
    }

    @Override // defpackage.asuy
    public final asuy k(asuy asuyVar, asuy asuyVar2) {
        asvb asvbVar;
        asvb asvbVar2 = this.f;
        asvb asvbVar3 = ((asux) asuyVar).f;
        asvb asvbVar4 = ((asux) asuyVar2).f;
        int c = asvbVar2.c();
        if (c == 0) {
            asvbVar = asvbVar2;
        } else {
            int i = c + c;
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < i; i2 += 2) {
                long j = asvbVar2.b[i2 >>> 1];
                jArr[i2] = asvb.e((int) j);
                jArr[i2 + 1] = asvb.e((int) (j >>> 32));
            }
            asvbVar = new asvb(jArr, i);
        }
        asvb n = asvbVar3.n(asvbVar4);
        Object obj = asvbVar;
        if (asvbVar == asvbVar2) {
            obj = asvbVar.clone();
        }
        asvb asvbVar5 = (asvb) obj;
        asvbVar5.m(n);
        asvbVar5.i(this.e, this.h);
        return new asux(this.e, this.h, asvbVar5);
    }

    @Override // defpackage.asuy
    public final asuy l(int i) {
        if (i <= 0) {
            return this;
        }
        int i2 = this.e;
        int[] iArr = this.h;
        asvb asvbVar = this.f;
        int c = asvbVar.c();
        if (c != 0) {
            int i3 = (i2 + 63) >>> 6;
            int i4 = i3 + i3;
            long[] jArr = new long[i4];
            System.arraycopy(asvbVar.b, 0, jArr, 0, c);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i5 = c + c;
                while (true) {
                    c--;
                    if (c >= 0) {
                        long j = jArr[c];
                        jArr[i5 - 1] = asvb.e((int) (j >>> 32));
                        i5 -= 2;
                        jArr[i5] = asvb.e((int) j);
                    }
                }
                c = asvb.q(jArr, i4, i2, iArr);
            }
            asvbVar = new asvb(jArr, c);
        }
        return new asux(i2, iArr, asvbVar);
    }

    @Override // defpackage.asuy
    public final boolean m() {
        return this.f.j();
    }

    @Override // defpackage.asuy
    public final boolean n() {
        return this.f.k();
    }

    public asux(int i, int[] iArr, asvb asvbVar) {
        this.e = i;
        this.g = iArr.length == 1 ? 2 : 3;
        this.h = iArr;
        this.f = asvbVar;
    }
}
