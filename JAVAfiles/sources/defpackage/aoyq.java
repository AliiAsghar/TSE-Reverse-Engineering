package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoyq {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void B(int i) {
        if (i < b) {
        } else {
            throw new apba("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(A(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, aoyp aoypVar) {
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - t) {
                if (i2 == 0) {
                    aoypVar.c = aozb.b;
                    return t;
                }
                aoypVar.c = aozb.y(bArr, t, i2);
                return t + i2;
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(apcj apcjVar, byte[] bArr, int i, int i2, int i3, aoyp aoypVar) {
        Object e = apcjVar.e();
        int x = x(e, apcjVar, bArr, i, i2, i3, aoypVar);
        apcjVar.g(e);
        aoypVar.c = e;
        return x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(apcj apcjVar, byte[] bArr, int i, int i2, aoyp aoypVar) {
        Object e = apcjVar.e();
        int y = y(e, apcjVar, bArr, i, i2, aoypVar);
        apcjVar.g(e);
        aoypVar.c = e;
        return y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(apcj apcjVar, int i, byte[] bArr, int i2, int i3, apax apaxVar, aoyp aoypVar) {
        int f = f(apcjVar, bArr, i2, i3, aoypVar);
        apaxVar.add(aoypVar.c);
        while (f < i3) {
            int t = t(bArr, f, aoypVar);
            if (i != aoypVar.a) {
                break;
            }
            f = f(apcjVar, bArr, t, i3, aoypVar);
            apaxVar.add(aoypVar.c);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        boolean z;
        aoys aoysVar = (aoys) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a + t;
        while (t < i2) {
            t = w(bArr, t, aoypVar);
            if (aoypVar.b != 0) {
                z = true;
            } else {
                z = false;
            }
            aoysVar.f(z);
        }
        if (t == i2) {
            return t;
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        aozm aozmVar = (aozm) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a;
        int i3 = t + i2;
        if (i3 <= bArr.length) {
            int i4 = aozmVar.d + (i2 / 8);
            int length = aozmVar.c.length;
            if (i4 > length) {
                if (length == 0) {
                    aozmVar.c = new double[Math.max(i4, 10)];
                } else {
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    aozmVar.c = Arrays.copyOf(aozmVar.c, length);
                }
            }
            while (t < i3) {
                aozmVar.g(a(bArr, t));
                t += 8;
            }
            if (t == i3) {
                return t;
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        apah apahVar = (apah) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a;
        int i3 = t + i2;
        if (i3 <= bArr.length) {
            int i4 = apahVar.c + (i2 / 4);
            int length = apahVar.b.length;
            if (i4 > length) {
                if (length == 0) {
                    apahVar.b = new int[Math.max(i4, 10)];
                } else {
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    apahVar.b = Arrays.copyOf(apahVar.b, length);
                }
            }
            while (t < i3) {
                apahVar.g(d(bArr, t));
                t += 4;
            }
            if (t == i3) {
                return t;
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        apbk apbkVar = (apbk) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a;
        int i3 = t + i2;
        if (i3 <= bArr.length) {
            int i4 = apbkVar.c + (i2 / 8);
            int length = apbkVar.b.length;
            if (i4 > length) {
                if (length == 0) {
                    apbkVar.b = new long[Math.max(i4, 10)];
                } else {
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    apbkVar.b = Arrays.copyOf(apbkVar.b, length);
                }
            }
            while (t < i3) {
                apbkVar.f(A(bArr, t));
                t += 8;
            }
            if (t == i3) {
                return t;
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        aozw aozwVar = (aozw) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a;
        int i3 = t + i2;
        if (i3 <= bArr.length) {
            int i4 = aozwVar.d + (i2 / 4);
            int length = aozwVar.c.length;
            if (i4 > length) {
                if (length == 0) {
                    aozwVar.c = new float[Math.max(i4, 10)];
                } else {
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    aozwVar.c = Arrays.copyOf(aozwVar.c, length);
                }
            }
            while (t < i3) {
                aozwVar.g(b(bArr, t));
                t += 4;
            }
            if (t == i3) {
                return t;
            }
            throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        apah apahVar = (apah) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a + t;
        while (t < i2) {
            t = t(bArr, t, aoypVar);
            apahVar.g(aozg.H(aoypVar.a));
        }
        if (t == i2) {
            return t;
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        apbk apbkVar = (apbk) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a + t;
        while (t < i2) {
            t = w(bArr, t, aoypVar);
            apbkVar.f(aozg.I(aoypVar.b));
        }
        if (t == i2) {
            return t;
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        apah apahVar = (apah) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a + t;
        while (t < i2) {
            t = t(bArr, t, aoypVar);
            apahVar.g(aoypVar.a);
        }
        if (t == i2) {
            return t;
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(byte[] bArr, int i, apax apaxVar, aoyp aoypVar) {
        apbk apbkVar = (apbk) apaxVar;
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a + t;
        while (t < i2) {
            t = w(bArr, t, aoypVar);
            apbkVar.f(aoypVar.b);
        }
        if (t == i2) {
            return t;
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(byte[] bArr, int i, aoyp aoypVar) {
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aoypVar.c = "";
                return t;
            }
            aoypVar.c = new String(bArr, t, i2, apay.a);
            return t + i2;
        }
        throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i, aoyp aoypVar) {
        int t = t(bArr, i, aoypVar);
        int i2 = aoypVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aoypVar.c = "";
                return t;
            }
            aoypVar.c = aowt.k(bArr, t, i2);
            return t + i2;
        }
        throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i, byte[] bArr, int i2, int i3, apcw apcwVar, aoyp aoypVar) {
        if (apdh.a(i) != 0) {
            int b2 = apdh.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 == 5) {
                                apcwVar.f(i, Integer.valueOf(d(bArr, i2)));
                                return i2 + 4;
                            }
                            throw new apba("Protocol message contained an invalid tag (zero).");
                        }
                        apcw apcwVar2 = new apcw();
                        int i4 = (i & (-8)) | 4;
                        int i5 = aoypVar.e + 1;
                        aoypVar.e = i5;
                        B(i5);
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int t = t(bArr, i2, aoypVar);
                            int i7 = aoypVar.a;
                            if (i7 == i4) {
                                i6 = i7;
                                i2 = t;
                                break;
                            }
                            i6 = i7;
                            i2 = s(i7, bArr, t, i3, apcwVar2, aoypVar);
                        }
                        aoypVar.e--;
                        if (i2 <= i3 && i6 == i4) {
                            apcwVar.f(i, apcwVar2);
                            return i2;
                        }
                        throw new apba("Failed to parse the message.");
                    }
                    int t2 = t(bArr, i2, aoypVar);
                    int i8 = aoypVar.a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - t2) {
                            if (i8 == 0) {
                                apcwVar.f(i, aozb.b);
                            } else {
                                apcwVar.f(i, aozb.y(bArr, t2, i8));
                            }
                            return t2 + i8;
                        }
                        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new apba("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                apcwVar.f(i, Long.valueOf(A(bArr, i2)));
                return i2 + 8;
            }
            int w = w(bArr, i2, aoypVar);
            apcwVar.f(i, Long.valueOf(aoypVar.b));
            return w;
        }
        throw new apba("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(byte[] bArr, int i, aoyp aoypVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            aoypVar.a = b2;
            return i2;
        }
        return u(b2, bArr, i2, aoypVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i, byte[] bArr, int i2, aoyp aoypVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            aoypVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            aoypVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            aoypVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            aoypVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                aoypVar.a = i11;
                return i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i, byte[] bArr, int i2, int i3, apax apaxVar, aoyp aoypVar) {
        apah apahVar = (apah) apaxVar;
        int t = t(bArr, i2, aoypVar);
        apahVar.g(aoypVar.a);
        while (t < i3) {
            int t2 = t(bArr, t, aoypVar);
            if (i != aoypVar.a) {
                break;
            }
            t = t(bArr, t2, aoypVar);
            apahVar.g(aoypVar.a);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(byte[] bArr, int i, aoyp aoypVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            aoypVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        aoypVar.b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(Object obj, apcj apcjVar, byte[] bArr, int i, int i2, int i3, aoyp aoypVar) {
        apbw apbwVar = (apbw) apcjVar;
        int i4 = aoypVar.e + 1;
        aoypVar.e = i4;
        B(i4);
        int c = apbwVar.c(obj, bArr, i, i2, i3, aoypVar);
        aoypVar.e--;
        aoypVar.c = obj;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(Object obj, apcj apcjVar, byte[] bArr, int i, int i2, aoyp aoypVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = u(i4, bArr, i3, aoypVar);
            i4 = aoypVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = aoypVar.e + 1;
            aoypVar.e = i6;
            B(i6);
            int i7 = i4 + i5;
            apcjVar.i(obj, bArr, i5, i7, aoypVar);
            aoypVar.e--;
            aoypVar.c = obj;
            return i7;
        }
        throw new apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i, byte[] bArr, int i2, int i3, aoyp aoypVar) {
        if (apdh.a(i) != 0) {
            int b2 = apdh.b(i);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 == 5) {
                                return i2 + 4;
                            }
                            throw new apba("Protocol message contained an invalid tag (zero).");
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = t(bArr, i2, aoypVar);
                            i5 = aoypVar.a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = z(i5, bArr, i2, i3, aoypVar);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw new apba("Failed to parse the message.");
                    }
                    return t(bArr, i2, aoypVar) + aoypVar.a;
                }
                return i2 + 8;
            }
            return w(bArr, i2, aoypVar);
        }
        throw new apba("Protocol message contained an invalid tag (zero).");
    }
}
