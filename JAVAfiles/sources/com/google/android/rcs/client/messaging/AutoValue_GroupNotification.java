package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupNotification extends GroupNotification {
    private final Conversation a;
    private final GroupInformation b;

    public AutoValue_GroupNotification(Conversation conversation, GroupInformation groupInformation) {
        this.a = conversation;
        this.b = groupInformation;
    }

    @Override // com.google.android.rcs.client.messaging.GroupNotification
    public final Conversation a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GroupNotification
    public final GroupInformation b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupNotification) {
            GroupNotification groupNotification = (GroupNotification) obj;
            if (this.a.equals(groupNotification.a()) && this.b.equals(groupNotification.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        GroupInformation groupInformation = this.b;
        return "GroupNotification{conversation=" + this.a.toString() + ", groupInformation=" + groupInformation.toString() + "}";
    }
}
