package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tev extends agmp implements agmq {
    @Deprecated
    public tev(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tew tewVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tfa.a, agoxVar, akkwVar, tewVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tes();
    }

    public final long c() {
        return getLong(cI(2, tfa.a));
    }

    public final long e() {
        return getLong(cI(4, tfa.a));
    }

    public final long f() {
        return getLong(cI(3, tfa.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            Optional[] optionalArr = null;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, tfa.a))), new String[0]);
                } else {
                    strArr = new String[]{i()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tea(this, 6));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, tfa.a)));
                    int length2 = dl.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i = 0; i < length2; i++) {
                        messageIdTypeArr2[i] = new MessageIdType(dl[i]);
                    }
                    messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
            } else {
                messageIdTypeArr = null;
            }
            agmp.ds(length, messageIdTypeArr, new tea(this, 7));
            if (db(2)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(2, tfa.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new tea(this, 8));
            if (db(3)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(3, tfa.a))));
                } else {
                    jArr2 = new long[]{f()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(length, jArr2, new tea(this, 9));
            if (db(4)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(4, tfa.a))));
                } else {
                    jArr3 = new long[]{e()};
                }
            } else {
                jArr3 = null;
            }
            agmp.dr(length, jArr3, new tea(this, 10));
            if (db(5)) {
                if (z) {
                    long[] dl2 = dl(getString(cI(5, tfa.a)));
                    int length3 = dl2.length;
                    Optional[] optionalArr2 = new Optional[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        optionalArr2[i2] = uxi.g(dl2[i2]);
                    }
                    optionalArr = (Optional[]) agnc.z(null, optionalArr2, new Optional[0]);
                } else {
                    optionalArr = new Optional[]{h()};
                }
            }
            agmp.ds(length, optionalArr, new tea(this, 11));
            alob alobVar = new alob();
            for (int i3 = 0; i3 < length; i3++) {
                long j = du[i3];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i3]));
                    String[] strArr2 = tfa.a;
                    int i4 = tdb.a;
                    tet tetVar = new tet();
                    tetVar.aD();
                    tetVar.aB();
                    long j2 = du[i3];
                    if (strArr != null) {
                        String str = strArr[i3];
                        tetVar.aC(0);
                        tetVar.a = str;
                    }
                    if (messageIdTypeArr != null) {
                        tetVar.c(messageIdTypeArr[i3]);
                    }
                    if (jArr != null) {
                        tetVar.d(jArr[i3]);
                    }
                    if (jArr2 != null) {
                        tetVar.f(jArr2[i3]);
                    }
                    if (jArr3 != null) {
                        tetVar.e(jArr3[i3]);
                    }
                    if (optionalArr != null) {
                        tetVar.b(optionalArr[i3]);
                    }
                    alobVar.h(tetVar.a());
                }
            }
            return alobVar.g();
        }
        int i5 = alog.d;
        return alsx.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cI(1, tfa.a)));
    }

    public final Optional h() {
        return uxi.g(getLong(cI(5, tfa.a)));
    }

    public final String i() {
        return getString(cI(0, tfa.a));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
