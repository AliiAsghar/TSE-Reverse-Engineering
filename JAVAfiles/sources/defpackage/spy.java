package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spy extends agmp implements agmq {
    @Deprecated
    public spy(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sqa sqaVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sqd.a, agoxVar, akkwVar, sqaVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new spw();
    }

    public final long c() {
        return getLong(cI(0, sqd.a));
    }

    public final long e() {
        return getLong(cI(1, sqd.a));
    }

    public final mej f() {
        return mej.b(getInt(cI(2, sqd.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        mej[] mejVarArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sqd.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new spq(this, 18));
            if (db(1)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(1, sqd.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new spq(this, 19));
            if (db(2)) {
                if (z) {
                    int[] dk = dk(getString(cI(2, sqd.a)));
                    mej[] mejVarArr2 = new mej[dk.length];
                    for (int i = 0; i < dk.length; i++) {
                        mej b = mej.b(dk[i]);
                        if (b != null) {
                            mejVarArr2[i] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    mejVarArr = (mej[]) agnc.z(null, mejVarArr2, new mej[0]);
                } else {
                    mejVarArr = new mej[]{f()};
                }
            } else {
                mejVarArr = null;
            }
            agmp.ds(length, mejVarArr, new spq(this, 20));
            if (db(3)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(3, sqd.a))), new String[0]);
                } else {
                    strArr = new String[]{g()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new sqi(this, 1));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr2 = sqd.a;
                    int i3 = spk.a;
                    tof tofVar = new tof((char[]) null);
                    tofVar.aD();
                    tofVar.aB();
                    long j2 = du[i2];
                    if (jArr != null) {
                        long j3 = jArr[i2];
                        tofVar.aC(0);
                        tofVar.c = j3;
                    }
                    if (jArr2 != null) {
                        tofVar.h(jArr2[i2]);
                    }
                    if (mejVarArr != null) {
                        tofVar.g(mejVarArr[i2]);
                    }
                    if (strArr != null) {
                        tofVar.f(strArr[i2]);
                    }
                    alobVar.h(tofVar.e(new spk(8)));
                }
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(3, sqd.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
