package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sns extends agmp implements agmq {
    @Deprecated
    public sns(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, snv snvVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, snz.a, agoxVar, akkwVar, snvVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new snq();
    }

    public final long c() {
        return getLong(cI(1, snz.a));
    }

    public final tqb e() {
        return tqb.b(getInt(cI(0, snz.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        tqb[] tqbVarArr;
        long[] jArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        int[] dk = dk(getString(cI(0, snz.a)));
                        tqb[] tqbVarArr2 = new tqb[dk.length];
                        for (int i = 0; i < dk.length; i++) {
                            tqb b = tqb.b(dk[i]);
                            if (b != null) {
                                tqbVarArr2[i] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tqbVarArr = (tqb[]) agnc.z(null, tqbVarArr2, new tqb[0]);
                    } else {
                        tqbVarArr = new tqb[]{e()};
                    }
                } else {
                    tqbVarArr = null;
                }
                agmp.ds(length, tqbVarArr, new smz(this, 7));
                if (db(1)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(1, snz.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new smz(this, 8));
                alob alobVar = new alob();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = du[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i2]));
                        String[] strArr = snz.a;
                        int i3 = sms.a;
                        tch tchVar = new tch((char[]) null);
                        tchVar.aD();
                        tchVar.aB();
                        long j2 = du[i2];
                        if (tqbVarArr != null) {
                            tchVar.d(tqbVarArr[i2]);
                        }
                        if (jArr != null) {
                            tchVar.e(jArr[i2]);
                        }
                        alobVar.h(tchVar.c());
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
