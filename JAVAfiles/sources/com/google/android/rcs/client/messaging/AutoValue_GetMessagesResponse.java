package com.google.android.rcs.client.messaging;

import defpackage.alog;
import defpackage.alzz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GetMessagesResponse extends GetMessagesResponse {
    private final MessagingResult a;
    private final alog b;

    public AutoValue_GetMessagesResponse(MessagingResult messagingResult, alog alogVar) {
        this.a = messagingResult;
        this.b = alogVar;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesResponse
    public final MessagingResult a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GetMessagesResponse
    public final alog b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetMessagesResponse) {
            GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
            if (this.a.equals(getMessagesResponse.a()) && alzz.at(this.b, getMessagesResponse.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        alog alogVar = this.b;
        return "GetMessagesResponse{result=" + this.a.toString() + ", messages=" + alogVar.toString() + "}";
    }
}
