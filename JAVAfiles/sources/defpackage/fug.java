package defpackage;

import android.util.SparseArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fug implements flu {
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private flw h;
    private boolean i;
    private flk j;
    private final euj a = new euj(0);
    private final euf c = new euf(4096);
    private final SparseArray b = new SparseArray();
    private final ful k = new ful(null);

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.h = flwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[LOOP:0: B:13:0x002d->B:15:0x0035, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ftn, java.lang.Object] */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r5, long r7) {
        /*
            r4 = this;
            euj r5 = r4.a
            long r0 = r5.f()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.i(r7)
        L24:
            flk r5 = r4.j
            r6 = 0
            if (r5 == 0) goto L2c
            r5.a(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.b
            int r7 = r7.size()
            if (r5 >= r7) goto L47
            android.util.SparseArray r7 = r4.b
            java.lang.Object r7 = r7.valueAt(r5)
            jbp r7 = (defpackage.jbp) r7
            r7.a = r6
            java.lang.Object r7 = r7.e
            r7.e()
            int r5 = r5 + 1
            goto L2d
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fug.f(long, long):void");
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        byte[] bArr = new byte[14];
        flvVar.j(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        flvVar.g(bArr[13] & 7);
        flvVar.j(bArr, 0, 3);
        if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ftn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [ftn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [ftn, java.lang.Object] */
    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        char c;
        ftn ftnVar;
        long j6;
        long j7;
        dzg.h(this.h);
        fln flnVar = (fln) flvVar;
        long j8 = flnVar.b;
        if (j8 != -1) {
            ful fulVar = this.k;
            if (!fulVar.c) {
                if (!fulVar.e) {
                    int min = (int) Math.min(20000L, j8);
                    long j9 = j8 - min;
                    if (flnVar.c != j9) {
                        vtkVar.a = j9;
                        return 1;
                    }
                    fulVar.b.F(min);
                    flvVar.l();
                    flvVar.j(fulVar.b.a, 0, min);
                    euf eufVar = fulVar.b;
                    int i = eufVar.b;
                    int i2 = eufVar.c - 4;
                    while (true) {
                        if (i2 >= i) {
                            if (ful.d(eufVar.a, i2) == 442) {
                                eufVar.J(i2 + 4);
                                j7 = ful.b(eufVar);
                                if (j7 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i2--;
                        } else {
                            j7 = -9223372036854775807L;
                            break;
                        }
                    }
                    fulVar.g = j7;
                    fulVar.e = true;
                } else if (fulVar.g == -9223372036854775807L) {
                    fulVar.c(flvVar);
                } else if (!fulVar.d) {
                    int min2 = (int) Math.min(20000L, j8);
                    if (flnVar.c != 0) {
                        vtkVar.a = 0L;
                        return 1;
                    }
                    fulVar.b.F(min2);
                    flvVar.l();
                    flvVar.j(fulVar.b.a, 0, min2);
                    euf eufVar2 = fulVar.b;
                    int i3 = eufVar2.b;
                    int i4 = eufVar2.c;
                    while (true) {
                        if (i3 < i4 - 3) {
                            if (ful.d(eufVar2.a, i3) == 442) {
                                eufVar2.J(i3 + 4);
                                j6 = ful.b(eufVar2);
                                if (j6 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i3++;
                        } else {
                            j6 = -9223372036854775807L;
                            break;
                        }
                    }
                    fulVar.f = j6;
                    fulVar.d = true;
                } else {
                    long j10 = fulVar.f;
                    if (j10 == -9223372036854775807L) {
                        fulVar.c(flvVar);
                    } else {
                        euj eujVar = fulVar.a;
                        fulVar.h = eujVar.c(fulVar.g) - eujVar.b(j10);
                        fulVar.c(flvVar);
                    }
                }
                return 0;
            }
        }
        if (!this.i) {
            this.i = true;
            ful fulVar2 = this.k;
            long j11 = fulVar2.h;
            if (j11 != -9223372036854775807L) {
                j = 0;
                j2 = j8;
                flk flkVar = new flk(new flf(), new fuf(fulVar2.a), j11, j11 + 1, 0L, j8, 188L, 1000);
                this.j = flkVar;
                this.h.w(flkVar.a);
            } else {
                j = 0;
                j2 = j8;
                this.h.w(new fmj(-9223372036854775807L));
            }
        } else {
            j = 0;
            j2 = j8;
        }
        flk flkVar2 = this.j;
        if (flkVar2 != null && flkVar2.b()) {
            return flkVar2.f(flvVar, vtkVar);
        }
        flvVar.l();
        if (j8 != -1) {
            j3 = j2 - flvVar.e();
        } else {
            j3 = -1;
        }
        if ((j3 != -1 && j3 < 4) || !flvVar.o(this.c.a, 0, 4, true)) {
            return -1;
        }
        this.c.J(0);
        int e = this.c.e();
        if (e == 441) {
            return -1;
        }
        if (e == 442) {
            flvVar.j(this.c.a, 0, 10);
            this.c.J(9);
            flvVar.m((this.c.j() & 7) + 14);
            return 0;
        }
        if (e == 443) {
            flvVar.j(this.c.a, 0, 2);
            this.c.J(0);
            flvVar.m(this.c.n() + 6);
            return 0;
        }
        if ((e >> 8) != 1) {
            flvVar.m(1);
            return 0;
        }
        int i5 = e & 255;
        jbp jbpVar = (jbp) this.b.get(i5);
        if (!this.d) {
            if (jbpVar == null) {
                if (i5 == 189) {
                    ftnVar = new ftg();
                    this.e = true;
                    this.g = flnVar.c;
                } else if ((e & 224) == 192) {
                    ftnVar = new ftz(null, 0);
                    this.e = true;
                    this.g = flnVar.c;
                } else if ((e & 240) == 224) {
                    ftnVar = new ftp(null);
                    this.f = true;
                    this.g = flnVar.c;
                } else {
                    ftnVar = null;
                }
                if (ftnVar != null) {
                    ftnVar.b(this.h, new fuq(i5, 256));
                    jbp jbpVar2 = new jbp(ftnVar, this.a);
                    this.b.put(i5, jbpVar2);
                    jbpVar = jbpVar2;
                }
            }
            long j12 = 1048576;
            if (this.e && this.f) {
                j12 = this.g + 8192;
            }
            if (flnVar.c > j12) {
                this.d = true;
                this.h.r();
            }
        }
        flvVar.j(this.c.a, 0, 2);
        this.c.J(0);
        int n = this.c.n() + 6;
        if (jbpVar == null) {
            flvVar.m(n);
            return 0;
        }
        this.c.F(n);
        flvVar.k(this.c.a, 0, n);
        this.c.J(6);
        euf eufVar3 = this.c;
        eufVar3.E((byte[]) ((fjl) jbpVar.f).c, 0, 3);
        ((fjl) jbpVar.f).q(0);
        ((fjl) jbpVar.f).s(8);
        jbpVar.b = ((fjl) jbpVar.f).u();
        jbpVar.c = ((fjl) jbpVar.f).u();
        ((fjl) jbpVar.f).s(6);
        eufVar3.E((byte[]) ((fjl) jbpVar.f).c, 0, ((fjl) jbpVar.f).i(8));
        ((fjl) jbpVar.f).q(0);
        if (jbpVar.b) {
            ((fjl) jbpVar.f).s(4);
            long i6 = ((fjl) jbpVar.f).i(3);
            ((fjl) jbpVar.f).s(1);
            int i7 = ((fjl) jbpVar.f).i(15) << 15;
            ((fjl) jbpVar.f).s(1);
            long i8 = ((fjl) jbpVar.f).i(15);
            ((fjl) jbpVar.f).s(1);
            if (!jbpVar.a && jbpVar.c) {
                ((fjl) jbpVar.f).s(4);
                ((fjl) jbpVar.f).s(1);
                int i9 = ((fjl) jbpVar.f).i(15) << 15;
                ((fjl) jbpVar.f).s(1);
                j5 = i6;
                long i10 = ((fjl) jbpVar.f).i(15);
                ((fjl) jbpVar.f).s(1);
                ((euj) jbpVar.d).b(i9 | (((fjl) jbpVar.f).i(3) << 30) | i10);
                jbpVar.a = true;
                c = 30;
            } else {
                j5 = i6;
                c = 30;
            }
            j4 = ((euj) jbpVar.d).b((j5 << c) | i7 | i8);
        } else {
            j4 = j;
        }
        jbpVar.e.d(j4, 4);
        jbpVar.e.a(eufVar3);
        jbpVar.e.c(false);
        euf eufVar4 = this.c;
        eufVar4.I(eufVar4.c());
        return 0;
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
