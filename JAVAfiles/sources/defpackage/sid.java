package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sid extends agmp implements agmq {
    @Deprecated
    public sid(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sie sieVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sig.a, agoxVar, akkwVar, sieVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new shz();
    }

    public final long c() {
        return getLong(cI(1, sig.a));
    }

    public final long e() {
        return getLong(cI(7, sig.a));
    }

    public final long f() {
        return getLong(cI(6, sig.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        long[] jArr2;
        long[] jArr3;
        int i;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            long[] jArr4 = null;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, sig.a))), new String[0]);
                } else {
                    strArr = new String[]{h()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new sic(this, 1));
            if (db(1)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(1, sig.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sic(this, 0));
            if (db(2)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, sig.a))), new String[0]);
                } else {
                    strArr2 = new String[]{g()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new sic(this, 2));
            if (db(3)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(3, sig.a))), new String[0]);
                } else {
                    strArr3 = new String[]{j()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new sic(this, 3));
            if (db(4)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(4, sig.a))), new String[0]);
                } else {
                    strArr4 = new String[]{k()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new sic(this, 4));
            if (db(5)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(5, sig.a))), new String[0]);
                } else {
                    strArr5 = new String[]{i()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new sic(this, 5));
            if (db(6)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(6, sig.a))));
                } else {
                    jArr2 = new long[]{f()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new sic(this, 6));
            if (db(7)) {
                if (z) {
                    jArr4 = agnc.y(null, dl(getString(cI(7, sig.a))));
                } else {
                    jArr4 = new long[]{e()};
                }
            }
            agmp.dr(length, jArr4, new sic(this, 7));
            alob alobVar = new alob();
            int i2 = 0;
            while (i2 < length) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr6 = sig.a;
                    int i3 = shg.a;
                    sia siaVar = new sia();
                    siaVar.aD();
                    siaVar.aB();
                    long j2 = du[i2];
                    if (strArr != null) {
                        String str = strArr[i2];
                        siaVar.aC(0);
                        siaVar.a = str;
                    }
                    if (jArr != null) {
                        long j3 = jArr[i2];
                        jArr3 = du;
                        siaVar.aC(1);
                        siaVar.b = j3;
                    } else {
                        jArr3 = du;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i2];
                        siaVar.aC(2);
                        siaVar.c = str2;
                    }
                    if (strArr3 != null) {
                        String str3 = strArr3[i2];
                        siaVar.aC(3);
                        siaVar.d = str3;
                    }
                    if (strArr4 != null) {
                        String str4 = strArr4[i2];
                        siaVar.aC(4);
                        siaVar.e = str4;
                    }
                    if (strArr5 != null) {
                        String str5 = strArr5[i2];
                        siaVar.aC(5);
                        siaVar.f = str5;
                    }
                    if (jArr2 != null) {
                        long j4 = jArr2[i2];
                        siaVar.aC(6);
                        siaVar.g = j4;
                    }
                    if (jArr4 != null) {
                        long j5 = jArr4[i2];
                        int i4 = siaVar.az;
                        i = length;
                        if (i4 < 46040) {
                            agnc.t("message_received_timestamp", i4);
                        }
                        siaVar.aC(7);
                        siaVar.h = j5;
                    } else {
                        i = length;
                    }
                    shz shzVar = new shz();
                    shzVar.ar(siaVar.az());
                    shzVar.a = siaVar.a;
                    shzVar.b = siaVar.b;
                    shzVar.c = siaVar.c;
                    shzVar.d = siaVar.d;
                    shzVar.e = siaVar.e;
                    shzVar.f = siaVar.f;
                    shzVar.g = siaVar.g;
                    shzVar.h = siaVar.h;
                    shzVar.cF = siaVar.aA();
                    alobVar.h(shzVar);
                } else {
                    jArr3 = du;
                    i = length;
                }
                i2++;
                du = jArr3;
                length = i;
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(2, sig.a));
    }

    public final String h() {
        return getString(cI(0, sig.a));
    }

    public final String i() {
        return getString(cI(5, sig.a));
    }

    public final String j() {
        return getString(cI(3, sig.a));
    }

    public final String k() {
        return getString(cI(4, sig.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
