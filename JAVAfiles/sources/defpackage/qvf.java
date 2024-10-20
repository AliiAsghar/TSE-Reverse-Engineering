package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvf extends agmp implements agmq {
    @Deprecated
    public qvf(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qvg qvgVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qvk.a, agoxVar, akkwVar, qvgVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new qvc();
    }

    public final qvn c() {
        qvn[] values = qvn.values();
        int i = getInt(cI(3, qvk.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final qwe e() {
        return riw.m(getString(cI(0, qvk.a)));
    }

    public final String f() {
        return getString(cI(4, qvk.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        qwe[] qweVarArr;
        String[] strArr;
        boolean[] zArr;
        qvn[] qvnVarArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                String[] strArr3 = null;
                if (db(0)) {
                    if (z) {
                        String[] dm = dm(getString(cI(0, qvk.a)));
                        int length2 = dm.length;
                        qwe[] qweVarArr2 = new qwe[length2];
                        for (int i = 0; i < length2; i++) {
                            qweVarArr2[i] = riw.m(dm[i]);
                        }
                        qweVarArr = (qwe[]) agnc.z(null, qweVarArr2, new qwe[0]);
                    } else {
                        qweVarArr = new qwe[]{e()};
                    }
                } else {
                    qweVarArr = null;
                }
                agmp.ds(length, qweVarArr, new qtu(this, 15));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, qvk.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new qtu(this, 16));
                if (db(2)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(2, qvk.a))));
                    } else {
                        zArr = new boolean[]{i()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new qtu(this, 17));
                if (db(3)) {
                    if (z) {
                        int[] dk = dk(getString(cI(3, qvk.a)));
                        qvn[] values = qvn.values();
                        int length3 = values.length;
                        qvn[] qvnVarArr2 = new qvn[dk.length];
                        for (int i2 = 0; i2 < dk.length; i2++) {
                            int i3 = dk[i2];
                            if (i3 < length3) {
                                qvnVarArr2[i2] = values[i3];
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
                agmp.ds(length, qvnVarArr, new qtu(this, 18));
                if (db(4)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(4, qvk.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{f()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new qtu(this, 19));
                if (db(5)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(5, qvk.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{g()};
                    }
                }
                agmp.ds(length, strArr3, new qtu(this, 20));
                alob alobVar = new alob();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = du[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i4]));
                        String[] strArr4 = qvk.a;
                        int i5 = qqe.a;
                        qvd qvdVar = new qvd();
                        qvdVar.aD();
                        qvdVar.aB();
                        long j2 = du[i4];
                        if (qweVarArr != null) {
                            qvdVar.g(qweVarArr[i4]);
                        }
                        if (strArr != null) {
                            qvdVar.f(strArr[i4]);
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i4];
                            int i6 = qvdVar.az;
                            if (i6 < 60320) {
                                agnc.t("is_verified", i6);
                            }
                            qvdVar.aC(2);
                            qvdVar.c = z2;
                        }
                        if (qvnVarArr != null) {
                            qvdVar.d(qvnVarArr[i4]);
                        }
                        if (strArr2 != null) {
                            qvdVar.c(strArr2[i4]);
                        }
                        if (strArr3 != null) {
                            qvdVar.e(strArr3[i4]);
                        }
                        alobVar.h(qvdVar.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i7 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(5, qvk.a));
    }

    public final String h() {
        return getString(cI(1, qvk.a));
    }

    public final boolean i() {
        if (getInt(cI(2, qvk.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
