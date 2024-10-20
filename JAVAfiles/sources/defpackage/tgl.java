package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgl extends agmp implements agmq {
    @Deprecated
    public tgl(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tgm tgmVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tgr.a, agoxVar, akkwVar, tgmVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tgj();
    }

    public final long c() {
        return getLong(cI(3, tgr.a));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cI(2, tgr.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, tgr.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        int i;
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr;
        tqo[] tqoVarArr;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                byte[] bArr = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, tgr.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tfu(this, 9));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, tgr.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            messageIdTypeArr2[i3] = new MessageIdType(dl[i3]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{f()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new tfu(this, 10));
                if (db(2)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(2, tgr.a)));
                        int length3 = dl2.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                        int i4 = 0;
                        while (i4 < length3) {
                            conversationIdTypeArr2[i4] = new ConversationIdType(dl2[i4]);
                            i4++;
                            length = length;
                        }
                        i = length;
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        i = length;
                        conversationIdTypeArr = new ConversationIdType[]{e()};
                    }
                } else {
                    i = length;
                    conversationIdTypeArr = null;
                }
                int i5 = i;
                agmp.ds(i5, conversationIdTypeArr, new tfu(this, 11));
                if (db(3)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(3, tgr.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(i5, jArr, new tfu(this, 12));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, tgr.a)));
                        tqo[] values = tqo.values();
                        int length4 = values.length;
                        tqo[] tqoVarArr2 = new tqo[dk.length];
                        for (int i6 = 0; i6 < dk.length; i6++) {
                            int i7 = dk[i6];
                            if (i7 < length4) {
                                tqoVarArr2[i6] = values[i7];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tqoVarArr = (tqo[]) agnc.z(null, tqoVarArr2, new tqo[0]);
                    } else {
                        tqoVarArr = new tqo[]{g()};
                    }
                } else {
                    tqoVarArr = null;
                }
                agmp.ds(i5, tqoVarArr, new tfu(this, 13));
                alob alobVar = new alob();
                int i8 = 0;
                while (i8 < i5) {
                    long j = du[i8];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i8]));
                        String[] strArr2 = tgr.a;
                        int i9 = tfq.a;
                        ynu ynuVar = new ynu(bArr, bArr);
                        ynuVar.aD();
                        ynuVar.aB();
                        long j2 = du[i8];
                        if (strArr != null) {
                            String str = strArr[i8];
                            ynuVar.aC(i2);
                            ynuVar.a = str;
                        }
                        if (messageIdTypeArr != null) {
                            MessageIdType messageIdType = messageIdTypeArr[i8];
                            ynuVar.aC(1);
                            ynuVar.c = messageIdType;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i8];
                            int i10 = ynuVar.az;
                            if (i10 < 35070) {
                                agnc.t("conversation_id", i10);
                            }
                            ynuVar.aC(2);
                            ynuVar.d = conversationIdType;
                        }
                        hashSet = hashSet2;
                        if (jArr != null) {
                            long j3 = jArr[i8];
                            ynuVar.aC(3);
                            ynuVar.b = j3;
                        }
                        if (tqoVarArr != null) {
                            tqo tqoVar = tqoVarArr[i8];
                            ynuVar.aC(4);
                            ynuVar.e = tqoVar;
                        }
                        tgj tgjVar = new tgj();
                        tgjVar.ar(ynuVar.az());
                        tgjVar.a = ynuVar.a;
                        tgjVar.b = (MessageIdType) ynuVar.c;
                        tgjVar.c = (ConversationIdType) ynuVar.d;
                        tgjVar.d = ynuVar.b;
                        tgjVar.e = (tqo) ynuVar.e;
                        tgjVar.cF = ynuVar.aA();
                        alobVar.h(tgjVar);
                    } else {
                        hashSet = hashSet2;
                    }
                    i8++;
                    hashSet2 = hashSet;
                    i2 = 0;
                    bArr = null;
                }
                return alobVar.g();
            }
        }
        int i11 = alog.d;
        return alsx.a;
    }

    public final tqo g() {
        tqo[] values = tqo.values();
        int i = getInt(cI(4, tgr.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String h() {
        return getString(cI(0, tgr.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
