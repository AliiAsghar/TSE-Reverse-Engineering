package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tos extends agmp implements agmq {
    @Deprecated
    public tos(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tot totVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tow.a, agoxVar, akkwVar, totVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new too();
    }

    public final String c() {
        return getString(cI(0, tow.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                String[] strArr = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, tow.a))), new String[0]);
                    } else {
                        strArr = new String[]{c()};
                    }
                }
                agmp.ds(length, strArr, new tor(this, i));
                alob alobVar = new alob();
                while (i < length) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        String[] strArr2 = tow.a;
                        int i2 = toe.a;
                        top topVar = new top();
                        topVar.aD();
                        topVar.aB();
                        long j2 = du[i];
                        if (strArr != null) {
                            topVar.b(strArr[i]);
                        }
                        alobVar.h(topVar.a());
                    }
                    i++;
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
