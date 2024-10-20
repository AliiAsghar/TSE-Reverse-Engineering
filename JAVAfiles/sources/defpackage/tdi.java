package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdi extends agoz<tdh, tdi, tdj, ProfilesTable.BindData, tdf> {
    public tdi(agpf agpfVar) {
        super(agpfVar);
    }

    @Override // defpackage.agoz
    protected final Map a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final boolean b() {
        return false;
    }

    @Override // defpackage.agoz
    protected final String[] c() {
        return d.aN();
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return d.aN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new tdh(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this);
    }
}
