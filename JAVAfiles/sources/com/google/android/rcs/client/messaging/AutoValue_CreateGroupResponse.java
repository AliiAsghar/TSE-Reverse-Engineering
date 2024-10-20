package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_CreateGroupResponse extends CreateGroupResponse {
    private final MessagingResult a;

    public AutoValue_CreateGroupResponse(MessagingResult messagingResult) {
        this.a = messagingResult;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupResponse
    public final MessagingResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreateGroupResponse) {
            return this.a.equals(((CreateGroupResponse) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CreateGroupResponse{result=" + this.a.toString() + "}";
    }
}
