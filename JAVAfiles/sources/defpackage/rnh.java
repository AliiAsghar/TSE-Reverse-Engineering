package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnh extends agmp implements agmq {
    @Deprecated
    public rnh(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rnj rnjVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rnm.a, agoxVar, akkwVar, rnjVar);
    }

    public final String A() {
        return getString(cI(21, rnm.a));
    }

    public final String B() {
        return getString(cI(9, rnm.a));
    }

    public final String C() {
        return getString(cI(8, rnm.a));
    }

    public final String D() {
        return getString(cI(20, rnm.a));
    }

    public final boolean E() {
        if (getInt(cI(23, rnm.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        if (getInt(cI(5, rnm.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if (getInt(cI(4, rnm.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rnc();
    }

    public final int c() {
        return getInt(cI(15, rnm.a));
    }

    public final int e() {
        return getInt(cI(3, rnm.a));
    }

    public final int f() {
        return getInt(cI(14, rnm.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        MessageIdType[] messageIdTypeArr;
        Optional[] optionalArr;
        qwe[] qweVarArr;
        int[] iArr;
        boolean[] zArr;
        boolean[] zArr2;
        HashSet hashSet;
        ConversationIdType[] conversationIdTypeArr;
        int[] iArr2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int i;
        int[] iArr3;
        int[] iArr4;
        String[] strArr4;
        long[] jArr;
        long[] jArr2;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        int[] iArr9;
        int[] iArr10;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        boolean[] zArr3;
        String[] strArr13;
        boolean[] zArr4;
        rve[] rveVarArr;
        rve[] rveVarArr2;
        apwq[] apwqVarArr;
        String[] strArr14;
        int[] iArr11;
        String[] strArr15;
        apwq[] apwqVarArr2;
        ConversationIdType[] conversationIdTypeArr2;
        int i2;
        xxw[] xxwVarArr;
        String[] strArr16;
        long[] jArr3;
        long[] jArr4;
        String[] strArr17;
        MessageIdType[] messageIdTypeArr2;
        HashSet hashSet2;
        int i3;
        rve[] rveVarArr3;
        apwq apwqVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i4 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet3 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, rnm.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                        for (int i5 = 0; i5 < length2; i5++) {
                            messageIdTypeArr3[i5] = new MessageIdType(dl[i5]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr3, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{p()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new rma(this, 11));
                if (db(1)) {
                    if (z) {
                        String[] dm = dm(getString(cI(1, rnm.a)));
                        int length3 = dm.length;
                        Optional[] optionalArr2 = new Optional[length3];
                        for (int i6 = 0; i6 < length3; i6++) {
                            optionalArr2[i6] = rvg.a(dm[i6]);
                        }
                        optionalArr = (Optional[]) agnc.z(null, optionalArr2, new Optional[0]);
                    } else {
                        optionalArr = new Optional[]{t()};
                    }
                } else {
                    optionalArr = null;
                }
                agmp.ds(length, optionalArr, new rma(this, 13));
                if (db(2)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(2, rnm.a)));
                        int length4 = dm2.length;
                        qwe[] qweVarArr2 = new qwe[length4];
                        for (int i7 = 0; i7 < length4; i7++) {
                            qweVarArr2[i7] = riw.m(dm2[i7]);
                        }
                        qweVarArr = (qwe[]) agnc.z(null, qweVarArr2, new qwe[0]);
                    } else {
                        qweVarArr = new qwe[]{n()};
                    }
                } else {
                    qweVarArr = null;
                }
                agmp.ds(length, qweVarArr, new rng(this, 4));
                if (db(3)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(3, rnm.a))));
                    } else {
                        iArr = new int[]{e()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new rng(this, 5));
                if (db(4)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(4, rnm.a))));
                    } else {
                        zArr = new boolean[]{G()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new rng(this, 6));
                if (db(5)) {
                    if (z) {
                        zArr2 = agnc.A(null, dn(getString(cI(5, rnm.a))));
                    } else {
                        zArr2 = new boolean[]{F()};
                    }
                } else {
                    zArr2 = null;
                }
                agmp.dt(length, zArr2, new rng(this, 7));
                if (db(6)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(6, rnm.a)));
                        int length5 = dl2.length;
                        ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length5];
                        int i8 = 0;
                        while (i8 < length5) {
                            conversationIdTypeArr3[i8] = new ConversationIdType(dl2[i8]);
                            i8++;
                            hashSet3 = hashSet3;
                            length5 = length5;
                            i4 = 0;
                        }
                        hashSet = hashSet3;
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr3, new ConversationIdType[i4]);
                    } else {
                        hashSet = hashSet3;
                        conversationIdTypeArr = new ConversationIdType[]{o()};
                    }
                } else {
                    hashSet = hashSet3;
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new rng(this, 8));
                if (db(7)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(7, rnm.a))));
                    } else {
                        iArr2 = new int[]{i()};
                    }
                } else {
                    iArr2 = null;
                }
                agmp.dq(length, iArr2, new rng(this, 9));
                if (db(8)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(8, rnm.a))), new String[0]);
                    } else {
                        strArr = new String[]{C()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new rng(this, 10));
                if (db(9)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(9, rnm.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{B()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new rng(this, 11));
                if (db(10)) {
                    if (z) {
                        iArr3 = agnc.w(null, dk(getString(cI(10, rnm.a))));
                        strArr3 = strArr2;
                        i = 0;
                    } else {
                        strArr3 = strArr2;
                        i = 0;
                        iArr3 = new int[]{h()};
                    }
                } else {
                    strArr3 = strArr2;
                    i = 0;
                    iArr3 = null;
                }
                agmp.dq(length, iArr3, new rng(this, i));
                if (db(11)) {
                    if (z) {
                        iArr4 = iArr3;
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(11, rnm.a))), new String[0]);
                    } else {
                        iArr4 = iArr3;
                        strArr4 = new String[]{z()};
                    }
                } else {
                    iArr4 = iArr3;
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new rng(this, 12));
                if (db(12)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(12, rnm.a))));
                    } else {
                        jArr = new long[]{l()};
                    }
                } else {
                    jArr = null;
                }
                String[] strArr18 = strArr4;
                agmp.dr(length, jArr, new rng(this, 13));
                if (db(13)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(13, rnm.a))));
                    } else {
                        jArr2 = new long[]{m()};
                    }
                } else {
                    jArr2 = null;
                }
                long[] jArr5 = jArr;
                agmp.dr(length, jArr2, new rng(this, 14));
                if (db(14)) {
                    if (z) {
                        iArr5 = agnc.w(null, dk(getString(cI(14, rnm.a))));
                    } else {
                        iArr5 = new int[]{f()};
                    }
                } else {
                    iArr5 = null;
                }
                long[] jArr6 = jArr2;
                agmp.dq(length, iArr5, new rng(this, 15));
                if (db(15)) {
                    if (z) {
                        iArr6 = agnc.w(null, dk(getString(cI(15, rnm.a))));
                    } else {
                        iArr6 = new int[]{c()};
                    }
                } else {
                    iArr6 = null;
                }
                int[] iArr12 = iArr5;
                agmp.dq(length, iArr6, new rng(this, 16));
                if (db(16)) {
                    if (z) {
                        iArr7 = agnc.w(null, dk(getString(cI(16, rnm.a))));
                    } else {
                        iArr7 = new int[]{g()};
                    }
                } else {
                    iArr7 = null;
                }
                int[] iArr13 = iArr6;
                agmp.dq(length, iArr7, new rng(this, 17));
                if (db(17)) {
                    if (z) {
                        iArr8 = iArr7;
                        strArr5 = (String[]) agnc.z(null, dm(getString(cI(17, rnm.a))), new String[0]);
                    } else {
                        iArr8 = iArr7;
                        strArr5 = new String[]{u()};
                    }
                } else {
                    iArr8 = iArr7;
                    strArr5 = null;
                }
                agmp.ds(length, strArr5, new rng(this, 18));
                if (db(18)) {
                    if (z) {
                        strArr6 = strArr5;
                        strArr7 = (String[]) agnc.z(null, dm(getString(cI(18, rnm.a))), new String[0]);
                    } else {
                        strArr6 = strArr5;
                        strArr7 = new String[]{x()};
                    }
                } else {
                    strArr6 = strArr5;
                    strArr7 = null;
                }
                agmp.ds(length, strArr7, new rng(this, 19));
                if (db(19)) {
                    if (z) {
                        iArr9 = agnc.w(null, dk(getString(cI(19, rnm.a))));
                    } else {
                        iArr9 = new int[]{j()};
                    }
                } else {
                    iArr9 = null;
                }
                String[] strArr19 = strArr7;
                agmp.dq(length, iArr9, new rma(this, 12));
                if (db(20)) {
                    if (z) {
                        iArr10 = iArr9;
                        strArr8 = (String[]) agnc.z(null, dm(getString(cI(20, rnm.a))), new String[0]);
                    } else {
                        iArr10 = iArr9;
                        strArr8 = new String[]{D()};
                    }
                } else {
                    iArr10 = iArr9;
                    strArr8 = null;
                }
                agmp.ds(length, strArr8, new rma(this, 14));
                if (db(21)) {
                    if (z) {
                        strArr9 = strArr8;
                        strArr10 = (String[]) agnc.z(null, dm(getString(cI(21, rnm.a))), new String[0]);
                    } else {
                        strArr9 = strArr8;
                        strArr10 = new String[]{A()};
                    }
                } else {
                    strArr9 = strArr8;
                    strArr10 = null;
                }
                agmp.ds(length, strArr10, new rma(this, 15));
                if (db(22)) {
                    if (z) {
                        strArr11 = strArr10;
                        strArr12 = (String[]) agnc.z(null, dm(getString(cI(22, rnm.a))), new String[0]);
                    } else {
                        strArr11 = strArr10;
                        strArr12 = new String[]{y()};
                    }
                } else {
                    strArr11 = strArr10;
                    strArr12 = null;
                }
                agmp.ds(length, strArr12, new rma(this, 16));
                if (db(23)) {
                    if (z) {
                        zArr3 = agnc.A(null, dn(getString(cI(23, rnm.a))));
                    } else {
                        zArr3 = new boolean[]{E()};
                    }
                } else {
                    zArr3 = null;
                }
                String[] strArr20 = strArr12;
                agmp.dt(length, zArr3, new rma(this, 17));
                if (db(24)) {
                    if (z) {
                        String[] dm3 = dm(getString(cI(24, rnm.a)));
                        int length6 = dm3.length;
                        zArr4 = zArr3;
                        rve[] rveVarArr4 = new rve[length6];
                        strArr13 = strArr;
                        for (int i9 = 0; i9 < length6; i9++) {
                            rveVarArr4[i9] = rve.a(dm3[i9]);
                        }
                        rveVarArr = (rve[]) agnc.z(null, rveVarArr4, new rve[0]);
                    } else {
                        strArr13 = strArr;
                        zArr4 = zArr3;
                        rveVarArr = new rve[]{q()};
                    }
                } else {
                    strArr13 = strArr;
                    zArr4 = zArr3;
                    rveVarArr = null;
                }
                agmp.ds(length, rveVarArr, new rma(this, 18));
                if (db(25)) {
                    if (z) {
                        List cY = cY(getString(cI(25, rnm.a)));
                        apwq[] apwqVarArr3 = new apwq[cY.size()];
                        Iterator it = cY.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i11 = i10 + 1;
                                if (v == null) {
                                    rveVarArr3 = rveVarArr;
                                    apwqVar = null;
                                } else {
                                    rveVarArr3 = rveVarArr;
                                    try {
                                        apwqVar = (apwq) apag.parseFrom(apwq.a, v);
                                    } catch (Throwable unused) {
                                        i10 = i11;
                                        apwqVarArr3[i10] = null;
                                        i10++;
                                        it = it2;
                                        rveVarArr = rveVarArr3;
                                    }
                                }
                                apwqVarArr3[i10] = apwqVar;
                                i10 = i11;
                            } catch (Throwable unused2) {
                                rveVarArr3 = rveVarArr;
                            }
                            it = it2;
                            rveVarArr = rveVarArr3;
                        }
                        rveVarArr2 = rveVarArr;
                        apwqVarArr = (apwq[]) agnc.z(null, apwqVarArr3, new apwq[0]);
                    } else {
                        rveVarArr2 = rveVarArr;
                        apwqVarArr = new apwq[]{s()};
                    }
                } else {
                    rveVarArr2 = rveVarArr;
                    apwqVarArr = null;
                }
                agmp.ds(length, apwqVarArr, new rma(this, 19));
                if (db(26)) {
                    if (z) {
                        strArr14 = (String[]) agnc.z(null, dm(getString(cI(26, rnm.a))), new String[0]);
                    } else {
                        strArr14 = new String[]{w()};
                    }
                } else {
                    strArr14 = null;
                }
                agmp.ds(length, strArr14, new rma(this, 20));
                if (db(27)) {
                    if (z) {
                        int[] dk = dk(getString(cI(27, rnm.a)));
                        xxw[] values = xxw.values();
                        strArr15 = strArr14;
                        int length7 = values.length;
                        apwqVarArr2 = apwqVarArr;
                        xxw[] xxwVarArr2 = new xxw[dk.length];
                        iArr11 = iArr2;
                        conversationIdTypeArr2 = conversationIdTypeArr;
                        for (int i12 = 0; i12 < dk.length; i12++) {
                            int i13 = dk[i12];
                            if (i13 < length7) {
                                xxwVarArr2[i12] = values[i13];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        xxwVarArr = (xxw[]) agnc.z(null, xxwVarArr2, new xxw[0]);
                        i2 = 1;
                    } else {
                        iArr11 = iArr2;
                        strArr15 = strArr14;
                        apwqVarArr2 = apwqVarArr;
                        conversationIdTypeArr2 = conversationIdTypeArr;
                        i2 = 1;
                        xxwVarArr = new xxw[]{r()};
                    }
                } else {
                    iArr11 = iArr2;
                    strArr15 = strArr14;
                    apwqVarArr2 = apwqVarArr;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    i2 = 1;
                    xxwVarArr = null;
                }
                agmp.ds(length, xxwVarArr, new rng(this, i2));
                if (db(28)) {
                    if (z) {
                        strArr16 = (String[]) agnc.z(null, dm(getString(cI(28, rnm.a))), new String[0]);
                    } else {
                        strArr16 = new String[]{v()};
                    }
                } else {
                    strArr16 = null;
                }
                agmp.ds(length, strArr16, new rng(this, 2));
                if (db(29)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(29, rnm.a))));
                    } else {
                        jArr3 = new long[]{k()};
                    }
                } else {
                    jArr3 = null;
                }
                agmp.dr(length, jArr3, new rng(this, 3));
                alob alobVar = new alob();
                int i14 = 0;
                while (i14 < length) {
                    long j = du[i14];
                    if (j > 0) {
                        hashSet2 = hashSet;
                        if (hashSet2.contains(Long.valueOf(j))) {
                            jArr4 = du;
                            strArr17 = strArr16;
                            i3 = length;
                            messageIdTypeArr2 = messageIdTypeArr;
                        } else {
                            hashSet2.add(Long.valueOf(du[i14]));
                            String[] strArr21 = rnm.a;
                            int i15 = rlm.a;
                            rnd rndVar = new rnd();
                            rndVar.aD();
                            rndVar.aB();
                            long j2 = du[i14];
                            if (messageIdTypeArr != null) {
                                MessageIdType messageIdType = messageIdTypeArr[i14];
                                jArr4 = du;
                                rndVar.aC(0);
                                rndVar.a = messageIdType;
                            } else {
                                jArr4 = du;
                            }
                            if (optionalArr != null) {
                                Optional optional = optionalArr[i14];
                                int i16 = rndVar.az;
                                i3 = length;
                                if (i16 < 120) {
                                    agnc.t("message_persistence_id", i16);
                                }
                                rndVar.aC(1);
                                rndVar.b = optional;
                            } else {
                                i3 = length;
                            }
                            if (qweVarArr != null) {
                                qwe qweVar = qweVarArr[i14];
                                int i17 = rndVar.az;
                                if (i17 < 110) {
                                    agnc.t("my_identity", i17);
                                }
                                rndVar.aC(2);
                                rndVar.c = qweVar;
                            }
                            if (iArr != null) {
                                int i18 = iArr[i14];
                                int i19 = rndVar.az;
                                if (i19 < 0) {
                                    agnc.t("message_status", i19);
                                }
                                rndVar.aC(3);
                                rndVar.d = i18;
                            }
                            if (zArr != null) {
                                boolean z2 = zArr[i14];
                                int i20 = rndVar.az;
                                if (i20 < 0) {
                                    agnc.t("seen", i20);
                                }
                                rndVar.aC(4);
                                rndVar.e = z2;
                            }
                            if (zArr2 != null) {
                                boolean z3 = zArr2[i14];
                                int i21 = rndVar.az;
                                if (i21 < 0) {
                                    agnc.t("read", i21);
                                }
                                rndVar.aC(5);
                                rndVar.f = z3;
                            }
                            if (conversationIdTypeArr2 != null) {
                                ConversationIdType conversationIdType = conversationIdTypeArr2[i14];
                                int i22 = rndVar.az;
                                if (i22 < 0) {
                                    agnc.t("conversation_id", i22);
                                }
                                rndVar.aC(6);
                                rndVar.g = conversationIdType;
                            }
                            if (iArr11 != null) {
                                int i23 = iArr11[i14];
                                int i24 = rndVar.az;
                                if (i24 < 0) {
                                    agnc.t("sender_participant_id", i24);
                                }
                                rndVar.aC(7);
                                rndVar.h = i23;
                            }
                            if (strArr13 != null) {
                                String str = strArr13[i14];
                                int i25 = rndVar.az;
                                if (i25 < 80) {
                                    agnc.t("sender_send_destination", i25);
                                }
                                rndVar.aC(8);
                                rndVar.i = str;
                            }
                            if (strArr3 != null) {
                                String str2 = strArr3[i14];
                                int i26 = rndVar.az;
                                if (i26 < 80) {
                                    agnc.t("msisdn_receiving_rcs_message", i26);
                                }
                                rndVar.aC(9);
                                rndVar.j = str2;
                            }
                            if (iArr4 != null) {
                                int i27 = iArr4[i14];
                                int i28 = rndVar.az;
                                if (i28 < 0) {
                                    agnc.t("self_participant_id", i28);
                                }
                                rndVar.aC(10);
                                rndVar.k = i27;
                            }
                            if (strArr18 != null) {
                                String str3 = strArr18[i14];
                                int i29 = rndVar.az;
                                if (i29 < 0) {
                                    agnc.t("mms_subject", i29);
                                }
                                rndVar.aC(11);
                                rndVar.l = str3;
                            }
                            strArr17 = strArr16;
                            if (jArr5 != null) {
                                long j3 = jArr5[i14];
                                int i30 = rndVar.az;
                                messageIdTypeArr2 = messageIdTypeArr;
                                if (i30 < 0) {
                                    agnc.t("received_timestamp", i30);
                                }
                                rndVar.aC(12);
                                rndVar.m = j3;
                            } else {
                                messageIdTypeArr2 = messageIdTypeArr;
                            }
                            if (jArr6 != null) {
                                long j4 = jArr6[i14];
                                int i31 = rndVar.az;
                                if (i31 < 0) {
                                    agnc.t("sent_timestamp", i31);
                                }
                                rndVar.aC(13);
                                rndVar.n = j4;
                            }
                            if (iArr12 != null) {
                                int i32 = iArr12[i14];
                                int i33 = rndVar.az;
                                if (i33 < 0) {
                                    agnc.t("protocol", i33);
                                }
                                rndVar.aC(14);
                                rndVar.o = i32;
                            }
                            if (iArr13 != null) {
                                int i34 = iArr13[i14];
                                int i35 = rndVar.az;
                                if (i35 < 0) {
                                    agnc.t("message_priority", i35);
                                }
                                rndVar.aC(15);
                                rndVar.p = i34;
                            }
                            if (iArr8 != null) {
                                int i36 = iArr8[i14];
                                int i37 = rndVar.az;
                                if (i37 < 0) {
                                    agnc.t("rcs_encryption_status", i37);
                                }
                                rndVar.aC(16);
                                rndVar.q = i36;
                            }
                            if (strArr6 != null) {
                                String str4 = strArr6[i14];
                                int i38 = rndVar.az;
                                if (i38 < 0) {
                                    agnc.t("cloud_sync_id", i38);
                                }
                                rndVar.aC(17);
                                rndVar.r = str4;
                            }
                            if (strArr19 != null) {
                                String str5 = strArr19[i14];
                                int i39 = rndVar.az;
                                if (i39 < 0) {
                                    agnc.t("correlation_id", i39);
                                }
                                rndVar.aC(18);
                                rndVar.s = str5;
                            }
                            if (iArr10 != null) {
                                int i40 = iArr10[i14];
                                int i41 = rndVar.az;
                                if (i41 < 0) {
                                    agnc.t("sms_error_code", i41);
                                }
                                rndVar.aC(19);
                                rndVar.t = i40;
                            }
                            if (strArr9 != null) {
                                String str6 = strArr9[i14];
                                int i42 = rndVar.az;
                                if (i42 < 0) {
                                    agnc.t("sms_error_desc_map_name", i42);
                                }
                                rndVar.aC(20);
                                rndVar.u = str6;
                            }
                            if (strArr11 != null) {
                                String str7 = strArr11[i14];
                                rndVar.aC(21);
                                rndVar.v = str7;
                            }
                            if (strArr20 != null) {
                                String str8 = strArr20[i14];
                                rndVar.aC(22);
                                rndVar.w = str8;
                            }
                            if (zArr4 != null) {
                                boolean z4 = zArr4[i14];
                                int i43 = rndVar.az;
                                if (i43 < 0) {
                                    agnc.t("is_hidden", i43);
                                }
                                rndVar.aC(23);
                                rndVar.x = z4;
                            }
                            if (rveVarArr2 != null) {
                                rve rveVar = rveVarArr2[i14];
                                int i44 = rndVar.az;
                                if (i44 < 0) {
                                    agnc.t("rcs_message_id", i44);
                                }
                                rndVar.aC(24);
                                rndVar.y = rveVar;
                            }
                            if (apwqVarArr2 != null) {
                                apwq apwqVar2 = apwqVarArr2[i14];
                                int i45 = rndVar.az;
                                if (i45 < 50) {
                                    agnc.t("custom_headers", i45);
                                }
                                rndVar.aC(25);
                                rndVar.z = apwqVar2;
                            }
                            if (strArr15 != null) {
                                String str9 = strArr15[i14];
                                int i46 = rndVar.az;
                                if (i46 < 0) {
                                    agnc.t("cms_id", i46);
                                }
                                rndVar.aC(26);
                                rndVar.A = str9;
                            }
                            if (xxwVarArr != null) {
                                xxw xxwVar = xxwVarArr[i14];
                                int i47 = rndVar.az;
                                if (i47 < 0) {
                                    agnc.t("cms_life_cycle", i47);
                                }
                                rndVar.aC(27);
                                rndVar.B = xxwVar;
                            }
                            if (strArr17 != null) {
                                String str10 = strArr17[i14];
                                int i48 = rndVar.az;
                                if (i48 < 0) {
                                    agnc.t("cms_correlation_id", i48);
                                }
                                rndVar.aC(28);
                                rndVar.C = str10;
                            }
                            if (jArr3 != null) {
                                long j5 = jArr3[i14];
                                int i49 = rndVar.az;
                                if (i49 < 0) {
                                    agnc.t("cms_last_mod_seq", i49);
                                }
                                rndVar.aC(29);
                                rndVar.D = j5;
                            }
                            rnc rncVar = new rnc();
                            rncVar.ar(rndVar.az());
                            rncVar.a = rndVar.a;
                            rncVar.b = rndVar.b;
                            rncVar.c = rndVar.c;
                            rncVar.d = rndVar.d;
                            rncVar.e = rndVar.e;
                            rncVar.f = rndVar.f;
                            rncVar.g = rndVar.g;
                            rncVar.h = rndVar.h;
                            rncVar.i = rndVar.i;
                            rncVar.j = rndVar.j;
                            rncVar.k = rndVar.k;
                            rncVar.l = rndVar.l;
                            rncVar.m = rndVar.m;
                            rncVar.n = rndVar.n;
                            rncVar.o = rndVar.o;
                            rncVar.p = rndVar.p;
                            rncVar.q = rndVar.q;
                            rncVar.r = rndVar.r;
                            rncVar.s = rndVar.s;
                            rncVar.t = rndVar.t;
                            rncVar.u = rndVar.u;
                            rncVar.v = rndVar.v;
                            rncVar.w = rndVar.w;
                            rncVar.x = rndVar.x;
                            rncVar.y = rndVar.y;
                            rncVar.z = rndVar.z;
                            rncVar.A = rndVar.A;
                            rncVar.B = rndVar.B;
                            rncVar.C = rndVar.C;
                            rncVar.D = rndVar.D;
                            rncVar.cF = rndVar.aA();
                            alobVar.h(rncVar);
                        }
                    } else {
                        jArr4 = du;
                        strArr17 = strArr16;
                        messageIdTypeArr2 = messageIdTypeArr;
                        hashSet2 = hashSet;
                        i3 = length;
                    }
                    i14++;
                    strArr16 = strArr17;
                    du = jArr4;
                    length = i3;
                    messageIdTypeArr = messageIdTypeArr2;
                    hashSet = hashSet2;
                }
                return alobVar.g();
            }
        }
        int i50 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(16, rnm.a));
    }

    public final int h() {
        return getInt(cI(10, rnm.a));
    }

    public final int i() {
        return getInt(cI(7, rnm.a));
    }

    public final int j() {
        return getInt(cI(19, rnm.a));
    }

    public final long k() {
        return getLong(cI(29, rnm.a));
    }

    public final long l() {
        return getLong(cI(12, rnm.a));
    }

    public final long m() {
        return getLong(cI(13, rnm.a));
    }

    public final qwe n() {
        return riw.m(getString(cI(2, rnm.a)));
    }

    public final ConversationIdType o() {
        return new ConversationIdType(getLong(cI(6, rnm.a)));
    }

    public final MessageIdType p() {
        return new MessageIdType(getLong(cI(0, rnm.a)));
    }

    public final rve q() {
        return rve.a(getString(cI(24, rnm.a)));
    }

    public final xxw r() {
        xxw[] values = xxw.values();
        int i = getInt(cI(27, rnm.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final apwq s() {
        byte[] blob = getBlob(cI(25, rnm.a));
        if (blob == null) {
            return null;
        }
        try {
            return (apwq) apag.parseFrom(apwq.a, blob, aozs.a());
        } catch (Throwable unused) {
            return apwq.a;
        }
    }

    public final Optional t() {
        return rvg.a(getString(cI(1, rnm.a)));
    }

    public final String u() {
        return getString(cI(17, rnm.a));
    }

    public final String v() {
        return getString(cI(28, rnm.a));
    }

    public final String w() {
        return getString(cI(26, rnm.a));
    }

    public final String x() {
        return getString(cI(18, rnm.a));
    }

    public final String y() {
        return getString(cI(22, rnm.a));
    }

    public final String z() {
        return getString(cI(11, rnm.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
