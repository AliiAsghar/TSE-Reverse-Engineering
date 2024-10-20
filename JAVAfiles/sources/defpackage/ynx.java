package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynx extends agmp implements agmq {
    @Deprecated
    public ynx(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, ynz ynzVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, yoc.a, agoxVar, akkwVar, ynzVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new ynt();
    }

    public final long c() {
        return getLong(cI(4, yoc.a));
    }

    public final ConversationIdType e() {
        return new ConversationIdType(getLong(cI(2, yoc.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(0, yoc.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        int i;
        ConversationIdType[] conversationIdTypeArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        int i2 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                long[] jArr = null;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, yoc.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i4 = 0; i4 < length2; i4++) {
                            messageIdTypeArr2[i4] = new MessageIdType(dl[i4]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{f()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new yim(this, 20));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, yoc.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new ynw(this, i2));
                if (db(2)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(2, yoc.a)));
                        int length3 = dl2.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                        int i5 = 0;
                        while (i5 < length3) {
                            conversationIdTypeArr2[i5] = new ConversationIdType(dl2[i5]);
                            i5++;
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
                int i6 = i;
                agmp.ds(i6, conversationIdTypeArr, new ynw(this, i3));
                int i7 = 3;
                if (db(3)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, yoc.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{g()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(i6, strArr2, new ynw(this, 2));
                if (db(4)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(4, yoc.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                }
                agmp.dr(i6, jArr, new ynw(this, i7));
                alob alobVar = new alob();
                while (i3 < i6) {
                    long j = du[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i3]));
                        String[] strArr3 = yoc.a;
                        int i8 = yaa.a;
                        ynu ynuVar = new ynu();
                        ynuVar.aD();
                        ynuVar.aB();
                        long j2 = du[i3];
                        if (messageIdTypeArr != null) {
                            ynuVar.e(messageIdTypeArr[i3]);
                        }
                        if (strArr != null) {
                            ynuVar.f(strArr[i3]);
                        }
                        if (conversationIdTypeArr != null) {
                            ynuVar.b(conversationIdTypeArr[i3]);
                        }
                        if (strArr2 != null) {
                            ynuVar.c(strArr2[i3]);
                        }
                        if (jArr != null) {
                            ynuVar.d(jArr[i3]);
                        }
                        alobVar.h(ynuVar.a(new yaa(12)));
                    }
                    i3++;
                }
                return alobVar.g();
            }
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(3, yoc.a));
    }

    public final String h() {
        return getString(cI(1, yoc.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
