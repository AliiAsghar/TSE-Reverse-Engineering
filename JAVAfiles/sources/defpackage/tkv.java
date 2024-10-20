package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkv extends agmp implements agmq {
    @Deprecated
    public tkv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tkw tkwVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tky.a, agoxVar, akkwVar, tkwVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tks();
    }

    public final long c() {
        return getLong(cI(0, tky.a));
    }

    public final long e() {
        return getLong(cI(6, tky.a));
    }

    public final Uri f() {
        String string = getString(cI(3, tky.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        qwe[] qweVarArr;
        String[] strArr;
        Uri[] uriArr;
        boolean[] zArr;
        boolean[] zArr2;
        long[] jArr2;
        int i;
        char c;
        Uri uri;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                long[] jArr3 = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, tky.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new tkk(this, 10));
                if (db(1)) {
                    if (z) {
                        String[] dm = dm(getString(cI(1, tky.a)));
                        int length2 = dm.length;
                        qwe[] qweVarArr2 = new qwe[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            qweVarArr2[i3] = riw.m(dm[i3]);
                        }
                        qweVarArr = (qwe[]) agnc.z(null, qweVarArr2, new qwe[0]);
                    } else {
                        qweVarArr = new qwe[]{g()};
                    }
                } else {
                    qweVarArr = null;
                }
                agmp.ds(length, qweVarArr, new tkk(this, 11));
                if (db(2)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(2, tky.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tkk(this, 12));
                if (db(3)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(3, tky.a)));
                        int length3 = dm2.length;
                        Uri[] uriArr2 = new Uri[length3];
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length3) {
                            String str = dm2[i4];
                            int i6 = i5 + 1;
                            if (str != null && str.length() != 0) {
                                uri = Uri.parse(str);
                            } else {
                                uri = null;
                            }
                            uriArr2[i5] = uri;
                            i4++;
                            i5 = i6;
                        }
                        uriArr = (Uri[]) agnc.z(null, uriArr2, new Uri[0]);
                    } else {
                        uriArr = new Uri[]{f()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new tkk(this, 13));
                if (db(4)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(4, tky.a))));
                    } else {
                        zArr = new boolean[]{j()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new tkk(this, 14));
                if (db(5)) {
                    if (z) {
                        zArr2 = agnc.A(null, dn(getString(cI(5, tky.a))));
                    } else {
                        zArr2 = new boolean[]{i()};
                    }
                } else {
                    zArr2 = null;
                }
                agmp.dt(length, zArr2, new tkk(this, 15));
                char c2 = 6;
                if (db(6)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(6, tky.a))));
                    } else {
                        jArr3 = new long[]{e()};
                    }
                }
                agmp.dr(length, jArr3, new tkk(this, 16));
                alob alobVar = new alob();
                int i7 = 0;
                while (i7 < length) {
                    long j = du[i7];
                    if (j > 0) {
                        if (hashSet.contains(Long.valueOf(j))) {
                            jArr2 = du;
                            i = length;
                            c = 6;
                        } else {
                            hashSet.add(Long.valueOf(du[i7]));
                            String[] strArr2 = tky.a;
                            int i8 = tif.a;
                            tkt tktVar = new tkt();
                            tktVar.aD();
                            tktVar.aB();
                            long j2 = du[i7];
                            i = length;
                            if (jArr != null) {
                                long j3 = jArr[i7];
                                tktVar.aC(i2);
                                tktVar.a = j3;
                            }
                            if (qweVarArr != null) {
                                qwe qweVar = qweVarArr[i7];
                                tktVar.aC(1);
                                tktVar.b = qweVar;
                            }
                            if (strArr != null) {
                                String str2 = strArr[i7];
                                tktVar.aC(2);
                                tktVar.c = str2;
                            }
                            if (uriArr != null) {
                                Uri uri2 = uriArr[i7];
                                tktVar.aC(3);
                                tktVar.d = uri2;
                            }
                            if (zArr != null) {
                                boolean z2 = zArr[i7];
                                int i9 = tktVar.az;
                                if (i9 < 60400) {
                                    agnc.t("is_self_profile_shareable", i9);
                                }
                                tktVar.aC(4);
                                tktVar.e = z2;
                            }
                            if (zArr2 != null) {
                                boolean z3 = zArr2[i7];
                                tktVar.aC(5);
                                tktVar.f = z3;
                            }
                            if (jArr3 != null) {
                                long j4 = jArr3[i7];
                                c = 6;
                                tktVar.aC(6);
                                tktVar.g = j4;
                            } else {
                                c = 6;
                            }
                            tks tksVar = new tks();
                            tksVar.ar(tktVar.az());
                            jArr2 = du;
                            tksVar.a = tktVar.a;
                            tksVar.b = tktVar.b;
                            tksVar.c = tktVar.c;
                            tksVar.d = tktVar.d;
                            tksVar.e = tktVar.e;
                            tksVar.f = tktVar.f;
                            tksVar.g = tktVar.g;
                            tksVar.cF = tktVar.aA();
                            alobVar.h(tksVar);
                        }
                    } else {
                        jArr2 = du;
                        i = length;
                        c = c2;
                    }
                    i7++;
                    c2 = c;
                    du = jArr2;
                    length = i;
                    i2 = 0;
                }
                return alobVar.g();
            }
        }
        int i10 = alog.d;
        return alsx.a;
    }

    public final qwe g() {
        return riw.m(getString(cI(1, tky.a)));
    }

    public final String h() {
        return getString(cI(2, tky.a));
    }

    public final boolean i() {
        if (getInt(cI(5, tky.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (getInt(cI(4, tky.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
