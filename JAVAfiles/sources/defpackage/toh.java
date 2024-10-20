package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class toh extends agmp implements agmq {
    @Deprecated
    public toh(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, toj tojVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tom.a, agoxVar, akkwVar, tojVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tod();
    }

    public final long c() {
        return getLong(cI(2, tom.a));
    }

    public final long e() {
        return getLong(cI(3, tom.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, tom.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            long[] jArr2 = null;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, tom.a))), new String[0]);
                } else {
                    strArr = new String[]{g()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tmr(this, 18));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, tom.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(dl[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new tmr(this, 19));
            if (db(2)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(2, tom.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tmr(this, 20));
            if (db(3)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(3, tom.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            }
            agmp.dr(length, jArr2, new tor(this, i));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr2 = tom.a;
                    int i4 = tls.a;
                    tof tofVar = new tof();
                    tofVar.aD();
                    tofVar.aB();
                    long j2 = du[i3];
                    if (strArr != null) {
                        String str = strArr[i3];
                        tofVar.aC(0);
                        tofVar.a = str;
                    }
                    if (messageIdTypeArr != null) {
                        tofVar.b(messageIdTypeArr[i3]);
                    }
                    if (jArr != null) {
                        tofVar.c(jArr[i3]);
                    }
                    if (jArr2 != null) {
                        tofVar.d(jArr2[i3]);
                    }
                    alobVar.h(tofVar.a());
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(0, tom.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
