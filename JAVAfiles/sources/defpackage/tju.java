package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tju extends agmp implements agmq {
    @Deprecated
    public tju(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tjw tjwVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tjz.a, agoxVar, akkwVar, tjwVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tjs();
    }

    public final long c() {
        return getLong(cI(2, tjz.a));
    }

    public final long e() {
        return getLong(cI(3, tjz.a));
    }

    public final tpz f() {
        tpz[] values = tpz.values();
        int i = getInt(cI(0, tjz.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        tpz[] tpzVarArr;
        String[] strArr;
        long[] jArr;
        long[] jArr2;
        int i;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        int i2 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                byte[] bArr = null;
                if (db(0)) {
                    if (z) {
                        int[] dk = dk(getString(cI(0, tjz.a)));
                        tpz[] values = tpz.values();
                        int length2 = values.length;
                        tpz[] tpzVarArr2 = new tpz[dk.length];
                        for (int i4 = 0; i4 < dk.length; i4++) {
                            int i5 = dk[i4];
                            if (i5 < length2) {
                                tpzVarArr2[i4] = values[i5];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tpzVarArr = (tpz[]) agnc.z(null, tpzVarArr2, new tpz[0]);
                    } else {
                        tpzVarArr = new tpz[]{f()};
                    }
                } else {
                    tpzVarArr = null;
                }
                agmp.ds(length, tpzVarArr, new tii(this, 16));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, tjz.a))), new String[0]);
                    } else {
                        strArr = new String[]{g()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tii(this, 17));
                if (db(2)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(2, tjz.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new tii(this, 18));
                if (db(3)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(3, tjz.a))));
                    } else {
                        jArr2 = new long[]{e()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new tii(this, 19));
                alob alobVar = new alob();
                int i6 = 0;
                while (i6 < length) {
                    long j = du[i6];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i6]));
                        String[] strArr2 = tjz.a;
                        int i7 = tif.a;
                        tof tofVar = new tof(bArr);
                        tofVar.aD();
                        tofVar.aB();
                        long j2 = du[i6];
                        if (tpzVarArr != null) {
                            tpz tpzVar = tpzVarArr[i6];
                            tofVar.aC(i3);
                            tofVar.d = tpzVar;
                        }
                        if (strArr != null) {
                            String str = strArr[i6];
                            tofVar.aC(i2);
                            tofVar.a = str;
                        }
                        i = length;
                        if (jArr != null) {
                            long j3 = jArr[i6];
                            tofVar.aC(2);
                            tofVar.c = j3;
                        }
                        if (jArr2 != null) {
                            long j4 = jArr2[i6];
                            tofVar.aC(3);
                            tofVar.b = j4;
                        }
                        tjs tjsVar = new tjs();
                        tjsVar.ar(tofVar.az());
                        tjsVar.a = (tpz) tofVar.d;
                        tjsVar.b = tofVar.a;
                        hashSet = hashSet2;
                        tjsVar.c = tofVar.c;
                        tjsVar.d = tofVar.b;
                        tjsVar.cF = tofVar.aA();
                        alobVar.h(tjsVar);
                    } else {
                        i = length;
                        hashSet = hashSet2;
                    }
                    i6++;
                    length = i;
                    hashSet2 = hashSet;
                    i2 = 1;
                    i3 = 0;
                    bArr = null;
                }
                return alobVar.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(1, tjz.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
