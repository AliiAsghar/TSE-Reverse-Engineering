package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qud extends agmp implements agmq {
    @Deprecated
    public qud(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, que queVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, qug.a, agoxVar, akkwVar, queVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new qua();
    }

    public final qss c() {
        return qta.d(getString(cI(0, qug.a)));
    }

    public final qtn e() {
        qtn[] values = qtn.values();
        int i = getInt(cI(5, qug.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final qtz f() {
        qtz[] values = qtz.values();
        int i = getInt(cI(1, qug.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        qss[] qssVarArr;
        qtz[] qtzVarArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        qtn[] qtnVarArr;
        byte[][] bArr;
        qtn[] qtnVarArr2;
        String[] strArr4;
        vtm[] vtmVarArr;
        Instant[] instantArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    String[] dm = dm(getString(cI(0, qug.a)));
                    int length2 = dm.length;
                    qss[] qssVarArr2 = new qss[length2];
                    for (int i = 0; i < length2; i++) {
                        qssVarArr2[i] = qta.d(dm[i]);
                    }
                    qssVarArr = (qss[]) agnc.z(null, qssVarArr2, new qss[0]);
                } else {
                    qssVarArr = new qss[]{c()};
                }
            } else {
                qssVarArr = null;
            }
            agmp.ds(length, qssVarArr, new qtu(this, 3));
            if (db(1)) {
                if (z) {
                    int[] dk = dk(getString(cI(1, qug.a)));
                    qtz[] values = qtz.values();
                    int length3 = values.length;
                    qtz[] qtzVarArr2 = new qtz[dk.length];
                    for (int i2 = 0; i2 < dk.length; i2++) {
                        int i3 = dk[i2];
                        if (i3 < length3) {
                            qtzVarArr2[i2] = values[i3];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    qtzVarArr = (qtz[]) agnc.z(null, qtzVarArr2, new qtz[0]);
                } else {
                    qtzVarArr = new qtz[]{f()};
                }
            } else {
                qtzVarArr = null;
            }
            agmp.ds(length, qtzVarArr, new qtu(this, 4));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, qug.a))), new String[0]);
                } else {
                    strArr = new String[]{j()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new qtu(this, 5));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, qug.a))), new String[0]);
                } else {
                    strArr2 = new String[]{i()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new qtu(this, 6));
            if (db(4)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(4, qug.a))), new String[0]);
                } else {
                    strArr3 = new String[]{k()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new qtu(this, 7));
            if (db(5)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(5, qug.a)));
                    qtn[] values2 = qtn.values();
                    int length4 = values2.length;
                    qtn[] qtnVarArr3 = new qtn[dk2.length];
                    for (int i4 = 0; i4 < dk2.length; i4++) {
                        int i5 = dk2[i4];
                        if (i5 < length4) {
                            qtnVarArr3[i4] = values2[i5];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    qtnVarArr = (qtn[]) agnc.z(null, qtnVarArr3, new qtn[0]);
                } else {
                    qtnVarArr = new qtn[]{e()};
                }
            } else {
                qtnVarArr = null;
            }
            agmp.ds(length, qtnVarArr, new qtu(this, 8));
            if (db(6)) {
                if (z) {
                    bArr = agnc.B(null, dv(getString(cI(6, qug.a))));
                } else {
                    bArr = new byte[][]{l()};
                }
            } else {
                bArr = null;
            }
            agmp.ds(length, bArr, new qtu(this, 9));
            if (db(7)) {
                if (z) {
                    long[] dl = dl(getString(cI(7, qug.a)));
                    int length5 = dl.length;
                    vtm[] vtmVarArr2 = new vtm[length5];
                    int i6 = 0;
                    while (i6 < length5) {
                        vtmVarArr2[i6] = new vtm(dl[i6]);
                        i6++;
                        strArr3 = strArr3;
                        qtnVarArr = qtnVarArr;
                        dl = dl;
                    }
                    qtnVarArr2 = qtnVarArr;
                    strArr4 = strArr3;
                    vtmVarArr = (vtm[]) agnc.z(null, vtmVarArr2, new vtm[0]);
                } else {
                    qtnVarArr2 = qtnVarArr;
                    strArr4 = strArr3;
                    vtmVarArr = new vtm[]{g()};
                }
            } else {
                qtnVarArr2 = qtnVarArr;
                strArr4 = strArr3;
                vtmVarArr = null;
            }
            agmp.ds(length, vtmVarArr, new qtu(this, 10));
            if (db(8)) {
                if (z) {
                    long[] dl2 = dl(getString(cI(8, qug.a)));
                    int length6 = dl2.length;
                    Instant[] instantArr2 = new Instant[length6];
                    for (int i7 = 0; i7 < length6; i7++) {
                        instantArr2[i7] = uzz.l(dl2[i7]);
                    }
                    instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{h()};
                }
            } else {
                instantArr = null;
            }
            agmp.ds(length, instantArr, new qtu(this, 11));
            alob alobVar = new alob();
            for (int i8 = 0; i8 < length; i8++) {
                long j = du[i8];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i8]));
                    String[] strArr5 = qug.a;
                    int i9 = qqe.a;
                    qub qubVar = new qub();
                    qubVar.aD();
                    qubVar.aB();
                    long j2 = du[i8];
                    if (qssVarArr != null) {
                        qss qssVar = qssVarArr[i8];
                        qubVar.aC(0);
                        qubVar.a = qssVar;
                    }
                    if (qtzVarArr != null) {
                        qtz qtzVar = qtzVarArr[i8];
                        qubVar.aC(1);
                        qubVar.b = qtzVar;
                    }
                    if (strArr != null) {
                        String str = strArr[i8];
                        qubVar.aC(2);
                        qubVar.c = str;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i8];
                        qubVar.aC(3);
                        qubVar.d = str2;
                    }
                    if (strArr4 != null) {
                        String str3 = strArr4[i8];
                        qubVar.aC(4);
                        qubVar.e = str3;
                    }
                    if (qtnVarArr2 != null) {
                        qtn qtnVar = qtnVarArr2[i8];
                        qubVar.aC(5);
                        qubVar.f = qtnVar;
                    }
                    if (bArr != null) {
                        byte[] bArr2 = bArr[i8];
                        qubVar.aC(6);
                        qubVar.g = bArr2;
                    }
                    if (vtmVarArr != null) {
                        vtm vtmVar = vtmVarArr[i8];
                        qubVar.aC(7);
                        qubVar.h = vtmVar;
                    }
                    if (instantArr != null) {
                        Instant instant = instantArr[i8];
                        qubVar.aC(8);
                        qubVar.i = instant;
                    }
                    qua quaVar = new qua();
                    quaVar.ar(qubVar.az());
                    quaVar.a = qubVar.a;
                    quaVar.b = qubVar.b;
                    quaVar.c = qubVar.c;
                    quaVar.d = qubVar.d;
                    quaVar.e = qubVar.e;
                    quaVar.f = qubVar.f;
                    quaVar.g = qubVar.g;
                    quaVar.h = qubVar.h;
                    quaVar.i = qubVar.i;
                    quaVar.cF = qubVar.aA();
                    alobVar.h(quaVar);
                }
            }
            return alobVar.g();
        }
        int i10 = alog.d;
        return alsx.a;
    }

    public final vtm g() {
        return new vtm(getLong(cI(7, qug.a)));
    }

    public final Instant h() {
        return uzz.l(getLong(cI(8, qug.a)));
    }

    public final String i() {
        return getString(cI(3, qug.a));
    }

    public final String j() {
        return getString(cI(2, qug.a));
    }

    public final String k() {
        return getString(cI(4, qug.a));
    }

    public final byte[] l() {
        return getBlob(cI(6, qug.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
