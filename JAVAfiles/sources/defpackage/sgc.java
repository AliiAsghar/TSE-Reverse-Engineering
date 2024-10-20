package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgc extends agmp implements agmq {
    @Deprecated
    public sgc(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sgd sgdVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sgh.a, agoxVar, akkwVar, sgdVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sga();
    }

    public final int c() {
        return getInt(cI(3, sgh.a));
    }

    public final long e() {
        return getLong(cI(5, sgh.a));
    }

    public final long f() {
        return getLong(cI(0, sgh.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        pqz[] pqzVarArr;
        int[] iArr;
        psk[] pskVarArr;
        long[] jArr2;
        ConversationIdType[] conversationIdTypeArr2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                byte[] bArr = null;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sgh.a))));
                    } else {
                        jArr = new long[]{f()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new sfi(this, 9));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, sgh.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            conversationIdTypeArr3[i2] = new ConversationIdType(dl[i2]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr3, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{i()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new sfi(this, 10));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, sgh.a)));
                        pqz[] pqzVarArr2 = new pqz[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            pqz b = pqz.b(dk[i3]);
                            if (b != null) {
                                pqzVarArr2[i3] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        pqzVarArr = (pqz[]) agnc.z(null, pqzVarArr2, new pqz[0]);
                    } else {
                        pqzVarArr = new pqz[]{g()};
                    }
                } else {
                    pqzVarArr = null;
                }
                agmp.ds(length, pqzVarArr, new sfi(this, 11));
                if (db(3)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(3, sgh.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new sfi(this, 12));
                if (db(4)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(4, sgh.a)));
                        psk[] pskVarArr2 = new psk[dk2.length];
                        for (int i4 = 0; i4 < dk2.length; i4++) {
                            psk b2 = psk.b(dk2[i4]);
                            if (b2 != null) {
                                pskVarArr2[i4] = b2;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        pskVarArr = (psk[]) agnc.z(null, pskVarArr2, new psk[0]);
                    } else {
                        pskVarArr = new psk[]{h()};
                    }
                } else {
                    pskVarArr = null;
                }
                agmp.ds(length, pskVarArr, new sfi(this, 13));
                if (db(5)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(5, sgh.a))));
                    } else {
                        jArr2 = new long[]{e()};
                    }
                } else {
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new sfi(this, 14));
                alob alobVar = new alob();
                int i5 = 0;
                while (i5 < length) {
                    long j = du[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i5]));
                        String[] strArr = sgh.a;
                        int i6 = seo.a;
                        sxe sxeVar = new sxe(bArr);
                        sxeVar.aD();
                        sxeVar.aB();
                        long j2 = du[i5];
                        conversationIdTypeArr2 = conversationIdTypeArr;
                        if (jArr != null) {
                            long j3 = jArr[i5];
                            sxeVar.aC(i);
                            sxeVar.a = j3;
                        }
                        if (conversationIdTypeArr2 != null) {
                            sxeVar.j(conversationIdTypeArr2[i5]);
                        }
                        if (pqzVarArr != null) {
                            sxeVar.i(pqzVarArr[i5]);
                        }
                        if (iArr != null) {
                            int i7 = iArr[i5];
                            int i8 = sxeVar.az;
                            if (i8 < 59010) {
                                agnc.t("conversation_stop_state", i8);
                            }
                            sxeVar.aC(3);
                            sxeVar.c = i7;
                        }
                        if (pskVarArr != null) {
                            sxeVar.k(pskVarArr[i5]);
                        }
                        if (jArr2 != null) {
                            sxeVar.l(jArr2[i5]);
                        }
                        alobVar.h(sxeVar.h());
                    } else {
                        conversationIdTypeArr2 = conversationIdTypeArr;
                    }
                    i5++;
                    conversationIdTypeArr = conversationIdTypeArr2;
                    i = 0;
                    bArr = null;
                }
                return alobVar.g();
            }
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final pqz g() {
        return pqz.b(getInt(cI(2, sgh.a)));
    }

    public final psk h() {
        return psk.b(getInt(cI(4, sgh.a)));
    }

    public final ConversationIdType i() {
        return new ConversationIdType(getLong(cI(1, sgh.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
