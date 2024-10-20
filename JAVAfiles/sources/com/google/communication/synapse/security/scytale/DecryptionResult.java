package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class DecryptionResult {
    final byte[] decryptedMessage;
    final DecryptionResultStatus status;

    public DecryptionResult(byte[] bArr, DecryptionResultStatus decryptionResultStatus) {
        this.decryptedMessage = bArr;
        this.status = decryptionResultStatus;
    }

    public byte[] getDecryptedMessage() {
        return this.decryptedMessage;
    }

    public DecryptionResultStatus getStatus() {
        return this.status;
    }

    public String toString() {
        DecryptionResultStatus decryptionResultStatus = this.status;
        return "DecryptionResult{decryptedMessage=" + String.valueOf(this.decryptedMessage) + ",status=" + String.valueOf(decryptionResultStatus) + "}";
    }
}
