package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tpw extends agmp<tpw, tpx, tpy, VmtTable.BindData, tpv> implements agmq {
    @Deprecated
    public tpw(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tpx tpxVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, VmtTable.a, agoxVar, akkwVar, tpxVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tpt();
    }

    public final nht c() {
        return nht.b(getInt(cI(1, VmtTable.a)));
    }

    public final String e() {
        return getString(cI(3, VmtTable.a));
    }

    public final String f() {
        if (!isNull(cI(0, VmtTable.a))) {
            return getString(cI(0, VmtTable.a));
        }
        throw new IllegalStateException("found null in cursor for column part_id");
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        nht[] nhtVarArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                akkw akkwVar = this.i;
                boolean db = db(0);
                boolean z = akkwVar.b;
                String[] strArr3 = null;
                if (db) {
                    if (z) {
                        if (!isNull(cI(0, VmtTable.a))) {
                            strArr = (String[]) agnc.z(null, dm(getString(cI(0, VmtTable.a))), new String[0]);
                        } else {
                            throw new IllegalStateException("found null in cursor for column part_id");
                        }
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tor(this, 11));
                if (db(1)) {
                    if (z) {
                        int[] dk = dk(getString(cI(1, VmtTable.a)));
                        nht[] nhtVarArr2 = new nht[dk.length];
                        for (int i = 0; i < dk.length; i++) {
                            nht b = nht.b(dk[i]);
                            if (b != null) {
                                nhtVarArr2[i] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        nhtVarArr = (nht[]) agnc.z(null, nhtVarArr2, new nht[0]);
                    } else {
                        nhtVarArr = new nht[]{c()};
                    }
                } else {
                    nhtVarArr = null;
                }
                agmp.ds(length, nhtVarArr, new tor(this, 12));
                if (db(2)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, VmtTable.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{g()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tor(this, 13));
                if (db(3)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(3, VmtTable.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{e()};
                    }
                }
                agmp.ds(length, strArr3, new tor(this, 14));
                alob alobVar = new alob();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        tpu a = VmtTable.a();
                        a.aB();
                        long j2 = du[i2];
                        if (strArr != null) {
                            a.c(strArr[i2]);
                        }
                        if (nhtVarArr != null) {
                            a.e(nhtVarArr[i2]);
                        }
                        if (strArr2 != null) {
                            a.d(strArr2[i2]);
                        }
                        if (strArr3 != null) {
                            a.b(strArr3[i2]);
                        }
                        alobVar.h(a.a());
                    }
                }
                return alobVar.g();
            }
        }
        int i3 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(2, VmtTable.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
