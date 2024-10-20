package defpackage;

import android.database.Cursor;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class teb extends agmp implements agmq {
    @Deprecated
    public teb(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, ted tedVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, teh.a, agoxVar, akkwVar, tedVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tdx();
    }

    public final long c() {
        return getLong(cI(10, teh.a));
    }

    public final AgentUseCase e() {
        AgentUseCase[] values = AgentUseCase.values();
        int i = getInt(cI(11, teh.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cI(5, teh.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        long[] jArr;
        String[] strArr12;
        String[] strArr13;
        long[] jArr2;
        int i;
        AgentUseCase[] agentUseCaseArr;
        long[] jArr3;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, teh.a))), new String[0]);
                } else {
                    strArr = new String[]{m()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tdg(this, 11));
            if (db(1)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(1, teh.a))), new String[0]);
                } else {
                    strArr2 = new String[]{h()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new tdg(this, 16));
            if (db(2)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(2, teh.a))), new String[0]);
                } else {
                    strArr3 = new String[]{l()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new tdg(this, 17));
            if (db(3)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(3, teh.a))), new String[0]);
                } else {
                    strArr4 = new String[]{k()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new tdg(this, 18));
            if (db(4)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(4, teh.a))), new String[0]);
                } else {
                    strArr5 = new String[]{g()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new tdg(this, 19));
            if (db(5)) {
                if (z) {
                    strArr6 = (String[]) agnc.z(null, dm(getString(cI(5, teh.a))), new String[0]);
                } else {
                    strArr6 = new String[]{f()};
                }
            } else {
                strArr6 = null;
            }
            agmp.ds(length, strArr6, new tdg(this, 20));
            if (db(6)) {
                if (z) {
                    strArr7 = (String[]) agnc.z(null, dm(getString(cI(6, teh.a))), new String[0]);
                } else {
                    strArr7 = new String[]{j()};
                }
            } else {
                strArr7 = null;
            }
            agmp.ds(length, strArr7, new tea(this, 1));
            if (db(7)) {
                if (z) {
                    strArr8 = (String[]) agnc.z(null, dm(getString(cI(7, teh.a))), new String[0]);
                } else {
                    strArr8 = new String[]{i()};
                }
            } else {
                strArr8 = null;
            }
            agmp.ds(length, strArr8, new tea(this, 0));
            if (db(8)) {
                if (z) {
                    strArr9 = (String[]) agnc.z(null, dm(getString(cI(8, teh.a))), new String[0]);
                } else {
                    strArr9 = new String[]{n()};
                }
            } else {
                strArr9 = null;
            }
            agmp.ds(length, strArr9, new tdg(this, 12));
            if (db(9)) {
                if (z) {
                    strArr10 = strArr9;
                    strArr11 = (String[]) agnc.z(null, dm(getString(cI(9, teh.a))), new String[0]);
                } else {
                    strArr10 = strArr9;
                    strArr11 = new String[]{o()};
                }
            } else {
                strArr10 = strArr9;
                strArr11 = null;
            }
            agmp.ds(length, strArr11, new tdg(this, 13));
            if (db(10)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(10, teh.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            String[] strArr14 = strArr11;
            agmp.dr(length, jArr, new tdg(this, 14));
            if (db(11)) {
                if (z) {
                    int[] dk = dk(getString(cI(11, teh.a)));
                    AgentUseCase[] values = AgentUseCase.values();
                    int length2 = values.length;
                    jArr2 = jArr;
                    AgentUseCase[] agentUseCaseArr2 = new AgentUseCase[dk.length];
                    strArr12 = strArr8;
                    strArr13 = strArr7;
                    for (int i2 = 0; i2 < dk.length; i2++) {
                        int i3 = dk[i2];
                        if (i3 < length2) {
                            agentUseCaseArr2[i2] = values[i3];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i = 0;
                    agentUseCaseArr = (AgentUseCase[]) agnc.z(null, agentUseCaseArr2, new AgentUseCase[0]);
                } else {
                    strArr12 = strArr8;
                    strArr13 = strArr7;
                    jArr2 = jArr;
                    i = 0;
                    agentUseCaseArr = new AgentUseCase[]{e()};
                }
            } else {
                strArr12 = strArr8;
                strArr13 = strArr7;
                jArr2 = jArr;
                i = 0;
                agentUseCaseArr = null;
            }
            agmp.ds(length, agentUseCaseArr, new tdg(this, 15));
            alob alobVar = new alob();
            while (i < length) {
                long j = du[i];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i]));
                    String[] strArr15 = teh.a;
                    int i4 = tdb.a;
                    tdy tdyVar = new tdy();
                    tdyVar.aD();
                    tdyVar.aB();
                    long j2 = du[i];
                    if (strArr != null) {
                        tdyVar.k(strArr[i]);
                    }
                    if (strArr2 != null) {
                        tdyVar.e(strArr2[i]);
                    }
                    if (strArr3 != null) {
                        tdyVar.j(strArr3[i]);
                    }
                    if (strArr4 != null) {
                        tdyVar.i(strArr4[i]);
                    }
                    if (strArr5 != null) {
                        tdyVar.d(strArr5[i]);
                    }
                    if (strArr6 != null) {
                        tdyVar.c(strArr6[i]);
                    }
                    if (strArr13 != null) {
                        tdyVar.h(strArr13[i]);
                    }
                    if (strArr12 != null) {
                        tdyVar.g(strArr12[i]);
                    }
                    if (strArr10 != null) {
                        tdyVar.l(strArr10[i]);
                    }
                    if (strArr14 != null) {
                        tdyVar.m(strArr14[i]);
                    }
                    jArr3 = du;
                    if (jArr2 != null) {
                        tdyVar.f(jArr2[i]);
                    }
                    if (agentUseCaseArr != null) {
                        tdyVar.b(agentUseCaseArr[i]);
                    }
                    alobVar.h(tdyVar.a());
                } else {
                    jArr3 = du;
                }
                i++;
                du = jArr3;
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(4, teh.a));
    }

    public final String h() {
        return getString(cI(1, teh.a));
    }

    public final String i() {
        return getString(cI(7, teh.a));
    }

    public final String j() {
        return getString(cI(6, teh.a));
    }

    public final String k() {
        return getString(cI(3, teh.a));
    }

    public final String l() {
        return getString(cI(2, teh.a));
    }

    public final String m() {
        return getString(cI(0, teh.a));
    }

    public final String n() {
        return getString(cI(8, teh.a));
    }

    public final String o() {
        return getString(cI(9, teh.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
