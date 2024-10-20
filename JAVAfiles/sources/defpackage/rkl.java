package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rkl extends agmp implements agmq {
    @Deprecated
    public rkl(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rkn rknVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rkq.a, agoxVar, akkwVar, rknVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rki();
    }

    public final int c() {
        return getInt(cI(2, rkq.a));
    }

    public final long e() {
        return getLong(cI(0, rkq.a));
    }

    public final qfe f() {
        return qfe.b(getInt(cI(4, rkq.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        int[] iArr;
        boolean[] zArr;
        qfe[] qfeVarArr;
        int i;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                boolean[] zArr2 = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, rkq.a))));
                    } else {
                        jArr = new long[]{e()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new rfv(this, 3));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, rkq.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            conversationIdTypeArr2[i3] = new ConversationIdType(dl[i3]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{g()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new rfv(this, 4));
                if (db(2)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(2, rkq.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new rfv(this, 5));
                if (db(3)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(3, rkq.a))));
                    } else {
                        zArr = new boolean[]{i()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new rfv(this, 6));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, rkq.a)));
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
                        qfeVarArr = new qfe[]{f()};
                    }
                } else {
                    qfeVarArr = null;
                }
                agmp.ds(length, qfeVarArr, new rfv(this, 7));
                if (db(5)) {
                    if (z) {
                        zArr2 = agnc.A(null, dn(getString(cI(5, rkq.a))));
                    } else {
                        zArr2 = new boolean[]{h()};
                    }
                }
                agmp.dt(length, zArr2, new rfv(this, 8));
                alob alobVar = new alob();
                int i5 = 0;
                while (i5 < length) {
                    long j = du[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i5]));
                        String[] strArr = rkq.a;
                        int i6 = qxs.a;
                        rkj rkjVar = new rkj();
                        rkjVar.aD();
                        rkjVar.aB();
                        long j2 = du[i5];
                        i = length;
                        if (jArr != null) {
                            long j3 = jArr[i5];
                            rkjVar.aC(i2);
                            rkjVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            ConversationIdType conversationIdType = conversationIdTypeArr[i5];
                            rkjVar.aC(1);
                            rkjVar.b = conversationIdType;
                        }
                        if (iArr != null) {
                            int i7 = iArr[i5];
                            rkjVar.aC(2);
                            rkjVar.c = i7;
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i5];
                            int i8 = rkjVar.az;
                            if (i8 < 0) {
                                agnc.t("is_normalized", i8);
                            }
                            rkjVar.aC(3);
                            rkjVar.d = z2;
                        }
                        if (qfeVarArr != null) {
                            qfe qfeVar = qfeVarArr[i5];
                            int i9 = rkjVar.az;
                            if (i9 < 0) {
                                agnc.t("rcs_group_join_status", i9);
                            }
                            rkjVar.aC(4);
                            rkjVar.e = qfeVar;
                        }
                        if (zArr2 != null) {
                            boolean z3 = zArr2[i5];
                            int i10 = rkjVar.az;
                            if (i10 < 70) {
                                agnc.t("is_c2p_only", i10);
                            }
                            rkjVar.aC(5);
                            rkjVar.f = z3;
                        }
                        rki rkiVar = new rki();
                        rkiVar.ar(rkjVar.az());
                        rkiVar.a = rkjVar.a;
                        rkiVar.b = rkjVar.b;
                        rkiVar.c = rkjVar.c;
                        rkiVar.d = rkjVar.d;
                        rkiVar.e = rkjVar.e;
                        rkiVar.f = rkjVar.f;
                        rkiVar.cF = rkjVar.aA();
                        alobVar.h(rkiVar);
                    } else {
                        i = length;
                    }
                    i5++;
                    length = i;
                    i2 = 0;
                }
                return alobVar.g();
            }
        }
        int i11 = alog.d;
        return alsx.a;
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cI(1, rkq.a)));
    }

    public final boolean h() {
        if (getInt(cI(5, rkq.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (getInt(cI(3, rkq.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
