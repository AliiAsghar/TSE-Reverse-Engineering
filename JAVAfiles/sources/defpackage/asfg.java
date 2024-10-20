package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asfg {
    public static final asfn a = new asfn("REMOVE_FROZEN");
    private final int c;
    private final boolean d;
    private final int e;
    private final atoi g;
    private final arve f = new arve(null, arvf.a);
    public final arvd b = new arvd(0, arvf.a);

    public asfg(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        this.g = new atoi(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            long j = this.b.b;
            if ((3458764513820540928L & j) != 0) {
                if ((j & 2305843009213693952L) == 0) {
                    return 1;
                }
                return 2;
            }
            int i = this.e;
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = (int) (1073741823 & j);
            if (((i2 + 2) & i) == (i3 & i)) {
                return 1;
            }
            if (!this.d) {
                if (this.g.a(i2 & i).a != null) {
                    int i4 = this.c;
                    if (i4 < 1024 || ((i2 - i3) & 1073741823) > (i4 >> 1)) {
                        break;
                    }
                }
            }
            if (this.b.c(j, (((i2 + 1) & 1073741823) << 30) | arro.A(j, 1152921503533105152L))) {
                this.g.a(i2 & i).c(obj);
                asfg asfgVar = this;
                while ((asfgVar.b.b & 1152921504606846976L) != 0) {
                    asfgVar = asfgVar.c();
                    Object obj2 = asfgVar.g.a(asfgVar.e & i2).a;
                    if ((obj2 instanceof asff) && ((asff) obj2).a == i2) {
                        asfgVar.g.a(asfgVar.e & i2).c(obj);
                    } else {
                        asfgVar = null;
                    }
                    if (asfgVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public final Object b() {
        while (true) {
            long j = this.b.b;
            long j2 = 1152921504606846976L;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            Object obj = this.g.a(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof asff) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (this.b.c(j, arro.B(j, i4))) {
                    this.g.a(this.e & i2).c(null);
                    return obj;
                }
                if (this.d) {
                    asfg asfgVar = this;
                    while (true) {
                        arvd arvdVar = asfgVar.b;
                        while (true) {
                            long j3 = arvdVar.b;
                            long j4 = j3 & 1073741823;
                            boolean z = arwh.a;
                            if ((j3 & j2) != 0) {
                                asfgVar = asfgVar.c();
                                break;
                            }
                            if (asfgVar.b.c(j3, arro.B(j3, i4))) {
                                asfgVar.g.a(asfgVar.e & ((int) j4)).c(null);
                                asfgVar = null;
                                break;
                            }
                            j2 = 1152921504606846976L;
                        }
                        if (asfgVar == null) {
                            return obj;
                        }
                        j2 = 1152921504606846976L;
                    }
                }
            }
        }
    }

    public final asfg c() {
        long j;
        while (true) {
            arvd arvdVar = this.b;
            j = arvdVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (arvdVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        arve arveVar = this.f;
        while (true) {
            asfg asfgVar = (asfg) arveVar.a;
            if (asfgVar != null) {
                return asfgVar;
            }
            arve arveVar2 = this.f;
            int i = this.c;
            asfg asfgVar2 = new asfg(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object obj = this.g.a(i4).a;
                    if (obj == null) {
                        obj = new asff(i2);
                    }
                    asfgVar2.g.a(asfgVar2.e & i2).c(obj);
                    i2++;
                }
            }
            asfgVar2.b.b = arro.A(j, 1152921504606846976L);
            arveVar2.d(null, asfgVar2);
        }
    }

    public final boolean d() {
        arvd arvdVar;
        long j;
        do {
            arvdVar = this.b;
            j = arvdVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!arvdVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }
}
