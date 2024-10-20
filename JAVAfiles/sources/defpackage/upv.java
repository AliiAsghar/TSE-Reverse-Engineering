package defpackage;

import android.database.Cursor;
import j$.util.Optional;
import java.util.Date;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upv extends agmp implements agmq {
    @Deprecated
    public upv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, upx upxVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, uqb.a, agoxVar, akkwVar, upxVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new upr();
    }

    public final int c() {
        return getInt(cI(3, uqb.a));
    }

    public final long e() {
        return getLong(cI(0, uqb.a));
    }

    public final long f() {
        return getLong(cI(4, uqb.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        byte[][] bArr;
        int[] iArr;
        long[] jArr2;
        String[] strArr2;
        String[] strArr3;
        boolean[] zArr;
        boolean[] zArr2;
        Optional[] optionalArr;
        Optional[] optionalArr2;
        Date[] dateArr;
        String[] strArr4;
        long[] jArr3;
        int i;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, uqb.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new udn(this, 9));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, uqb.a))), new String[0]);
                } else {
                    strArr = new String[]{k()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new udn(this, 12));
            if (db(2)) {
                if (z) {
                    bArr = agnc.B(null, dv(getString(cI(2, uqb.a))));
                } else {
                    bArr = new byte[][]{n()};
                }
            } else {
                bArr = null;
            }
            agmp.ds(length, bArr, new udn(this, 13));
            if (db(3)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(3, uqb.a))));
                } else {
                    iArr = new int[]{c()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new udn(this, 14));
            if (db(4)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(4, uqb.a))));
                } else {
                    jArr2 = new long[]{f()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new udn(this, 15));
            if (db(5)) {
                if (z) {
                    if (!isNull(cI(5, uqb.a))) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(5, uqb.a))), new String[0]);
                    } else {
                        throw new IllegalStateException("found null in cursor for column queue");
                    }
                } else {
                    strArr2 = new String[]{j()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new udn(this, 16));
            if (db(6)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(6, uqb.a))), new String[0]);
                } else {
                    strArr3 = new String[]{i()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new udn(this, 17));
            if (db(7)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(7, uqb.a))));
                } else {
                    zArr = new boolean[]{m()};
                }
            } else {
                zArr = null;
            }
            agmp.dt(length, zArr, new udn(this, 18));
            if (db(8)) {
                if (z) {
                    String[] dm = dm(getString(cI(8, uqb.a)));
                    int length2 = dm.length;
                    Optional[] optionalArr3 = new Optional[length2];
                    zArr2 = zArr;
                    for (int i2 = 0; i2 < length2; i2++) {
                        optionalArr3[i2] = rvg.a(dm[i2]);
                    }
                    optionalArr = (Optional[]) agnc.z(null, optionalArr3, new Optional[0]);
                } else {
                    zArr2 = zArr;
                    optionalArr = new Optional[]{g()};
                }
            } else {
                zArr2 = zArr;
                optionalArr = null;
            }
            agmp.ds(length, optionalArr, new udn(this, 19));
            if (db(9)) {
                if (z) {
                    long[] dl = dl(getString(cI(9, uqb.a)));
                    int length3 = dl.length;
                    Date[] dateArr2 = new Date[length3];
                    optionalArr2 = optionalArr;
                    for (int i3 = 0; i3 < length3; i3++) {
                        dateArr2[i3] = rva.b(dl[i3]);
                    }
                    dateArr = (Date[]) agnc.z(null, dateArr2, new Date[0]);
                } else {
                    optionalArr2 = optionalArr;
                    dateArr = new Date[]{l()};
                }
            } else {
                optionalArr2 = optionalArr;
                dateArr = null;
            }
            agmp.ds(length, dateArr, new udn(this, 10));
            if (db(10)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(10, uqb.a))), new String[0]);
                } else {
                    strArr4 = new String[]{h()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new udn(this, 11));
            alob alobVar = new alob();
            int i4 = 0;
            while (i4 < length) {
                long j = du[i4];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i4]));
                    String[] strArr5 = uqb.a;
                    int i5 = tyr.a;
                    ups upsVar = new ups();
                    upsVar.aD();
                    upsVar.aB();
                    long j2 = du[i4];
                    jArr3 = du;
                    if (jArr != null) {
                        long j3 = jArr[i4];
                        i = length;
                        upsVar.aC(0);
                        upsVar.a = j3;
                    } else {
                        i = length;
                    }
                    if (strArr != null) {
                        upsVar.h(strArr[i4]);
                    }
                    if (bArr != null) {
                        upsVar.f(bArr[i4]);
                    }
                    if (iArr != null) {
                        int i6 = iArr[i4];
                        upsVar.aC(3);
                        upsVar.d = i6;
                    }
                    alob alobVar2 = alobVar;
                    if (jArr2 != null) {
                        upsVar.g(jArr2[i4]);
                    }
                    if (strArr2 != null) {
                        upsVar.e(strArr2[i4]);
                    }
                    if (strArr3 != null) {
                        upsVar.c(strArr3[i4]);
                    }
                    if (zArr2 != null) {
                        boolean z2 = zArr2[i4];
                        int i7 = upsVar.az;
                        if (i7 < 45030) {
                            agnc.t("scheduled_in_workmanager", i7);
                        }
                        upsVar.aC(7);
                        upsVar.h = z2;
                    }
                    if (optionalArr2 != null) {
                        Optional optional = optionalArr2[i4];
                        int i8 = upsVar.az;
                        if (i8 < 46060) {
                            agnc.t("workmanager_id", i8);
                        }
                        upsVar.aC(8);
                        upsVar.i = optional;
                    }
                    if (dateArr != null) {
                        upsVar.d(dateArr[i4]);
                    }
                    if (strArr4 != null) {
                        upsVar.b(strArr4[i4]);
                    }
                    alobVar = alobVar2;
                    alobVar.h(upsVar.a());
                } else {
                    jArr3 = du;
                    i = length;
                }
                i4++;
                du = jArr3;
                length = i;
            }
            return alobVar.g();
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final Optional g() {
        return rvg.a(getString(cI(8, uqb.a)));
    }

    public final String h() {
        return getString(cI(10, uqb.a));
    }

    public final String i() {
        return getString(cI(6, uqb.a));
    }

    public final String j() {
        if (!isNull(cI(5, uqb.a))) {
            return getString(cI(5, uqb.a));
        }
        throw new IllegalStateException("found null in cursor for column queue");
    }

    public final String k() {
        return getString(cI(1, uqb.a));
    }

    public final Date l() {
        return rva.b(getLong(cI(9, uqb.a)));
    }

    public final boolean m() {
        if (getInt(cI(7, uqb.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] n() {
        return getBlob(cI(2, uqb.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
