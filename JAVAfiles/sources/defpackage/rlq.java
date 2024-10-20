package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rlq extends agmp implements agmq {
    @Deprecated
    public rlq(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, rls rlsVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, rlv.a, agoxVar, akkwVar, rlsVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new rln();
    }

    public final long c() {
        return getLong(cI(3, rlv.a));
    }

    public final long e() {
        return getLong(cI(0, rlv.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cI(1, rlv.a)));
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
        long[] jArr3;
        String[] strArr7;
        int i;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, rlv.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new rle(this, 11));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, rlv.a)));
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
            agmp.ds(length, messageIdTypeArr, new rle(this, 12));
            if (db(2)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(2, rlv.a))), new String[0]);
                } else {
                    strArr = new String[]{l()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new rle(this, 13));
            if (db(3)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(3, rlv.a))));
                } else {
                    jArr2 = new long[]{c()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new rle(this, 14));
            if (db(4)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(4, rlv.a))), new String[0]);
                } else {
                    strArr2 = new String[]{k()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new rle(this, 15));
            if (db(5)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(5, rlv.a))), new String[0]);
                } else {
                    strArr3 = new String[]{h()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new rle(this, 16));
            if (db(6)) {
                if (z) {
                    strArr4 = (String[]) agnc.z(null, dm(getString(cI(6, rlv.a))), new String[0]);
                } else {
                    strArr4 = new String[]{j()};
                }
            } else {
                strArr4 = null;
            }
            agmp.ds(length, strArr4, new rle(this, 17));
            if (db(7)) {
                if (z) {
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(7, rlv.a))), new String[0]);
                } else {
                    strArr5 = new String[]{i()};
                }
            } else {
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new rle(this, 18));
            if (db(8)) {
                if (z) {
                    strArr6 = (String[]) agnc.z(null, dm(getString(cI(8, rlv.a))), new String[0]);
                } else {
                    strArr6 = new String[]{g()};
                }
            } else {
                strArr6 = null;
            }
            agmp.ds(length, strArr6, new rle(this, 19));
            alob alobVar = new alob();
            int i3 = 0;
            while (i3 < length) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr8 = rlv.a;
                    int i4 = rlm.a;
                    rlo rloVar = new rlo();
                    rloVar.aD();
                    rloVar.aB();
                    long j2 = du[i3];
                    jArr3 = du;
                    if (jArr != null) {
                        long j3 = jArr[i3];
                        i = length;
                        rloVar.aC(0);
                        rloVar.a = j3;
                    } else {
                        i = length;
                    }
                    if (messageIdTypeArr != null) {
                        MessageIdType messageIdType = messageIdTypeArr[i3];
                        rloVar.aC(1);
                        rloVar.b = messageIdType;
                    }
                    if (strArr != null) {
                        String str = strArr[i3];
                        rloVar.aC(2);
                        rloVar.c = str;
                    }
                    strArr7 = strArr5;
                    if (jArr2 != null) {
                        long j4 = jArr2[i3];
                        rloVar.aC(3);
                        rloVar.d = j4;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i3];
                        rloVar.aC(4);
                        rloVar.e = str2;
                    }
                    if (strArr3 != null) {
                        String str3 = strArr3[i3];
                        rloVar.aC(5);
                        rloVar.f = str3;
                    }
                    if (strArr4 != null) {
                        String str4 = strArr4[i3];
                        rloVar.aC(6);
                        rloVar.g = str4;
                    }
                    if (strArr7 != null) {
                        String str5 = strArr7[i3];
                        rloVar.aC(7);
                        rloVar.h = str5;
                    }
                    if (strArr6 != null) {
                        String str6 = strArr6[i3];
                        rloVar.aC(8);
                        rloVar.i = str6;
                    }
                    rln rlnVar = new rln();
                    rlnVar.ar(rloVar.az());
                    rlnVar.a = rloVar.a;
                    rlnVar.b = rloVar.b;
                    rlnVar.c = rloVar.c;
                    rlnVar.d = rloVar.d;
                    rlnVar.e = rloVar.e;
                    rlnVar.f = rloVar.f;
                    rlnVar.g = rloVar.g;
                    rlnVar.h = rloVar.h;
                    rlnVar.i = rloVar.i;
                    rlnVar.cF = rloVar.aA();
                    alobVar.h(rlnVar);
                } else {
                    jArr3 = du;
                    strArr7 = strArr5;
                    i = length;
                }
                i3++;
                strArr5 = strArr7;
                du = jArr3;
                length = i;
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final String g() {
        return getString(cI(8, rlv.a));
    }

    public final String h() {
        return getString(cI(5, rlv.a));
    }

    public final String i() {
        return getString(cI(7, rlv.a));
    }

    public final String j() {
        return getString(cI(6, rlv.a));
    }

    public final String k() {
        return getString(cI(4, rlv.a));
    }

    public final String l() {
        return getString(cI(2, rlv.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
