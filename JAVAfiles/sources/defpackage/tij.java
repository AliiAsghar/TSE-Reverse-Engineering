package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tij extends agmp implements agmq {
    @Deprecated
    public tij(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, til tilVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tip.a, agoxVar, akkwVar, tilVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tie();
    }

    public final long c() {
        return getLong(cI(0, tip.a));
    }

    public final long e() {
        return getLong(cI(7, tip.a));
    }

    public final lwp f() {
        byte[] blob = getBlob(cI(6, tip.a));
        if (blob == null) {
            return null;
        }
        try {
            return (lwp) apag.parseFrom(lwp.a, blob, aozs.a());
        } catch (Throwable unused) {
            return lwp.a;
        }
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        Optional[] optionalArr;
        lwz[] lwzVarArr;
        lwr[] lwrVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        int i;
        lwp[] lwpVarArr;
        long[] jArr2;
        long[] jArr3;
        Instant[] instantArr3;
        Instant[] instantArr4;
        long[] jArr4;
        int i2;
        lwp[] lwpVarArr2;
        lwp lwpVar;
        agpf agpfVar = agoaVar.a.e;
        int i3 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i4 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, tip.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new tgv(this, 16));
                if (db(1)) {
                    if (z) {
                        String[] dm = dm(getString(cI(1, tip.a)));
                        int length2 = dm.length;
                        Optional[] optionalArr2 = new Optional[length2];
                        for (int i5 = 0; i5 < length2; i5++) {
                            optionalArr2[i5] = rvg.a(dm[i5]);
                        }
                        optionalArr = (Optional[]) agnc.z(null, optionalArr2, new Optional[0]);
                    } else {
                        optionalArr = new Optional[]{m()};
                    }
                } else {
                    optionalArr = null;
                }
                agmp.ds(length, optionalArr, new tgv(this, 17));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, tip.a)));
                        lwz[] lwzVarArr2 = new lwz[dk.length];
                        for (int i6 = 0; i6 < dk.length; i6++) {
                            lwz b = lwz.b(dk[i6]);
                            if (b != null) {
                                lwzVarArr2[i6] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        lwzVarArr = (lwz[]) agnc.z(null, lwzVarArr2, new lwz[0]);
                    } else {
                        lwzVarArr = new lwz[]{h()};
                    }
                } else {
                    lwzVarArr = null;
                }
                agmp.ds(length, lwzVarArr, new tgv(this, 18));
                if (db(3)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(3, tip.a)));
                        lwr[] lwrVarArr2 = new lwr[dk2.length];
                        for (int i7 = 0; i7 < dk2.length; i7++) {
                            lwr b2 = lwr.b(dk2[i7]);
                            if (b2 != null) {
                                lwrVarArr2[i7] = b2;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        lwrVarArr = (lwr[]) agnc.z(null, lwrVarArr2, new lwr[0]);
                    } else {
                        lwrVarArr = new lwr[]{g()};
                    }
                } else {
                    lwrVarArr = null;
                }
                agmp.ds(length, lwrVarArr, new tgv(this, 19));
                if (db(4)) {
                    if (z) {
                        long[] dl = dl(getString(cI(4, tip.a)));
                        int length3 = dl.length;
                        Instant[] instantArr5 = new Instant[length3];
                        for (int i8 = 0; i8 < length3; i8++) {
                            instantArr5[i8] = uzz.l(dl[i8]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr5, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{k()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new tgv(this, 20));
                if (db(5)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(5, tip.a)));
                        int length4 = dl2.length;
                        Instant[] instantArr6 = new Instant[length4];
                        for (int i9 = 0; i9 < length4; i9++) {
                            instantArr6[i9] = uzz.l(dl2[i9]);
                        }
                        instantArr2 = (Instant[]) agnc.z(null, instantArr6, new Instant[0]);
                        i3 = 1;
                    } else {
                        instantArr2 = new Instant[]{i()};
                    }
                } else {
                    instantArr2 = null;
                }
                agmp.ds(length, instantArr2, new tii(this, i3));
                if (db(6)) {
                    if (z) {
                        List cY = cY(getString(cI(6, tip.a)));
                        lwp[] lwpVarArr3 = new lwp[cY.size()];
                        Iterator it = cY.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i11 = i10 + 1;
                                if (v == null) {
                                    lwpVar = null;
                                } else {
                                    try {
                                        lwpVar = (lwp) apag.parseFrom(lwp.a, v);
                                    } catch (Throwable unused) {
                                        i10 = i11;
                                        lwpVarArr3[i10] = null;
                                        i10++;
                                        i4 = 0;
                                    }
                                }
                                lwpVarArr3[i10] = lwpVar;
                                i10 = i11;
                            } catch (Throwable unused2) {
                            }
                            i4 = 0;
                        }
                        i = i4;
                        lwpVarArr = (lwp[]) agnc.z(null, lwpVarArr3, new lwp[i]);
                    } else {
                        i = 0;
                        lwpVarArr = new lwp[]{f()};
                    }
                } else {
                    i = 0;
                    lwpVarArr = null;
                }
                agmp.ds(length, lwpVarArr, new tii(this, i));
                if (db(7)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(7, tip.a))));
                    } else {
                        jArr2 = new long[]{e()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new tii(this, 2));
                if (db(8)) {
                    if (z) {
                        long[] dl3 = dl(getString(cI(8, tip.a)));
                        int length5 = dl3.length;
                        Instant[] instantArr7 = new Instant[length5];
                        jArr3 = jArr2;
                        for (int i12 = 0; i12 < length5; i12++) {
                            instantArr7[i12] = uzz.l(dl3[i12]);
                        }
                        instantArr3 = (Instant[]) agnc.z(null, instantArr7, new Instant[0]);
                    } else {
                        jArr3 = jArr2;
                        instantArr3 = new Instant[]{l()};
                    }
                } else {
                    jArr3 = jArr2;
                    instantArr3 = null;
                }
                agmp.ds(length, instantArr3, new tii(this, 3));
                if (db(9)) {
                    if (z) {
                        long[] dl4 = dl(getString(cI(9, tip.a)));
                        int length6 = dl4.length;
                        Instant[] instantArr8 = new Instant[length6];
                        for (int i13 = 0; i13 < length6; i13++) {
                            instantArr8[i13] = uzz.l(dl4[i13]);
                        }
                        instantArr4 = (Instant[]) agnc.z(null, instantArr8, new Instant[0]);
                    } else {
                        instantArr4 = new Instant[]{j()};
                    }
                } else {
                    instantArr4 = null;
                }
                agmp.ds(length, instantArr4, new tii(this, 4));
                alob alobVar = new alob();
                int i14 = 0;
                while (i14 < length) {
                    long j = du[i14];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i14]));
                        String[] strArr = tip.a;
                        int i15 = tfq.a;
                        tig tigVar = new tig();
                        tigVar.aD();
                        tigVar.aB();
                        long j2 = du[i14];
                        jArr4 = du;
                        if (jArr != null) {
                            long j3 = jArr[i14];
                            i2 = length;
                            tigVar.aC(0);
                            tigVar.a = j3;
                        } else {
                            i2 = length;
                        }
                        if (optionalArr != null) {
                            tigVar.d(optionalArr[i14]);
                        }
                        if (lwzVarArr != null) {
                            tigVar.b(lwzVarArr[i14]);
                        }
                        if (lwrVarArr != null) {
                            tigVar.f(lwrVarArr[i14]);
                        }
                        if (instantArr != null) {
                            tigVar.e(instantArr[i14]);
                        }
                        if (instantArr2 != null) {
                            Instant instant = instantArr2[i14];
                            tigVar.aC(5);
                            tigVar.f = instant;
                        }
                        if (lwpVarArr != null) {
                            lwp lwpVar2 = lwpVarArr[i14];
                            tigVar.aC(6);
                            tigVar.g = lwpVar2;
                        }
                        lwpVarArr2 = lwpVarArr;
                        if (jArr3 != null) {
                            tigVar.c(jArr3[i14]);
                        }
                        if (instantArr3 != null) {
                            tigVar.g(instantArr3[i14]);
                        }
                        if (instantArr4 != null) {
                            Instant instant2 = instantArr4[i14];
                            int i16 = tigVar.az;
                            if (i16 < 60330) {
                                agnc.t("last_attachment_request_timestamp", i16);
                            }
                            tigVar.aC(9);
                            tigVar.j = instant2;
                        }
                        alobVar.h(tigVar.a(new tif(1)));
                    } else {
                        jArr4 = du;
                        i2 = length;
                        lwpVarArr2 = lwpVarArr;
                    }
                    i14++;
                    lwpVarArr = lwpVarArr2;
                    du = jArr4;
                    length = i2;
                }
                return alobVar.g();
            }
        }
        int i17 = alog.d;
        return alsx.a;
    }

    public final lwr g() {
        return lwr.b(getInt(cI(3, tip.a)));
    }

    public final lwz h() {
        return lwz.b(getInt(cI(2, tip.a)));
    }

    public final Instant i() {
        return uzz.l(getLong(cI(5, tip.a)));
    }

    public final Instant j() {
        return uzz.l(getLong(cI(9, tip.a)));
    }

    public final Instant k() {
        return uzz.l(getLong(cI(4, tip.a)));
    }

    public final Instant l() {
        return uzz.l(getLong(cI(8, tip.a)));
    }

    public final Optional m() {
        return rvg.a(getString(cI(1, tip.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
