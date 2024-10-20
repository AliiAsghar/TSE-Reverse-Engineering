package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class DecryptResult {
    final byte[] decryptedMessage;
    final ReceiptInfo receipt;
    final DecryptState status;

    public DecryptResult(DecryptState decryptState, byte[] bArr, ReceiptInfo receiptInfo) {
        this.status = decryptState;
        this.decryptedMessage = bArr;
        this.receipt = receiptInfo;
    }

    public byte[] getDecryptedMessage() {
        return this.decryptedMessage;
    }

    public ReceiptInfo getReceipt() {
        return this.receipt;
    }

    public DecryptState getStatus() {
        return this.status;
    }

    public String toString() {
        ReceiptInfo receiptInfo = this.receipt;
        byte[] bArr = this.decryptedMessage;
        return "DecryptResult{status=" + String.valueOf(this.status) + ",decryptedMessage=" + String.valueOf(bArr) + ",receipt=" + String.valueOf(receiptInfo) + "}";
    }
}
