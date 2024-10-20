package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgf extends agmp implements agmq {
    @Deprecated
    public tgf(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tgg tggVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tgi.a, agoxVar, akkwVar, tggVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tgc();
    }

    public final long c() {
        return getLong(cI(0, tgi.a));
    }

    public final long e() {
        return getLong(cI(2, tgi.a));
    }

    public final String f() {
        return getString(cI(1, tgi.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            long[] jArr2 = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, tgi.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tfu(this, 6));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tgi.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tfu(this, 7));
            if (db(2)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(2, tgi.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            }
            agmp.dr(length, jArr2, new tfu(this, 8));
            alob alobVar = new alob();
            for (int i = 0; i < length; i++) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr2 = tgi.a;
                    int i2 = tfq.a;
                    tgd tgdVar = new tgd();
                    tgdVar.aD();
                    tgdVar.aB();
                    long j2 = du[i];
                    if (jArr != null) {
                        long j3 = jArr[i];
                        tgdVar.aC(0);
                        tgdVar.a = j3;
                    }
                    if (strArr != null) {
                        String str = strArr[i];
                        tgdVar.aC(1);
                        tgdVar.b = str;
                    }
                    if (jArr2 != null) {
                        long j4 = jArr2[i];
                        tgdVar.aC(2);
                        tgdVar.c = j4;
                    }
                    tgc tgcVar = new tgc();
                    tgcVar.ar(tgdVar.az());
                    tgcVar.a = tgdVar.a;
                    tgcVar.b = tgdVar.b;
                    tgcVar.c = tgdVar.c;
                    tgcVar.cF = tgdVar.aA();
                    alobVar.h(tgcVar);
                }
            }
            return alobVar.g();
        }
        int i3 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
