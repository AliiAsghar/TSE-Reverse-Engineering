package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tnq extends agmp implements agmq {
    @Deprecated
    public tnq(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tnr tnrVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tnt.a, agoxVar, akkwVar, tnrVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tnn();
    }

    public final tqv c() {
        return tqv.b(getInt(cI(0, tnt.a)));
    }

    public final boolean e() {
        if (getInt(cI(1, tnt.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        tqv[] tqvVarArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            boolean[] zArr = null;
            if (db(0)) {
                if (z) {
                    int[] dk = dk(getString(cI(0, tnt.a)));
                    tqv[] tqvVarArr2 = new tqv[dk.length];
                    for (int i = 0; i < dk.length; i++) {
                        tqv b = tqv.b(dk[i]);
                        if (b != null) {
                            tqvVarArr2[i] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqvVarArr = (tqv[]) agnc.z(null, tqvVarArr2, new tqv[0]);
                } else {
                    tqvVarArr = new tqv[]{c()};
                }
            } else {
                tqvVarArr = null;
            }
            agmp.ds(length, tqvVarArr, new tmr(this, 16));
            if (db(1)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(1, tnt.a))));
                } else {
                    zArr = new boolean[]{e()};
                }
            }
            agmp.dt(length, zArr, new tmr(this, 17));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr = tnt.a;
                    int i3 = tls.a;
                    tno tnoVar = new tno();
                    tnoVar.aD();
                    tnoVar.aB();
                    long j2 = du[i2];
                    if (tqvVarArr != null) {
                        tqv tqvVar = tqvVarArr[i2];
                        tnoVar.aC(0);
                        tnoVar.b = tqvVar;
                    }
                    if (zArr != null) {
                        boolean z2 = zArr[i2];
                        tnoVar.aC(1);
                        tnoVar.a = z2;
                    }
                    tnn tnnVar = new tnn();
                    tnnVar.ar(tnoVar.az());
                    tnnVar.a = (tqv) tnoVar.b;
                    tnnVar.b = tnoVar.a;
                    tnnVar.cF = tnoVar.aA();
                    alobVar.h(tnnVar);
                }
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
