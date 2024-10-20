package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MediaDecryptionParams {
    final byte[] digest;
    final byte[] keyMaterial;
    final int version;

    public MediaDecryptionParams(byte[] bArr, byte[] bArr2, int i) {
        this.keyMaterial = bArr;
        this.digest = bArr2;
        this.version = i;
    }

    public byte[] getDigest() {
        return this.digest;
    }

    public byte[] getKeyMaterial() {
        return this.keyMaterial;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        byte[] bArr = this.digest;
        return "MediaDecryptionParams{keyMaterial=" + String.valueOf(this.keyMaterial) + ",digest=" + String.valueOf(bArr) + ",version=" + this.version + "}";
    }
}
