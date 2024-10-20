package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class row extends agmp implements agmq {
    @Deprecated
    public row(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, roy royVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rpb.a, agoxVar, akkwVar, royVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new ros();
    }

    public final int c() {
        return getInt(cI(13, rpb.a));
    }

    public final int e() {
        return getInt(cI(14, rpb.a));
    }

    public final int f() {
        return getInt(cI(15, rpb.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        qwe[] qweVarArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        boolean[] zArr;
        boolean[] zArr2;
        int[] iArr;
        boolean[] zArr3;
        int[] iArr2;
        int[] iArr3;
        String[] strArr6;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        boolean[] zArr4;
        xxw[] xxwVarArr;
        long[] jArr2;
        alob alobVar;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, rpb.a))));
                } else {
                    jArr = new long[]{i()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new rnr(this, 20));
            if (db(1)) {
                if (z) {
                    String[] dm = dm(getString(cI(1, rpb.a)));
                    int length2 = dm.length;
                    qwe[] qweVarArr2 = new qwe[length2];
                    for (int i = 0; i < length2; i++) {
                        qweVarArr2[i] = riw.m(dm[i]);
                    }
                    qweVarArr = (qwe[]) agnc.z(null, qweVarArr2, new qwe[0]);
                } else {
                    qweVarArr = new qwe[]{j()};
                }
            } else {
                qweVarArr = null;
            }
            agmp.ds(length, qweVarArr, new rov(this, 16));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, rpb.a))), new String[0]);
                } else {
                    strArr = new String[]{q()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new rov(this, 1));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, rpb.a))), new String[0]);
                } else {
                    strArr2 = new String[]{r()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new rov(this, 0));
            if (db(4)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(4, rpb.a))), new String[0]);
                } else {
                    strArr3 = new String[]{n()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new rov(this, 2));
            if (db(5)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(5, rpb.a))), new String[0]);
                } else {
                    strArr4 = new String[]{o()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new rov(this, 3));
            if (db(6)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(6, rpb.a))), new String[0]);
                } else {
                    strArr5 = new String[]{p()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new rov(this, 4));
            if (db(7)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(7, rpb.a))));
                } else {
                    zArr = new boolean[]{t()};
                }
            } else {
                zArr = null;
            }
            agmp.dt(length, zArr, new rov(this, 5));
            if (db(8)) {
                if (z) {
                    zArr2 = agnc.A(null, dn(getString(cI(8, rpb.a))));
                } else {
                    zArr2 = new boolean[]{s()};
                }
            } else {
                zArr2 = null;
            }
            agmp.dt(length, zArr2, new rov(this, 6));
            if (db(9)) {
                if (z) {
                    iArr10 = agnc.w(null, dk(getString(cI(9, rpb.a))));
                } else {
                    iArr10 = new int[]{h()};
                }
                iArr = iArr10;
            } else {
                iArr = null;
            }
            boolean[] zArr5 = zArr2;
            agmp.dq(length, iArr, new rov(this, 7));
            if (db(10)) {
                if (z) {
                    zArr3 = agnc.A(null, dn(getString(cI(10, rpb.a))));
                } else {
                    zArr3 = new boolean[]{u()};
                }
            } else {
                zArr3 = null;
            }
            int[] iArr11 = iArr;
            agmp.dt(length, zArr3, new rov(this, 8));
            if (db(11)) {
                if (z) {
                    iArr9 = agnc.w(null, dk(getString(cI(11, rpb.a))));
                } else {
                    iArr9 = new int[]{g()};
                }
                iArr2 = iArr9;
            } else {
                iArr2 = null;
            }
            boolean[] zArr6 = zArr3;
            agmp.dq(length, iArr2, new rov(this, 9));
            if (db(12)) {
                if (z) {
                    iArr3 = iArr2;
                    strArr6 = (String[]) agnc.z(null, dm(getString(cI(12, rpb.a))), new String[0]);
                } else {
                    iArr3 = iArr2;
                    strArr6 = new String[]{m()};
                }
            } else {
                iArr3 = iArr2;
                strArr6 = null;
            }
            agmp.ds(length, strArr6, new rov(this, 10));
            if (db(13)) {
                if (z) {
                    iArr4 = agnc.w(null, dk(getString(cI(13, rpb.a))));
                } else {
                    iArr4 = new int[]{c()};
                }
            } else {
                iArr4 = null;
            }
            String[] strArr10 = strArr6;
            agmp.dq(length, iArr4, new rov(this, 11));
            if (db(14)) {
                if (z) {
                    iArr8 = agnc.w(null, dk(getString(cI(14, rpb.a))));
                } else {
                    iArr8 = new int[]{e()};
                }
                iArr5 = iArr8;
            } else {
                iArr5 = null;
            }
            int[] iArr12 = iArr4;
            agmp.dq(length, iArr5, new rov(this, 12));
            if (db(15)) {
                if (z) {
                    iArr6 = agnc.w(null, dk(getString(cI(15, rpb.a))));
                } else {
                    iArr6 = new int[]{f()};
                }
            } else {
                iArr6 = null;
            }
            int[] iArr13 = iArr5;
            agmp.dq(length, iArr6, new rov(this, 13));
            if (db(16)) {
                if (z) {
                    iArr7 = iArr6;
                    strArr7 = (String[]) agnc.z(null, dm(getString(cI(16, rpb.a))), new String[0]);
                } else {
                    iArr7 = iArr6;
                    strArr7 = new String[]{l()};
                }
            } else {
                iArr7 = iArr6;
                strArr7 = null;
            }
            agmp.ds(length, strArr7, new rov(this, 14));
            if (db(17)) {
                if (z) {
                    int[] dk = dk(getString(cI(17, rpb.a)));
                    xxw[] values = xxw.values();
                    int length3 = values.length;
                    strArr8 = strArr7;
                    xxw[] xxwVarArr2 = new xxw[dk.length];
                    strArr9 = strArr5;
                    zArr4 = zArr;
                    for (int i2 = 0; i2 < dk.length; i2++) {
                        int i3 = dk[i2];
                        if (i3 < length3) {
                            xxwVarArr2[i2] = values[i3];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    xxwVarArr = (xxw[]) agnc.z(null, xxwVarArr2, new xxw[0]);
                } else {
                    strArr8 = strArr7;
                    strArr9 = strArr5;
                    zArr4 = zArr;
                    xxwVarArr = new xxw[]{k()};
                }
            } else {
                strArr8 = strArr7;
                strArr9 = strArr5;
                zArr4 = zArr;
                xxwVarArr = null;
            }
            agmp.ds(length, xxwVarArr, new rov(this, 15));
            alob alobVar2 = new alob();
            int i4 = 0;
            while (i4 < length) {
                long j = du[i4];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i4]));
                    String[] strArr11 = rpb.a;
                    int i5 = roi.a;
                    rot rotVar = new rot();
                    rotVar.aD();
                    rotVar.aB();
                    long j2 = du[i4];
                    jArr2 = du;
                    if (jArr != null) {
                        long j3 = jArr[i4];
                        rotVar.aC(0);
                        rotVar.a = j3;
                    }
                    if (qweVarArr != null) {
                        qwe qweVar = qweVarArr[i4];
                        int i6 = rotVar.az;
                        if (i6 < 110) {
                            agnc.t("my_identity_token_foreign_key", i6);
                        }
                        rotVar.aC(1);
                        rotVar.b = qweVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i4];
                        int i7 = rotVar.az;
                        if (i7 < 0) {
                            agnc.t("normalized_destination", i7);
                        }
                        rotVar.aC(2);
                        rotVar.c = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i4];
                        int i8 = rotVar.az;
                        if (i8 < 0) {
                            agnc.t("send_destination", i8);
                        }
                        rotVar.aC(3);
                        rotVar.d = str2;
                    }
                    if (strArr3 != null) {
                        String str3 = strArr3[i4];
                        int i9 = rotVar.az;
                        if (i9 < 0) {
                            agnc.t("display_destination", i9);
                        }
                        rotVar.aC(4);
                        rotVar.e = str3;
                    }
                    if (strArr4 != null) {
                        String str4 = strArr4[i4];
                        int i10 = rotVar.az;
                        if (i10 < 0) {
                            agnc.t("first_name", i10);
                        }
                        rotVar.aC(5);
                        rotVar.f = str4;
                    }
                    if (strArr9 != null) {
                        String str5 = strArr9[i4];
                        int i11 = rotVar.az;
                        if (i11 < 0) {
                            agnc.t("full_name", i11);
                        }
                        rotVar.aC(6);
                        rotVar.g = str5;
                    }
                    if (zArr4 != null) {
                        boolean z2 = zArr4[i4];
                        int i12 = rotVar.az;
                        if (i12 < 0) {
                            agnc.t("is_self", i12);
                        }
                        rotVar.aC(7);
                        rotVar.h = z2;
                    }
                    if (zArr5 != null) {
                        boolean z3 = zArr5[i4];
                        int i13 = rotVar.az;
                        if (i13 < 0) {
                            agnc.t("blocked", i13);
                        }
                        rotVar.aC(8);
                        rotVar.i = z3;
                    }
                    if (iArr11 != null) {
                        int i14 = iArr11[i4];
                        int i15 = rotVar.az;
                        if (i15 < 0) {
                            agnc.t("participant_type", i15);
                        }
                        rotVar.aC(9);
                        rotVar.j = i14;
                    }
                    if (zArr6 != null) {
                        boolean z4 = zArr6[i4];
                        int i16 = rotVar.az;
                        if (i16 < 0) {
                            agnc.t("is_spam", i16);
                        }
                        rotVar.aC(10);
                        rotVar.k = z4;
                    }
                    if (iArr3 != null) {
                        int i17 = iArr3[i4];
                        int i18 = rotVar.az;
                        if (i18 < 0) {
                            agnc.t("is_spam_source", i18);
                        }
                        rotVar.aC(11);
                        rotVar.l = i17;
                    }
                    if (strArr10 != null) {
                        String str6 = strArr10[i4];
                        int i19 = rotVar.az;
                        if (i19 < 0) {
                            agnc.t("country_code", i19);
                        }
                        rotVar.aC(12);
                        rotVar.m = str6;
                    }
                    if (iArr12 != null) {
                        int i20 = iArr12[i4];
                        int i21 = rotVar.az;
                        if (i21 < 0) {
                            agnc.t("color_palette_index", i21);
                        }
                        rotVar.aC(13);
                        rotVar.n = i20;
                    }
                    if (iArr13 != null) {
                        int i22 = iArr13[i4];
                        int i23 = rotVar.az;
                        if (i23 < 0) {
                            agnc.t("color_type", i23);
                        }
                        rotVar.aC(14);
                        rotVar.o = i22;
                    }
                    if (iArr7 != null) {
                        int i24 = iArr7[i4];
                        int i25 = rotVar.az;
                        if (i25 < 0) {
                            agnc.t("extended_color", i25);
                        }
                        rotVar.aC(15);
                        rotVar.p = i24;
                    }
                    if (strArr8 != null) {
                        String str7 = strArr8[i4];
                        int i26 = rotVar.az;
                        if (i26 < 0) {
                            agnc.t("cms_id", i26);
                        }
                        rotVar.aC(16);
                        rotVar.q = str7;
                    }
                    if (xxwVarArr != null) {
                        xxw xxwVar = xxwVarArr[i4];
                        int i27 = rotVar.az;
                        if (i27 < 0) {
                            agnc.t("cms_life_cycle", i27);
                        }
                        rotVar.aC(17);
                        rotVar.r = xxwVar;
                    }
                    ros rosVar = new ros();
                    rosVar.ar(rotVar.az());
                    rosVar.a = rotVar.a;
                    rosVar.b = rotVar.b;
                    rosVar.c = rotVar.c;
                    rosVar.d = rotVar.d;
                    rosVar.e = rotVar.e;
                    rosVar.f = rotVar.f;
                    rosVar.g = rotVar.g;
                    rosVar.h = rotVar.h;
                    rosVar.i = rotVar.i;
                    rosVar.j = rotVar.j;
                    rosVar.k = rotVar.k;
                    rosVar.l = rotVar.l;
                    rosVar.m = rotVar.m;
                    rosVar.n = rotVar.n;
                    rosVar.o = rotVar.o;
                    rosVar.p = rotVar.p;
                    rosVar.q = rotVar.q;
                    rosVar.r = rotVar.r;
                    rosVar.cF = rotVar.aA();
                    alobVar = alobVar2;
                    alobVar.h(rosVar);
                } else {
                    jArr2 = du;
                    alobVar = alobVar2;
                }
                i4++;
                alobVar2 = alobVar;
                du = jArr2;
            }
            return alobVar2.g();
        }
        int i28 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(11, rpb.a));
    }

    public final int h() {
        return getInt(cI(9, rpb.a));
    }

    public final long i() {
        return getLong(cI(0, rpb.a));
    }

    public final qwe j() {
        return riw.m(getString(cI(1, rpb.a)));
    }

    public final xxw k() {
        xxw[] values = xxw.values();
        int i = getInt(cI(17, rpb.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String l() {
        return getString(cI(16, rpb.a));
    }

    public final String m() {
        return getString(cI(12, rpb.a));
    }

    public final String n() {
        return getString(cI(4, rpb.a));
    }

    public final String o() {
        return getString(cI(5, rpb.a));
    }

    public final String p() {
        return getString(cI(6, rpb.a));
    }

    public final String q() {
        return getString(cI(2, rpb.a));
    }

    public final String r() {
        return getString(cI(3, rpb.a));
    }

    public final boolean s() {
        if (getInt(cI(8, rpb.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (getInt(cI(7, rpb.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (getInt(cI(10, rpb.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
