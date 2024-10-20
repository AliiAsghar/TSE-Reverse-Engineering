package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_JoinGroupResponse extends JoinGroupResponse {
    private final MessagingResult a;

    public AutoValue_JoinGroupResponse(MessagingResult messagingResult) {
        this.a = messagingResult;
    }

    @Override // com.google.android.rcs.client.messaging.JoinGroupResponse
    public final MessagingResult a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JoinGroupResponse) {
            return this.a.equals(((JoinGroupResponse) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "JoinGroupResponse{result=" + this.a.toString() + "}";
    }
}
