package com.google.android.rcs.client.messaging.data;

import defpackage.ajqk;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_IsComposingMessage extends IsComposingMessage {
    private final ajqk a;
    private final Optional b;
    private final Optional c;

    public AutoValue_IsComposingMessage(ajqk ajqkVar, Optional optional, Optional optional2) {
        this.a = ajqkVar;
        this.b = optional;
        this.c = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.data.IsComposingMessage
    public final ajqk a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.IsComposingMessage
    public final Optional b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.IsComposingMessage
    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IsComposingMessage) {
            IsComposingMessage isComposingMessage = (IsComposingMessage) obj;
            if (this.a.equals(isComposingMessage.a()) && this.b.equals(isComposingMessage.b()) && this.c.equals(isComposingMessage.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "IsComposingMessage{state=" + this.a.toString() + ", refresh=" + String.valueOf(optional2) + ", timestamp=" + String.valueOf(optional) + "}";
    }
}
