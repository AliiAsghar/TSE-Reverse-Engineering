package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqx extends fqw {
    private int a;
    private boolean o;
    private fms p;
    private agoe q;
    private efu r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final long a(euf eufVar) {
        int i;
        int i2 = 0;
        byte b = eufVar.a[0];
        if ((b & 1) != 1) {
            agoe agoeVar = this.q;
            dzg.h(agoeVar);
            if (!((akip[]) agoeVar.d)[(b >> 1) & (255 >>> (8 - agoeVar.a))].a) {
                i = ((fms) agoeVar.c).e;
            } else {
                i = ((fms) agoeVar.c).f;
            }
            if (this.o) {
                i2 = (this.a + i) / 4;
            }
            int c = eufVar.c();
            int i3 = eufVar.c + 4;
            if (c < i3) {
                eufVar.G(Arrays.copyOf(eufVar.a, i3));
            } else {
                eufVar.I(i3);
            }
            long j = i2;
            byte[] bArr = eufVar.a;
            int i4 = eufVar.c;
            bArr[i4 - 4] = (byte) (j & 255);
            bArr[i4 - 3] = (byte) ((j >>> 8) & 255);
            bArr[i4 - 2] = (byte) ((j >>> 16) & 255);
            bArr[i4 - 1] = (byte) ((j >>> 24) & 255);
            this.o = true;
            this.a = i;
            return j;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.q = null;
            this.p = null;
            this.r = null;
        }
        this.a = 0;
        this.o = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final boolean c(euf eufVar, long j, fqu fquVar) {
        agoe agoeVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        fms fmsVar;
        long j2;
        int i6;
        int i7;
        if (this.q == null) {
            fms fmsVar2 = this.p;
            int i8 = 4;
            if (fmsVar2 == null) {
                dxt.B(1, eufVar, false);
                eufVar.g();
                int j3 = eufVar.j();
                int g = eufVar.g();
                int f = eufVar.f();
                if (f <= 0) {
                    i6 = -1;
                } else {
                    i6 = f;
                }
                int f2 = eufVar.f();
                if (f2 <= 0) {
                    i7 = -1;
                } else {
                    i7 = f2;
                }
                eufVar.f();
                int j4 = eufVar.j();
                int pow = (int) Math.pow(2.0d, j4 & 15);
                int pow2 = (int) Math.pow(2.0d, (j4 & 240) >> 4);
                eufVar.j();
                this.p = new fms(j3, g, i6, i7, pow, pow2, Arrays.copyOf(eufVar.a, eufVar.c));
            } else {
                efu efuVar = this.r;
                if (efuVar == null) {
                    this.r = dxt.K(eufVar, true, true);
                } else {
                    int i9 = eufVar.c;
                    byte[] bArr = new byte[i9];
                    System.arraycopy(eufVar.a, 0, bArr, 0, i9);
                    int i10 = fmsVar2.a;
                    int i11 = 5;
                    dxt.B(5, eufVar, false);
                    int j5 = eufVar.j() + 1;
                    agfy agfyVar = new agfy(eufVar.a);
                    agfyVar.d(eufVar.b * 8);
                    int i12 = 0;
                    while (true) {
                        int i13 = 2;
                        int i14 = 16;
                        if (i12 < j5) {
                            if (agfyVar.c(24) == 5653314) {
                                int c = agfyVar.c(16);
                                int c2 = agfyVar.c(24);
                                if (!agfyVar.e()) {
                                    boolean e = agfyVar.e();
                                    for (int i15 = 0; i15 < c2; i15++) {
                                        if (e) {
                                            if (agfyVar.e()) {
                                                agfyVar.d(5);
                                            }
                                        } else {
                                            agfyVar.d(5);
                                        }
                                    }
                                } else {
                                    agfyVar.d(5);
                                    for (int i16 = 0; i16 < c2; i16 += agfyVar.c(dxt.z(c2 - i16))) {
                                    }
                                }
                                int c3 = agfyVar.c(i8);
                                if (c3 <= 2) {
                                    if (c3 != 1) {
                                        if (c3 != 2) {
                                            fmsVar = fmsVar2;
                                            i12++;
                                            fmsVar2 = fmsVar;
                                            i8 = 4;
                                        }
                                    } else {
                                        i13 = c3;
                                    }
                                    agfyVar.d(32);
                                    agfyVar.d(32);
                                    int c4 = agfyVar.c(i8) + 1;
                                    agfyVar.d(1);
                                    if (i13 == 1) {
                                        if (c != 0) {
                                            fmsVar = fmsVar2;
                                            j2 = (long) Math.floor(Math.pow(c2, 1.0d / c));
                                        } else {
                                            fmsVar = fmsVar2;
                                            j2 = 0;
                                        }
                                    } else {
                                        fmsVar = fmsVar2;
                                        j2 = c * c2;
                                    }
                                    agfyVar.d((int) (j2 * c4));
                                    i12++;
                                    fmsVar2 = fmsVar;
                                    i8 = 4;
                                } else {
                                    throw new erm(a.bV(c3, "lookup type greater than 2 not decodable: "), null, true, 1);
                                }
                            } else {
                                throw new erm("expected code book to start with [0x56, 0x43, 0x42] at " + ((agfyVar.c * 8) + agfyVar.b), null, true, 1);
                            }
                        } else {
                            fms fmsVar3 = fmsVar2;
                            int i17 = 1;
                            int i18 = 6;
                            int c5 = agfyVar.c(6) + 1;
                            for (int i19 = 0; i19 < c5; i19++) {
                                if (agfyVar.c(16) != 0) {
                                    throw new erm("placeholder of time domain transforms not zeroed out", null, true, 1);
                                }
                            }
                            int c6 = agfyVar.c(6) + 1;
                            int i20 = 0;
                            while (true) {
                                int i21 = 3;
                                if (i20 < c6) {
                                    int c7 = agfyVar.c(i14);
                                    if (c7 != 0) {
                                        if (c7 == i17) {
                                            int c8 = agfyVar.c(i11);
                                            int[] iArr = new int[c8];
                                            int i22 = -1;
                                            for (int i23 = 0; i23 < c8; i23++) {
                                                int c9 = agfyVar.c(4);
                                                iArr[i23] = c9;
                                                if (c9 > i22) {
                                                    i22 = c9;
                                                }
                                            }
                                            int i24 = i22 + 1;
                                            int[] iArr2 = new int[i24];
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                iArr2[i25] = agfyVar.c(i21) + 1;
                                                int c10 = agfyVar.c(i13);
                                                if (c10 > 0) {
                                                    i5 = 8;
                                                    agfyVar.d(8);
                                                } else {
                                                    i5 = 8;
                                                }
                                                int i26 = c6;
                                                int i27 = 0;
                                                for (int i28 = 1; i27 < (i28 << c10); i28 = 1) {
                                                    agfyVar.d(i5);
                                                    i27++;
                                                    i5 = 8;
                                                }
                                                i25++;
                                                c6 = i26;
                                                i13 = 2;
                                                i21 = 3;
                                            }
                                            i4 = c6;
                                            agfyVar.d(i13);
                                            int c11 = agfyVar.c(4);
                                            int i29 = 0;
                                            int i30 = 0;
                                            for (int i31 = 0; i31 < c8; i31++) {
                                                i29 += iArr2[iArr[i31]];
                                                while (i30 < i29) {
                                                    agfyVar.d(c11);
                                                    i30++;
                                                }
                                            }
                                        } else {
                                            throw new erm(a.bV(c7, "floor type greater than 1 not decodable: "), null, true, 1);
                                        }
                                    } else {
                                        i4 = c6;
                                        int i32 = 8;
                                        agfyVar.d(8);
                                        agfyVar.d(16);
                                        agfyVar.d(16);
                                        agfyVar.d(6);
                                        agfyVar.d(8);
                                        int c12 = agfyVar.c(4) + i17;
                                        int i33 = 0;
                                        while (i33 < c12) {
                                            agfyVar.d(i32);
                                            i33++;
                                            i32 = 8;
                                        }
                                    }
                                    i20++;
                                    c6 = i4;
                                    i18 = 6;
                                    i13 = 2;
                                    i14 = 16;
                                    i17 = 1;
                                    i11 = 5;
                                } else {
                                    int i34 = 1;
                                    int c13 = agfyVar.c(i18) + 1;
                                    int i35 = 0;
                                    while (i35 < c13) {
                                        if (agfyVar.c(16) <= 2) {
                                            agfyVar.d(24);
                                            agfyVar.d(24);
                                            agfyVar.d(24);
                                            int c14 = agfyVar.c(i18) + i34;
                                            int i36 = 8;
                                            agfyVar.d(8);
                                            int[] iArr3 = new int[c14];
                                            for (int i37 = 0; i37 < c14; i37++) {
                                                int c15 = agfyVar.c(3);
                                                if (agfyVar.e()) {
                                                    i3 = agfyVar.c(5);
                                                } else {
                                                    i3 = 0;
                                                }
                                                iArr3[i37] = (i3 * 8) + c15;
                                            }
                                            int i38 = 0;
                                            while (i38 < c14) {
                                                int i39 = 0;
                                                while (i39 < i36) {
                                                    if ((iArr3[i38] & (1 << i39)) != 0) {
                                                        agfyVar.d(i36);
                                                    }
                                                    i39++;
                                                    i36 = 8;
                                                }
                                                i38++;
                                                i36 = 8;
                                            }
                                            i35++;
                                            i18 = 6;
                                            i34 = 1;
                                        } else {
                                            throw new erm("residueType greater than 2 is not decodable", null, true, 1);
                                        }
                                    }
                                    int c16 = agfyVar.c(i18) + i34;
                                    for (int i40 = 0; i40 < c16; i40++) {
                                        int c17 = agfyVar.c(16);
                                        if (c17 != 0) {
                                            eub.c("VorbisUtil", a.bV(c17, "mapping type other than 0 not supported: "));
                                        } else {
                                            if (agfyVar.e()) {
                                                i = 1;
                                                i2 = agfyVar.c(4) + 1;
                                            } else {
                                                i = 1;
                                                i2 = 1;
                                            }
                                            if (agfyVar.e()) {
                                                int c18 = agfyVar.c(8) + i;
                                                for (int i41 = 0; i41 < c18; i41++) {
                                                    int i42 = i10 - 1;
                                                    agfyVar.d(dxt.z(i42));
                                                    agfyVar.d(dxt.z(i42));
                                                }
                                            }
                                            if (agfyVar.c(2) == 0) {
                                                if (i2 > 1) {
                                                    for (int i43 = 0; i43 < i10; i43++) {
                                                        agfyVar.d(4);
                                                    }
                                                }
                                                for (int i44 = 0; i44 < i2; i44++) {
                                                    agfyVar.d(8);
                                                    agfyVar.d(8);
                                                    agfyVar.d(8);
                                                }
                                            } else {
                                                throw new erm("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                            }
                                        }
                                    }
                                    int c19 = agfyVar.c(6);
                                    int i45 = c19 + 1;
                                    akip[] akipVarArr = new akip[i45];
                                    for (int i46 = 0; i46 < i45; i46++) {
                                        boolean e2 = agfyVar.e();
                                        agfyVar.c(16);
                                        agfyVar.c(16);
                                        agfyVar.c(8);
                                        akipVarArr[i46] = new akip(e2);
                                    }
                                    if (agfyVar.e()) {
                                        agoeVar = new agoe(fmsVar3, efuVar, bArr, akipVarArr, dxt.z(c19));
                                    } else {
                                        throw new erm("framing bit after modes not set as expected", null, true, 1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            agoeVar = null;
            this.q = agoeVar;
            if (agoeVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            fms fmsVar4 = (fms) agoeVar.c;
            arrayList.add(fmsVar4.g);
            arrayList.add(agoeVar.e);
            erk A = dxt.A(alog.p((Object[]) ((efu) agoeVar.b).a));
            eqm eqmVar = new eqm();
            eqmVar.b("audio/vorbis");
            eqmVar.h = fmsVar4.d;
            eqmVar.i = fmsVar4.c;
            eqmVar.B = fmsVar4.a;
            eqmVar.C = fmsVar4.b;
            eqmVar.p = arrayList;
            eqmVar.k = A;
            fquVar.a = new eqn(eqmVar);
            return true;
        }
        dzg.g(fquVar.a);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqw
    public final void g(long j) {
        boolean z;
        this.g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.o = z;
        fms fmsVar = this.p;
        if (fmsVar != null) {
            i = fmsVar.e;
        }
        this.a = i;
    }
}
