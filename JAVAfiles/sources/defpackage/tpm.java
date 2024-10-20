package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tpm extends agmp implements agmq {
    @Deprecated
    public tpm(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tpo tpoVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tps.a, agoxVar, akkwVar, tpoVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tpj();
    }

    public final String c() {
        return getString(cI(1, tps.a));
    }

    public final String e() {
        return getString(cI(0, tps.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                akkw akkwVar = this.i;
                boolean db = db(0);
                boolean z = akkwVar.b;
                String[] strArr2 = null;
                if (db) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, tps.a))), new String[0]);
                    } else {
                        strArr = new String[]{e()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tor(this, 9));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, tps.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{c()};
                    }
                }
                agmp.ds(length, strArr2, new tor(this, 10));
                alob alobVar = new alob();
                for (int i = 0; i < length; i++) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        tpk a = tps.a();
                        a.aB();
                        long j2 = du[i];
                        if (strArr != null) {
                            a.c(strArr[i]);
                        }
                        if (strArr2 != null) {
                            a.b(strArr2[i]);
                        }
                        alobVar.h(a.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i2 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
