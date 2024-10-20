package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rmb extends agmp implements agmq {
    @Deprecated
    public rmb(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rme rmeVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rmh.a, agoxVar, akkwVar, rmeVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rlx();
    }

    public final long c() {
        return getLong(cI(0, rmh.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(1, rmh.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(3, rmh.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        wks[] wksVarArr;
        int i;
        MessageIdType[] messageIdTypeArr2;
        wky[] wkyVarArr;
        long[] jArr2;
        wku wkuVar;
        wks wksVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                wku[] wkuVarArr = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, rmh.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new rle(this, 20));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, rmh.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            messageIdTypeArr3[i3] = new MessageIdType(dl[i3]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr3, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{e()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new rma(this, 1));
                if (db(2)) {
                    if (z) {
                        List cY = cY(getString(cI(2, rmh.a)));
                        wks[] wksVarArr2 = new wks[cY.size()];
                        Iterator it = cY.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i5 = i4 + 1;
                                if (v == null) {
                                    wksVar = null;
                                } else {
                                    try {
                                        wksVar = (wks) apag.parseFrom(wks.a, v);
                                    } catch (Throwable unused) {
                                        i4 = i5;
                                        wksVarArr2[i4] = null;
                                        i4++;
                                    }
                                }
                                wksVarArr2[i4] = wksVar;
                                i4 = i5;
                            } catch (Throwable unused2) {
                            }
                        }
                        wksVarArr = (wks[]) agnc.z(null, wksVarArr2, new wks[0]);
                    } else {
                        wksVarArr = new wks[]{g()};
                    }
                } else {
                    wksVarArr = null;
                }
                agmp.ds(length, wksVarArr, new rma(this, 0));
                if (db(3)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(3, rmh.a)));
                        int length3 = dl2.length;
                        MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                        int i6 = 0;
                        while (i6 < length3) {
                            messageIdTypeArr4[i6] = new MessageIdType(dl2[i6]);
                            i6++;
                            length = length;
                        }
                        i = length;
                        messageIdTypeArr2 = (MessageIdType[]) agnc.z(null, messageIdTypeArr4, new MessageIdType[0]);
                    } else {
                        i = length;
                        messageIdTypeArr2 = new MessageIdType[]{f()};
                    }
                } else {
                    i = length;
                    messageIdTypeArr2 = null;
                }
                int i7 = i;
                agmp.ds(i7, messageIdTypeArr2, new rma(this, 2));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, rmh.a)));
                        wky[] wkyVarArr2 = new wky[dk.length];
                        for (int i8 = 0; i8 < dk.length; i8++) {
                            wky b = wky.b(dk[i8]);
                            if (b != null) {
                                wkyVarArr2[i8] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        wkyVarArr = (wky[]) agnc.z(null, wkyVarArr2, new wky[0]);
                    } else {
                        wkyVarArr = new wky[]{i()};
                    }
                } else {
                    wkyVarArr = null;
                }
                agmp.ds(i7, wkyVarArr, new rma(this, 3));
                if (db(5)) {
                    if (z) {
                        List cY2 = cY(getString(cI(5, rmh.a)));
                        wku[] wkuVarArr2 = new wku[cY2.size()];
                        Iterator it2 = cY2.iterator();
                        int i9 = 0;
                        while (it2.hasNext()) {
                            try {
                                byte[] v2 = agnc.v((String) it2.next());
                                int i10 = i9 + 1;
                                if (v2 == null) {
                                    wkuVar = null;
                                } else {
                                    try {
                                        wkuVar = (wku) apag.parseFrom(wku.a, v2);
                                    } catch (Throwable unused3) {
                                        i9 = i10;
                                        wkuVarArr2[i9] = null;
                                        i9++;
                                    }
                                }
                                wkuVarArr2[i9] = wkuVar;
                                i9 = i10;
                            } catch (Throwable unused4) {
                            }
                        }
                        wkuVarArr = (wku[]) agnc.z(null, wkuVarArr2, new wku[0]);
                    } else {
                        wkuVarArr = new wku[]{h()};
                    }
                }
                agmp.ds(i7, wkuVarArr, new rma(this, 4));
                alob alobVar = new alob();
                int i11 = 0;
                while (i11 < i7) {
                    long j = du[i11];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i11]));
                        String[] strArr = rmh.a;
                        int i12 = rlm.a;
                        rly rlyVar = new rly();
                        rlyVar.aD();
                        rlyVar.aB();
                        long j2 = du[i11];
                        if (jArr != null) {
                            long j3 = jArr[i11];
                            rlyVar.aC(i2);
                            rlyVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            MessageIdType messageIdType = messageIdTypeArr[i11];
                            rlyVar.aC(1);
                            rlyVar.b = messageIdType;
                        }
                        if (wksVarArr != null) {
                            wks wksVar2 = wksVarArr[i11];
                            rlyVar.aC(2);
                            rlyVar.c = wksVar2;
                        }
                        if (messageIdTypeArr2 != null) {
                            MessageIdType messageIdType2 = messageIdTypeArr2[i11];
                            rlyVar.aC(3);
                            rlyVar.d = messageIdType2;
                        }
                        if (wkyVarArr != null) {
                            wky wkyVar = wkyVarArr[i11];
                            rlyVar.aC(4);
                            rlyVar.e = wkyVar;
                        }
                        if (wkuVarArr != null) {
                            wku wkuVar2 = wkuVarArr[i11];
                            rlyVar.aC(5);
                            rlyVar.f = wkuVar2;
                        }
                        rlx rlxVar = new rlx();
                        rlxVar.ar(rlyVar.az());
                        jArr2 = du;
                        rlxVar.a = rlyVar.a;
                        rlxVar.b = rlyVar.b;
                        rlxVar.c = rlyVar.c;
                        rlxVar.d = rlyVar.d;
                        rlxVar.e = rlyVar.e;
                        rlxVar.f = rlyVar.f;
                        rlxVar.cF = rlyVar.aA();
                        alobVar.h(rlxVar);
                    } else {
                        jArr2 = du;
                    }
                    i11++;
                    du = jArr2;
                    i2 = 0;
                }
                return alobVar.g();
            }
        }
        int i13 = alog.d;
        return alsx.a;
    }

    public final wks g() {
        byte[] blob = getBlob(cI(2, rmh.a));
        if (blob == null) {
            return null;
        }
        try {
            return (wks) apag.parseFrom(wks.a, blob, aozs.a());
        } catch (Throwable unused) {
            return wks.a;
        }
    }

    public final wku h() {
        byte[] blob = getBlob(cI(5, rmh.a));
        if (blob == null) {
            return null;
        }
        try {
            return (wku) apag.parseFrom(wku.a, blob, aozs.a());
        } catch (Throwable unused) {
            return wku.a;
        }
    }

    public final wky i() {
        return wky.b(getInt(cI(4, rmh.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
