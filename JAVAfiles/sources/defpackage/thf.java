package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thf extends agmp implements agmq {
    @Deprecated
    public thf(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, thg thgVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, thk.a, agoxVar, akkwVar, thgVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new thc();
    }

    public final long c() {
        return getLong(cI(6, thk.a));
    }

    public final rvd e() {
        return new rvd(getLong(cI(3, thk.a)));
    }

    public final Instant f() {
        return uzz.l(getLong(cI(7, thk.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        boolean[] zArr;
        boolean[] zArr2;
        int i;
        rvd[] rvdVarArr;
        Instant[] instantArr;
        byte[][] bArr;
        long[] jArr;
        Instant[] instantArr2;
        int i2;
        boolean[] zArr3;
        long[] jArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, thk.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tgv(this, 2));
                if (db(1)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(1, thk.a))));
                    } else {
                        zArr = new boolean[]{i()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new tgv(this, 3));
                if (db(2)) {
                    if (z) {
                        zArr2 = agnc.A(null, dn(getString(cI(2, thk.a))));
                    } else {
                        zArr2 = new boolean[]{j()};
                    }
                } else {
                    zArr2 = null;
                }
                agmp.dt(length, zArr2, new tgv(this, 4));
                if (db(3)) {
                    if (z) {
                        long[] dl = dl(getString(cI(3, thk.a)));
                        int length2 = dl.length;
                        rvd[] rvdVarArr2 = new rvd[length2];
                        int i3 = 0;
                        while (i3 < length2) {
                            rvdVarArr2[i3] = new rvd(dl[i3]);
                            i3++;
                            length = length;
                        }
                        i = length;
                        rvdVarArr = (rvd[]) agnc.z(null, rvdVarArr2, new rvd[0]);
                    } else {
                        i = length;
                        rvdVarArr = new rvd[]{e()};
                    }
                } else {
                    i = length;
                    rvdVarArr = null;
                }
                int i4 = i;
                agmp.ds(i4, rvdVarArr, new tgv(this, 5));
                if (db(4)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(4, thk.a)));
                        int length3 = dl2.length;
                        Instant[] instantArr3 = new Instant[length3];
                        for (int i5 = 0; i5 < length3; i5++) {
                            instantArr3[i5] = uzz.l(dl2[i5]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr3, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{g()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(i4, instantArr, new tgv(this, 6));
                if (db(5)) {
                    if (z) {
                        bArr = agnc.B(null, dv(getString(cI(5, thk.a))));
                    } else {
                        bArr = new byte[][]{l()};
                    }
                } else {
                    bArr = null;
                }
                agmp.ds(i4, bArr, new tgv(this, 7));
                if (db(6)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(6, thk.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(i4, jArr, new tgv(this, 8));
                if (db(7)) {
                    if (z) {
                        long[] dl3 = dl(getString(cI(7, thk.a)));
                        int length4 = dl3.length;
                        Instant[] instantArr4 = new Instant[length4];
                        for (int i6 = 0; i6 < length4; i6++) {
                            instantArr4[i6] = uzz.l(dl3[i6]);
                        }
                        instantArr2 = (Instant[]) agnc.z(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{f()};
                    }
                } else {
                    instantArr2 = null;
                }
                agmp.ds(i4, instantArr2, new tgv(this, 9));
                if (db(8)) {
                    if (z) {
                        zArr3 = agnc.A(null, dn(getString(cI(8, thk.a))));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        zArr3 = new boolean[]{k()};
                    }
                } else {
                    i2 = 0;
                    zArr3 = null;
                }
                agmp.dt(i4, zArr3, new tgv(this, 10));
                alob alobVar = new alob();
                while (i2 < i4) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        String[] strArr2 = thk.a;
                        int i7 = tfq.a;
                        thd thdVar = new thd();
                        thdVar.aD();
                        thdVar.aB();
                        long j2 = du[i2];
                        if (strArr != null) {
                            thdVar.i(strArr[i2]);
                        }
                        if (zArr != null) {
                            thdVar.c(zArr[i2]);
                        }
                        if (zArr2 != null) {
                            thdVar.d(zArr2[i2]);
                        }
                        if (rvdVarArr != null) {
                            thdVar.h(rvdVarArr[i2]);
                        }
                        if (instantArr != null) {
                            thdVar.g(instantArr[i2]);
                        }
                        if (bArr != null) {
                            thdVar.e(bArr[i2]);
                        }
                        jArr2 = du;
                        if (jArr != null) {
                            thdVar.j(jArr[i2]);
                        }
                        if (instantArr2 != null) {
                            thdVar.b(instantArr2[i2]);
                        }
                        if (zArr3 != null) {
                            thdVar.f(zArr3[i2]);
                        }
                        alobVar.h(thdVar.a());
                    } else {
                        jArr2 = du;
                    }
                    i2++;
                    du = jArr2;
                }
                return alobVar.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final Instant g() {
        return uzz.l(getLong(cI(4, thk.a)));
    }

    public final String h() {
        return getString(cI(0, thk.a));
    }

    public final boolean i() {
        if (getInt(cI(1, thk.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (getInt(cI(2, thk.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (getInt(cI(8, thk.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] l() {
        return getBlob(cI(5, thk.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
