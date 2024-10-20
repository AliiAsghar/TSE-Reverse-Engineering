package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class z implements Cloneable {
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList c;
    public boolean d;
    private boolean g;
    public ArrayList b = new ArrayList();
    public final int f = h;

    static {
        char c;
        String a = c.a();
        int hashCode = a.hashCode();
        int i = 1;
        if (hashCode != -413919155) {
            if (hashCode == -99796978 && a.equals("DOUBLE_OPTIONAL")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (a.equals("DOUBLE_REQUIRED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                i = 2;
            } else {
                throw new IllegalArgumentException();
            }
        }
        h = i;
        e = a.G();
    }

    public z() {
    }

    private final int j(int i) {
        char charAt;
        while (i < this.a.length() && (((charAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(charAt) >= 0) && (charAt <= '9' || charAt == 'e' || charAt == 'E' || charAt == 8734))) {
            i++;
        }
        return i;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = e.a;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt <= 255) {
                if (e.a[charAt] != 0) {
                    break;
                }
                i++;
            } else {
                if (charAt >= 8206) {
                    if (charAt <= 12336) {
                        if (((e.c[e.b[(charAt - 8192) >> 5]] >> (charAt & 31)) & 1) != 0) {
                            break;
                        }
                    } else if (charAt >= 64830) {
                        if (charAt <= 65094) {
                            if (charAt <= 64831 || charAt >= 65093) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = e.a;
        while (i < str.length() && e.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final String m() {
        return o(this.a, 0);
    }

    private final String n(int i) {
        return o(this.a, i);
    }

    private static String o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i + 19;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        v(14, i, i2, size);
    }

    private final void q(int i, int i2, boolean z) {
        int i3;
        int i4;
        char charAt;
        int i5;
        double d;
        char charAt2 = this.a.charAt(i);
        int i6 = i + 1;
        int i7 = 0;
        if (charAt2 == '-') {
            if (i6 != i2) {
                i4 = i + 2;
                charAt = this.a.charAt(i6);
                i3 = 1;
                char c = charAt;
                i6 = i4;
                charAt2 = c;
            }
            throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(i, i2))));
        }
        if (charAt2 == '+') {
            if (i6 != i2) {
                i4 = i + 2;
                charAt = this.a.charAt(i6);
                i3 = 0;
                char c2 = charAt;
                i6 = i4;
                charAt2 = c2;
            }
            throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(i, i2))));
        }
        i3 = 0;
        if (charAt2 == 8734) {
            if (z && i6 == i2) {
                int i8 = i2 - i;
                if (1 != i3) {
                    d = Double.POSITIVE_INFINITY;
                } else {
                    d = Double.NEGATIVE_INFINITY;
                }
                p(d, i, i8);
                return;
            }
            throw new NumberFormatException("Bad syntax for numeric value: ".concat(String.valueOf(this.a.substring(i, i2))));
        }
        while (true) {
            i5 = i2 - i;
            if (charAt2 < '0' || charAt2 > '9' || (i7 = (i7 * 10) + (charAt2 - '0')) > i3 + 32767) {
                break;
            }
            if (i6 == i2) {
                if (i3 != 0) {
                    i7 = -i7;
                }
                v(13, i, i5, i7);
                return;
            } else {
                char charAt3 = this.a.charAt(i6);
                i6++;
                charAt2 = charAt3;
            }
        }
        p(Double.parseDouble(this.a.substring(i, i2)), i, i5);
    }

    private final boolean r(int i) {
        if (i > 0 || ((y) this.b.get(0)).e == 1) {
            return true;
        }
        return false;
    }

    private final boolean s(int i) {
        char charAt = this.a.charAt(i);
        if (charAt != 's' && charAt != 'S') {
            return false;
        }
        char charAt2 = this.a.charAt(i + 1);
        if (charAt2 != 'e' && charAt2 != 'E') {
            return false;
        }
        int i2 = i + 3;
        char charAt3 = this.a.charAt(i + 2);
        if (charAt3 != 'l' && charAt3 != 'L') {
            return false;
        }
        int i3 = i + 4;
        char charAt4 = this.a.charAt(i2);
        if (charAt4 != 'e' && charAt4 != 'E') {
            return false;
        }
        int i4 = i + 5;
        char charAt5 = this.a.charAt(i3);
        if (charAt5 != 'c' && charAt5 != 'C') {
            return false;
        }
        char charAt6 = this.a.charAt(i4);
        if (charAt6 != 't' && charAt6 != 'T') {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x043a, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0628, code lost:
    
        if (r4 == r(r21)) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x062a, code lost:
    
        if (r2 == false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0668, code lost:
    
        throw new java.lang.IllegalArgumentException("Missing 'other' keyword in " + defpackage.d.a(r0).toLowerCase(java.util.Locale.ENGLISH) + " pattern in " + m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0692, code lost:
    
        throw new java.lang.IllegalArgumentException("Bad " + defpackage.d.a(r0).toLowerCase(java.util.Locale.ENGLISH) + " pattern syntax: " + n(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0096, code lost:
    
        v(3, r0, r10 ? 1 : 0, 0);
        r11 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int t(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 1897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.t(int, int, int, int):int");
    }

    private final void u(int i, int i2, int i3, int i4, int i5) {
        ((y) this.b.get(i)).d = this.b.size();
        v(i2, i3, i4, i5);
    }

    private final void v(int i, int i2, int i3, int i4) {
        this.b.add(new y(i, i2, i3, i4));
    }

    public final double a(y yVar) {
        int i = yVar.e;
        if (i == 13) {
            return yVar.c;
        }
        if (i == 14) {
            return ((Double) this.c.get(yVar.c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c(int i) {
        int i2 = ((y) this.b.get(i)).d;
        if (i2 < i) {
            return i;
        }
        return i2;
    }

    public final Object clone() {
        return e();
    }

    public final y d(int i) {
        return (y) this.b.get(i);
    }

    public final z e() {
        try {
            z zVar = (z) super.clone();
            zVar.b = (ArrayList) this.b.clone();
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                zVar.c = (ArrayList) arrayList.clone();
            }
            zVar.g = false;
            return zVar;
        } catch (CloneNotSupportedException e2) {
            throw new aa(e2);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        int i = this.f;
        int i2 = zVar.f;
        if (i != 0) {
            if (i == i2 && ((str = this.a) != null ? str.equals(zVar.a) : zVar.a == null) && this.b.equals(zVar.b)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final String f(y yVar) {
        int i = yVar.a;
        return this.a.substring(i, yVar.b + i);
    }

    public final boolean g(y yVar, String str) {
        return this.a.regionMatches(yVar.a, str, 0, yVar.b);
    }

    public final int h(int i) {
        return ((y) this.b.get(i)).e;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f;
        a.aS(i2);
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((i2 * 37) + i) * 37) + this.b.hashCode();
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }

    public z(String str) {
        i(str);
    }
}
