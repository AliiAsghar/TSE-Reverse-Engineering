package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qih {
    private static final xze b = xze.g("BugleDataModel", "CloudSyncDatabaseOperations");
    public final armf a;
    private final agnq c;
    private final armf d;
    private final armf e;

    public qih(armf armfVar, agnq agnqVar, armf armfVar2, armf armfVar3) {
        this.a = armfVar;
        this.c = agnqVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    public static ConversationIdType a(String str) {
        ConversationIdType conversationIdType;
        akrh e = aktp.e("CloudSyncDatabaseOperations#getExistingCloudSyncConversation");
        try {
            xyl.h();
            snf e2 = sni.e();
            e2.w("getExistingCloudSyncConversation");
            e2.q();
            e2.f(new qcq(6));
            e2.h(new qcr(str, 4));
            sna snaVar = (sna) e2.b().n();
            try {
                if (snaVar.moveToFirst()) {
                    if (snaVar.getCount() != 1) {
                        xyo e3 = b.e();
                        e3.H("Unexpected cursor size:");
                        e3.F(snaVar.getCount());
                        e3.r(new Throwable());
                    }
                    conversationIdType = snaVar.C();
                } else {
                    conversationIdType = ruy.a;
                }
                snaVar.close();
                e.close();
                return conversationIdType;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ConversationIdType b(tqc tqcVar, List list) {
        akrh e = aktp.e("CloudSyncDatabaseOperations#getOrCreateCloudSyncConversation");
        try {
            aiut.b();
            String c = c(list);
            ConversationIdType a = a(c);
            if (a.b()) {
                a = ((rtz) this.e.b()).an(-1L, tqcVar, list, 1, c, -1L);
            }
            e.close();
            return a;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String c(List list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((rxq) this.d.b()).g((ParticipantsTable.BindData) list.get(i));
        }
        Arrays.sort(strArr);
        return TextUtils.join(",", strArr);
    }

    public final boolean d(ConversationIdType conversationIdType, xhv xhvVar) {
        akrh e = aktp.e("CloudSyncDatabaseOperations#isCloudSyncConversation");
        try {
            boolean z = false;
            if (xhvVar.d()) {
                if (((rtz) this.e.b()).b(conversationIdType) == 1) {
                    z = true;
                }
            }
            e.close();
            return z;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e(String str, Bundle bundle, MessageCoreData messageCoreData) {
        return ((Boolean) this.c.c("CloudSyncDatabaseOperations#updateMessageWithCloudSyncId", new mrf(this, str, bundle, messageCoreData, 18))).booleanValue();
    }

    public final String[] f(ConversationIdType conversationIdType, syb sybVar) {
        String[] strArr;
        if (sybVar == null) {
            syc sycVar = new syc();
            sycVar.W(new agpk("1", new Object[0]));
            sybVar = new syb(sycVar);
        }
        akrh e = aktp.e("CloudSyncDatabaseOperations#getMessageCloudSyncIds");
        try {
            syc sycVar2 = new syc();
            sycVar2.e();
            if (!conversationIdType.b()) {
                sycVar2.f(conversationIdType);
            }
            sxy d = MessagesTable.d();
            d.w("+getMessageCloudSyncIds");
            d.e(new qcq(5));
            d.f(sycVar2);
            d.k(sybVar);
            d.q();
            sxt sxtVar = (sxt) d.b().n();
            try {
                if (sxtVar.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (sxtVar.moveToNext()) {
                        String U = sxtVar.U();
                        if (U != null) {
                            arrayList.add(U);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        strArr = (String[]) arrayList.toArray(new String[0]);
                        sxtVar.close();
                        e.close();
                        return strArr;
                    }
                }
                sxtVar.close();
                strArr = null;
                e.close();
                return strArr;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
