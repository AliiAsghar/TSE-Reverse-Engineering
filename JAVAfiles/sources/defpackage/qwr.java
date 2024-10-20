package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwr extends agmp implements agmq {
    @Deprecated
    public qwr(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qws qwsVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qww.a, agoxVar, akkwVar, qwsVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new qwo();
    }

    public final int c() {
        return getInt(cI(0, qww.a));
    }

    public final qwe e() {
        return riw.m(getString(cI(3, qww.a)));
    }

    public final qwe f() {
        return riw.m(getString(cI(4, qww.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        int[] iArr;
        String[] strArr;
        String[] strArr2;
        qwe[] qweVarArr;
        qwe[] qweVarArr2;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(0, qww.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new qwq(this, i));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, qww.a))), new String[0]);
                    } else {
                        strArr = new String[]{g()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new qwq(this, i2));
                int i3 = 2;
                if (db(2)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, qww.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{h()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new qwq(this, i3));
                int i4 = 3;
                if (db(3)) {
                    if (z) {
                        String[] dm = dm(getString(cI(3, qww.a)));
                        int length2 = dm.length;
                        qwe[] qweVarArr3 = new qwe[length2];
                        for (int i5 = 0; i5 < length2; i5++) {
                            qweVarArr3[i5] = riw.m(dm[i5]);
                        }
                        qweVarArr = (qwe[]) agnc.z(null, qweVarArr3, new qwe[0]);
                    } else {
                        qweVarArr = new qwe[]{e()};
                    }
                } else {
                    qweVarArr = null;
                }
                agmp.ds(length, qweVarArr, new qwq(this, i4));
                int i6 = 4;
                if (db(4)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(4, qww.a)));
                        int length3 = dm2.length;
                        qwe[] qweVarArr4 = new qwe[length3];
                        for (int i7 = 0; i7 < length3; i7++) {
                            qweVarArr4[i7] = riw.m(dm2[i7]);
                        }
                        qweVarArr2 = (qwe[]) agnc.z(null, qweVarArr4, new qwe[0]);
                    } else {
                        qweVarArr2 = new qwe[]{f()};
                    }
                } else {
                    qweVarArr2 = null;
                }
                agmp.ds(length, qweVarArr2, new qwq(this, i6));
                alob alobVar = new alob();
                while (i2 < length) {
                    try {
                        long j = du[i2];
                        if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                            hashSet.add(Long.valueOf(du[i2]));
                            String[] strArr3 = qww.a;
                            int i8 = qqe.a;
                            std stdVar = new std(null);
                            stdVar.aD();
                            stdVar.aB();
                            long j2 = du[i2];
                            if (iArr != null) {
                                stdVar.j(iArr[i2]);
                            }
                            if (strArr != null) {
                                stdVar.i(strArr[i2]);
                            }
                            if (strArr2 != null) {
                                stdVar.k(strArr2[i2]);
                            }
                            if (qweVarArr != null) {
                                stdVar.g(qweVarArr[i2]);
                            }
                            if (qweVarArr2 != null) {
                                stdVar.h(qweVarArr2[i2]);
                            }
                            alobVar.h(stdVar.f());
                        }
                        i2++;
                    } catch (aglw unused) {
                    }
                }
                return alobVar.g();
            }
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(1, qww.a));
    }

    public final String h() {
        return getString(cI(2, qww.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
