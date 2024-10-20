package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class saw {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public ConversationIdType f;
    public alog g;
    public Integer h;
    private boolean i;
    private byte j;

    public final sax a() {
        ConversationIdType conversationIdType;
        alog alogVar;
        if (this.j == 1 && (conversationIdType = this.f) != null && (alogVar = this.g) != null) {
            return new sax(this.a, this.b, this.c, this.d, this.e, this.i, conversationIdType, alogVar, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == 0) {
            sb.append(" whereApprovedByParent");
        }
        if (this.f == null) {
            sb.append(" conversationId");
        }
        if (this.g == null) {
            sb.append(" conversationIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.i = z;
        this.j = (byte) 1;
    }

    public final sak c() {
        ConversationIdType conversationIdType;
        alog alogVar;
        if (this.j == 1 && (conversationIdType = this.f) != null && (alogVar = this.g) != null) {
            return new sak(this.a, this.b, this.c, this.d, this.e, this.i, conversationIdType, alogVar, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == 0) {
            sb.append(" whereApprovedByParent");
        }
        if (this.f == null) {
            sb.append(" conversationId");
        }
        if (this.g == null) {
            sb.append(" conversationIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.i = z;
        this.j = (byte) 1;
    }
}
