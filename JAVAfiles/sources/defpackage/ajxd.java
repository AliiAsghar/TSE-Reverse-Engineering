package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajxd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(ajxl ajxlVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if ((ajxlVar.b & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        if (ajxlVar.h > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.T(z2);
        int aD = a.aD(ajxlVar.e);
        if (aD == 0) {
            aD = 1;
        }
        int i = aD - 1;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        if ((ajxlVar.b & 2) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        albo.T(!z12);
                        if (ajxlVar.f.size() > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        albo.T(z13);
                        if ((ajxlVar.b & 8) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        albo.T(!z14);
                        albo.T(ajxlVar.i);
                        if ((ajxlVar.b & 64) != 0) {
                            z15 = true;
                        }
                        albo.T(z15);
                        return;
                    }
                    throw new IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
                }
                if ((ajxlVar.b & 2) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                albo.T(z9);
                if (ajxlVar.f.size() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                albo.T(z10);
                if ((ajxlVar.b & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                albo.T(!z11);
                albo.T(!ajxlVar.i);
                if ((ajxlVar.b & 64) != 0) {
                    z15 = true;
                }
                albo.T(!z15);
                return;
            }
            if ((ajxlVar.b & 2) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            albo.T(z6);
            if (ajxlVar.f.size() == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            albo.T(z7);
            if ((ajxlVar.b & 8) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            albo.T(z8);
            albo.T(!ajxlVar.i);
            if ((ajxlVar.b & 64) != 0) {
                z15 = true;
            }
            albo.T(!z15);
            return;
        }
        if ((ajxlVar.b & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.T(!z3);
        if (ajxlVar.f.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        albo.T(z4);
        if ((ajxlVar.b & 8) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        albo.T(!z5);
        albo.T(!ajxlVar.i);
        if ((ajxlVar.b & 64) != 0) {
            z15 = true;
        }
        albo.T(!z15);
    }

    public abstract void a(alog alogVar);

    public abstract void c(ajyk ajykVar);

    public abstract void d(ajyu ajyuVar);
}
