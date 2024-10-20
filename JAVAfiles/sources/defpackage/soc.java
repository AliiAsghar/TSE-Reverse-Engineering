package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class soc extends agmp implements agmq {
    @Deprecated
    public soc(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sod sodVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sof.a, agoxVar, akkwVar, sodVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new soa();
    }

    public final long c() {
        return getLong(cI(2, sof.a));
    }

    public final long e() {
        return getLong(cI(0, sof.a));
    }

    public final String f() {
        return getString(cI(1, sof.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        long[] jArr2;
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
                    jArr = agnc.y(null, dl(getString(cI(0, sof.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new smz(this, 9));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, sof.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new smz(this, 10));
            if (db(2)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(2, sof.a))));
                } else {
                    jArr2 = new long[]{c()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new smz(this, 11));
            alob alobVar = new alob();
            int i3 = 0;
            while (i3 < length) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr2 = sof.a;
                    int i4 = sms.a;
                    tgd tgdVar = new tgd(null, null);
                    tgdVar.aD();
                    tgdVar.aB();
                    long j2 = du[i3];
                    if (jArr != null) {
                        long j3 = jArr[i3];
                        tgdVar.aC(0);
                        tgdVar.a = j3;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        tgdVar.aC(i2);
                        tgdVar.b = str;
                    }
                    if (jArr2 != null) {
                        long j4 = jArr2[i3];
                        tgdVar.aC(2);
                        tgdVar.c = j4;
                    }
                    soa soaVar = new soa();
                    soaVar.ar(tgdVar.az());
                    i = length;
                    soaVar.a = tgdVar.a;
                    soaVar.b = tgdVar.b;
                    soaVar.c = tgdVar.c;
                    soaVar.cF = tgdVar.aA();
                    alobVar.h(soaVar);
                } else {
                    i = length;
                }
                i3++;
                length = i;
                i2 = 1;
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
