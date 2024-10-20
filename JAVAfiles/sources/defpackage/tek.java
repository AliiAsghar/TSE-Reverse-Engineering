package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tek extends agmp implements agmq {
    @Deprecated
    public tek(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tem temVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, teq.a, agoxVar, akkwVar, temVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tei();
    }

    public final String c() {
        return getString(cI(0, teq.a));
    }

    public final String e() {
        return getString(cI(3, teq.a));
    }

    public final String f() {
        return getString(cI(2, teq.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, teq.a))), new String[0]);
                    } else {
                        strArr = new String[]{c()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tea(this, 2));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, teq.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{g()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tea(this, 3));
                if (db(2)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(2, teq.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{f()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new tea(this, 4));
                if (db(3)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(3, teq.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{e()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new tea(this, 5));
                alob alobVar = new alob();
                for (int i = 0; i < length; i++) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        String[] strArr5 = teq.a;
                        int i2 = tdb.a;
                        tpu tpuVar = new tpu((byte[]) null);
                        tpuVar.aD();
                        tpuVar.aB();
                        long j2 = du[i];
                        if (strArr != null) {
                            tpuVar.g(strArr[i]);
                        }
                        if (strArr2 != null) {
                            tpuVar.j(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            tpuVar.i(strArr3[i]);
                        }
                        if (strArr4 != null) {
                            tpuVar.h(strArr4[i]);
                        }
                        alobVar.h(tpuVar.f());
                    }
                }
                return alobVar.g();
            }
        }
        int i3 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(1, teq.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
