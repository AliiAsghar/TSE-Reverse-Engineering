package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class RecreateFtdSessionResult {
    final String canReencryptMessageId;

    public RecreateFtdSessionResult(String str) {
        this.canReencryptMessageId = str;
    }

    public String getCanReencryptMessageId() {
        return this.canReencryptMessageId;
    }

    public String toString() {
        return "RecreateFtdSessionResult{canReencryptMessageId=" + this.canReencryptMessageId + "}";
    }
}
