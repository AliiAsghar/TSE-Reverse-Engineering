package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjy extends agoz {
    public sjy(agpf agpfVar) {
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
        return new String[]{"parts.message_id", "messages._id", "participants._id", "messages.sender_id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"parts", "messages", "participants", "messages"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new sea(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 5);
    }
}
