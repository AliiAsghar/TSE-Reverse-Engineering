package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxg extends agmp implements agmq {
    @Deprecated
    public sxg(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sxi sxiVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sxl.a, agoxVar, akkwVar, sxiVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sxd();
    }

    public final int c() {
        return getInt(cI(3, sxl.a));
    }

    public final long e() {
        return getLong(cI(0, sxl.a));
    }

    public final long f() {
        return getLong(cI(2, sxl.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        long[] jArr2;
        int[] iArr;
        mem[] memVarArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sxl.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new swp(this, 9));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, sxl.a))), new String[0]);
                } else {
                    strArr = new String[]{i()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new swp(this, 10));
            if (db(2)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(2, sxl.a))));
                } else {
                    jArr2 = new long[]{f()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new swp(this, 11));
            if (db(3)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(3, sxl.a))));
                } else {
                    iArr = new int[]{c()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new swp(this, 12));
            if (db(4)) {
                if (z) {
                    int[] dk = dk(getString(cI(4, sxl.a)));
                    mem[] values = mem.values();
                    int length2 = values.length;
                    mem[] memVarArr2 = new mem[dk.length];
                    for (int i = 0; i < dk.length; i++) {
                        int i2 = dk[i];
                        if (i2 < length2) {
                            memVarArr2[i] = values[i2];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    memVarArr = (mem[]) agnc.z(null, memVarArr2, new mem[0]);
                } else {
                    memVarArr = new mem[]{g()};
                }
            } else {
                memVarArr = null;
            }
            agmp.ds(length, memVarArr, new swp(this, 13));
            if (db(5)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(5, sxl.a))), new String[0]);
                } else {
                    strArr2 = new String[]{h()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new swp(this, 14));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr3 = sxl.a;
                    int i4 = swm.a;
                    sxe sxeVar = new sxe();
                    sxeVar.aD();
                    sxeVar.aB();
                    long j2 = du[i3];
                    if (jArr != null) {
                        long j3 = jArr[i3];
                        sxeVar.aC(0);
                        sxeVar.a = j3;
                    }
                    if (strArr != null) {
                        sxeVar.e(strArr[i3]);
                    }
                    if (jArr2 != null) {
                        sxeVar.g(jArr2[i3]);
                    }
                    if (iArr != null) {
                        sxeVar.f(iArr[i3]);
                    }
                    if (memVarArr != null) {
                        sxeVar.c(memVarArr[i3]);
                    }
                    if (strArr2 != null) {
                        sxeVar.d(strArr2[i3]);
                    }
                    alobVar.h(sxeVar.a(new swm(9)));
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final mem g() {
        mem[] values = mem.values();
        int i = getInt(cI(4, sxl.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String h() {
        return getString(cI(5, sxl.a));
    }

    public final String i() {
        return getString(cI(1, sxl.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
