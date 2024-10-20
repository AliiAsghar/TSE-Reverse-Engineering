package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggl {
    static final byte[] a = {112, 114, 111, 0};
    static final byte[] b = {112, 114, 109, 0};

    public static int a(int i) {
        return (i + 7) & (-8);
    }

    public static String b(String str, String str2, byte[] bArr) {
        String a2 = ggo.a(bArr);
        if (str.length() <= 0) {
            return i(str2, a2);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + ggo.a(bArr) + str2;
        }
        return i(str2, a2);
    }

    public static void c(OutputStream outputStream, ggf ggfVar) {
        int[] iArr = ggfVar.h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            Integer valueOf = Integer.valueOf(i3);
            valueOf.getClass();
            nq.L(outputStream, i3 - i2);
            valueOf.getClass();
            i++;
            i2 = i3;
        }
    }

    public static void d(OutputStream outputStream, ggf ggfVar) {
        int i = 0;
        for (Map.Entry entry : ggfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                nq.L(outputStream, intValue - i);
                nq.L(outputStream, 0);
                i = intValue;
            }
        }
    }

    public static byte[] e(ggf[] ggfVarArr, byte[] bArr) {
        int length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = ggfVarArr.length;
            if (i2 >= length) {
                break;
            }
            ggf ggfVar = ggfVarArr[i2];
            int E = nq.E(b(ggfVar.a, ggfVar.b, bArr)) + 16;
            int i4 = ggfVar.e;
            i3 += E + i4 + i4 + ggfVar.f + h(ggfVar.g);
            i2++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, ggo.c)) {
            while (i < length) {
                ggf ggfVar2 = ggfVarArr[i];
                l(byteArrayOutputStream, ggfVar2, b(ggfVar2.a, ggfVar2.b, bArr));
                k(byteArrayOutputStream, ggfVar2);
                i++;
            }
        } else {
            for (ggf ggfVar3 : ggfVarArr) {
                l(byteArrayOutputStream, ggfVar3, b(ggfVar3.a, ggfVar3.b, bArr));
            }
            int length2 = ggfVarArr.length;
            while (i < length2) {
                k(byteArrayOutputStream, ggfVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] f(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, nq.P(inputStream, 4))) {
            int i = ggo.h;
            return nq.P(inputStream, 4);
        }
        throw new IllegalStateException("Invalid magic");
    }

    public static int[] g(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += nq.C(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    private static int h(int i) {
        return a(i + i) / 8;
    }

    private static String i(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    private static void j(byte[] bArr, int i, int i2, ggf ggfVar) {
        int i3 = ggfVar.g;
        if (i != 2) {
            if (i == 4) {
                i2 += i3;
            } else {
                throw new IllegalStateException(a.bV(i, "Unexpected flag: "));
            }
        }
        int i4 = i2 / 8;
        bArr[i4] = (byte) ((1 << (i2 % 8)) | bArr[i4]);
    }

    private static void k(OutputStream outputStream, ggf ggfVar) {
        d(outputStream, ggfVar);
        c(outputStream, ggfVar);
        byte[] bArr = new byte[h(ggfVar.g)];
        for (Map.Entry entry : ggfVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                j(bArr, 2, intValue, ggfVar);
            }
            if ((intValue2 & 4) != 0) {
                j(bArr, 4, intValue, ggfVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void l(OutputStream outputStream, ggf ggfVar, String str) {
        nq.L(outputStream, nq.E(str));
        nq.L(outputStream, ggfVar.e);
        nq.M(outputStream, ggfVar.f);
        nq.M(outputStream, ggfVar.c);
        nq.M(outputStream, ggfVar.g);
        nq.J(outputStream, str);
    }
}
