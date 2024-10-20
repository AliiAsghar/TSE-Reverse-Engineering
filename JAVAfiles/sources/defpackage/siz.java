package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class siz extends agmp implements agmq {
    @Deprecated
    public siz(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sja sjaVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sjc.a, agoxVar, akkwVar, sjaVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new siw();
    }

    public final int c() {
        return getInt(cI(0, sjc.a));
    }

    public final int e() {
        return getInt(cI(2, sjc.a));
    }

    public final String f() {
        return getString(cI(3, sjc.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        int[] iArr;
        byte[][] bArr;
        int[] iArr2;
        String[] strArr;
        char c;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                String[] strArr2 = null;
                if (db(0)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(0, sjc.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new siq(this, 2));
                if (db(1)) {
                    if (z) {
                        bArr = agnc.B(null, dv(getString(cI(1, sjc.a))));
                    } else {
                        bArr = new byte[][]{h()};
                    }
                } else {
                    bArr = null;
                }
                agmp.ds(length, bArr, new siq(this, 3));
                if (db(2)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(2, sjc.a))));
                    } else {
                        iArr2 = new int[]{e()};
                    }
                } else {
                    iArr2 = null;
                }
                char c2 = 4;
                agmp.dq(length, iArr2, new siq(this, 4));
                if (db(3)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(3, sjc.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new siq(this, 5));
                if (db(4)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(4, sjc.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{g()};
                    }
                }
                agmp.ds(length, strArr2, new siq(this, 6));
                alob alobVar = new alob();
                int i3 = 0;
                while (i3 < length) {
                    long j = du[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i3]));
                        String[] strArr3 = sjc.a;
                        int i4 = shg.a;
                        six sixVar = new six();
                        sixVar.aD();
                        sixVar.aB();
                        long j2 = du[i3];
                        if (iArr != null) {
                            int i5 = iArr[i3];
                            sixVar.aC(i2);
                            sixVar.a = i5;
                        }
                        if (bArr != null) {
                            byte[] bArr2 = bArr[i3];
                            sixVar.aC(i);
                            sixVar.b = bArr2;
                        }
                        if (iArr2 != null) {
                            int i6 = iArr2[i3];
                            sixVar.aC(2);
                            sixVar.c = i6;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            int i7 = sixVar.az;
                            if (i7 < 42060) {
                                agnc.t("cms_correlation_id", i7);
                            }
                            sixVar.aC(3);
                            sixVar.d = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i3];
                            int i8 = sixVar.az;
                            if (i8 < 35020) {
                                agnc.t("cms_id", i8);
                            }
                            c = 4;
                            sixVar.aC(4);
                            sixVar.e = str2;
                        } else {
                            c = 4;
                        }
                        siw siwVar = new siw();
                        siwVar.ar(sixVar.az());
                        siwVar.a = sixVar.a;
                        siwVar.b = sixVar.b;
                        siwVar.c = sixVar.c;
                        siwVar.d = sixVar.d;
                        siwVar.e = sixVar.e;
                        siwVar.cF = sixVar.aA();
                        alobVar.h(siwVar);
                    } else {
                        c = c2;
                    }
                    i3++;
                    c2 = c;
                    i = 1;
                    i2 = 0;
                }
                return alobVar.g();
            }
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(4, sjc.a));
    }

    public final byte[] h() {
        return getBlob(cI(1, sjc.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
