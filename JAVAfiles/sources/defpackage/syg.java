package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syg extends agmp implements agmq {
    @Deprecated
    public syg(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, syh syhVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, syj.a, agoxVar, akkwVar, syhVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new syd();
    }

    public final long c() {
        return getLong(cI(1, syj.a));
    }

    public final long e() {
        return getLong(cI(0, syj.a));
    }

    public final long f() {
        return getLong(cI(2, syj.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int i;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, syj.a))));
                    } else {
                        jArr = new long[]{e()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sxs(this, 20));
                if (db(1)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(1, syj.a))));
                    } else {
                        jArr2 = new long[]{c()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new syf(this, 1));
                if (db(2)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(2, syj.a))));
                    } else {
                        jArr3 = new long[]{f()};
                    }
                } else {
                    jArr3 = null;
                }
                agmp.dr(length, jArr3, new syf(this, 0));
                if (db(3)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(3, syj.a))), new String[0]);
                    } else {
                        strArr = new String[]{g()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new syf(this, 2));
                if (db(4)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(4, syj.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{i()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new syf(this, 3));
                if (db(5)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(5, syj.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{h()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new syf(this, 4));
                alob alobVar = new alob();
                int i3 = 0;
                while (i3 < length) {
                    long j = du[i3];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i3]));
                        String[] strArr4 = syj.a;
                        int i4 = swm.a;
                        tet tetVar = new tet(null);
                        tetVar.aD();
                        tetVar.aB();
                        long j2 = du[i3];
                        i = length;
                        if (jArr != null) {
                            long j3 = jArr[i3];
                            tetVar.aC(i2);
                            tetVar.b = j3;
                        }
                        if (jArr2 != null) {
                            long j4 = jArr2[i3];
                            tetVar.aC(1);
                            tetVar.d = j4;
                        }
                        if (jArr3 != null) {
                            long j5 = jArr3[i3];
                            tetVar.aC(2);
                            tetVar.c = j5;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            tetVar.aC(3);
                            tetVar.e = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i3];
                            tetVar.aC(4);
                            tetVar.a = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i3];
                            tetVar.aC(5);
                            tetVar.f = str3;
                        }
                        syd sydVar = new syd();
                        sydVar.ar(tetVar.az());
                        hashSet = hashSet2;
                        sydVar.a = tetVar.b;
                        sydVar.b = tetVar.d;
                        sydVar.c = tetVar.c;
                        sydVar.d = (String) tetVar.e;
                        sydVar.e = tetVar.a;
                        sydVar.f = (String) tetVar.f;
                        sydVar.cF = tetVar.aA();
                        alobVar.h(sydVar);
                    } else {
                        i = length;
                        hashSet = hashSet2;
                    }
                    i3++;
                    hashSet2 = hashSet;
                    length = i;
                    i2 = 0;
                }
                return alobVar.g();
            }
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(3, syj.a));
    }

    public final String h() {
        return getString(cI(5, syj.a));
    }

    public final String i() {
        return getString(cI(4, syj.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
