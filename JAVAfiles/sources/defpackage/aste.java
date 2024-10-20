package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aste extends astb implements assy {
    static final int[] d = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final int[] m = new int[64];
    private int n;

    public aste() {
        aotl.J(this);
        assw.a();
        h();
    }

    private static int i(int i, int i2, int i3) {
        return (i & i2) ^ ((~i) & i3);
    }

    private static int j(int i, int i2, int i3) {
        return (i & i2) | (i3 & (i ^ i2));
    }

    private static int k(int i) {
        return (((i << 30) | (i >>> 2)) ^ ((i >>> 13) | (i << 19))) ^ ((i >>> 22) | (i << 10));
    }

    private static int l(int i) {
        return (((i << 26) | (i >>> 6)) ^ ((i >>> 11) | (i << 21))) ^ ((i >>> 25) | (i << 7));
    }

    @Override // defpackage.assy
    public final int a(byte[] bArr, int i) {
        long j = this.c << 3;
        d(Byte.MIN_VALUE);
        while (this.b != 0) {
            d((byte) 0);
        }
        if (this.n > 14) {
            f();
        }
        int[] iArr = this.m;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        f();
        atow.G(this.e, bArr, i);
        atow.G(this.f, bArr, i + 4);
        atow.G(this.g, bArr, i + 8);
        atow.G(this.h, bArr, i + 12);
        atow.G(this.i, bArr, i + 16);
        atow.G(this.j, bArr, i + 20);
        atow.G(this.k, bArr, i + 24);
        atow.G(this.l, bArr, i + 28);
        h();
        return 32;
    }

    @Override // defpackage.assy
    public final int b() {
        return 32;
    }

    @Override // defpackage.assy
    public final String c() {
        return "SHA-256";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.astb
    public final void f() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.m;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        int i11 = this.k;
        int i12 = this.l;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int l = l(i9);
            int i15 = i(i9, i10, i11);
            int[] iArr2 = d;
            int i16 = l + i15 + iArr2[i14];
            int[] iArr3 = this.m;
            int i17 = i12 + i16 + iArr3[i14];
            int i18 = i8 + i17;
            int k = k(i5);
            int j = j(i5, i6, i7);
            int i19 = i14 + 1;
            int l2 = i11 + l(i18) + i(i18, i9, i10) + iArr2[i19] + iArr3[i19];
            int i20 = i7 + l2;
            int i21 = i17 + k + j;
            int j2 = j(i21, i5, i6);
            int i22 = i14 + 2;
            int l3 = i10 + l(i20) + i(i20, i18, i9) + iArr2[i22] + iArr3[i22];
            int i23 = i6 + l3;
            int k2 = l2 + k(i21) + j2;
            int j3 = j(k2, i21, i5);
            int i24 = i14 + 3;
            int l4 = i9 + l(i23) + i(i23, i20, i18) + iArr2[i24] + iArr3[i24];
            int i25 = i5 + l4;
            int i26 = i14 + 4;
            int l5 = l(i25) + i(i25, i23, i20) + iArr2[i26] + iArr3[i26];
            int i27 = i14 + 5;
            int i28 = i18 + l5;
            int i29 = i21 + i28;
            int l6 = l(i29) + i(i29, i25, i23) + iArr2[i27] + iArr3[i27];
            int i30 = i14 + 6;
            int i31 = i20 + l6;
            int i32 = k2 + i31;
            int l7 = l(i32) + i(i32, i29, i25) + iArr2[i30] + iArr3[i30];
            int i33 = i14 + 7;
            int i34 = iArr2[i33];
            int k3 = l3 + k(k2) + j3;
            int i35 = i23 + l7;
            int i36 = k3 + i35;
            int l8 = l(i36) + i(i36, i32, i29) + i34 + iArr3[i33];
            i14 += 8;
            int k4 = l4 + k(k3) + j(k3, k2, i21);
            i8 = i28 + k(k4) + j(k4, k3, k2);
            i7 = i31 + k(i8) + j(i8, k4, k3);
            int i37 = i25 + l8;
            i6 = i35 + k(i7) + j(i7, i8, k4);
            i9 = k4 + i37;
            i13++;
            i12 = i29;
            i5 = k(i6) + j(i6, i7, i8) + i37;
            i11 = i32;
            i10 = i36;
        }
        this.e += i5;
        this.f += i6;
        this.g += i7;
        this.h += i8;
        this.i += i9;
        this.j += i10;
        this.k += i11;
        this.l += i12;
        this.n = 0;
        for (int i38 = 0; i38 < 16; i38++) {
            this.m[i38] = 0;
        }
    }

    @Override // defpackage.astb
    protected final void g(byte[] bArr, int i) {
        this.m[this.n] = atow.C(bArr, i);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            f();
        }
    }

    public final void h() {
        this.c = 0L;
        this.b = 0;
        for (int i = 0; i < 4; i++) {
            this.a[i] = 0;
        }
        this.e = 1779033703;
        this.f = -1150833019;
        this.g = 1013904242;
        this.h = -1521486534;
        this.i = 1359893119;
        this.j = -1694144372;
        this.k = 528734635;
        this.l = 1541459225;
        this.n = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.m;
            if (i2 != 64) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
