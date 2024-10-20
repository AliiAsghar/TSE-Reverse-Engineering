package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tmz extends agmp implements agmq {
    @Deprecated
    public tmz(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tna tnaVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tnc.a, agoxVar, akkwVar, tnaVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tmw();
    }

    public final int c() {
        return getInt(cI(6, tnc.a));
    }

    public final long e() {
        return getLong(cI(0, tnc.a));
    }

    public final String f() {
        return getString(cI(5, tnc.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            int[] iArr = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, tnc.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tmr(this, 6));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tnc.a))), new String[0]);
                } else {
                    strArr = new String[]{j()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tmr(this, 7));
            if (db(2)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, tnc.a))), new String[0]);
                } else {
                    strArr2 = new String[]{i()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tmr(this, 8));
            if (db(3)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(3, tnc.a))), new String[0]);
                } else {
                    strArr3 = new String[]{h()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new tmr(this, 9));
            if (db(4)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(4, tnc.a))), new String[0]);
                } else {
                    strArr4 = new String[]{g()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new tmr(this, 10));
            if (db(5)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(5, tnc.a))), new String[0]);
                } else {
                    strArr5 = new String[]{f()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new tmr(this, 11));
            if (db(6)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(6, tnc.a))));
                } else {
                    iArr = new int[]{c()};
                }
            }
            agmp.dq(length, iArr, new tmr(this, 12));
            alob alobVar = new alob();
            int i = 0;
            while (i < length) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr8 = tnc.a;
                    int i2 = tls.a;
                    tmx tmxVar = new tmx();
                    tmxVar.aD();
                    tmxVar.aB();
                    long j2 = du[i];
                    strArr6 = strArr5;
                    if (jArr != null) {
                        long j3 = jArr[i];
                        tmxVar.aC(0);
                        tmxVar.a = j3;
                    }
                    if (strArr != null) {
                        String str = strArr[i];
                        tmxVar.aC(1);
                        tmxVar.b = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i];
                        tmxVar.aC(2);
                        tmxVar.c = str2;
                    }
                    if (strArr3 != null) {
                        String str3 = strArr3[i];
                        tmxVar.aC(3);
                        tmxVar.d = str3;
                    }
                    if (strArr4 != null) {
                        String str4 = strArr4[i];
                        tmxVar.aC(4);
                        tmxVar.e = str4;
                    }
                    if (strArr6 != null) {
                        String str5 = strArr6[i];
                        tmxVar.aC(5);
                        tmxVar.f = str5;
                    }
                    if (iArr != null) {
                        int i3 = iArr[i];
                        tmxVar.aC(6);
                        tmxVar.g = i3;
                    }
                    tmw tmwVar = new tmw();
                    tmwVar.ar(tmxVar.az());
                    strArr7 = strArr2;
                    tmwVar.a = tmxVar.a;
                    tmwVar.b = tmxVar.b;
                    tmwVar.c = tmxVar.c;
                    tmwVar.d = tmxVar.d;
                    tmwVar.e = tmxVar.e;
                    tmwVar.f = tmxVar.f;
                    tmwVar.g = tmxVar.g;
                    tmwVar.cF = tmxVar.aA();
                    alobVar.h(tmwVar);
                } else {
                    strArr6 = strArr5;
                    strArr7 = strArr2;
                }
                i++;
                strArr2 = strArr7;
                strArr5 = strArr6;
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(4, tnc.a));
    }

    public final String h() {
        return getString(cI(3, tnc.a));
    }

    public final String i() {
        return getString(cI(2, tnc.a));
    }

    public final String j() {
        return getString(cI(1, tnc.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
