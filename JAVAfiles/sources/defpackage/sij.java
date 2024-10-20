package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sij extends agmp implements agmq {
    @Deprecated
    public sij(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sik sikVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sim.a, agoxVar, akkwVar, sikVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sih();
    }

    public final long c() {
        return getLong(cI(1, sim.a));
    }

    public final long e() {
        return getLong(cI(0, sim.a));
    }

    public final long f() {
        return getLong(cI(6, sim.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        String[] strArr;
        String[] strArr2;
        anic[] anicVarArr;
        byte[][] bArr;
        long[] jArr3;
        HashSet hashSet;
        long[] jArr4;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                byte[] bArr2 = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sim.a))));
                    } else {
                        jArr = new long[]{e()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sic(this, 8));
                if (db(1)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(1, sim.a))));
                    } else {
                        jArr2 = new long[]{c()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new sic(this, 9));
                if (db(2)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(2, sim.a))), new String[0]);
                    } else {
                        strArr = new String[]{i()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sic(this, 10));
                if (db(3)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, sim.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{h()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new sic(this, 11));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, sim.a)));
                        anic[] anicVarArr2 = new anic[dk.length];
                        for (int i2 = 0; i2 < dk.length; i2++) {
                            anic b = anic.b(dk[i2]);
                            if (b != null) {
                                anicVarArr2[i2] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        anicVarArr = (anic[]) agnc.z(null, anicVarArr2, new anic[0]);
                    } else {
                        anicVarArr = new anic[]{g()};
                    }
                } else {
                    anicVarArr = null;
                }
                agmp.ds(length, anicVarArr, new sic(this, 12));
                if (db(5)) {
                    if (z) {
                        bArr = agnc.B(null, dv(getString(cI(5, sim.a))));
                    } else {
                        bArr = new byte[][]{j()};
                    }
                } else {
                    bArr = null;
                }
                agmp.ds(length, bArr, new sic(this, 13));
                if (db(6)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(6, sim.a))));
                    } else {
                        jArr3 = new long[]{f()};
                    }
                } else {
                    jArr3 = null;
                }
                agmp.dr(length, jArr3, new sic(this, 14));
                alob alobVar = new alob();
                int i3 = 0;
                while (i3 < length) {
                    long j = du[i3];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i3]));
                        String[] strArr3 = sim.a;
                        int i4 = shg.a;
                        sma smaVar = new sma(bArr2, bArr2);
                        smaVar.aD();
                        smaVar.aB();
                        long j2 = du[i3];
                        jArr4 = jArr2;
                        if (jArr != null) {
                            long j3 = jArr[i3];
                            smaVar.aC(i);
                            smaVar.a = j3;
                        }
                        if (jArr4 != null) {
                            long j4 = jArr4[i3];
                            smaVar.aC(1);
                            smaVar.b = j4;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            smaVar.aC(2);
                            smaVar.g = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i3];
                            smaVar.aC(3);
                            smaVar.e = str2;
                        }
                        if (anicVarArr != null) {
                            anic anicVar = anicVarArr[i3];
                            int i5 = smaVar.az;
                            if (i5 < 59660) {
                                agnc.t("cms_data_provider_type", i5);
                            }
                            smaVar.aC(4);
                            smaVar.f = anicVar;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = bArr[i3];
                            smaVar.aC(5);
                            smaVar.d = bArr3;
                        }
                        hashSet = hashSet2;
                        if (jArr3 != null) {
                            long j5 = jArr3[i3];
                            smaVar.aC(6);
                            smaVar.c = j5;
                        }
                        sih sihVar = new sih();
                        sihVar.ar(smaVar.az());
                        sihVar.a = smaVar.a;
                        sihVar.b = smaVar.b;
                        sihVar.c = (String) smaVar.g;
                        sihVar.d = (String) smaVar.e;
                        sihVar.e = (anic) smaVar.f;
                        sihVar.f = (byte[]) smaVar.d;
                        sihVar.g = smaVar.c;
                        sihVar.cF = smaVar.aA();
                        alobVar.h(sihVar);
                    } else {
                        hashSet = hashSet2;
                        jArr4 = jArr2;
                    }
                    i3++;
                    hashSet2 = hashSet;
                    jArr2 = jArr4;
                    i = 0;
                    bArr2 = null;
                }
                return alobVar.g();
            }
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final anic g() {
        return anic.b(getInt(cI(4, sim.a)));
    }

    public final String h() {
        return getString(cI(3, sim.a));
    }

    public final String i() {
        return getString(cI(2, sim.a));
    }

    public final byte[] j() {
        return getBlob(cI(5, sim.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
