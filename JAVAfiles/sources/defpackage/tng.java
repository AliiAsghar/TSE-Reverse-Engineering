package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tng extends agmp implements agmq {
    @Deprecated
    public tng(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tni tniVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tnl.a, agoxVar, akkwVar, tniVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tnd();
    }

    public final int c() {
        return getInt(cI(0, tnl.a));
    }

    public final tnm e() {
        tnm[] values = tnm.values();
        int i = getInt(cI(2, tnl.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cI(1, tnl.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        int[] iArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                tnm[] tnmVarArr = null;
                if (db(0)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(0, tnl.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new tmr(this, 13));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, tnl.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tmr(this, 14));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, tnl.a)));
                        tnm[] values = tnm.values();
                        int length2 = values.length;
                        tnm[] tnmVarArr2 = new tnm[dk.length];
                        for (int i = 0; i < dk.length; i++) {
                            int i2 = dk[i];
                            if (i2 < length2) {
                                tnmVarArr2[i] = values[i2];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tnmVarArr = (tnm[]) agnc.z(null, tnmVarArr2, new tnm[0]);
                    } else {
                        tnmVarArr = new tnm[]{e()};
                    }
                }
                agmp.ds(length, tnmVarArr, new tmr(this, 15));
                alob alobVar = new alob();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = du[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i3]));
                        String[] strArr2 = tnl.a;
                        int i4 = tls.a;
                        tne tneVar = new tne();
                        tneVar.aD();
                        tneVar.aB();
                        long j2 = du[i3];
                        if (iArr != null) {
                            tneVar.c(iArr[i3]);
                        }
                        if (strArr != null) {
                            tneVar.d(strArr[i3]);
                        }
                        if (tnmVarArr != null) {
                            tneVar.e(tnmVarArr[i3]);
                        }
                        alobVar.h(tneVar.a(new tls(10)));
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
