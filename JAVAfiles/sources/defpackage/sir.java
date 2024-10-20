package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sir extends agmp implements agmq {
    @Deprecated
    public sir(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sis sisVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, siu.a, agoxVar, akkwVar, sisVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sin();
    }

    public final long c() {
        return getLong(cI(7, siu.a));
    }

    public final long e() {
        return getLong(cI(0, siu.a));
    }

    public final long f() {
        return getLong(cI(1, siu.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        long[] jArr2;
        String[] strArr;
        String[] strArr2;
        long[] jArr3;
        qkt[] qktVarArr;
        int i;
        String[] strArr3;
        int i2;
        long[] jArr4;
        long[] jArr5;
        int i3;
        char c;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, siu.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sic(this, 15));
            if (db(1)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(1, siu.a))));
                } else {
                    jArr2 = new long[]{f()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new sic(this, 16));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, siu.a))), new String[0]);
                } else {
                    strArr = new String[]{j()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new sic(this, 17));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, siu.a))), new String[0]);
                } else {
                    strArr2 = new String[]{i()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new sic(this, 18));
            if (db(4)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(4, siu.a))));
                } else {
                    jArr3 = new long[]{g()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new sic(this, 19));
            if (db(5)) {
                if (z) {
                    int[] dk = dk(getString(cI(5, siu.a)));
                    qkt[] values = qkt.values();
                    int length2 = values.length;
                    qkt[] qktVarArr2 = new qkt[dk.length];
                    for (int i4 = 0; i4 < dk.length; i4++) {
                        int i5 = dk[i4];
                        if (i5 < length2) {
                            qktVarArr2[i4] = values[i5];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    qktVarArr = (qkt[]) agnc.z(null, qktVarArr2, new qkt[0]);
                } else {
                    qktVarArr = new qkt[]{h()};
                }
            } else {
                qktVarArr = null;
            }
            agmp.ds(length, qktVarArr, new sic(this, 20));
            if (db(6)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(6, siu.a))), new String[0]);
                    i = 1;
                } else {
                    i = 1;
                    strArr3 = new String[]{k()};
                }
            } else {
                i = 1;
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new siq(this, i));
            char c2 = 7;
            if (db(7)) {
                if (z) {
                    jArr4 = agnc.y(null, dl(getString(cI(7, siu.a))));
                    i2 = 0;
                } else {
                    i2 = 0;
                    jArr4 = new long[]{c()};
                }
            } else {
                i2 = 0;
                jArr4 = null;
            }
            agmp.dr(length, jArr4, new siq(this, i2));
            alob alobVar = new alob();
            int i6 = 0;
            while (i6 < length) {
                long j = du[i6];
                if (j > 0) {
                    if (hashSet.contains(Long.valueOf(j))) {
                        jArr5 = du;
                        i3 = length;
                        c = 7;
                    } else {
                        hashSet.add(Long.valueOf(du[i6]));
                        String[] strArr4 = siu.a;
                        int i7 = shg.a;
                        sio sioVar = new sio();
                        sioVar.aD();
                        sioVar.aB();
                        long j2 = du[i6];
                        i3 = length;
                        if (jArr != null) {
                            long j3 = jArr[i6];
                            sioVar.aC(0);
                            sioVar.a = j3;
                        }
                        if (jArr2 != null) {
                            long j4 = jArr2[i6];
                            sioVar.aC(1);
                            sioVar.b = j4;
                        }
                        if (strArr != null) {
                            String str = strArr[i6];
                            sioVar.aC(2);
                            sioVar.c = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i6];
                            sioVar.aC(3);
                            sioVar.d = str2;
                        }
                        long[] jArr6 = du;
                        if (jArr3 != null) {
                            long j5 = jArr3[i6];
                            sioVar.aC(4);
                            sioVar.e = j5;
                        }
                        if (qktVarArr != null) {
                            qkt qktVar = qktVarArr[i6];
                            sioVar.aC(5);
                            sioVar.f = qktVar;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i6];
                            sioVar.aC(6);
                            sioVar.g = str3;
                        }
                        jArr5 = jArr6;
                        if (jArr4 != null) {
                            long j6 = jArr4[i6];
                            c = 7;
                            sioVar.aC(7);
                            sioVar.h = j6;
                        } else {
                            c = 7;
                        }
                        sin sinVar = new sin();
                        sinVar.ar(sioVar.az());
                        sinVar.a = sioVar.a;
                        sinVar.b = sioVar.b;
                        sinVar.c = sioVar.c;
                        sinVar.d = sioVar.d;
                        sinVar.e = sioVar.e;
                        sinVar.f = sioVar.f;
                        sinVar.g = sioVar.g;
                        sinVar.h = sioVar.h;
                        sinVar.cF = sioVar.aA();
                        alobVar.h(sinVar);
                    }
                } else {
                    jArr5 = du;
                    i3 = length;
                    c = c2;
                }
                i6++;
                du = jArr5;
                c2 = c;
                length = i3;
            }
            return alobVar.g();
        }
        int i8 = alog.d;
        return alsx.a;
    }

    public final long g() {
        return getLong(cI(4, siu.a));
    }

    public final qkt h() {
        qkt[] values = qkt.values();
        int i = getInt(cI(5, siu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cI(3, siu.a));
    }

    public final String j() {
        return getString(cI(2, siu.a));
    }

    public final String k() {
        return getString(cI(6, siu.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
