package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smj extends agmp<smj, sml, smm, smh, smi> implements agmq {
    @Deprecated
    public smj(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sml smlVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, smp.a, agoxVar, akkwVar, smlVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new smh();
    }

    public final long c() {
        return getLong(cI(1, smp.a));
    }

    public final qfe e() {
        return qfe.b(getInt(cI(2, smp.a)));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cI(0, smp.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        ConversationIdType[] conversationIdTypeArr;
        long[] jArr;
        qfe[] qfeVarArr;
        rxg[] rxgVarArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        long[] dl = dl(getString(cI(0, smp.a)));
                        int length2 = dl.length;
                        ConversationIdType[] conversationIdTypeArr2 = new ConversationIdType[length2];
                        for (int i = 0; i < length2; i++) {
                            conversationIdTypeArr2[i] = new ConversationIdType(dl[i]);
                        }
                        conversationIdTypeArr = (ConversationIdType[]) agnc.z(null, conversationIdTypeArr2, new ConversationIdType[0]);
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{f()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                agmp.ds(length, conversationIdTypeArr, new slr(this, 10));
                if (db(1)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(1, smp.a))));
                    } else {
                        jArr = new long[]{c()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new slr(this, 11));
                if (db(2)) {
                    if (z) {
                        int[] dk = dk(getString(cI(2, smp.a)));
                        qfe[] qfeVarArr2 = new qfe[dk.length];
                        for (int i2 = 0; i2 < dk.length; i2++) {
                            qfe b = qfe.b(dk[i2]);
                            if (b != null) {
                                qfeVarArr2[i2] = b;
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
                agmp.ds(length, qfeVarArr, new slr(this, 12));
                if (db(3)) {
                    if (z) {
                        String[] dm = dm(getString(cI(3, smp.a)));
                        int length3 = dm.length;
                        rxg[] rxgVarArr2 = new rxg[length3];
                        for (int i3 = 0; i3 < length3; i3++) {
                            rxgVarArr2[i3] = vcp.l(dm[i3]);
                        }
                        rxgVarArr = (rxg[]) agnc.z(null, rxgVarArr2, new rxg[0]);
                    } else {
                        rxgVarArr = new rxg[]{g()};
                    }
                } else {
                    rxgVarArr = null;
                }
                agmp.ds(length, rxgVarArr, new slr(this, 13));
                alob alobVar = new alob();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = du[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i4]));
                        String[] strArr = smp.a;
                        int i5 = ske.a;
                        tcs tcsVar = new tcs((byte[]) null, (byte[]) null);
                        tcsVar.aD();
                        tcsVar.aB();
                        long j2 = du[i4];
                        if (conversationIdTypeArr != null) {
                            tcsVar.k(conversationIdTypeArr[i4]);
                        }
                        if (jArr != null) {
                            tcsVar.m(jArr[i4]);
                        }
                        if (qfeVarArr != null) {
                            tcsVar.n(qfeVarArr[i4]);
                        }
                        if (rxgVarArr != null) {
                            tcsVar.l(rxgVarArr[i4]);
                        }
                        alobVar.h(tcsVar.h());
                    }
                }
                return alobVar.g();
            }
        }
        int i6 = alog.d;
        return alsx.a;
    }

    public final rxg g() {
        return vcp.l(getString(cI(3, smp.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
