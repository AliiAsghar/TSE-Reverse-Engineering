package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asqx implements Serializable, Comparable {
    public static final asqx a = new asqx(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public asqx(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static final asqx f(byte... bArr) {
        bArr.getClass();
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        copyOf.getClass();
        return new asqx(copyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        objectInputStream.getClass();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            asqx asqxVar = new asqx(bArr);
            Field declaredField = asqx.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            declaredField.set(this, asqxVar.b);
            return;
        }
        throw new IllegalArgumentException(a.bV(readInt, "byteCount < 0: "));
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int b() {
        return this.b.length;
    }

    public final String c() {
        int length;
        int i;
        byte[] bArr = asqo.a;
        byte[] bArr2 = this.b;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr2.length;
            i = length - (length % 3);
            if (i2 >= i) {
                break;
            }
            int i4 = i3 + 3;
            byte b = bArr2[i2];
            int i5 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i5];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int i6 = length - i;
        if (i6 != 1) {
            if (i6 == 2) {
                int i7 = i2 + 1;
                byte b4 = bArr2[i2];
                byte b5 = bArr2[i7];
                bArr3[i3] = bArr[(b4 & 255) >> 2];
                bArr3[i3 + 1] = bArr[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr3[i3 + 2] = bArr[(b5 & 15) << 2];
                bArr3[i3 + 3] = 61;
            }
        } else {
            byte b6 = bArr2[i2];
            bArr3[i3] = bArr[(b6 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b6 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        }
        return aotl.N(bArr3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        asqx asqxVar = (asqx) obj;
        asqxVar.getClass();
        int b = b();
        int b2 = asqxVar.b();
        int min = Math.min(b, b2);
        int i = 0;
        while (true) {
            if (i < min) {
                int a2 = a(i) & 255;
                int a3 = asqxVar.a(i) & 255;
                if (a2 == a3) {
                    i++;
                } else if (a2 < a3) {
                    return -1;
                }
            } else {
                if (b == b2) {
                    return 0;
                }
                if (b < b2) {
                    return -1;
                }
            }
        }
        return 1;
    }

    public String d() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            cArr[i] = asru.a[(b >> 4) & 15];
            cArr[i + 1] = asru.a[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public final String e() {
        String str = this.d;
        if (str == null) {
            String N = aotl.N(j());
            this.d = N;
            return N;
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asqx) {
            asqx asqxVar = (asqx) obj;
            int b = asqxVar.b();
            byte[] bArr = this.b;
            int length = bArr.length;
            if (b == length && asqxVar.h(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    public asqx g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i < length) {
                int i2 = i + 1;
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, length);
                    copyOf.getClass();
                    copyOf[i] = (byte) (b + 32);
                    while (i2 < copyOf.length) {
                        int i3 = i2 + 1;
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                        i2 = i3;
                    }
                    return new asqx(copyOf);
                }
                i = i2;
            } else {
                return this;
            }
        }
    }

    public boolean h(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && aotl.U(bArr2, i, bArr, i2, i3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b);
        this.c = hashCode;
        return hashCode;
    }

    public final boolean i(asqx asqxVar) {
        asqxVar.getClass();
        return l(asqxVar, asqxVar.b());
    }

    public byte[] j() {
        return this.b;
    }

    public byte[] k() {
        byte[] bArr = this.b;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        copyOf.getClass();
        return copyOf;
    }

    public boolean l(asqx asqxVar, int i) {
        return asqxVar.h(0, this.b, 0, i);
    }

    public void m(asqu asquVar, int i) {
        char[] cArr = asru.a;
        asquVar.K(this.b, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d2, code lost:
    
        if (r3 < 65536) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00bb, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d5, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d8, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x009c, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x011a, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0120, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x010f, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x012e, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0132, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0136, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00e3, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x013a, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0086, code lost:
    
        if (r9 < 65536) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0088, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0075, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008e, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0063, code lost:
    
        if (r5 != 64) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c5, code lost:
    
        if (r5 != 64) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asqx.toString():java.lang.String");
    }
}
