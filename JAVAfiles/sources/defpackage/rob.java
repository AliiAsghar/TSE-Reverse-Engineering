package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rob extends agmp implements agmq {
    @Deprecated
    public rob(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rod rodVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rog.a, agoxVar, akkwVar, rodVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rnz();
    }

    public final int c() {
        return getInt(cI(1, rog.a));
    }

    public final Instant e() {
        return uzz.l(getLong(cI(0, rog.a)));
    }

    public final String f() {
        return getString(cI(2, rog.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        Instant[] instantArr;
        int[] iArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, rog.a)));
                        int length2 = dl.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i = 0; i < length2; i++) {
                            instantArr2[i] = uzz.l(dl[i]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{e()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new rnr(this, 13));
                if (db(1)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(1, rog.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new rnr(this, 14));
                if (db(2)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(2, rog.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new rnr(this, 15));
                alob alobVar = new alob();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        String[] strArr2 = rog.a;
                        int i3 = rlm.a;
                        tne tneVar = new tne(null);
                        tneVar.aD();
                        tneVar.aB();
                        long j2 = du[i2];
                        if (instantArr != null) {
                            tneVar.h(instantArr[i2]);
                        }
                        if (iArr != null) {
                            tneVar.i(iArr[i2]);
                        }
                        if (strArr != null) {
                            tneVar.g(strArr[i2]);
                        }
                        alobVar.h(tneVar.f(new rlm(20)));
                    }
                }
                return alobVar.g();
            }
        }
        int i4 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
