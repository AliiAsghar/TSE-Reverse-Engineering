package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anrt implements anrv {
    private final int a;

    public anrt(anoe anoeVar) {
        int i = anoeVar.f;
        int i2 = anoeVar.g;
        if (anoeVar.h == anod.c) {
            this.a = anoeVar.e;
            return;
        }
        throw new GeneralSecurityException("invalid variant");
    }

    @Override // defpackage.anrv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.anrv
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr2.length;
        if (length >= i) {
            if (bArr.length == this.a) {
                SecretKey d = anpq.d(bArr);
                if (length >= i + 28) {
                    AlgorithmParameterSpec b = anpq.b(bArr2, i, 12);
                    Cipher c = anpq.c();
                    c.init(2, d, b);
                    return c.doFinal(bArr2, i + 12, (length - i) - 12);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            throw new GeneralSecurityException("invalid key size");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // defpackage.anrv
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == this.a) {
            SecretKey d = anpq.d(bArr);
            byte[] b = anud.b(12);
            AlgorithmParameterSpec a = anpq.a(b);
            Cipher c = anpq.c();
            c.init(1, d, a);
            int length = bArr4.length;
            int outputSize = c.getOutputSize(length);
            int length2 = bArr2.length;
            int length3 = bArr3.length;
            int i = length2 + length3;
            if (outputSize <= 2147483635 - i) {
                int i2 = i + 12;
                byte[] copyOf = Arrays.copyOf(bArr2, i2 + outputSize);
                System.arraycopy(bArr3, 0, copyOf, length2, length3);
                System.arraycopy(b, 0, copyOf, i, 12);
                if (c.doFinal(bArr4, 0, length, copyOf, i2) == outputSize) {
                    return copyOf;
                }
                throw new GeneralSecurityException("not enough data written");
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("invalid key size");
    }
}
