package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sft extends agmp implements agmq {
    @Deprecated
    public sft(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sfv sfvVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sfz.a, agoxVar, akkwVar, sfvVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sfr();
    }

    public final long c() {
        return getLong(cI(2, sfz.a));
    }

    public final long e() {
        return getLong(cI(3, sfz.a));
    }

    public final long f() {
        return getLong(cI(0, sfz.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        int i;
        agpf agpfVar = agoaVar.a.e;
        int i2 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sfz.a))));
                } else {
                    jArr = new long[]{f()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sfi(this, 4));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, sfz.a))), new String[0]);
                } else {
                    strArr = new String[]{h()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new sfi(this, 5));
            if (db(2)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(2, sfz.a))));
                } else {
                    jArr2 = new long[]{c()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new sfi(this, 6));
            if (db(3)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(3, sfz.a))));
                } else {
                    jArr3 = new long[]{e()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new sfi(this, 7));
            if (db(4)) {
                if (z) {
                    jArr4 = agnc.y(null, dl(getString(cI(4, sfz.a))));
                } else {
                    jArr4 = new long[]{g()};
                }
            } else {
                jArr4 = null;
            }
            agmp.dr(length, jArr4, new sfi(this, 8));
            alob alobVar = new alob();
            int i3 = 0;
            while (i3 < length) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr2 = sfz.a;
                    int i4 = seo.a;
                    shi shiVar = new shi(null);
                    shiVar.aD();
                    shiVar.aB();
                    long j2 = du[i3];
                    jArr5 = jArr2;
                    if (jArr != null) {
                        long j3 = jArr[i3];
                        shiVar.aC(0);
                        shiVar.a = j3;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        shiVar.aC(i2);
                        shiVar.e = str;
                    }
                    if (jArr5 != null) {
                        long j4 = jArr5[i3];
                        shiVar.aC(2);
                        shiVar.c = j4;
                    }
                    if (jArr3 != null) {
                        long j5 = jArr3[i3];
                        shiVar.aC(3);
                        shiVar.d = j5;
                    }
                    if (jArr4 != null) {
                        long j6 = jArr4[i3];
                        shiVar.aC(4);
                        shiVar.b = j6;
                    }
                    sfr sfrVar = new sfr();
                    sfrVar.ar(shiVar.az());
                    i = length;
                    sfrVar.a = shiVar.a;
                    sfrVar.b = (String) shiVar.e;
                    sfrVar.c = shiVar.c;
                    sfrVar.d = shiVar.d;
                    sfrVar.e = shiVar.b;
                    sfrVar.cF = shiVar.aA();
                    alobVar.h(sfrVar);
                } else {
                    jArr5 = jArr2;
                    i = length;
                }
                i3++;
                length = i;
                jArr2 = jArr5;
                i2 = 1;
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(4, sfz.a));
    }

    public final String h() {
        return getString(cI(1, sfz.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
