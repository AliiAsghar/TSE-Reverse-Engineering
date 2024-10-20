package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class wqx {
    public final ConversationIdType a;
    public final SelfIdentityId b;
    public final ParticipantsTable.BindData c;

    public wqx(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, ParticipantsTable.BindData bindData) {
        this.a = conversationIdType;
        this.b = selfIdentityId;
        this.c = bindData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqx)) {
            return false;
        }
        wqx wqxVar = (wqx) obj;
        if (d.F(this.a, wqxVar.a) && d.F(this.b, wqxVar.b) && d.F(this.c, wqxVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConvInfo(conversationIdType=" + this.a + ", selfIdentityId=" + this.b + ", participantsTableBindData=" + this.c + ")";
    }
}
