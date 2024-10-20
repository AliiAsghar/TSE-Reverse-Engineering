package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fue implements fur {
    public int b;
    private final ftn c;
    private int d;
    private euj e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private final fjl k = new fjl(new byte[10], (byte[]) null);
    public int a = 0;

    public fue(ftn ftnVar) {
        this.c = ftnVar;
    }

    private final void d(int i) {
        this.a = i;
        this.d = 0;
    }

    private final boolean e(euf eufVar, byte[] bArr, int i) {
        int min = Math.min(eufVar.b(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            eufVar.K(min);
        } else {
            eufVar.E(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v15, types: [fjl] */
    /* JADX WARN: Type inference failed for: r8v8, types: [ftn] */
    @Override // defpackage.fur
    public final void a(euf eufVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        boolean z2;
        dzg.h(this.e);
        int i9 = -1;
        int i10 = 2;
        ?? r6 = 0;
        int i11 = 1;
        if ((i & 1) != 0) {
            int i12 = this.a;
            if (i12 != 0 && i12 != 1) {
                if (i12 != 2) {
                    int i13 = this.b;
                    if (i13 != -1) {
                        eub.f("PesReader", a.cb(i13, "Unexpected start indicator: expected ", " more bytes"));
                    }
                    if (eufVar.c == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.c.c(z2);
                } else {
                    eub.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i14 = i;
        while (eufVar.b() > 0) {
            int i15 = this.a;
            if (i15 != 0) {
                if (i15 != i11) {
                    if (i15 != i10) {
                        int b = eufVar.b();
                        int i16 = this.b;
                        if (i16 == i9) {
                            i6 = r6;
                        } else {
                            i6 = b - i16;
                        }
                        if (i6 > 0) {
                            b -= i6;
                            eufVar.I(eufVar.b + b);
                        }
                        this.c.a(eufVar);
                        int i17 = this.b;
                        if (i17 != i9) {
                            int i18 = i17 - b;
                            this.b = i18;
                            if (i18 == 0) {
                                this.c.c(r6);
                                d(i11);
                            }
                        }
                    } else {
                        if (e(eufVar, (byte[]) this.k.c, Math.min(10, this.i)) && e(eufVar, null, this.i)) {
                            this.k.q(r6);
                            if (this.f) {
                                this.k.s(4);
                                long i19 = this.k.i(3);
                                this.k.s(i11);
                                int i20 = this.k.i(15) << 15;
                                this.k.s(i11);
                                long i21 = this.k.i(15);
                                this.k.s(i11);
                                if (!this.h && this.g) {
                                    this.k.s(4);
                                    this.k.s(i11);
                                    int i22 = this.k.i(15) << 15;
                                    this.k.s(i11);
                                    long i23 = this.k.i(15);
                                    this.k.s(i11);
                                    i8 = i20;
                                    this.e.b((this.k.i(3) << 30) | i22 | i23);
                                    this.h = true;
                                } else {
                                    i8 = i20;
                                }
                                j = this.e.b((i19 << 30) | i8 | i21);
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (true != this.j) {
                                i7 = 0;
                            } else {
                                i7 = 4;
                            }
                            i14 |= i7;
                            this.c.d(j, i14);
                            d(3);
                            i9 = -1;
                            i10 = 2;
                            r6 = 0;
                            i11 = 1;
                        }
                    }
                    i2 = i10;
                    z = r6;
                    i3 = i11;
                    i4 = i9;
                } else if (e(eufVar, (byte[]) this.k.c, 9)) {
                    z = false;
                    this.k.q(0);
                    int i24 = this.k.i(24);
                    i3 = 1;
                    if (i24 != 1) {
                        eub.f("PesReader", a.bV(i24, "Unexpected start code prefix: "));
                        this.b = -1;
                        i4 = -1;
                        i5 = 0;
                        i2 = 2;
                    } else {
                        this.k.s(8);
                        fjl fjlVar = this.k;
                        int i25 = fjlVar.i(16);
                        fjlVar.s(5);
                        this.j = this.k.u();
                        i2 = 2;
                        this.k.s(2);
                        this.f = this.k.u();
                        this.g = this.k.u();
                        this.k.s(6);
                        int i26 = this.k.i(8);
                        this.i = i26;
                        i4 = -1;
                        if (i25 == 0) {
                            this.b = -1;
                        } else {
                            int i27 = (i25 - 3) - i26;
                            this.b = i27;
                            if (i27 < 0) {
                                eub.f("PesReader", a.bV(i27, "Found negative packet payload size: "));
                                this.b = -1;
                            }
                        }
                        i5 = 2;
                    }
                    d(i5);
                } else {
                    z = false;
                    i3 = 1;
                    i4 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i10;
                z = r6;
                i3 = i11;
                i4 = i9;
                eufVar.K(eufVar.b());
            }
            i9 = i4;
            i11 = i3;
            r6 = z;
            i10 = i2;
        }
    }

    @Override // defpackage.fur
    public final void b(euj eujVar, flw flwVar, fuq fuqVar) {
        this.e = eujVar;
        this.c.b(flwVar, fuqVar);
    }

    @Override // defpackage.fur
    public final void c() {
        this.a = 0;
        this.d = 0;
        this.h = false;
        this.c.e();
    }
}
