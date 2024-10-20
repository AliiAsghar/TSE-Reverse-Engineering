package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tln extends agmp implements agmq {
    @Deprecated
    public tln(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tlo tloVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tlr.a, agoxVar, akkwVar, tloVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tlk();
    }

    public final long c() {
        return getLong(cI(3, tlr.a));
    }

    public final String e() {
        return getString(cI(1, tlr.a));
    }

    public final String f() {
        return getString(cI(4, tlr.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        long[] jArr;
        String[] strArr4;
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
                char[] cArr = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, tlr.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tlm(this, 0));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, tlr.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{e()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tlm(this, 2));
                if (db(2)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(2, tlr.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{g()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new tlm(this, 3));
                if (db(3)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(3, tlr.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new tlm(this, 4));
                if (db(4)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(4, tlr.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{f()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new tlm(this, 5));
                alob alobVar = new alob();
                int i4 = 0;
                while (i4 < length) {
                    long j = du[i4];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i4]));
                        String[] strArr5 = tlr.a;
                        int i5 = tls.a;
                        ynu ynuVar = new ynu(cArr);
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
                            ynuVar.d = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            ynuVar.aC(2);
                            ynuVar.e = str3;
                        }
                        i = length;
                        if (jArr != null) {
                            long j3 = jArr[i4];
                            ynuVar.aC(3);
                            ynuVar.b = j3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i4];
                            ynuVar.aC(4);
                            ynuVar.c = str4;
                        }
                        tlk tlkVar = new tlk();
                        tlkVar.ar(ynuVar.az());
                        tlkVar.a = ynuVar.a;
                        tlkVar.b = (String) ynuVar.d;
                        tlkVar.c = (String) ynuVar.e;
                        hashSet = hashSet2;
                        tlkVar.d = ynuVar.b;
                        tlkVar.e = (String) ynuVar.c;
                        tlkVar.cF = ynuVar.aA();
                        alobVar.h(tlkVar);
                    } else {
                        i = length;
                        hashSet = hashSet2;
                    }
                    i4++;
                    hashSet2 = hashSet;
                    length = i;
                    i2 = 1;
                    i3 = 0;
                    cArr = null;
                }
                return alobVar.g();
            }
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(2, tlr.a));
    }

    public final String h() {
        return getString(cI(0, tlr.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
