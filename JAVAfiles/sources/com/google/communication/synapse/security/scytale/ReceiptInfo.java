package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ReceiptInfo {
    final ReceiptError error;
    final String messageId;
    final long messageTimestampUsec;
    final byte[] signature;

    public ReceiptInfo(String str, long j, ReceiptError receiptError, byte[] bArr) {
        this.messageId = str;
        this.messageTimestampUsec = j;
        this.error = receiptError;
        this.signature = bArr;
    }

    public ReceiptError getError() {
        return this.error;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public long getMessageTimestampUsec() {
        return this.messageTimestampUsec;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public String toString() {
        byte[] bArr = this.signature;
        return "ReceiptInfo{messageId=" + this.messageId + ",messageTimestampUsec=" + this.messageTimestampUsec + ",error=" + String.valueOf(this.error) + ",signature=" + String.valueOf(bArr) + "}";
    }
}
