package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class slh extends agmp implements agmq {
    private final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public slh(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rkw rkwVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, rkz.a, agoxVar, akkwVar, rkwVar);
        this.k = i;
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        if (this.k != 0) {
            return new rkt();
        }
        return new sle();
    }

    public final long c() {
        if (this.k != 0) {
            return getLong(cI(0, rkz.a));
        }
        return getLong(cI(0, slm.a));
    }

    public final ConversationIdType e() {
        if (this.k != 0) {
            return new ConversationIdType(getLong(cI(1, rkz.a)));
        }
        return new ConversationIdType(getLong(cI(1, slm.a)));
    }

    public final boolean f() {
        if (this.k != 0) {
            if (getInt(cI(2, rkz.a)) != 1) {
                return false;
            }
            return true;
        }
        if (getInt(cI(2, slm.a)) != 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr2;
        ConversationIdType[] conversationIdTypeArr2;
        boolean[] zArr;
        boolean[] zArr2 = null;
        if (this.k != 0) {
            agpf agpfVar = agoaVar.a.e;
            long[] du = du(getString(agoaVar.h + 1));
            int length = du.length;
            if (length != 0 && (length != 1 || du[0] != -1)) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(0, rkz.a))));
                    } else {
                        jArr2 = new long[]{c()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new rfv(this, 9));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, rkz.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            conversationIdTypeArr3[i] = new ConversationIdType(dl[i]);
                        }
                        conversationIdTypeArr2 = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr3, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr2 = new ConversationIdType[]{e()};
                    }
                } else {
                    conversationIdTypeArr2 = null;
                }
                agmp.ds(length, conversationIdTypeArr2, new rfv(this, 10));
                if (db(2)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(2, rkz.a))));
                    } else {
                        zArr = new boolean[]{f()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new rfv(this, 11));
                alob alobVar = new alob();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        String[] strArr = rkz.a;
                        int i3 = qxs.a;
                        slf slfVar = new slf(null);
                        slfVar.aD();
                        slfVar.aB();
                        long j2 = du[i2];
                        if (jArr2 != null) {
                            long j3 = jArr2[i2];
                            slfVar.aC(0);
                            slfVar.a = j3;
                        }
                        if (conversationIdTypeArr2 != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr2[i2];
                            slfVar.aC(1);
                            slfVar.b = conversationIdType;
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i2];
                            slfVar.aC(2);
                            slfVar.c = z2;
                        }
                        rkt rktVar = new rkt();
                        rktVar.ar(slfVar.az());
                        rktVar.a = slfVar.a;
                        rktVar.b = slfVar.b;
                        rktVar.c = slfVar.c;
                        rktVar.cF = slfVar.aA();
                        alobVar.h(rktVar);
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
            boolean z3 = this.i.b;
            if (db(0)) {
                if (z3) {
                    jArr = agnc.y(null, dl(getString(cI(0, slm.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length3, jArr, new skg(this, 18));
            if (db(1)) {
                if (z3) {
                    long[] dl2 = dl(getString(cI(1, slm.a)));
                    int length4 = dl2.length;
                    ConversationIdType[] conversationIdTypeArr4 = new ConversationIdType[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        conversationIdTypeArr4[i5] = new ConversationIdType(dl2[i5]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr4, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{e()};
                }
            } else {
                conversationIdTypeArr = null;
            }
            agmp.ds(length3, conversationIdTypeArr, new skg(this, 19));
            if (db(2)) {
                if (z3) {
                    zArr2 = agnc.A(null, dn(getString(cI(2, slm.a))));
                } else {
                    zArr2 = new boolean[]{f()};
                }
            }
            agmp.dt(length3, zArr2, new skg(this, 20));
            alob alobVar2 = new alob();
            for (int i6 = 0; i6 < length3; i6++) {
                long j4 = du2[i6];
                if (j4 > 0 && !hashSet2.contains(Long.valueOf(j4))) {
                    hashSet2.add(Long.valueOf(du2[i6]));
                    String[] strArr2 = slm.a;
                    int i7 = ske.a;
                    slf slfVar2 = new slf();
                    slfVar2.aD();
                    slfVar2.aB();
                    long j5 = du2[i6];
                    if (jArr != null) {
                        long j6 = jArr[i6];
                        slfVar2.aC(0);
                        slfVar2.a = j6;
                    }
                    if (conversationIdTypeArr != null) {
                        ConversationIdType conversationIdType2 = conversationIdTypeArr[i6];
                        slfVar2.aC(1);
                        slfVar2.b = conversationIdType2;
                    }
                    if (zArr2 != null) {
                        boolean z4 = zArr2[i6];
                        slfVar2.aC(2);
                        slfVar2.c = z4;
                    }
                    sle sleVar = new sle();
                    sleVar.ar(slfVar2.az());
                    sleVar.a = slfVar2.a;
                    sleVar.b = slfVar2.b;
                    sleVar.c = slfVar2.c;
                    sleVar.cF = slfVar2.aA();
                    alobVar2.h(sleVar);
                }
            }
            return alobVar2.g();
        }
        int i8 = alog.d;
        return alsx.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public slh(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, slj sljVar, int i) {
        super(agnwVar, cursor, strArr, agpjVarArr, slm.a, agoxVar, akkwVar, sljVar);
        this.k = i;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
