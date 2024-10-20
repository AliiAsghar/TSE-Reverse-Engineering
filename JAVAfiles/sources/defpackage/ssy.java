package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssy extends agmp implements agmq {
    @Deprecated
    public ssy(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, ssz sszVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, stb.a, agoxVar, akkwVar, sszVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new ssu();
    }

    public final int c() {
        return getInt(cI(0, stb.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                int[] iArr = null;
                if (db(0)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(0, stb.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                }
                agmp.dq(length, iArr, new ssl(this, 3));
                alob alobVar = new alob();
                for (int i = 0; i < length; i++) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        String[] strArr = stb.a;
                        int i2 = ssv.a;
                        ssw sswVar = new ssw();
                        sswVar.aD();
                        sswVar.aB();
                        long j2 = du[i];
                        if (iArr != null) {
                            sswVar.b(iArr[i]);
                        }
                        alobVar.h(sswVar.a());
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
