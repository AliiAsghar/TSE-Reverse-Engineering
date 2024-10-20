package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SecureMessage {
    final byte[] cipherText;
    final String messageId;
    final SecureMessageType type;

    public SecureMessage(String str, SecureMessageType secureMessageType, byte[] bArr) {
        this.messageId = str;
        this.type = secureMessageType;
        this.cipherText = bArr;
    }

    public byte[] getCipherText() {
        return this.cipherText;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public SecureMessageType getType() {
        return this.type;
    }

    public String toString() {
        byte[] bArr = this.cipherText;
        return "SecureMessage{messageId=" + this.messageId + ",type=" + String.valueOf(this.type) + ",cipherText=" + String.valueOf(bArr) + "}";
    }
}
