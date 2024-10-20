package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdv {
    public final qei a;
    public final ConversationIdType b;
    public final Instant c;
    public final ajqk d;

    public qdv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdv) {
            qdv qdvVar = (qdv) obj;
            if (this.a.equals(qdvVar.a) && this.b.equals(qdvVar.b) && this.c.equals(qdvVar.c) && this.d.equals(qdvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ajqk ajqkVar = this.d;
        Instant instant = this.c;
        ConversationIdType conversationIdType = this.b;
        return "IsComposingInformation{sender=" + String.valueOf(this.a) + ", conversationId=" + String.valueOf(conversationIdType) + ", expiry=" + String.valueOf(instant) + ", status=" + String.valueOf(ajqkVar) + "}";
    }

    public qdv(qei qeiVar, ConversationIdType conversationIdType, Instant instant, ajqk ajqkVar) {
        this.a = qeiVar;
        this.b = conversationIdType;
        this.c = instant;
        this.d = ajqkVar;
    }
}
