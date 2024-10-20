package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syo extends agmp implements agmq {
    @Deprecated
    public syo(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, syp sypVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, syr.a, agoxVar, akkwVar, sypVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new syk();
    }

    public final float c() {
        return getFloat(cI(2, syr.a));
    }

    public final rvh e() {
        return new rvh(getLong(cI(0, syr.a)));
    }

    public final Instant f() {
        return uxi.i(getLong(cI(1, syr.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        rvh[] rvhVarArr;
        Instant[] instantArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            float[] fArr = null;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, syr.a)));
                    int length2 = dl.length;
                    rvh[] rvhVarArr2 = new rvh[length2];
                    for (int i = 0; i < length2; i++) {
                        rvhVarArr2[i] = new rvh(dl[i]);
                    }
                    rvhVarArr = (rvh[]) agnc.z(null, rvhVarArr2, new rvh[0]);
                } else {
                    rvhVarArr = new rvh[]{e()};
                }
            } else {
                rvhVarArr = null;
            }
            agmp.ds(length, rvhVarArr, new syf(this, 5));
            if (db(1)) {
                if (z) {
                    long[] dl2 = dl(getString(cI(1, syr.a)));
                    int length3 = dl2.length;
                    Instant[] instantArr2 = new Instant[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        instantArr2[i2] = uxi.i(dl2[i2]);
                    }
                    instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
            } else {
                instantArr = null;
            }
            agmp.ds(length, instantArr, new syf(this, 6));
            if (db(2)) {
                if (z) {
                    fArr = agnc.D(dj(getString(cI(2, syr.a))));
                } else {
                    fArr = new float[]{c()};
                }
            }
            agmp.dp(length, fArr, new syf(this, 7));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr = syr.a;
                    int i4 = sym.a;
                    syl sylVar = new syl();
                    sylVar.aD();
                    sylVar.aB();
                    long j2 = du[i3];
                    if (rvhVarArr != null) {
                        rvh rvhVar = rvhVarArr[i3];
                        sylVar.aC(0);
                        sylVar.a = rvhVar;
                    }
                    if (instantArr != null) {
                        Instant instant = instantArr[i3];
                        sylVar.aC(1);
                        sylVar.b = instant;
                    }
                    if (fArr != null) {
                        float f = fArr[i3];
                        sylVar.aC(2);
                        sylVar.c = f;
                    }
                    syk sykVar = new syk();
                    sykVar.ar(sylVar.az());
                    sykVar.a = sylVar.a;
                    sykVar.b = sylVar.b;
                    sykVar.c = sylVar.c;
                    sykVar.cF = sylVar.aA();
                    alobVar.h(sykVar);
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
