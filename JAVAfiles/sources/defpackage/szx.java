package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szx extends agmp implements agmq {
    @Deprecated
    public szx(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, szz szzVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tac.a, agoxVar, akkwVar, szzVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new szv();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cI(0, tac.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, tac.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            conversationIdTypeArr2[i] = new ConversationIdType(dl[i]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{c()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new szh(this, 11));
                alob alobVar = new alob();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        String[] strArr = tac.a;
                        int i3 = sym.a;
                        top topVar = new top(null);
                        topVar.aD();
                        topVar.aB();
                        long j2 = du[i2];
                        if (conversationIdTypeArr != null) {
                            topVar.d(conversationIdTypeArr[i2]);
                        }
                        alobVar.h(topVar.c());
                    }
                }
                return alobVar.g();
            }
        }
        int i4 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
