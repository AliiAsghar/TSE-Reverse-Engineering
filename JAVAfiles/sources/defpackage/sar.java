package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sar extends agmp<sar, sas, sat, san, saq> implements agmq {
    @Deprecated
    public sar(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sas sasVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sav.a, agoxVar, akkwVar, sasVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new san();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cI(0, sav.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
