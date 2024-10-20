package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szi extends agmp implements agmq {
    @Deprecated
    public szi(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, szj szjVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, szl.a, agoxVar, akkwVar, szjVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sze();
    }

    public final int c() {
        return getInt(cI(8, szl.a));
    }

    public final int e() {
        return getInt(cI(7, szl.a));
    }

    public final long f() {
        return getLong(cI(2, szl.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        amhh[] amhhVarArr;
        ammr[] ammrVarArr;
        aqay[] aqayVarArr;
        aqax[] aqaxVarArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        long[] jArr2;
        int i;
        String[] strArr6;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet2 = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, szl.a))), new String[0]);
                } else {
                    strArr = new String[]{l()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new syf(this, 13));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, szl.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(dl[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new syf(this, 18));
            if (db(2)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(2, szl.a))));
                } else {
                    jArr = new long[]{f()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new syf(this, 19));
            if (db(3)) {
                if (z) {
                    int[] dk = dk(getString(cI(3, szl.a)));
                    amhh[] amhhVarArr2 = new amhh[dk.length];
                    for (int i3 = 0; i3 < dk.length; i3++) {
                        amhh b = amhh.b(dk[i3]);
                        if (b != null) {
                            amhhVarArr2[i3] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    amhhVarArr = (amhh[]) agnc.z(null, amhhVarArr2, new amhh[0]);
                } else {
                    amhhVarArr = new amhh[]{h()};
                }
            } else {
                amhhVarArr = null;
            }
            agmp.ds(length, amhhVarArr, new syf(this, 20));
            if (db(4)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(4, szl.a)));
                    ammr[] ammrVarArr2 = new ammr[dk2.length];
                    for (int i4 = 0; i4 < dk2.length; i4++) {
                        ammr b2 = ammr.b(dk2[i4]);
                        if (b2 != null) {
                            ammrVarArr2[i4] = b2;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    ammrVarArr = (ammr[]) agnc.z(null, ammrVarArr2, new ammr[0]);
                } else {
                    ammrVarArr = new ammr[]{i()};
                }
            } else {
                ammrVarArr = null;
            }
            agmp.ds(length, ammrVarArr, new szh(this, 1));
            if (db(5)) {
                if (z) {
                    int[] dk3 = dk(getString(cI(5, szl.a)));
                    aqay[] aqayVarArr2 = new aqay[dk3.length];
                    for (int i5 = 0; i5 < dk3.length; i5++) {
                        aqay b3 = aqay.b(dk3[i5]);
                        if (b3 != null) {
                            aqayVarArr2[i5] = b3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    aqayVarArr = (aqay[]) agnc.z(null, aqayVarArr2, new aqay[0]);
                } else {
                    aqayVarArr = new aqay[]{k()};
                }
            } else {
                aqayVarArr = null;
            }
            agmp.ds(length, aqayVarArr, new szh(this, 0));
            if (db(6)) {
                if (z) {
                    int[] dk4 = dk(getString(cI(6, szl.a)));
                    aqax[] aqaxVarArr2 = new aqax[dk4.length];
                    for (int i6 = 0; i6 < dk4.length; i6++) {
                        aqax b4 = aqax.b(dk4[i6]);
                        if (b4 != null) {
                            aqaxVarArr2[i6] = b4;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    aqaxVarArr = (aqax[]) agnc.z(null, aqaxVarArr2, new aqax[0]);
                } else {
                    aqaxVarArr = new aqax[]{j()};
                }
            } else {
                aqaxVarArr = null;
            }
            agmp.ds(length, aqaxVarArr, new szh(this, 2));
            if (db(7)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(7, szl.a))));
                } else {
                    iArr = new int[]{e()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new szh(this, 3));
            if (db(8)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(8, szl.a))));
                } else {
                    iArr2 = new int[]{c()};
                }
            } else {
                iArr2 = null;
            }
            agmp.dq(length, iArr2, new syf(this, 14));
            if (db(9)) {
                if (z) {
                    iArr3 = iArr2;
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(9, szl.a))), new String[0]);
                } else {
                    iArr3 = iArr2;
                    strArr2 = new String[]{m()};
                }
            } else {
                iArr3 = iArr2;
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new syf(this, 15));
            if (db(10)) {
                if (z) {
                    strArr3 = strArr2;
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(10, szl.a))), new String[0]);
                } else {
                    strArr3 = strArr2;
                    strArr4 = new String[]{o()};
                }
            } else {
                strArr3 = strArr2;
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new syf(this, 16));
            if (db(11)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(11, szl.a))), new String[0]);
                } else {
                    strArr5 = new String[]{n()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new syf(this, 17));
            alob alobVar = new alob();
            int i7 = 0;
            while (i7 < length) {
                long j = du[i7];
                if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                    hashSet2.add(Long.valueOf(du[i7]));
                    String[] strArr7 = szl.a;
                    int i8 = sym.a;
                    szf szfVar = new szf();
                    szfVar.aD();
                    szfVar.aB();
                    long j2 = du[i7];
                    jArr2 = du;
                    if (strArr != null) {
                        String str = strArr[i7];
                        i = length;
                        szfVar.aC(0);
                        szfVar.a = str;
                    } else {
                        i = length;
                    }
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i7];
                        int i9 = szfVar.az;
                        hashSet = hashSet2;
                        if (i9 < 51030) {
                            agnc.t("message_id", i9);
                        }
                        szfVar.aC(1);
                        szfVar.b = messageIdType;
                    } else {
                        hashSet = hashSet2;
                    }
                    strArr6 = strArr4;
                    if (jArr != null) {
                        long j3 = jArr[i7];
                        szfVar.aC(2);
                        szfVar.c = j3;
                    }
                    if (amhhVarArr != null) {
                        amhh amhhVar = amhhVarArr[i7];
                        szfVar.aC(3);
                        szfVar.d = amhhVar;
                    }
                    if (ammrVarArr != null) {
                        ammr ammrVar = ammrVarArr[i7];
                        szfVar.aC(4);
                        szfVar.e = ammrVar;
                    }
                    if (aqayVarArr != null) {
                        aqay aqayVar = aqayVarArr[i7];
                        szfVar.aC(5);
                        szfVar.f = aqayVar;
                    }
                    if (aqaxVarArr != null) {
                        aqax aqaxVar = aqaxVarArr[i7];
                        szfVar.aC(6);
                        szfVar.g = aqaxVar;
                    }
                    if (iArr != null) {
                        int i10 = iArr[i7];
                        szfVar.aC(7);
                        szfVar.h = i10;
                    }
                    if (iArr3 != null) {
                        int i11 = iArr3[i7];
                        szfVar.aC(8);
                        szfVar.i = i11;
                    }
                    if (strArr3 != null) {
                        String str2 = strArr3[i7];
                        szfVar.aC(9);
                        szfVar.j = str2;
                    }
                    if (strArr6 != null) {
                        String str3 = strArr6[i7];
                        szfVar.aC(10);
                        szfVar.k = str3;
                    }
                    if (strArr5 != null) {
                        String str4 = strArr5[i7];
                        int i12 = szfVar.az;
                        if (i12 < 42030) {
                            agnc.t("model_output_label", i12);
                        }
                        szfVar.aC(11);
                        szfVar.l = str4;
                    }
                    sze szeVar = new sze();
                    szeVar.ar(szfVar.az());
                    szeVar.a = szfVar.a;
                    szeVar.b = szfVar.b;
                    szeVar.c = szfVar.c;
                    szeVar.d = szfVar.d;
                    szeVar.e = szfVar.e;
                    szeVar.f = szfVar.f;
                    szeVar.g = szfVar.g;
                    szeVar.h = szfVar.h;
                    szeVar.i = szfVar.i;
                    szeVar.j = szfVar.j;
                    szeVar.k = szfVar.k;
                    szeVar.l = szfVar.l;
                    szeVar.cF = szfVar.aA();
                    alobVar.h(szeVar);
                } else {
                    jArr2 = du;
                    i = length;
                    strArr6 = strArr4;
                    hashSet = hashSet2;
                }
                i7++;
                strArr4 = strArr6;
                du = jArr2;
                length = i;
                hashSet2 = hashSet;
            }
            return alobVar.g();
        }
        int i13 = alog.d;
        return alsx.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cI(1, szl.a)));
    }

    public final amhh h() {
        return amhh.b(getInt(cI(3, szl.a)));
    }

    public final ammr i() {
        return ammr.b(getInt(cI(4, szl.a)));
    }

    public final aqax j() {
        return aqax.b(getInt(cI(6, szl.a)));
    }

    public final aqay k() {
        return aqay.b(getInt(cI(5, szl.a)));
    }

    public final String l() {
        return getString(cI(0, szl.a));
    }

    public final String m() {
        return getString(cI(9, szl.a));
    }

    public final String n() {
        return getString(cI(11, szl.a));
    }

    public final String o() {
        return getString(cI(10, szl.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
