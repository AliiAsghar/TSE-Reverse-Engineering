package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansv {
    public static final long[] a;
    static final long[] b;
    public static final long[] c;
    static final anss[][] d;
    public static final anss[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        i = modPow;
        aqrk aqrkVar = new aqrk((byte[]) null);
        aqrkVar.a = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        BigInteger bigInteger = (BigInteger) aqrkVar.a;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        aqrkVar.b = modPow2;
        a = ansz.l(a(mod));
        b = ansz.l(a(mod2));
        c = ansz.l(a(modPow));
        d = (anss[][]) Array.newInstance((Class<?>) anss.class, 32, 8);
        aqrk aqrkVar2 = aqrkVar;
        for (int i2 = 0; i2 < 32; i2++) {
            aqrk aqrkVar3 = aqrkVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = b(aqrkVar3);
                aqrkVar3 = c(aqrkVar3, aqrkVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                aqrkVar2 = c(aqrkVar2, aqrkVar2);
            }
        }
        aqrk c2 = c(aqrkVar, aqrkVar);
        e = new anss[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = b(aqrkVar);
            aqrkVar = c(aqrkVar, c2);
        }
    }

    private static byte[] a(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }

    private static anss b(aqrk aqrkVar) {
        BigInteger add = ((BigInteger) aqrkVar.a).add((BigInteger) aqrkVar.b);
        BigInteger bigInteger = f;
        return new anss(ansz.l(a(add.mod(bigInteger))), ansz.l(a(((BigInteger) aqrkVar.a).subtract((BigInteger) aqrkVar.b).mod(bigInteger))), ansz.l(a(h.multiply((BigInteger) aqrkVar.b).multiply((BigInteger) aqrkVar.a).mod(bigInteger))));
    }

    private static aqrk c(aqrk aqrkVar, aqrk aqrkVar2) {
        aqrk aqrkVar3 = new aqrk((byte[]) null);
        BigInteger multiply = g.multiply(((BigInteger) aqrkVar.b).multiply((BigInteger) aqrkVar2.b).multiply((BigInteger) aqrkVar.a).multiply((BigInteger) aqrkVar2.a));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        aqrkVar3.b = ((BigInteger) aqrkVar.b).multiply((BigInteger) aqrkVar2.a).add(((BigInteger) aqrkVar2.b).multiply((BigInteger) aqrkVar.a)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        aqrkVar3.a = ((BigInteger) aqrkVar.a).multiply((BigInteger) aqrkVar2.a).add(((BigInteger) aqrkVar.b).multiply((BigInteger) aqrkVar2.b)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return aqrkVar3;
    }
}
