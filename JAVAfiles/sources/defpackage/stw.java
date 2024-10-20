package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stw extends agmp implements agmq {
    @Deprecated
    public stw(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sty styVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sub.a, agoxVar, akkwVar, styVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new stu();
    }

    public final long c() {
        return getLong(cI(0, sub.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(1, sub.a)));
    }

    public final aqaz f() {
        return aqaz.b(getInt(cI(2, sub.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        aqaz[] aqazVarArr;
        aqcw[] aqcwVarArr;
        int i;
        aqaz[] aqazVarArr2;
        char c;
        aqcw aqcwVar;
        agpf agpfVar = agoaVar.a.e;
        int i2 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sub.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new ssl(this, 11));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, sub.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        messageIdTypeArr2[i3] = new MessageIdType(dl[i3]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new ssl(this, 12));
            char c2 = 2;
            if (db(2)) {
                if (z) {
                    int[] dk = dk(getString(cI(2, sub.a)));
                    aqaz[] aqazVarArr3 = new aqaz[dk.length];
                    for (int i4 = 0; i4 < dk.length; i4++) {
                        aqaz b = aqaz.b(dk[i4]);
                        if (b != null) {
                            aqazVarArr3[i4] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    aqazVarArr = (aqaz[]) agnc.z(null, aqazVarArr3, new aqaz[0]);
                } else {
                    aqazVarArr = new aqaz[]{f()};
                }
            } else {
                aqazVarArr = null;
            }
            agmp.ds(length, aqazVarArr, new ssl(this, 13));
            if (db(3)) {
                if (z) {
                    if (!isNull(cI(3, sub.a))) {
                        List cY = cY(getString(cI(3, sub.a)));
                        aqcw[] aqcwVarArr2 = new aqcw[cY.size()];
                        Iterator it = cY.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i6 = i5 + 1;
                                if (v == null) {
                                    aqcwVar = null;
                                } else {
                                    try {
                                        aqcwVar = (aqcw) apag.parseFrom(aqcw.a, v);
                                    } catch (Throwable unused) {
                                        i5 = i6;
                                        aqcwVarArr2[i5] = null;
                                        i5++;
                                    }
                                }
                                aqcwVarArr2[i5] = aqcwVar;
                                i5 = i6;
                            } catch (Throwable unused2) {
                            }
                        }
                        aqcwVarArr = (aqcw[]) agnc.z(null, aqcwVarArr2, new aqcw[0]);
                    } else {
                        throw new IllegalStateException("found null in cursor for column classification_details");
                    }
                } else {
                    aqcwVarArr = new aqcw[]{g()};
                }
            } else {
                aqcwVarArr = null;
            }
            agmp.ds(length, aqcwVarArr, new ssl(this, 14));
            alob alobVar = new alob();
            int i7 = 0;
            while (i7 < length) {
                long j = du[i7];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i7]));
                    String[] strArr = sub.a;
                    int i8 = ssv.a;
                    tcs tcsVar = new tcs((char[]) null);
                    tcsVar.aD();
                    tcsVar.aB();
                    long j2 = du[i7];
                    aqazVarArr2 = aqazVarArr;
                    if (jArr != null) {
                        long j3 = jArr[i7];
                        tcsVar.aC(0);
                        tcsVar.a = j3;
                    }
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i7];
                        tcsVar.aC(i2);
                        tcsVar.d = messageIdType;
                    }
                    if (aqazVarArr2 != null) {
                        aqaz aqazVar = aqazVarArr2[i7];
                        c = 2;
                        tcsVar.aC(2);
                        tcsVar.b = aqazVar;
                    } else {
                        c = 2;
                    }
                    if (aqcwVarArr != null) {
                        aqcw aqcwVar2 = aqcwVarArr[i7];
                        int i9 = tcsVar.az;
                        if (i9 < 58480) {
                            agnc.t("classification_details", i9);
                        }
                        tcsVar.aC(3);
                        tcsVar.c = aqcwVar2;
                    }
                    stu stuVar = new stu();
                    stuVar.ar(tcsVar.az());
                    Object obj = tcsVar.c;
                    if (obj != null) {
                        i = length;
                        stuVar.a = tcsVar.a;
                        stuVar.b = (MessageIdType) tcsVar.d;
                        stuVar.c = (aqaz) tcsVar.b;
                        stuVar.d = (aqcw) obj;
                        stuVar.cF = tcsVar.aA();
                        alobVar.h(stuVar);
                    } else {
                        throw new IllegalStateException("field classification_details cannot be null");
                    }
                } else {
                    i = length;
                    aqazVarArr2 = aqazVarArr;
                    c = c2;
                }
                i7++;
                length = i;
                c2 = c;
                aqazVarArr = aqazVarArr2;
                i2 = 1;
            }
            return alobVar.g();
        }
        int i10 = alog.d;
        return alsx.a;
    }

    public final aqcw g() {
        if (!isNull(cI(3, sub.a))) {
            byte[] blob = getBlob(cI(3, sub.a));
            if (blob == null) {
                return null;
            }
            try {
                return (aqcw) apag.parseFrom(aqcw.a, blob, aozs.a());
            } catch (Throwable unused) {
                return aqcw.a;
            }
        }
        throw new IllegalStateException("found null in cursor for column classification_details");
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
