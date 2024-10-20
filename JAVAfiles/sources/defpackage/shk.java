package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shk extends agmp implements agmq {
    @Deprecated
    public shk(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, shn shnVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, shr.a, agoxVar, akkwVar, shnVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new shh();
    }

    public final long c() {
        return getLong(cI(2, shr.a));
    }

    public final long e() {
        return getLong(cI(4, shr.a));
    }

    public final long f() {
        return getLong(cI(0, shr.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        shs[] shsVarArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            long[] jArr4 = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, shr.a))));
                } else {
                    jArr = new long[]{f()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sgz(this, 12));
            if (db(1)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(1, shr.a))));
                } else {
                    jArr2 = new long[]{g()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new sgz(this, 13));
            if (db(2)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(2, shr.a))));
                } else {
                    jArr3 = new long[]{c()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new sgz(this, 14));
            if (db(3)) {
                if (z) {
                    int[] dk = dk(getString(cI(3, shr.a)));
                    shs[] values = shs.values();
                    int length2 = values.length;
                    shs[] shsVarArr2 = new shs[dk.length];
                    for (int i = 0; i < dk.length; i++) {
                        int i2 = dk[i];
                        if (i2 < length2) {
                            shsVarArr2[i] = values[i2];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    shsVarArr = (shs[]) agnc.z(null, shsVarArr2, new shs[0]);
                } else {
                    shsVarArr = new shs[]{h()};
                }
            } else {
                shsVarArr = null;
            }
            agmp.ds(length, shsVarArr, new sgz(this, 15));
            if (db(4)) {
                if (z) {
                    jArr4 = agnc.y(null, dl(getString(cI(4, shr.a))));
                } else {
                    jArr4 = new long[]{e()};
                }
            }
            agmp.dr(length, jArr4, new sgz(this, 16));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr = shr.a;
                    int i4 = shg.a;
                    shi shiVar = new shi();
                    shiVar.aD();
                    shiVar.aB();
                    long j2 = du[i3];
                    if (jArr != null) {
                        long j3 = jArr[i3];
                        shiVar.aC(0);
                        shiVar.a = j3;
                    }
                    if (jArr2 != null) {
                        shiVar.d(jArr2[i3]);
                    }
                    if (jArr3 != null) {
                        long j4 = jArr3[i3];
                        shiVar.aC(2);
                        shiVar.c = j4;
                    }
                    if (shsVarArr != null) {
                        shiVar.c(shsVarArr[i3]);
                    }
                    if (jArr4 != null) {
                        shiVar.b(jArr4[i3]);
                    }
                    alobVar.h(shiVar.a(new shg(3)));
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(1, shr.a));
    }

    public final shs h() {
        shs[] values = shs.values();
        int i = getInt(cI(3, shr.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
