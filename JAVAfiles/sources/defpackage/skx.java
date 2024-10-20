package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skx extends agmp<skx, skz, sla, sku, skw> implements agmq {
    @Deprecated
    public skx(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, skz skzVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sld.a, agoxVar, akkwVar, skzVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sku();
    }

    public final long c() {
        return getLong(cI(2, sld.a));
    }

    public final qfe e() {
        return qfe.b(getInt(cI(4, sld.a)));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cI(1, sld.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr;
        boolean[] zArr;
        qfe[] qfeVarArr;
        HashSet hashSet;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet2 = new HashSet();
                boolean z = this.i.b;
                rxg[] rxgVarArr = null;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, sld.a))), new String[0]);
                    } else {
                        strArr = new String[]{h()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new skg(this, 11));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, sld.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            conversationIdTypeArr2[i2] = new ConversationIdType(dl[i2]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{f()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new skg(this, 12));
                if (db(2)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(2, sld.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new skg(this, 13));
                if (db(3)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(3, sld.a))));
                    } else {
                        zArr = new boolean[]{i()};
                    }
                } else {
                    zArr = null;
                }
                agmp.dt(length, zArr, new skg(this, 14));
                if (db(4)) {
                    if (z) {
                        int[] dk = dk(getString(cI(4, sld.a)));
                        qfe[] qfeVarArr2 = new qfe[dk.length];
                        for (int i3 = 0; i3 < dk.length; i3++) {
                            qfe b = qfe.b(dk[i3]);
                            if (b != null) {
                                qfeVarArr2[i3] = b;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        qfeVarArr = (qfe[]) agnc.z(null, qfeVarArr2, new qfe[0]);
                    } else {
                        qfeVarArr = new qfe[]{e()};
                    }
                } else {
                    qfeVarArr = null;
                }
                agmp.ds(length, qfeVarArr, new skg(this, 15));
                if (db(5)) {
                    if (z) {
                        String[] dm = dm(getString(cI(5, sld.a)));
                        int length3 = dm.length;
                        rxg[] rxgVarArr2 = new rxg[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            rxgVarArr2[i4] = vcp.l(dm[i4]);
                        }
                        rxgVarArr = (rxg[]) agnc.z(null, rxgVarArr2, new rxg[0]);
                    } else {
                        rxgVarArr = new rxg[]{g()};
                    }
                }
                agmp.ds(length, rxgVarArr, new skg(this, 16));
                alob alobVar = new alob();
                int i5 = 0;
                while (i5 < length) {
                    long j = du[i5];
                    if (j > 0 && !hashSet2.contains(Long.valueOf(j))) {
                        hashSet2.add(Long.valueOf(du[i5]));
                        String[] strArr2 = sld.a;
                        int i6 = ske.a;
                        skv skvVar = new skv();
                        skvVar.aD();
                        skvVar.aB();
                        long j2 = du[i5];
                        if (strArr != null) {
                            String str = strArr[i5];
                            skvVar.aC(i);
                            skvVar.a = str;
                        }
                        if (conversationIdTypeArr != null) {
                            skvVar.c(conversationIdTypeArr[i5]);
                        }
                        hashSet = hashSet2;
                        if (jArr != null) {
                            skvVar.d(jArr[i5]);
                        }
                        if (zArr != null) {
                            boolean z2 = zArr[i5];
                            int i7 = skvVar.az;
                            if (i7 < 58090) {
                                agnc.t("is_normalized", i7);
                            }
                            skvVar.aC(3);
                            skvVar.d = z2;
                        }
                        if (qfeVarArr != null) {
                            skvVar.e(qfeVarArr[i5]);
                        }
                        if (rxgVarArr != null) {
                            rxg rxgVar = rxgVarArr[i5];
                            int i8 = skvVar.az;
                            if (i8 < 59440) {
                                agnc.t("last_modified_by_key", i8);
                            }
                            skvVar.aC(5);
                            skvVar.f = rxgVar;
                        }
                        alobVar.h(skvVar.a());
                    } else {
                        hashSet = hashSet2;
                    }
                    i5++;
                    hashSet2 = hashSet;
                    i = 0;
                }
                return alobVar.g();
            }
        }
        int i9 = alog.d;
        return alsx.a;
    }

    public final rxg g() {
        return vcp.l(getString(cI(5, sld.a)));
    }

    public final String h() {
        return getString(cI(0, sld.a));
    }

    public final boolean i() {
        if (getInt(cI(3, sld.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
