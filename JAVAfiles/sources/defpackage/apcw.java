package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apcw {
    public static final apcw a = new apcw(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private apcw(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apcw b(apcw apcwVar, apcw apcwVar2) {
        int i = apcwVar.b + apcwVar2.b;
        int[] copyOf = Arrays.copyOf(apcwVar.c, i);
        System.arraycopy(apcwVar2.c, 0, copyOf, apcwVar.b, apcwVar2.b);
        Object[] copyOf2 = Arrays.copyOf(apcwVar.d, i);
        System.arraycopy(apcwVar2.d, 0, copyOf2, apcwVar.b, apcwVar2.b);
        return new apcw(i, copyOf, copyOf2, true);
    }

    public final int a() {
        int ac;
        int i = this.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.b; i3++) {
                int i4 = this.c[i3];
                int a2 = apdh.a(i4);
                int b = apdh.b(i4);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 5) {
                                    ((Integer) this.d[i3]).intValue();
                                    ac = aozl.au(a2);
                                } else {
                                    throw new IllegalStateException(new apaz());
                                }
                            } else {
                                int Z = aozl.Z(a2);
                                ac = Z + Z + ((apcw) this.d[i3]).a();
                            }
                        } else {
                            ac = aozl.G(a2, (aozb) this.d[i3]);
                        }
                    } else {
                        ((Long) this.d[i3]).longValue();
                        ac = aozl.av(a2);
                    }
                } else {
                    ac = aozl.ac(a2, ((Long) this.d[i3]).longValue());
                }
                i2 += ac;
            }
            this.e = i2;
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void d(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void e() {
        if (this.f) {
            this.f = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof apcw)) {
            return false;
        }
        apcw apcwVar = (apcw) obj;
        int i = this.b;
        if (i == apcwVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = apcwVar.c;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.d;
                    Object[] objArr2 = apcwVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, Object obj) {
        c();
        d(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i, aozg aozgVar) {
        int m;
        c();
        int b = apdh.b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b == 5) {
                                f(i, Integer.valueOf(aozgVar.g()));
                                return true;
                            }
                            throw new apaz();
                        }
                        return false;
                    }
                    apcw apcwVar = new apcw();
                    do {
                        m = aozgVar.m();
                        if (m == 0) {
                            break;
                        }
                    } while (apcwVar.g(m, aozgVar));
                    aozgVar.z(apdh.c(apdh.a(i), 4));
                    f(i, apcwVar);
                    return true;
                }
                f(i, aozgVar.w());
                return true;
            }
            f(i, Long.valueOf(aozgVar.o()));
            return true;
        }
        f(i, Long.valueOf(aozgVar.p()));
        return true;
    }

    public final void h(aojj aojjVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int b = apdh.b(i2);
                int a2 = apdh.a(i2);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 5) {
                                    aojjVar.h(a2, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new apaz());
                                }
                            } else {
                                ((aozl) aojjVar.b).A(a2, 3);
                                ((apcw) obj).h(aojjVar);
                                ((aozl) aojjVar.b).A(a2, 4);
                            }
                        } else {
                            aojjVar.e(a2, (aozb) obj);
                        }
                    } else {
                        aojjVar.i(a2, ((Long) obj).longValue());
                    }
                } else {
                    aojjVar.m(a2, ((Long) obj).longValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public apcw() {
        this(0, new int[8], new Object[8], true);
    }
}
