package com.google.android.rcs.client.messaging.data;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupNotification extends GroupNotification {
    public final Conversation a;
    public final Optional b;
    public final Optional c;

    public AutoValue_GroupNotification(Conversation conversation, Optional optional, Optional optional2) {
        this.a = conversation;
        this.b = optional;
        this.c = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupNotification
    public final Conversation a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupNotification
    public final Optional b() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupNotification
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupNotification) {
            GroupNotification groupNotification = (GroupNotification) obj;
            if (this.a.equals(groupNotification.a()) && this.b.equals(groupNotification.c()) && this.c.equals(groupNotification.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "GroupNotification{conversation=" + this.a.toString() + ", groupInformation=" + String.valueOf(optional2) + ", groupEvent=" + String.valueOf(optional) + "}";
    }
}
