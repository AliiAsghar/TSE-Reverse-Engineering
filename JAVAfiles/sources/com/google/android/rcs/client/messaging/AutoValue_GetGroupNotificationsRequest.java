package com.google.android.rcs.client.messaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GetGroupNotificationsRequest extends GetGroupNotificationsRequest {
    private final int b;

    public AutoValue_GetGroupNotificationsRequest(int i) {
        this.b = i;
    }

    @Override // com.google.android.rcs.client.messaging.GetGroupNotificationsRequest
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof GetGroupNotificationsRequest) && this.b == ((GetGroupNotificationsRequest) obj).a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ 1000003;
    }

    public final String toString() {
        return "GetGroupNotificationsRequest{limit=" + this.b + "}";
    }
}
