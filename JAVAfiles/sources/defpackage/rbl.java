package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rbl {
    private final ConversationIdType a;
    private final SelfIdentityId b;
    private final int c;

    public rbl(MessageCoreData messageCoreData) {
        ConversationIdType z = messageCoreData.z();
        this.a = z;
        if (!messageCoreData.cQ() && !messageCoreData.cB()) {
            this.b = null;
            this.c = z.hashCode();
        } else {
            SelfIdentityId v = messageCoreData.v();
            this.b = v;
            this.c = Objects.hash(z, lga.Y(v));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rbl)) {
            return false;
        }
        rbl rblVar = (rbl) obj;
        if (this.c != rblVar.c || !Objects.equals(this.a, rblVar.a) || !Objects.equals(this.b, rblVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }
}
