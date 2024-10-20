package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgw extends agmp implements agmq {
    @Deprecated
    public tgw(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tgy tgyVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, thb.a, agoxVar, akkwVar, tgyVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tgs();
    }

    public final long c() {
        return getLong(cI(6, thb.a));
    }

    public final Instant e() {
        return uzz.l(getLong(cI(7, thb.a)));
    }

    public final Instant f() {
        return uzz.l(getLong(cI(4, thb.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        boolean[] zArr;
        String[] strArr3;
        Instant[] instantArr;
        byte[][] bArr;
        long[] jArr;
        int i;
        Instant[] instantArr2;
        int i2;
        boolean[] zArr2;
        long[] jArr2;
        char c;
        int i3;
        HashSet hashSet;
        alob alobVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, thb.a))), new String[0]);
                    } else {
                        strArr = new String[]{g()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tfu(this, 14));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, thb.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{h()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tfu(this, 15));
                if (db(2)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(2, thb.a))));
                    } else {
                        zArr = new boolean[]{j()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new tfu(this, 16));
                if (db(3)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(3, thb.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{i()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new tfu(this, 17));
                if (db(4)) {
                    if (z) {
                        long[] dl = dl(getString(cI(4, thb.a)));
                        int length2 = dl.length;
                        Instant[] instantArr3 = new Instant[length2];
                        for (int i4 = 0; i4 < length2; i4++) {
                            instantArr3[i4] = uzz.l(dl[i4]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr3, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{f()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new tfu(this, 18));
                if (db(5)) {
                    if (z) {
                        bArr = agnc.B(null, dv(getString(cI(5, thb.a))));
                    } else {
                        bArr = new byte[][]{l()};
                    }
                } else {
                    bArr = null;
                }
                agmp.ds(length, bArr, new tfu(this, 19));
                if (db(6)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(6, thb.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new tfu(this, 20));
                if (db(7)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(7, thb.a)));
                        int length3 = dl2.length;
                        Instant[] instantArr4 = new Instant[length3];
                        for (int i5 = 0; i5 < length3; i5++) {
                            instantArr4[i5] = uzz.l(dl2[i5]);
                        }
                        instantArr2 = (Instant[]) agnc.z(null, instantArr4, new Instant[0]);
                        i = 1;
                    } else {
                        i = 1;
                        instantArr2 = new Instant[]{e()};
                    }
                } else {
                    i = 1;
                    instantArr2 = null;
                }
                agmp.ds(length, instantArr2, new tgv(this, i));
                char c2 = '\b';
                if (db(8)) {
                    if (z) {
                        zArr2 = agnc.A(null, dn(getString(cI(8, thb.a))));
                        i2 = 0;
                    } else {
                        zArr2 = new boolean[]{k()};
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                    zArr2 = null;
                }
                agmp.dt(length, zArr2, new tgv(this, i2));
                alob alobVar2 = new alob();
                int i6 = 0;
                while (i6 < length) {
                    long j = du[i6];
                    if (j > 0) {
                        if (hashSet2.contains(Long.valueOf(j))) {
                            jArr2 = du;
                            i3 = length;
                            hashSet = hashSet2;
                            c = '\b';
                        } else {
                            hashSet2.add(Long.valueOf(du[i6]));
                            String[] strArr4 = thb.a;
                            int i7 = tfq.a;
                            tgt tgtVar = new tgt();
                            tgtVar.aD();
                            tgtVar.aB();
                            long j2 = du[i6];
                            if (strArr != null) {
                                String str = strArr[i6];
                                jArr2 = du;
                                tgtVar.aC(0);
                                tgtVar.a = str;
                            } else {
                                jArr2 = du;
                            }
                            if (strArr2 != null) {
                                String str2 = strArr2[i6];
                                tgtVar.aC(1);
                                tgtVar.b = str2;
                            }
                            if (zArr != null) {
                                boolean z2 = zArr[i6];
                                tgtVar.aC(2);
                                tgtVar.c = z2;
                            }
                            if (strArr3 != null) {
                                String str3 = strArr3[i6];
                                tgtVar.aC(3);
                                tgtVar.d = str3;
                            }
                            if (instantArr != null) {
                                Instant instant = instantArr[i6];
                                int i8 = tgtVar.az;
                                i3 = length;
                                if (i8 < 35040) {
                                    agnc.t("last_modified_timestamp", i8);
                                }
                                tgtVar.aC(4);
                                tgtVar.e = instant;
                            } else {
                                i3 = length;
                            }
                            if (bArr != null) {
                                byte[] bArr2 = bArr[i6];
                                int i9 = tgtVar.az;
                                if (i9 < 38010) {
                                    agnc.t("identity_key", i9);
                                }
                                tgtVar.aC(5);
                                tgtVar.f = bArr2;
                            }
                            if (jArr != null) {
                                long j3 = jArr[i6];
                                int i10 = tgtVar.az;
                                hashSet = hashSet2;
                                if (i10 < 39040) {
                                    agnc.t("updated_at_hash", i10);
                                }
                                tgtVar.aC(6);
                                tgtVar.g = j3;
                            } else {
                                hashSet = hashSet2;
                            }
                            if (instantArr2 != null) {
                                Instant instant2 = instantArr2[i6];
                                int i11 = tgtVar.az;
                                if (i11 < 40010) {
                                    agnc.t("guaranteed_fresh_as_of_timestamp", i11);
                                }
                                tgtVar.aC(7);
                                tgtVar.h = instant2;
                            }
                            if (zArr2 != null) {
                                boolean z3 = zArr2[i6];
                                int i12 = tgtVar.az;
                                if (i12 < 40030) {
                                    agnc.t("is_updated_at_hash_valid", i12);
                                }
                                c = '\b';
                                tgtVar.aC(8);
                                tgtVar.i = z3;
                            } else {
                                c = '\b';
                            }
                            tgs tgsVar = new tgs();
                            tgsVar.ar(tgtVar.az());
                            tgsVar.a = tgtVar.a;
                            tgsVar.b = tgtVar.b;
                            tgsVar.c = tgtVar.c;
                            tgsVar.d = tgtVar.d;
                            tgsVar.e = tgtVar.e;
                            tgsVar.f = tgtVar.f;
                            alobVar = alobVar2;
                            tgsVar.g = tgtVar.g;
                            tgsVar.h = tgtVar.h;
                            tgsVar.i = tgtVar.i;
                            tgsVar.cF = tgtVar.aA();
                            alobVar.h(tgsVar);
                            i6++;
                            c2 = c;
                            alobVar2 = alobVar;
                            du = jArr2;
                            length = i3;
                            hashSet2 = hashSet;
                        }
                    } else {
                        jArr2 = du;
                        c = c2;
                        i3 = length;
                        hashSet = hashSet2;
                    }
                    alobVar = alobVar2;
                    i6++;
                    c2 = c;
                    alobVar2 = alobVar;
                    du = jArr2;
                    length = i3;
                    hashSet2 = hashSet;
                }
                return alobVar2.g();
            }
        }
        int i13 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(0, thb.a));
    }

    public final String h() {
        return getString(cI(1, thb.a));
    }

    public final String i() {
        return getString(cI(3, thb.a));
    }

    public final boolean j() {
        if (getInt(cI(2, thb.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (getInt(cI(8, thb.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] l() {
        return getBlob(cI(5, thb.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
