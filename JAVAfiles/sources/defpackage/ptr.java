package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptr extends agmp implements agmq {
    @Deprecated
    public ptr(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, ptu ptuVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, pty.a, agoxVar, akkwVar, ptuVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new ptp();
    }

    public final ptz c() {
        byte[] blob = getBlob(cI(2, pty.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ptz) apag.parseFrom(ptz.a, blob, aozs.a());
        } catch (Throwable unused) {
            return ptz.a;
        }
    }

    public final Instant e() {
        return uzz.l(getLong(cI(1, pty.a)));
    }

    public final String f() {
        return getString(cI(0, pty.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        Instant[] instantArr;
        ptz[] ptzVarArr;
        ptz ptzVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, pty.a))), new String[0]);
                    } else {
                        strArr = new String[]{f()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new nfd(this, 3));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, pty.a)));
                        int length2 = dl.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i = 0; i < length2; i++) {
                            instantArr2[i] = uzz.l(dl[i]);
                        }
                        instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{e()};
                    }
                } else {
                    instantArr = null;
                }
                agmp.ds(length, instantArr, new nfd(this, 4));
                if (db(2)) {
                    if (z) {
                        List cY = cY(getString(cI(2, pty.a)));
                        ptz[] ptzVarArr2 = new ptz[cY.size()];
                        Iterator it = cY.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i3 = i2 + 1;
                                if (v == null) {
                                    ptzVar = null;
                                } else {
                                    try {
                                        ptzVar = (ptz) apag.parseFrom(ptz.a, v);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        ptzVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                ptzVarArr2[i2] = ptzVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        ptzVarArr = (ptz[]) agnc.z(null, ptzVarArr2, new ptz[0]);
                    } else {
                        ptzVarArr = new ptz[]{c()};
                    }
                } else {
                    ptzVarArr = null;
                }
                agmp.ds(length, ptzVarArr, new nfd(this, 5));
                alob alobVar = new alob();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = du[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i4]));
                        String[] strArr2 = pty.a;
                        int i5 = nfz.a;
                        tmc tmcVar = new tmc(null, null, null, null);
                        tmcVar.aD();
                        tmcVar.aB();
                        long j2 = du[i4];
                        if (strArr != null) {
                            tmcVar.o(strArr[i4]);
                        }
                        if (instantArr != null) {
                            tmcVar.n(instantArr[i4]);
                        }
                        if (ptzVarArr != null) {
                            tmcVar.p(ptzVarArr[i4]);
                        }
                        alobVar.h(tmcVar.m());
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
