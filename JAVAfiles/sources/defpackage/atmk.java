package defpackage;

import java.io.PrintStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmk implements Comparable, Serializable {
    public static final atmk a;
    public static final atmk b;
    private static final byte[] c = {0};
    private static final byte[] d = {1, 42};
    private static final DecimalFormat e;
    private static final byte[] f;
    private static final atmk g;
    private static final long serialVersionUID = -7257019940971525644L;
    private byte[] h;
    private long i;
    private int j;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        e = decimalFormat;
        f = new byte[256];
        decimalFormat.setMinimumIntegerDigits(3);
        int i = 0;
        while (true) {
            byte[] bArr = f;
            int length = bArr.length;
            if (i < 256) {
                if (i >= 65 && i <= 90) {
                    bArr[i] = (byte) (i + 32);
                } else {
                    bArr[i] = (byte) i;
                }
                i++;
            } else {
                atmk atmkVar = new atmk();
                a = atmkVar;
                atmkVar.t(c);
                atmk atmkVar2 = new atmk();
                b = atmkVar2;
                atmkVar2.h = new byte[0];
                atmk atmkVar3 = new atmk();
                g = atmkVar3;
                atmkVar3.t(d);
                return;
            }
        }
    }

    private atmk() {
    }

    public static atmk c(atmk atmkVar, atmk atmkVar2) {
        if (atmkVar.j()) {
            return atmkVar;
        }
        atmk atmkVar3 = new atmk();
        p(atmkVar, atmkVar3);
        atmkVar3.n(atmkVar2.h, atmkVar2.l(0), atmkVar2.a());
        return atmkVar3;
    }

    public static atmk e(String str, atmk atmkVar) {
        if (str.equals("@") && atmkVar != null) {
            return atmkVar;
        }
        if (str.equals(".")) {
            return a;
        }
        return new atmk(str, atmkVar);
    }

    private final int l(int i) {
        if (i == 0) {
            if (a() == 0) {
                return 0;
            }
            i = 0;
        }
        if (i >= 0 && i < a()) {
            if (i < 7) {
                return ((int) (this.i >>> ((7 - i) * 8))) & 255;
            }
            int l = l(6);
            for (int i2 = 6; i2 < i; i2++) {
                l += this.h[l] + 1;
            }
            return l;
        }
        throw new IllegalArgumentException("label out of range");
    }

    private static atns m(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("'");
        stringBuffer.append(str);
        stringBuffer.append("': ");
        stringBuffer.append(str2);
        return new atns(stringBuffer.toString());
    }

    private final void n(byte[] bArr, int i, int i2) {
        int length;
        byte[] bArr2 = this.h;
        if (bArr2 == null) {
            length = 0;
        } else {
            length = bArr2.length - l(0);
        }
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i3];
            if (i6 <= 63) {
                int i7 = i6 + 1;
                i3 += i7;
                i4 += i7;
            } else {
                throw new IllegalStateException("invalid label");
            }
        }
        int i8 = length + i4;
        if (i8 <= 255) {
            int a2 = a();
            int i9 = a2 + i2;
            if (i9 <= 128) {
                byte[] bArr3 = new byte[i8];
                if (length != 0) {
                    System.arraycopy(this.h, l(0), bArr3, 0, length);
                }
                System.arraycopy(bArr, i, bArr3, length, i4);
                this.h = bArr3;
                for (int i10 = 0; i10 < i2; i10++) {
                    r(a2 + i10, length);
                    length += bArr3[length] + 1;
                }
                q(i9);
                return;
            }
            throw new IllegalStateException("too many labels");
        }
        throw new atml();
    }

    private final void o(String str, byte[] bArr, int i, int i2) {
        try {
            n(bArr, i, i2);
        } catch (atml unused) {
            throw m(str, "Name too long");
        }
    }

    private static final void p(atmk atmkVar, atmk atmkVar2) {
        if (atmkVar.l(0) == 0) {
            atmkVar2.h = atmkVar.h;
            atmkVar2.i = atmkVar.i;
            return;
        }
        int l = atmkVar.l(0);
        int length = atmkVar.h.length - l;
        int a2 = atmkVar.a();
        byte[] bArr = new byte[length];
        atmkVar2.h = bArr;
        System.arraycopy(atmkVar.h, l, bArr, 0, length);
        for (int i = 0; i < a2 && i < 7; i++) {
            atmkVar2.r(i, atmkVar.l(i) - l);
        }
        atmkVar2.q(a2);
    }

    private final void q(int i) {
        this.i = (this.i & (-256)) | i;
    }

    private final void r(int i, int i2) {
        if (i >= 7) {
            return;
        }
        int i3 = (7 - i) * 8;
        this.i = (i2 << i3) | (this.i & (~(255 << i3)));
    }

    private final boolean s(byte[] bArr, int i) {
        int a2 = a();
        int l = l(0);
        for (int i2 = 0; i2 < a2; i2++) {
            byte b2 = this.h[l];
            if (b2 != bArr[i]) {
                return false;
            }
            l++;
            i++;
            if (b2 <= 63) {
                int i3 = 0;
                while (i3 < b2) {
                    byte[] bArr2 = f;
                    int i4 = l + 1;
                    int i5 = i + 1;
                    if (bArr2[this.h[l] & 255] != bArr2[bArr[i] & 255]) {
                        return false;
                    }
                    i3++;
                    i = i5;
                    l = i4;
                }
            } else {
                throw new IllegalStateException("invalid label");
            }
        }
        return true;
    }

    private final void t(byte[] bArr) {
        try {
            n(bArr, 0, 1);
        } catch (atml unused) {
        }
    }

    public final int a() {
        return (int) (this.i & 255);
    }

    public final String b(boolean z) {
        int a2 = a();
        if (a2 == 0) {
            return "@";
        }
        int i = 0;
        if (a2 == 1 && this.h[l(0)] == 0) {
            return ".";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int l = l(0);
        while (true) {
            if (i >= a2) {
                break;
            }
            byte b2 = this.h[l];
            if (b2 <= 63) {
                if (b2 == 0) {
                    if (!z) {
                        stringBuffer.append('.');
                    }
                } else {
                    if (i > 0) {
                        stringBuffer.append('.');
                    }
                    byte[] bArr = this.h;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    int i2 = l + 1;
                    byte b3 = bArr[l];
                    for (int i3 = i2; i3 < i2 + b3; i3++) {
                        int i4 = bArr[i3] & 255;
                        if (i4 > 32 && i4 < 127) {
                            if (i4 != 34 && i4 != 40 && i4 != 41 && i4 != 46 && i4 != 59 && i4 != 92 && i4 != 64 && i4 != 36) {
                                stringBuffer2.append((char) i4);
                            } else {
                                stringBuffer2.append('\\');
                                stringBuffer2.append((char) i4);
                            }
                        } else {
                            stringBuffer2.append('\\');
                            stringBuffer2.append(e.format(i4));
                        }
                    }
                    stringBuffer.append(stringBuffer2.toString());
                    l += b2 + 1;
                    i++;
                }
            } else {
                throw new IllegalStateException("invalid label");
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        atmk atmkVar = (atmk) obj;
        if (this == atmkVar) {
            return 0;
        }
        int a2 = a();
        int a3 = atmkVar.a();
        if (a2 > a3) {
            i = a3;
        } else {
            i = a2;
        }
        for (int i2 = 1; i2 <= i; i2++) {
            int l = l(a2 - i2);
            int l2 = atmkVar.l(a3 - i2);
            byte b2 = this.h[l];
            byte b3 = atmkVar.h[l2];
            for (int i3 = 0; i3 < b2 && i3 < b3; i3++) {
                byte[] bArr = f;
                int i4 = bArr[this.h[(i3 + l) + 1] & 255] - bArr[atmkVar.h[(i3 + l2) + 1] & 255];
                if (i4 != 0) {
                    return i4;
                }
            }
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return a2 - a3;
    }

    public final atmk d(atks atksVar) {
        atmk atmkVar = atksVar.f;
        atmk atmkVar2 = atksVar.a;
        if (k(atmkVar)) {
            int a2 = a() - atmkVar.a();
            int f2 = f() - atmkVar.f();
            int l = l(0);
            int a3 = atmkVar2.a();
            short f3 = atmkVar2.f();
            int i = f2 + f3;
            if (i <= 255) {
                atmk atmkVar3 = new atmk();
                int i2 = a2 + a3;
                atmkVar3.q(i2);
                byte[] bArr = new byte[i];
                atmkVar3.h = bArr;
                System.arraycopy(this.h, l, bArr, 0, f2);
                System.arraycopy(atmkVar2.h, 0, atmkVar3.h, f2, f3);
                int i3 = 0;
                for (int i4 = 0; i4 < 7 && i4 < i2; i4++) {
                    atmkVar3.r(i4, i3);
                    i3 += atmkVar3.h[i3] + 1;
                }
                return atmkVar3;
            }
            throw new atml();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof atmk)) {
            atmk atmkVar = (atmk) obj;
            if (atmkVar.j == 0) {
                atmkVar.hashCode();
            }
            if (this.j == 0) {
                hashCode();
            }
            if (atmkVar.j != this.j || atmkVar.a() != a()) {
                return false;
            }
            return s(atmkVar.h, atmkVar.l(0));
        }
        return false;
    }

    public final short f() {
        if (a() == 0) {
            return (short) 0;
        }
        return (short) (this.h.length - l(0));
    }

    public final void g(atkv atkvVar, atkn atknVar) {
        atmk atmkVar;
        int i;
        if (j()) {
            int a2 = a();
            int i2 = 0;
            while (true) {
                int i3 = -1;
                if (i2 < a2 - 1) {
                    if (i2 == 0) {
                        atmkVar = this;
                    } else {
                        atmkVar = new atmk(this, i2);
                    }
                    if (atknVar != null) {
                        Object obj = ((atkm[]) atknVar.b)[(atmkVar.hashCode() & Integer.MAX_VALUE) % 17];
                        while (obj != null) {
                            atkm atkmVar = (atkm) obj;
                            if (((atmk) atkmVar.b).equals(atmkVar)) {
                                i3 = atkmVar.a;
                            }
                            obj = atkmVar.c;
                        }
                        if (atknVar.a) {
                            PrintStream printStream = System.err;
                            StringBuffer stringBuffer = new StringBuffer("Looking for ");
                            stringBuffer.append(atmkVar);
                            stringBuffer.append(", found ");
                            stringBuffer.append(i3);
                            printStream.println(stringBuffer.toString());
                        }
                    }
                    if (i3 >= 0) {
                        atkvVar.d(49152 | i3);
                        return;
                    }
                    if (atknVar != null && (i = atkvVar.a) <= 16383) {
                        int hashCode = (Integer.MAX_VALUE & atmkVar.hashCode()) % 17;
                        atkm atkmVar2 = new atkm();
                        atkmVar2.b = atmkVar;
                        atkmVar2.a = i;
                        atkm[] atkmVarArr = (atkm[]) atknVar.b;
                        atkmVar2.c = atkmVarArr[hashCode];
                        atkmVarArr[hashCode] = atkmVar2;
                        if (atknVar.a) {
                            PrintStream printStream2 = System.err;
                            StringBuffer stringBuffer2 = new StringBuffer("Adding ");
                            stringBuffer2.append(atmkVar);
                            stringBuffer2.append(" at ");
                            stringBuffer2.append(i);
                            printStream2.println(stringBuffer2.toString());
                        }
                    }
                    int l = l(i2);
                    byte[] bArr = this.h;
                    atkvVar.b(bArr, l, bArr[l] + 1);
                    i2++;
                } else {
                    atkvVar.g(0);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
    }

    public final void h(atkv atkvVar, atkn atknVar, boolean z) {
        if (z) {
            i(atkvVar);
        } else {
            g(atkvVar, atknVar);
        }
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int l = l(0);
        while (true) {
            byte[] bArr = this.h;
            if (l < bArr.length) {
                i2 += (i2 << 3) + f[bArr[l] & 255];
                l++;
            } else {
                this.j = i2;
                return i2;
            }
        }
    }

    public final void i(atkv atkvVar) {
        byte[] bArr;
        int a2 = a();
        if (a2 == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[this.h.length - l(0)];
            int l = l(0);
            int i = 0;
            for (int i2 = 0; i2 < a2; i2++) {
                byte b2 = this.h[l];
                if (b2 <= 63) {
                    bArr2[i] = b2;
                    l++;
                    i++;
                    int i3 = 0;
                    while (i3 < b2) {
                        bArr2[i] = f[this.h[l] & 255];
                        i3++;
                        i++;
                        l++;
                    }
                } else {
                    throw new IllegalStateException("invalid label");
                }
            }
            bArr = bArr2;
        }
        atkvVar.a(bArr);
    }

    public final boolean j() {
        int a2 = a();
        if (a2 == 0 || this.h[l(a2 - 1)] != 0) {
            return false;
        }
        return true;
    }

    public final boolean k(atmk atmkVar) {
        int a2 = a();
        int a3 = atmkVar.a();
        if (a3 > a2) {
            return false;
        }
        if (a3 == a2) {
            return equals(atmkVar);
        }
        return atmkVar.s(this.h, l(a2 - a3));
    }

    public final String toString() {
        return b(false);
    }

    public atmk(String str, atmk atmkVar) {
        int i;
        boolean z;
        if (!str.equals("")) {
            if (str.equals("@")) {
                if (atmkVar == null) {
                    p(b, this);
                    return;
                } else {
                    p(atmkVar, this);
                    return;
                }
            }
            if (str.equals(".")) {
                p(a, this);
                return;
            }
            byte[] bArr = new byte[64];
            int i2 = -1;
            int i3 = 0;
            boolean z2 = false;
            int i4 = 1;
            int i5 = 0;
            for (int i6 = 0; i6 < str.length(); i6++) {
                byte charAt = (byte) str.charAt(i6);
                if (z2) {
                    if (charAt >= 48 && charAt <= 57 && i3 < 3) {
                        i3++;
                        i5 = (i5 * 10) + (charAt - 48);
                        if (i5 > 255) {
                            throw m(str, "bad escape");
                        }
                        if (i3 < 3) {
                            z2 = true;
                        } else {
                            charAt = (byte) i5;
                        }
                    } else if (i3 > 0 && i3 < 3) {
                        throw m(str, "bad escape");
                    }
                    if (i4 <= 63) {
                        bArr[i4] = charAt;
                        i2 = i4;
                        z2 = false;
                        i4++;
                    } else {
                        throw m(str, "label too long");
                    }
                } else if (charAt == 92) {
                    i3 = 0;
                    z2 = true;
                    i5 = 0;
                } else if (charAt != 46) {
                    i2 = i2 == -1 ? i6 : i2;
                    if (i4 <= 63) {
                        bArr[i4] = charAt;
                        i4++;
                        z2 = false;
                    } else {
                        throw m(str, "label too long");
                    }
                } else if (i2 != -1) {
                    bArr[0] = (byte) (i4 - 1);
                    o(str, bArr, 0, 1);
                    i2 = -1;
                    z2 = false;
                    i4 = 1;
                } else {
                    throw m(str, "invalid empty label");
                }
            }
            if (i3 > 0 && i3 < 3) {
                throw m(str, "bad escape");
            }
            if (z2) {
                throw m(str, "bad escape");
            }
            if (i2 == -1) {
                z = true;
                i = 0;
                o(str, c, 0, 1);
            } else {
                i = 0;
                bArr[0] = (byte) (i4 - 1);
                o(str, bArr, 0, 1);
                z = false;
            }
            if (atmkVar == null || z) {
                return;
            }
            o(str, atmkVar.h, atmkVar.l(i), atmkVar.a());
            return;
        }
        throw m(str, "empty name");
    }

    public atmk(atkt atktVar) {
        byte[] bArr = new byte[64];
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int c2 = atktVar.c();
            int i = c2 & 192;
            if (i != 0) {
                if (i == 192) {
                    int c3 = atktVar.c() + ((c2 & (-193)) << 8);
                    if (atmp.a("verbosecompression")) {
                        PrintStream printStream = System.err;
                        StringBuffer stringBuffer = new StringBuffer("currently ");
                        stringBuffer.append(atktVar.a());
                        stringBuffer.append(", pointer to ");
                        stringBuffer.append(c3);
                        printStream.println(stringBuffer.toString());
                    }
                    if (c3 < atktVar.a() - 2) {
                        if (!z2) {
                            atktVar.a = ((ByteBuffer) atktVar.c).position();
                            atktVar.b = ((ByteBuffer) atktVar.c).limit();
                        }
                        if (c3 < ((ByteBuffer) atktVar.c).capacity()) {
                            ((ByteBuffer) atktVar.c).position(c3);
                            ByteBuffer byteBuffer = (ByteBuffer) atktVar.c;
                            byteBuffer.limit(byteBuffer.capacity());
                            if (atmp.a("verbosecompression")) {
                                PrintStream printStream2 = System.err;
                                StringBuffer stringBuffer2 = new StringBuffer("current name '");
                                stringBuffer2.append(this);
                                stringBuffer2.append("', seeking to ");
                                stringBuffer2.append(c3);
                                printStream2.println(stringBuffer2.toString());
                            }
                            z2 = true;
                        } else {
                            throw new IllegalArgumentException("cannot jump past end of input");
                        }
                    } else {
                        throw new atoc("bad compression");
                    }
                } else {
                    throw new atoc("bad label type");
                }
            } else {
                if (a() >= 128) {
                    throw new atoc("too many labels");
                }
                if (c2 == 0) {
                    n(c, 0, 1);
                    z = true;
                } else {
                    bArr[0] = (byte) c2;
                    atktVar.f(bArr, 1, c2);
                    n(bArr, 0, 1);
                }
            }
        }
        if (z2) {
            int i2 = atktVar.a;
            if (i2 >= 0) {
                ((ByteBuffer) atktVar.c).position(i2);
                ((ByteBuffer) atktVar.c).limit(atktVar.b);
                atktVar.a = -1;
                atktVar.b = -1;
                return;
            }
            throw new IllegalStateException("no previous state");
        }
    }

    public atmk(atmk atmkVar, int i) {
        int a2 = atmkVar.a();
        if (i <= a2) {
            this.h = atmkVar.h;
            int i2 = a2 - i;
            q(i2);
            for (int i3 = 0; i3 < 7 && i3 < i2; i3++) {
                r(i3, atmkVar.l(i3 + i));
            }
            return;
        }
        throw new IllegalArgumentException("attempted to remove too many labels");
    }
}
