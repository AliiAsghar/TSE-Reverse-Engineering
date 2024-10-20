package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpr extends agmp implements agmq {
    @Deprecated
    public qpr(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qpt qptVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qpw.a, agoxVar, akkwVar, qptVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new qpp();
    }

    public final long c() {
        return getLong(cI(0, qpw.a));
    }

    public final long e() {
        return getLong(cI(1, qpw.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cI(3, qpw.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        String[] strArr;
        ConversationIdType[] conversationIdTypeArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, qpw.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new nfd(this, 15));
            if (db(1)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(1, qpw.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new nfd(this, 16));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, qpw.a))), new String[0]);
                } else {
                    strArr = new String[]{g()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new nfd(this, 17));
            if (db(3)) {
                if (z) {
                    long[] dl = dl(getString(cI(3, qpw.a)));
                    int length2 = dl.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        conversationIdTypeArr2[i] = new ConversationIdType(dl[i]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{f()};
                }
            } else {
                conversationIdTypeArr = null;
            }
            agmp.ds(length, conversationIdTypeArr, new nfd(this, 18));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr2 = qpw.a;
                    int i3 = qaa.a;
                    tof tofVar = new tof(null, null);
                    tofVar.aD();
                    tofVar.aB();
                    long j2 = du[i2];
                    if (jArr != null) {
                        long j3 = jArr[i2];
                        tofVar.aC(0);
                        tofVar.c = j3;
                    }
                    if (jArr2 != null) {
                        tofVar.l(jArr2[i2]);
                    }
                    if (strArr != null) {
                        tofVar.k(strArr[i2]);
                    }
                    if (conversationIdTypeArr != null) {
                        tofVar.j(conversationIdTypeArr[i2]);
                    }
                    alobVar.h(tofVar.i());
                }
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(2, qpw.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
