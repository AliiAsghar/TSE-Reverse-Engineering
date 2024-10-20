package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobv implements anve {
    private static final ThreadLocal a = new aobu();
    private final SecretKey b;
    private final byte[] c;
    private final byte[] d;

    public aobv(byte[] bArr) {
        aoci.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.b = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] s = anme.s(b.doFinal(new byte[16]));
        this.c = s;
        this.d = anme.s(s);
    }

    private static Cipher b() {
        if (anme.z(1)) {
            return (Cipher) a.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // defpackage.anve
    public final byte[] a(byte[] bArr, int i) {
        byte[] P;
        if (i <= 16) {
            SecretKey secretKey = this.b;
            Cipher b = b();
            int i2 = 1;
            b.init(1, secretKey);
            int length = bArr.length;
            if (length != 0) {
                i2 = 1 + ((length - 1) >> 4);
            }
            int i3 = i2 - 1;
            int i4 = i3 * 16;
            if (i2 * 16 == length) {
                P = aode.Q(bArr, i4, this.c, 16);
            } else {
                P = aode.P(anme.r(Arrays.copyOfRange(bArr, i4, length)), this.d);
            }
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            for (int i5 = 0; i5 < i3; i5++) {
                c(bArr2, bArr, i5 * 16, bArr3);
                if (b.doFinal(bArr3, 0, 16, bArr2) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            c(bArr2, P, 0, bArr3);
            if (b.doFinal(bArr3, 0, 16, bArr2) == 16) {
                if (i == 16) {
                    return bArr2;
                }
                return Arrays.copyOf(bArr2, i);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
