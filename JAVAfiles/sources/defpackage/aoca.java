package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoca implements annh {
    private final RSAPublicKey a;
    private final aobr b;
    private final byte[] c;
    private final byte[] d;

    public aoca(RSAPublicKey rSAPublicKey, aobr aobrVar, byte[] bArr, byte[] bArr2) {
        if (!anqi.a()) {
            aoci.d(aobrVar);
            aoci.b(rSAPublicKey.getModulus().bitLength());
            aoci.c(rSAPublicKey.getPublicExponent());
            this.a = rSAPublicKey;
            this.b = aobrVar;
            this.c = bArr;
            this.d = bArr2;
            return;
        }
        throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        byte[] u;
        int i;
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] x = anme.x(bigInteger.modPow(publicExponent, modulus), bitLength);
                aobr aobrVar = this.b;
                aoci.d(aobrVar);
                MessageDigest messageDigest = (MessageDigest) aobo.d.a(aode.n(this.b));
                messageDigest.update(bArr2);
                byte[] bArr3 = this.d;
                if (bArr3.length != 0) {
                    messageDigest.update(bArr3);
                }
                byte[] digest = messageDigest.digest();
                int ordinal = aobrVar.ordinal();
                int i2 = 2;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            u = aode.u("3051300d060960864801650304020305000440");
                        } else {
                            throw new GeneralSecurityException("Unsupported hash ".concat(aobrVar.toString()));
                        }
                    } else {
                        u = aode.u("3041300d060960864801650304020205000430");
                    }
                } else {
                    u = aode.u("3031300d060960864801650304020105000420");
                }
                if (bitLength >= u.length + digest.length + 11) {
                    byte[] bArr4 = new byte[bitLength];
                    bArr4[0] = 0;
                    bArr4[1] = 1;
                    int i3 = 0;
                    while (true) {
                        i = i2 + 1;
                        if (i3 >= (bitLength - r5) - 3) {
                            break;
                        }
                        bArr4[i2] = -1;
                        i3++;
                        i2 = i;
                    }
                    bArr4[i2] = 0;
                    int length = u.length;
                    System.arraycopy(u, 0, bArr4, i, length);
                    System.arraycopy(digest, 0, bArr4, i + length, digest.length);
                    if (MessageDigest.isEqual(x, bArr4)) {
                        return;
                    } else {
                        throw new GeneralSecurityException("invalid signature");
                    }
                }
                throw new GeneralSecurityException("intended encoded message length too short");
            }
            throw new GeneralSecurityException("signature out of range");
        }
        throw new GeneralSecurityException("invalid signature's length");
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.c;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else {
            if (anuk.e(bArr3, bArr)) {
                byte[] bArr4 = this.c;
                b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                return;
            }
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
    }
}
