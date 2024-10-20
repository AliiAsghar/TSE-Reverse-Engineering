package com.google.android.rcs.client.messaging;

import defpackage.alog;
import defpackage.alzz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GetGroupNotificationsResponse extends GetGroupNotificationsResponse {
    private final MessagingResult a;
    private final alog b;

    public AutoValue_GetGroupNotificationsResponse(MessagingResult messagingResult, alog alogVar) {
        this.a = messagingResult;
        this.b = alogVar;
    }

    @Override // com.google.android.rcs.client.messaging.GetGroupNotificationsResponse
    public final MessagingResult a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GetGroupNotificationsResponse
    public final alog b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetGroupNotificationsResponse) {
            GetGroupNotificationsResponse getGroupNotificationsResponse = (GetGroupNotificationsResponse) obj;
            if (this.a.equals(getGroupNotificationsResponse.a()) && alzz.at(this.b, getGroupNotificationsResponse.b())) {
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
        return "GetGroupNotificationsResponse{result=" + this.a.toString() + ", notifications=" + alogVar.toString() + "}";
    }
}
