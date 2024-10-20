package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocc implements annh {
    private final RSAPublicKey a;
    private final aobr b;
    private final aobr c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public aocc(RSAPublicKey rSAPublicKey, aobr aobrVar, aobr aobrVar2, int i, byte[] bArr, byte[] bArr2) {
        if (!anqi.a()) {
            aoci.d(aobrVar);
            if (aobrVar.equals(aobrVar2)) {
                aoci.b(rSAPublicKey.getModulus().bitLength());
                aoci.c(rSAPublicKey.getPublicExponent());
                this.a = rSAPublicKey;
                this.b = aobrVar;
                this.c = aobrVar2;
                this.d = i;
                this.e = bArr;
                this.f = bArr2;
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 == bArr.length) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] x = anme.x(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
                int bitLength3 = modulus.bitLength() - 1;
                aoci.d(this.b);
                MessageDigest messageDigest = (MessageDigest) aobo.d.a(aode.n(this.b));
                messageDigest.update(bArr2);
                byte[] bArr3 = this.f;
                if (bArr3.length != 0) {
                    messageDigest.update(bArr3);
                }
                byte[] digest = messageDigest.digest();
                int digestLength = messageDigest.getDigestLength();
                int length = x.length;
                if (length >= this.d + digestLength + 2) {
                    if (x[length - 1] == -68) {
                        int i = length - digestLength;
                        int i2 = i - 1;
                        byte[] copyOf = Arrays.copyOf(x, i2);
                        int length2 = copyOf.length;
                        byte[] copyOfRange = Arrays.copyOfRange(x, length2, length2 + digestLength);
                        int i3 = 0;
                        while (true) {
                            MessageDigest messageDigest2 = messageDigest;
                            byte[] bArr4 = digest;
                            byte[] bArr5 = copyOfRange;
                            int i4 = bitLength3;
                            long j = (length * 8) - bitLength3;
                            if (i3 < j) {
                                if (((copyOf[i3 / 8] >> (7 - (i3 % 8))) & 1) == 0) {
                                    i3++;
                                    messageDigest = messageDigest2;
                                    digest = bArr4;
                                    bitLength3 = i4;
                                    copyOfRange = bArr5;
                                } else {
                                    throw new GeneralSecurityException("inconsistent");
                                }
                            } else {
                                MessageDigest messageDigest3 = (MessageDigest) aobo.d.a(aode.n(this.c));
                                int digestLength2 = messageDigest3.getDigestLength();
                                byte[] bArr6 = new byte[i2];
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 <= (i - 2) / digestLength2) {
                                    messageDigest3.reset();
                                    messageDigest3.update(bArr5);
                                    messageDigest3.update(anme.x(BigInteger.valueOf(i5), 4));
                                    byte[] digest2 = messageDigest3.digest();
                                    int length3 = digest2.length;
                                    System.arraycopy(digest2, 0, bArr6, i6, Math.min(length3, i2 - i6));
                                    i6 += length3;
                                    i5++;
                                    messageDigest3 = messageDigest3;
                                }
                                byte[] bArr7 = new byte[i2];
                                for (int i7 = 0; i7 < i2; i7++) {
                                    bArr7[i7] = (byte) (bArr6[i7] ^ copyOf[i7]);
                                }
                                for (int i8 = 0; i8 <= j; i8++) {
                                    int i9 = i8 / 8;
                                    bArr7[i9] = (byte) ((~(1 << (7 - (i8 % 8)))) & bArr7[i9]);
                                }
                                int i10 = 0;
                                while (true) {
                                    int i11 = this.d;
                                    int i12 = (i - i11) - 2;
                                    if (i10 < i12) {
                                        if (bArr7[i10] == 0) {
                                            i10++;
                                        } else {
                                            throw new GeneralSecurityException("inconsistent");
                                        }
                                    } else {
                                        if (bArr7[i12] == 1) {
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr7, i2 - i11, i2);
                                            int i13 = digestLength + 8;
                                            byte[] bArr8 = new byte[this.d + i13];
                                            System.arraycopy(bArr4, 0, bArr8, 8, bArr4.length);
                                            System.arraycopy(copyOfRange2, 0, bArr8, i13, copyOfRange2.length);
                                            if (MessageDigest.isEqual(messageDigest2.digest(bArr8), bArr5)) {
                                                return;
                                            } else {
                                                throw new GeneralSecurityException("inconsistent");
                                            }
                                        }
                                        throw new GeneralSecurityException("inconsistent");
                                    }
                                }
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("inconsistent");
                    }
                } else {
                    throw new GeneralSecurityException("inconsistent");
                }
            } else {
                throw new GeneralSecurityException("signature out of range");
            }
        } else {
            throw new GeneralSecurityException("invalid signature's length");
        }
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.e;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else {
            if (anuk.e(bArr3, bArr)) {
                byte[] bArr4 = this.e;
                b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                return;
            }
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
    }
}
