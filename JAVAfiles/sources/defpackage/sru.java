package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sru extends agmp implements agmq {
    @Deprecated
    public sru(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, srv srvVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, srz.a, agoxVar, akkwVar, srvVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new srp();
    }

    public final long c() {
        return getLong(cI(0, srz.a));
    }

    public final long e() {
        return getLong(cI(7, srz.a));
    }

    public final long f() {
        return getLong(cI(8, srz.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        String[] strArr;
        String[] strArr2;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        uyf[] uyfVarArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        char c;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, srz.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new srt(this, 0));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, srz.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            conversationIdTypeArr2[i] = new ConversationIdType(dl[i]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{g()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new srt(this, 2));
                if (db(2)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(2, srz.a))), new String[0]);
                    } else {
                        strArr = new String[]{i()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new srt(this, 3));
                if (db(3)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, srz.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{j()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new srt(this, 4));
                if (db(4)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(4, srz.a))));
                    } else {
                        zArr = new boolean[]{l()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new srt(this, 5));
                if (db(5)) {
                    if (z) {
                        zArr2 = agnc.A(null, dn(getString(cI(5, srz.a))));
                    } else {
                        zArr2 = new boolean[]{k()};
                    }
                } else {
                    zArr2 = null;
                }
                agmp.dt(length, zArr2, new srt(this, 6));
                if (db(6)) {
                    if (z) {
                        int[] dk = dk(getString(cI(6, srz.a)));
                        uyf[] values = uyf.values();
                        int length3 = values.length;
                        uyf[] uyfVarArr2 = new uyf[dk.length];
                        zArr3 = zArr2;
                        for (int i2 = 0; i2 < dk.length; i2++) {
                            int i3 = dk[i2];
                            if (i3 < length3) {
                                uyfVarArr2[i2] = values[i3];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        uyfVarArr = (uyf[]) agnc.z(null, uyfVarArr2, new uyf[0]);
                    } else {
                        zArr3 = zArr2;
                        uyfVarArr = new uyf[]{h()};
                    }
                } else {
                    zArr3 = zArr2;
                    uyfVarArr = null;
                }
                char c2 = 7;
                agmp.ds(length, uyfVarArr, new srt(this, 7));
                if (db(7)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(7, srz.a))));
                    } else {
                        jArr2 = new long[]{e()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new srt(this, 8));
                if (db(8)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(8, srz.a))));
                    } else {
                        jArr3 = new long[]{f()};
                    }
                } else {
                    jArr3 = null;
                }
                agmp.dr(length, jArr3, new srt(this, 9));
                alob alobVar = new alob();
                int i4 = 0;
                while (i4 < length) {
                    long j = du[i4];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i4]));
                        String[] strArr3 = srz.a;
                        int i5 = spk.a;
                        srq srqVar = new srq();
                        srqVar.aD();
                        srqVar.aB();
                        long j2 = du[i4];
                        hashSet = hashSet2;
                        if (jArr != null) {
                            long j3 = jArr[i4];
                            srqVar.aC(0);
                            srqVar.a = j3;
                        }
                        if (conversationIdTypeArr != null) {
                            srqVar.c(conversationIdTypeArr[i4]);
                        }
                        if (strArr != null) {
                            srqVar.b(strArr[i4]);
                        }
                        if (strArr2 != null) {
                            srqVar.e(strArr2[i4]);
                        }
                        if (zArr != null) {
                            srqVar.f(zArr[i4]);
                        }
                        if (zArr3 != null) {
                            srqVar.d(zArr3[i4]);
                        }
                        if (uyfVarArr != null) {
                            uyf uyfVar = uyfVarArr[i4];
                            int i6 = srqVar.az;
                            if (i6 < 59030) {
                                agnc.t("conversation_status", i6);
                            }
                            srqVar.aC(6);
                            srqVar.g = uyfVar;
                        }
                        if (jArr2 != null) {
                            long j4 = jArr2[i4];
                            int i7 = srqVar.az;
                            jArr4 = du;
                            if (i7 < 59040) {
                                agnc.t("last_action_timestamp", i7);
                            }
                            c = 7;
                            srqVar.aC(7);
                            srqVar.h = j4;
                        } else {
                            jArr4 = du;
                            c = 7;
                        }
                        if (jArr3 != null) {
                            srqVar.g(jArr3[i4]);
                        }
                        alobVar.h(srqVar.a());
                    } else {
                        jArr4 = du;
                        c = c2;
                        hashSet = hashSet2;
                    }
                    i4++;
                    c2 = c;
                    hashSet2 = hashSet;
                    du = jArr4;
                }
                return alobVar.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cI(1, srz.a)));
    }

    public final uyf h() {
        uyf[] values = uyf.values();
        int i = getInt(cI(6, srz.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cI(2, srz.a));
    }

    public final String j() {
        return getString(cI(3, srz.a));
    }

    public final boolean k() {
        if (getInt(cI(5, srz.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (getInt(cI(4, srz.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
