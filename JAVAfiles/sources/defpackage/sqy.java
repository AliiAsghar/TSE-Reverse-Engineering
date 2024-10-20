package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqy extends agmp implements agmq {
    @Deprecated
    public sqy(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sqz sqzVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, src.a, agoxVar, akkwVar, sqzVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sqw();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cI(0, src.a)));
    }

    public final boolean e() {
        if (getInt(cI(1, src.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        boolean[] zArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, src.a)));
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
            agmp.ds(length, conversationIdTypeArr, new sqi(this, 9));
            if (db(1)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(1, src.a))));
                } else {
                    zArr = new boolean[]{e()};
                }
            } else {
                zArr = null;
            }
            agmp.dt(length, zArr, new sqi(this, 10));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr = src.a;
                    int i3 = spk.a;
                    tno tnoVar = new tno(null);
                    tnoVar.aD();
                    tnoVar.aB();
                    long j2 = du[i2];
                    if (conversationIdTypeArr != null) {
                        ConversationIdType conversationIdType = conversationIdTypeArr[i2];
                        tnoVar.aC(0);
                        tnoVar.b = conversationIdType;
                    }
                    if (zArr != null) {
                        boolean z2 = zArr[i2];
                        tnoVar.aC(1);
                        tnoVar.a = z2;
                    }
                    sqw sqwVar = new sqw();
                    sqwVar.ar(tnoVar.az());
                    sqwVar.a = (ConversationIdType) tnoVar.b;
                    sqwVar.b = tnoVar.a;
                    sqwVar.cF = tnoVar.aA();
                    alobVar.h(sqwVar);
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
