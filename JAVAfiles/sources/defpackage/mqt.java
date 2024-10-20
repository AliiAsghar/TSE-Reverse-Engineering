package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqt extends agmp implements agmq {
    private final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public mqt(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, mql mqlVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, mqp.a, agoxVar, akkwVar, mqlVar);
        this.k = i;
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        if (this.k != 0) {
            return new mqj();
        }
        return new mqq();
    }

    public final int c() {
        if (this.k != 0) {
            return getInt(cI(4, mqp.a));
        }
        return getInt(cI(4, mqx.a));
    }

    public final ConversationIdType d() {
        if (this.k != 0) {
            return new ConversationIdType(getLong(cI(0, mqp.a)));
        }
        return new ConversationIdType(getLong(cI(0, mqx.a)));
    }

    public final tqh e() {
        if (this.k != 0) {
            tqh[] values = tqh.values();
            int i = getInt(cI(2, mqp.a));
            if (i < values.length) {
                return values[i];
            }
            throw new IllegalArgumentException();
        }
        tqh[] values2 = tqh.values();
        int i2 = getInt(cI(2, mqx.a));
        if (i2 < values2.length) {
            return values2[i2];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        if (this.k != 0) {
            return getString(cI(1, mqp.a));
        }
        return getString(cI(1, mqx.a));
    }

    public final long[] g() {
        if (this.k != 0) {
            return agnc.y(null, dl(getString(cI(5, mqp.a))));
        }
        return agnc.y(null, dl(getString(cI(5, mqx.a))));
    }

    public final String[] h() {
        if (this.k != 0) {
            String[] dm = dm(getString(cI(10, mqp.a)));
            for (int i = 0; i < dm.length; i++) {
                dm[i] = yta.a(dm[i]);
            }
            return (String[]) agnc.z(null, dm, new String[0]);
        }
        String[] dm2 = dm(getString(cI(10, mqx.a)));
        for (int i2 = 0; i2 < dm2.length; i2++) {
            dm2[i2] = yta.a(dm2[i2]);
        }
        return (String[]) agnc.z(null, dm2, new String[0]);
    }

    public final String[] i() {
        if (this.k != 0) {
            String[] dm = dm(getString(cI(8, mqp.a)));
            for (int i = 0; i < dm.length; i++) {
                dm[i] = aabr.bb(dm[i]);
            }
            return (String[]) agnc.z(null, dm, new String[0]);
        }
        String[] dm2 = dm(getString(cI(8, mqx.a)));
        for (int i2 = 0; i2 < dm2.length; i2++) {
            dm2[i2] = aabr.bb(dm2[i2]);
        }
        return (String[]) agnc.z(null, dm2, new String[0]);
    }

    public final String[] j() {
        if (this.k != 0) {
            String[] dm = dm(getString(cI(9, mqp.a)));
            for (int i = 0; i < dm.length; i++) {
                dm[i] = aabr.bb(dm[i]);
            }
            return (String[]) agnc.z(null, dm, new String[0]);
        }
        String[] dm2 = dm(getString(cI(9, mqx.a)));
        for (int i2 = 0; i2 < dm2.length; i2++) {
            dm2[i2] = aabr.bb(dm2[i2]);
        }
        return (String[]) agnc.z(null, dm2, new String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public mqt(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, mqu mquVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, mqx.a, agoxVar, akkwVar, mquVar);
        this.k = i;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
