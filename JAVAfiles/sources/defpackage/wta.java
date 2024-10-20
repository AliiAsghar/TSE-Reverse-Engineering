package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wta extends agmp<wta, wtb, wtc, ScheduledSendTable.BindData, wsz> implements agmq {
    @Deprecated
    public wta(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, wtb wtbVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, ScheduledSendTable.a, agoxVar, akkwVar, wtbVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new wsw();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cI(2, ScheduledSendTable.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(1, ScheduledSendTable.a)));
    }

    public final wtf f() {
        wtf[] values = wtf.values();
        int i = getInt(cI(4, ScheduledSendTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        ConversationIdType[] conversationIdTypeArr;
        Instant[] instantArr;
        wtf[] wtfVarArr;
        Instant[] instantArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                akkw akkwVar = this.i;
                boolean db = db(0);
                boolean z = akkwVar.b;
                if (db) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, ScheduledSendTable.a))), new String[0]);
                    } else {
                        strArr = new String[]{i()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new vvk(this, 2));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, ScheduledSendTable.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            messageIdTypeArr2[i] = new MessageIdType(dl[i]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{e()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new vvk(this, 3));
                if (db(2)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(2, ScheduledSendTable.a)));
                        int length3 = dl2.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                        int i2 = 0;
                        while (i2 < length3) {
                            conversationIdTypeArr2[i2] = new ConversationIdType(dl2[i2]);
                            i2++;
                            length3 = length3;
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{c()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new vvk(this, 4));
                if (db(3)) {
                    if (z) {
                        long[] dl3 = dl(getString(cI(3, ScheduledSendTable.a)));
                        int length4 = dl3.length;
                        Instant[] instantArr3 = new Instant[length4];
                        for (int i3 = 0; i3 < length4; i3++) {
                            instantArr3[i3] = uzz.l(dl3[i3]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr3, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{h()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new vvk(this, 5));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, ScheduledSendTable.a)));
                        wtf[] values = wtf.values();
                        int length5 = values.length;
                        wtf[] wtfVarArr2 = new wtf[dk.length];
                        for (int i4 = 0; i4 < dk.length; i4++) {
                            int i5 = dk[i4];
                            if (i5 < length5) {
                                wtfVarArr2[i4] = values[i5];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        wtfVarArr = (wtf[]) agnc.z(null, wtfVarArr2, new wtf[0]);
                    } else {
                        wtfVarArr = new wtf[]{f()};
                    }
                } else {
                    wtfVarArr = null;
                }
                agmp.ds(length, wtfVarArr, new vvk(this, 6));
                if (db(5)) {
                    if (z) {
                        long[] dl4 = dl(getString(cI(5, ScheduledSendTable.a)));
                        int length6 = dl4.length;
                        Instant[] instantArr4 = new Instant[length6];
                        for (int i6 = 0; i6 < length6; i6++) {
                            instantArr4[i6] = uzz.l(dl4[i6]);
                        }
                        instantArr2 = (Instant[]) agnc.z(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{g()};
                    }
                } else {
                    instantArr2 = null;
                }
                agmp.ds(length, instantArr2, new vvk(this, 7));
                alob alobVar = new alob();
                for (int i7 = 0; i7 < length; i7++) {
                    long j = du[i7];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i7]));
                        wsx a = ScheduledSendTable.a();
                        a.aB();
                        long j2 = du[i7];
                        if (strArr != null) {
                            a.d(strArr[i7]);
                        }
                        if (messageIdTypeArr != null) {
                            a.e(messageIdTypeArr[i7]);
                        }
                        if (conversationIdTypeArr != null) {
                            a.b(conversationIdTypeArr[i7]);
                        }
                        if (instantArr != null) {
                            a.f(instantArr[i7]);
                        }
                        if (wtfVarArr != null) {
                            a.g(wtfVarArr[i7]);
                        }
                        if (instantArr2 != null) {
                            a.c(instantArr2[i7]);
                        }
                        alobVar.h(a.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final Instant g() {
        return uzz.l(getLong(cI(5, ScheduledSendTable.a)));
    }

    public final Instant h() {
        return uzz.l(getLong(cI(3, ScheduledSendTable.a)));
    }

    public final String i() {
        return getString(cI(0, ScheduledSendTable.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
