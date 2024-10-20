package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdh extends agmp<tdh, tdi, tdj, ProfilesTable.BindData, tdf> implements agmq {
    @Deprecated
    public tdh(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tdi tdiVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, ProfilesTable.a, agoxVar, akkwVar, tdiVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tdc();
    }

    public final long c() {
        return getLong(cI(19, ProfilesTable.a));
    }

    public final long e() {
        return getLong(cI(0, ProfilesTable.a));
    }

    public final long f() {
        return getLong(cI(16, ProfilesTable.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        String[] strArr;
        String[] strArr2;
        nda[] ndaVarArr;
        voz[] vozVarArr;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        Uri[] uriArr;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        int i;
        String[] strArr15;
        boolean[] zArr;
        boolean[] zArr2;
        int i2;
        boolean[] zArr3;
        long[] jArr3;
        long[] jArr4;
        boolean[] zArr4;
        long[] jArr5;
        long[] jArr6;
        voz[] vozVarArr2;
        HashSet hashSet;
        alob alobVar;
        alob alobVar2;
        Uri uri;
        voz vozVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet2 = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, ProfilesTable.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tcj(this, 6));
            if (db(1)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(1, ProfilesTable.a))));
                } else {
                    jArr2 = new long[]{g()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new tcj(this, 8));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, ProfilesTable.a))), new String[0]);
                } else {
                    strArr = new String[]{p()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tcj(this, 9));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, ProfilesTable.a))), new String[0]);
                } else {
                    strArr2 = new String[]{r()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tcj(this, 10));
            if (db(4)) {
                if (z) {
                    int[] dk = dk(getString(cI(4, ProfilesTable.a)));
                    nda[] values = nda.values();
                    int length2 = values.length;
                    nda[] ndaVarArr2 = new nda[dk.length];
                    for (int i3 = 0; i3 < dk.length; i3++) {
                        int i4 = dk[i3];
                        if (i4 < length2) {
                            ndaVarArr2[i3] = values[i4];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    ndaVarArr = (nda[]) agnc.z(null, ndaVarArr2, new nda[0]);
                } else {
                    ndaVarArr = new nda[]{j()};
                }
            } else {
                ndaVarArr = null;
            }
            agmp.ds(length, ndaVarArr, new tcj(this, 11));
            if (db(5)) {
                if (z) {
                    List cY = cY(getString(cI(5, ProfilesTable.a)));
                    voz[] vozVarArr3 = new voz[cY.size()];
                    Iterator it = cY.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] v = agnc.v((String) it.next());
                            int i6 = i5 + 1;
                            if (v == null) {
                                vozVar = null;
                            } else {
                                try {
                                    vozVar = (voz) apag.parseFrom(voz.a, v);
                                } catch (Throwable unused) {
                                    i5 = i6;
                                    vozVarArr3[i5] = null;
                                    i5++;
                                }
                            }
                            vozVarArr3[i5] = vozVar;
                            i5 = i6;
                        } catch (Throwable unused2) {
                        }
                    }
                    vozVarArr = (voz[]) agnc.z(null, vozVarArr3, new voz[0]);
                } else {
                    vozVarArr = new voz[]{k()};
                }
            } else {
                vozVarArr = null;
            }
            agmp.ds(length, vozVarArr, new tcj(this, 12));
            if (db(6)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(6, ProfilesTable.a))), new String[0]);
                } else {
                    strArr3 = new String[]{n()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new tcj(this, 13));
            if (db(7)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(7, ProfilesTable.a))), new String[0]);
                } else {
                    strArr4 = new String[]{o()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new tcj(this, 14));
            if (db(8)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(8, ProfilesTable.a))), new String[0]);
                } else {
                    strArr5 = new String[]{m()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new tcj(this, 15));
            if (db(9)) {
                if (z) {
                    String[] dm = dm(getString(cI(9, ProfilesTable.a)));
                    int length3 = dm.length;
                    strArr6 = strArr5;
                    Uri[] uriArr2 = new Uri[length3];
                    strArr7 = strArr4;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length3) {
                        String str = dm[i7];
                        int i9 = i8 + 1;
                        if (str != null && str.length() != 0) {
                            uri = Uri.parse(str);
                        } else {
                            uri = null;
                        }
                        uriArr2[i8] = uri;
                        i7++;
                        i8 = i9;
                    }
                    uriArr = (Uri[]) agnc.z(null, uriArr2, new Uri[0]);
                } else {
                    strArr6 = strArr5;
                    strArr7 = strArr4;
                    uriArr = new Uri[]{i()};
                }
            } else {
                strArr6 = strArr5;
                strArr7 = strArr4;
                uriArr = null;
            }
            agmp.ds(length, uriArr, new tcj(this, 16));
            if (db(10)) {
                if (z) {
                    strArr8 = (String[]) agnc.z(null, dm(getString(cI(10, ProfilesTable.a))), new String[0]);
                } else {
                    strArr8 = new String[]{s()};
                }
            } else {
                strArr8 = null;
            }
            agmp.ds(length, strArr8, new tcj(this, 17));
            if (db(11)) {
                if (z) {
                    strArr9 = strArr8;
                    strArr10 = (String[]) agnc.z(null, dm(getString(cI(11, ProfilesTable.a))), new String[0]);
                } else {
                    strArr9 = strArr8;
                    strArr10 = new String[]{t()};
                }
            } else {
                strArr9 = strArr8;
                strArr10 = null;
            }
            agmp.ds(length, strArr10, new tcj(this, 18));
            if (db(12)) {
                if (z) {
                    strArr11 = strArr10;
                    strArr12 = (String[]) agnc.z(null, dm(getString(cI(12, ProfilesTable.a))), new String[0]);
                } else {
                    strArr11 = strArr10;
                    strArr12 = new String[]{l()};
                }
            } else {
                strArr11 = strArr10;
                strArr12 = null;
            }
            agmp.ds(length, strArr12, new tcj(this, 19));
            if (db(13)) {
                if (z) {
                    strArr13 = strArr12;
                    strArr14 = (String[]) agnc.z(null, dm(getString(cI(13, ProfilesTable.a))), new String[0]);
                } else {
                    strArr13 = strArr12;
                    strArr14 = new String[]{q()};
                }
            } else {
                strArr13 = strArr12;
                strArr14 = null;
            }
            agmp.ds(length, strArr14, new tcj(this, 20));
            if (db(14)) {
                if (z) {
                    strArr15 = strArr14;
                    zArr = agnc.A(null, dn(getString(cI(14, ProfilesTable.a))));
                    i = 1;
                } else {
                    i = 1;
                    zArr = new boolean[]{w()};
                    strArr15 = strArr14;
                }
            } else {
                i = 1;
                strArr15 = strArr14;
                zArr = null;
            }
            agmp.dt(length, zArr, new tdg(this, i));
            if (db(15)) {
                if (z) {
                    zArr3 = agnc.A(null, dn(getString(cI(15, ProfilesTable.a))));
                    zArr2 = zArr;
                    i2 = 0;
                } else {
                    boolean[] zArr5 = new boolean[i];
                    zArr2 = zArr;
                    i2 = 0;
                    zArr5[0] = v();
                    zArr3 = zArr5;
                }
            } else {
                zArr2 = zArr;
                i2 = 0;
                zArr3 = null;
            }
            agmp.dt(length, zArr3, new tdg(this, i2));
            if (db(16)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(16, ProfilesTable.a))));
                } else {
                    jArr3 = new long[]{f()};
                }
            } else {
                jArr3 = null;
            }
            boolean[] zArr6 = zArr3;
            agmp.dr(length, jArr3, new tdg(this, 2));
            if (db(17)) {
                if (z) {
                    jArr4 = agnc.y(null, dl(getString(cI(17, ProfilesTable.a))));
                } else {
                    jArr4 = new long[]{h()};
                }
            } else {
                jArr4 = null;
            }
            long[] jArr7 = jArr3;
            agmp.dr(length, jArr4, new tdg(this, 3));
            if (db(18)) {
                if (z) {
                    zArr4 = agnc.A(null, dn(getString(cI(18, ProfilesTable.a))));
                } else {
                    zArr4 = new boolean[]{u()};
                }
            } else {
                zArr4 = null;
            }
            long[] jArr8 = jArr4;
            agmp.dt(length, zArr4, new tdg(this, 4));
            if (db(19)) {
                if (z) {
                    jArr5 = agnc.y(null, dl(getString(cI(19, ProfilesTable.a))));
                } else {
                    jArr5 = new long[]{c()};
                }
            } else {
                jArr5 = null;
            }
            agmp.dr(length, jArr5, new tcj(this, 7));
            alob alobVar3 = new alob();
            int i10 = 0;
            while (i10 < length) {
                long j = du[i10];
                if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                    hashSet2.add(Long.valueOf(du[i10]));
                    String[] strArr16 = ProfilesTable.a;
                    int i11 = tdb.a;
                    tdd tddVar = new tdd();
                    tddVar.aD();
                    tddVar.aB();
                    long j2 = du[i10];
                    if (jArr != null) {
                        hashSet = hashSet2;
                        alobVar2 = alobVar3;
                        long j3 = jArr[i10];
                        jArr6 = du;
                        tddVar.aC(0);
                        tddVar.a = j3;
                    } else {
                        jArr6 = du;
                        hashSet = hashSet2;
                        alobVar2 = alobVar3;
                    }
                    if (jArr2 != null) {
                        long j4 = jArr2[i10];
                        tddVar.aC(1);
                        tddVar.b = j4;
                    }
                    if (strArr != null) {
                        String str2 = strArr[i10];
                        int i12 = tddVar.az;
                        if (i12 < 60170) {
                            agnc.t("person_id", i12);
                        }
                        tddVar.aC(2);
                        tddVar.c = str2;
                    }
                    if (strArr2 != null) {
                        String str3 = strArr2[i10];
                        int i13 = tddVar.az;
                        if (i13 < 60170) {
                            agnc.t("profile_access_token", i13);
                        }
                        tddVar.aC(3);
                        tddVar.d = str3;
                    }
                    if (ndaVarArr != null) {
                        nda ndaVar = ndaVarArr[i10];
                        int i14 = tddVar.az;
                        if (i14 < 60200) {
                            agnc.t("sending_self_profile_interaction_state", i14);
                        }
                        tddVar.aC(4);
                        tddVar.e = ndaVar;
                    }
                    if (vozVarArr != null) {
                        voz vozVar2 = vozVarArr[i10];
                        int i15 = tddVar.az;
                        if (i15 < 60340) {
                            agnc.t("self_profile_sharing_metadata", i15);
                        }
                        tddVar.aC(5);
                        tddVar.f = vozVar2;
                    }
                    if (strArr3 != null) {
                        String str4 = strArr3[i10];
                        tddVar.aC(6);
                        tddVar.g = str4;
                    }
                    if (strArr7 != null) {
                        String str5 = strArr7[i10];
                        tddVar.aC(7);
                        tddVar.h = str5;
                    }
                    if (strArr6 != null) {
                        String str6 = strArr6[i10];
                        tddVar.aC(8);
                        tddVar.i = str6;
                    }
                    if (uriArr != null) {
                        Uri uri2 = uriArr[i10];
                        tddVar.aC(9);
                        tddVar.j = uri2;
                    }
                    if (strArr9 != null) {
                        String str7 = strArr9[i10];
                        int i16 = tddVar.az;
                        if (i16 < 60170) {
                            agnc.t("sender_last_updated_time", i16);
                        }
                        tddVar.aC(10);
                        tddVar.k = str7;
                    }
                    if (strArr11 != null) {
                        String str8 = strArr11[i10];
                        int i17 = tddVar.az;
                        if (i17 < 60200) {
                            agnc.t("sender_last_updated_time_from_rcs", i17);
                        }
                        tddVar.aC(11);
                        tddVar.l = str8;
                    }
                    if (strArr13 != null) {
                        String str9 = strArr13[i10];
                        tddVar.aC(12);
                        tddVar.m = str9;
                    }
                    if (strArr15 != null) {
                        String str10 = strArr15[i10];
                        tddVar.aC(13);
                        tddVar.n = str10;
                    }
                    if (zArr2 != null) {
                        boolean z2 = zArr2[i10];
                        int i18 = tddVar.az;
                        if (i18 < 60400) {
                            agnc.t("is_self_profile_shareable", i18);
                        }
                        tddVar.aC(14);
                        tddVar.o = z2;
                    }
                    if (zArr6 != null) {
                        boolean z3 = zArr6[i10];
                        int i19 = tddVar.az;
                        if (i19 < 60170) {
                            agnc.t("has_shared_access_token_with_user", i19);
                        }
                        tddVar.aC(15);
                        tddVar.p = z3;
                    }
                    if (jArr7 != null) {
                        long j5 = jArr7[i10];
                        tddVar.aC(16);
                        tddVar.q = j5;
                    }
                    if (jArr8 != null) {
                        long j6 = jArr8[i10];
                        tddVar.aC(17);
                        tddVar.r = j6;
                    }
                    if (zArr4 != null) {
                        boolean z4 = zArr4[i10];
                        int i20 = tddVar.az;
                        if (i20 < 59940) {
                            agnc.t("belongs_to_self_gaia", i20);
                        }
                        tddVar.aC(18);
                        tddVar.s = z4;
                    }
                    if (jArr5 != null) {
                        long j7 = jArr5[i10];
                        int i21 = tddVar.az;
                        vozVarArr2 = vozVarArr;
                        if (i21 < 59940) {
                            agnc.t("gaia_update_timestamp", i21);
                        }
                        tddVar.aC(19);
                        tddVar.t = j7;
                    } else {
                        vozVarArr2 = vozVarArr;
                    }
                    tdc tdcVar = new tdc();
                    tdcVar.ar(tddVar.az());
                    tdcVar.a = tddVar.a;
                    tdcVar.b = tddVar.b;
                    tdcVar.c = tddVar.c;
                    tdcVar.d = tddVar.d;
                    tdcVar.e = tddVar.e;
                    tdcVar.f = tddVar.f;
                    tdcVar.g = tddVar.g;
                    tdcVar.h = tddVar.h;
                    tdcVar.i = tddVar.i;
                    tdcVar.j = tddVar.j;
                    tdcVar.k = tddVar.k;
                    tdcVar.l = tddVar.l;
                    tdcVar.m = tddVar.m;
                    tdcVar.n = tddVar.n;
                    tdcVar.o = tddVar.o;
                    tdcVar.p = tddVar.p;
                    tdcVar.q = tddVar.q;
                    tdcVar.r = tddVar.r;
                    tdcVar.s = tddVar.s;
                    tdcVar.t = tddVar.t;
                    tdcVar.cF = tddVar.aA();
                    alobVar = alobVar2;
                    alobVar.h(tdcVar);
                } else {
                    jArr6 = du;
                    vozVarArr2 = vozVarArr;
                    hashSet = hashSet2;
                    alobVar = alobVar3;
                }
                i10++;
                alobVar3 = alobVar;
                hashSet2 = hashSet;
                du = jArr6;
                vozVarArr = vozVarArr2;
            }
            return alobVar3.g();
        }
        int i22 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(1, ProfilesTable.a));
    }

    public final long h() {
        return getLong(cI(17, ProfilesTable.a));
    }

    public final Uri i() {
        String string = getString(cI(9, ProfilesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final nda j() {
        nda[] values = nda.values();
        int i = getInt(cI(4, ProfilesTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final voz k() {
        byte[] blob = getBlob(cI(5, ProfilesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (voz) apag.parseFrom(voz.a, blob, aozs.a());
        } catch (Throwable unused) {
            return voz.a;
        }
    }

    public final String l() {
        return getString(cI(12, ProfilesTable.a));
    }

    public final String m() {
        return getString(cI(8, ProfilesTable.a));
    }

    public final String n() {
        return getString(cI(6, ProfilesTable.a));
    }

    public final String o() {
        return getString(cI(7, ProfilesTable.a));
    }

    public final String p() {
        return getString(cI(2, ProfilesTable.a));
    }

    public final String q() {
        return getString(cI(13, ProfilesTable.a));
    }

    public final String r() {
        return getString(cI(3, ProfilesTable.a));
    }

    public final String s() {
        return getString(cI(10, ProfilesTable.a));
    }

    public final String t() {
        return getString(cI(11, ProfilesTable.a));
    }

    public final boolean u() {
        if (getInt(cI(18, ProfilesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if (getInt(cI(15, ProfilesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if (getInt(cI(14, ProfilesTable.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
