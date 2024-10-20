package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sau extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(tqc... tqcVarArr) {
        U(new agmf("conversations.archive_status", 3, X((Iterable) DesugarArrays.stream(tqcVarArr).map(new sal(4)).collect(Collectors.toCollection(new sap(19)))), true));
    }

    public final void c(ConversationIdType conversationIdType) {
        U(new agmd("conversations._id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }
}
