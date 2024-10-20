package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class KeyPair {
    final byte[] privateKey;
    final byte[] publicKey;

    public KeyPair(byte[] bArr, byte[] bArr2) {
        this.publicKey = bArr;
        this.privateKey = bArr2;
    }

    public byte[] getPrivateKey() {
        return this.privateKey;
    }

    public byte[] getPublicKey() {
        return this.publicKey;
    }

    public String toString() {
        byte[] bArr = this.privateKey;
        return "KeyPair{publicKey=" + String.valueOf(this.publicKey) + ",privateKey=" + String.valueOf(bArr) + "}";
    }
}
