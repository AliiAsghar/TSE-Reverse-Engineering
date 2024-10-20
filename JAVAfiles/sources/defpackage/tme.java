package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tme extends agmp implements agmq {
    @Deprecated
    public tme(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tmf tmfVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tmh.a, agoxVar, akkwVar, tmfVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tmb();
    }

    public final String c() {
        return getString(cI(2, tmh.a));
    }

    public final String e() {
        return getString(cI(1, tmh.a));
    }

    public final String f() {
        return getString(cI(0, tmh.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            String[] strArr3 = null;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, tmh.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tlm(this, 9));
            if (db(1)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, tmh.a))), new String[0]);
                } else {
                    strArr2 = new String[]{e()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tlm(this, 10));
            if (db(2)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(2, tmh.a))), new String[0]);
                } else {
                    strArr3 = new String[]{c()};
                }
            }
            agmp.ds(length, strArr3, new tlm(this, 11));
            alob alobVar = new alob();
            for (int i = 0; i < length; i++) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr4 = tmh.a;
                    int i2 = tls.a;
                    tmc tmcVar = new tmc();
                    tmcVar.aD();
                    tmcVar.aB();
                    long j2 = du[i];
                    if (strArr != null) {
                        String str = strArr[i];
                        tmcVar.aC(0);
                        tmcVar.a = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i];
                        tmcVar.aC(1);
                        tmcVar.b = str2;
                    }
                    if (strArr3 != null) {
                        String str3 = strArr3[i];
                        tmcVar.aC(2);
                        tmcVar.c = str3;
                    }
                    tmb tmbVar = new tmb();
                    tmbVar.ar(tmcVar.az());
                    tmbVar.a = (String) tmcVar.a;
                    tmbVar.b = (String) tmcVar.b;
                    tmbVar.c = (String) tmcVar.c;
                    tmbVar.cF = tmcVar.aA();
                    alobVar.h(tmbVar);
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
