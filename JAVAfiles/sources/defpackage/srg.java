package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srg extends agmp implements agmq {
    @Deprecated
    public srg(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sri sriVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, srm.a, agoxVar, akkwVar, sriVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new srd();
    }

    public final int c() {
        return getInt(cI(4, srm.a));
    }

    public final int e() {
        return getInt(cI(7, srm.a));
    }

    public final int f() {
        return getInt(cI(2, srm.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        int[] iArr3;
        boolean[] zArr;
        int[] iArr4;
        int[] iArr5;
        int i;
        long[] jArr;
        long[] jArr2;
        String[] strArr3;
        long[] jArr3;
        long[] jArr4;
        int i2;
        String[] strArr4;
        HashSet hashSet;
        String[] strArr5;
        long[] jArr5;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet2 = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, srm.a))), new String[0]);
                } else {
                    strArr = new String[]{k()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new sqi(this, 11));
            if (db(1)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(1, srm.a))));
                } else {
                    iArr = new int[]{h()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new sqi(this, 14));
            if (db(2)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(2, srm.a))));
                } else {
                    iArr2 = new int[]{f()};
                }
            } else {
                iArr2 = null;
            }
            agmp.dq(length, iArr2, new sqi(this, 15));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, srm.a))), new String[0]);
                } else {
                    strArr2 = new String[]{l()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new sqi(this, 16));
            if (db(4)) {
                if (z) {
                    iArr3 = agnc.w(null, dk(getString(cI(4, srm.a))));
                } else {
                    iArr3 = new int[]{c()};
                }
            } else {
                iArr3 = null;
            }
            agmp.dq(length, iArr3, new sqi(this, 17));
            if (db(5)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(5, srm.a))));
                } else {
                    zArr = new boolean[]{n()};
                }
            } else {
                zArr = null;
            }
            agmp.dt(length, zArr, new sqi(this, 18));
            if (db(6)) {
                if (z) {
                    iArr4 = agnc.w(null, dk(getString(cI(6, srm.a))));
                } else {
                    iArr4 = new int[]{g()};
                }
            } else {
                iArr4 = null;
            }
            agmp.dq(length, iArr4, new sqi(this, 19));
            if (db(7)) {
                if (z) {
                    iArr5 = agnc.w(null, dk(getString(cI(7, srm.a))));
                } else {
                    iArr5 = new int[]{e()};
                }
            } else {
                iArr5 = null;
            }
            agmp.dq(length, iArr5, new sqi(this, 20));
            if (db(8)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(8, srm.a))));
                    i = 1;
                } else {
                    i = 1;
                    jArr = new long[]{j()};
                }
            } else {
                i = 1;
                jArr = null;
            }
            agmp.dr(length, jArr, new srt(this, i));
            if (db(9)) {
                if (z) {
                    jArr2 = jArr;
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(9, srm.a))), new String[0]);
                } else {
                    jArr2 = jArr;
                    strArr3 = new String[]{m()};
                }
            } else {
                jArr2 = jArr;
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new sqi(this, 12));
            if (db(10)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(10, srm.a))));
                } else {
                    jArr3 = new long[]{i()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new sqi(this, 13));
            alob alobVar = new alob();
            int i3 = 0;
            while (i3 < length) {
                long j = du[i3];
                if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                    hashSet2.add(Long.valueOf(du[i3]));
                    String[] strArr6 = srm.a;
                    int i4 = spk.a;
                    sre sreVar = new sre();
                    sreVar.aD();
                    sreVar.aB();
                    long j2 = du[i3];
                    jArr4 = du;
                    if (strArr != null) {
                        String str = strArr[i3];
                        i2 = length;
                        sreVar.aC(0);
                        sreVar.a = str;
                    } else {
                        i2 = length;
                    }
                    if (iArr != null) {
                        int i5 = iArr[i3];
                        sreVar.aC(1);
                        sreVar.b = i5;
                    }
                    if (iArr2 != null) {
                        int i6 = iArr2[i3];
                        sreVar.aC(2);
                        sreVar.c = i6;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i3];
                        sreVar.aC(3);
                        sreVar.d = str2;
                    }
                    if (iArr3 != null) {
                        int i7 = iArr3[i3];
                        int i8 = sreVar.az;
                        hashSet = hashSet2;
                        if (i8 < 39020) {
                            agnc.t("account_id", i8);
                        }
                        sreVar.aC(4);
                        sreVar.e = i7;
                    } else {
                        hashSet = hashSet2;
                    }
                    if (zArr != null) {
                        boolean z2 = zArr[i3];
                        sreVar.aC(5);
                        sreVar.f = z2;
                    }
                    if (iArr4 != null) {
                        int i9 = iArr4[i3];
                        sreVar.aC(6);
                        sreVar.g = i9;
                    }
                    if (iArr5 != null) {
                        int i10 = iArr5[i3];
                        int i11 = sreVar.az;
                        if (i11 < 32000) {
                            agnc.t("flags", i11);
                        }
                        sreVar.aC(7);
                        sreVar.h = i10;
                    }
                    strArr4 = strArr3;
                    if (jArr2 != null) {
                        long j3 = jArr2[i3];
                        int i12 = sreVar.az;
                        strArr5 = strArr;
                        if (i12 < 34000) {
                            agnc.t("next_execute_timestamp", i12);
                        }
                        sreVar.aC(8);
                        sreVar.i = j3;
                    } else {
                        strArr5 = strArr;
                    }
                    if (strArr4 != null) {
                        String str3 = strArr4[i3];
                        int i13 = sreVar.az;
                        if (i13 < 59700) {
                            agnc.t("trigger_name", i13);
                        }
                        sreVar.aC(9);
                        sreVar.j = str3;
                    }
                    if (jArr3 != null) {
                        long j4 = jArr3[i3];
                        int i14 = sreVar.az;
                        if (i14 < 59970) {
                            agnc.t("enqueued_timestamp", i14);
                        }
                        sreVar.aC(10);
                        sreVar.k = j4;
                    }
                    srd srdVar = new srd();
                    srdVar.ar(sreVar.az());
                    srdVar.a = sreVar.a;
                    srdVar.b = sreVar.b;
                    srdVar.c = sreVar.c;
                    srdVar.d = sreVar.d;
                    srdVar.e = sreVar.e;
                    srdVar.f = sreVar.f;
                    srdVar.g = sreVar.g;
                    srdVar.h = sreVar.h;
                    jArr5 = jArr3;
                    srdVar.i = sreVar.i;
                    srdVar.j = sreVar.j;
                    srdVar.k = sreVar.k;
                    srdVar.cF = sreVar.aA();
                    alobVar.h(srdVar);
                } else {
                    jArr4 = du;
                    i2 = length;
                    strArr4 = strArr3;
                    hashSet = hashSet2;
                    strArr5 = strArr;
                    jArr5 = jArr3;
                }
                i3++;
                strArr3 = strArr4;
                jArr3 = jArr5;
                du = jArr4;
                length = i2;
                hashSet2 = hashSet;
                strArr = strArr5;
            }
            return alobVar.g();
        }
        int i15 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(6, srm.a));
    }

    public final int h() {
        return getInt(cI(1, srm.a));
    }

    public final long i() {
        return getLong(cI(10, srm.a));
    }

    public final long j() {
        return getLong(cI(8, srm.a));
    }

    public final String k() {
        return getString(cI(0, srm.a));
    }

    public final String l() {
        return getString(cI(3, srm.a));
    }

    public final String m() {
        return getString(cI(9, srm.a));
    }

    public final boolean n() {
        if (getInt(cI(5, srm.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
