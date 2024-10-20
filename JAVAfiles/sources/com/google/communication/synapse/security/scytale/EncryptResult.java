package com.google.communication.synapse.security.scytale;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EncryptResult {
    final SecureMessage encryptedData;
    final ArrayList<UserDevices> missingSessions;

    public EncryptResult(ArrayList<UserDevices> arrayList, SecureMessage secureMessage) {
        this.missingSessions = arrayList;
        this.encryptedData = secureMessage;
    }

    public SecureMessage getEncryptedData() {
        return this.encryptedData;
    }

    public ArrayList<UserDevices> getMissingSessions() {
        return this.missingSessions;
    }

    public String toString() {
        SecureMessage secureMessage = this.encryptedData;
        return "EncryptResult{missingSessions=" + String.valueOf(this.missingSessions) + ",encryptedData=" + String.valueOf(secureMessage) + "}";
    }
}
