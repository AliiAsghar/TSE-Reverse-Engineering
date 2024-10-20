package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuf implements flj {
    private final euj a;
    private final euf b = new euf();

    public fuf(euj eujVar) {
        this.a = eujVar;
    }

    @Override // defpackage.flj
    public final fli a(flv flvVar, long j) {
        int e;
        fln flnVar = (fln) flvVar;
        long j2 = flnVar.b;
        long j3 = flnVar.c;
        int min = (int) Math.min(20000L, j2 - j3);
        this.b.F(min);
        flvVar.j(this.b.a, 0, min);
        int i = -1;
        long j4 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            euf eufVar = this.b;
            if (eufVar.b() >= 4) {
                if (flk.e(eufVar.a, eufVar.b) != 442) {
                    eufVar.K(1);
                } else {
                    eufVar.K(4);
                    long b = ful.b(eufVar);
                    if (b != -9223372036854775807L) {
                        long b2 = this.a.b(b);
                        if (b2 > j) {
                            if (j4 == -9223372036854775807L) {
                                return new fli(-1, b2, j3);
                            }
                            return new fli(0, -9223372036854775807L, j3 + i2);
                        }
                        if (100000 + b2 > j) {
                            return new fli(0, -9223372036854775807L, j3 + eufVar.b);
                        }
                        i2 = eufVar.b;
                        j4 = b2;
                    }
                    int i3 = eufVar.c;
                    if (eufVar.b() < 10) {
                        eufVar.J(i3);
                    } else {
                        eufVar.K(9);
                        int j5 = eufVar.j() & 7;
                        if (eufVar.b() < j5) {
                            eufVar.J(i3);
                        } else {
                            eufVar.K(j5);
                            if (eufVar.b() < 4) {
                                eufVar.J(i3);
                            } else {
                                if (flk.e(eufVar.a, eufVar.b) == 443) {
                                    eufVar.K(4);
                                    int n = eufVar.n();
                                    if (eufVar.b() < n) {
                                        eufVar.J(i3);
                                    } else {
                                        eufVar.K(n);
                                    }
                                }
                                while (true) {
                                    if (eufVar.b() < 4 || (e = flk.e(eufVar.a, eufVar.b)) == 442 || e == 441 || (e >>> 8) != 1) {
                                        break;
                                    }
                                    eufVar.K(4);
                                    if (eufVar.b() < 2) {
                                        eufVar.J(i3);
                                        break;
                                    }
                                    eufVar.J(Math.min(eufVar.c, eufVar.b + eufVar.n()));
                                }
                            }
                        }
                    }
                    i = eufVar.b;
                }
            } else {
                if (j4 != -9223372036854775807L) {
                    return new fli(-2, j4, j3 + i);
                }
                return fli.a;
            }
        }
    }

    @Override // defpackage.flj
    public final void b() {
        this.b.G(eul.f);
    }
}
