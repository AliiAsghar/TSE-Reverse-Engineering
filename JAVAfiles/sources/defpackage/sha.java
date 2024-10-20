package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sha extends agmp implements agmq {
    @Deprecated
    public sha(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, shb shbVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, shd.a, agoxVar, akkwVar, shbVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sgw();
    }

    public final int c() {
        return getInt(cI(9, shd.a));
    }

    public final int e() {
        return getInt(cI(8, shd.a));
    }

    public final int f() {
        return getInt(cI(5, shd.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        shf[] shfVarArr;
        she[] sheVarArr;
        amlo[] amloVarArr;
        int[] iArr;
        String[] strArr3;
        ukr[] ukrVarArr;
        int[] iArr2;
        int[] iArr3;
        String[] strArr4;
        long[] jArr;
        she[] sheVarArr2;
        int i;
        Object obj;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                long[] jArr2 = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, shd.a))), new String[0]);
                    } else {
                        strArr = new String[]{n()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sgz(this, 0));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, shd.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{m()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new sgz(this, 4));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, shd.a)));
                        shf[] values = shf.values();
                        int length2 = values.length;
                        shf[] shfVarArr2 = new shf[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            int i4 = dk[i3];
                            if (i4 < length2) {
                                shfVarArr2[i3] = values[i4];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        shfVarArr = (shf[]) agnc.z(null, shfVarArr2, new shf[0]);
                    } else {
                        shfVarArr = new shf[]{h()};
                    }
                } else {
                    shfVarArr = null;
                }
                agmp.ds(length, shfVarArr, new sgz(this, 5));
                if (db(3)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(3, shd.a)));
                        she[] values2 = she.values();
                        int length3 = values2.length;
                        she[] sheVarArr3 = new she[dk2.length];
                        for (int i5 = 0; i5 < dk2.length; i5++) {
                            int i6 = dk2[i5];
                            if (i6 < length3) {
                                sheVarArr3[i5] = values2[i6];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        sheVarArr = (she[]) agnc.z(null, sheVarArr3, new she[0]);
                    } else {
                        sheVarArr = new she[]{g()};
                    }
                } else {
                    sheVarArr = null;
                }
                agmp.ds(length, sheVarArr, new sgz(this, 6));
                if (db(4)) {
                    if (z) {
                        int[] dk3 = dk(getString(cI(4, shd.a)));
                        amlo[] amloVarArr2 = new amlo[dk3.length];
                        for (int i7 = 0; i7 < dk3.length; i7++) {
                            amlo b = amlo.b(dk3[i7]);
                            if (b != null) {
                                amloVarArr2[i7] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        amloVarArr = (amlo[]) agnc.z(null, amloVarArr2, new amlo[0]);
                    } else {
                        amloVarArr = new amlo[]{j()};
                    }
                } else {
                    amloVarArr = null;
                }
                agmp.ds(length, amloVarArr, new sgz(this, 7));
                if (db(5)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(5, shd.a))));
                    } else {
                        iArr = new int[]{f()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new sgz(this, 8));
                if (db(6)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(6, shd.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{l()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new sgz(this, 9));
                if (db(7)) {
                    if (z) {
                        List cY = cY(getString(cI(7, shd.a)));
                        ukr[] ukrVarArr2 = new ukr[cY.size()];
                        Iterator it = cY.iterator();
                        int i8 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i9 = i8 + 1;
                                if (v == null) {
                                    obj = jArr2;
                                } else {
                                    try {
                                        obj = (ukr) apag.parseFrom(ukr.a, v);
                                    } catch (Throwable unused) {
                                        i8 = i9;
                                        jArr2 = null;
                                        ukrVarArr2[i8] = 0;
                                        i8++;
                                        i2 = 0;
                                    }
                                }
                                ukrVarArr2[i8] = obj;
                                i8 = i9;
                                i2 = 0;
                                jArr2 = null;
                            } catch (Throwable unused2) {
                            }
                        }
                        ukrVarArr = (ukr[]) agnc.z(jArr2, ukrVarArr2, new ukr[i2]);
                    } else {
                        ukrVarArr = new ukr[]{i()};
                    }
                } else {
                    ukrVarArr = null;
                }
                agmp.ds(length, ukrVarArr, new sgz(this, 10));
                if (db(8)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(8, shd.a))));
                    } else {
                        iArr2 = new int[]{e()};
                    }
                } else {
                    iArr2 = null;
                }
                agmp.dq(length, iArr2, new sgz(this, 11));
                if (db(9)) {
                    if (z) {
                        iArr3 = agnc.w(null, dk(getString(cI(9, shd.a))));
                    } else {
                        iArr3 = new int[]{c()};
                    }
                } else {
                    iArr3 = null;
                }
                int[] iArr4 = iArr2;
                agmp.dq(length, iArr3, new sgz(this, 2));
                if (db(10)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(10, shd.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{k()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new sgz(this, 3));
                alob alobVar = new alob();
                int i10 = 0;
                while (i10 < length) {
                    long j = du[i10];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i10]));
                        String[] strArr5 = shd.a;
                        int i11 = seo.a;
                        sgx sgxVar = new sgx();
                        sgxVar.aD();
                        sgxVar.aB();
                        long j2 = du[i10];
                        jArr = du;
                        if (strArr != null) {
                            String str = strArr[i10];
                            i = length;
                            sgxVar.aC(0);
                            sgxVar.a = str;
                        } else {
                            i = length;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i10];
                            sgxVar.aC(1);
                            sgxVar.b = str2;
                        }
                        if (shfVarArr != null) {
                            shf shfVar = shfVarArr[i10];
                            sgxVar.aC(2);
                            sgxVar.c = shfVar;
                        }
                        if (sheVarArr != null) {
                            she sheVar = sheVarArr[i10];
                            sgxVar.aC(3);
                            sgxVar.d = sheVar;
                        }
                        if (amloVarArr != null) {
                            amlo amloVar = amloVarArr[i10];
                            sgxVar.aC(4);
                            sgxVar.e = amloVar;
                        }
                        if (iArr != null) {
                            int i12 = iArr[i10];
                            sheVarArr2 = sheVarArr;
                            int i13 = sgxVar.az;
                            if (i13 < 57090) {
                                agnc.t("bugle_table_type", i13);
                            }
                            sgxVar.aC(5);
                            sgxVar.f = i12;
                        } else {
                            sheVarArr2 = sheVarArr;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i10];
                            int i14 = sgxVar.az;
                            if (i14 < 57090) {
                                agnc.t("bugle_id", i14);
                            }
                            sgxVar.aC(6);
                            sgxVar.g = str3;
                        }
                        if (ukrVarArr != null) {
                            ukr ukrVar = ukrVarArr[i10];
                            int i15 = sgxVar.az;
                            if (i15 < 57090) {
                                agnc.t("cms_backup_parameters", i15);
                            }
                            sgxVar.aC(7);
                            sgxVar.h = ukrVar;
                        }
                        if (iArr4 != null) {
                            int i16 = iArr4[i10];
                            int i17 = sgxVar.az;
                            if (i17 < 57090) {
                                agnc.t("backup_flags", i17);
                            }
                            sgxVar.aC(8);
                            sgxVar.i = i16;
                        }
                        if (iArr3 != null) {
                            int i18 = iArr3[i10];
                            int i19 = sgxVar.az;
                            if (i19 < 57090) {
                                agnc.t("backup_dependency_table_type", i19);
                            }
                            sgxVar.aC(9);
                            sgxVar.j = i18;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i10];
                            int i20 = sgxVar.az;
                            if (i20 < 57090) {
                                agnc.t("backup_dependency_bugle_id", i20);
                            }
                            sgxVar.aC(10);
                            sgxVar.k = str4;
                        }
                        sgw sgwVar = new sgw();
                        sgwVar.ar(sgxVar.az());
                        sgwVar.a = sgxVar.a;
                        sgwVar.b = sgxVar.b;
                        sgwVar.c = sgxVar.c;
                        sgwVar.d = sgxVar.d;
                        sgwVar.e = sgxVar.e;
                        sgwVar.f = sgxVar.f;
                        sgwVar.g = sgxVar.g;
                        sgwVar.h = sgxVar.h;
                        sgwVar.i = sgxVar.i;
                        sgwVar.j = sgxVar.j;
                        sgwVar.k = sgxVar.k;
                        sgwVar.cF = sgxVar.aA();
                        alobVar.h(sgwVar);
                    } else {
                        jArr = du;
                        sheVarArr2 = sheVarArr;
                        i = length;
                    }
                    i10++;
                    du = jArr;
                    length = i;
                    sheVarArr = sheVarArr2;
                }
                return alobVar.g();
            }
        }
        int i21 = alog.d;
        return alsx.a;
    }

    public final she g() {
        she[] values = she.values();
        int i = getInt(cI(3, shd.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final shf h() {
        shf[] values = shf.values();
        int i = getInt(cI(2, shd.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final ukr i() {
        byte[] blob = getBlob(cI(7, shd.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ukr) apag.parseFrom(ukr.a, blob, aozs.a());
        } catch (Throwable unused) {
            return ukr.a;
        }
    }

    public final amlo j() {
        return amlo.b(getInt(cI(4, shd.a)));
    }

    public final String k() {
        return getString(cI(10, shd.a));
    }

    public final String l() {
        return getString(cI(6, shd.a));
    }

    public final String m() {
        return getString(cI(1, shd.a));
    }

    public final String n() {
        return getString(cI(0, shd.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
