package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldc extends agoz {
    public ldc(agpf agpfVar) {
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
        return new String[]{"messages._id", "participants._id", "messages.sender_id", "participants._id", "conversation_participants.participant_id", "profiles_table.participant_id", "conversation_participants.participant_id", "parts.message_id", "messages._id", "reminders.message_id", "messages._id", "conversation_pin.conversation_id", "conversations._id", "lighter_conversations_table.conversation_id", "conversations._id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"messages", "participants", "messages", "participants", "conversation_participants", "profiles_table", "conversation_participants", "parts", "messages", "reminders", "messages", "conversation_pin", "conversations", "lighter_conversations_table", "conversations"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new lbz(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 4);
    }
}
