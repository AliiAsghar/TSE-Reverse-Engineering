package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssc extends agmp implements agmq {
    @Deprecated
    public ssc(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, ssd ssdVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, ssh.a, agoxVar, akkwVar, ssdVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new ssa();
    }

    public final long c() {
        return getLong(cI(2, ssh.a));
    }

    public final long e() {
        return getLong(cI(1, ssh.a));
    }

    public final String f() {
        return getString(cI(0, ssh.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        long[] jArr;
        long[] jArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, ssh.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new srt(this, 10));
            if (db(1)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(1, ssh.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new srt(this, 11));
            if (db(2)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(2, ssh.a))));
                } else {
                    jArr2 = new long[]{c()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new srt(this, 12));
            alob alobVar = new alob();
            for (int i = 0; i < length; i++) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr2 = ssh.a;
                    int i2 = srr.a;
                    tgd tgdVar = new tgd(null);
                    tgdVar.aD();
                    tgdVar.aB();
                    long j2 = du[i];
                    if (strArr != null) {
                        String str = strArr[i];
                        tgdVar.aC(0);
                        tgdVar.b = str;
                    }
                    if (jArr != null) {
                        tgdVar.c(jArr[i]);
                    }
                    if (jArr2 != null) {
                        tgdVar.b(jArr2[i]);
                    }
                    alobVar.h(tgdVar.a());
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
