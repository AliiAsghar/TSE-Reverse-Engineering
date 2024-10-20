package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfj extends agmp implements agmq {
    @Deprecated
    public sfj(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, sfl sflVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sfp.a, agoxVar, akkwVar, sflVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sff();
    }

    public final int c() {
        return getInt(cI(2, sfp.a));
    }

    public final long e() {
        return getLong(cI(0, sfp.a));
    }

    public final ConversationIdType f() {
        return new ConversationIdType(getLong(cI(1, sfp.a)));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        ConversationIdType[] conversationIdTypeArr;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            int[] iArr = null;
            if (db(0)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(0, sfp.a))));
                } else {
                    jArr = new long[]{e()};
                }
            } else {
                jArr = null;
            }
            agmp.dr(length, jArr, new sfi(this, 0));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, sfp.a)));
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
            agmp.ds(length, conversationIdTypeArr, new sfi(this, 2));
            if (db(2)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(2, sfp.a))));
                } else {
                    iArr = new int[]{c()};
                }
            }
            agmp.dq(length, iArr, new sfi(this, 3));
            alob alobVar = new alob();
            for (int i2 = 0; i2 < length; i2++) {
                long j = du[i2];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i2]));
                    String[] strArr = sfp.a;
                    int i3 = seo.a;
                    sfg sfgVar = new sfg();
                    sfgVar.aD();
                    sfgVar.aB();
                    long j2 = du[i2];
                    if (jArr != null) {
                        long j3 = jArr[i2];
                        sfgVar.aC(0);
                        sfgVar.a = j3;
                    }
                    if (conversationIdTypeArr != null) {
                        sfgVar.c(conversationIdTypeArr[i2]);
                    }
                    if (iArr != null) {
                        sfgVar.b(iArr[i2]);
                    }
                    alobVar.h(sfgVar.a());
                }
            }
            return alobVar.g();
        }
        int i4 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
