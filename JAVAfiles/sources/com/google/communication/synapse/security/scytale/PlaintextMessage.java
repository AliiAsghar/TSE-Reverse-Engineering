package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PlaintextMessage {
    final String messageId;
    final byte[] plainText;

    public PlaintextMessage(String str, byte[] bArr) {
        this.messageId = str;
        this.plainText = bArr;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public byte[] getPlainText() {
        return this.plainText;
    }

    public String toString() {
        return "PlaintextMessage{messageId=" + this.messageId + ",plainText=" + String.valueOf(this.plainText) + "}";
    }
}
