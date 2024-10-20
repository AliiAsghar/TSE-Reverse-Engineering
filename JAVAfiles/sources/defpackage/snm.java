package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snm extends agmp implements agmq {
    @Deprecated
    public snm(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, snn snnVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, snp.a, agoxVar, akkwVar, snnVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new snk();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cI(0, snp.a)));
    }

    public final String e() {
        return getString(cI(1, snp.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, snp.a)));
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
            agmp.ds(length, conversationIdTypeArr, new smz(this, 5));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, snp.a))), new String[0]);
                } else {
                    strArr = new String[]{e()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new smz(this, 6));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr2 = snp.a;
                    int i3 = sms.a;
                    tpk tpkVar = new tpk((char[]) null, (byte[]) null, (byte[]) null);
                    tpkVar.aD();
                    tpkVar.aB();
                    long j2 = du[i2];
                    if (conversationIdTypeArr != null) {
                        ConversationIdType conversationIdType = conversationIdTypeArr[i2];
                        tpkVar.aC(0);
                        tpkVar.a = conversationIdType;
                    }
                    if (strArr != null) {
                        String str = strArr[i2];
                        tpkVar.aC(1);
                        tpkVar.b = str;
                    }
                    snk snkVar = new snk();
                    snkVar.ar(tpkVar.az());
                    snkVar.a = (ConversationIdType) tpkVar.a;
                    snkVar.b = (String) tpkVar.b;
                    snkVar.cF = tpkVar.aA();
                    alobVar.h(snkVar);
                }
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
