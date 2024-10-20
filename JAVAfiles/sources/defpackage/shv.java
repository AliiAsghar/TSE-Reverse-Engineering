package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shv extends agmp implements agmq {
    @Deprecated
    public shv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, shw shwVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, shy.a, agoxVar, akkwVar, shwVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sht();
    }

    public final long c() {
        return getLong(cI(0, shy.a));
    }

    public final xxv e() {
        xxv[] values = xxv.values();
        int i = getInt(cI(3, shy.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cI(2, shy.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        xxv[] xxvVarArr;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, shy.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sgz(this, 17));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, shy.a))), new String[0]);
                    } else {
                        strArr = new String[]{g()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sgz(this, 18));
                if (db(2)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, shy.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{f()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new sgz(this, 19));
                if (db(3)) {
                    if (z) {
                        int[] dk = dk(getString(cI(3, shy.a)));
                        xxv[] values = xxv.values();
                        int length2 = values.length;
                        xxv[] xxvVarArr2 = new xxv[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            int i4 = dk[i3];
                            if (i4 < length2) {
                                xxvVarArr2[i3] = values[i4];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        xxvVarArr = (xxv[]) agnc.z(null, xxvVarArr2, new xxv[0]);
                    } else {
                        xxvVarArr = new xxv[]{e()};
                    }
                } else {
                    xxvVarArr = null;
                }
                agmp.ds(length, xxvVarArr, new sgz(this, 20));
                alob alobVar = new alob();
                int i5 = 0;
                while (i5 < length) {
                    long j = du[i5];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i5]));
                        String[] strArr3 = shy.a;
                        int i6 = shg.a;
                        tcs tcsVar = new tcs((char[]) null, (byte[]) null);
                        tcsVar.aD();
                        tcsVar.aB();
                        long j2 = du[i5];
                        if (jArr != null) {
                            long j3 = jArr[i5];
                            tcsVar.aC(i2);
                            tcsVar.a = j3;
                        }
                        if (strArr != null) {
                            String str = strArr[i5];
                            tcsVar.aC(i);
                            tcsVar.d = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i5];
                            tcsVar.aC(2);
                            tcsVar.b = str2;
                        }
                        if (xxvVarArr != null) {
                            xxv xxvVar = xxvVarArr[i5];
                            tcsVar.aC(3);
                            tcsVar.c = xxvVar;
                        }
                        sht shtVar = new sht();
                        shtVar.ar(tcsVar.az());
                        hashSet = hashSet2;
                        shtVar.a = tcsVar.a;
                        shtVar.b = (String) tcsVar.d;
                        shtVar.c = (String) tcsVar.b;
                        shtVar.d = (xxv) tcsVar.c;
                        shtVar.cF = tcsVar.aA();
                        alobVar.h(shtVar);
                    } else {
                        hashSet = hashSet2;
                    }
                    i5++;
                    hashSet2 = hashSet;
                    i = 1;
                    i2 = 0;
                }
                return alobVar.g();
            }
        }
        int i7 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(1, shy.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
