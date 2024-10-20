package com.google.communication.synapse.security.scytale;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SenderTrustedInfo {
    final byte[] identityKey;
    final ArrayList<UserDevice> knownUserIdRepresentations;

    public SenderTrustedInfo(byte[] bArr, ArrayList<UserDevice> arrayList) {
        this.identityKey = bArr;
        this.knownUserIdRepresentations = arrayList;
    }

    public byte[] getIdentityKey() {
        return this.identityKey;
    }

    public ArrayList<UserDevice> getKnownUserIdRepresentations() {
        return this.knownUserIdRepresentations;
    }

    public String toString() {
        ArrayList<UserDevice> arrayList = this.knownUserIdRepresentations;
        return "SenderTrustedInfo{identityKey=" + String.valueOf(this.identityKey) + ",knownUserIdRepresentations=" + String.valueOf(arrayList) + "}";
    }
}
