package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjp extends agmp implements agmq {
    @Deprecated
    public sjp(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sjr sjrVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sjv.a, agoxVar, akkwVar, sjrVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sjn();
    }

    public final long c() {
        return getLong(cI(6, sjv.a));
    }

    public final long e() {
        return getLong(cI(0, sjv.a));
    }

    public final long f() {
        return getLong(cI(5, sjv.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        qhy[] qhyVarArr;
        qhx[] qhxVarArr;
        String[] strArr;
        long[] jArr2;
        long[] jArr3;
        HashSet hashSet;
        ConversationIdType[] conversationIdTypeArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                byte[] bArr = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sjv.a))));
                    } else {
                        jArr = new long[]{e()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sjg(this, 4));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, sjv.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            conversationIdTypeArr3[i2] = new ConversationIdType(dl[i2]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr3, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{i()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new sjg(this, 5));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, sjv.a)));
                        qhy[] qhyVarArr2 = new qhy[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            qhy b = qhy.b(dk[i3]);
                            if (b != null) {
                                qhyVarArr2[i3] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        qhyVarArr = (qhy[]) agnc.z(null, qhyVarArr2, new qhy[0]);
                    } else {
                        qhyVarArr = new qhy[]{h()};
                    }
                } else {
                    qhyVarArr = null;
                }
                agmp.ds(length, qhyVarArr, new sjg(this, 6));
                if (db(3)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(3, sjv.a)));
                        qhx[] qhxVarArr2 = new qhx[dk2.length];
                        for (int i4 = 0; i4 < dk2.length; i4++) {
                            qhx b2 = qhx.b(dk2[i4]);
                            if (b2 != null) {
                                qhxVarArr2[i4] = b2;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        qhxVarArr = (qhx[]) agnc.z(null, qhxVarArr2, new qhx[0]);
                    } else {
                        qhxVarArr = new qhx[]{g()};
                    }
                } else {
                    qhxVarArr = null;
                }
                agmp.ds(length, qhxVarArr, new sjg(this, 7));
                if (db(4)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(4, sjv.a))), new String[0]);
                    } else {
                        strArr = new String[]{j()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sjg(this, 8));
                if (db(5)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(5, sjv.a))));
                    } else {
                        jArr2 = new long[]{f()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new sjg(this, 9));
                if (db(6)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(6, sjv.a))));
                    } else {
                        jArr3 = new long[]{c()};
                    }
                } else {
                    jArr3 = null;
                }
                agmp.dr(length, jArr3, new sjg(this, 10));
                alob alobVar = new alob();
                int i5 = 0;
                while (i5 < length) {
                    long j = du[i5];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i5]));
                        String[] strArr2 = sjv.a;
                        int i6 = shg.a;
                        sma smaVar = new sma(bArr);
                        smaVar.aD();
                        smaVar.aB();
                        long j2 = du[i5];
                        conversationIdTypeArr2 = conversationIdTypeArr;
                        if (jArr != null) {
                            long j3 = jArr[i5];
                            smaVar.aC(i);
                            smaVar.a = j3;
                        }
                        if (conversationIdTypeArr2 != null) {
                            smaVar.d(conversationIdTypeArr2[i5]);
                        }
                        if (qhyVarArr != null) {
                            smaVar.c(qhyVarArr[i5]);
                        }
                        if (qhxVarArr != null) {
                            smaVar.b(qhxVarArr[i5]);
                        }
                        if (strArr != null) {
                            smaVar.e(strArr[i5]);
                        }
                        hashSet = hashSet2;
                        if (jArr2 != null) {
                            long j4 = jArr2[i5];
                            int i7 = smaVar.az;
                            if (i7 < 58840) {
                                agnc.t("impression_count", i7);
                            }
                            smaVar.aC(5);
                            smaVar.c = j4;
                        }
                        if (jArr3 != null) {
                            long j5 = jArr3[i5];
                            int i8 = smaVar.az;
                            if (i8 < 58840) {
                                agnc.t("generated_timestamp", i8);
                            }
                            smaVar.aC(6);
                            smaVar.b = j5;
                        }
                        alobVar.h(smaVar.a());
                    } else {
                        hashSet = hashSet2;
                        conversationIdTypeArr2 = conversationIdTypeArr;
                    }
                    i5++;
                    conversationIdTypeArr = conversationIdTypeArr2;
                    hashSet2 = hashSet;
                    i = 0;
                    bArr = null;
                }
                return alobVar.g();
            }
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final qhx g() {
        return qhx.b(getInt(cI(3, sjv.a)));
    }

    public final qhy h() {
        return qhy.b(getInt(cI(2, sjv.a)));
    }

    public final ConversationIdType i() {
        return new ConversationIdType(getLong(cI(1, sjv.a)));
    }

    public final String j() {
        return getString(cI(4, sjv.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
