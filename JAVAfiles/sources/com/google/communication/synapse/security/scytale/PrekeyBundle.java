package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PrekeyBundle {
    final String deviceId;
    final byte[] identityKey;
    final Prekey prekey;
    final Prekey signedPrekey;
    final String userId;
    final int version;

    public PrekeyBundle(int i, String str, String str2, Prekey prekey, Prekey prekey2, byte[] bArr) {
        this.version = i;
        this.userId = str;
        this.deviceId = str2;
        this.prekey = prekey;
        this.signedPrekey = prekey2;
        this.identityKey = bArr;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public byte[] getIdentityKey() {
        return this.identityKey;
    }

    public Prekey getPrekey() {
        return this.prekey;
    }

    public Prekey getSignedPrekey() {
        return this.signedPrekey;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        byte[] bArr = this.identityKey;
        Prekey prekey = this.signedPrekey;
        return "PrekeyBundle{version=" + this.version + ",userId=" + this.userId + ",deviceId=" + this.deviceId + ",prekey=" + String.valueOf(this.prekey) + ",signedPrekey=" + String.valueOf(prekey) + ",identityKey=" + String.valueOf(bArr) + "}";
    }
}
