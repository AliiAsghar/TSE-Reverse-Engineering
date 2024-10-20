package com.google.android.rcs.client.messaging.data;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_TraceId extends TraceId {
    private final String a;

    public AutoValue_TraceId(String str) {
        this.a = str;
    }

    @Override // com.google.android.rcs.client.messaging.data.TraceId
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TraceId) {
            return this.a.equals(((TraceId) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TraceId{id=" + this.a + "}";
    }
}
