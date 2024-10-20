package com.google.android.rcs.client.messaging.data;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupRemoteCapabilities extends GroupRemoteCapabilities {
    public final boolean a;
    public final Optional b;
    public final Optional c;

    public AutoValue_GroupRemoteCapabilities(boolean z, Optional optional, Optional optional2) {
        this.a = z;
        this.b = optional;
        this.c = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities
    public final Optional a() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities
    public final Optional b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupRemoteCapabilities) {
            GroupRemoteCapabilities groupRemoteCapabilities = (GroupRemoteCapabilities) obj;
            if (this.a == groupRemoteCapabilities.c() && this.b.equals(groupRemoteCapabilities.b()) && this.c.equals(groupRemoteCapabilities.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "GroupRemoteCapabilities{supportsSubjectManagement=" + this.a + ", supportsRemoveParticipantByAll=" + String.valueOf(this.b) + ", supportsRemoveParticipantByAdmin=" + String.valueOf(optional) + "}";
    }
}
