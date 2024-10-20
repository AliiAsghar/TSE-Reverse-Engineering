package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anrs implements anry {
    @Override // defpackage.anry
    public final int a() {
        return 32;
    }

    @Override // defpackage.anry
    public final byte[] b() {
        return ansf.k;
    }

    @Override // defpackage.anry
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length == 32) {
            if (anme.i()) {
                if (anme.z(1)) {
                    if (anme.i()) {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
                        if (bArr3 != null) {
                            if (bArr2.length == 12) {
                                int length = bArr3.length;
                                if (length >= i + 16) {
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                    Cipher c = anpu.c();
                                    c.init(2, secretKeySpec, ivParameterSpec);
                                    return c.doFinal(bArr3, i, length - i);
                                }
                                throw new GeneralSecurityException("ciphertext too short");
                            }
                            throw new GeneralSecurityException("nonce length must be 12 bytes.");
                        }
                        throw new NullPointerException("ciphertext is null");
                    }
                    throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            return new anpz(bArr).b(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // defpackage.anry
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length == 32) {
            if (anme.i()) {
                if (anme.z(1)) {
                    if (anme.i()) {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
                        if (bArr3 != null) {
                            if (bArr2.length == 12) {
                                int i2 = Integer.MAX_VALUE - i;
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                Cipher c = anpu.c();
                                c.init(1, secretKeySpec, ivParameterSpec);
                                int length = bArr3.length;
                                int outputSize = c.getOutputSize(length);
                                if (outputSize <= i2) {
                                    byte[] bArr5 = new byte[i + outputSize];
                                    if (c.doFinal(bArr3, 0, length, bArr5, i) == outputSize) {
                                        return bArr5;
                                    }
                                    throw new GeneralSecurityException("not enough data written");
                                }
                                throw new GeneralSecurityException("plaintext too long");
                            }
                            throw new GeneralSecurityException("nonce length must be 12 bytes.");
                        }
                        throw new NullPointerException("plaintext is null");
                    }
                    throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            anpz anpzVar = new anpz(bArr);
            int length2 = bArr3.length;
            if (length2 <= 2147483631) {
                int i3 = Integer.MAX_VALUE - i;
                int i4 = length2 + 16;
                ByteBuffer allocate = ByteBuffer.allocate(i4);
                if (allocate.remaining() >= i4) {
                    int position = allocate.position();
                    anpy anpyVar = anpzVar.a;
                    if (allocate.remaining() >= length2) {
                        anpyVar.d(bArr2, allocate, ByteBuffer.wrap(bArr3));
                        allocate.position(position);
                        allocate.limit(allocate.limit() - 16);
                        byte[] h = anme.h(anpzVar.c(bArr2), anqa.d(bArr4, allocate));
                        allocate.limit(allocate.limit() + 16);
                        allocate.put(h);
                        byte[] array = allocate.array();
                        int length3 = array.length;
                        if (length3 <= i3) {
                            byte[] bArr6 = new byte[i + length3];
                            System.arraycopy(array, 0, bArr6, i, length3);
                            return bArr6;
                        }
                        throw new InvalidAlgorithmParameterException("Plaintext too long");
                    }
                    throw new IllegalArgumentException("Given ByteBuffer output is too small");
                }
                throw new IllegalArgumentException("Given ByteBuffer output is too small");
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
