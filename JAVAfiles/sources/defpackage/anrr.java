package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrr implements anry {
    private final int a;

    public anrr(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(a.bV(i, "Unsupported key length: "));
        }
        this.a = i;
    }

    @Override // defpackage.anry
    public final int a() {
        return this.a;
    }

    @Override // defpackage.anry
    public final byte[] b() {
        int i = this.a;
        if (i != 16) {
            if (i == 32) {
                return ansf.j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return ansf.i;
    }

    @Override // defpackage.anry
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.a) {
            if (anme.z(2)) {
                SecretKey d = anpq.d(bArr);
                if (bArr2.length == 12) {
                    int length2 = bArr3.length;
                    if (length2 >= i + 16) {
                        AlgorithmParameterSpec a = anpq.a(bArr2);
                        Cipher c = anpq.c();
                        c.init(2, d, a);
                        return c.doFinal(bArr3, i, length2 - i);
                    }
                    throw new GeneralSecurityException("ciphertext too short");
                }
                throw new GeneralSecurityException("iv is wrong size");
            }
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new InvalidAlgorithmParameterException(a.bV(length, "Unexpected key length: "));
    }

    @Override // defpackage.anry
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.a) {
            if (anme.z(2)) {
                SecretKey d = anpq.d(bArr);
                if (bArr2.length == 12) {
                    AlgorithmParameterSpec a = anpq.a(bArr2);
                    Cipher c = anpq.c();
                    c.init(1, d, a);
                    int length2 = bArr3.length;
                    int outputSize = c.getOutputSize(length2);
                    if (outputSize <= Integer.MAX_VALUE - i) {
                        byte[] bArr5 = new byte[i + outputSize];
                        if (c.doFinal(bArr3, 0, length2, bArr5, i) == outputSize) {
                            return bArr5;
                        }
                        throw new GeneralSecurityException("not enough data written");
                    }
                    throw new GeneralSecurityException("plaintext too long");
                }
                throw new GeneralSecurityException("iv is wrong size");
            }
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new InvalidAlgorithmParameterException(a.bV(length, "Unexpected key length: "));
    }
}
