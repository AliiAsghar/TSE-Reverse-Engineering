package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sko extends agmp implements agmq {
    @Deprecated
    public sko(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, skp skpVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sks.a, agoxVar, akkwVar, skpVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new skl();
    }

    public final long c() {
        return getLong(cI(2, sks.a));
    }

    public final long e() {
        return getLong(cI(5, sks.a));
    }

    public final qfe f() {
        return qfe.b(getInt(cI(7, sks.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        Instant[] instantArr;
        long[] jArr;
        String[] strArr2;
        int i;
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr2;
        boolean[] zArr;
        qfe[] qfeVarArr;
        rxg[] rxgVarArr;
        long[] jArr3;
        long[] jArr4;
        ConversationIdType[] conversationIdTypeArr2;
        HashSet hashSet;
        alob alobVar;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet2 = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, sks.a))), new String[0]);
                } else {
                    strArr = new String[]{k()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new skg(this, 2));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, sks.a)));
                    int length2 = dl.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        instantArr2[i2] = uzz.l(dl[i2]);
                    }
                    instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{i()};
                }
            } else {
                instantArr = null;
            }
            agmp.ds(length, instantArr, new skg(this, 3));
            if (db(2)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(2, sks.a))));
                } else {
                    jArr = new long[]{c()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new skg(this, 4));
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, sks.a))), new String[0]);
                } else {
                    strArr2 = new String[]{j()};
                }
            } else {
                strArr2 = null;
            }
            agmp.ds(length, strArr2, new skg(this, 5));
            if (db(4)) {
                if (z) {
                    long[] dl2 = dl(getString(cI(4, sks.a)));
                    int length3 = dl2.length;
                    ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length3];
                    int i3 = 0;
                    while (i3 < length3) {
                        conversationIdTypeArr3[i3] = new ConversationIdType(dl2[i3]);
                        i3++;
                        length = length;
                    }
                    i = length;
                    conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr3, new ConversationIdType[0]);
                } else {
                    i = length;
                    conversationIdTypeArr = new ConversationIdType[]{g()};
                }
            } else {
                i = length;
                conversationIdTypeArr = null;
            }
            int i4 = i;
            agmp.ds(i4, conversationIdTypeArr, new skg(this, 6));
            if (db(5)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(5, sks.a))));
                } else {
                    jArr2 = new long[]{e()};
                }
            } else {
                jArr2 = null;
            }
            agmp.dr(i4, jArr2, new skg(this, 7));
            if (db(6)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(6, sks.a))));
                } else {
                    zArr = new boolean[]{l()};
                }
            } else {
                zArr = null;
            }
            agmp.dt(i4, zArr, new skg(this, 8));
            if (db(7)) {
                if (z) {
                    int[] dk = dk(getString(cI(7, sks.a)));
                    qfe[] qfeVarArr2 = new qfe[dk.length];
                    for (int i5 = 0; i5 < dk.length; i5++) {
                        qfe b = qfe.b(dk[i5]);
                        if (b != null) {
                            qfeVarArr2[i5] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    qfeVarArr = (qfe[]) agnc.z(null, qfeVarArr2, new qfe[0]);
                } else {
                    qfeVarArr = new qfe[]{f()};
                }
            } else {
                qfeVarArr = null;
            }
            agmp.ds(i4, qfeVarArr, new skg(this, 9));
            if (db(8)) {
                if (z) {
                    String[] dm = dm(getString(cI(8, sks.a)));
                    int length4 = dm.length;
                    rxg[] rxgVarArr2 = new rxg[length4];
                    for (int i6 = 0; i6 < length4; i6++) {
                        rxgVarArr2[i6] = vcp.l(dm[i6]);
                    }
                    rxgVarArr = (rxg[]) agnc.z(null, rxgVarArr2, new rxg[0]);
                } else {
                    rxgVarArr = new rxg[]{h()};
                }
            } else {
                rxgVarArr = null;
            }
            agmp.ds(i4, rxgVarArr, new skg(this, 10));
            alob alobVar2 = new alob();
            int i7 = 0;
            while (i7 < i4) {
                long j = du[i7];
                if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                    hashSet2.add(Long.valueOf(du[i7]));
                    String[] strArr3 = sks.a;
                    int i8 = ske.a;
                    skm skmVar = new skm();
                    skmVar.aD();
                    skmVar.aB();
                    long j2 = du[i7];
                    if (strArr != null) {
                        String str = strArr[i7];
                        jArr3 = du;
                        skmVar.aC(0);
                        skmVar.a = str;
                    } else {
                        jArr3 = du;
                    }
                    if (instantArr != null) {
                        Instant instant = instantArr[i7];
                        skmVar.aC(1);
                        skmVar.b = instant;
                    }
                    jArr4 = jArr2;
                    if (jArr != null) {
                        long j3 = jArr[i7];
                        hashSet = hashSet2;
                        skmVar.aC(2);
                        skmVar.c = j3;
                    } else {
                        hashSet = hashSet2;
                    }
                    if (strArr2 != null) {
                        String str2 = strArr2[i7];
                        skmVar.aC(3);
                        skmVar.d = str2;
                    }
                    if (conversationIdTypeArr != null) {
                        ConversationIdType conversationIdType = conversationIdTypeArr[i7];
                        skmVar.aC(4);
                        skmVar.e = conversationIdType;
                    }
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    if (jArr4 != null) {
                        long j4 = jArr4[i7];
                        skmVar.aC(5);
                        skmVar.f = j4;
                    }
                    if (zArr != null) {
                        boolean z2 = zArr[i7];
                        skmVar.aC(6);
                        skmVar.g = z2;
                    }
                    if (qfeVarArr != null) {
                        qfe qfeVar = qfeVarArr[i7];
                        skmVar.aC(7);
                        skmVar.h = qfeVar;
                    }
                    if (rxgVarArr != null) {
                        rxg rxgVar = rxgVarArr[i7];
                        int i9 = skmVar.az;
                        if (i9 < 59440) {
                            agnc.t("last_modified_by_key", i9);
                        }
                        skmVar.aC(8);
                        skmVar.i = rxgVar;
                    }
                    skl sklVar = new skl();
                    sklVar.ar(skmVar.az());
                    sklVar.a = skmVar.a;
                    sklVar.b = skmVar.b;
                    alobVar = alobVar2;
                    sklVar.c = skmVar.c;
                    sklVar.d = skmVar.d;
                    sklVar.e = skmVar.e;
                    sklVar.f = skmVar.f;
                    sklVar.g = skmVar.g;
                    sklVar.h = skmVar.h;
                    sklVar.i = skmVar.i;
                    sklVar.cF = skmVar.aA();
                    alobVar.h(sklVar);
                } else {
                    jArr3 = du;
                    jArr4 = jArr2;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    hashSet = hashSet2;
                    alobVar = alobVar2;
                }
                i7++;
                jArr2 = jArr4;
                conversationIdTypeArr = conversationIdTypeArr2;
                alobVar2 = alobVar;
                du = jArr3;
                hashSet2 = hashSet;
            }
            return alobVar2.g();
        }
        int i10 = alog.d;
        return alsx.a;
    }

    public final ConversationIdType g() {
        return new ConversationIdType(getLong(cI(4, sks.a)));
    }

    public final rxg h() {
        return vcp.l(getString(cI(8, sks.a)));
    }

    public final Instant i() {
        return uzz.l(getLong(cI(1, sks.a)));
    }

    public final String j() {
        return getString(cI(3, sks.a));
    }

    public final String k() {
        return getString(cI(0, sks.a));
    }

    public final boolean l() {
        if (getInt(cI(6, sks.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
