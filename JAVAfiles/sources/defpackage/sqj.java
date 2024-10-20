package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqj extends agmp implements agmq {
    @Deprecated
    public sqj(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sql sqlVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sqp.a, agoxVar, akkwVar, sqlVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sqf();
    }

    public final long c() {
        return getLong(cI(3, sqp.a));
    }

    public final long e() {
        return getLong(cI(0, sqp.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, sqp.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        tqg[] tqgVarArr;
        long[] jArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                boolean[] zArr = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sqp.a))));
                    } else {
                        jArr = new long[]{e()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sqi(this, 0));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, sqp.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            messageIdTypeArr2[i2] = new MessageIdType(dl[i2]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{f()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new sqi(this, 2));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, sqp.a)));
                        tqg[] values = tqg.values();
                        int length3 = values.length;
                        tqg[] tqgVarArr2 = new tqg[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            int i4 = dk[i3];
                            if (i4 < length3) {
                                tqgVarArr2[i3] = values[i4];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tqgVarArr = (tqg[]) agnc.z(null, tqgVarArr2, new tqg[0]);
                    } else {
                        tqgVarArr = new tqg[]{g()};
                    }
                } else {
                    tqgVarArr = null;
                }
                agmp.ds(length, tqgVarArr, new sqi(this, 3));
                if (db(3)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(3, sqp.a))));
                    } else {
                        jArr2 = new long[]{c()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new sqi(this, 4));
                if (db(4)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(4, sqp.a))));
                    } else {
                        zArr = new boolean[]{h()};
                    }
                }
                agmp.dt(length, zArr, new sqi(this, 5));
                alob alobVar = new alob();
                int i5 = 0;
                while (i5 < length) {
                    long j = du[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i5]));
                        String[] strArr = sqp.a;
                        int i6 = spk.a;
                        sqg sqgVar = new sqg();
                        sqgVar.aD();
                        sqgVar.aB();
                        long j2 = du[i5];
                        if (jArr != null) {
                            long j3 = jArr[i5];
                            sqgVar.aC(i);
                            sqgVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            sqgVar.b(messageIdTypeArr[i5]);
                        }
                        if (tqgVarArr != null) {
                            sqgVar.d(tqgVarArr[i5]);
                        }
                        if (jArr2 != null) {
                            sqgVar.c(jArr2[i5]);
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i5];
                            int i7 = sqgVar.az;
                            if (i7 < 46030) {
                                agnc.t("flagged_message_notified", i7);
                            }
                            sqgVar.aC(4);
                            sqgVar.e = z2;
                        }
                        alobVar.h(sqgVar.a());
                    }
                    i5++;
                    i = 0;
                }
                return alobVar.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final tqg g() {
        tqg[] values = tqg.values();
        int i = getInt(cI(2, sqp.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final boolean h() {
        if (getInt(cI(4, sqp.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
