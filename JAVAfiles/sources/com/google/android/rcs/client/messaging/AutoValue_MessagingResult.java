package com.google.android.rcs.client.messaging;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_MessagingResult extends MessagingResult {
    public final int a;
    public final int b;
    public final Duration c;

    public AutoValue_MessagingResult(int i, int i2, Duration duration) {
        this.a = i;
        this.b = i2;
        this.c = duration;
    }

    @Override // com.google.android.rcs.client.messaging.MessagingResult
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.MessagingResult
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.MessagingResult
    public final Duration c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessagingResult) {
            MessagingResult messagingResult = (MessagingResult) obj;
            if (this.a == messagingResult.b() && this.b == messagingResult.a() && this.c.equals(messagingResult.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "MessagingResult{errorCode=" + this.a + ", errorCause=" + this.b + ", retryAfter=" + String.valueOf(this.c) + "}";
    }
}
