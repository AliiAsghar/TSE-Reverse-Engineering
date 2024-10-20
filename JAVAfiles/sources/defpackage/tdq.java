package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdq extends agmp implements agmq {
    @Deprecated
    public tdq(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tds tdsVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tdv.a, agoxVar, akkwVar, tdsVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tdo();
    }

    public final qku c() {
        qku[] values = qku.values();
        int i = getInt(cI(2, tdv.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cI(3, tdv.a));
    }

    public final String f() {
        return getString(cI(0, tdv.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        qku[] qkuVarArr;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, tdv.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tdg(this, 5));
            if (db(1)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, tdv.a))), new String[0]);
                } else {
                    strArr2 = new String[]{h()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tdg(this, 6));
            if (db(2)) {
                if (z) {
                    int[] dk = dk(getString(cI(2, tdv.a)));
                    qku[] values = qku.values();
                    int length2 = values.length;
                    qku[] qkuVarArr2 = new qku[dk.length];
                    for (int i = 0; i < dk.length; i++) {
                        int i2 = dk[i];
                        if (i2 < length2) {
                            qkuVarArr2[i] = values[i2];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    qkuVarArr = (qku[]) agnc.z(null, qkuVarArr2, new qku[0]);
                } else {
                    qkuVarArr = new qku[]{c()};
                }
            } else {
                qkuVarArr = null;
            }
            agmp.ds(length, qkuVarArr, new tdg(this, 7));
            if (db(3)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(3, tdv.a))), new String[0]);
                } else {
                    strArr3 = new String[]{e()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new tdg(this, 8));
            if (db(4)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(4, tdv.a))), new String[0]);
                } else {
                    strArr4 = new String[]{i()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new tdg(this, 9));
            if (db(5)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(5, tdv.a))), new String[0]);
                } else {
                    strArr5 = new String[]{g()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new tdg(this, 10));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr6 = tdv.a;
                    int i4 = tdb.a;
                    wsx wsxVar = new wsx(null);
                    wsxVar.aD();
                    wsxVar.aB();
                    long j2 = du[i3];
                    if (strArr != null) {
                        String str = strArr[i3];
                        wsxVar.aC(0);
                        wsxVar.b = str;
                    }
                    if (strArr2 != null) {
                        wsxVar.k(strArr2[i3]);
                    }
                    if (qkuVarArr != null) {
                        wsxVar.m(qkuVarArr[i3]);
                    }
                    if (strArr3 != null) {
                        wsxVar.i(strArr3[i3]);
                    }
                    if (strArr4 != null) {
                        wsxVar.l(strArr4[i3]);
                    }
                    if (strArr5 != null) {
                        wsxVar.j(strArr5[i3]);
                    }
                    alobVar.h(wsxVar.h());
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(5, tdv.a));
    }

    public final String h() {
        return getString(cI(1, tdv.a));
    }

    public final String i() {
        return getString(cI(4, tdv.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
