package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spr extends agmp implements agmq {
    @Deprecated
    public spr(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sps spsVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, spv.a, agoxVar, akkwVar, spsVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new spm();
    }

    public final int c() {
        return getInt(cI(6, spv.a));
    }

    public final int e() {
        return getInt(cI(3, spv.a));
    }

    public final Uri f() {
        String string = getString(cI(8, spv.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        rve[] rveVarArr;
        byte[][] bArr;
        byte[][] bArr2;
        int[] iArr;
        byte[][] bArr3;
        byte[][] bArr4;
        int[] iArr2;
        Instant[] instantArr;
        Instant[] instantArr2;
        Uri[] uriArr;
        String[] strArr;
        byte[][] bArr5;
        byte[][] bArr6;
        byte[][] bArr7;
        String[] strArr2;
        String[] strArr3;
        Uri[] uriArr2;
        Instant[] instantArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        int i;
        String[] strArr7;
        long[] jArr;
        int i2;
        HashSet hashSet;
        Uri uri;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        String[] dm = dm(getString(cI(0, spv.a)));
                        int length2 = dm.length;
                        rve[] rveVarArr2 = new rve[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            rveVarArr2[i3] = rve.a(dm[i3]);
                        }
                        rveVarArr = (rve[]) agnc.z(null, rveVarArr2, new rve[0]);
                    } else {
                        rveVarArr = new rve[]{g()};
                    }
                } else {
                    rveVarArr = null;
                }
                agmp.ds(length, rveVarArr, new spq(this, 0));
                if (db(1)) {
                    if (z) {
                        bArr = agnc.B(null, dv(getString(cI(1, spv.a))));
                    } else {
                        bArr = new byte[][]{t()};
                    }
                } else {
                    bArr = null;
                }
                agmp.ds(length, bArr, new spq(this, 16));
                if (db(2)) {
                    if (z) {
                        bArr2 = agnc.B(null, dv(getString(cI(2, spv.a))));
                    } else {
                        bArr2 = new byte[][]{s()};
                    }
                } else {
                    bArr2 = null;
                }
                agmp.ds(length, bArr2, new spq(this, 17));
                if (db(3)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(3, spv.a))));
                    } else {
                        iArr = new int[]{e()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new spq(this, 2));
                if (db(4)) {
                    if (z) {
                        bArr3 = agnc.B(null, dv(getString(cI(4, spv.a))));
                    } else {
                        bArr3 = new byte[][]{p()};
                    }
                } else {
                    bArr3 = null;
                }
                agmp.ds(length, bArr3, new spq(this, 3));
                if (db(5)) {
                    if (z) {
                        bArr4 = agnc.B(null, dv(getString(cI(5, spv.a))));
                    } else {
                        bArr4 = new byte[][]{o()};
                    }
                } else {
                    bArr4 = null;
                }
                agmp.ds(length, bArr4, new spq(this, 4));
                if (db(6)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(6, spv.a))));
                    } else {
                        iArr2 = new int[]{c()};
                    }
                } else {
                    iArr2 = null;
                }
                agmp.dq(length, iArr2, new spq(this, 5));
                if (db(7)) {
                    if (z) {
                        long[] dl = dl(getString(cI(7, spv.a)));
                        int length3 = dl.length;
                        Instant[] instantArr4 = new Instant[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            instantArr4[i4] = uzz.l(dl[i4]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{h()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new spq(this, 6));
                if (db(8)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(8, spv.a)));
                        int length4 = dm2.length;
                        Uri[] uriArr3 = new Uri[length4];
                        instantArr2 = instantArr;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length4) {
                            String str = dm2[i5];
                            int i7 = i6 + 1;
                            if (str != null && str.length() != 0) {
                                uri = Uri.parse(str);
                            } else {
                                uri = null;
                            }
                            uriArr3[i6] = uri;
                            i5++;
                            i6 = i7;
                        }
                        uriArr = (Uri[]) agnc.z(null, uriArr3, new Uri[0]);
                    } else {
                        instantArr2 = instantArr;
                        uriArr = new Uri[]{f()};
                    }
                } else {
                    instantArr2 = instantArr;
                    uriArr = null;
                }
                agmp.ds(length, uriArr, new spq(this, 7));
                if (db(9)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(9, spv.a))), new String[0]);
                    } else {
                        strArr = new String[]{j()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new spq(this, 8));
                if (db(10)) {
                    if (z) {
                        bArr5 = agnc.B(null, dv(getString(cI(10, spv.a))));
                    } else {
                        bArr5 = new byte[][]{q()};
                    }
                } else {
                    bArr5 = null;
                }
                String[] strArr8 = strArr;
                agmp.ds(length, bArr5, new spq(this, 9));
                if (db(11)) {
                    if (z) {
                        bArr6 = agnc.B(null, dv(getString(cI(11, spv.a))));
                    } else {
                        bArr6 = new byte[][]{r()};
                    }
                } else {
                    bArr6 = null;
                }
                byte[][] bArr8 = bArr5;
                agmp.ds(length, bArr6, new spq(this, 10));
                if (db(12)) {
                    if (z) {
                        bArr7 = bArr6;
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(12, spv.a))), new String[0]);
                    } else {
                        bArr7 = bArr6;
                        strArr2 = new String[]{k()};
                    }
                } else {
                    bArr7 = bArr6;
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new spq(this, 11));
                if (db(13)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(13, spv.a)));
                        int length5 = dl2.length;
                        strArr3 = strArr2;
                        Instant[] instantArr5 = new Instant[length5];
                        uriArr2 = uriArr;
                        for (int i8 = 0; i8 < length5; i8++) {
                            instantArr5[i8] = uzz.l(dl2[i8]);
                        }
                        instantArr3 = (Instant[]) agnc.z(null, instantArr5, new Instant[0]);
                    } else {
                        strArr3 = strArr2;
                        uriArr2 = uriArr;
                        instantArr3 = new Instant[]{i()};
                    }
                } else {
                    strArr3 = strArr2;
                    uriArr2 = uriArr;
                    instantArr3 = null;
                }
                agmp.ds(length, instantArr3, new spq(this, 12));
                if (db(14)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(14, spv.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{m()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new spq(this, 13));
                if (db(15)) {
                    if (z) {
                        strArr5 = strArr4;
                        strArr6 = (String[]) agnc.z(null, dm(getString(cI(15, spv.a))), new String[0]);
                    } else {
                        strArr5 = strArr4;
                        strArr6 = new String[]{l()};
                    }
                } else {
                    strArr5 = strArr4;
                    strArr6 = null;
                }
                agmp.ds(length, strArr6, new spq(this, 14));
                if (db(16)) {
                    if (z) {
                        strArr7 = (String[]) agnc.z(null, dm(getString(cI(16, spv.a))), new String[0]);
                        i = 0;
                    } else {
                        i = 0;
                        strArr7 = new String[]{n()};
                    }
                } else {
                    i = 0;
                    strArr7 = null;
                }
                agmp.ds(length, strArr7, new spq(this, 15));
                alob alobVar = new alob();
                int i9 = i;
                while (i9 < length) {
                    long j = du[i9];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i9]));
                        String[] strArr9 = spv.a;
                        int i10 = spk.a;
                        spn spnVar = new spn();
                        spnVar.aD();
                        spnVar.aB();
                        long j2 = du[i9];
                        jArr = du;
                        if (rveVarArr != null) {
                            spnVar.p(rveVarArr[i9]);
                        }
                        if (bArr != null) {
                            spnVar.n(bArr[i9]);
                        }
                        if (bArr2 != null) {
                            spnVar.m(bArr2[i9]);
                        }
                        if (iArr != null) {
                            spnVar.o(iArr[i9]);
                        }
                        if (bArr3 != null) {
                            spnVar.d(bArr3[i9]);
                        }
                        if (bArr4 != null) {
                            spnVar.c(bArr4[i9]);
                        }
                        if (iArr2 != null) {
                            spnVar.e(iArr2[i9]);
                        }
                        if (instantArr2 != null) {
                            spnVar.g(instantArr2[i9]);
                        }
                        if (uriArr2 != null) {
                            spnVar.f(uriArr2[i9]);
                        }
                        if (strArr8 != null) {
                            spnVar.i(strArr8[i9]);
                        }
                        if (bArr8 != null) {
                            spnVar.h(bArr8[i9]);
                        }
                        i2 = length;
                        if (bArr7 != null) {
                            byte[] bArr9 = bArr7[i9];
                            hashSet = hashSet2;
                            int i11 = spnVar.az;
                            if (i11 < 48010) {
                                agnc.t("file_uploaded_xml_from_content_server", i11);
                            }
                            spnVar.aC(11);
                            spnVar.l = bArr9;
                        } else {
                            hashSet = hashSet2;
                        }
                        if (strArr3 != null) {
                            String str2 = strArr3[i9];
                            int i12 = spnVar.az;
                            if (i12 < 48010) {
                                agnc.t("file_uploaded_fallback_uri", i12);
                            }
                            spnVar.aC(12);
                            spnVar.m = str2;
                        }
                        if (instantArr3 != null) {
                            Instant instant = instantArr3[i9];
                            int i13 = spnVar.az;
                            if (i13 < 48010) {
                                agnc.t("file_uploaded_expiry", i13);
                            }
                            spnVar.aC(13);
                            spnVar.n = instant;
                        }
                        if (strArr5 != null) {
                            spnVar.k(strArr5[i9]);
                        }
                        if (strArr6 != null) {
                            spnVar.j(strArr6[i9]);
                        }
                        if (strArr7 != null) {
                            spnVar.l(strArr7[i9]);
                        }
                        alobVar.h(spnVar.a(new spk(4)));
                    } else {
                        jArr = du;
                        i2 = length;
                        hashSet = hashSet2;
                    }
                    i9++;
                    du = jArr;
                    length = i2;
                    hashSet2 = hashSet;
                }
                return alobVar.g();
            }
        }
        int i14 = alog.d;
        return alsx.a;
    }

    public final rve g() {
        return rve.a(getString(cI(0, spv.a)));
    }

    public final Instant h() {
        return uzz.l(getLong(cI(7, spv.a)));
    }

    public final Instant i() {
        return uzz.l(getLong(cI(13, spv.a)));
    }

    public final String j() {
        return getString(cI(9, spv.a));
    }

    public final String k() {
        return getString(cI(12, spv.a));
    }

    public final String l() {
        return getString(cI(15, spv.a));
    }

    public final String m() {
        return getString(cI(14, spv.a));
    }

    public final String n() {
        return getString(cI(16, spv.a));
    }

    public final byte[] o() {
        return getBlob(cI(5, spv.a));
    }

    public final byte[] p() {
        return getBlob(cI(4, spv.a));
    }

    public final byte[] q() {
        return getBlob(cI(10, spv.a));
    }

    public final byte[] r() {
        return getBlob(cI(11, spv.a));
    }

    public final byte[] s() {
        return getBlob(cI(2, spv.a));
    }

    public final byte[] t() {
        return getBlob(cI(1, spv.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
