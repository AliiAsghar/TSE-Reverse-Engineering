package com.google.communication.synapse.security.scytale;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PrekeySet {
    final ArrayList<Prekey> prekeys;
    final Prekey signedPrekey;
    final int version;

    public PrekeySet(int i, ArrayList<Prekey> arrayList, Prekey prekey) {
        this.version = i;
        this.prekeys = arrayList;
        this.signedPrekey = prekey;
    }

    public ArrayList<Prekey> getPrekeys() {
        return this.prekeys;
    }

    public Prekey getSignedPrekey() {
        return this.signedPrekey;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        Prekey prekey = this.signedPrekey;
        return "PrekeySet{version=" + this.version + ",prekeys=" + String.valueOf(this.prekeys) + ",signedPrekey=" + String.valueOf(prekey) + "}";
    }
}
