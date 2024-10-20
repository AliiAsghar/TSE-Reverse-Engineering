package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgl extends agmp implements agmq {
    @Deprecated
    public sgl(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sgm sgmVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sgo.a, agoxVar, akkwVar, sgmVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sgi();
    }

    public final long c() {
        return getLong(cI(2, sgo.a));
    }

    public final long e() {
        return getLong(cI(1, sgo.a));
    }

    public final long f() {
        return getLong(cI(0, sgo.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        int i;
        agpf agpfVar = agoaVar.a.e;
        int i2 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            long[] jArr5 = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sgo.a))));
                } else {
                    jArr = new long[]{f()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sfi(this, 15));
            if (db(1)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(1, sgo.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new sfi(this, 16));
            if (db(2)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(2, sgo.a))));
                } else {
                    jArr3 = new long[]{c()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new sfi(this, 17));
            if (db(3)) {
                if (z) {
                    jArr5 = agnc.y(null, dl(getString(cI(3, sgo.a))));
                } else {
                    jArr5 = new long[]{g()};
                }
            }
            agmp.dr(length, jArr5, new sfi(this, 18));
            alob alobVar = new alob();
            int i3 = 0;
            while (i3 < length) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr = sgo.a;
                    int i4 = seo.a;
                    sgj sgjVar = new sgj();
                    sgjVar.aD();
                    sgjVar.aB();
                    long j2 = du[i3];
                    jArr4 = jArr3;
                    if (jArr != null) {
                        long j3 = jArr[i3];
                        sgjVar.aC(0);
                        sgjVar.a = j3;
                    }
                    if (jArr2 != null) {
                        long j4 = jArr2[i3];
                        sgjVar.aC(i2);
                        sgjVar.b = j4;
                    }
                    if (jArr4 != null) {
                        long j5 = jArr4[i3];
                        sgjVar.aC(2);
                        sgjVar.c = j5;
                    }
                    if (jArr5 != null) {
                        long j6 = jArr5[i3];
                        sgjVar.aC(3);
                        sgjVar.d = j6;
                    }
                    sgi sgiVar = new sgi();
                    sgiVar.ar(sgjVar.az());
                    i = length;
                    sgiVar.a = sgjVar.a;
                    sgiVar.b = sgjVar.b;
                    sgiVar.c = sgjVar.c;
                    sgiVar.d = sgjVar.d;
                    sgiVar.cF = sgjVar.aA();
                    alobVar.h(sgiVar);
                } else {
                    jArr4 = jArr3;
                    i = length;
                }
                i3++;
                length = i;
                jArr3 = jArr4;
                i2 = 1;
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(3, sgo.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
