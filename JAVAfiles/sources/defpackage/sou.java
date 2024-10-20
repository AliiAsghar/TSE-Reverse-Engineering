package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sou extends agmp implements agmq {
    @Deprecated
    public sou(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sow sowVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, soz.a, agoxVar, akkwVar, sowVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sos();
    }

    public final String c() {
        return getString(cI(0, soz.a));
    }

    public final String e() {
        return getString(cI(1, soz.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, soz.a))), new String[0]);
                    } else {
                        strArr = new String[]{c()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new sok(this, 13));
                if (db(1)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, soz.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{e()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new sok(this, 14));
                alob alobVar = new alob();
                for (int i = 0; i < length; i++) {
                    long j = du[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i]));
                        String[] strArr3 = soz.a;
                        int i2 = sms.a;
                        tpk tpkVar = new tpk((byte[]) null, (char[]) null);
                        tpkVar.aD();
                        tpkVar.aB();
                        long j2 = du[i];
                        if (strArr != null) {
                            tpkVar.k(strArr[i]);
                        }
                        if (strArr2 != null) {
                            tpkVar.l(strArr2[i]);
                        }
                        alobVar.h(tpkVar.j());
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
