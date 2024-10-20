package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoas implements aobs {
    private static final ThreadLocal b = new aoar();
    public final int a;
    private final SecretKeySpec c;
    private final int d;

    public aoas(byte[] bArr, int i) {
        if (anme.z(2)) {
            aoci.a(bArr.length);
            this.c = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) b.get()).getBlockSize();
            this.d = blockSize;
            if (i <= blockSize) {
                this.a = i;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) b.get();
        int i4 = this.a;
        byte[] bArr4 = new byte[this.d];
        System.arraycopy(bArr3, 0, bArr4, 0, i4);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.c, ivParameterSpec);
        } else {
            cipher.init(2, this.c, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
        } else {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
