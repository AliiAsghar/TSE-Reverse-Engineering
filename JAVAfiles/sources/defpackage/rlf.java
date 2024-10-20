package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rlf extends agmp implements agmq {
    @Deprecated
    public rlf(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rlh rlhVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rlk.a, agoxVar, akkwVar, rlhVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rlb();
    }

    public final int c() {
        return getInt(cI(16, rlk.a));
    }

    public final int e() {
        return getInt(cI(15, rlk.a));
    }

    public final int f() {
        return getInt(cI(17, rlk.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        qwe[] qweVarArr;
        String[] strArr;
        tqc[] tqcVarArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        tqh[] tqhVarArr;
        int i;
        boolean[] zArr;
        int i2;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        long[] jArr2;
        vtm[] vtmVarArr;
        qpd[] qpdVarArr;
        long[] jArr3;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        String[] strArr12;
        String[] strArr13;
        vtm[] vtmVarArr2;
        qpd[] qpdVarArr2;
        xxw[] xxwVarArr;
        long[] jArr4;
        xxw[] xxwVarArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, rlk.a)));
                    int length2 = dl.length;
                    ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        conversationIdTypeArr2[i3] = new ConversationIdType(dl[i3]);
                    }
                    conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                } else {
                    conversationIdTypeArr = new ConversationIdType[]{k()};
                }
            } else {
                conversationIdTypeArr = null;
            }
            agmp.ds(length, conversationIdTypeArr, new rfv(this, 12));
            if (db(1)) {
                if (z) {
                    String[] dm = dm(getString(cI(1, rlk.a)));
                    int length3 = dm.length;
                    qwe[] qweVarArr2 = new qwe[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        qweVarArr2[i4] = riw.m(dm[i4]);
                    }
                    qweVarArr = (qwe[]) agnc.z(null, qweVarArr2, new qwe[0]);
                } else {
                    qweVarArr = new qwe[]{j()};
                }
            } else {
                qweVarArr = null;
            }
            agmp.ds(length, qweVarArr, new rfv(this, 14));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, rlk.a))), new String[0]);
                } else {
                    strArr = new String[]{u()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new rfv(this, 15));
            if (db(3)) {
                if (z) {
                    int[] dk = dk(getString(cI(3, rlk.a)));
                    tqc[] tqcVarArr2 = new tqc[dk.length];
                    for (int i5 = 0; i5 < dk.length; i5++) {
                        tqc a = tqc.a(dk[i5]);
                        if (a != null) {
                            tqcVarArr2[i5] = a;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqcVarArr = (tqc[]) agnc.z(null, tqcVarArr2, new tqc[0]);
                } else {
                    tqcVarArr = new tqc[]{l()};
                }
            } else {
                tqcVarArr = null;
            }
            agmp.ds(length, tqcVarArr, new rfv(this, 16));
            if (db(4)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(4, rlk.a))));
                } else {
                    jArr = new long[]{g()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new rfv(this, 17));
            if (db(5)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(5, rlk.a))), new String[0]);
                } else {
                    strArr2 = new String[]{v()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new rfv(this, 18));
            if (db(6)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(6, rlk.a))), new String[0]);
                } else {
                    strArr3 = new String[]{q()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new rfv(this, 19));
            if (db(7)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(7, rlk.a)));
                    tqh[] values = tqh.values();
                    int length4 = values.length;
                    tqh[] tqhVarArr2 = new tqh[dk2.length];
                    strArr4 = strArr3;
                    strArr5 = strArr2;
                    for (int i6 = 0; i6 < dk2.length; i6++) {
                        int i7 = dk2[i6];
                        if (i7 < length4) {
                            tqhVarArr2[i6] = values[i7];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqhVarArr = (tqh[]) agnc.z(null, tqhVarArr2, new tqh[0]);
                } else {
                    strArr4 = strArr3;
                    strArr5 = strArr2;
                    tqhVarArr = new tqh[]{m()};
                }
            } else {
                strArr4 = strArr3;
                strArr5 = strArr2;
                tqhVarArr = null;
            }
            agmp.ds(length, tqhVarArr, new rfv(this, 20));
            if (db(8)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(8, rlk.a))));
                    i = 1;
                } else {
                    i = 1;
                    zArr = new boolean[]{w()};
                }
            } else {
                i = 1;
                zArr = null;
            }
            agmp.dt(length, zArr, new rle(this, i));
            if (db(9)) {
                if (z) {
                    i2 = 0;
                    strArr6 = (String[]) agnc.z(null, dm(getString(cI(9, rlk.a))), new String[0]);
                } else {
                    i2 = 0;
                    strArr6 = new String[]{t()};
                }
            } else {
                i2 = 0;
                strArr6 = null;
            }
            agmp.ds(length, strArr6, new rle(this, i2));
            if (db(10)) {
                if (z) {
                    strArr7 = (String[]) agnc.z(null, dm(getString(cI(10, rlk.a))), new String[i2]);
                } else {
                    strArr7 = new String[]{s()};
                }
            } else {
                strArr7 = null;
            }
            agmp.ds(length, strArr7, new rle(this, 2));
            if (db(11)) {
                if (z) {
                    strArr8 = strArr7;
                    strArr9 = (String[]) agnc.z(null, dm(getString(cI(11, rlk.a))), new String[0]);
                } else {
                    strArr8 = strArr7;
                    strArr9 = new String[]{r()};
                }
            } else {
                strArr8 = strArr7;
                strArr9 = null;
            }
            agmp.ds(length, strArr9, new rle(this, 3));
            if (db(12)) {
                if (z) {
                    long[] dl2 = dl(getString(cI(12, rlk.a)));
                    int length5 = dl2.length;
                    strArr11 = strArr9;
                    vtm[] vtmVarArr3 = new vtm[length5];
                    strArr10 = strArr6;
                    int i8 = 0;
                    while (i8 < length5) {
                        vtmVarArr3[i8] = new vtm(dl2[i8]);
                        i8++;
                        jArr = jArr;
                        length5 = length5;
                        dl2 = dl2;
                    }
                    jArr2 = jArr;
                    vtmVarArr = (vtm[]) agnc.z(null, vtmVarArr3, new vtm[0]);
                } else {
                    strArr10 = strArr6;
                    strArr11 = strArr9;
                    jArr2 = jArr;
                    vtmVarArr = new vtm[]{n()};
                }
            } else {
                strArr10 = strArr6;
                strArr11 = strArr9;
                jArr2 = jArr;
                vtmVarArr = null;
            }
            agmp.ds(length, vtmVarArr, new rle(this, 4));
            if (db(13)) {
                if (z) {
                    int[] dk3 = dk(getString(cI(13, rlk.a)));
                    qpd[] qpdVarArr3 = new qpd[dk3.length];
                    for (int i9 = 0; i9 < dk3.length; i9++) {
                        qpd b = qpd.b(dk3[i9]);
                        if (b != null) {
                            qpdVarArr3[i9] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    qpdVarArr = (qpd[]) agnc.z(null, qpdVarArr3, new qpd[0]);
                } else {
                    qpdVarArr = new qpd[]{i()};
                }
            } else {
                qpdVarArr = null;
            }
            agmp.ds(length, qpdVarArr, new rle(this, 5));
            if (db(14)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(14, rlk.a))));
                } else {
                    jArr3 = new long[]{h()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new rle(this, 6));
            if (db(15)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(15, rlk.a))));
                } else {
                    iArr = new int[]{e()};
                }
            } else {
                iArr = null;
            }
            long[] jArr5 = jArr3;
            agmp.dq(length, iArr, new rle(this, 7));
            if (db(16)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(16, rlk.a))));
                } else {
                    iArr2 = new int[]{c()};
                }
            } else {
                iArr2 = null;
            }
            int[] iArr5 = iArr;
            agmp.dq(length, iArr2, new rle(this, 8));
            if (db(17)) {
                if (z) {
                    iArr3 = agnc.w(null, dk(getString(cI(17, rlk.a))));
                } else {
                    iArr3 = new int[]{f()};
                }
            } else {
                iArr3 = null;
            }
            int[] iArr6 = iArr2;
            agmp.dq(length, iArr3, new rle(this, 9));
            if (db(18)) {
                if (z) {
                    iArr4 = iArr3;
                    strArr12 = (String[]) agnc.z(null, dm(getString(cI(18, rlk.a))), new String[0]);
                } else {
                    iArr4 = iArr3;
                    strArr12 = new String[]{p()};
                }
            } else {
                iArr4 = iArr3;
                strArr12 = null;
            }
            agmp.ds(length, strArr12, new rle(this, 10));
            if (db(19)) {
                if (z) {
                    int[] dk4 = dk(getString(cI(19, rlk.a)));
                    xxw[] values2 = xxw.values();
                    int length6 = values2.length;
                    strArr13 = strArr12;
                    xxw[] xxwVarArr3 = new xxw[dk4.length];
                    vtmVarArr2 = vtmVarArr;
                    qpdVarArr2 = qpdVarArr;
                    for (int i10 = 0; i10 < dk4.length; i10++) {
                        int i11 = dk4[i10];
                        if (i11 < length6) {
                            xxwVarArr3[i10] = values2[i11];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    xxwVarArr = (xxw[]) agnc.z(null, xxwVarArr3, new xxw[0]);
                } else {
                    strArr13 = strArr12;
                    vtmVarArr2 = vtmVarArr;
                    qpdVarArr2 = qpdVarArr;
                    xxwVarArr = new xxw[]{o()};
                }
            } else {
                strArr13 = strArr12;
                vtmVarArr2 = vtmVarArr;
                qpdVarArr2 = qpdVarArr;
                xxwVarArr = null;
            }
            agmp.ds(length, xxwVarArr, new rfv(this, 13));
            alob alobVar = new alob();
            int i12 = 0;
            while (i12 < length) {
                long j = du[i12];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i12]));
                    String[] strArr14 = rlk.a;
                    int i13 = qxs.a;
                    rlc rlcVar = new rlc();
                    rlcVar.aD();
                    rlcVar.aB();
                    long j2 = du[i12];
                    if (conversationIdTypeArr != null) {
                        ConversationIdType conversationIdType = conversationIdTypeArr[i12];
                        rlcVar.aC(0);
                        rlcVar.a = conversationIdType;
                    }
                    if (qweVarArr != null) {
                        qwe qweVar = qweVarArr[i12];
                        int i14 = rlcVar.az;
                        if (i14 < 110) {
                            agnc.t("current_my_identity", i14);
                        }
                        rlcVar.aC(1);
                        rlcVar.b = qweVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i12];
                        int i15 = rlcVar.az;
                        if (i15 < 0) {
                            agnc.t("snippet_text", i15);
                        }
                        rlcVar.aC(2);
                        rlcVar.c = str;
                    }
                    if (tqcVarArr != null) {
                        tqc tqcVar = tqcVarArr[i12];
                        int i16 = rlcVar.az;
                        if (i16 < 0) {
                            agnc.t("archive_status", i16);
                        }
                        rlcVar.aC(3);
                        rlcVar.d = tqcVar;
                    }
                    if (jArr2 != null) {
                        long j3 = jArr2[i12];
                        int i17 = rlcVar.az;
                        jArr4 = du;
                        if (i17 < 0) {
                            agnc.t("most_recent_timestamp_ms", i17);
                        }
                        rlcVar.aC(4);
                        rlcVar.e = j3;
                    } else {
                        jArr4 = du;
                    }
                    if (strArr5 != null) {
                        String str2 = strArr5[i12];
                        int i18 = rlcVar.az;
                        if (i18 < 0) {
                            agnc.t("subject", i18);
                        }
                        rlcVar.aC(5);
                        rlcVar.f = str2;
                    }
                    if (strArr4 != null) {
                        String str3 = strArr4[i12];
                        int i19 = rlcVar.az;
                        if (i19 < 0) {
                            agnc.t("name", i19);
                        }
                        rlcVar.aC(6);
                        rlcVar.g = str3;
                    }
                    if (tqhVarArr != null) {
                        tqh tqhVar = tqhVarArr[i12];
                        int i20 = rlcVar.az;
                        if (i20 < 0) {
                            agnc.t("name_is_automatic", i20);
                        }
                        rlcVar.aC(7);
                        rlcVar.h = tqhVar;
                    }
                    if (zArr != null) {
                        boolean z2 = zArr[i12];
                        int i21 = rlcVar.az;
                        if (i21 < 0) {
                            agnc.t("has_rbm_participant", i21);
                        }
                        rlcVar.aC(8);
                        rlcVar.i = z2;
                    }
                    if (strArr10 != null) {
                        String str4 = strArr10[i12];
                        int i22 = rlcVar.az;
                        if (i22 < 0) {
                            agnc.t("rcs_group_self_msisdn", i22);
                        }
                        rlcVar.aC(9);
                        rlcVar.j = str4;
                    }
                    if (strArr8 != null) {
                        String str5 = strArr8[i12];
                        int i23 = rlcVar.az;
                        if (i23 < 0) {
                            agnc.t("rcs_group_id", i23);
                        }
                        rlcVar.aC(10);
                        rlcVar.k = str5;
                    }
                    if (strArr11 != null) {
                        String str6 = strArr11[i12];
                        int i24 = rlcVar.az;
                        if (i24 < 0) {
                            agnc.t("rcs_conference_uri", i24);
                        }
                        rlcVar.aC(11);
                        rlcVar.l = str6;
                    }
                    if (vtmVarArr2 != null) {
                        vtm vtmVar = vtmVarArr2[i12];
                        int i25 = rlcVar.az;
                        if (i25 < 0) {
                            agnc.t("rcs_group_capabilities", i25);
                        }
                        rlcVar.aC(12);
                        rlcVar.m = vtmVar;
                    }
                    if (qpdVarArr2 != null) {
                        qpd qpdVar = qpdVarArr2[i12];
                        int i26 = rlcVar.az;
                        if (i26 < 0) {
                            agnc.t("error_state", i26);
                        }
                        rlcVar.aC(13);
                        rlcVar.n = qpdVar;
                    }
                    if (jArr5 != null) {
                        long j4 = jArr5[i12];
                        int i27 = rlcVar.az;
                        if (i27 < 0) {
                            agnc.t("rcs_subject_change_timestamp_ms", i27);
                        }
                        rlcVar.aC(14);
                        rlcVar.o = j4;
                    }
                    if (iArr5 != null) {
                        int i28 = iArr5[i12];
                        int i29 = rlcVar.az;
                        if (i29 < 0) {
                            agnc.t("join_state", i29);
                        }
                        rlcVar.aC(15);
                        rlcVar.p = i28;
                    }
                    if (iArr6 != null) {
                        int i30 = iArr6[i12];
                        int i31 = rlcVar.az;
                        if (i31 < 0) {
                            agnc.t("conversation_type", i31);
                        }
                        rlcVar.aC(16);
                        rlcVar.q = i30;
                    }
                    if (iArr4 != null) {
                        int i32 = iArr4[i12];
                        int i33 = rlcVar.az;
                        if (i33 < 0) {
                            agnc.t("send_mode", i33);
                        }
                        rlcVar.aC(17);
                        rlcVar.r = i32;
                    }
                    if (strArr13 != null) {
                        String str7 = strArr13[i12];
                        int i34 = rlcVar.az;
                        if (i34 < 0) {
                            agnc.t("cms_id", i34);
                        }
                        rlcVar.aC(18);
                        rlcVar.s = str7;
                    }
                    if (xxwVarArr != null) {
                        xxw xxwVar = xxwVarArr[i12];
                        int i35 = rlcVar.az;
                        if (i35 < 0) {
                            agnc.t("cms_life_cycle", i35);
                        }
                        rlcVar.aC(19);
                        rlcVar.t = xxwVar;
                    }
                    rlb rlbVar = new rlb();
                    rlbVar.ar(rlcVar.az());
                    rlbVar.a = rlcVar.a;
                    rlbVar.b = rlcVar.b;
                    rlbVar.c = rlcVar.c;
                    rlbVar.d = rlcVar.d;
                    xxwVarArr2 = xxwVarArr;
                    rlbVar.e = rlcVar.e;
                    rlbVar.f = rlcVar.f;
                    rlbVar.g = rlcVar.g;
                    rlbVar.h = rlcVar.h;
                    rlbVar.i = rlcVar.i;
                    rlbVar.j = rlcVar.j;
                    rlbVar.k = rlcVar.k;
                    rlbVar.l = rlcVar.l;
                    rlbVar.m = rlcVar.m;
                    rlbVar.n = rlcVar.n;
                    rlbVar.o = rlcVar.o;
                    rlbVar.p = rlcVar.p;
                    rlbVar.q = rlcVar.q;
                    rlbVar.r = rlcVar.r;
                    rlbVar.s = rlcVar.s;
                    rlbVar.t = rlcVar.t;
                    rlbVar.cF = rlcVar.aA();
                    alobVar.h(rlbVar);
                } else {
                    jArr4 = du;
                    xxwVarArr2 = xxwVarArr;
                }
                i12++;
                xxwVarArr = xxwVarArr2;
                du = jArr4;
            }
            return alobVar.g();
        }
        int i36 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(4, rlk.a));
    }

    public final long h() {
        return getLong(cI(14, rlk.a));
    }

    public final qpd i() {
        return qpd.b(getInt(cI(13, rlk.a)));
    }

    public final qwe j() {
        return riw.m(getString(cI(1, rlk.a)));
    }

    public final ConversationIdType k() {
        return new ConversationIdType(getLong(cI(0, rlk.a)));
    }

    public final tqc l() {
        return tqc.a(getInt(cI(3, rlk.a)));
    }

    public final tqh m() {
        tqh[] values = tqh.values();
        int i = getInt(cI(7, rlk.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final vtm n() {
        return new vtm(getLong(cI(12, rlk.a)));
    }

    public final xxw o() {
        xxw[] values = xxw.values();
        int i = getInt(cI(19, rlk.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String p() {
        return getString(cI(18, rlk.a));
    }

    public final String q() {
        return getString(cI(6, rlk.a));
    }

    public final String r() {
        return getString(cI(11, rlk.a));
    }

    public final String s() {
        return getString(cI(10, rlk.a));
    }

    public final String t() {
        return getString(cI(9, rlk.a));
    }

    public final String u() {
        return getString(cI(2, rlk.a));
    }

    public final String v() {
        return getString(cI(5, rlk.a));
    }

    public final boolean w() {
        if (getInt(cI(8, rlk.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
