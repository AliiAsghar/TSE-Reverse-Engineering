package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tlv extends agmp implements agmq {
    @Deprecated
    public tlv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tlx tlxVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tma.a, agoxVar, akkwVar, tlxVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tlt();
    }

    public final String c() {
        return getString(cI(1, tma.a));
    }

    public final String e() {
        return getString(cI(2, tma.a));
    }

    public final String f() {
        return getString(cI(0, tma.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, tma.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tlm(this, 6));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, tma.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{c()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tlm(this, 7));
                if (db(2)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(2, tma.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{e()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new tlm(this, 8));
                alob alobVar = new alob();
                for (int i = 0; i < length; i++) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        String[] strArr4 = tma.a;
                        int i2 = tls.a;
                        tmc tmcVar = new tmc((byte[]) null);
                        tmcVar.aD();
                        tmcVar.aB();
                        long j2 = du[i];
                        if (strArr != null) {
                            tmcVar.d(strArr[i]);
                        }
                        if (strArr2 != null) {
                            tmcVar.b(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            tmcVar.c(strArr3[i]);
                        }
                        alobVar.h(tmcVar.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i3 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
