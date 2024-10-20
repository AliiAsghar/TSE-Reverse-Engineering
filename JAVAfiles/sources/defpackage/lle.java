package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lle implements lkf {
    public final ConversationId a;
    public final List b;
    public final SelfIdentityId c;
    public final int d;

    public lle(ConversationId conversationId, List list, SelfIdentityId selfIdentityId, int i) {
        this.a = conversationId;
        this.b = list;
        this.c = selfIdentityId;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lle)) {
            return false;
        }
        lle lleVar = (lle) obj;
        if (d.F(this.a, lleVar.a) && d.F(this.b, lleVar.b) && d.F(this.c, lleVar.c) && this.d == lleVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        SelfIdentityId selfIdentityId = this.c;
        if (selfIdentityId == null) {
            hashCode = 0;
        } else {
            hashCode = selfIdentityId.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + this.d;
    }

    public final String toString() {
        return "AddPeopleV2(conversationId=" + this.a + ", recipients=" + this.b + ", selfIdentityId=" + this.c + ", conversationUiState=" + this.d + ")";
    }
}
