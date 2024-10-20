package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sun extends agmp implements agmq {
    @Deprecated
    public sun(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, suo suoVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sur.a, agoxVar, akkwVar, suoVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new suj();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cI(1, sur.a)));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cI(0, sur.a)));
    }

    public final rve f() {
        return rve.a(getString(cI(2, sur.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        MessageIdType[] messageIdTypeArr2;
        rve[] rveVarArr;
        Instant[] instantArr;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            Instant[] instantArr2 = null;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, sur.a)));
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
            agmp.ds(length, messageIdTypeArr, new ssl(this, 19));
            if (db(1)) {
                if (z) {
                    long[] dl2 = dl(getString(cI(1, sur.a)));
                    int length3 = dl2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        messageIdTypeArr4[i3] = new MessageIdType(dl2[i3]);
                    }
                    messageIdTypeArr2 = (MessageIdType[]) agnc.z(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{c()};
                }
            } else {
                messageIdTypeArr2 = null;
            }
            agmp.ds(length, messageIdTypeArr2, new ssl(this, 20));
            if (db(2)) {
                if (z) {
                    String[] dm = dm(getString(cI(2, sur.a)));
                    int length4 = dm.length;
                    rve[] rveVarArr2 = new rve[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        rveVarArr2[i4] = rve.a(dm[i4]);
                    }
                    rveVarArr = (rve[]) agnc.z(null, rveVarArr2, new rve[0]);
                } else {
                    rveVarArr = new rve[]{f()};
                }
            } else {
                rveVarArr = null;
            }
            agmp.ds(length, rveVarArr, new sum(this, 1));
            if (db(3)) {
                if (z) {
                    long[] dl3 = dl(getString(cI(3, sur.a)));
                    int length5 = dl3.length;
                    Instant[] instantArr3 = new Instant[length5];
                    for (int i5 = 0; i5 < length5; i5++) {
                        instantArr3[i5] = uzz.l(dl3[i5]);
                    }
                    instantArr = (Instant[]) agnc.z(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
            } else {
                instantArr = null;
            }
            agmp.ds(length, instantArr, new sum(this, 0));
            if (db(4)) {
                if (z) {
                    long[] dl4 = dl(getString(cI(4, sur.a)));
                    int length6 = dl4.length;
                    Instant[] instantArr4 = new Instant[length6];
                    for (int i6 = 0; i6 < length6; i6++) {
                        instantArr4[i6] = uzz.l(dl4[i6]);
                    }
                    instantArr2 = (Instant[]) agnc.z(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{h()};
                }
            }
            agmp.ds(length, instantArr2, new sum(this, 2));
            alob alobVar = new alob();
            int i7 = 0;
            while (i7 < length) {
                long j = du[i7];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i7]));
                    String[] strArr = sur.a;
                    int i8 = ssv.a;
                    suk sukVar = new suk();
                    sukVar.aD();
                    sukVar.aB();
                    long j2 = du[i7];
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i7];
                        sukVar.aC(0);
                        sukVar.a = messageIdType;
                    }
                    if (messageIdTypeArr2 != null) {
                        MessageIdType messageIdType2 = messageIdTypeArr2[i7];
                        sukVar.aC(i);
                        sukVar.b = messageIdType2;
                    }
                    if (rveVarArr != null) {
                        rve rveVar = rveVarArr[i7];
                        sukVar.aC(2);
                        sukVar.c = rveVar;
                    }
                    if (instantArr != null) {
                        Instant instant = instantArr[i7];
                        sukVar.aC(3);
                        sukVar.d = instant;
                    }
                    if (instantArr2 != null) {
                        Instant instant2 = instantArr2[i7];
                        sukVar.aC(4);
                        sukVar.e = instant2;
                    }
                    suj sujVar = new suj();
                    sujVar.ar(sukVar.az());
                    sujVar.a = sukVar.a;
                    sujVar.b = sukVar.b;
                    sujVar.c = sukVar.c;
                    sujVar.d = sukVar.d;
                    sujVar.e = sukVar.e;
                    sujVar.cF = sukVar.aA();
                    alobVar.h(sujVar);
                }
                i7++;
                i = 1;
            }
            return alobVar.g();
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final Instant g() {
        return uzz.l(getLong(cI(3, sur.a)));
    }

    public final Instant h() {
        return uzz.l(getLong(cI(4, sur.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
