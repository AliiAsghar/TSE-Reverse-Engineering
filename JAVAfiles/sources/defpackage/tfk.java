package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfk extends agmp implements agmq {
    @Deprecated
    public tfk(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tfm tfmVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tfp.a, agoxVar, akkwVar, tfmVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tfh();
    }

    public final int c() {
        return getInt(cI(4, tfp.a));
    }

    public final int e() {
        return getInt(cI(3, tfp.a));
    }

    public final long f() {
        return getLong(cI(5, tfp.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        Uri[] uriArr;
        String[] strArr2;
        int[] iArr;
        int[] iArr2;
        Uri uri;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                long[] jArr = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, tfp.a))), new String[0]);
                    } else {
                        strArr = new String[]{i()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tea(this, 14));
                if (db(1)) {
                    if (z) {
                        String[] dm = dm(getString(cI(1, tfp.a)));
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
                        uriArr = new Uri[]{g()};
                    }
                } else {
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new tea(this, 15));
                if (db(2)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, tfp.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{h()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tea(this, 16));
                if (db(3)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(3, tfp.a))));
                    } else {
                        iArr = new int[]{e()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new tea(this, 17));
                if (db(4)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(4, tfp.a))));
                    } else {
                        iArr2 = new int[]{c()};
                    }
                } else {
                    iArr2 = null;
                }
                agmp.dq(length, iArr2, new tea(this, 18));
                if (db(5)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(5, tfp.a))));
                    } else {
                        jArr = new long[]{f()};
                    }
                }
                agmp.dr(length, jArr, new tea(this, 19));
                alob alobVar = new alob();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = du[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i4]));
                        String[] strArr3 = tfp.a;
                        int i5 = tdb.a;
                        tfi tfiVar = new tfi();
                        tfiVar.aD();
                        tfiVar.aB();
                        long j2 = du[i4];
                        if (strArr != null) {
                            tfiVar.f(strArr[i4]);
                        }
                        if (uriArr != null) {
                            tfiVar.c(uriArr[i4]);
                        }
                        if (strArr2 != null) {
                            tfiVar.b(strArr2[i4]);
                        }
                        if (iArr != null) {
                            tfiVar.g(iArr[i4]);
                        }
                        if (iArr2 != null) {
                            tfiVar.d(iArr2[i4]);
                        }
                        if (jArr != null) {
                            tfiVar.e(jArr[i4]);
                        }
                        alobVar.h(tfiVar.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final Uri g() {
        String string = getString(cI(1, tfp.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String h() {
        return getString(cI(2, tfp.a));
    }

    public final String i() {
        return getString(cI(0, tfp.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
