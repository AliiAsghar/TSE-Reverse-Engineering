package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgs extends agmp implements agmq {
    @Deprecated
    public sgs(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sgt sgtVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sgv.a, agoxVar, akkwVar, sgtVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sgp();
    }

    public final long c() {
        return getLong(cI(0, sgv.a));
    }

    public final String e() {
        return getString(cI(2, sgv.a));
    }

    public final String f() {
        return getString(cI(1, sgv.a));
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
            String[] strArr2 = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sgv.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sfi(this, 19));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, sgv.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new sfi(this, 20));
            if (db(2)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, sgv.a))), new String[0]);
                } else {
                    strArr2 = new String[]{e()};
                }
            }
            agmp.ds(length, strArr2, new sgz(this, 1));
            alob alobVar = new alob();
            for (int i = 0; i < length; i++) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr3 = sgv.a;
                    int i2 = seo.a;
                    sgq sgqVar = new sgq();
                    sgqVar.aD();
                    sgqVar.aB();
                    long j2 = du[i];
                    if (jArr != null) {
                        long j3 = jArr[i];
                        sgqVar.aC(0);
                        sgqVar.a = j3;
                    }
                    if (strArr != null) {
                        String str = strArr[i];
                        sgqVar.aC(1);
                        sgqVar.b = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i];
                        sgqVar.aC(2);
                        sgqVar.c = str2;
                    }
                    sgp sgpVar = new sgp();
                    sgpVar.ar(sgqVar.az());
                    sgpVar.a = sgqVar.a;
                    sgpVar.b = sgqVar.b;
                    sgpVar.c = sgqVar.c;
                    sgpVar.cF = sgqVar.aA();
                    alobVar.h(sgpVar);
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
