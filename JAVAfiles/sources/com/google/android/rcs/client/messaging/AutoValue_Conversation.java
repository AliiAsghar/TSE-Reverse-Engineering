package com.google.android.rcs.client.messaging;

import defpackage.a;
import defpackage.ajpu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_Conversation extends Conversation {
    private final ajpu a;
    private final String b;
    private final int c;

    public AutoValue_Conversation(int i, ajpu ajpuVar, String str) {
        this.c = i;
        this.a = ajpuVar;
        this.b = str;
    }

    @Override // com.google.android.rcs.client.messaging.Conversation
    public final ajpu a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.Conversation
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.Conversation
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Conversation) {
            Conversation conversation = (Conversation) obj;
            if (this.c == conversation.c() && this.a.equals(conversation.a()) && this.b.equals(conversation.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.aS(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }
}
