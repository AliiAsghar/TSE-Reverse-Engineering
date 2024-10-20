package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qqg extends agmp implements agmq {
    private final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public qqg(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qpz qpzVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, qqc.a, agoxVar, akkwVar, qpzVar);
        this.k = i;
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        if (this.k != 0) {
            return new qpx();
        }
        return new qqd();
    }

    public final ConversationIdType c() {
        if (this.k != 0) {
            return new ConversationIdType(getLong(cI(0, qqc.a)));
        }
        return new ConversationIdType(getLong(cI(0, qql.a)));
    }

    public final String[] e() {
        if (this.k != 0) {
            String[] dm = dm(getString(cI(6, qqc.a)));
            for (int i = 0; i < dm.length; i++) {
                dm[i] = aabr.bb(dm[i]);
            }
            return (String[]) agnc.z(null, dm, new String[0]);
        }
        String[] dm2 = dm(getString(cI(6, qql.a)));
        for (int i2 = 0; i2 < dm2.length; i2++) {
            dm2[i2] = aabr.bb(dm2[i2]);
        }
        return (String[]) agnc.z(null, dm2, new String[0]);
    }

    public final String[] f() {
        if (this.k != 0) {
            String[] dm = dm(getString(cI(7, qqc.a)));
            for (int i = 0; i < dm.length; i++) {
                dm[i] = aabr.bb(dm[i]);
            }
            return (String[]) agnc.z(null, dm, new String[0]);
        }
        String[] dm2 = dm(getString(cI(7, qql.a)));
        for (int i2 = 0; i2 < dm2.length; i2++) {
            dm2[i2] = aabr.bb(dm2[i2]);
        }
        return (String[]) agnc.z(null, dm2, new String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public qqg(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qqh qqhVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, qql.a, agoxVar, akkwVar, qqhVar);
        this.k = i;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
