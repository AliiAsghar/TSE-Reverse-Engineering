package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdn extends agoz {
    public sdn(agpf agpfVar) {
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
        return new String[]{"messages._id", "message_replies.replied_to_message_id", "participants._id", "messages.sender_id", "parts.message_id", "messages._id", "link_preview.message_id", "messages._id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"messages", "message_replies", "participants", "messages", "parts", "messages", "link_preview", "messages"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new lbz(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 18);
    }
}
