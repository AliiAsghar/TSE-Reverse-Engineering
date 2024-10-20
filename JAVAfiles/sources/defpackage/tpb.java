package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tpb extends agmp implements agmq {
    @Deprecated
    public tpb(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tpe tpeVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tpi.a, agoxVar, akkwVar, tpeVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tox();
    }

    public final long c() {
        return getLong(cI(0, tpi.a));
    }

    public final Uri e() {
        String string = getString(cI(5, tpi.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String f() {
        return getString(cI(1, tpi.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        Uri[] uriArr;
        Uri uri;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                akkw akkwVar = this.i;
                boolean db = db(0);
                boolean z = akkwVar.b;
                String[] strArr5 = null;
                if (db) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, tpi.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new tor(this, 2));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, tpi.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tor(this, 3));
                if (db(2)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, tpi.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{i()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tor(this, 4));
                if (db(3)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(3, tpi.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{g()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new tor(this, 5));
                if (db(4)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(4, tpi.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{h()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new tor(this, 6));
                if (db(5)) {
                    if (z) {
                        String[] dm = dm(getString(cI(5, tpi.a)));
                        int length2 = dm.length;
                        Uri[] uriArr2 = new Uri[length2];
                        int i = 0;
                        int i2 = 0;
                        while (i < length2) {
                            String str = dm[i];
                            int i3 = i2 + 1;
                            if (str != null && str.length() != 0) {
                                uri = Uri.parse(str);
                            } else {
                                uri = null;
                            }
                            uriArr2[i2] = uri;
                            i++;
                            i2 = i3;
                        }
                        uriArr = (Uri[]) agnc.z(null, uriArr2, new Uri[0]);
                    } else {
                        uriArr = new Uri[]{e()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new tor(this, 7));
                if (db(6)) {
                    if (z) {
                        strArr5 = (String[]) agnc.z(null, dm(getString(cI(6, tpi.a))), new String[0]);
                    } else {
                        strArr5 = new String[]{j()};
                    }
                }
                agmp.ds(length, strArr5, new tor(this, 8));
                alob alobVar = new alob();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = du[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i4]));
                        toy a = tpi.a();
                        a.aB();
                        long j2 = du[i4];
                        if (jArr != null) {
                            a.d(jArr[i4]);
                        }
                        if (strArr != null) {
                            a.b(strArr[i4]);
                        }
                        if (strArr2 != null) {
                            a.g(strArr2[i4]);
                        }
                        if (strArr3 != null) {
                            a.c(strArr3[i4]);
                        }
                        if (strArr4 != null) {
                            a.f(strArr4[i4]);
                        }
                        if (uriArr != null) {
                            a.e(uriArr[i4]);
                        }
                        if (strArr5 != null) {
                            a.h(strArr5[i4]);
                        }
                        alobVar.h(a.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(3, tpi.a));
    }

    public final String h() {
        return getString(cI(4, tpi.a));
    }

    public final String i() {
        return getString(cI(2, tpi.a));
    }

    public final String j() {
        return getString(cI(6, tpi.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
