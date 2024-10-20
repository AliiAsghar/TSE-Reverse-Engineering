package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syu extends agmp implements agmq {
    @Deprecated
    public syu(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, syv syvVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, syx.a, agoxVar, akkwVar, syvVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sys();
    }

    public final rvh c() {
        return new rvh(getLong(cI(0, syx.a)));
    }

    public final rvi e() {
        return rvi.a(getString(cI(1, syx.a)));
    }

    public final Instant f() {
        return uxi.i(getLong(cI(2, syx.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        rvh[] rvhVarArr;
        rvi[] rviVarArr;
        Instant[] instantArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, syx.a)));
                        int length2 = dl.length;
                        rvh[] rvhVarArr2 = new rvh[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            rvhVarArr2[i2] = new rvh(dl[i2]);
                        }
                        rvhVarArr = (rvh[]) agnc.z(null, rvhVarArr2, new rvh[0]);
                    } else {
                        rvhVarArr = new rvh[]{c()};
                    }
                } else {
                    rvhVarArr = null;
                }
                agmp.ds(length, rvhVarArr, new syf(this, 8));
                if (db(1)) {
                    if (z) {
                        String[] dm = dm(getString(cI(1, syx.a)));
                        int length3 = dm.length;
                        rvi[] rviVarArr2 = new rvi[length3];
                        for (int i3 = 0; i3 < length3; i3++) {
                            rviVarArr2[i3] = rvi.a(dm[i3]);
                        }
                        rviVarArr = (rvi[]) agnc.z(null, rviVarArr2, new rvi[0]);
                    } else {
                        rviVarArr = new rvi[]{e()};
                    }
                } else {
                    rviVarArr = null;
                }
                agmp.ds(length, rviVarArr, new syf(this, 9));
                if (db(2)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(2, syx.a)));
                        int length4 = dl2.length;
                        Instant[] instantArr2 = new Instant[length4];
                        for (int i4 = 0; i4 < length4; i4++) {
                            instantArr2[i4] = uxi.i(dl2[i4]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{f()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new syf(this, 10));
                alob alobVar = new alob();
                int i5 = 0;
                while (i5 < length) {
                    long j = du[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i5]));
                        String[] strArr = syx.a;
                        int i6 = sym.a;
                        tmc tmcVar = new tmc((short[]) null);
                        tmcVar.aD();
                        tmcVar.aB();
                        long j2 = du[i5];
                        if (rvhVarArr != null) {
                            rvh rvhVar = rvhVarArr[i5];
                            tmcVar.aC(i);
                            tmcVar.b = rvhVar;
                        }
                        if (rviVarArr != null) {
                            rvi rviVar = rviVarArr[i5];
                            int i7 = tmcVar.az;
                            if (i7 < 54060) {
                                agnc.t("feature", i7);
                            }
                            tmcVar.aC(1);
                            tmcVar.c = rviVar;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i5];
                            tmcVar.aC(2);
                            tmcVar.a = instant;
                        }
                        sys sysVar = new sys();
                        sysVar.ar(tmcVar.az());
                        sysVar.a = (rvh) tmcVar.b;
                        sysVar.b = (rvi) tmcVar.c;
                        sysVar.c = (Instant) tmcVar.a;
                        sysVar.cF = tmcVar.aA();
                        alobVar.h(sysVar);
                    }
                    i5++;
                    i = 0;
                }
                return alobVar.g();
            }
        }
        int i8 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
