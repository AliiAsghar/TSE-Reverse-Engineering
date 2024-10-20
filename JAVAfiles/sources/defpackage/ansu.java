package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansu {
    private static final anss c = new anss(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final ansy b = new ansy(new asqe(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, (char[]) null);
    public static final byte[] a = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static int a(long[] jArr) {
        return ansz.k(jArr)[0] & 1;
    }

    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static long c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | b(bArr, i);
    }

    public static void d(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static boolean e(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        ansz.e(jArr2);
        byte[] k = ansz.k(jArr2);
        for (int i = 0; i < 32; i++) {
            if (k[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) aobo.d.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static byte[] g(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        ansy ansyVar = new ansy(b, (byte[]) null);
        ansy ansyVar2 = new ansy();
        for (i = 1; i < 64; i += 2) {
            anss anssVar = new anss(c);
            m(anssVar, i / 2, bArr2[i]);
            ansy.c(ansyVar2, ansyVar);
            i(ansyVar, ansyVar2, anssVar);
        }
        asqe asqeVar = new asqe();
        asqe.s(asqeVar, ansyVar);
        k(ansyVar, asqeVar);
        asqe.s(asqeVar, ansyVar);
        k(ansyVar, asqeVar);
        asqe.s(asqeVar, ansyVar);
        k(ansyVar, asqeVar);
        asqe.s(asqeVar, ansyVar);
        k(ansyVar, asqeVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            anss anssVar2 = new anss(c);
            m(anssVar2, i7 / 2, bArr2[i7]);
            ansy.c(ansyVar2, ansyVar);
            i(ansyVar, ansyVar2, anssVar2);
        }
        asqe asqeVar2 = new asqe(ansyVar);
        long[] jArr = new long[10];
        ansz.h(jArr, (long[]) asqeVar2.a);
        long[] jArr2 = new long[10];
        ansz.h(jArr2, (long[]) asqeVar2.b);
        long[] jArr3 = new long[10];
        ansz.h(jArr3, (long[]) asqeVar2.c);
        long[] jArr4 = new long[10];
        ansz.h(jArr4, jArr3);
        long[] jArr5 = new long[10];
        ansz.i(jArr5, jArr2, jArr);
        ansz.b(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        ansz.b(jArr6, jArr, jArr2);
        ansz.b(jArr6, jArr6, ansv.a);
        ansz.j(jArr6, jArr6, jArr4);
        ansz.d(jArr6, jArr6);
        if (MessageDigest.isEqual(ansz.k(jArr5), ansz.k(jArr6))) {
            return asqeVar2.l();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] h(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b3 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void i(ansy ansyVar, ansy ansyVar2, anss anssVar) {
        long[] jArr = new long[10];
        Object obj = ((asqe) ansyVar.b).a;
        asqe asqeVar = (asqe) ansyVar2.a;
        long[] jArr2 = (long[]) obj;
        ansz.j(jArr2, (long[]) asqeVar.b, (long[]) asqeVar.a);
        Object obj2 = ((asqe) ansyVar.b).b;
        asqe asqeVar2 = (asqe) ansyVar2.a;
        long[] jArr3 = (long[]) obj2;
        ansz.i(jArr3, (long[]) asqeVar2.b, (long[]) asqeVar2.a);
        long[] jArr4 = (long[]) ((asqe) ansyVar.b).b;
        ansz.b(jArr4, jArr4, anssVar.b);
        asqe asqeVar3 = (asqe) ansyVar.b;
        Object obj3 = asqeVar3.c;
        long[] jArr5 = (long[]) obj3;
        ansz.b(jArr5, (long[]) asqeVar3.a, anssVar.a);
        long[] jArr6 = anssVar.c;
        ansz.b((long[]) ansyVar.a, (long[]) ansyVar2.b, jArr6);
        anssVar.b((long[]) ((asqe) ansyVar.b).a, (long[]) ((asqe) ansyVar2.a).c);
        long[] jArr7 = (long[]) ((asqe) ansyVar.b).a;
        ansz.j(jArr, jArr7, jArr7);
        asqe asqeVar4 = (asqe) ansyVar.b;
        Object obj4 = asqeVar4.a;
        long[] jArr8 = (long[]) obj4;
        ansz.i(jArr8, (long[]) asqeVar4.c, (long[]) asqeVar4.b);
        asqe asqeVar5 = (asqe) ansyVar.b;
        Object obj5 = asqeVar5.c;
        long[] jArr9 = (long[]) asqeVar5.b;
        ansz.j(jArr9, (long[]) obj5, jArr9);
        ansz.j((long[]) ((asqe) ansyVar.b).c, jArr, (long[]) ansyVar.a);
        long[] jArr10 = (long[]) ansyVar.a;
        ansz.i(jArr10, jArr, jArr10);
    }

    public static void j(ansy ansyVar, ansy ansyVar2, anss anssVar) {
        long[] jArr = new long[10];
        Object obj = ((asqe) ansyVar.b).a;
        asqe asqeVar = (asqe) ansyVar2.a;
        long[] jArr2 = (long[]) obj;
        ansz.j(jArr2, (long[]) asqeVar.b, (long[]) asqeVar.a);
        Object obj2 = ((asqe) ansyVar.b).b;
        asqe asqeVar2 = (asqe) ansyVar2.a;
        long[] jArr3 = (long[]) obj2;
        ansz.i(jArr3, (long[]) asqeVar2.b, (long[]) asqeVar2.a);
        long[] jArr4 = (long[]) ((asqe) ansyVar.b).b;
        ansz.b(jArr4, jArr4, anssVar.a);
        asqe asqeVar3 = (asqe) ansyVar.b;
        Object obj3 = asqeVar3.c;
        long[] jArr5 = (long[]) obj3;
        ansz.b(jArr5, (long[]) asqeVar3.a, anssVar.b);
        long[] jArr6 = anssVar.c;
        ansz.b((long[]) ansyVar.a, (long[]) ansyVar2.b, jArr6);
        anssVar.b((long[]) ((asqe) ansyVar.b).a, (long[]) ((asqe) ansyVar2.a).c);
        long[] jArr7 = (long[]) ((asqe) ansyVar.b).a;
        ansz.j(jArr, jArr7, jArr7);
        asqe asqeVar4 = (asqe) ansyVar.b;
        Object obj4 = asqeVar4.a;
        long[] jArr8 = (long[]) obj4;
        ansz.i(jArr8, (long[]) asqeVar4.c, (long[]) asqeVar4.b);
        asqe asqeVar5 = (asqe) ansyVar.b;
        Object obj5 = asqeVar5.c;
        long[] jArr9 = (long[]) asqeVar5.b;
        ansz.j(jArr9, (long[]) obj5, jArr9);
        ansz.i((long[]) ((asqe) ansyVar.b).c, jArr, (long[]) ansyVar.a);
        long[] jArr10 = (long[]) ansyVar.a;
        ansz.j(jArr10, jArr, jArr10);
    }

    public static void k(ansy ansyVar, asqe asqeVar) {
        long[] jArr = new long[10];
        ansz.h((long[]) ((asqe) ansyVar.b).a, (long[]) asqeVar.a);
        ansz.h((long[]) ((asqe) ansyVar.b).c, (long[]) asqeVar.b);
        ansz.h((long[]) ansyVar.a, (long[]) asqeVar.c);
        long[] jArr2 = (long[]) ansyVar.a;
        ansz.j(jArr2, jArr2, jArr2);
        Object obj = ((asqe) ansyVar.b).b;
        long[] jArr3 = (long[]) obj;
        ansz.j(jArr3, (long[]) asqeVar.a, (long[]) asqeVar.b);
        ansz.h(jArr, (long[]) ((asqe) ansyVar.b).b);
        asqe asqeVar2 = (asqe) ansyVar.b;
        Object obj2 = asqeVar2.b;
        long[] jArr4 = (long[]) obj2;
        ansz.j(jArr4, (long[]) asqeVar2.c, (long[]) asqeVar2.a);
        asqe asqeVar3 = (asqe) ansyVar.b;
        long[] jArr5 = (long[]) asqeVar3.c;
        ansz.i(jArr5, jArr5, (long[]) asqeVar3.a);
        asqe asqeVar4 = (asqe) ansyVar.b;
        ansz.i((long[]) asqeVar4.a, jArr, (long[]) asqeVar4.b);
        long[] jArr6 = (long[]) ((asqe) ansyVar.b).c;
        long[] jArr7 = (long[]) ansyVar.a;
        ansz.i(jArr7, jArr7, jArr6);
    }

    private static int l(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static void m(anss anssVar, int i, byte b2) {
        int i2 = (b2 & 255) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        anssVar.a(ansv.d[i][0], l(i4, 1));
        anssVar.a(ansv.d[i][1], l(i4, 2));
        anssVar.a(ansv.d[i][2], l(i4, 3));
        anssVar.a(ansv.d[i][3], l(i4, 4));
        anssVar.a(ansv.d[i][4], l(i4, 5));
        anssVar.a(ansv.d[i][5], l(i4, 6));
        anssVar.a(ansv.d[i][6], l(i4, 7));
        anssVar.a(ansv.d[i][7], l(i4, 8));
        long[] jArr = anssVar.c;
        long[] jArr2 = anssVar.a;
        long[] copyOf = Arrays.copyOf(anssVar.b, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        d(copyOf3, copyOf3);
        anssVar.a(new anss(copyOf, copyOf2, copyOf3), i2);
    }
}
