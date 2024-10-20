package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swz extends agmp implements agmq {
    private final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public swz(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rmw rmwVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, rmz.a, agoxVar, akkwVar, rmwVar);
        this.k = i;
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        if (this.k != 0) {
            return new rmt();
        }
        return new swx();
    }

    public final long c() {
        if (this.k != 0) {
            return getLong(cI(0, rmz.a));
        }
        return getLong(cI(0, sxc.a));
    }

    public final MessageIdType e() {
        if (this.k != 0) {
            return new MessageIdType(getLong(cI(1, rmz.a)));
        }
        return new MessageIdType(getLong(cI(1, sxc.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        long[] jArr2;
        MessageIdType[] messageIdTypeArr2;
        if (this.k != 0) {
            agpf agpfVar = agoaVar.a.e;
            long[] du = du(getString(agoaVar.h + 1));
            int length = du.length;
            if (length != 0 && (length != 1 || du[0] != -1)) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(0, rmz.a))));
                    } else {
                        jArr2 = new long[]{c()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new rma(this, 9));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, rmz.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            messageIdTypeArr3[i] = new MessageIdType(dl[i]);
                        }
                        messageIdTypeArr2 = (MessageIdType[]) agnc.z(null, messageIdTypeArr3, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr2 = new MessageIdType[]{e()};
                    }
                } else {
                    messageIdTypeArr2 = null;
                }
                agmp.ds(length, messageIdTypeArr2, new rma(this, 10));
                alob alobVar = new alob();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        String[] strArr = rmz.a;
                        int i3 = rlm.a;
                        tch tchVar = new tch(null, null);
                        tchVar.aD();
                        tchVar.aB();
                        long j2 = du[i2];
                        if (jArr2 != null) {
                            long j3 = jArr2[i2];
                            tchVar.aC(0);
                            tchVar.a = j3;
                        }
                        if (messageIdTypeArr2 != null) {
                            MessageIdType messageIdType = messageIdTypeArr2[i2];
                            tchVar.aC(1);
                            tchVar.b = messageIdType;
                        }
                        rmt rmtVar = new rmt();
                        rmtVar.ar(tchVar.az());
                        rmtVar.a = tchVar.a;
                        rmtVar.b = (MessageIdType) tchVar.b;
                        rmtVar.cF = tchVar.aA();
                        alobVar.h(rmtVar);
                    }
                }
                return alobVar.g();
            }
            int i4 = alog.d;
            return alsx.a;
        }
        agpf agpfVar2 = agoaVar.a.e;
        long[] du2 = du(getString(agoaVar.h + 1));
        int length3 = du2.length;
        if (length3 != 0 && (length3 != 1 || du2[0] != -1)) {
            HashSet hashSet2 = new HashSet();
            boolean z2 = this.i.b;
            if (db(0)) {
                if (z2) {
                    jArr = agnc.y(null, dl(getString(cI(0, sxc.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length3, jArr, new swp(this, 7));
            if (db(1)) {
                if (z2) {
                    long[] dl2 = dl(getString(cI(1, sxc.a)));
                    int length4 = dl2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        messageIdTypeArr4[i5] = new MessageIdType(dl2[i5]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length3, messageIdTypeArr, new swp(this, 8));
            alob alobVar2 = new alob();
            for (int i6 = 0; i6 < length3; i6++) {
                long j4 = du2[i6];
                if (j4 > 0 && !hashSet2.contains(Long.valueOf(j4))) {
                    hashSet2.add(Long.valueOf(du2[i6]));
                    String[] strArr2 = sxc.a;
                    int i7 = swm.a;
                    tch tchVar2 = new tch((byte[]) null);
                    tchVar2.aD();
                    tchVar2.aB();
                    long j5 = du2[i6];
                    if (jArr != null) {
                        long j6 = jArr[i6];
                        tchVar2.aC(0);
                        tchVar2.a = j6;
                    }
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType2 = messageIdTypeArr[i6];
                        tchVar2.aC(1);
                        tchVar2.b = messageIdType2;
                    }
                    swx swxVar = new swx();
                    swxVar.ar(tchVar2.az());
                    swxVar.a = tchVar2.a;
                    swxVar.b = (MessageIdType) tchVar2.b;
                    swxVar.cF = tchVar2.aA();
                    alobVar2.h(swxVar);
                }
            }
            return alobVar2.g();
        }
        int i8 = alog.d;
        return alsx.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public swz(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sxa sxaVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, sxc.a, agoxVar, akkwVar, sxaVar);
        this.k = i;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
