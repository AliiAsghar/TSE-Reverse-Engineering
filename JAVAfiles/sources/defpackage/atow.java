package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.chromium.net.UploadDataProvider;
import org.json.JSONException;
import org.json.JSONObject;
import org.whispersystems.curve25519.Curve25519;
import org.whispersystems.curve25519.Curve25519KeyPair;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class atow {
    public atow() {
    }

    public static byte[] A(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static int B(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        return i2;
    }

    public static int C(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24) | ((bArr[i + 2] & 255) << 8);
    }

    public static int D(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static long E(byte[] bArr, int i) {
        int i2 = i + 4;
        return (D(bArr, i) & 4294967295L) | ((D(bArr, i2) & 4294967295L) << 32);
    }

    public static short F(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void G(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void H(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public static void I(long j, byte[] bArr, int i) {
        G((int) (j >>> 32), bArr, i);
        G((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void J(long j, byte[] bArr, int i) {
        H((int) (4294967295L & j), bArr, i);
        H((int) (j >>> 32), bArr, i + 4);
    }

    public static int K(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean L(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int M(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ bArr[length];
            } else {
                return i;
            }
        }
    }

    public static int N(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ iArr[length];
            } else {
                return i;
            }
        }
    }

    public static byte[] O(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] P(byte[][] bArr) {
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i += bArr[i2].length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 != bArr.length; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr[i4].length;
        }
        return bArr2;
    }

    public static byte[] Q(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return O(bArr2);
        }
        if (bArr2 == null) {
            return O(bArr);
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    public static byte[] R(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    public static byte[] S(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
            return bArr2;
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    public static short[] T(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static int U(int i) {
        int i2 = -1;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static int V(int i, int i2, int i3) {
        int W = W(i, i3);
        int W2 = W(i2, i3);
        int i4 = 0;
        if (W2 != 0) {
            int U = U(i3);
            while (W != 0) {
                if ((W & 1) == 1) {
                    i4 ^= W2;
                }
                W >>>= 1;
                W2 += W2;
                if (W2 >= (1 << U)) {
                    W2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int W(int i, int i2) {
        if (i2 != 0) {
            while (U(i) >= U(i2)) {
                i ^= i2 << (U(i) - U(i2));
            }
            return i;
        }
        System.err.println("Error: to be divided by 0");
        return 0;
    }

    public static int X(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static void Y(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public static boolean Z(int[] iArr, int[] iArr2) {
        boolean z;
        int length = iArr.length;
        if (length != iArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int i = length - 1; i >= 0; i--) {
            if (iArr[i] == iArr2[i]) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return z2;
    }

    public static short[][] aA(SecureRandom secureRandom, int i, int i2) {
        byte[] bArr = new byte[i * i2];
        secureRandom.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sArr[i4][i3] = (short) (bArr[(i3 * i) + i4] & 255);
            }
        }
        return sArr;
    }

    public static short[][][] aB(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = T(sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public static short[][][] aC(SecureRandom secureRandom, int i, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i4 = (((i2 + 1) * i2) >> 1) * i;
        } else {
            i4 = i * i2 * i3;
        }
        byte[] bArr = new byte[i4];
        secureRandom.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i3);
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i; i8++) {
                    if (!z || i6 <= i7) {
                        sArr[i8][i6][i7] = (short) (bArr[i5] & 255);
                        i5++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][] aD(short[][] sArr, short[][] sArr2) {
        int length;
        int length2 = sArr.length;
        if (length2 == sArr2.length && (length = sArr[0].length) == sArr2[0].length) {
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length);
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr[0].length; i2++) {
                    sArr3[i][i2] = asym.a(sArr[i][i2], sArr2[i][i2]);
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public static short[][] aE(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length == sArr2.length) {
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr2.length; i2++) {
                    for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                        short b = asym.b(sArr[i][i2], sArr2[i2][i3]);
                        short[] sArr4 = sArr3[i];
                        sArr4[i3] = asym.a(sArr4[i3], b);
                    }
                }
            }
            return sArr3;
        }
        throw new RuntimeException("Multiplication is not possible!");
    }

    public static short[][][] aF(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        int length;
        short[][] sArr4 = sArr2[0];
        int length2 = sArr4.length;
        short[][] sArr5 = sArr3[0];
        int length3 = sArr5.length;
        if (length2 == length3) {
            int length4 = sArr4[0].length;
            int length5 = sArr5[0].length;
            if (length4 == length5 && sArr2.length == sArr[0].length && (length = sArr3.length) == sArr.length) {
                short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, length, length3, length5);
                for (int i = 0; i < sArr2[0].length; i++) {
                    for (int i2 = 0; i2 < sArr2[0][0].length; i2++) {
                        for (int i3 = 0; i3 < sArr.length; i3++) {
                            for (int i4 = 0; i4 < sArr[0].length; i4++) {
                                short b = asym.b(sArr[i3][i4], sArr2[i4][i][i2]);
                                short[] sArr7 = sArr6[i3][i];
                                sArr7[i2] = asym.a(sArr7[i2], b);
                            }
                            short[] sArr8 = sArr6[i3][i];
                            sArr8[i2] = asym.a(sArr3[i3][i][i2], sArr8[i2]);
                        }
                    }
                }
                return sArr6;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public static short[][] aG(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i2][i] = sArr[i][i2];
            }
        }
        return sArr2;
    }

    public static short[][] aH(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return aD(sArr, aG(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public static void aI(byte[] bArr, assy assyVar) {
        assyVar.e(bArr, 0, bArr.length);
    }

    public static void aJ(short s, assy assyVar) {
        assyVar.d((byte) (s >>> 8));
        assyVar.d((byte) s);
    }

    public static void aK(int i, assy assyVar) {
        assyVar.d((byte) (i >> 24));
        assyVar.d((byte) (i >>> 16));
        assyVar.d((byte) (i >>> 8));
        assyVar.d((byte) i);
    }

    public static void aL(atdc atdcVar, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(atdcVar.s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static void aM(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static void aN(int i, ByteArrayOutputStream byteArrayOutputStream) {
        while (byteArrayOutputStream.size() < i) {
            byteArrayOutputStream.write(0);
        }
    }

    public static void aO(int i, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(i >> 24);
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public static void aP(long j, ByteArrayOutputStream byteArrayOutputStream) {
        aO((int) (j >>> 32), byteArrayOutputStream);
        aO((int) j, byteArrayOutputStream);
    }

    public static int[] aa(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public static ASN1ObjectIdentifier ab(String str) {
        if (str.equals("SHA-256")) {
            return NISTObjectIdentifiers.c;
        }
        if (str.equals("SHA-512")) {
            return NISTObjectIdentifiers.e;
        }
        if (str.equals("SHAKE128")) {
            return NISTObjectIdentifiers.m;
        }
        if (str.equals("SHAKE256")) {
            return NISTObjectIdentifiers.n;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }

    public static byte[] ac(astl astlVar, ASN1Set aSN1Set) {
        if (astlVar.a) {
            try {
                return as(astlVar, aSN1Set).u();
            } catch (Exception unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("public key found");
    }

    public static byte[] ad(astl astlVar) {
        if (!astlVar.a) {
            try {
                return ar(astlVar).u();
            } catch (Exception unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("private key found");
    }

    public static int ae(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    public static int af(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i != 0) {
                i2++;
            } else {
                return i2;
            }
        }
    }

    public static Object ag(byte[] bArr, Class cls) {
        atbh atbhVar = new atbh(cls, new ByteArrayInputStream(bArr));
        Object readObject = atbhVar.readObject();
        if (atbhVar.available() == 0) {
            if (cls.isInstance(readObject)) {
                return readObject;
            }
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        throw new IOException("unexpected data found at end of ObjectInputStream");
    }

    public static void ah(byte[] bArr, byte[] bArr2, int i) {
        if (i >= 0) {
            if (bArr2.length + i <= bArr.length) {
                for (int i2 = 0; i2 < bArr2.length; i2++) {
                    bArr[i + i2] = bArr2[i2];
                }
                return;
            }
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        throw new IllegalArgumentException("offset hast to be >= 0");
    }

    public static boolean ai(byte[][] bArr) {
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean aj(int i, long j) {
        if (j >= 0) {
            if (j < (1 << i)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static byte[] ak(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    public static byte[] al(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i + i2 <= bArr.length) {
                        byte[] bArr2 = new byte[i2];
                        for (int i3 = 0; i3 < i2; i3++) {
                            bArr2[i3] = bArr[i + i3];
                        }
                        return bArr2;
                    }
                    throw new IllegalArgumentException("offset + length must not be greater then size of source array");
                }
                throw new IllegalArgumentException("length hast to be >= 0");
            }
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        throw new NullPointerException("src == null");
    }

    public static byte[] am(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] an(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static byte[][] ao(byte[][] bArr) {
        if (!ai(bArr)) {
            byte[][] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr3 = new byte[bArr[i].length];
                bArr2[i] = bArr3;
                byte[] bArr4 = bArr[i];
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static long ap(byte[] bArr, int i) {
        if (bArr != null) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | (bArr[i2] & 255);
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    public static atba aq(atap atapVar, atba atbaVar, atba atbaVar2, atat atatVar) {
        if (atbaVar != null) {
            if (atbaVar2 != null) {
                if (atbaVar.a == atbaVar2.a) {
                    byte[] O = O(atapVar.c);
                    if (atatVar instanceof atam) {
                        atam atamVar = (atam) atatVar;
                        atan atanVar = new atan(null);
                        atanVar.e = atamVar.d;
                        atanVar.f = atamVar.e;
                        atanVar.b = atamVar.a;
                        atanVar.c = atamVar.b;
                        atanVar.a = atamVar.c;
                        atanVar.g = 0;
                        atatVar = new atam(atanVar);
                    } else if (atatVar instanceof atak) {
                        atak atakVar = (atak) atatVar;
                        ataj atajVar = new ataj();
                        atajVar.e = atakVar.d;
                        atajVar.f = atakVar.e;
                        atajVar.a = atakVar.a;
                        atajVar.b = atakVar.b;
                        atajVar.g = 0;
                        atatVar = new atak(atajVar);
                    }
                    byte[] a = atapVar.b.a(O, atatVar.a());
                    if (atatVar instanceof atam) {
                        atam atamVar2 = (atam) atatVar;
                        atan atanVar2 = new atan(null);
                        atanVar2.e = atamVar2.d;
                        atanVar2.f = atamVar2.e;
                        atanVar2.b = atamVar2.a;
                        atanVar2.c = atamVar2.b;
                        atanVar2.a = atamVar2.c;
                        atanVar2.g = 1;
                        atatVar = new atam(atanVar2);
                    } else if (atatVar instanceof atak) {
                        atak atakVar2 = (atak) atatVar;
                        ataj atajVar2 = new ataj();
                        atajVar2.e = atakVar2.d;
                        atajVar2.f = atakVar2.e;
                        atajVar2.a = atakVar2.a;
                        atajVar2.b = atakVar2.b;
                        atajVar2.g = 1;
                        atatVar = new atak(atajVar2);
                    }
                    byte[] a2 = atapVar.b.a(O, atatVar.a());
                    if (atatVar instanceof atam) {
                        atam atamVar3 = (atam) atatVar;
                        atan atanVar3 = new atan(null);
                        atanVar3.e = atamVar3.d;
                        atanVar3.f = atamVar3.e;
                        atanVar3.b = atamVar3.a;
                        atanVar3.c = atamVar3.b;
                        atanVar3.a = atamVar3.c;
                        atanVar3.g = 2;
                        atatVar = new atam(atanVar3);
                    } else if (atatVar instanceof atak) {
                        atak atakVar3 = (atak) atatVar;
                        ataj atajVar3 = new ataj();
                        atajVar3.e = atakVar3.d;
                        atajVar3.f = atakVar3.e;
                        atajVar3.a = atakVar3.a;
                        atajVar3.b = atakVar3.b;
                        atajVar3.g = 2;
                        atatVar = new atak(atajVar3);
                    }
                    byte[] a3 = atapVar.b.a(O, atatVar.a());
                    int i = atapVar.a.a;
                    int i2 = i + i;
                    byte[] bArr = new byte[i2];
                    for (int i3 = 0; i3 < i; i3++) {
                        bArr[i3] = (byte) (atbaVar.a()[i3] ^ a2[i3]);
                    }
                    for (int i4 = 0; i4 < i; i4++) {
                        bArr[i4 + i] = (byte) (atbaVar2.a()[i4] ^ a3[i4]);
                    }
                    atal atalVar = atapVar.b;
                    int length = a.length;
                    int i5 = atalVar.a;
                    if (length == i5) {
                        if (i2 == i5 + i5) {
                            return new atba(atbaVar.a, atalVar.b(1, a, bArr));
                        }
                        throw new IllegalArgumentException("wrong in length");
                    }
                    throw new IllegalArgumentException("wrong key length");
                }
                throw new IllegalStateException("height of both nodes must be equal");
            }
            throw new NullPointerException("right == null");
        }
        throw new NullPointerException("left == null");
    }

    public static SubjectPublicKeyInfo ar(astl astlVar) {
        byte[] ay;
        if (astlVar instanceof atct) {
            atct atctVar = (atct) astlVar;
            return new SubjectPublicKeyInfo(atac.s(atctVar.b), O(atctVar.c));
        }
        if (astlVar instanceof asyy) {
            asyy asyyVar = (asyy) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(asvp.d, new asvq(atac.t(asyyVar.b))), asyyVar.a());
        }
        if (astlVar instanceof asxv) {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(asvp.e), ((asxv) astlVar).a());
        }
        if (astlVar instanceof asxq) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            aO(1, byteArrayOutputStream);
            aL((asxq) astlVar, byteArrayOutputStream);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.D), new DEROctetString(byteArrayOutputStream.toByteArray()));
        }
        if (astlVar instanceof asxk) {
            asxk asxkVar = (asxk) astlVar;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            aO(asxkVar.b, byteArrayOutputStream2);
            aL(asxkVar.c, byteArrayOutputStream2);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.D), new DEROctetString(byteArrayOutputStream2.toByteArray()));
        }
        if (astlVar instanceof asze) {
            asze aszeVar = (asze) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.q(aszeVar.b)), aszeVar.a());
        }
        if (astlVar instanceof aswh) {
            aswh aswhVar = (aswh) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.j(aswhVar.b)), aswhVar.a());
        }
        if (astlVar instanceof atbg) {
            atbg atbgVar = (atbg) astlVar;
            byte[] ak = ak(atbgVar.e);
            byte[] ak2 = ak(atbgVar.d);
            byte[] a = atbgVar.a();
            if (a.length > ak.length + ak2.length) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(IsaraObjectIdentifiers.a), new DEROctetString(a));
            }
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(asvp.f, new asvt(atbgVar.c.c, atac.u(atbgVar.b))), new asvy(ak, ak2));
        }
        if (astlVar instanceof ataz) {
            ataz atazVar = (ataz) astlVar;
            byte[] a2 = atazVar.a();
            byte[] b = atazVar.b();
            byte[] c = atazVar.c();
            if (c.length > a2.length + b.length) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(IsaraObjectIdentifiers.b), new DEROctetString(c));
            }
            ataw atawVar = atazVar.c;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(asvp.g, new asvu(atawVar.d, atawVar.e, atac.u(atazVar.b))), new asvw(atazVar.a(), atazVar.b()));
        }
        if (astlVar instanceof atcr) {
            atcr atcrVar = (atcr) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(asvp.c), new asvo(atcrVar.c, atcrVar.d, atcrVar.e, atac.r(atcrVar.b)));
        }
        if (astlVar instanceof asxc) {
            asxc asxcVar = (asxc) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.g(asxcVar.b)), new DEROctetString(O(asxcVar.c)));
        }
        if (astlVar instanceof asyv) {
            asyv asyvVar = (asyv) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.o(asyvVar.b)), new DERSequence(new DEROctetString(O(asyvVar.c))));
        }
        if (astlVar instanceof asyl) {
            asyl asylVar = (asyl) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.m(asylVar.b)), new DEROctetString(asylVar.a()));
        }
        if (astlVar instanceof asxz) {
            asxz asxzVar = (asxz) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.k(asxzVar.b)), new DEROctetString(asxzVar.a()));
        }
        if (astlVar instanceof aswy) {
            aswy aswyVar = (aswy) astlVar;
            byte[] O = O(aswyVar.c);
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(atac.f(aswyVar.b));
            int length = O.length;
            byte[] bArr = new byte[length + 1];
            bArr[0] = (byte) aswyVar.b.d;
            System.arraycopy(O, 0, bArr, 1, length);
            return new SubjectPublicKeyInfo(algorithmIdentifier, bArr);
        }
        if (astlVar instanceof aswu) {
            aswu aswuVar = (aswu) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.i(aswuVar.b)), Q(aswuVar.c, aswuVar.d));
        }
        if (astlVar instanceof asyd) {
            asyd asydVar = (asyd) astlVar;
            byte[] bArr2 = new byte[asydVar.b.g];
            byte[] bArr3 = asydVar.c;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            byte[] bArr4 = asydVar.d;
            System.arraycopy(bArr4, 0, bArr2, asydVar.c.length, bArr4.length);
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.l(asydVar.b)), new DEROctetString(bArr2));
        }
        if (astlVar instanceof asyh) {
            asyh asyhVar = (asyh) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.p(asyhVar.b)), new DEROctetString(O(asyhVar.c)));
        }
        if (astlVar instanceof aswp) {
            aswp aswpVar = (aswp) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.e(aswpVar.b)), aswpVar.a());
        }
        if (astlVar instanceof aswc) {
            aswc aswcVar = (aswc) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.d(aswcVar.b)), aswcVar.a());
        }
        if (astlVar instanceof asxg) {
            asxg asxgVar = (asxg) astlVar;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.h(asxgVar.b)), asxgVar.a());
        }
        if (astlVar instanceof asyr) {
            asyr asyrVar = (asyr) astlVar;
            if (asyrVar.b.m != 1) {
                ay = Q(Q(Q(Q(Q(asyrVar.d, ay(asyrVar.e, false)), ay(asyrVar.f, true)), ay(asyrVar.g, false)), ay(asyrVar.h, true)), ay(asyrVar.i, true));
            } else {
                ay = ay(asyrVar.c, true);
            }
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(atac.n(asyrVar.b)), new DEROctetString(ay));
        }
        throw new IOException("key parameters not recognized");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static org.bouncycastle.asn1.pkcs.PrivateKeyInfo as(defpackage.astl r47, org.bouncycastle.asn1.ASN1Set r48) {
        /*
            Method dump skipped, instructions count: 3020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atow.as(astl, org.bouncycastle.asn1.ASN1Set):org.bouncycastle.asn1.pkcs.PrivateKeyInfo");
    }

    public static atba at(atap atapVar, atoi atoiVar, atam atamVar) {
        double d;
        int i = atapVar.a.b;
        byte[][] ao = ao((byte[][]) atoiVar.a);
        atba[] atbaVarArr = new atba[ao.length];
        for (int i2 = 0; i2 < ao.length; i2++) {
            atbaVarArr[i2] = new atba(0, ao[i2]);
        }
        atan atanVar = new atan(null);
        atanVar.e = atamVar.d;
        atanVar.f = atamVar.e;
        atanVar.b = atamVar.a;
        atanVar.c = 0;
        atanVar.a = atamVar.c;
        atanVar.g = atamVar.f;
        atam atamVar2 = new atam(atanVar);
        while (i > 1) {
            int i3 = 0;
            while (true) {
                d = i >> 1;
                if (i3 >= ((int) Math.floor(d))) {
                    break;
                }
                atan atanVar2 = new atan(null);
                atanVar2.e = atamVar2.d;
                atanVar2.f = atamVar2.e;
                atanVar2.b = atamVar2.a;
                atanVar2.c = atamVar2.b;
                atanVar2.a = i3;
                atanVar2.g = atamVar2.f;
                atamVar2 = new atam(atanVar2);
                int i4 = i3 + i3;
                atbaVarArr[i3] = aq(atapVar, atbaVarArr[i4], atbaVarArr[i4 + 1], atamVar2);
                i3++;
            }
            if ((i & 1) == 1) {
                atbaVarArr[(int) Math.floor(d)] = atbaVarArr[i - 1];
            }
            i = (int) Math.ceil(i / 2.0d);
            atan atanVar3 = new atan(null);
            atanVar3.e = atamVar2.d;
            atanVar3.f = atamVar2.e;
            atanVar3.b = atamVar2.a;
            atanVar3.c = atamVar2.b + 1;
            atanVar3.a = atamVar2.c;
            atanVar3.g = atamVar2.f;
            atamVar2 = new atam(atanVar3);
        }
        return atbaVarArr[0];
    }

    public static astl au(PrivateKeyInfo privateKeyInfo) {
        if (privateKeyInfo != null) {
            AlgorithmIdentifier algorithmIdentifier = privateKeyInfo.a;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = algorithmIdentifier.a;
            if (aSN1ObjectIdentifier.h(asvp.h)) {
                return new atcs(atac.a(algorithmIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
            }
            if (aSN1ObjectIdentifier.x(asvp.d)) {
                return new asyx(ASN1OctetString.f(privateKeyInfo.a()).c, atac.c(asvq.a(algorithmIdentifier.b)));
            }
            int i = 0;
            if (aSN1ObjectIdentifier.x(asvp.e)) {
                byte[] bArr = ASN1OctetString.f(privateKeyInfo.a()).c;
                int length = bArr.length >> 1;
                short[] sArr = new short[length];
                while (i != length) {
                    sArr[i] = F(bArr, i + i);
                    i++;
                }
                return new asxu(sArr);
            }
            if (aSN1ObjectIdentifier.x(PKCSObjectIdentifiers.D)) {
                byte[] bArr2 = ASN1OctetString.f(privateKeyInfo.a()).c;
                ASN1BitString aSN1BitString = privateKeyInfo.c;
                if (C(bArr2, 0) == 1) {
                    if (aSN1BitString != null) {
                        byte[] n = aSN1BitString.n();
                        byte[] S = S(bArr2, 4, bArr2.length);
                        byte[] S2 = S(n, 4, n.length);
                        asxp a = asxp.a(S);
                        a.b = asxq.a(S2);
                        return a;
                    }
                    return asxp.a(S(bArr2, 4, bArr2.length));
                }
                if (aSN1BitString != null) {
                    byte[] n2 = aSN1BitString.n();
                    asxj a2 = asxj.a(S(bArr2, 4, bArr2.length));
                    a2.c = asxk.a(n2);
                    return a2;
                }
                return asxj.a(S(bArr2, 4, bArr2.length));
            }
            asvr asvrVar = null;
            asvi asviVar = null;
            asvx asvxVar = null;
            asvv asvvVar = null;
            asvn asvnVar = null;
            asvk asvkVar = null;
            if (!aSN1ObjectIdentifier.h(BCObjectIdentifiers.n) && !aSN1ObjectIdentifier.h(BCObjectIdentifiers.Y)) {
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.al)) {
                    return new asyk(atac.G(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
                }
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.aT)) {
                    ASN1Encodable a3 = privateKeyInfo.a();
                    if (a3 != null) {
                        asviVar = new asvi(ASN1Sequence.j(a3));
                    }
                    return new aswg(atac.x(aSN1ObjectIdentifier), O(asviVar.a), O(asviVar.b), O(asviVar.c), O(asviVar.d), O(asviVar.e));
                }
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.be)) {
                    return new asxb(atac.B(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
                }
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.bl)) {
                    return new asyu(atac.I(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
                }
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.bF)) {
                    return new asxy(atac.D(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
                }
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.bK)) {
                    return new aswt(atac.z(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
                }
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.bS)) {
                    ASN1Sequence j = ASN1Sequence.j(privateKeyInfo.a());
                    return new asyc(atac.E(aSN1ObjectIdentifier), ASN1OctetString.f(j.h(0)).c, ASN1OctetString.f(j.h(1)).c, ASN1OctetString.f(j.h(2)).c, ASN1OctetString.f(j.h(3)).c);
                }
                if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.bZ)) {
                    ASN1Sequence j2 = ASN1Sequence.j(privateKeyInfo.a());
                    return new asyg(atac.F(aSN1ObjectIdentifier), ASN1OctetString.f(j2.h(0)).c, ASN1OctetString.f(j2.h(1)).c, ASN1OctetString.f(j2.h(2)).c, ASN1OctetString.f(j2.h(3)).c, ASN1OctetString.f(j2.h(4)).c);
                }
                if (!aSN1ObjectIdentifier.x(BCObjectIdentifiers.aC) && !aSN1ObjectIdentifier.x(BCObjectIdentifiers.aD) && !aSN1ObjectIdentifier.x(BCObjectIdentifiers.aE)) {
                    if (!aSN1ObjectIdentifier.x(BCObjectIdentifiers.aA) && !aSN1ObjectIdentifier.x(BCObjectIdentifiers.aB)) {
                        if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.cg)) {
                            byte[] bArr3 = ASN1OctetString.f(privateKeyInfo.a()).c;
                            aswa w = atac.w(aSN1ObjectIdentifier);
                            byte[] S3 = S(bArr3, 0, w.a());
                            int a4 = w.a();
                            int a5 = w.a();
                            byte[] S4 = S(bArr3, a4, a5 + a5);
                            int a6 = w.a();
                            return new aswb(w, S3, S4, S(bArr3, a6 + a6, bArr3.length));
                        }
                        if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.ck)) {
                            return new asxf(atac.C(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
                        }
                        if (aSN1ObjectIdentifier.h(BCObjectIdentifiers.aI)) {
                            return new asyq(atac.H(aSN1ObjectIdentifier), ASN1OctetString.f(privateKeyInfo.a()).c);
                        }
                        if (aSN1ObjectIdentifier.x(asvp.f)) {
                            asvt a7 = asvt.a(algorithmIdentifier.b);
                            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = a7.b.a;
                            ASN1Encodable a8 = privateKeyInfo.a();
                            if (a8 != null) {
                                asvxVar = new asvx(ASN1Sequence.j(a8));
                            }
                            try {
                                atbd atbdVar = new atbd(new atbc(a7.a, atac.v(aSN1ObjectIdentifier2)));
                                atbdVar.b = asvxVar.b;
                                atbdVar.d = ak(O(asvxVar.c));
                                atbdVar.e = ak(O(asvxVar.d));
                                atbdVar.f = ak(O(asvxVar.e));
                                atbdVar.g = ak(O(asvxVar.f));
                                if (asvxVar.a != 0) {
                                    atbdVar.c = asvxVar.g;
                                }
                                if (asvxVar.a() != null) {
                                    atbdVar.h = new atad((atad) ag(asvxVar.a(), atad.class), aSN1ObjectIdentifier2);
                                }
                                return new atbe(atbdVar);
                            } catch (ClassNotFoundException e) {
                                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e.getMessage())));
                            }
                        }
                        if (aSN1ObjectIdentifier.x(asvp.g)) {
                            asvu a9 = asvu.a(algorithmIdentifier.b);
                            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = a9.c.a;
                            try {
                                ASN1Encodable a10 = privateKeyInfo.a();
                                if (a10 != null) {
                                    asvvVar = new asvv(ASN1Sequence.j(a10));
                                }
                                atax ataxVar = new atax(new ataw(a9.a, a9.b, atac.v(aSN1ObjectIdentifier3)));
                                ataxVar.b = asvvVar.b;
                                ataxVar.d = ak(O(asvvVar.d));
                                ataxVar.e = ak(O(asvvVar.e));
                                ataxVar.f = ak(O(asvvVar.f));
                                ataxVar.g = ak(O(asvvVar.g));
                                if (asvvVar.a != 0) {
                                    ataxVar.c = asvvVar.c;
                                }
                                if (asvvVar.a() != null) {
                                    atae ataeVar = (atae) ag(asvvVar.a(), atae.class);
                                    atae ataeVar2 = new atae(ataeVar.b);
                                    for (Integer num : ataeVar.a.keySet()) {
                                        ataeVar2.a.put(num, new atad((atad) ataeVar.a.get(num), aSN1ObjectIdentifier3));
                                    }
                                    if (ataeVar2.b == 0) {
                                        ataxVar.h = new atae(ataeVar2, (1 << ataxVar.a.d) - 1);
                                    } else {
                                        ataxVar.h = ataeVar2;
                                    }
                                }
                                return new atay(ataxVar);
                            } catch (ClassNotFoundException e2) {
                                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e2.getMessage())));
                            }
                        }
                        if (aSN1ObjectIdentifier.x(asvp.c)) {
                            ASN1Encodable a11 = privateKeyInfo.a();
                            if (a11 != null) {
                                asvnVar = new asvn(ASN1Sequence.j(a11));
                            }
                            int i2 = asvnVar.a;
                            int i3 = asvnVar.b;
                            atcu a12 = asvnVar.a();
                            atcy atcyVar = new atcy(asvnVar.a(), asvnVar.c);
                            atcx atcxVar = new atcx(asvnVar.d);
                            String b = atac.b(asvnVar.e.a);
                            int i4 = a12.a;
                            int i5 = 1 << i4;
                            int c = atcyVar.c();
                            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, c, i5);
                            int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, c, i5);
                            int i6 = 0;
                            while (i6 < i5) {
                                int[] iArr3 = iArr2[i];
                                int[] iArr4 = atcyVar.c;
                                int i7 = atcyVar.b;
                                int i8 = iArr4[i7];
                                for (int i9 = i7 - 1; i9 >= 0; i9--) {
                                    i8 = atcyVar.a.b(i8, i6) ^ atcyVar.c[i9];
                                }
                                iArr3[i6] = a12.a(i8);
                                i6++;
                                i = 0;
                            }
                            for (int i10 = 1; i10 < c; i10++) {
                                for (int i11 = 0; i11 < i5; i11++) {
                                    iArr2[i10][i11] = a12.b(iArr2[i10 - 1][i11], i11);
                                }
                            }
                            for (int i12 = 0; i12 < c; i12++) {
                                for (int i13 = 0; i13 < i5; i13++) {
                                    int i14 = 0;
                                    while (i14 <= i12) {
                                        int[] iArr5 = iArr[i12];
                                        iArr5[i13] = iArr5[i13] ^ a12.b(iArr2[i14][i13], atcyVar.b((c + i14) - i12));
                                        i14++;
                                        iArr2 = iArr2;
                                    }
                                }
                            }
                            int i15 = 1;
                            int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, c * i4, (i5 + 31) >>> 5);
                            int i16 = 0;
                            while (i16 < i5) {
                                int i17 = i16 >>> 5;
                                int i18 = i15 << (i16 & 31);
                                int i19 = 0;
                                while (i19 < c) {
                                    int i20 = i19 + 1;
                                    int i21 = iArr[i19][i16];
                                    for (int i22 = 0; i22 < i4; i22++) {
                                        if (((i21 >>> i22) & 1) != 0) {
                                            int[] iArr7 = iArr6[((i20 * i4) - i22) - 1];
                                            iArr7[i17] = iArr7[i17] ^ i18;
                                        }
                                    }
                                    i19 = i20;
                                }
                                i16++;
                                i15 = 1;
                            }
                            new atcw(i5, iArr6);
                            return new atcq(i2, i3, a12, atcyVar, atcxVar, b);
                        }
                        throw new RuntimeException("algorithm identifier in private key not recognised");
                    }
                    ASN1Encodable a13 = privateKeyInfo.a();
                    if (a13 != null) {
                        asvkVar = new asvk(ASN1Sequence.j(a13));
                    }
                    return new aswx(atac.A(aSN1ObjectIdentifier), O(asvkVar.a), O(asvkVar.b), O(asvkVar.c), asvkVar.d.a);
                }
                ASN1Encodable a14 = privateKeyInfo.a();
                aswn y = atac.y(aSN1ObjectIdentifier);
                if (a14 instanceof ASN1Sequence) {
                    ASN1Sequence j3 = ASN1Sequence.j(a14);
                    int f = ASN1Integer.m(j3.h(0)).f();
                    if (f == 0) {
                        ASN1BitString aSN1BitString2 = privateKeyInfo.c;
                        if (aSN1BitString2 != null) {
                            return new aswo(y, ASN1BitString.i(j3.h(1)).n(), ASN1BitString.i(j3.h(2)).n(), ASN1BitString.i(j3.h(3)).n(), ASN1BitString.i(j3.h(4)).n(), ASN1BitString.i(j3.h(5)).n(), ASN1BitString.i(j3.h(6)).n(), aszh.b(y, aSN1BitString2).b());
                        }
                        return new aswo(y, ASN1BitString.i(j3.h(1)).n(), ASN1BitString.i(j3.h(2)).n(), ASN1BitString.i(j3.h(3)).n(), ASN1BitString.i(j3.h(4)).n(), ASN1BitString.i(j3.h(5)).n(), ASN1BitString.i(j3.h(6)).n(), null);
                    }
                    throw new IOException(a.bV(f, "unknown private key version: "));
                }
                if (a14 instanceof DEROctetString) {
                    byte[] bArr4 = ASN1OctetString.f(a14).c;
                    ASN1BitString aSN1BitString3 = privateKeyInfo.c;
                    if (aSN1BitString3 != null) {
                        return new aswo(y, bArr4, aszh.b(y, aSN1BitString3));
                    }
                    return new aswo(y, bArr4, null);
                }
                throw new IOException("not supported");
            }
            aszc J = atac.J(aSN1ObjectIdentifier);
            ASN1Encodable a15 = privateKeyInfo.a();
            if (a15 instanceof ASN1Sequence) {
                if (a15 != null) {
                    asvrVar = new asvr(ASN1Sequence.j(a15));
                }
                asvs asvsVar = asvrVar.c;
                return new aszd(J, O(asvrVar.a), O(asvrVar.b), asvsVar.b(), asvsVar.a());
            }
            return new aszd(J, ASN1OctetString.f(a15).c);
        }
        throw new IllegalArgumentException("keyInfo array null");
    }

    public static int av(short[][] sArr, byte[] bArr, int i) {
        int length = sArr[0].length;
        int i2 = 0;
        while (true) {
            int length2 = sArr.length;
            if (i2 < length) {
                for (int i3 = 0; i3 < length2; i3++) {
                    sArr[i3][i2] = (short) (bArr[(i2 * length2) + i + i3] & 255);
                }
                i2++;
            } else {
                return length2 * length;
            }
        }
    }

    public static int aw(short[][][] sArr, byte[] bArr, int i, boolean z) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        sArr3[i3][i4] = (short) (bArr[i2 + i] & 255);
                        i2++;
                    }
                }
            }
        }
        return i2;
    }

    public static byte[] ax(short[][] sArr) {
        int length = sArr[0].length;
        int length2 = sArr.length;
        byte[] bArr = new byte[length2 * length];
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                bArr[(i * length2) + i2] = (byte) sArr[i2][i];
            }
        }
        return bArr;
    }

    public static byte[] ay(short[][][] sArr, boolean z) {
        int i;
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        if (z) {
            i = (((length2 + 1) * length2) / 2) * length;
        } else {
            i = length * length2 * length3;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < length3; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        bArr[i2] = (byte) sArr3[i3][i4];
                        i2++;
                    }
                }
            }
        }
        return bArr;
    }

    public static short[][] az(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = T(sArr[i]);
        }
        return sArr2;
    }

    public static String c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < (bArr.length + 2) / 3; i++) {
            short[] sArr = new short[3];
            short[] sArr2 = new short[4];
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = (i * 3) + i2;
                if (i3 < bArr.length) {
                    sArr[i2] = (short) (bArr[i3] & 255);
                } else {
                    sArr[i2] = -1;
                }
            }
            short s = sArr[0];
            int i4 = (s & 3) << 4;
            sArr2[0] = (short) (s >> 2);
            short s2 = sArr[1];
            if (s2 == -1) {
                sArr2[1] = (short) i4;
            } else {
                sArr2[1] = (short) (i4 + (s2 >> 4));
            }
            short s3 = sArr[1];
            if (s3 == -1) {
                sArr2[3] = 64;
                sArr2[2] = 64;
            } else {
                int i5 = (s3 & 15) << 2;
                short s4 = sArr[2];
                if (s4 == -1) {
                    sArr2[2] = (short) i5;
                    sArr2[3] = 64;
                } else {
                    sArr2[2] = (short) (i5 + (s4 >> 6));
                    sArr2[3] = (short) (s4 & 63);
                }
            }
            for (int i6 = 0; i6 < 4; i6++) {
                byteArrayOutputStream.write("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(sArr2[i6]));
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public static String d(byte[] bArr, boolean z) {
        String c = c(bArr);
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < c.length()) {
            stringBuffer.append("\t");
            int i2 = i + 64;
            if (i2 >= c.length()) {
                stringBuffer.append(c.substring(i));
                if (z) {
                    stringBuffer.append(" )");
                }
            } else {
                stringBuffer.append(c.substring(i, i2));
                stringBuffer.append("\n");
            }
            i = i2;
        }
        return stringBuffer.toString();
    }

    public static void e(long j) {
        if (j <= 2147483647L) {
        } else {
            throw new atll(j);
        }
    }

    public static int f(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static int g(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static String h(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bArr[0] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[1] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[2] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[3] & 255);
        return stringBuffer.toString();
    }

    public static InetAddress i(InetAddress inetAddress, int i) {
        int i2;
        int f = f(g(inetAddress)) * 8;
        if (i <= f) {
            if (i == f) {
                return inetAddress;
            }
            byte[] address = inetAddress.getAddress();
            int i3 = i >> 3;
            int i4 = i3 + 1;
            while (true) {
                if (i4 >= address.length) {
                    break;
                }
                address[i4] = 0;
                i4++;
            }
            int i5 = 0;
            for (i2 = 0; i2 < (i & 7); i2++) {
                i5 |= 1 << (7 - i2);
            }
            address[i3] = (byte) (address[i3] & i5);
            try {
                return InetAddress.getByAddress(address);
            } catch (UnknownHostException unused) {
                throw new IllegalArgumentException("invalid address");
            }
        }
        throw new IllegalArgumentException("invalid mask length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0104, code lost:
    
        if (r7 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0106, code lost:
    
        r13 = (16 - r6) + r7;
        java.lang.System.arraycopy(r5, r7, r5, r13, r6 - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010d, code lost:
    
        if (r7 >= r13) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x010f, code lost:
    
        r5[r7] = 0;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0115, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ff, code lost:
    
        if (r6 >= 16) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0101, code lost:
    
        if (r7 >= 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] j(java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atow.j(java.lang.String, int):byte[]");
    }

    public static InetAddress[] k(String str) {
        InetAddress e;
        InetAddress byAddress;
        try {
            try {
                byte[] j = j(str, 1);
                if (j != null) {
                    byAddress = InetAddress.getByAddress(str, j);
                } else {
                    byte[] j2 = j(str, 2);
                    if (j2 != null) {
                        byAddress = InetAddress.getByAddress(str, j2);
                    } else {
                        StringBuffer stringBuffer = new StringBuffer("Invalid address: ");
                        stringBuffer.append(str);
                        throw new UnknownHostException(stringBuffer.toString());
                    }
                }
                return new InetAddress[]{byAddress};
            } catch (atns unused) {
                throw new UnknownHostException("invalid name");
            }
        } catch (UnknownHostException unused2) {
            atlr atlrVar = new atlr(str, 1);
            atmx[] e2 = atlrVar.e();
            if (e2 == null) {
                if (atlrVar.a() != 4 || (e2 = new atlr(str, 28).e()) == null) {
                    throw new UnknownHostException("unknown host");
                }
            } else {
                atmx[] e3 = new atlr(str, 28).e();
                if (e3 != null) {
                    int length = e2.length;
                    int length2 = e3.length;
                    atmx[] atmxVarArr = new atmx[length + length2];
                    System.arraycopy(e2, 0, atmxVarArr, 0, length);
                    System.arraycopy(e3, 0, atmxVarArr, length, length2);
                    e2 = atmxVarArr;
                }
            }
            InetAddress[] inetAddressArr = new InetAddress[e2.length];
            for (int i = 0; i < e2.length; i++) {
                atmx atmxVar = e2[i];
                if (atmxVar instanceof atka) {
                    e = ((atka) atmxVar).e();
                } else {
                    e = ((atjw) atmxVar).e();
                }
                inetAddressArr[i] = InetAddress.getByAddress(str, e.getAddress());
            }
            return inetAddressArr;
        }
    }

    public static atju l(byte[] bArr) {
        int i = bArr[0] & 255;
        if (i == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new atju(bArr2);
        }
        throw new atjt(a.bV(i, "Bad key type: "));
    }

    public static long m(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
                    j = 1800000;
                } else {
                    return dataInput.readLong();
                }
            } else {
                readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
                j = 1000;
            }
        } else {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        }
        return readUnsignedByte * j;
    }

    public static atgc n(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 67) {
            if (readUnsignedByte != 70) {
                if (readUnsignedByte == 80) {
                    return atjl.n(dataInput, str);
                }
                throw new IOException("Invalid encoding");
            }
            atjo atjoVar = new atjo(str, dataInput.readUTF(), (int) m(dataInput), (int) m(dataInput));
            if (atjoVar.equals(atgc.a)) {
                return atgc.a;
            }
            return atjoVar;
        }
        return new atji(atjl.n(dataInput, str));
    }

    public static int o(long j) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException(a.ck(j, "Value cannot fit in an int: "));
    }

    public static long p(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException(a.cs(j2, j, "The calculation caused an overflow: ", " + "));
        }
        return j3;
    }

    public static void q(atfw atfwVar, int i, int i2, int i3) {
        if (i >= i2 && i <= i3) {
        } else {
            throw new atgg(atfwVar.p(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static void s(long j, String str) {
        if (j >= 0) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean t(double d, int i, int i2) {
        if (d >= i && d < i2) {
            return true;
        }
        return false;
    }

    public static int u(int i) {
        return i - 1;
    }

    public static int v(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        if (bool.booleanValue()) {
            return 2;
        }
        return 3;
    }

    public static void w(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
        } else {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static asmb x() {
        Curve25519KeyPair generateKeyPair = Curve25519.getInstance(Curve25519.BEST).generateKeyPair();
        return new asmb(new atju(generateKeyPair.getPublicKey()), new atoi(generateKeyPair.getPrivateKey()));
    }

    public static UploadDataProvider y(byte[] bArr, int i, int i2) {
        return new atdy(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static JSONObject z(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            try {
                jSONObject.put(str, optJSONObject);
            } catch (JSONException e) {
                throw new IllegalArgumentException(a.bW(str, "Failed adding a default object for key [", "]"), e);
            }
        }
        return optJSONObject;
    }

    public atox a(Type type, Annotation[] annotationArr, atqq atqqVar) {
        throw null;
    }

    public atox b(Type type) {
        return null;
    }

    public atow(byte[] bArr) {
    }

    public atow(short[] sArr, byte[] bArr) {
        new asti(128);
        new asti(256);
        new astg(256);
        new astg(512);
    }

    public atow(boolean z) {
        if (z) {
            new atow(null, null, null);
        } else {
            new atow((char[]) null, (byte[]) null);
        }
    }

    public atow(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        new aste();
        new asth();
        byte[] bArr4 = astk.a;
        assw.a();
    }

    public atow(char[] cArr, byte[] bArr) {
        new asti(128);
        new astg(256);
        new astg(512);
    }
}
