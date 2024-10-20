package com.google.android.rcs.client.messaging;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GetMessagesRequest extends GetMessagesRequest {
    private final int b;
    private final TraceId c;

    public AutoValue_GetMessagesRequest(int i, TraceId traceId) {
        this.b = i;
        this.c = traceId;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesRequest
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesRequest
    public final TraceId b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetMessagesRequest) {
            GetMessagesRequest getMessagesRequest = (GetMessagesRequest) obj;
            if (this.b == getMessagesRequest.a() && this.c.equals(getMessagesRequest.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "GetMessagesRequest{limit=" + this.b + ", traceId=" + String.valueOf(this.c) + "}";
    }
}
