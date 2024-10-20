package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tms extends agmp implements agmq {
    @Deprecated
    public tms(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tmt tmtVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tmv.a, agoxVar, akkwVar, tmtVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tmp();
    }

    public final long c() {
        return getLong(cI(4, tmv.a));
    }

    public final String e() {
        return getString(cI(3, tmv.a));
    }

    public final String f() {
        return getString(cI(2, tmv.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        long[] jArr;
        int i;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        int i2 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                byte[] bArr = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, tmv.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tmr(this, 0));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, tmv.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{g()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tmr(this, 2));
                if (db(2)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(2, tmv.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{f()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new tmr(this, 3));
                if (db(3)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(3, tmv.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{e()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new tmr(this, 4));
                if (db(4)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(4, tmv.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new tmr(this, 5));
                alob alobVar = new alob();
                int i4 = 0;
                while (i4 < length) {
                    long j = du[i4];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i4]));
                        String[] strArr5 = tmv.a;
                        int i5 = tls.a;
                        ynu ynuVar = new ynu(bArr);
                        ynuVar.aD();
                        ynuVar.aB();
                        long j2 = du[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            ynuVar.aC(i3);
                            ynuVar.a = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            ynuVar.aC(i2);
                            ynuVar.e = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            ynuVar.aC(2);
                            ynuVar.c = str3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i4];
                            ynuVar.aC(3);
                            ynuVar.d = str4;
                        }
                        i = length;
                        if (jArr != null) {
                            long j3 = jArr[i4];
                            ynuVar.aC(4);
                            ynuVar.b = j3;
                        }
                        tmp tmpVar = new tmp();
                        tmpVar.ar(ynuVar.az());
                        tmpVar.a = ynuVar.a;
                        tmpVar.b = (String) ynuVar.e;
                        tmpVar.c = (String) ynuVar.c;
                        tmpVar.d = (String) ynuVar.d;
                        hashSet = hashSet2;
                        tmpVar.e = ynuVar.b;
                        tmpVar.cF = ynuVar.aA();
                        alobVar.h(tmpVar);
                    } else {
                        i = length;
                        hashSet = hashSet2;
                    }
                    i4++;
                    hashSet2 = hashSet;
                    length = i;
                    i2 = 1;
                    i3 = 0;
                    bArr = null;
                }
                return alobVar.g();
            }
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(1, tmv.a));
    }

    public final String h() {
        return getString(cI(0, tmv.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
