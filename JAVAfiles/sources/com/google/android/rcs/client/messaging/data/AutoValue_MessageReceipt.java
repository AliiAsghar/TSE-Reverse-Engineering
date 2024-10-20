package com.google.android.rcs.client.messaging.data;

import defpackage.ajqu;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_MessageReceipt extends MessageReceipt {
    public final ajqu a;
    public final String b;
    public final Optional c;
    private final Instant d;
    private final String e;

    public AutoValue_MessageReceipt(ajqu ajquVar, String str, Instant instant, String str2, Optional optional) {
        this.a = ajquVar;
        this.b = str;
        this.d = instant;
        this.e = str2;
        this.c = optional;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final ajqu a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final Instant b() {
        return this.d;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final Optional c() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final String d() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.MessageReceipt
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageReceipt) {
            MessageReceipt messageReceipt = (MessageReceipt) obj;
            if (this.a.equals(messageReceipt.a()) && this.b.equals(messageReceipt.d()) && this.d.equals(messageReceipt.b()) && this.e.equals(messageReceipt.e()) && this.c.equals(messageReceipt.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Instant instant = this.d;
        return "MessageReceipt{type=" + this.a.toString() + ", messageId=" + this.b + ", timestamp=" + instant.toString() + ", status=" + this.e + ", encryptedData=" + String.valueOf(optional) + "}";
    }
}
