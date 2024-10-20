package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sto extends agmp implements agmq {
    @Deprecated
    public sto(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, stq stqVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, stt.a, agoxVar, akkwVar, stqVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new stm();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cI(0, stt.a)));
    }

    public final String e() {
        return getString(cI(1, stt.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, stt.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            messageIdTypeArr2[i] = new MessageIdType(dl[i]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{c()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new ssl(this, 9));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, stt.a))), new String[0]);
                    } else {
                        strArr = new String[]{e()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new ssl(this, 10));
                alob alobVar = new alob();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        String[] strArr2 = stt.a;
                        int i3 = ssv.a;
                        tpk tpkVar = new tpk((short[]) null);
                        tpkVar.aD();
                        tpkVar.aB();
                        long j2 = du[i2];
                        if (messageIdTypeArr != null) {
                            tpkVar.i(messageIdTypeArr[i2]);
                        }
                        if (strArr != null) {
                            tpkVar.h(strArr[i2]);
                        }
                        alobVar.h(tpkVar.g());
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
