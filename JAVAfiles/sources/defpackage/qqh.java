package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqh extends agoz {
    public qqh(agpf agpfVar) {
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
        return new String[]{"conversation_participants.conversation_id", "conversations._id", "participants._id", "conversation_participants.participant_id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"conversation_participants", "conversations", "participants", "conversation_participants"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new qqg(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 0);
    }
}
