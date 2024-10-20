package com.google.android.rcs.client.messaging.data;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_MessageExtensionHeader extends MessageExtensionHeader {
    private final String a;
    private final String b;
    private final String c;

    public AutoValue_MessageExtensionHeader(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageExtensionHeader
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageExtensionHeader
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageExtensionHeader
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageExtensionHeader) {
            MessageExtensionHeader messageExtensionHeader = (MessageExtensionHeader) obj;
            if (this.a.equals(messageExtensionHeader.b()) && this.b.equals(messageExtensionHeader.a()) && this.c.equals(messageExtensionHeader.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
