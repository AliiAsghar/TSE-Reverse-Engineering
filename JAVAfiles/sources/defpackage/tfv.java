package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfv extends agmp implements agmq {
    @Deprecated
    public tfv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tfx tfxVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tgb.a, agoxVar, akkwVar, tfxVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tfr();
    }

    public final int c() {
        return getInt(cI(5, tgb.a));
    }

    public final int e() {
        return getInt(cI(4, tgb.a));
    }

    public final long f() {
        return getLong(cI(6, tgb.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        Uri[] uriArr;
        Uri[] uriArr2;
        String[] strArr;
        String[] strArr2;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        Uri uri;
        Uri uri2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                long[] jArr2 = null;
                if (db(0)) {
                    if (z) {
                        String[] dm = dm(getString(cI(0, tgb.a)));
                        int length2 = dm.length;
                        Uri[] uriArr3 = new Uri[length2];
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length2) {
                            String str = dm[i2];
                            int i4 = i3 + 1;
                            if (str != null && str.length() != 0) {
                                uri2 = Uri.parse(str);
                            } else {
                                uri2 = null;
                            }
                            uriArr3[i3] = uri2;
                            i2++;
                            i3 = i4;
                        }
                        uriArr = (Uri[]) agnc.z(null, uriArr3, new Uri[0]);
                    } else {
                        uriArr = new Uri[]{h()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new tea(this, 20));
                if (db(1)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(1, tgb.a)));
                        int length3 = dm2.length;
                        Uri[] uriArr4 = new Uri[length3];
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length3) {
                            String str2 = dm2[i5];
                            int i7 = i6 + 1;
                            if (str2 != null && str2.length() != 0) {
                                uri = Uri.parse(str2);
                            } else {
                                uri = null;
                            }
                            uriArr4[i6] = uri;
                            i5++;
                            i6 = i7;
                        }
                        uriArr2 = (Uri[]) agnc.z(null, uriArr4, new Uri[0]);
                    } else {
                        uriArr2 = new Uri[]{g()};
                    }
                } else {
                    uriArr2 = null;
                }
                agmp.ds(length, uriArr2, new tfu(this, 1));
                if (db(2)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(2, tgb.a))), new String[0]);
                    } else {
                        strArr = new String[]{i()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tfu(this, 0));
                if (db(3)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, tgb.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{j()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tfu(this, 2));
                if (db(4)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(4, tgb.a))));
                    } else {
                        iArr = new int[]{e()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new tfu(this, 3));
                if (db(5)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(5, tgb.a))));
                    } else {
                        iArr2 = new int[]{c()};
                    }
                } else {
                    iArr2 = null;
                }
                agmp.dq(length, iArr2, new tfu(this, 4));
                if (db(6)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(6, tgb.a))));
                    } else {
                        jArr2 = new long[]{f()};
                    }
                }
                agmp.dr(length, jArr2, new tfu(this, 5));
                alob alobVar = new alob();
                while (i < length) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        String[] strArr3 = tgb.a;
                        int i8 = tfq.a;
                        tfs tfsVar = new tfs();
                        tfsVar.aD();
                        tfsVar.aB();
                        long j2 = du[i];
                        if (uriArr != null) {
                            tfsVar.f(uriArr[i]);
                        }
                        if (uriArr2 != null) {
                            tfsVar.b(uriArr2[i]);
                        }
                        if (strArr != null) {
                            tfsVar.c(strArr[i]);
                        }
                        if (strArr2 != null) {
                            tfsVar.e(strArr2[i]);
                        }
                        if (iArr != null) {
                            tfsVar.g(iArr[i]);
                        }
                        if (iArr2 != null) {
                            tfsVar.d(iArr2[i]);
                        }
                        jArr = du;
                        if (jArr2 != null) {
                            long j3 = jArr2[i];
                            tfsVar.aC(6);
                            tfsVar.g = j3;
                        }
                        alobVar.h(tfsVar.a());
                    } else {
                        jArr = du;
                    }
                    i++;
                    du = jArr;
                }
                return alobVar.g();
            }
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final Uri g() {
        String string = getString(cI(1, tgb.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri h() {
        String string = getString(cI(0, tgb.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String i() {
        return getString(cI(2, tgb.a));
    }

    public final String j() {
        return getString(cI(3, tgb.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
