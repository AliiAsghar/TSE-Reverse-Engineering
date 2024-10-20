package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tho extends agmp implements agmq {
    @Deprecated
    public tho(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, thq thqVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, thu.a, agoxVar, akkwVar, thqVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new thm();
    }

    public final Instant c() {
        return uzz.l(getLong(cI(2, thu.a)));
    }

    public final Instant e() {
        return uzz.l(getLong(cI(1, thu.a)));
    }

    public final String f() {
        return getString(cI(0, thu.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, thu.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tgv(this, 11));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, thu.a)));
                        int length2 = dl.length;
                        Instant[] instantArr3 = new Instant[length2];
                        for (int i = 0; i < length2; i++) {
                            instantArr3[i] = uzz.l(dl[i]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr3, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{e()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new tgv(this, 12));
                if (db(2)) {
                    if (z) {
                        long[] dl2 = dl(getString(cI(2, thu.a)));
                        int length3 = dl2.length;
                        Instant[] instantArr4 = new Instant[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            instantArr4[i2] = uzz.l(dl2[i2]);
                        }
                        instantArr2 = (Instant[]) agnc.z(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{c()};
                    }
                } else {
                    instantArr2 = null;
                }
                agmp.ds(length, instantArr2, new tgv(this, 13));
                alob alobVar = new alob();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = du[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i3]));
                        String[] strArr2 = thu.a;
                        int i4 = tfq.a;
                        tmc tmcVar = new tmc(null, null, null);
                        tmcVar.aD();
                        tmcVar.aB();
                        long j2 = du[i3];
                        if (strArr != null) {
                            tmcVar.h(strArr[i3]);
                        }
                        if (instantArr != null) {
                            tmcVar.g(instantArr[i3]);
                        }
                        if (instantArr2 != null) {
                            tmcVar.f(instantArr2[i3]);
                        }
                        alobVar.h(tmcVar.e());
                    }
                }
                return alobVar.g();
            }
        }
        int i5 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
