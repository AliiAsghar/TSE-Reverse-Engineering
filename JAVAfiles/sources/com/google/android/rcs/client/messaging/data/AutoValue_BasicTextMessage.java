package com.google.android.rcs.client.messaging.data;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_BasicTextMessage extends BasicTextMessage {
    private final String a;

    public AutoValue_BasicTextMessage(String str) {
        this.a = str;
    }

    @Override // com.google.android.rcs.client.messaging.data.BasicTextMessage
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BasicTextMessage) {
            return this.a.equals(((BasicTextMessage) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
