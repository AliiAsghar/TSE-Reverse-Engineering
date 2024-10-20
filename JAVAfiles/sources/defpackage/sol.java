package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sol extends agmp implements agmq {
    @Deprecated
    public sol(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, son sonVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sor.a, agoxVar, akkwVar, sonVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sog();
    }

    public final int c() {
        return getInt(cI(10, sor.a));
    }

    public final long e() {
        return getLong(cI(21, sor.a));
    }

    public final long f() {
        return getLong(cI(0, sor.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        String[] strArr2;
        boolean[] zArr;
        int i;
        byte[][] bArr;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        int[] iArr;
        byte[][] bArr2;
        byte[][] bArr3;
        byte[][] bArr4;
        byte[][] bArr5;
        String[] strArr6;
        boolean[] zArr2;
        tqt[] tqtVarArr;
        boolean[] zArr3;
        String[] strArr7;
        boolean[] zArr4;
        boolean[] zArr5;
        String[] strArr8;
        tqt[] tqtVarArr2;
        boolean[] zArr6;
        tqe[] tqeVarArr;
        tqe[] tqeVarArr2;
        tqm[] tqmVarArr;
        byte[][] bArr6;
        String[] strArr9;
        long[] jArr5;
        long[] jArr6;
        int i2;
        String[] strArr10;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sor.a))));
                } else {
                    jArr = new long[]{f()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new smz(this, 12));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, sor.a))), new String[0]);
                } else {
                    strArr = new String[]{m()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new smz(this, 14));
            if (db(2)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(2, sor.a))));
                } else {
                    jArr2 = new long[]{g()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new smz(this, 17));
            if (db(3)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(3, sor.a))));
                } else {
                    jArr3 = new long[]{h()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new smz(this, 18));
            if (db(4)) {
                if (z) {
                    jArr4 = agnc.y(null, dl(getString(cI(4, sor.a))));
                } else {
                    jArr4 = new long[]{i()};
                }
            } else {
                jArr4 = null;
            }
            agmp.dr(length, jArr4, new smz(this, 19));
            if (db(5)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(5, sor.a))), new String[0]);
                } else {
                    strArr2 = new String[]{n()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new smz(this, 20));
            if (db(6)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(6, sor.a))));
                } else {
                    zArr = new boolean[]{s()};
                }
            } else {
                zArr = null;
            }
            agmp.dt(length, zArr, new sok(this, 1));
            if (db(7)) {
                if (z) {
                    bArr = agnc.B(null, dv(getString(cI(7, sor.a))));
                    i = 0;
                } else {
                    i = 0;
                    bArr = new byte[][]{v()};
                }
            } else {
                i = 0;
                bArr = null;
            }
            agmp.ds(length, bArr, new sok(this, i));
            if (db(8)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(8, sor.a))), new String[i]);
                } else {
                    strArr3 = new String[]{p()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new sok(this, 3));
            if (db(9)) {
                if (z) {
                    strArr4 = strArr3;
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(9, sor.a))), new String[0]);
                } else {
                    strArr4 = strArr3;
                    strArr5 = new String[]{q()};
                }
            } else {
                strArr4 = strArr3;
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new sok(this, 4));
            if (db(10)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(10, sor.a))));
                } else {
                    iArr = new int[]{c()};
                }
            } else {
                iArr = null;
            }
            String[] strArr11 = strArr5;
            agmp.dq(length, iArr, new sok(this, 2));
            if (db(11)) {
                if (z) {
                    bArr2 = agnc.B(null, dv(getString(cI(11, sor.a))));
                } else {
                    bArr2 = new byte[][]{x()};
                }
            } else {
                bArr2 = null;
            }
            int[] iArr2 = iArr;
            agmp.ds(length, bArr2, new sok(this, 5));
            if (db(12)) {
                if (z) {
                    bArr3 = agnc.B(null, dv(getString(cI(12, sor.a))));
                } else {
                    bArr3 = new byte[][]{y()};
                }
            } else {
                bArr3 = null;
            }
            byte[][] bArr7 = bArr2;
            agmp.ds(length, bArr3, new sok(this, 6));
            if (db(13)) {
                if (z) {
                    int[] dk = dk(getString(cI(13, sor.a)));
                    tqt[] values = tqt.values();
                    bArr4 = bArr3;
                    int length2 = values.length;
                    bArr5 = bArr;
                    tqt[] tqtVarArr3 = new tqt[dk.length];
                    strArr6 = strArr2;
                    zArr2 = zArr;
                    for (int i3 = 0; i3 < dk.length; i3++) {
                        int i4 = dk[i3];
                        if (i4 < length2) {
                            tqtVarArr3[i3] = values[i4];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqtVarArr = (tqt[]) agnc.z(null, tqtVarArr3, new tqt[0]);
                } else {
                    bArr4 = bArr3;
                    bArr5 = bArr;
                    strArr6 = strArr2;
                    zArr2 = zArr;
                    tqtVarArr = new tqt[]{l()};
                }
            } else {
                bArr4 = bArr3;
                bArr5 = bArr;
                strArr6 = strArr2;
                zArr2 = zArr;
                tqtVarArr = null;
            }
            agmp.ds(length, tqtVarArr, new sok(this, 7));
            if (db(14)) {
                if (z) {
                    zArr3 = agnc.A(null, dn(getString(cI(14, sor.a))));
                } else {
                    zArr3 = new boolean[]{t()};
                }
            } else {
                zArr3 = null;
            }
            agmp.dt(length, zArr3, new sok(this, 8));
            if (db(15)) {
                if (z) {
                    strArr7 = (String[]) agnc.z(null, dm(getString(cI(15, sor.a))), new String[0]);
                } else {
                    strArr7 = new String[]{r()};
                }
            } else {
                strArr7 = null;
            }
            agmp.ds(length, strArr7, new sok(this, 9));
            if (db(16)) {
                if (z) {
                    zArr4 = agnc.A(null, dn(getString(cI(16, sor.a))));
                } else {
                    zArr4 = new boolean[]{u()};
                }
            } else {
                zArr4 = null;
            }
            agmp.dt(length, zArr4, new sok(this, 10));
            if (db(17)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(17, sor.a)));
                    tqe[] values2 = tqe.values();
                    zArr6 = zArr4;
                    int length3 = values2.length;
                    strArr8 = strArr7;
                    tqe[] tqeVarArr3 = new tqe[dk2.length];
                    zArr5 = zArr3;
                    tqtVarArr2 = tqtVarArr;
                    for (int i5 = 0; i5 < dk2.length; i5++) {
                        int i6 = dk2[i5];
                        if (i6 < length3) {
                            tqeVarArr3[i5] = values2[i6];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqeVarArr = (tqe[]) agnc.z(null, tqeVarArr3, new tqe[0]);
                } else {
                    zArr5 = zArr3;
                    strArr8 = strArr7;
                    tqtVarArr2 = tqtVarArr;
                    zArr6 = zArr4;
                    tqeVarArr = new tqe[]{j()};
                }
            } else {
                zArr5 = zArr3;
                strArr8 = strArr7;
                tqtVarArr2 = tqtVarArr;
                zArr6 = zArr4;
                tqeVarArr = null;
            }
            agmp.ds(length, tqeVarArr, new sok(this, 11));
            if (db(18)) {
                if (z) {
                    int[] dk3 = dk(getString(cI(18, sor.a)));
                    tqm[] values3 = tqm.values();
                    int length4 = values3.length;
                    tqm[] tqmVarArr2 = new tqm[dk3.length];
                    tqeVarArr2 = tqeVarArr;
                    for (int i7 = 0; i7 < dk3.length; i7++) {
                        int i8 = dk3[i7];
                        if (i8 < length4) {
                            tqmVarArr2[i7] = values3[i8];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqmVarArr = (tqm[]) agnc.z(null, tqmVarArr2, new tqm[0]);
                } else {
                    tqeVarArr2 = tqeVarArr;
                    tqmVarArr = new tqm[]{k()};
                }
            } else {
                tqeVarArr2 = tqeVarArr;
                tqmVarArr = null;
            }
            agmp.ds(length, tqmVarArr, new sok(this, 12));
            if (db(19)) {
                if (z) {
                    bArr6 = agnc.B(null, dv(getString(cI(19, sor.a))));
                } else {
                    bArr6 = new byte[][]{w()};
                }
            } else {
                bArr6 = null;
            }
            agmp.ds(length, bArr6, new smz(this, 13));
            if (db(20)) {
                if (z) {
                    strArr9 = (String[]) agnc.z(null, dm(getString(cI(20, sor.a))), new String[0]);
                } else {
                    strArr9 = new String[]{o()};
                }
            } else {
                strArr9 = null;
            }
            agmp.ds(length, strArr9, new smz(this, 15));
            if (db(21)) {
                if (z) {
                    jArr5 = agnc.y(null, dl(getString(cI(21, sor.a))));
                } else {
                    jArr5 = new long[]{e()};
                }
            } else {
                jArr5 = null;
            }
            agmp.dr(length, jArr5, new smz(this, 16));
            alob alobVar = new alob();
            int i9 = 0;
            while (i9 < length) {
                long j = du[i9];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i9]));
                    String[] strArr12 = sor.a;
                    int i10 = sms.a;
                    soh sohVar = new soh();
                    sohVar.aD();
                    sohVar.aB();
                    long j2 = du[i9];
                    jArr6 = du;
                    if (jArr != null) {
                        long j3 = jArr[i9];
                        i2 = length;
                        sohVar.aC(0);
                        sohVar.a = j3;
                    } else {
                        i2 = length;
                    }
                    if (strArr != null) {
                        String str = strArr[i9];
                        sohVar.aC(1);
                        sohVar.b = str;
                    }
                    String[] strArr13 = strArr9;
                    if (jArr2 != null) {
                        long j4 = jArr2[i9];
                        sohVar.aC(2);
                        sohVar.c = j4;
                    }
                    if (jArr3 != null) {
                        long j5 = jArr3[i9];
                        sohVar.aC(3);
                        sohVar.d = j5;
                    }
                    if (jArr4 != null) {
                        long j6 = jArr4[i9];
                        sohVar.aC(4);
                        sohVar.e = j6;
                    }
                    if (strArr6 != null) {
                        String str2 = strArr6[i9];
                        sohVar.aC(5);
                        sohVar.f = str2;
                    }
                    if (zArr2 != null) {
                        boolean z2 = zArr2[i9];
                        sohVar.aC(6);
                        sohVar.g = z2;
                    }
                    if (bArr5 != null) {
                        byte[] bArr8 = bArr5[i9];
                        sohVar.aC(7);
                        sohVar.h = bArr8;
                    }
                    if (strArr4 != null) {
                        String str3 = strArr4[i9];
                        int i11 = sohVar.az;
                        if (i11 < 22040) {
                            agnc.t("operating_system", i11);
                        }
                        sohVar.aC(8);
                        sohVar.i = str3;
                    }
                    if (strArr11 != null) {
                        String str4 = strArr11[i9];
                        int i12 = sohVar.az;
                        if (i12 < 22040) {
                            agnc.t("operating_system_version", i12);
                        }
                        sohVar.aC(9);
                        sohVar.j = str4;
                    }
                    if (iArr2 != null) {
                        int i13 = iArr2[i9];
                        int i14 = sohVar.az;
                        if (i14 < 18020) {
                            agnc.t("browser_type", i14);
                        }
                        sohVar.aC(10);
                        sohVar.k = i13;
                    }
                    if (bArr7 != null) {
                        byte[] bArr9 = bArr7[i9];
                        int i15 = sohVar.az;
                        if (i15 < 21030) {
                            agnc.t("encryption_key", i15);
                        }
                        sohVar.aC(11);
                        sohVar.l = bArr9;
                    }
                    if (bArr4 != null) {
                        byte[] bArr10 = bArr4[i9];
                        int i16 = sohVar.az;
                        if (i16 < 21030) {
                            agnc.t("hmac_key", i16);
                        }
                        sohVar.aC(12);
                        sohVar.m = bArr10;
                    }
                    if (tqtVarArr2 != null) {
                        tqt tqtVar = tqtVarArr2[i9];
                        int i17 = sohVar.az;
                        if (i17 < 41010) {
                            agnc.t("backend_type", i17);
                        }
                        sohVar.aC(13);
                        sohVar.n = tqtVar;
                    }
                    if (zArr5 != null) {
                        boolean z3 = zArr5[i9];
                        int i18 = sohVar.az;
                        if (i18 < 58010) {
                            agnc.t("is_active", i18);
                        }
                        sohVar.aC(14);
                        sohVar.o = z3;
                    }
                    if (strArr8 != null) {
                        String str5 = strArr8[i9];
                        int i19 = sohVar.az;
                        if (i19 < 58010) {
                            agnc.t("request_id", i19);
                        }
                        sohVar.aC(15);
                        sohVar.p = str5;
                    }
                    if (zArr6 != null) {
                        boolean z4 = zArr6[i9];
                        int i20 = sohVar.az;
                        if (i20 < 58010) {
                            agnc.t("is_persistent", i20);
                        }
                        sohVar.aC(16);
                        sohVar.q = z4;
                    }
                    if (tqeVarArr2 != null) {
                        tqe tqeVar = tqeVarArr2[i9];
                        int i21 = sohVar.az;
                        if (i21 < 58010) {
                            agnc.t("desktop_type", i21);
                        }
                        sohVar.aC(17);
                        sohVar.r = tqeVar;
                    }
                    if (tqmVarArr != null) {
                        tqm tqmVar = tqmVarArr[i9];
                        int i22 = sohVar.az;
                        if (i22 < 58960) {
                            agnc.t("pairing_type", i22);
                        }
                        sohVar.aC(18);
                        sohVar.s = tqmVar;
                    }
                    if (bArr6 != null) {
                        byte[] bArr11 = bArr6[i9];
                        int i23 = sohVar.az;
                        if (i23 < 59290) {
                            agnc.t("destination_registration_id", i23);
                        }
                        sohVar.aC(19);
                        sohVar.t = bArr11;
                    }
                    if (strArr13 != null) {
                        String str6 = strArr13[i9];
                        int i24 = sohVar.az;
                        if (i24 < 59560) {
                            agnc.t("gaia_email", i24);
                        }
                        sohVar.aC(20);
                        sohVar.u = str6;
                    }
                    if (jArr5 != null) {
                        long j7 = jArr5[i9];
                        int i25 = sohVar.az;
                        strArr10 = strArr13;
                        if (i25 < 59870) {
                            agnc.t("creation_time", i25);
                        }
                        sohVar.aC(21);
                        sohVar.v = j7;
                    } else {
                        strArr10 = strArr13;
                    }
                    sog sogVar = new sog();
                    sogVar.ar(sohVar.az());
                    sogVar.a = sohVar.a;
                    sogVar.b = sohVar.b;
                    sogVar.c = sohVar.c;
                    sogVar.d = sohVar.d;
                    sogVar.e = sohVar.e;
                    sogVar.f = sohVar.f;
                    sogVar.g = sohVar.g;
                    sogVar.h = sohVar.h;
                    sogVar.i = sohVar.i;
                    sogVar.j = sohVar.j;
                    sogVar.k = sohVar.k;
                    sogVar.l = sohVar.l;
                    sogVar.m = sohVar.m;
                    sogVar.n = sohVar.n;
                    sogVar.o = sohVar.o;
                    sogVar.p = sohVar.p;
                    sogVar.q = sohVar.q;
                    sogVar.r = sohVar.r;
                    sogVar.s = sohVar.s;
                    sogVar.t = sohVar.t;
                    sogVar.u = sohVar.u;
                    sogVar.v = sohVar.v;
                    sogVar.cF = sohVar.aA();
                    alobVar.h(sogVar);
                } else {
                    jArr6 = du;
                    i2 = length;
                    strArr10 = strArr9;
                }
                i9++;
                du = jArr6;
                length = i2;
                strArr9 = strArr10;
            }
            return alobVar.g();
        }
        int i26 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(2, sor.a));
    }

    public final long h() {
        return getLong(cI(3, sor.a));
    }

    public final long i() {
        return getLong(cI(4, sor.a));
    }

    public final tqe j() {
        tqe[] values = tqe.values();
        int i = getInt(cI(17, sor.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqm k() {
        tqm[] values = tqm.values();
        int i = getInt(cI(18, sor.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqt l() {
        tqt[] values = tqt.values();
        int i = getInt(cI(13, sor.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String m() {
        return getString(cI(1, sor.a));
    }

    public final String n() {
        return getString(cI(5, sor.a));
    }

    public final String o() {
        return getString(cI(20, sor.a));
    }

    public final String p() {
        return getString(cI(8, sor.a));
    }

    public final String q() {
        return getString(cI(9, sor.a));
    }

    public final String r() {
        return getString(cI(15, sor.a));
    }

    public final boolean s() {
        if (getInt(cI(6, sor.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (getInt(cI(14, sor.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (getInt(cI(16, sor.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] v() {
        return getBlob(cI(7, sor.a));
    }

    public final byte[] w() {
        return getBlob(cI(19, sor.a));
    }

    public final byte[] x() {
        return getBlob(cI(11, sor.a));
    }

    public final byte[] y() {
        return getBlob(cI(12, sor.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
