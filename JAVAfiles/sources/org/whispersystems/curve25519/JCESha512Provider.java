package org.whispersystems.curve25519;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.whispersystems.curve25519.java.Sha512;

/* compiled from: PG */
/* loaded from: classes.dex */
public class JCESha512Provider implements Sha512 {
    @Override // org.whispersystems.curve25519.java.Sha512
    public void calculateDigest(byte[] bArr, byte[] bArr2, long j) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr2, 0, (int) j);
            byte[] digest = messageDigest.digest();
            System.arraycopy(digest, 0, bArr, 0, digest.length);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
