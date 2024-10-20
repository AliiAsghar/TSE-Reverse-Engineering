package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzi {
    public final miq a;
    public final MessageId b;
    public final ConversationId c;
    public final Instant d;
    public final int e;

    public mzi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzi) {
            mzi mziVar = (mzi) obj;
            if (this.a.equals(mziVar.a) && this.b.equals(mziVar.b) && this.c.equals(mziVar.c) && this.d.equals(mziVar.d) && this.e == mziVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        Instant instant = this.d;
        ConversationId conversationId = this.c;
        MessageId messageId = this.b;
        return "BugleMessageChanged{operation=" + this.a.toString() + ", id=" + messageId.toString() + ", conversationId=" + conversationId.toString() + ", timestamp=" + instant.toString() + ", status=" + this.e + "}";
    }

    public mzi(miq miqVar, MessageId messageId, ConversationId conversationId, Instant instant, int i) {
        if (miqVar == null) {
            throw new NullPointerException("Null operation");
        }
        this.a = miqVar;
        this.b = messageId;
        this.c = conversationId;
        if (instant != null) {
            this.d = instant;
            this.e = i;
            return;
        }
        throw new NullPointerException("Null timestamp");
    }
}
