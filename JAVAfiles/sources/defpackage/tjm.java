package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjm extends agmp implements agmq {
    @Deprecated
    public tjm(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tjo tjoVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tjr.a, agoxVar, akkwVar, tjoVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tjk();
    }

    public final tpz c() {
        tpz[] values = tpz.values();
        int i = getInt(cI(0, tjr.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cI(2, tjr.a));
    }

    public final String f() {
        return getString(cI(1, tjr.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        tpz[] tpzVarArr;
        String[] strArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    int[] dk = dk(getString(cI(0, tjr.a)));
                    tpz[] values = tpz.values();
                    int length2 = values.length;
                    tpz[] tpzVarArr2 = new tpz[dk.length];
                    for (int i = 0; i < dk.length; i++) {
                        int i2 = dk[i];
                        if (i2 < length2) {
                            tpzVarArr2[i] = values[i2];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tpzVarArr = (tpz[]) agnc.z(null, tpzVarArr2, new tpz[0]);
                } else {
                    tpzVarArr = new tpz[]{c()};
                }
            } else {
                tpzVarArr = null;
            }
            agmp.ds(length, tpzVarArr, new tii(this, 13));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tjr.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tii(this, 14));
            if (db(2)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, tjr.a))), new String[0]);
                } else {
                    strArr2 = new String[]{e()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tii(this, 15));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr3 = tjr.a;
                    int i4 = tif.a;
                    tmc tmcVar = new tmc((byte[]) null, (byte[]) null);
                    tmcVar.aD();
                    tmcVar.aB();
                    long j2 = du[i3];
                    if (tpzVarArr != null) {
                        tpz tpzVar = tpzVarArr[i3];
                        tmcVar.aC(0);
                        tmcVar.c = tpzVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        tmcVar.aC(1);
                        tmcVar.a = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i3];
                        tmcVar.aC(2);
                        tmcVar.b = str2;
                    }
                    tjk tjkVar = new tjk();
                    tjkVar.ar(tmcVar.az());
                    tjkVar.a = (tpz) tmcVar.c;
                    tjkVar.b = (String) tmcVar.a;
                    tjkVar.c = (String) tmcVar.b;
                    tjkVar.cF = tmcVar.aA();
                    alobVar.h(tjkVar);
                }
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
