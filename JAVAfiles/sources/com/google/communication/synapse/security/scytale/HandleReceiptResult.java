package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class HandleReceiptResult {
    final boolean receiptIsVerifiedFtd;

    public HandleReceiptResult(boolean z) {
        this.receiptIsVerifiedFtd = z;
    }

    public boolean getReceiptIsVerifiedFtd() {
        return this.receiptIsVerifiedFtd;
    }

    public String toString() {
        return "HandleReceiptResult{receiptIsVerifiedFtd=" + this.receiptIsVerifiedFtd + "}";
    }
}
