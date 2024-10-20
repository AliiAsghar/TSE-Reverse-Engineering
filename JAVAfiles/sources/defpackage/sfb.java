package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfb extends agmp implements agmq {
    @Deprecated
    public sfb(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sfc sfcVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sfe.a, agoxVar, akkwVar, sfcVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sez();
    }

    public final long c() {
        return getLong(cI(0, sfe.a));
    }

    public final ymw e() {
        return ymw.b(getInt(cI(2, sfe.a)));
    }

    public final ymx f() {
        return ymx.b(getInt(cI(1, sfe.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ymx[] ymxVarArr;
        ymw[] ymwVarArr;
        Instant[] instantArr;
        HashSet hashSet;
        alob alobVar;
        char c;
        agpf agpfVar = agoaVar.a.e;
        int i = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sfe.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new rov(this, 18));
                if (db(1)) {
                    if (z) {
                        int[] dk = dk(getString(cI(1, sfe.a)));
                        ymx[] ymxVarArr2 = new ymx[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            ymx b = ymx.b(dk[i3]);
                            if (b != null) {
                                ymxVarArr2[i3] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        ymxVarArr = (ymx[]) agnc.z(null, ymxVarArr2, new ymx[0]);
                    } else {
                        ymxVarArr = new ymx[]{f()};
                    }
                } else {
                    ymxVarArr = null;
                }
                agmp.ds(length, ymxVarArr, new rov(this, 19));
                if (db(2)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(2, sfe.a)));
                        ymw[] ymwVarArr2 = new ymw[dk2.length];
                        for (int i4 = 0; i4 < dk2.length; i4++) {
                            ymw b2 = ymw.b(dk2[i4]);
                            if (b2 != null) {
                                ymwVarArr2[i4] = b2;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        ymwVarArr = (ymw[]) agnc.z(null, ymwVarArr2, new ymw[0]);
                    } else {
                        ymwVarArr = new ymw[]{e()};
                    }
                } else {
                    ymwVarArr = null;
                }
                agmp.ds(length, ymwVarArr, new rov(this, 20));
                char c2 = 3;
                if (db(3)) {
                    if (z) {
                        long[] dl = dl(getString(cI(3, sfe.a)));
                        int length2 = dl.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i5 = 0; i5 < length2; i5++) {
                            instantArr2[i5] = uzz.l(dl[i5]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{g()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new sfi(this, 1));
                alob alobVar2 = new alob();
                int i6 = 0;
                while (i6 < length) {
                    long j = du[i6];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i6]));
                        String[] strArr = sfe.a;
                        int i7 = seo.a;
                        tcs tcsVar = new tcs(null, null, null);
                        tcsVar.aD();
                        tcsVar.aB();
                        long j2 = du[i6];
                        alob alobVar3 = alobVar2;
                        if (jArr != null) {
                            long j3 = jArr[i6];
                            tcsVar.aC(i2);
                            tcsVar.a = j3;
                        }
                        if (ymxVarArr != null) {
                            ymx ymxVar = ymxVarArr[i6];
                            tcsVar.aC(i);
                            tcsVar.b = ymxVar;
                        }
                        if (ymwVarArr != null) {
                            ymw ymwVar = ymwVarArr[i6];
                            tcsVar.aC(2);
                            tcsVar.c = ymwVar;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i6];
                            c = 3;
                            tcsVar.aC(3);
                            tcsVar.d = instant;
                        } else {
                            c = 3;
                        }
                        sez sezVar = new sez();
                        sezVar.ar(tcsVar.az());
                        hashSet = hashSet2;
                        sezVar.a = tcsVar.a;
                        sezVar.b = (ymx) tcsVar.b;
                        sezVar.c = (ymw) tcsVar.c;
                        sezVar.d = (Instant) tcsVar.d;
                        sezVar.cF = tcsVar.aA();
                        alobVar = alobVar3;
                        alobVar.h(sezVar);
                    } else {
                        hashSet = hashSet2;
                        alobVar = alobVar2;
                        c = c2;
                    }
                    i6++;
                    c2 = c;
                    hashSet2 = hashSet;
                    i = 1;
                    alobVar2 = alobVar;
                    i2 = 0;
                }
                return alobVar2.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final Instant g() {
        return uzz.l(getLong(cI(3, sfe.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
