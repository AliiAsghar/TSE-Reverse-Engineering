package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qtv extends agmp implements agmq {
    @Deprecated
    public qtv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qtw qtwVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qty.a, agoxVar, akkwVar, qtwVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new qts();
    }

    public final qss c() {
        return qta.d(getString(cI(1, qty.a)));
    }

    public final qss e() {
        return qta.d(getString(cI(0, qty.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        qss[] qssVarArr;
        qss[] qssVarArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    String[] dm = dm(getString(cI(0, qty.a)));
                    int length2 = dm.length;
                    qss[] qssVarArr3 = new qss[length2];
                    for (int i = 0; i < length2; i++) {
                        qssVarArr3[i] = qta.d(dm[i]);
                    }
                    qssVarArr = (qss[]) agnc.z(null, qssVarArr3, new qss[0]);
                } else {
                    qssVarArr = new qss[]{e()};
                }
            } else {
                qssVarArr = null;
            }
            agmp.ds(length, qssVarArr, new qtu(this, 0));
            if (db(1)) {
                if (z) {
                    String[] dm2 = dm(getString(cI(1, qty.a)));
                    int length3 = dm2.length;
                    qss[] qssVarArr4 = new qss[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        qssVarArr4[i2] = qta.d(dm2[i2]);
                    }
                    qssVarArr2 = (qss[]) agnc.z(null, qssVarArr4, new qss[0]);
                } else {
                    qssVarArr2 = new qss[]{c()};
                }
            } else {
                qssVarArr2 = null;
            }
            agmp.ds(length, qssVarArr2, new qtu(this, 2));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr = qty.a;
                    int i4 = qqe.a;
                    tpk tpkVar = new tpk(null, null, null, null);
                    tpkVar.aD();
                    tpkVar.aB();
                    long j2 = du[i3];
                    if (qssVarArr != null) {
                        qss qssVar = qssVarArr[i3];
                        tpkVar.aC(0);
                        tpkVar.b = qssVar;
                    }
                    if (qssVarArr2 != null) {
                        qss qssVar2 = qssVarArr2[i3];
                        tpkVar.aC(1);
                        tpkVar.a = qssVar2;
                    }
                    qts qtsVar = new qts();
                    qtsVar.ar(tpkVar.az());
                    qtsVar.a = (qss) tpkVar.b;
                    qtsVar.b = (qss) tpkVar.a;
                    qtsVar.cF = tpkVar.aA();
                    alobVar.h(qtsVar);
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
