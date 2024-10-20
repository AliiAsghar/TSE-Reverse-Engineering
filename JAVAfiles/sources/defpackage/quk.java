package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class quk extends agmp implements agmq {
    @Deprecated
    public quk(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, qul qulVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qun.a, agoxVar, akkwVar, qulVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new quh();
    }

    public final int c() {
        return getInt(cI(1, qun.a));
    }

    public final int e() {
        return getInt(cI(2, qun.a));
    }

    public final String f() {
        return getString(cI(0, qun.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        int[] iArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            int[] iArr2 = null;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, qun.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new qtu(this, 12));
            if (db(1)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(1, qun.a))));
                } else {
                    iArr = new int[]{c()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new qtu(this, 13));
            if (db(2)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(2, qun.a))));
                } else {
                    iArr2 = new int[]{e()};
                }
            }
            agmp.dq(length, iArr2, new qtu(this, 14));
            alob alobVar = new alob();
            for (int i = 0; i < length; i++) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr2 = qun.a;
                    int i2 = qqe.a;
                    qui quiVar = new qui();
                    quiVar.aD();
                    quiVar.aB();
                    long j2 = du[i];
                    if (strArr != null) {
                        String str = strArr[i];
                        quiVar.aC(0);
                        quiVar.a = str;
                    }
                    if (iArr != null) {
                        int i3 = iArr[i];
                        quiVar.aC(1);
                        quiVar.b = i3;
                    }
                    if (iArr2 != null) {
                        int i4 = iArr2[i];
                        quiVar.aC(2);
                        quiVar.c = i4;
                    }
                    quh quhVar = new quh();
                    quhVar.ar(quiVar.az());
                    quhVar.a = quiVar.a;
                    quhVar.b = quiVar.b;
                    quhVar.c = quiVar.c;
                    quhVar.cF = quiVar.aA();
                    alobVar.h(quhVar);
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
