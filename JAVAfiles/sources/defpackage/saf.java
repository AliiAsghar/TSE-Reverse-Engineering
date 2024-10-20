package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class saf extends agmp<saf, sag, sah, sac, sae> implements agmq {
    @Deprecated
    public saf(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sag sagVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, saj.a, agoxVar, akkwVar, sagVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sac();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cI(0, saj.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
