package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sag extends agoz<saf, sag, sah, sac, sae> {
    public sag(agpf agpfVar) {
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
        return new String[]{"messages._id", "conversations.latest_message_id", "participants._id", "messages.sender_id", "participants._id", "conversation_to_participants.participant_id", "profiles_table.participant_id", "conversation_to_participants.participant_id", "parts.message_id", "messages._id", "vmt.part_id", "parts._id", "reminders.message_id", "conversations.latest_message_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "conversations._id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"messages", "null", "participants", "messages", "participants", "conversation_to_participants", "profiles_table", "conversation_to_participants", "parts", "messages", "vmt", "parts", "reminders", "conversations", "message_star", "messages", "parent_disallowed_conversations", "conversations"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new saf(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this);
    }
}
