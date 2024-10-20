package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tis extends agmp implements agmq {
    @Deprecated
    public tis(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tiu tiuVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tiy.a, agoxVar, akkwVar, tiuVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tiq();
    }

    public final long c() {
        return getLong(cI(0, tiy.a));
    }

    public final long e() {
        return getLong(cI(1, tiy.a));
    }

    public final lwq f() {
        byte[] blob = getBlob(cI(2, tiy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (lwq) apag.parseFrom(lwq.a, blob, aozs.a());
        } catch (Throwable unused) {
            return lwq.a;
        }
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        lwq[] lwqVarArr;
        tja[] tjaVarArr;
        tiz[] tizVarArr;
        lwq lwqVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, tiy.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tii(this, 5));
            if (db(1)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(1, tiy.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new tii(this, 6));
            if (db(2)) {
                if (z) {
                    List cY = cY(getString(cI(2, tiy.a)));
                    lwq[] lwqVarArr2 = new lwq[cY.size()];
                    Iterator it = cY.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] v = agnc.v((String) it.next());
                            int i2 = i + 1;
                            if (v == null) {
                                lwqVar = null;
                            } else {
                                try {
                                    lwqVar = (lwq) apag.parseFrom(lwq.a, v);
                                } catch (Throwable unused) {
                                    i = i2;
                                    lwqVarArr2[i] = null;
                                    i++;
                                }
                            }
                            lwqVarArr2[i] = lwqVar;
                            i = i2;
                        } catch (Throwable unused2) {
                        }
                    }
                    lwqVarArr = (lwq[]) agnc.z(null, lwqVarArr2, new lwq[0]);
                } else {
                    lwqVarArr = new lwq[]{f()};
                }
            } else {
                lwqVarArr = null;
            }
            agmp.ds(length, lwqVarArr, new tii(this, 7));
            if (db(3)) {
                if (z) {
                    int[] dk = dk(getString(cI(3, tiy.a)));
                    tja[] values = tja.values();
                    int length2 = values.length;
                    tja[] tjaVarArr2 = new tja[dk.length];
                    for (int i3 = 0; i3 < dk.length; i3++) {
                        int i4 = dk[i3];
                        if (i4 < length2) {
                            tjaVarArr2[i3] = values[i4];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tjaVarArr = (tja[]) agnc.z(null, tjaVarArr2, new tja[0]);
                } else {
                    tjaVarArr = new tja[]{h()};
                }
            } else {
                tjaVarArr = null;
            }
            agmp.ds(length, tjaVarArr, new tii(this, 8));
            if (db(4)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(4, tiy.a)));
                    tiz[] values2 = tiz.values();
                    int length3 = values2.length;
                    tiz[] tizVarArr2 = new tiz[dk2.length];
                    for (int i5 = 0; i5 < dk2.length; i5++) {
                        int i6 = dk2[i5];
                        if (i6 < length3) {
                            tizVarArr2[i5] = values2[i6];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tizVarArr = (tiz[]) agnc.z(null, tizVarArr2, new tiz[0]);
                } else {
                    tizVarArr = new tiz[]{g()};
                }
            } else {
                tizVarArr = null;
            }
            agmp.ds(length, tizVarArr, new tii(this, 9));
            alob alobVar = new alob();
            for (int i7 = 0; i7 < length; i7++) {
                long j = du[i7];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i7]));
                    String[] strArr = tiy.a;
                    int i8 = tif.a;
                    tlb tlbVar = new tlb(null);
                    tlbVar.aD();
                    tlbVar.aB();
                    long j2 = du[i7];
                    if (jArr != null) {
                        long j3 = jArr[i7];
                        tlbVar.aC(0);
                        tlbVar.a = j3;
                    }
                    if (jArr2 != null) {
                        tlbVar.j(jArr2[i7]);
                    }
                    if (lwqVarArr != null) {
                        tlbVar.g(lwqVarArr[i7]);
                    }
                    if (tjaVarArr != null) {
                        tlbVar.h(tjaVarArr[i7]);
                    }
                    if (tizVarArr != null) {
                        tlbVar.i(tizVarArr[i7]);
                    }
                    alobVar.h(tlbVar.e(new tif(5)));
                }
            }
            return alobVar.g();
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final tiz g() {
        tiz[] values = tiz.values();
        int i = getInt(cI(4, tiy.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tja h() {
        tja[] values = tja.values();
        int i = getInt(cI(3, tiy.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
