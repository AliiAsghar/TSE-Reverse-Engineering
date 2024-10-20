package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qsv extends agmp implements agmq {
    @Deprecated
    public qsv(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qsw qswVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qsz.a, agoxVar, akkwVar, qswVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new qst();
    }

    public final qsn c() {
        qsn[] values = qsn.values();
        int i = getInt(cI(2, qsz.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final qss e() {
        return qta.d(getString(cI(0, qsz.a)));
    }

    public final String f() {
        return getString(cI(1, qsz.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        qss[] qssVarArr;
        String[] strArr;
        qsn[] qsnVarArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        String[] dm = dm(getString(cI(0, qsz.a)));
                        int length2 = dm.length;
                        qss[] qssVarArr2 = new qss[length2];
                        for (int i = 0; i < length2; i++) {
                            qssVarArr2[i] = qta.d(dm[i]);
                        }
                        qssVarArr = (qss[]) agnc.z(null, qssVarArr2, new qss[0]);
                    } else {
                        qssVarArr = new qss[]{e()};
                    }
                } else {
                    qssVarArr = null;
                }
                agmp.ds(length, qssVarArr, new nfd(this, 19));
                if (db(1)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(1, qsz.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new nfd(this, 20));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, qsz.a)));
                        qsn[] values = qsn.values();
                        int length3 = values.length;
                        qsn[] qsnVarArr2 = new qsn[dk.length];
                        for (int i2 = 0; i2 < dk.length; i2++) {
                            int i3 = dk[i2];
                            if (i3 < length3) {
                                qsnVarArr2[i2] = values[i3];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        qsnVarArr = (qsn[]) agnc.z(null, qsnVarArr2, new qsn[0]);
                    } else {
                        qsnVarArr = new qsn[]{c()};
                    }
                } else {
                    qsnVarArr = null;
                }
                agmp.ds(length, qsnVarArr, new qtu(this, 1));
                alob alobVar = new alob();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = du[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i4]));
                        String[] strArr2 = qsz.a;
                        int i5 = qqe.a;
                        tmc tmcVar = new tmc((char[]) null, (byte[]) null);
                        tmcVar.aD();
                        tmcVar.aB();
                        long j2 = du[i4];
                        if (qssVarArr != null) {
                            tmcVar.l(qssVarArr[i4]);
                        }
                        if (strArr != null) {
                            tmcVar.j(strArr[i4]);
                        }
                        if (qsnVarArr != null) {
                            tmcVar.k(qsnVarArr[i4]);
                        }
                        alobVar.h(tmcVar.i());
                    }
                }
                return alobVar.g();
            }
        }
        int i6 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
