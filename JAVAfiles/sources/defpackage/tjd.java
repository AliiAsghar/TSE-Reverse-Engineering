package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjd extends agmp implements agmq {
    @Deprecated
    public tjd(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tjf tjfVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tji.a, agoxVar, akkwVar, tjfVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tjb();
    }

    public final tjj c() {
        tjj[] values = tjj.values();
        int i = getInt(cI(0, tji.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cI(1, tji.a));
    }

    public final String f() {
        return getString(cI(2, tji.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        tjj[] tjjVarArr;
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
                    int[] dk = dk(getString(cI(0, tji.a)));
                    tjj[] values = tjj.values();
                    int length2 = values.length;
                    tjj[] tjjVarArr2 = new tjj[dk.length];
                    for (int i = 0; i < dk.length; i++) {
                        int i2 = dk[i];
                        if (i2 < length2) {
                            tjjVarArr2[i] = values[i2];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tjjVarArr = (tjj[]) agnc.z(null, tjjVarArr2, new tjj[0]);
                } else {
                    tjjVarArr = new tjj[]{c()};
                }
            } else {
                tjjVarArr = null;
            }
            agmp.ds(length, tjjVarArr, new tii(this, 10));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tji.a))), new String[0]);
                } else {
                    strArr = new String[]{e()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tii(this, 11));
            if (db(2)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, tji.a))), new String[0]);
                } else {
                    strArr2 = new String[]{f()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tii(this, 12));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr3 = tji.a;
                    int i4 = tif.a;
                    tmc tmcVar = new tmc((char[]) null);
                    tmcVar.aD();
                    tmcVar.aB();
                    long j2 = du[i3];
                    if (tjjVarArr != null) {
                        tjj tjjVar = tjjVarArr[i3];
                        tmcVar.aC(0);
                        tmcVar.b = tjjVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        tmcVar.aC(1);
                        tmcVar.c = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i3];
                        tmcVar.aC(2);
                        tmcVar.a = str2;
                    }
                    tjb tjbVar = new tjb();
                    tjbVar.ar(tmcVar.az());
                    tjbVar.a = (tjj) tmcVar.b;
                    tjbVar.b = (String) tmcVar.c;
                    tjbVar.c = (String) tmcVar.a;
                    tjbVar.cF = tmcVar.aA();
                    alobVar.h(tjbVar);
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
