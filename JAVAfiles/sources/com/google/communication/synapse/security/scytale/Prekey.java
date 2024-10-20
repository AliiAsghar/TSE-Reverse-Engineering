package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Prekey {
    final long id;
    final byte[] key;
    final byte[] signature;

    public Prekey(long j, byte[] bArr, byte[] bArr2) {
        this.id = j;
        this.key = bArr;
        this.signature = bArr2;
    }

    public long getId() {
        return this.id;
    }

    public byte[] getKey() {
        return this.key;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public String toString() {
        byte[] bArr = this.signature;
        return "Prekey{id=" + this.id + ",key=" + String.valueOf(this.key) + ",signature=" + String.valueOf(bArr) + "}";
    }
}
