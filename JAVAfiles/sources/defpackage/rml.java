package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rml extends agmp implements agmq {
    @Deprecated
    public rml(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rmn rmnVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rmq.a, agoxVar, akkwVar, rmnVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rmj();
    }

    public final ltm c() {
        return ltm.b(getInt(cI(2, rmq.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(0, rmq.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, rmq.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        ltm[] ltmVarArr;
        rve[] rveVarArr;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            byte[] bArr = null;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, rmq.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr3[i2] = new MessageIdType(dl[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new rma(this, 5));
            if (db(1)) {
                if (z) {
                    long[] dl2 = dl(getString(cI(1, rmq.a)));
                    int length3 = dl2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        messageIdTypeArr4[i3] = new MessageIdType(dl2[i3]);
                    }
                    messageIdTypeArr2 = (MessageIdType[]) agnc.z(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{f()};
                }
            } else {
                messageIdTypeArr2 = null;
            }
            agmp.ds(length, messageIdTypeArr2, new rma(this, 6));
            if (db(2)) {
                if (z) {
                    int[] dk = dk(getString(cI(2, rmq.a)));
                    ltm[] ltmVarArr2 = new ltm[dk.length];
                    for (int i4 = 0; i4 < dk.length; i4++) {
                        ltm b = ltm.b(dk[i4]);
                        if (b != null) {
                            ltmVarArr2[i4] = b;
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
            agmp.ds(length, ltmVarArr, new rma(this, 7));
            if (db(3)) {
                if (z) {
                    String[] dm = dm(getString(cI(3, rmq.a)));
                    int length4 = dm.length;
                    rve[] rveVarArr2 = new rve[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        rveVarArr2[i5] = rve.a(dm[i5]);
                    }
                    rveVarArr = (rve[]) agnc.z(null, rveVarArr2, new rve[0]);
                } else {
                    rveVarArr = new rve[]{g()};
                }
            } else {
                rveVarArr = null;
            }
            agmp.ds(length, rveVarArr, new rma(this, 8));
            alob alobVar = new alob();
            int i6 = 0;
            while (i6 < length) {
                long j = du[i6];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i6]));
                    String[] strArr = rmq.a;
                    int i7 = rlm.a;
                    tpu tpuVar = new tpu(bArr, bArr, bArr);
                    tpuVar.aD();
                    tpuVar.aB();
                    long j2 = du[i6];
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i6];
                        tpuVar.aC(0);
                        tpuVar.c = messageIdType;
                    }
                    if (messageIdTypeArr2 != null) {
                        MessageIdType messageIdType2 = messageIdTypeArr2[i6];
                        tpuVar.aC(i);
                        tpuVar.d = messageIdType2;
                    }
                    if (ltmVarArr != null) {
                        ltm ltmVar = ltmVarArr[i6];
                        tpuVar.aC(2);
                        tpuVar.b = ltmVar;
                    }
                    if (rveVarArr != null) {
                        rve rveVar = rveVarArr[i6];
                        tpuVar.aC(3);
                        tpuVar.a = rveVar;
                    }
                    rmj rmjVar = new rmj();
                    rmjVar.ar(tpuVar.az());
                    rmjVar.a = (MessageIdType) tpuVar.c;
                    rmjVar.b = (MessageIdType) tpuVar.d;
                    rmjVar.c = (ltm) tpuVar.b;
                    rmjVar.d = (rve) tpuVar.a;
                    rmjVar.cF = tpuVar.aA();
                    alobVar.h(rmjVar);
                }
                i6++;
                i = 1;
                bArr = null;
            }
            return alobVar.g();
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final rve g() {
        return rve.a(getString(cI(3, rmq.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
