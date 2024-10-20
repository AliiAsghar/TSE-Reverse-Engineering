package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stf extends agmp<stf, sti, stj, stc, ste> implements agmq {
    @Deprecated
    public stf(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sti stiVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, stl.a, agoxVar, akkwVar, stiVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new stc();
    }

    public final int c() {
        return getInt(cI(3, stl.a));
    }

    public final ConversationIdType e() {
        return ruy.b(getString(cI(1, stl.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(2, stl.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        ConversationIdType[] conversationIdTypeArr;
        int i;
        MessageIdType[] messageIdTypeArr;
        int[] iArr;
        aqby aqbyVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            aqby[] aqbyVarArr = null;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, stl.a))), new String[0]);
                } else {
                    strArr = new String[]{h()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new ssl(this, 4));
            if (db(1)) {
                if (z) {
                    String[] dm = dm(getString(cI(1, stl.a)));
                    int length2 = dm.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        conversationIdTypeArr2[i2] = ruy.b(dm[i2]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
            } else {
                conversationIdTypeArr = null;
            }
            agmp.ds(length, conversationIdTypeArr, new ssl(this, 5));
            if (db(2)) {
                if (z) {
                    long[] dl = dl(getString(cI(2, stl.a)));
                    int length3 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length3];
                    int i3 = 0;
                    while (i3 < length3) {
                        messageIdTypeArr2[i3] = new MessageIdType(dl[i3]);
                        i3++;
                        length = length;
                    }
                    i = length;
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    i = length;
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
            } else {
                i = length;
                messageIdTypeArr = null;
            }
            int i4 = i;
            agmp.ds(i4, messageIdTypeArr, new ssl(this, 6));
            if (db(3)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(3, stl.a))));
                } else {
                    iArr = new int[]{c()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(i4, iArr, new ssl(this, 7));
            if (db(4)) {
                if (z) {
                    List cY = cY(getString(cI(4, stl.a)));
                    aqby[] aqbyVarArr2 = new aqby[cY.size()];
                    Iterator it = cY.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] v = agnc.v((String) it.next());
                            int i6 = i5 + 1;
                            if (v == null) {
                                aqbyVar = null;
                            } else {
                                try {
                                    aqbyVar = (aqby) apag.parseFrom(aqby.a, v);
                                } catch (Throwable unused) {
                                    i5 = i6;
                                    aqbyVarArr2[i5] = null;
                                    i5++;
                                }
                            }
                            aqbyVarArr2[i5] = aqbyVar;
                            i5 = i6;
                        } catch (Throwable unused2) {
                        }
                    }
                    aqbyVarArr = (aqby[]) agnc.z(null, aqbyVarArr2, new aqby[0]);
                } else {
                    aqbyVarArr = new aqby[]{g()};
                }
            }
            agmp.ds(i4, aqbyVarArr, new ssl(this, 8));
            alob alobVar = new alob();
            for (int i7 = 0; i7 < i4; i7++) {
                long j = du[i7];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i7]));
                    String[] strArr2 = stl.a;
                    int i8 = ssv.a;
                    std stdVar = new std();
                    stdVar.aD();
                    stdVar.aB();
                    long j2 = du[i7];
                    if (strArr != null) {
                        String str = strArr[i7];
                        stdVar.aC(0);
                        stdVar.a = str;
                    }
                    if (conversationIdTypeArr != null) {
                        stdVar.d(conversationIdTypeArr[i7]);
                    }
                    if (messageIdTypeArr != null) {
                        stdVar.e(messageIdTypeArr[i7]);
                    }
                    if (iArr != null) {
                        stdVar.c(iArr[i7]);
                    }
                    if (aqbyVarArr != null) {
                        stdVar.b(aqbyVarArr[i7]);
                    }
                    alobVar.h(stdVar.a());
                }
            }
            return alobVar.g();
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final aqby g() {
        byte[] blob = getBlob(cI(4, stl.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aqby) apag.parseFrom(aqby.a, blob, aozs.a());
        } catch (Throwable unused) {
            return aqby.a;
        }
    }

    public final String h() {
        return getString(cI(0, stl.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
