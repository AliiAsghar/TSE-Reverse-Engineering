package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ansn implements anmr {
    private final SecretKey a;

    public ansn(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.a = secretKey;
        if (secretKey != null) {
        } else {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    @Override // defpackage.anmr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            SecretKey secretKey = this.a;
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, length - 12);
        }
        throw new BadPaddingException("ciphertext too short");
    }

    @Override // defpackage.anmr
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            SecretKey secretKey = this.a;
            byte[] bArr3 = new byte[length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, length, bArr3, 12);
            byte[] iv = cipher.getIV();
            if (iv.length == 12) {
                System.arraycopy(iv, 0, bArr3, 0, 12);
                return bArr3;
            }
            throw new GeneralSecurityException("IV has unexpected length");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
