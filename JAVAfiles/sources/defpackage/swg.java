package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swg extends agmp implements agmq {
    @Deprecated
    public swg(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, swh swhVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, swk.a, agoxVar, akkwVar, swhVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new swd();
    }

    public final long c() {
        return getLong(cI(3, swk.a));
    }

    public final long e() {
        return getLong(cI(2, swk.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, swk.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        UUID[] uuidArr;
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        long[] jArr2;
        tqs[] tqsVarArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        long[] jArr3;
        HashSet hashSet;
        String[] strArr12;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet2 = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    String[] dm = dm(getString(cI(0, swk.a)));
                    int length2 = dm.length;
                    UUID[] uuidArr2 = new UUID[length2];
                    for (int i = 0; i < length2; i++) {
                        uuidArr2[i] = UUID.fromString(dm[i]);
                    }
                    uuidArr = (UUID[]) agnc.z(null, uuidArr2, new UUID[0]);
                } else {
                    uuidArr = new UUID[]{p()};
                }
            } else {
                uuidArr = null;
            }
            agmp.ds(length, uuidArr, new svt(this, 2));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, swk.a)));
                    int length3 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(dl[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new svt(this, 9));
            if (db(2)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(2, swk.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new svt(this, 10));
            if (db(3)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(3, swk.a))));
                } else {
                    jArr2 = new long[]{c()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new svt(this, 11));
            if (db(4)) {
                if (z) {
                    int[] dk = dk(getString(cI(4, swk.a)));
                    tqs[] values = tqs.values();
                    int length4 = values.length;
                    tqs[] tqsVarArr2 = new tqs[dk.length];
                    for (int i3 = 0; i3 < dk.length; i3++) {
                        int i4 = dk[i3];
                        if (i4 < length4) {
                            tqsVarArr2[i3] = values[i4];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqsVarArr = (tqs[]) agnc.z(null, tqsVarArr2, new tqs[0]);
                } else {
                    tqsVarArr = new tqs[]{g()};
                }
            } else {
                tqsVarArr = null;
            }
            agmp.ds(length, tqsVarArr, new svt(this, 12));
            if (db(5)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(5, swk.a))), new String[0]);
                } else {
                    strArr = new String[]{j()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new svt(this, 13));
            if (db(6)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(6, swk.a))), new String[0]);
                } else {
                    strArr2 = new String[]{i()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new svt(this, 14));
            if (db(7)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(7, swk.a))), new String[0]);
                } else {
                    strArr3 = new String[]{h()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new svt(this, 3));
            if (db(8)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(8, swk.a))), new String[0]);
                } else {
                    strArr4 = new String[]{o()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new svt(this, 4));
            if (db(9)) {
                if (z) {
                    strArr5 = strArr4;
                    strArr6 = (String[]) agnc.z(null, dm(getString(cI(9, swk.a))), new String[0]);
                } else {
                    strArr5 = strArr4;
                    strArr6 = new String[]{l()};
                }
            } else {
                strArr5 = strArr4;
                strArr6 = null;
            }
            agmp.ds(length, strArr6, new svt(this, 5));
            if (db(10)) {
                if (z) {
                    strArr7 = strArr6;
                    strArr8 = (String[]) agnc.z(null, dm(getString(cI(10, swk.a))), new String[0]);
                } else {
                    strArr7 = strArr6;
                    strArr8 = new String[]{n()};
                }
            } else {
                strArr7 = strArr6;
                strArr8 = null;
            }
            agmp.ds(length, strArr8, new svt(this, 6));
            if (db(11)) {
                if (z) {
                    strArr9 = strArr8;
                    strArr10 = (String[]) agnc.z(null, dm(getString(cI(11, swk.a))), new String[0]);
                } else {
                    strArr9 = strArr8;
                    strArr10 = new String[]{m()};
                }
            } else {
                strArr9 = strArr8;
                strArr10 = null;
            }
            agmp.ds(length, strArr10, new svt(this, 7));
            if (db(12)) {
                if (z) {
                    strArr11 = (String[]) agnc.z(null, dm(getString(cI(12, swk.a))), new String[0]);
                } else {
                    strArr11 = new String[]{k()};
                }
            } else {
                strArr11 = null;
            }
            agmp.ds(length, strArr11, new svt(this, 8));
            alob alobVar = new alob();
            int i5 = 0;
            while (i5 < length) {
                long j = du[i5];
                if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                    hashSet2.add(Long.valueOf(du[i5]));
                    String[] strArr13 = swk.a;
                    int i6 = svc.a;
                    swe sweVar = new swe();
                    sweVar.aD();
                    sweVar.aB();
                    long j2 = du[i5];
                    jArr3 = du;
                    if (uuidArr != null) {
                        sweVar.h(uuidArr[i5]);
                    }
                    if (messageIdTypeArr != null) {
                        sweVar.j(messageIdTypeArr[i5]);
                    }
                    hashSet = hashSet2;
                    strArr12 = strArr11;
                    if (jArr != null) {
                        sweVar.m(jArr[i5]);
                    }
                    if (jArr2 != null) {
                        sweVar.k(jArr2[i5]);
                    }
                    if (tqsVarArr != null) {
                        sweVar.n(tqsVarArr[i5]);
                    }
                    if (strArr != null) {
                        sweVar.d(strArr[i5]);
                    }
                    if (strArr2 != null) {
                        sweVar.c(strArr2[i5]);
                    }
                    if (strArr3 != null) {
                        sweVar.b(strArr3[i5]);
                    }
                    if (strArr5 != null) {
                        sweVar.l(strArr5[i5]);
                    }
                    if (strArr7 != null) {
                        sweVar.f(strArr7[i5]);
                    }
                    if (strArr9 != null) {
                        sweVar.i(strArr9[i5]);
                    }
                    if (strArr10 != null) {
                        sweVar.g(strArr10[i5]);
                    }
                    if (strArr12 != null) {
                        sweVar.e(strArr12[i5]);
                    }
                    alobVar.h(sweVar.a(new svc(17)));
                } else {
                    jArr3 = du;
                    hashSet = hashSet2;
                    strArr12 = strArr11;
                }
                i5++;
                hashSet2 = hashSet;
                strArr11 = strArr12;
                du = jArr3;
            }
            return alobVar.g();
        }
        int i7 = alog.d;
        return alsx.a;
    }

    public final tqs g() {
        tqs[] values = tqs.values();
        int i = getInt(cI(4, swk.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String h() {
        return getString(cI(7, swk.a));
    }

    public final String i() {
        return getString(cI(6, swk.a));
    }

    public final String j() {
        return getString(cI(5, swk.a));
    }

    public final String k() {
        return getString(cI(12, swk.a));
    }

    public final String l() {
        return getString(cI(9, swk.a));
    }

    public final String m() {
        return getString(cI(11, swk.a));
    }

    public final String n() {
        return getString(cI(10, swk.a));
    }

    public final String o() {
        return getString(cI(8, swk.a));
    }

    public final UUID p() {
        return UUID.fromString(getString(cI(0, swk.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
