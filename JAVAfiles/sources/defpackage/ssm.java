package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssm extends agmp implements agmq {
    @Deprecated
    public ssm(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sso ssoVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sss.a, agoxVar, akkwVar, ssoVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new ssi();
    }

    public final long c() {
        return getLong(cI(3, sss.a));
    }

    public final long e() {
        return getLong(cI(0, sss.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, sss.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        String[] strArr;
        long[] jArr2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        boolean[] zArr;
        boolean[] zArr2;
        long[] jArr3;
        int i;
        alob alobVar;
        alob alobVar2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            akkw akkwVar = this.i;
            boolean db = db(0);
            boolean z = akkwVar.b;
            if (db) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sss.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new srt(this, 13));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, sss.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr2[i2] = new MessageIdType(dl[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{f()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new srt(this, 16));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, sss.a))), new String[0]);
                } else {
                    strArr = new String[]{l()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new srt(this, 17));
            if (db(3)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(3, sss.a))));
                } else {
                    jArr2 = new long[]{c()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new srt(this, 18));
            if (db(4)) {
                if (z) {
                    String[] dm = dm(getString(cI(4, sss.a)));
                    for (int i3 = 0; i3 < dm.length; i3++) {
                        dm[i3] = yta.a(dm[i3]);
                    }
                    strArr2 = (String[]) agnc.z(null, dm, new String[0]);
                } else {
                    strArr2 = new String[]{k()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new srt(this, 19));
            if (db(5)) {
                if (z) {
                    String[] dm2 = dm(getString(cI(5, sss.a)));
                    for (int i4 = 0; i4 < dm2.length; i4++) {
                        dm2[i4] = yta.a(dm2[i4]);
                    }
                    strArr3 = (String[]) agnc.z(null, dm2, new String[0]);
                } else {
                    strArr3 = new String[]{h()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new srt(this, 20));
            if (db(6)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(6, sss.a))), new String[0]);
                } else {
                    strArr4 = new String[]{j()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new ssl(this, 1));
            if (db(7)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(7, sss.a))), new String[0]);
                } else {
                    strArr5 = new String[]{i()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new ssl(this, 0));
            if (db(8)) {
                if (z) {
                    strArr6 = (String[]) agnc.z(null, dm(getString(cI(8, sss.a))), new String[0]);
                } else {
                    strArr6 = new String[]{g()};
                }
            } else {
                strArr6 = null;
            }
            agmp.ds(length, strArr6, new ssl(this, 2));
            if (db(9)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(9, sss.a))));
                } else {
                    zArr = new boolean[]{n()};
                }
            } else {
                zArr = null;
            }
            String[] strArr7 = strArr6;
            agmp.dt(length, zArr, new srt(this, 14));
            if (db(10)) {
                if (z) {
                    zArr2 = agnc.A(null, dn(getString(cI(10, sss.a))));
                } else {
                    zArr2 = new boolean[]{m()};
                }
            } else {
                zArr2 = null;
            }
            agmp.dt(length, zArr2, new srt(this, 15));
            alob alobVar3 = new alob();
            int i5 = 0;
            while (i5 < length) {
                long j = du[i5];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i5]));
                    ssj b = sss.b();
                    b.aB();
                    long j2 = du[i5];
                    if (jArr != null) {
                        i = length;
                        alobVar2 = alobVar3;
                        long j3 = jArr[i5];
                        jArr3 = du;
                        b.aC(0);
                        b.a = j3;
                    } else {
                        jArr3 = du;
                        i = length;
                        alobVar2 = alobVar3;
                    }
                    if (messageIdTypeArr != null) {
                        b.l(messageIdTypeArr[i5]);
                    }
                    if (strArr != null) {
                        b.m(strArr[i5]);
                    }
                    if (jArr2 != null) {
                        b.d(jArr2[i5]);
                    }
                    if (strArr2 != null) {
                        b.k(strArr2[i5]);
                    }
                    if (strArr3 != null) {
                        b.f(strArr3[i5]);
                    }
                    if (strArr4 != null) {
                        b.h(strArr4[i5]);
                    }
                    if (strArr5 != null) {
                        b.g(strArr5[i5]);
                    }
                    if (strArr7 != null) {
                        b.e(strArr7[i5]);
                    }
                    if (zArr != null) {
                        b.j(zArr[i5]);
                    }
                    if (zArr2 != null) {
                        b.i(zArr2[i5]);
                    }
                    alobVar = alobVar2;
                    alobVar.h(b.a());
                } else {
                    jArr3 = du;
                    i = length;
                    alobVar = alobVar3;
                }
                i5++;
                alobVar3 = alobVar;
                length = i;
                du = jArr3;
            }
            return alobVar3.g();
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(8, sss.a));
    }

    public final String h() {
        return yta.a(getString(cI(5, sss.a)));
    }

    public final String i() {
        return getString(cI(7, sss.a));
    }

    public final String j() {
        return getString(cI(6, sss.a));
    }

    public final String k() {
        return yta.a(getString(cI(4, sss.a)));
    }

    public final String l() {
        return getString(cI(2, sss.a));
    }

    public final boolean m() {
        if (getInt(cI(10, sss.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (getInt(cI(9, sss.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
