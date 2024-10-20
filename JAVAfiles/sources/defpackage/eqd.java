package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqd {
    public static final eqd a = new eqd(1, 2, 3, null, -1, -1);
    public static final eqd b = new eqd(1, 1, 2, null, -1, -1);
    public final int c;
    public final int d;
    public final int e;
    public final byte[] f;
    public final int g;
    public final int h;
    private int i;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
    }

    public eqd(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = bArr;
        this.g = i4;
        this.h = i5;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 9) {
            return 6;
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            return -1;
        }
        return 2;
    }

    public static int b(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i == 16) {
                        return 6;
                    }
                    if (i == 18) {
                        return 7;
                    }
                    if (i != 6 && i != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public static String c(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return a.bV(i, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String d(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return a.bV(i, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String e(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return a.bV(i, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean h(eqd eqdVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (eqdVar == null) {
            return true;
        }
        int i5 = eqdVar.c;
        if ((i5 == -1 || i5 == 1 || i5 == 2) && (((i = eqdVar.d) == -1 || i == 2) && (((i2 = eqdVar.e) == -1 || i2 == 3) && eqdVar.f == null && (((i3 = eqdVar.h) == -1 || i3 == 8) && ((i4 = eqdVar.g) == -1 || i4 == 8))))) {
            return true;
        }
        return false;
    }

    public static boolean i(eqd eqdVar) {
        if (eqdVar == null) {
            return false;
        }
        int i = eqdVar.e;
        if (i != 7 && i != 6) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eqd eqdVar = (eqd) obj;
            if (this.c == eqdVar.c && this.d == eqdVar.d && this.e == eqdVar.e && Arrays.equals(this.f, eqdVar.f) && this.g == eqdVar.g && this.h == eqdVar.h) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.g != -1 && this.h != -1) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.c != -1 && this.d != -1 && this.e != -1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.i;
        if (i == 0) {
            int hashCode = ((((((((((this.c + 527) * 31) + this.d) * 31) + this.e) * 31) + Arrays.hashCode(this.f)) * 31) + this.g) * 31) + this.h;
            this.i = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String str;
        boolean z;
        int i = this.g;
        int i2 = this.e;
        int i3 = this.d;
        String d = d(this.c);
        String c = c(i3);
        String e = e(i2);
        String str2 = "NA";
        if (i == -1) {
            str = "NA";
        } else {
            str = a.cq(i, "bit Luma");
        }
        int i4 = this.h;
        if (i4 != -1) {
            str2 = a.cq(i4, "bit Chroma");
        }
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        return "ColorInfo(" + d + ", " + c + ", " + e + ", " + z + ", " + str + ", " + str2 + ")";
    }
}
