package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tml extends agmp implements agmq {
    @Deprecated
    public tml(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tmm tmmVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tmo.a, agoxVar, akkwVar, tmmVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tmi();
    }

    public final int c() {
        return getInt(cI(8, tmo.a));
    }

    public final int e() {
        return getInt(cI(3, tmo.a));
    }

    public final int f() {
        return getInt(cI(2, tmo.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        long[] jArr2;
        int[] iArr3;
        int i;
        String[] strArr5;
        long[] jArr3;
        alob alobVar;
        int i2;
        int[] iArr4;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, tmo.a))));
                } else {
                    jArr = new long[]{g()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tlm(this, 12));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tmo.a))), new String[0]);
                } else {
                    strArr = new String[]{m()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tlm(this, 13));
            if (db(2)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(2, tmo.a))));
                } else {
                    iArr = new int[]{f()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new tlm(this, 14));
            if (db(3)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(3, tmo.a))));
                } else {
                    iArr2 = new int[]{e()};
                }
            } else {
                iArr2 = null;
            }
            agmp.dq(length, iArr2, new tlm(this, 15));
            if (db(4)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(4, tmo.a))), new String[0]);
                } else {
                    strArr2 = new String[]{k()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tlm(this, 16));
            if (db(5)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(5, tmo.a))), new String[0]);
                } else {
                    strArr3 = new String[]{j()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new tlm(this, 17));
            if (db(6)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(6, tmo.a))), new String[0]);
                } else {
                    strArr4 = new String[]{l()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new tlm(this, 18));
            if (db(7)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(7, tmo.a))));
                } else {
                    jArr2 = new long[]{h()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new tlm(this, 19));
            if (db(8)) {
                if (z) {
                    iArr3 = agnc.w(null, dk(getString(cI(8, tmo.a))));
                } else {
                    iArr3 = new int[]{c()};
                }
            } else {
                iArr3 = null;
            }
            agmp.dq(length, iArr3, new tlm(this, 20));
            if (db(9)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(9, tmo.a))), new String[0]);
                    i = 1;
                } else {
                    i = 1;
                    strArr5 = new String[]{i()};
                }
            } else {
                i = 1;
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new tmr(this, i));
            alob alobVar2 = new alob();
            int i3 = 0;
            while (i3 < length) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr6 = tmo.a;
                    int i4 = tls.a;
                    tmj tmjVar = new tmj();
                    tmjVar.aD();
                    tmjVar.aB();
                    long j2 = du[i3];
                    jArr3 = du;
                    alob alobVar3 = alobVar2;
                    if (jArr != null) {
                        long j3 = jArr[i3];
                        i2 = length;
                        tmjVar.aC(0);
                        tmjVar.a = j3;
                    } else {
                        i2 = length;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        tmjVar.aC(1);
                        tmjVar.b = str;
                    }
                    if (iArr != null) {
                        int i5 = iArr[i3];
                        tmjVar.aC(2);
                        tmjVar.c = i5;
                    }
                    if (iArr2 != null) {
                        int i6 = iArr2[i3];
                        tmjVar.aC(3);
                        tmjVar.d = i6;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i3];
                        tmjVar.aC(4);
                        tmjVar.e = str2;
                    }
                    if (strArr3 != null) {
                        String str3 = strArr3[i3];
                        tmjVar.aC(5);
                        tmjVar.f = str3;
                    }
                    if (strArr4 != null) {
                        String str4 = strArr4[i3];
                        tmjVar.aC(6);
                        tmjVar.g = str4;
                    }
                    if (jArr2 != null) {
                        long j4 = jArr2[i3];
                        tmjVar.aC(7);
                        tmjVar.h = j4;
                    }
                    if (iArr3 != null) {
                        int i7 = iArr3[i3];
                        tmjVar.aC(8);
                        tmjVar.i = i7;
                    }
                    if (strArr5 != null) {
                        String str5 = strArr5[i3];
                        tmjVar.aC(9);
                        tmjVar.j = str5;
                    }
                    tmi tmiVar = new tmi();
                    tmiVar.ar(tmjVar.az());
                    iArr4 = iArr3;
                    tmiVar.a = tmjVar.a;
                    tmiVar.b = tmjVar.b;
                    tmiVar.c = tmjVar.c;
                    tmiVar.d = tmjVar.d;
                    tmiVar.e = tmjVar.e;
                    tmiVar.f = tmjVar.f;
                    tmiVar.g = tmjVar.g;
                    tmiVar.h = tmjVar.h;
                    tmiVar.i = tmjVar.i;
                    tmiVar.j = tmjVar.j;
                    tmiVar.cF = tmjVar.aA();
                    alobVar = alobVar3;
                    alobVar.h(tmiVar);
                } else {
                    jArr3 = du;
                    alobVar = alobVar2;
                    i2 = length;
                    iArr4 = iArr3;
                }
                i3++;
                alobVar2 = alobVar;
                iArr3 = iArr4;
                du = jArr3;
                length = i2;
            }
            return alobVar2.g();
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(0, tmo.a));
    }

    public final long h() {
        return getLong(cI(7, tmo.a));
    }

    public final String i() {
        return getString(cI(9, tmo.a));
    }

    public final String j() {
        return getString(cI(5, tmo.a));
    }

    public final String k() {
        return getString(cI(4, tmo.a));
    }

    public final String l() {
        return getString(cI(6, tmo.a));
    }

    public final String m() {
        return getString(cI(1, tmo.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
