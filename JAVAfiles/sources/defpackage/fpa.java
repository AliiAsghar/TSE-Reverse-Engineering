package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpa extends fnv {
    private euj b;
    private final euf a = new euf();
    private final fjl c = new fjl((byte[]) null);

    @Override // defpackage.fnv
    protected final erk b(fnu fnuVar, ByteBuffer byteBuffer) {
        erj fpdVar;
        boolean z;
        int i;
        long j;
        ArrayList arrayList;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        long j4;
        long j5;
        boolean z7;
        boolean z8;
        List list;
        long j6;
        long j7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i5;
        int i6;
        int i7;
        boolean z13;
        boolean z14;
        boolean z15;
        long j8;
        boolean z16;
        boolean z17;
        boolean z18;
        long j9;
        euj eujVar = this.b;
        if (eujVar == null || fnuVar.h != eujVar.f()) {
            euj eujVar2 = new euj(fnuVar.f);
            this.b = eujVar2;
            eujVar2.a(fnuVar.f - fnuVar.h);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.H(array, limit);
        this.c.p(array, limit);
        this.c.s(39);
        long i8 = this.c.i(1);
        long i9 = this.c.i(32);
        this.c.s(20);
        fjl fjlVar = this.c;
        euf eufVar = this.a;
        int i10 = fjlVar.i(12);
        int i11 = fjlVar.i(8);
        eufVar.K(14);
        long j10 = (i8 << 32) | i9;
        if (i11 != 0) {
            if (i11 != 255) {
                long j11 = 0;
                long j12 = -9223372036854775807L;
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            fpdVar = null;
                        } else {
                            euf eufVar2 = this.a;
                            euj eujVar3 = this.b;
                            long d = fpg.d(eufVar2, j10);
                            fpdVar = new fpg(d, eujVar3.b(d));
                        }
                    } else {
                        euf eufVar3 = this.a;
                        euj eujVar4 = this.b;
                        long r = eufVar3.r();
                        if ((eufVar3.j() & 128) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z8) {
                            int j13 = eufVar3.j();
                            if ((j13 & 128) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((j13 & 64) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            int i12 = j13 & 32;
                            if ((j13 & 16) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14 && !z15) {
                                j8 = fpg.d(eufVar3, j10);
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int j14 = eufVar3.j();
                                ArrayList arrayList2 = new ArrayList(j14);
                                int i13 = 0;
                                while (i13 < j14) {
                                    int j15 = eufVar3.j();
                                    if (!z15) {
                                        z18 = z15;
                                        j9 = fpg.d(eufVar3, j10);
                                    } else {
                                        z18 = z15;
                                        j9 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new fpb(j15, j9, eujVar4.b(j9)));
                                    i13++;
                                    z15 = z18;
                                }
                                z16 = z15;
                                emptyList = arrayList2;
                            } else {
                                z16 = z15;
                            }
                            if (i12 != 0) {
                                long j16 = eufVar3.j();
                                if ((j16 & 128) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                j12 = ((((j16 & 1) << 32) | eufVar3.r()) * 1000) / 90;
                            } else {
                                z17 = false;
                            }
                            list = emptyList;
                            i5 = eufVar3.n();
                            i6 = eufVar3.j();
                            z12 = z17;
                            z9 = z13;
                            z10 = z14;
                            j7 = j12;
                            boolean z19 = z16;
                            i7 = eufVar3.j();
                            j6 = j8;
                            z11 = z19;
                        } else {
                            list = emptyList;
                            j6 = -9223372036854775807L;
                            j7 = -9223372036854775807L;
                            z9 = false;
                            z10 = false;
                            z11 = false;
                            z12 = false;
                            i5 = 0;
                            i6 = 0;
                            i7 = 0;
                        }
                        fpdVar = new fpc(r, z8, z9, z10, z11, j6, eujVar4.b(j6), list, z12, j7, i5, i6, i7);
                    }
                } else {
                    euf eufVar4 = this.a;
                    int j17 = eufVar4.j();
                    ArrayList arrayList3 = new ArrayList(j17);
                    int i14 = 0;
                    while (i14 < j17) {
                        long r2 = eufVar4.r();
                        int j18 = eufVar4.j() & 128;
                        ArrayList arrayList4 = new ArrayList();
                        if (j18 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            int j19 = eufVar4.j();
                            if ((j19 & 128) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((j19 & 64) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            int i15 = j19 & 32;
                            if (z6) {
                                j4 = eufVar4.r();
                            } else {
                                j4 = -9223372036854775807L;
                            }
                            if (!z6) {
                                int j20 = eufVar4.j();
                                ArrayList arrayList5 = new ArrayList(j20);
                                int i16 = 0;
                                while (i16 < j20) {
                                    arrayList5.add(new atgu(eufVar4.j(), eufVar4.r()));
                                    i16++;
                                    j17 = j17;
                                }
                                i = j17;
                                arrayList4 = arrayList5;
                            } else {
                                i = j17;
                            }
                            if (i15 != 0) {
                                long j21 = eufVar4.j();
                                j = 0;
                                if ((j21 & 128) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                j5 = ((((j21 & 1) << 32) | eufVar4.r()) * 1000) / 90;
                            } else {
                                j = 0;
                                j5 = -9223372036854775807L;
                                z7 = false;
                            }
                            z4 = z7;
                            arrayList = arrayList4;
                            z2 = z5;
                            z3 = z6;
                            j2 = j4;
                            j3 = j5;
                            i2 = eufVar4.n();
                            i3 = eufVar4.j();
                            i4 = eufVar4.j();
                        } else {
                            i = j17;
                            j = j11;
                            arrayList = arrayList4;
                            j2 = -9223372036854775807L;
                            j3 = -9223372036854775807L;
                            z2 = false;
                            z3 = false;
                            z4 = false;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                        }
                        arrayList3.add(new fpe(r2, z, z2, z3, arrayList, j2, z4, j3, i2, i3, i4));
                        i14++;
                        j11 = j;
                        j17 = i;
                    }
                    fpdVar = new fpf(arrayList3);
                }
            } else {
                euf eufVar5 = this.a;
                int i17 = i10 - 4;
                long r3 = eufVar5.r();
                byte[] bArr = new byte[i17];
                eufVar5.E(bArr, 0, i17);
                fpdVar = new foy(r3, bArr, j10);
            }
        } else {
            fpdVar = new fpd();
        }
        if (fpdVar == null) {
            return new erk(new erj[0]);
        }
        return new erk(fpdVar);
    }
}
