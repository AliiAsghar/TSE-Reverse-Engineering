package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anru implements anrv {
    private final int a;
    private final /* synthetic */ int b;
    private final anme c;

    public anru(annu annuVar, int i) {
        this.b = i;
        this.c = annuVar;
        this.a = annuVar.e + annuVar.f;
    }

    private final anmt d(byte[] bArr) {
        return aobb.a(anme.B((anqm) this.c, aojh.A(bArr), null));
    }

    private final anmr e(byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, ((annu) this.c).e);
        annu annuVar = (annu) this.c;
        int i = annuVar.f;
        int i2 = annuVar.e;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i + i2);
        return aobl.c(anme.n((annu) this.c, aojh.A(copyOf), aojh.A(copyOfRange), null));
    }

    @Override // defpackage.anrv
    public final int a() {
        if (this.b != 0) {
            return this.a;
        }
        return this.a;
    }

    @Override // defpackage.anrv
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) {
        if (this.b != 0) {
            int length = bArr2.length;
            if (length >= i) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, length);
                aobl aoblVar = (aobl) e(bArr);
                byte[] bArr3 = aoblVar.d;
                int i2 = aoblVar.c;
                int length2 = copyOfRange.length;
                if (length2 >= i2 + bArr3.length) {
                    if (anuk.e(bArr3, copyOfRange)) {
                        byte[] copyOfRange2 = Arrays.copyOfRange(copyOfRange, aoblVar.d.length, length2 - aoblVar.c);
                        byte[] copyOfRange3 = Arrays.copyOfRange(copyOfRange, length2 - aoblVar.c, length2);
                        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8);
                        if (MessageDigest.isEqual(((aoby) aoblVar.b).a(aode.O(anrw.a, copyOfRange2, copyOf)), copyOfRange3)) {
                            aobs aobsVar = aoblVar.a;
                            int length3 = copyOfRange2.length;
                            aoas aoasVar = (aoas) aobsVar;
                            int i3 = aoasVar.a;
                            if (length3 >= i3) {
                                byte[] bArr4 = new byte[i3];
                                System.arraycopy(copyOfRange2, 0, bArr4, 0, i3);
                                int i4 = aoasVar.a;
                                int i5 = length3 - i4;
                                byte[] bArr5 = new byte[i5];
                                aoasVar.a(copyOfRange2, i4, i5, bArr5, 0, bArr4, false);
                                return bArr5;
                            }
                            throw new GeneralSecurityException("ciphertext too short");
                        }
                        throw new GeneralSecurityException("invalid MAC");
                    }
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        int length4 = bArr2.length;
        if (length4 >= i) {
            byte[] copyOfRange4 = Arrays.copyOfRange(bArr2, i, length4);
            anmt d = d(bArr);
            int length5 = copyOfRange4.length;
            aobb aobbVar = (aobb) d;
            byte[] bArr6 = aobbVar.c;
            if (length5 >= bArr6.length + 16) {
                if (anuk.e(bArr6, copyOfRange4)) {
                    Cipher cipher = (Cipher) aobb.a.get();
                    int length6 = aobbVar.c.length;
                    byte[] copyOfRange5 = Arrays.copyOfRange(copyOfRange4, length6, length6 + 16);
                    byte[] bArr7 = (byte[]) copyOfRange5.clone();
                    bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
                    bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
                    cipher.init(2, new SecretKeySpec(aobbVar.b, "AES"), new IvParameterSpec(bArr7));
                    int length7 = aobbVar.c.length + 16;
                    int i6 = length5 - length7;
                    byte[] doFinal = cipher.doFinal(copyOfRange4, length7, i6);
                    if (i6 == 0 && doFinal == null && aode.q()) {
                        doFinal = new byte[0];
                    }
                    if (MessageDigest.isEqual(copyOfRange5, aobbVar.b(anrw.a, doFinal))) {
                        return doFinal;
                    }
                    throw new AEADBadTagException("Integrity check failed.");
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // defpackage.anrv
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (this.b != 0) {
            aobl aoblVar = (aobl) e(bArr);
            aoas aoasVar = (aoas) aoblVar.a;
            int i = aoasVar.a;
            int length = bArr4.length;
            int i2 = Integer.MAX_VALUE - i;
            if (length <= i2) {
                byte[] bArr5 = new byte[i + length];
                byte[] b = anud.b(i);
                System.arraycopy(b, 0, bArr5, 0, aoasVar.a);
                aoasVar.a(bArr4, 0, length, bArr5, aoasVar.a, b, true);
                return aode.O(bArr2, bArr3, aode.O(aoblVar.d, bArr5, aoblVar.b.a(aode.O(anrw.a, bArr5, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)))));
            }
            throw new GeneralSecurityException(a.bV(i2, "plaintext length can not exceed "));
        }
        aobb aobbVar = (aobb) d(bArr);
        byte[] bArr6 = aobbVar.c;
        int length2 = bArr4.length;
        if (length2 <= 2147483631 - bArr6.length) {
            Cipher cipher = (Cipher) aobb.a.get();
            byte[] b2 = aobbVar.b(anrw.a, bArr4);
            byte[] bArr7 = (byte[]) b2.clone();
            bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
            bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(aobbVar.b, "AES"), new IvParameterSpec(bArr7));
            byte[] bArr8 = aobbVar.c;
            int length3 = b2.length;
            int length4 = bArr8.length;
            byte[] copyOf = Arrays.copyOf(bArr8, length4 + length3 + length2);
            System.arraycopy(b2, 0, copyOf, length4, length3);
            if (cipher.doFinal(bArr4, 0, length2, copyOf, length3 + aobbVar.c.length) == length2) {
                return aode.O(bArr2, bArr3, copyOf);
            }
            throw new GeneralSecurityException("not enough data written");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public anru(anqm anqmVar, int i) {
        this.b = i;
        this.c = anqmVar;
        this.a = anqmVar.e;
    }
}
