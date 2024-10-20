package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atcy {
    public atcu a;
    public int b;
    public int[] c;

    public atcy(atcu atcuVar, int i) {
        this.a = atcuVar;
        this.b = i;
        int[] iArr = new int[i + 1];
        this.c = iArr;
        iArr[i] = 1;
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (iArr[length] == 0);
        return length;
    }

    public static int d(int[] iArr) {
        int a = a(iArr);
        if (a == -1) {
            return 0;
        }
        return iArr[a];
    }

    public static final int[] i(int[] iArr, int[] iArr2) {
        int[] iArr3;
        int length = iArr.length;
        int length2 = iArr2.length;
        if (length < length2) {
            iArr3 = new int[length2];
            System.arraycopy(iArr2, 0, iArr3, 0, length2);
        } else {
            int[] iArr4 = new int[length];
            System.arraycopy(iArr, 0, iArr4, 0, length);
            iArr = iArr2;
            iArr3 = iArr4;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (length3 >= 0) {
                iArr3[length3] = iArr3[length3] ^ iArr[length3];
            } else {
                return iArr3;
            }
        }
    }

    private final void j() {
        this.b = this.c.length - 1;
        while (true) {
            int i = this.b;
            if (i >= 0 && this.c[i] == 0) {
                this.b = i - 1;
            } else {
                return;
            }
        }
    }

    public final int b(int i) {
        if (i >= 0 && i <= this.b) {
            return this.c[i];
        }
        return 0;
    }

    public final int c() {
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public final atcy e(int i) {
        if (this.a.c(i)) {
            return new atcy(this.a, h(this.c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof atcy)) {
            atcy atcyVar = (atcy) obj;
            if (this.a.equals(atcyVar.a) && this.b == atcyVar.b) {
                int[] iArr = this.c;
                int[] iArr2 = atcyVar.c;
                int a = a(iArr);
                if (a == a(iArr2)) {
                    for (int i = 0; i <= a; i++) {
                        if (iArr[i] == iArr2[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(atcy atcyVar) {
        this.c = i(this.c, atcyVar.c);
        j();
    }

    public final void g(int i) {
        if (this.a.c(i)) {
            this.c = h(this.c, i);
            j();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public final int[] h(int[] iArr, int i) {
        int a = a(iArr);
        if (a != -1 && i != 0) {
            if (i == 1) {
                return atow.aa(iArr);
            }
            int[] iArr2 = new int[a + 1];
            while (a >= 0) {
                iArr2[a] = this.a.b(iArr[a], i);
                a--;
            }
            return iArr2;
        }
        return new int[1];
    }

    public final int hashCode() {
        int i = this.a.b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 < iArr.length) {
                i = (i * 31) + iArr[i2];
                i2++;
            } else {
                return i;
            }
        }
    }

    public final String toString() {
        String str;
        String str2 = " Polynomial over " + this.a.toString() + ": \n";
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i < iArr.length) {
                atcu atcuVar = this.a;
                int i2 = iArr[i];
                String str3 = "";
                for (int i3 = 0; i3 < atcuVar.a; i3++) {
                    if ((((byte) i2) & 1) == 0) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    str3 = str.concat(str3);
                    i2 >>>= 1;
                }
                str2 = str2 + str3 + "Y^" + i + "+";
                i++;
            } else {
                return str2.concat(";");
            }
        }
    }

    public atcy(atcu atcuVar, byte[] bArr) {
        this.a = atcuVar;
        int i = 8;
        int i2 = 1;
        while (atcuVar.a > i) {
            i += 8;
            i2++;
        }
        int length = bArr.length;
        if (length % i2 == 0) {
            this.c = new int[length / i2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.c;
                int length2 = iArr.length;
                if (i3 < length2) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.c;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (!this.a.c(this.c[i3])) {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                    i3++;
                } else {
                    if (length2 != 1 && iArr[length2 - 1] == 0) {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                    j();
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public atcy(atcu atcuVar, int[] iArr) {
        int[] iArr2;
        this.a = atcuVar;
        int a = a(iArr);
        if (a == -1) {
            iArr2 = new int[1];
        } else {
            int i = a + 1;
            if (iArr.length == i) {
                iArr2 = atow.aa(iArr);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.c = iArr2;
        j();
    }

    public atcy(atcy atcyVar) {
        this.a = atcyVar.a;
        this.b = atcyVar.b;
        this.c = atow.aa(atcyVar.c);
    }
}
