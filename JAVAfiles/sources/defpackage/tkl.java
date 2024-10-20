package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkl extends agmp implements agmq {
    @Deprecated
    public tkl(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tkn tknVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tkr.a, agoxVar, akkwVar, tknVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tkh();
    }

    public final int c() {
        return getInt(cI(3, tkr.a));
    }

    public final int e() {
        return getInt(cI(4, tkr.a));
    }

    public final int f() {
        return getInt(cI(6, tkr.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int[] iArr;
        int[] iArr2;
        String[] strArr4;
        int[] iArr3;
        String[] strArr5;
        String[] strArr6;
        long[] jArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, tkr.a))), new String[0]);
                } else {
                    strArr = new String[]{g()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tkk(this, 0));
            if (db(1)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, tkr.a))), new String[0]);
                } else {
                    strArr2 = new String[]{i()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tkk(this, 2));
            if (db(2)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(2, tkr.a))), new String[0]);
                } else {
                    strArr3 = new String[]{j()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new tkk(this, 3));
            if (db(3)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(3, tkr.a))));
                } else {
                    iArr = new int[]{c()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new tkk(this, 4));
            if (db(4)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(4, tkr.a))));
                } else {
                    iArr2 = new int[]{e()};
                }
            } else {
                iArr2 = null;
            }
            agmp.dq(length, iArr2, new tkk(this, 5));
            if (db(5)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(5, tkr.a))), new String[0]);
                } else {
                    strArr4 = new String[]{l()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new tkk(this, 6));
            if (db(6)) {
                if (z) {
                    iArr3 = agnc.w(null, dk(getString(cI(6, tkr.a))));
                } else {
                    iArr3 = new int[]{f()};
                }
            } else {
                iArr3 = null;
            }
            agmp.dq(length, iArr3, new tkk(this, 7));
            if (db(7)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(7, tkr.a))), new String[0]);
                } else {
                    strArr5 = new String[]{h()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new tkk(this, 8));
            if (db(8)) {
                if (z) {
                    strArr6 = (String[]) agnc.z(null, dm(getString(cI(8, tkr.a))), new String[0]);
                } else {
                    strArr6 = new String[]{k()};
                }
            } else {
                strArr6 = null;
            }
            agmp.ds(length, strArr6, new tkk(this, 9));
            alob alobVar = new alob();
            int i = 0;
            while (i < length) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr7 = tkr.a;
                    int i2 = tif.a;
                    tki tkiVar = new tki();
                    tkiVar.aD();
                    tkiVar.aB();
                    long j2 = du[i];
                    if (strArr != null) {
                        String str = strArr[i];
                        jArr = du;
                        tkiVar.aC(0);
                        tkiVar.a = str;
                    } else {
                        jArr = du;
                    }
                    if (strArr2 != null) {
                        tkiVar.e(strArr2[i]);
                    }
                    if (strArr3 != null) {
                        String str2 = strArr3[i];
                        tkiVar.aC(2);
                        tkiVar.c = str2;
                    }
                    if (iArr != null) {
                        tkiVar.f(iArr[i]);
                    }
                    if (iArr2 != null) {
                        tkiVar.h(iArr2[i]);
                    }
                    if (strArr4 != null) {
                        tkiVar.j(strArr4[i]);
                    }
                    if (iArr3 != null) {
                        tkiVar.i(iArr3[i]);
                    }
                    if (strArr5 != null) {
                        tkiVar.d(strArr5[i]);
                    }
                    if (strArr6 != null) {
                        tkiVar.g(strArr6[i]);
                    }
                    alobVar.h(tkiVar.a());
                } else {
                    jArr = du;
                }
                i++;
                du = jArr;
            }
            return alobVar.g();
        }
        int i3 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(0, tkr.a));
    }

    public final String h() {
        return getString(cI(7, tkr.a));
    }

    public final String i() {
        return getString(cI(1, tkr.a));
    }

    public final String j() {
        return getString(cI(2, tkr.a));
    }

    public final String k() {
        return getString(cI(8, tkr.a));
    }

    public final String l() {
        return getString(cI(5, tkr.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
