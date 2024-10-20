package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svu extends agmp implements agmq {
    @Deprecated
    public svu(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, svw svwVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, svz.a, agoxVar, akkwVar, svwVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new svr();
    }

    public final ltm c() {
        return ltm.b(getInt(cI(2, svz.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(0, svz.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, svz.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        ltm[] ltmVarArr;
        rve[] rveVarArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, svz.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            messageIdTypeArr3[i] = new MessageIdType(dl[i]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr3, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{e()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new sum(this, 19));
                if (db(1)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(1, svz.a)));
                        int length3 = dl2.length;
                        MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            messageIdTypeArr4[i2] = new MessageIdType(dl2[i2]);
                        }
                        messageIdTypeArr2 = (MessageIdType[]) agnc.z(null, messageIdTypeArr4, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr2 = new MessageIdType[]{f()};
                    }
                } else {
                    messageIdTypeArr2 = null;
                }
                agmp.ds(length, messageIdTypeArr2, new sum(this, 20));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, svz.a)));
                        ltm[] ltmVarArr2 = new ltm[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            ltm b = ltm.b(dk[i3]);
                            if (b != null) {
                                ltmVarArr2[i3] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        ltmVarArr = (ltm[]) agnc.z(null, ltmVarArr2, new ltm[0]);
                    } else {
                        ltmVarArr = new ltm[]{c()};
                    }
                } else {
                    ltmVarArr = null;
                }
                agmp.ds(length, ltmVarArr, new svt(this, 1));
                if (db(3)) {
                    if (z) {
                        String[] dm = dm(getString(cI(3, svz.a)));
                        int length4 = dm.length;
                        rve[] rveVarArr2 = new rve[length4];
                        for (int i4 = 0; i4 < length4; i4++) {
                            rveVarArr2[i4] = rve.a(dm[i4]);
                        }
                        rveVarArr = (rve[]) agnc.z(null, rveVarArr2, new rve[0]);
                    } else {
                        rveVarArr = new rve[]{g()};
                    }
                } else {
                    rveVarArr = null;
                }
                agmp.ds(length, rveVarArr, new svt(this, 0));
                alob alobVar = new alob();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = du[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i5]));
                        String[] strArr = svz.a;
                        int i6 = svc.a;
                        tpu tpuVar = new tpu(null, null);
                        tpuVar.aD();
                        tpuVar.aB();
                        long j2 = du[i5];
                        if (messageIdTypeArr != null) {
                            tpuVar.l(messageIdTypeArr[i5]);
                        }
                        if (messageIdTypeArr2 != null) {
                            tpuVar.m(messageIdTypeArr2[i5]);
                        }
                        if (ltmVarArr != null) {
                            tpuVar.n(ltmVarArr[i5]);
                        }
                        if (rveVarArr != null) {
                            rve rveVar = rveVarArr[i5];
                            tpuVar.aC(3);
                            tpuVar.c = rveVar;
                        }
                        alobVar.h(tpuVar.k(new svc(11)));
                    }
                }
                return alobVar.g();
            }
        }
        int i7 = alog.d;
        return alsx.a;
    }

    public final rve g() {
        return rve.a(getString(cI(3, svz.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
