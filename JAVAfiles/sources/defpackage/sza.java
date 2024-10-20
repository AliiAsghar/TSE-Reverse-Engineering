package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sza extends agmp implements agmq {
    @Deprecated
    public sza(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, szb szbVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, szd.a, agoxVar, akkwVar, szbVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new syy();
    }

    public final aldw c() {
        if (!isNull(cI(1, szd.a))) {
            byte[] blob = getBlob(cI(1, szd.a));
            if (blob == null) {
                return null;
            }
            try {
                return (aldw) apag.parseFrom(aldw.a, blob, aozs.a());
            } catch (Throwable unused) {
                return aldw.a;
            }
        }
        throw new IllegalStateException("found null in cursor for column features");
    }

    public final Instant e() {
        return uxi.i(getLong(cI(0, szd.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        Instant[] instantArr;
        aldw[] aldwVarArr;
        aldw aldwVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    long[] dl = dl(getString(cI(0, szd.a)));
                    int length2 = dl.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr2[i] = uxi.i(dl[i]);
                    }
                    instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
            } else {
                instantArr = null;
            }
            agmp.ds(length, instantArr, new syf(this, 11));
            if (db(1)) {
                if (z) {
                    if (!isNull(cI(1, szd.a))) {
                        List cY = cY(getString(cI(1, szd.a)));
                        aldw[] aldwVarArr2 = new aldw[cY.size()];
                        Iterator it = cY.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it.next());
                                int i3 = i2 + 1;
                                if (v == null) {
                                    aldwVar = null;
                                } else {
                                    try {
                                        aldwVar = (aldw) apag.parseFrom(aldw.a, v);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        aldwVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                aldwVarArr2[i2] = aldwVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        aldwVarArr = (aldw[]) agnc.z(null, aldwVarArr2, new aldw[0]);
                    } else {
                        throw new IllegalStateException("found null in cursor for column features");
                    }
                } else {
                    aldwVarArr = new aldw[]{c()};
                }
            } else {
                aldwVarArr = null;
            }
            agmp.ds(length, aldwVarArr, new syf(this, 12));
            alob alobVar = new alob();
            for (int i4 = 0; i4 < length; i4++) {
                long j = du[i4];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i4]));
                    String[] strArr = szd.a;
                    int i5 = sym.a;
                    tpk tpkVar = new tpk((char[]) null, (byte[]) null);
                    tpkVar.aD();
                    tpkVar.aB();
                    long j2 = du[i4];
                    if (instantArr != null) {
                        Instant instant = instantArr[i4];
                        tpkVar.aC(0);
                        tpkVar.b = instant;
                    }
                    if (aldwVarArr != null) {
                        aldw aldwVar2 = aldwVarArr[i4];
                        tpkVar.aC(1);
                        tpkVar.a = aldwVar2;
                    }
                    syy syyVar = new syy();
                    syyVar.ar(tpkVar.az());
                    Object obj = tpkVar.a;
                    if (obj != null) {
                        syyVar.a = (Instant) tpkVar.b;
                        syyVar.b = (aldw) obj;
                        syyVar.cF = tpkVar.aA();
                        alobVar.h(syyVar);
                    } else {
                        throw new IllegalStateException("field features cannot be null");
                    }
                }
            }
            return alobVar.g();
        }
        int i6 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
