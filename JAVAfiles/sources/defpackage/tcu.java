package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcu extends agmp implements agmq {
    @Deprecated
    public tcu(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tcv tcvVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tcz.a, agoxVar, akkwVar, tcvVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tcr();
    }

    public final long c() {
        return getLong(cI(0, tcz.a));
    }

    public final Instant e() {
        return uzz.l(getLong(cI(1, tcz.a)));
    }

    public final String f() {
        return getString(cI(3, tcz.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        Instant[] instantArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            String[] strArr2 = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, tcz.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tcj(this, 2));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, tcz.a)));
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
            agmp.ds(length, instantArr, new tcj(this, 3));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, tcz.a))), new String[0]);
                } else {
                    strArr = new String[]{g()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tcj(this, 4));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, tcz.a))), new String[0]);
                } else {
                    strArr2 = new String[]{f()};
                }
            }
            agmp.ds(length, strArr2, new tcj(this, 5));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr3 = tcz.a;
                    int i3 = taq.a;
                    tcs tcsVar = new tcs();
                    tcsVar.aD();
                    tcsVar.aB();
                    long j2 = du[i2];
                    if (jArr != null) {
                        long j3 = jArr[i2];
                        tcsVar.aC(0);
                        tcsVar.a = j3;
                    }
                    if (instantArr != null) {
                        Instant instant = instantArr[i2];
                        tcsVar.aC(1);
                        tcsVar.b = instant;
                    }
                    if (strArr != null) {
                        tcsVar.c(strArr[i2]);
                    }
                    if (strArr2 != null) {
                        tcsVar.b(strArr2[i2]);
                    }
                    alobVar.h(tcsVar.a());
                }
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(2, tcz.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
