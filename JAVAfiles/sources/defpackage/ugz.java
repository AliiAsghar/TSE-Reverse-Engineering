package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugz {
    public static final alog a = alog.A(100, 101, 106, 107, 108, 109, 110, 111, 112, 115);
    public static final agpj b;

    static {
        sxy d = MessagesTable.d();
        d.c(MessagesTable.c.a);
        d.g(new ugo(14));
        b = d.b().r();
    }

    public static sxy a(ConversationIdType conversationIdType) {
        syc sycVar = new syc();
        sycVar.A(false);
        sycVar.O(a);
        sycVar.f(conversationIdType);
        sycVar.q(false);
        sxy d = MessagesTable.d();
        d.w("UnreadMessagesCountQuery#createConversationQueryBuilder");
        d.k(new syb(sycVar));
        return d;
    }
}
