package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sue extends agmp implements agmq {
    @Deprecated
    public sue(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, suf sufVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sui.a, agoxVar, akkwVar, sufVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new suc();
    }

    public final long c() {
        return getLong(cI(0, sui.a));
    }

    public final tqk e() {
        tqk[] values = tqk.values();
        int i = getInt(cI(2, sui.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cI(3, sui.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        UUID[] uuidArr;
        tqk[] tqkVarArr;
        String[] strArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sui.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new ssl(this, 15));
            if (db(1)) {
                if (z) {
                    String[] dm = dm(getString(cI(1, sui.a)));
                    int length2 = dm.length;
                    UUID[] uuidArr2 = new UUID[length2];
                    for (int i = 0; i < length2; i++) {
                        uuidArr2[i] = UUID.fromString(dm[i]);
                    }
                    uuidArr = (UUID[]) agnc.z(null, uuidArr2, new UUID[0]);
                } else {
                    uuidArr = new UUID[]{g()};
                }
            } else {
                uuidArr = null;
            }
            agmp.ds(length, uuidArr, new ssl(this, 16));
            if (db(2)) {
                if (z) {
                    int[] dk = dk(getString(cI(2, sui.a)));
                    tqk[] values = tqk.values();
                    int length3 = values.length;
                    tqk[] tqkVarArr2 = new tqk[dk.length];
                    for (int i2 = 0; i2 < dk.length; i2++) {
                        int i3 = dk[i2];
                        if (i3 < length3) {
                            tqkVarArr2[i2] = values[i3];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqkVarArr = (tqk[]) agnc.z(null, tqkVarArr2, new tqk[0]);
                } else {
                    tqkVarArr = new tqk[]{e()};
                }
            } else {
                tqkVarArr = null;
            }
            agmp.ds(length, tqkVarArr, new ssl(this, 17));
            if (db(3)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(3, sui.a))), new String[0]);
                } else {
                    strArr = new String[]{f()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new ssl(this, 18));
            alob alobVar = new alob();
            for (int i4 = 0; i4 < length; i4++) {
                long j = du[i4];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i4]));
                    String[] strArr2 = sui.a;
                    int i5 = ssv.a;
                    tcs tcsVar = new tcs((byte[]) null);
                    tcsVar.aD();
                    tcsVar.aB();
                    long j2 = du[i4];
                    if (jArr != null) {
                        long j3 = jArr[i4];
                        tcsVar.aC(0);
                        tcsVar.a = j3;
                    }
                    if (uuidArr != null) {
                        tcsVar.g(uuidArr[i4]);
                    }
                    if (tqkVarArr != null) {
                        tcsVar.f(tqkVarArr[i4]);
                    }
                    if (strArr != null) {
                        tcsVar.e(strArr[i4]);
                    }
                    alobVar.h(tcsVar.d(new ssv(13)));
                }
            }
            return alobVar.g();
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final UUID g() {
        return UUID.fromString(getString(cI(1, sui.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
