package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tld extends agmp implements agmq {
    @Deprecated
    public tld(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tlf tlfVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tlj.a, agoxVar, akkwVar, tlfVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tla();
    }

    public final long c() {
        return getLong(cI(0, tlj.a));
    }

    public final long e() {
        return getLong(cI(4, tlj.a));
    }

    public final String f() {
        return getString(cI(1, tlj.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        byte[][] bArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            long[] jArr2 = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, tlj.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tkk(this, 17));
            if (db(1)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(1, tlj.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tkk(this, 18));
            if (db(2)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(2, tlj.a))), new String[0]);
                } else {
                    strArr2 = new String[]{g()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tkk(this, 19));
            if (db(3)) {
                if (z) {
                    bArr = agnc.B(null, dv(getString(cI(3, tlj.a))));
                } else {
                    bArr = new byte[][]{h()};
                }
            } else {
                bArr = null;
            }
            agmp.ds(length, bArr, new tkk(this, 20));
            if (db(4)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(4, tlj.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            }
            agmp.dr(length, jArr2, new tlm(this, 1));
            alob alobVar = new alob();
            for (int i = 0; i < length; i++) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr3 = tlj.a;
                    int i2 = tif.a;
                    tlb tlbVar = new tlb();
                    tlbVar.aD();
                    tlbVar.aB();
                    long j2 = du[i];
                    if (jArr != null) {
                        long j3 = jArr[i];
                        tlbVar.aC(0);
                        tlbVar.a = j3;
                    }
                    if (strArr != null) {
                        tlbVar.c(strArr[i]);
                    }
                    if (strArr2 != null) {
                        tlbVar.d(strArr2[i]);
                    }
                    if (bArr != null) {
                        tlbVar.b(bArr[i]);
                    }
                    if (jArr2 != null) {
                        long j4 = jArr2[i];
                        tlbVar.aC(4);
                        tlbVar.b = j4;
                    }
                    alobVar.h(tlbVar.a());
                }
            }
            return alobVar.g();
        }
        int i3 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(2, tlj.a));
    }

    public final byte[] h() {
        return getBlob(cI(3, tlj.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
