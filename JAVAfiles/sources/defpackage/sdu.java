package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdu extends agoz {
    public sdu(agpf agpfVar) {
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
        return new String[]{"rbm_business_verifier_info.verifier_id", "rbm_business_info.verifier_id"};
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return new String[]{"rbm_business_verifier_info", "rbm_business_info"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new sea(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this, 1);
    }
}
