package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sed extends agoz {
    public sed(agpf agpfVar) {
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
        return new String[]{"remote_registrations_table.tachyon_registration_id", "remote_user_id_to_registration_id.tachyon_registration_id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"remote_registrations_table", "remote_user_id_to_registration_id"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new sea(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 2);
    }
}
