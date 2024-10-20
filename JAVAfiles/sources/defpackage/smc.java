package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smc extends agmp implements agmq {
    @Deprecated
    public smc(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, smd smdVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, smf.a, agoxVar, akkwVar, smdVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new slz();
    }

    public final long c() {
        return getLong(cI(0, smf.a));
    }

    public final long e() {
        return getLong(cI(2, smf.a));
    }

    public final long f() {
        return getLong(cI(4, smf.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        Instant[] instantArr;
        long[] jArr2;
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr3;
        qfe[] qfeVarArr;
        long[] jArr4;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                rxg[] rxgVarArr = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, smf.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new slr(this, 2));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, smf.a)));
                        int length2 = dl.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            instantArr2[i2] = uzz.l(dl[i2]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{j()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new slr(this, 3));
                if (db(2)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(2, smf.a))));
                    } else {
                        jArr2 = new long[]{e()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new slr(this, 4));
                if (db(3)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(3, smf.a)));
                        int length3 = dl2.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length3];
                        int i3 = 0;
                        while (i3 < length3) {
                            conversationIdTypeArr2[i3] = new ConversationIdType(dl2[i3]);
                            i3++;
                            length3 = length3;
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{h()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new slr(this, 5));
                if (db(4)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(4, smf.a))));
                    } else {
                        jArr3 = new long[]{f()};
                    }
                } else {
                    jArr3 = null;
                }
                agmp.dr(length, jArr3, new slr(this, 6));
                if (db(5)) {
                    if (z) {
                        int[] dk = dk(getString(cI(5, smf.a)));
                        qfe[] qfeVarArr2 = new qfe[dk.length];
                        for (int i4 = 0; i4 < dk.length; i4++) {
                            qfe b = qfe.b(dk[i4]);
                            if (b != null) {
                                qfeVarArr2[i4] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        qfeVarArr = (qfe[]) agnc.z(null, qfeVarArr2, new qfe[0]);
                    } else {
                        qfeVarArr = new qfe[]{g()};
                    }
                } else {
                    qfeVarArr = null;
                }
                agmp.ds(length, qfeVarArr, new slr(this, 7));
                if (db(6)) {
                    if (z) {
                        String[] dm = dm(getString(cI(6, smf.a)));
                        int length4 = dm.length;
                        rxg[] rxgVarArr2 = new rxg[length4];
                        for (int i5 = 0; i5 < length4; i5++) {
                            rxgVarArr2[i5] = vcp.l(dm[i5]);
                        }
                        rxgVarArr = (rxg[]) agnc.z(null, rxgVarArr2, new rxg[0]);
                    } else {
                        rxgVarArr = new rxg[]{i()};
                    }
                }
                agmp.ds(length, rxgVarArr, new slr(this, 8));
                alob alobVar = new alob();
                int i6 = 0;
                while (i6 < length) {
                    long j = du[i6];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i6]));
                        String[] strArr = smf.a;
                        int i7 = ske.a;
                        sma smaVar = new sma();
                        smaVar.aD();
                        smaVar.aB();
                        long j2 = du[i6];
                        jArr4 = du;
                        if (jArr != null) {
                            long j3 = jArr[i6];
                            smaVar.aC(i);
                            smaVar.a = j3;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i6];
                            smaVar.aC(1);
                            smaVar.d = instant;
                        }
                        hashSet = hashSet2;
                        if (jArr2 != null) {
                            long j4 = jArr2[i6];
                            smaVar.aC(2);
                            smaVar.b = j4;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i6];
                            smaVar.aC(3);
                            smaVar.e = conversationIdType;
                        }
                        if (jArr3 != null) {
                            long j5 = jArr3[i6];
                            smaVar.aC(4);
                            smaVar.c = j5;
                        }
                        if (qfeVarArr != null) {
                            qfe qfeVar = qfeVarArr[i6];
                            smaVar.aC(5);
                            smaVar.f = qfeVar;
                        }
                        if (rxgVarArr != null) {
                            rxg rxgVar = rxgVarArr[i6];
                            smaVar.aC(6);
                            smaVar.g = rxgVar;
                        }
                        slz slzVar = new slz();
                        slzVar.ar(smaVar.az());
                        slzVar.a = smaVar.a;
                        slzVar.b = (Instant) smaVar.d;
                        slzVar.c = smaVar.b;
                        slzVar.d = (ConversationIdType) smaVar.e;
                        slzVar.e = smaVar.c;
                        slzVar.f = (qfe) smaVar.f;
                        slzVar.g = (rxg) smaVar.g;
                        slzVar.cF = smaVar.aA();
                        alobVar.h(slzVar);
                    } else {
                        jArr4 = du;
                        hashSet = hashSet2;
                    }
                    i6++;
                    du = jArr4;
                    hashSet2 = hashSet;
                    i = 0;
                }
                return alobVar.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final qfe g() {
        return qfe.b(getInt(cI(5, smf.a)));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cI(3, smf.a)));
    }

    public final rxg i() {
        return vcp.l(getString(cI(6, smf.a)));
    }

    public final Instant j() {
        return uzz.l(getLong(cI(1, smf.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
