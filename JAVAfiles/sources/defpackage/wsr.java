package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wsr extends agoz {
    public wsr(agpf agpfVar) {
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
        return new String[]{"messages._id", "scheduled_send.message_id", "parts.message_id", "messages._id", "message_captions.message_id", "messages._id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"messages", "scheduled_send", "parts", "messages", "message_captions", "messages"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new wsq(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this);
    }
}
