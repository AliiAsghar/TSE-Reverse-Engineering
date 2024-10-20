package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfd extends agmp implements agmq {
    @Deprecated
    public tfd(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tfe tfeVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tfg.a, agoxVar, akkwVar, tfeVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tfb();
    }

    public final rve c() {
        return rve.a(getString(cI(0, tfg.a)));
    }

    public final String e() {
        return getString(cI(1, tfg.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        rve[] rveVarArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    String[] dm = dm(getString(cI(0, tfg.a)));
                    int length2 = dm.length;
                    rve[] rveVarArr2 = new rve[length2];
                    for (int i = 0; i < length2; i++) {
                        rveVarArr2[i] = rve.a(dm[i]);
                    }
                    rveVarArr = (rve[]) agnc.z(null, rveVarArr2, new rve[0]);
                } else {
                    rveVarArr = new rve[]{c()};
                }
            } else {
                rveVarArr = null;
            }
            agmp.ds(length, rveVarArr, new tea(this, 12));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tfg.a))), new String[0]);
                } else {
                    strArr = new String[]{e()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tea(this, 13));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr2 = tfg.a;
                    int i3 = tdb.a;
                    tpk tpkVar = new tpk((byte[]) null, (byte[]) null);
                    tpkVar.aD();
                    tpkVar.aB();
                    long j2 = du[i2];
                    if (rveVarArr != null) {
                        rve rveVar = rveVarArr[i2];
                        tpkVar.aC(0);
                        tpkVar.b = rveVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i2];
                        tpkVar.aC(1);
                        tpkVar.a = str;
                    }
                    tfb tfbVar = new tfb();
                    tfbVar.ar(tpkVar.az());
                    tfbVar.a = (rve) tpkVar.b;
                    tfbVar.b = (String) tpkVar.a;
                    tfbVar.cF = tpkVar.aA();
                    alobVar.h(tfbVar);
                }
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
