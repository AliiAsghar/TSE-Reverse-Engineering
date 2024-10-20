package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sci extends agoz<lbz, sci, scj, MediaSearchQuery.BindData, Object> {
    public sci(agpf agpfVar) {
        super(agpfVar);
    }

    @Override // defpackage.agoz
    protected final Map a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final boolean b() {
        return true;
    }

    @Override // defpackage.agoz
    protected final String[] c() {
        return new String[]{"messages._id", "parts.message_id", "participants._id", "messages.sender_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "parts.conversation_id", "conversations._id", "parts.conversation_id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"messages", "null", "participants", "messages", "message_star", "messages", "parent_disallowed_conversations", "parts", "conversations", "parts"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new lbz(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 13);
    }
}
