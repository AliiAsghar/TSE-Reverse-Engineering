package org.whispersystems.curve25519;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
public class JCESecureRandomProvider implements SecureRandomProvider {
    @Override // org.whispersystems.curve25519.SecureRandomProvider
    public void nextBytes(byte[] bArr) {
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // org.whispersystems.curve25519.SecureRandomProvider
    public int nextInt(int i) {
        try {
            return SecureRandom.getInstance("SHA1PRNG").nextInt(i);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
