package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmh {
    public ConversationId a;
    public String b;
    public String c;
    public Uri d;
    public mmi e;
    private boolean f;
    private int g;
    private Instant h;
    private byte i;

    public final mmj a() {
        ConversationId conversationId;
        String str;
        String str2;
        Instant instant;
        if (this.i == 3 && (conversationId = this.a) != null && (str = this.b) != null && (str2 = this.c) != null && (instant = this.h) != null) {
            return new mmj(conversationId, str, this.f, str2, this.g, this.d, this.e, instant);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if (this.b == null) {
            sb.append(" name");
        }
        if ((this.i & 1) == 0) {
            sb.append(" isUnread");
        }
        if (this.c == null) {
            sb.append(" latestMessageSnippet");
        }
        if ((this.i & 2) == 0) {
            sb.append(" recipientCount");
        }
        if (this.h == null) {
            sb.append(" sortTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 1);
    }

    public final void c(int i) {
        this.g = i;
        this.i = (byte) (this.i | 2);
    }

    public final void d(Instant instant) {
        if (instant != null) {
            this.h = instant;
            return;
        }
        throw new NullPointerException("Null sortTime");
    }
}
