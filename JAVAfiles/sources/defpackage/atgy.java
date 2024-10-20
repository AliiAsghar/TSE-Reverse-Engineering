package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class atgy extends atgv {
    private static final int[] H = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] I = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] J = new long[12];
    private static final long[] K = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (i < 11) {
            j += H[i] * 86400000;
            int i2 = i + 1;
            J[i2] = j;
            j2 += I[i] * 86400000;
            K[i2] = j2;
            i = i2;
        }
    }

    public atgy(atfu atfuVar, int i) {
        super(atfuVar, i);
    }

    @Override // defpackage.atgv
    public final int R(int i, int i2) {
        int i3 = i2 - 1;
        if (ag(i)) {
            return I[i3];
        }
        return H[i3];
    }

    @Override // defpackage.atgv
    public final int T(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long ac = j - ac(i);
        boolean ag = ag(i);
        if (true != ag) {
            i2 = 15271875;
        } else {
            i2 = 15356250;
        }
        int i12 = (int) (ac >> 10);
        if (i12 < i2) {
            if (true != ag) {
                i8 = 7593750;
            } else {
                i8 = 7678125;
            }
            if (i12 < i8) {
                if (i12 < 2615625) {
                    return 1;
                }
                if (true != ag) {
                    i11 = 4978125;
                } else {
                    i11 = 5062500;
                }
                if (i12 >= i11) {
                    return 3;
                }
                return 2;
            }
            if (true != ag) {
                i9 = 10125000;
            } else {
                i9 = 10209375;
            }
            if (i12 < i9) {
                return 4;
            }
            if (true != ag) {
                i10 = 12740625;
            } else {
                i10 = 12825000;
            }
            if (i12 >= i10) {
                return 6;
            }
            return 5;
        }
        if (true != ag) {
            i3 = 23034375;
        } else {
            i3 = 23118750;
        }
        if (i12 < i3) {
            if (true != ag) {
                i6 = 17887500;
            } else {
                i6 = 17971875;
            }
            if (i12 < i6) {
                return 7;
            }
            if (true != ag) {
                i7 = 20503125;
            } else {
                i7 = 20587500;
            }
            if (i12 >= i7) {
                return 9;
            }
            return 8;
        }
        if (true != ag) {
            i4 = 25650000;
        } else {
            i4 = 25734375;
        }
        if (i12 < i4) {
            return 10;
        }
        if (true != ag) {
            i5 = 28181250;
        } else {
            i5 = 28265625;
        }
        if (i12 >= i5) {
            return 12;
        }
        return 11;
    }

    @Override // defpackage.atgv
    public final long ab(int i, int i2) {
        int i3 = i2 - 1;
        if (ag(i)) {
            return K[i3];
        }
        return J[i3];
    }

    @Override // defpackage.atgv
    public final long ae(long j, int i) {
        int Y = Y(j);
        int P = P(j, Y);
        if (P > 59) {
            if (ag(Y)) {
                if (!ag(i)) {
                    P--;
                }
            } else if (ag(i)) {
                P++;
            }
        }
        return ad(i, 1, P) + S(j);
    }

    @Override // defpackage.atgv
    public final boolean af(long j) {
        if (this.k.a(j) == 29 && this.m.t(j)) {
            return true;
        }
        return false;
    }
}
