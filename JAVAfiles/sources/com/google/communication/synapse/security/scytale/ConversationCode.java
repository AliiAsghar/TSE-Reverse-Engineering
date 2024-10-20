package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ConversationCode {
    final String printableCode;
    final byte[] scannableCode;

    public ConversationCode(String str, byte[] bArr) {
        this.printableCode = str;
        this.scannableCode = bArr;
    }

    public String getPrintableCode() {
        return this.printableCode;
    }

    public byte[] getScannableCode() {
        return this.scannableCode;
    }

    public String toString() {
        return "ConversationCode{printableCode=" + this.printableCode + ",scannableCode=" + String.valueOf(this.scannableCode) + "}";
    }
}
