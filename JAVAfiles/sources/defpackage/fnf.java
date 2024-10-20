package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnf implements flu {
    private final byte[] a;
    private final euf b;
    private flw c;
    private fmq d;
    private int e;
    private erk f;
    private flz g;
    private int h;
    private int i;
    private int j;
    private long k;
    private flk l;
    private final vtk m;

    public fnf() {
        this(null);
    }

    private final long a(euf eufVar, boolean z) {
        boolean z2;
        dzg.g(this.g);
        int i = eufVar.b;
        while (i <= eufVar.c - 16) {
            eufVar.J(i);
            if (eef.n(eufVar, this.g, this.i, this.m)) {
                eufVar.J(i);
                return this.m.a;
            }
            i++;
        }
        if (!z) {
            eufVar.J(i);
            return -1L;
        }
        while (true) {
            int i2 = eufVar.c;
            if (i <= i2 - this.h) {
                eufVar.J(i);
                try {
                    z2 = eef.n(eufVar, this.g, this.i, this.m);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (eufVar.b <= eufVar.c && z2) {
                    eufVar.J(i);
                    return this.m.a;
                }
                i++;
            } else {
                eufVar.J(i2);
                return -1L;
            }
        }
    }

    private final void b() {
        long j = this.k * 1000000;
        flz flzVar = this.g;
        int i = eul.a;
        this.d.n(j / flzVar.e, 1, this.j, 0, null);
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.c = flwVar;
        this.d = flwVar.p(0, 1);
        flwVar.r();
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.e = 0;
        } else {
            flk flkVar = this.l;
            if (flkVar != null) {
                flkVar.a(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.k = j3;
        this.j = 0;
        this.b.F(0);
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        dxt.I(flvVar, false);
        euf eufVar = new euf(4);
        flvVar.j(eufVar.a, 0, 4);
        if (eufVar.r() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        fmk fmjVar;
        long j;
        long j2;
        long j3;
        boolean z;
        int i = this.e;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                int i2 = 3;
                byte[] bArr = null;
                int i3 = 4;
                if (i != 2) {
                    int i4 = 7;
                    if (i != 3) {
                        if (i != 4) {
                            dzg.g(this.d);
                            dzg.g(this.g);
                            flk flkVar = this.l;
                            if (flkVar != null && flkVar.b()) {
                                return flkVar.f(flvVar, vtkVar);
                            }
                            if (this.k == -1) {
                                flz flzVar = this.g;
                                flvVar.l();
                                flvVar.g(1);
                                byte[] bArr2 = new byte[1];
                                flvVar.j(bArr2, 0, 1);
                                int i5 = bArr2[0] & 1;
                                if (1 != i5) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                flvVar.g(2);
                                if (1 != i5) {
                                    i4 = 6;
                                }
                                euf eufVar = new euf(i4);
                                eufVar.I(eef.h(flvVar, eufVar.a, 0, i4));
                                flvVar.l();
                                vtk vtkVar2 = new vtk((byte[]) null);
                                if (eef.m(eufVar, flzVar, z, vtkVar2)) {
                                    this.k = vtkVar2.a;
                                    return 0;
                                }
                                throw new erm(null, null, true, 1);
                            }
                            euf eufVar2 = this.b;
                            int i6 = eufVar2.c;
                            if (i6 < 32768) {
                                int a = flvVar.a(eufVar2.a, i6, 32768 - i6);
                                if (a != -1) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    this.b.I(i6 + a);
                                } else if (this.b.b() == 0) {
                                    b();
                                    return -1;
                                }
                            } else {
                                z2 = false;
                            }
                            euf eufVar3 = this.b;
                            int i7 = eufVar3.b;
                            int i8 = this.j;
                            int i9 = this.h;
                            if (i8 < i9) {
                                eufVar3.K(Math.min(i9 - i8, eufVar3.b()));
                            }
                            long a2 = a(this.b, z2);
                            euf eufVar4 = this.b;
                            int i10 = eufVar4.b - i7;
                            eufVar4.J(i7);
                            this.d.l(this.b, i10);
                            this.j += i10;
                            if (a2 != -1) {
                                b();
                                this.j = 0;
                                this.k = a2;
                            }
                            euf eufVar5 = this.b;
                            if (eufVar5.b() >= 16) {
                                return 0;
                            }
                            int b = eufVar5.b();
                            byte[] bArr3 = eufVar5.a;
                            System.arraycopy(bArr3, eufVar5.b, bArr3, 0, b);
                            this.b.J(0);
                            this.b.I(b);
                            return 0;
                        }
                        flvVar.l();
                        euf eufVar6 = new euf(2);
                        flvVar.j(eufVar6.a, 0, 2);
                        int n = eufVar6.n();
                        if ((n >> 2) == 16382) {
                            flvVar.l();
                            this.i = n;
                            flw flwVar = this.c;
                            int i11 = eul.a;
                            fln flnVar = (fln) flvVar;
                            long j4 = flnVar.c;
                            long j5 = flnVar.b;
                            dzg.g(this.g);
                            final flz flzVar2 = this.g;
                            if (flzVar2.k != null) {
                                fmjVar = new fly(flzVar2, j4);
                            } else if (j5 != -1 && flzVar2.j > 0) {
                                int i12 = this.i;
                                flzVar2.getClass();
                                flh flhVar = new flh() { // from class: fnd
                                    @Override // defpackage.flh
                                    public final long a(long j6) {
                                        return flz.this.b(j6);
                                    }
                                };
                                fne fneVar = new fne(flzVar2, i12);
                                int i13 = flzVar2.d;
                                long a3 = flzVar2.a();
                                if (i13 > 0) {
                                    j = j4;
                                    j2 = j5;
                                    j3 = ((i13 + flzVar2.c) / 2) + 1;
                                } else {
                                    j = j4;
                                    int i14 = flzVar2.a;
                                    long j6 = 4096;
                                    if (i14 == flzVar2.b && i14 > 0) {
                                        j6 = i14;
                                    }
                                    j2 = j5;
                                    j3 = (((j6 * flzVar2.g) * flzVar2.h) / 8) + 64;
                                }
                                flk flkVar2 = new flk(flhVar, fneVar, a3, flzVar2.j, j, j2, j3, Math.max(6, flzVar2.c));
                                this.l = flkVar2;
                                fmjVar = flkVar2.a;
                            } else {
                                fmjVar = new fmj(flzVar2.a());
                            }
                            flwVar.w(fmjVar);
                            this.e = 5;
                            return 0;
                        }
                        flvVar.l();
                        throw new erm("First frame does not start with sync code.", null, true, 1);
                    }
                    flz flzVar3 = this.g;
                    while (true) {
                        flvVar.l();
                        fjl fjlVar = new fjl(new byte[i3], bArr);
                        flvVar.j((byte[]) fjlVar.c, 0, i3);
                        boolean u = fjlVar.u();
                        int i15 = fjlVar.i(i4);
                        int i16 = fjlVar.i(24) + i3;
                        if (i15 == 0) {
                            byte[] bArr4 = new byte[38];
                            flvVar.k(bArr4, 0, 38);
                            flzVar3 = new flz(bArr4, i3);
                        } else if (flzVar3 != null) {
                            if (i15 == i2) {
                                euf eufVar7 = new euf(i16);
                                flvVar.k(eufVar7.a, 0, i16);
                                flzVar3 = flzVar3.e(dxt.J(eufVar7));
                            } else if (i15 == i3) {
                                euf eufVar8 = new euf(i16);
                                flvVar.k(eufVar8.a, 0, i16);
                                eufVar8.K(i3);
                                flzVar3 = new flz(flzVar3.a, flzVar3.b, flzVar3.c, flzVar3.d, flzVar3.e, flzVar3.g, flzVar3.h, flzVar3.j, flzVar3.k, flzVar3.d(dxt.A(Arrays.asList((Object[]) dxt.K(eufVar8, false, false).a))));
                            } else if (i15 == 6) {
                                euf eufVar9 = new euf(i16);
                                flvVar.k(eufVar9.a, 0, i16);
                                eufVar9.K(i3);
                                flzVar3 = new flz(flzVar3.a, flzVar3.b, flzVar3.c, flzVar3.d, flzVar3.e, flzVar3.g, flzVar3.h, flzVar3.j, flzVar3.k, flzVar3.d(new erk(alog.r(foa.d(eufVar9)))));
                            } else {
                                flvVar.m(i16);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i17 = eul.a;
                        this.g = flzVar3;
                        if (u) {
                            dzg.g(flzVar3);
                            this.h = Math.max(this.g.c, 6);
                            this.d.h(this.g.c(this.a, this.f));
                            this.e = 4;
                            return 0;
                        }
                        i2 = 3;
                        bArr = null;
                        i3 = 4;
                        i4 = 7;
                    }
                } else {
                    euf eufVar10 = new euf(4);
                    flvVar.k(eufVar10.a, 0, 4);
                    if (eufVar10.r() == 1716281667) {
                        this.e = 3;
                        return 0;
                    }
                    throw new erm("Failed to read FLAC stream marker.", null, true, 1);
                }
            } else {
                flvVar.j(this.a, 0, 42);
                flvVar.l();
                this.e = 2;
                return 0;
            }
        } else {
            flvVar.l();
            long e = flvVar.e();
            erk I = dxt.I(flvVar, true);
            flvVar.m((int) (flvVar.e() - e));
            this.f = I;
            this.e = 1;
            return 0;
        }
    }

    public fnf(byte[] bArr) {
        this.a = new byte[42];
        this.b = new euf(new byte[32768], 0);
        this.m = new vtk((byte[]) null);
        this.e = 0;
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
