package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjh extends agmp<sjh, sjj, sjk, sjd, sjf> implements agmq {
    @Deprecated
    public sjh(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sjj sjjVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sjm.a, agoxVar, akkwVar, sjjVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sjd();
    }

    public final long c() {
        return getLong(cI(1, sjm.a));
    }

    public final long e() {
        return getLong(cI(15, sjm.a));
    }

    public final long f() {
        return getLong(cI(0, sjm.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        Uri[] uriArr;
        Uri[] uriArr2;
        Uri[] uriArr3;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        Uri[] uriArr4;
        Instant[] instantArr;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        long[] jArr3;
        int i;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        int i2;
        String[] strArr13;
        String[] strArr14;
        int i3;
        alob alobVar;
        Uri uri;
        Uri uri2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i4 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sjm.a))));
                    } else {
                        jArr = new long[]{f()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new siq(this, 7));
                if (db(1)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(1, sjm.a))));
                    } else {
                        jArr2 = new long[]{c()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new sjg(this, 3));
                if (db(2)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(2, sjm.a))), new String[0]);
                    } else {
                        strArr = new String[]{q()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new siq(this, 8));
                if (db(3)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, sjm.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{r()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new siq(this, 9));
                if (db(4)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(4, sjm.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{n()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new siq(this, 10));
                if (db(5)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(5, sjm.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{p()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new siq(this, 11));
                if (db(6)) {
                    if (z) {
                        strArr5 = (String[]) agnc.z(null, dm(getString(cI(6, sjm.a))), new String[0]);
                    } else {
                        strArr5 = new String[]{o()};
                    }
                } else {
                    strArr5 = null;
                }
                agmp.ds(length, strArr5, new siq(this, 12));
                if (db(7)) {
                    if (z) {
                        String[] dm = dm(getString(cI(7, sjm.a)));
                        int length2 = dm.length;
                        Uri[] uriArr5 = new Uri[length2];
                        int i5 = 0;
                        while (i4 < length2) {
                            String str = dm[i4];
                            int i6 = i5 + 1;
                            if (str != null && str.length() != 0) {
                                uri2 = Uri.parse(str);
                            } else {
                                uri2 = null;
                            }
                            uriArr5[i5] = uri2;
                            i4++;
                            i5 = i6;
                        }
                        uriArr = (Uri[]) agnc.z(null, uriArr5, new Uri[0]);
                    } else {
                        uriArr = new Uri[]{h()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new siq(this, 13));
                if (db(8)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(8, sjm.a)));
                        int length3 = dm2.length;
                        Uri[] uriArr6 = new Uri[length3];
                        uriArr2 = uriArr;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length3) {
                            String str2 = dm2[i7];
                            int i9 = i8 + 1;
                            if (str2 != null && str2.length() != 0) {
                                uri = Uri.parse(str2);
                            } else {
                                uri = null;
                            }
                            uriArr6[i8] = uri;
                            i7++;
                            i8 = i9;
                        }
                        uriArr3 = (Uri[]) agnc.z(null, uriArr6, new Uri[0]);
                    } else {
                        uriArr2 = uriArr;
                        uriArr3 = new Uri[]{i()};
                    }
                } else {
                    uriArr2 = uriArr;
                    uriArr3 = null;
                }
                agmp.ds(length, uriArr3, new siq(this, 14));
                if (db(9)) {
                    if (z) {
                        strArr6 = (String[]) agnc.z(null, dm(getString(cI(9, sjm.a))), new String[0]);
                    } else {
                        strArr6 = new String[]{l()};
                    }
                } else {
                    strArr6 = null;
                }
                agmp.ds(length, strArr6, new siq(this, 15));
                if (db(10)) {
                    if (z) {
                        strArr7 = strArr6;
                        strArr8 = (String[]) agnc.z(null, dm(getString(cI(10, sjm.a))), new String[0]);
                    } else {
                        strArr7 = strArr6;
                        strArr8 = new String[]{k()};
                    }
                } else {
                    strArr7 = strArr6;
                    strArr8 = null;
                }
                agmp.ds(length, strArr8, new siq(this, 16));
                if (db(11)) {
                    if (z) {
                        long[] dl = dl(getString(cI(11, sjm.a)));
                        int length4 = dl.length;
                        strArr9 = strArr8;
                        Instant[] instantArr2 = new Instant[length4];
                        uriArr4 = uriArr3;
                        for (int i10 = 0; i10 < length4; i10++) {
                            instantArr2[i10] = uzz.l(dl[i10]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                    } else {
                        strArr9 = strArr8;
                        uriArr4 = uriArr3;
                        instantArr = new Instant[]{j()};
                    }
                } else {
                    strArr9 = strArr8;
                    uriArr4 = uriArr3;
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new siq(this, 17));
                if (db(12)) {
                    if (z) {
                        strArr10 = (String[]) agnc.z(null, dm(getString(cI(12, sjm.a))), new String[0]);
                    } else {
                        strArr10 = new String[]{t()};
                    }
                } else {
                    strArr10 = null;
                }
                agmp.ds(length, strArr10, new siq(this, 18));
                if (db(13)) {
                    if (z) {
                        strArr11 = strArr10;
                        strArr12 = (String[]) agnc.z(null, dm(getString(cI(13, sjm.a))), new String[0]);
                    } else {
                        strArr11 = strArr10;
                        strArr12 = new String[]{s()};
                    }
                } else {
                    strArr11 = strArr10;
                    strArr12 = null;
                }
                agmp.ds(length, strArr12, new siq(this, 19));
                if (db(14)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(14, sjm.a))));
                    } else {
                        jArr3 = new long[]{g()};
                    }
                } else {
                    jArr3 = null;
                }
                String[] strArr15 = strArr12;
                agmp.dr(length, jArr3, new siq(this, 20));
                if (db(15)) {
                    if (z) {
                        jArr5 = agnc.y(null, dl(getString(cI(15, sjm.a))));
                        jArr4 = jArr3;
                        i = 1;
                    } else {
                        i = 1;
                        jArr5 = new long[]{e()};
                        jArr4 = jArr3;
                    }
                } else {
                    i = 1;
                    jArr4 = jArr3;
                    jArr5 = null;
                }
                agmp.dr(length, jArr5, new sjg(this, i));
                if (db(16)) {
                    if (z) {
                        jArr6 = jArr5;
                        strArr13 = (String[]) agnc.z(null, dm(getString(cI(16, sjm.a))), new String[0]);
                        i2 = 0;
                    } else {
                        jArr6 = jArr5;
                        i2 = 0;
                        strArr13 = new String[]{u()};
                    }
                } else {
                    jArr6 = jArr5;
                    i2 = 0;
                    strArr13 = null;
                }
                agmp.ds(length, strArr13, new sjg(this, i2));
                if (db(17)) {
                    if (z) {
                        strArr14 = (String[]) agnc.z(null, dm(getString(cI(17, sjm.a))), new String[i2]);
                    } else {
                        strArr14 = new String[]{m()};
                    }
                } else {
                    strArr14 = null;
                }
                agmp.ds(length, strArr14, new sjg(this, 2));
                alob alobVar2 = new alob();
                int i11 = 0;
                while (i11 < length) {
                    long j = du[i11];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i11]));
                        String[] strArr16 = sjm.a;
                        int i12 = shg.a;
                        sje sjeVar = new sje();
                        sjeVar.aD();
                        sjeVar.aB();
                        long j2 = du[i11];
                        i3 = length;
                        alob alobVar3 = alobVar2;
                        if (jArr != null) {
                            sjeVar.f(jArr[i11]);
                        }
                        if (jArr2 != null) {
                            sjeVar.d(jArr2[i11]);
                        }
                        if (strArr != null) {
                            sjeVar.l(strArr[i11]);
                        }
                        if (strArr2 != null) {
                            sjeVar.m(strArr2[i11]);
                        }
                        if (strArr3 != null) {
                            sjeVar.h(strArr3[i11]);
                        }
                        if (strArr4 != null) {
                            sjeVar.j(strArr4[i11]);
                        }
                        if (strArr5 != null) {
                            sjeVar.i(strArr5[i11]);
                        }
                        if (uriArr2 != null) {
                            sjeVar.p(uriArr2[i11]);
                        }
                        if (uriArr4 != null) {
                            sjeVar.r(uriArr4[i11]);
                        }
                        if (strArr7 != null) {
                            sjeVar.c(strArr7[i11]);
                        }
                        if (strArr9 != null) {
                            sjeVar.b(strArr9[i11]);
                        }
                        if (instantArr != null) {
                            sjeVar.k(instantArr[i11]);
                        }
                        if (strArr11 != null) {
                            sjeVar.q(strArr11[i11]);
                        }
                        if (strArr15 != null) {
                            sjeVar.o(strArr15[i11]);
                        }
                        if (jArr4 != null) {
                            sjeVar.n(jArr4[i11]);
                        }
                        if (jArr6 != null) {
                            sjeVar.e(jArr6[i11]);
                        }
                        if (strArr13 != null) {
                            sjeVar.s(strArr13[i11]);
                        }
                        if (strArr14 != null) {
                            sjeVar.g(strArr14[i11]);
                        }
                        alobVar = alobVar3;
                        alobVar.h(sjeVar.a());
                    } else {
                        i3 = length;
                        alobVar = alobVar2;
                    }
                    i11++;
                    alobVar2 = alobVar;
                    length = i3;
                }
                return alobVar2.g();
            }
        }
        int i13 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(14, sjm.a));
    }

    public final Uri h() {
        String string = getString(cI(7, sjm.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri i() {
        String string = getString(cI(8, sjm.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Instant j() {
        return uzz.l(getLong(cI(11, sjm.a)));
    }

    public final String k() {
        return getString(cI(10, sjm.a));
    }

    public final String l() {
        return getString(cI(9, sjm.a));
    }

    public final String m() {
        return getString(cI(17, sjm.a));
    }

    public final String n() {
        return getString(cI(4, sjm.a));
    }

    public final String o() {
        return getString(cI(6, sjm.a));
    }

    public final String p() {
        return getString(cI(5, sjm.a));
    }

    public final String q() {
        return getString(cI(2, sjm.a));
    }

    public final String r() {
        return getString(cI(3, sjm.a));
    }

    public final String s() {
        return getString(cI(13, sjm.a));
    }

    public final String t() {
        return getString(cI(12, sjm.a));
    }

    public final String u() {
        return getString(cI(16, sjm.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
