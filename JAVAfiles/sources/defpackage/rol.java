package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rol extends agmp implements agmq {
    @Deprecated
    public rol(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, ron ronVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, roq.a, agoxVar, akkwVar, ronVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new roj();
    }

    public final qvn c() {
        qvn[] values = qvn.values();
        int i = getInt(cI(1, roq.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final qwe e() {
        return riw.m(getString(cI(0, roq.a)));
    }

    public final String f() {
        return getString(cI(2, roq.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        qwe[] qweVarArr;
        qvn[] qvnVarArr;
        String[] strArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            char[] cArr = null;
            if (db(0)) {
                if (z) {
                    String[] dm = dm(getString(cI(0, roq.a)));
                    int length2 = dm.length;
                    qwe[] qweVarArr2 = new qwe[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        qweVarArr2[i2] = riw.m(dm[i2]);
                    }
                    qweVarArr = (qwe[]) agnc.z(null, qweVarArr2, new qwe[0]);
                } else {
                    qweVarArr = new qwe[]{e()};
                }
            } else {
                qweVarArr = null;
            }
            agmp.ds(length, qweVarArr, new rnr(this, 16));
            if (db(1)) {
                if (z) {
                    int[] dk = dk(getString(cI(1, roq.a)));
                    qvn[] values = qvn.values();
                    int length3 = values.length;
                    qvn[] qvnVarArr2 = new qvn[dk.length];
                    for (int i3 = 0; i3 < dk.length; i3++) {
                        int i4 = dk[i3];
                        if (i4 < length3) {
                            qvnVarArr2[i3] = values[i4];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    qvnVarArr = (qvn[]) agnc.z(null, qvnVarArr2, new qvn[0]);
                } else {
                    qvnVarArr = new qvn[]{c()};
                }
            } else {
                qvnVarArr = null;
            }
            agmp.ds(length, qvnVarArr, new rnr(this, 17));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, roq.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new rnr(this, 18));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, roq.a))), new String[0]);
                } else {
                    strArr2 = new String[]{g()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new rnr(this, 19));
            alob alobVar = new alob();
            int i5 = 0;
            while (i5 < length) {
                long j = du[i5];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i5]));
                    String[] strArr3 = roq.a;
                    int i6 = roi.a;
                    tpu tpuVar = new tpu(cArr);
                    tpuVar.aD();
                    tpuVar.aB();
                    long j2 = du[i5];
                    if (qweVarArr != null) {
                        qwe qweVar = qweVarArr[i5];
                        tpuVar.aC(0);
                        tpuVar.c = qweVar;
                    }
                    if (qvnVarArr != null) {
                        qvn qvnVar = qvnVarArr[i5];
                        tpuVar.aC(i);
                        tpuVar.b = qvnVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i5];
                        tpuVar.aC(2);
                        tpuVar.a = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i5];
                        tpuVar.aC(3);
                        tpuVar.d = str2;
                    }
                    roj rojVar = new roj();
                    rojVar.ar(tpuVar.az());
                    rojVar.a = (qwe) tpuVar.c;
                    rojVar.b = (qvn) tpuVar.b;
                    rojVar.c = (String) tpuVar.a;
                    rojVar.d = (String) tpuVar.d;
                    rojVar.cF = tpuVar.aA();
                    alobVar.h(rojVar);
                }
                i5++;
                i = 1;
                cArr = null;
            }
            return alobVar.g();
        }
        int i7 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(3, roq.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
