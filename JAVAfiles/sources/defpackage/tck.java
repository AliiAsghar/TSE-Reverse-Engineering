package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tck extends agmp implements agmq {
    @Deprecated
    public tck(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tcn tcnVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tcq.a, agoxVar, akkwVar, tcnVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tcg();
    }

    public final long c() {
        return getLong(cI(0, tcq.a));
    }

    public final String e() {
        return getString(cI(1, tcq.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            String[] strArr = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, tcq.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tcj(this, 1));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tcq.a))), new String[0]);
                } else {
                    strArr = new String[]{e()};
                }
            }
            agmp.ds(length, strArr, new tcj(this, 0));
            alob alobVar = new alob();
            for (int i = 0; i < length; i++) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr2 = tcq.a;
                    int i2 = taq.a;
                    tch tchVar = new tch();
                    tchVar.aD();
                    tchVar.aB();
                    long j2 = du[i];
                    if (jArr != null) {
                        long j3 = jArr[i];
                        tchVar.aC(0);
                        tchVar.a = j3;
                    }
                    if (strArr != null) {
                        tchVar.b(strArr[i]);
                    }
                    alobVar.h(tchVar.a());
                }
            }
            return alobVar.g();
        }
        int i3 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
