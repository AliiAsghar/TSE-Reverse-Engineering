package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjx {
    public String a;
    public ConversationIdType b;
    public IconCompat c;
    public Optional d;
    public Optional e;
    public Optional f;
    private ConversationId g;
    private String h;
    private boolean i;
    private Optional j;
    private int k;
    private byte l;

    public vjx() {
        throw null;
    }

    public final vjy a() {
        String str;
        ConversationIdType conversationIdType;
        ConversationId conversationId;
        String str2;
        if (this.l == 3 && (str = this.a) != null && (conversationIdType = this.b) != null && (conversationId = this.g) != null && (str2 = this.h) != null) {
            return new vjy(str, conversationIdType, conversationId, str2, this.i, this.j, this.k, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" shortcutId");
        }
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if (this.g == null) {
            sb.append(" mapiConversationId");
        }
        if (this.h == null) {
            sb.append(" conversationLabel");
        }
        if ((this.l & 1) == 0) {
            sb.append(" isGroup");
        }
        if ((this.l & 2) == 0) {
            sb.append(" shortcutRank");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null conversationLabel");
    }

    public final void c(boolean z) {
        this.i = z;
        this.l = (byte) (this.l | 1);
    }

    public final void d(ConversationId conversationId) {
        if (conversationId != null) {
            this.g = conversationId;
            return;
        }
        throw new NullPointerException("Null mapiConversationId");
    }

    public final void e(Optional optional) {
        if (optional != null) {
            this.j = optional;
            return;
        }
        throw new NullPointerException("Null otherParticipantMessagingIdentity");
    }

    public final void f(int i) {
        this.k = i;
        this.l = (byte) (this.l | 2);
    }

    public vjx(byte[] bArr) {
        this.j = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }
}
