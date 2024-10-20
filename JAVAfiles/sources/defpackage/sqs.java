package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqs extends agmp implements agmq {
    @Deprecated
    public sqs(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sqt sqtVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sqv.a, agoxVar, akkwVar, sqtVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sqq();
    }

    public final qwe c() {
        return riw.m(getString(cI(1, sqv.a)));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cI(0, sqv.a)));
    }

    public final String f() {
        return getString(cI(2, sqv.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        qwe[] qweVarArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, sqv.a)));
                    int length2 = dl.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(dl[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
            } else {
                conversationIdTypeArr = null;
            }
            agmp.ds(length, conversationIdTypeArr, new sqi(this, 6));
            if (db(1)) {
                if (z) {
                    String[] dm = dm(getString(cI(1, sqv.a)));
                    int length3 = dm.length;
                    qwe[] qweVarArr2 = new qwe[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        qweVarArr2[i2] = riw.m(dm[i2]);
                    }
                    qweVarArr = (qwe[]) agnc.z(null, qweVarArr2, new qwe[0]);
                } else {
                    qweVarArr = new qwe[]{c()};
                }
            } else {
                qweVarArr = null;
            }
            agmp.ds(length, qweVarArr, new sqi(this, 7));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, sqv.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new sqi(this, 8));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr2 = sqv.a;
                    int i4 = spk.a;
                    tmc tmcVar = new tmc((byte[]) null, (char[]) null);
                    tmcVar.aD();
                    tmcVar.aB();
                    long j2 = du[i3];
                    if (conversationIdTypeArr != null) {
                        ConversationIdType conversationIdType = conversationIdTypeArr[i3];
                        tmcVar.aC(0);
                        tmcVar.c = conversationIdType;
                    }
                    if (qweVarArr != null) {
                        qwe qweVar = qweVarArr[i3];
                        tmcVar.aC(1);
                        tmcVar.b = qweVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        tmcVar.aC(2);
                        tmcVar.a = str;
                    }
                    sqq sqqVar = new sqq();
                    sqqVar.ar(tmcVar.az());
                    sqqVar.a = (ConversationIdType) tmcVar.c;
                    sqqVar.b = (qwe) tmcVar.b;
                    sqqVar.c = (String) tmcVar.a;
                    sqqVar.cF = tmcVar.aA();
                    alobVar.h(sqqVar);
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
