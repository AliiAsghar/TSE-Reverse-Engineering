package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdu {
    private qei a;
    private ConversationIdType b;
    private Instant c;
    private ajqk d;

    public final qdv a() {
        ConversationIdType conversationIdType;
        Instant instant;
        ajqk ajqkVar;
        qei qeiVar = this.a;
        if (qeiVar != null && (conversationIdType = this.b) != null && (instant = this.c) != null && (ajqkVar = this.d) != null) {
            return new qdv(qeiVar, conversationIdType, instant, ajqkVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sender");
        }
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if (this.c == null) {
            sb.append(" expiry");
        }
        if (this.d == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType != null) {
            this.b = conversationIdType;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final void c(Instant instant) {
        if (instant != null) {
            this.c = instant;
            return;
        }
        throw new NullPointerException("Null expiry");
    }

    public final void d(qei qeiVar) {
        if (qeiVar != null) {
            this.a = qeiVar;
            return;
        }
        throw new NullPointerException("Null sender");
    }

    public final void e(ajqk ajqkVar) {
        if (ajqkVar != null) {
            this.d = ajqkVar;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
