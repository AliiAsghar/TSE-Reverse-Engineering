package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbi extends jbj {
    private final View a;
    private final View b;
    private final ConversationId c;
    private final MessageIdType d;
    private final long e;

    public jbi(View view, View view2, ConversationId conversationId, MessageIdType messageIdType, long j) {
        if (view != null) {
            this.a = view;
            if (view2 != null) {
                this.b = view2;
                this.c = conversationId;
                if (messageIdType != null) {
                    this.d = messageIdType;
                    this.e = j;
                    return;
                }
                throw new NullPointerException("Null messageId");
            }
            throw new NullPointerException("Null target");
        }
        throw new NullPointerException("Null parent");
    }

    @Override // defpackage.jbj
    public final long a() {
        return this.e;
    }

    @Override // defpackage.jbj
    public final View b() {
        return this.a;
    }

    @Override // defpackage.jbj
    public final View c() {
        return this.b;
    }

    @Override // defpackage.jbj
    public final ConversationId d() {
        return this.c;
    }

    @Override // defpackage.jbj
    public final MessageIdType e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbj) {
            jbj jbjVar = (jbj) obj;
            if (this.a.equals(jbjVar.b()) && this.b.equals(jbjVar.c()) && this.c.equals(jbjVar.d()) && this.d.equals(jbjVar.e()) && this.e == jbjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        MessageIdType messageIdType = this.d;
        ConversationId conversationId = this.c;
        View view = this.b;
        return "StarBadgeClickEvent{parent=" + this.a.toString() + ", target=" + view.toString() + ", conversationId=" + conversationId.toString() + ", messageId=" + messageIdType.toString() + ", usageStatsLoggingId=" + this.e + "}";
    }
}
