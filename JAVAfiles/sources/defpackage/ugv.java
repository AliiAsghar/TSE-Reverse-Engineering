package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugv implements ugy {
    public final armf b;
    public final Optional c;
    private final armf e;
    private final armf f;
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations");
    public static final uuf a = uuh.i(uuh.b, "fix_invalid_thread_id", true);

    public ugv(armf armfVar, armf armfVar2, Optional optional, armf armfVar3) {
        this.b = armfVar;
        this.e = armfVar2;
        this.c = optional;
        this.f = armfVar3;
    }

    private static xhv c(ConversationIdType conversationIdType) {
        alvi alviVar = d;
        alvg alvgVar = (alvg) alviVar.i();
        alvgVar.Z(alwk.FULL);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 106, "DatabaseThreadOperations.java")).t("GetOrCreateThreadIdForConversation for conversation %s failed. Attempting to recover from Conversations Table", conversationIdType);
        xhv xhvVar = new xhv();
        smr a2 = sni.a(conversationIdType);
        if (a2 != null && a2.F().c()) {
            xhv F = a2.F();
            ((alvg) ((alvg) alviVar.g()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 115, "DatabaseThreadOperations.java")).q("Retrieved valid thread ID from conversations table.");
            return F;
        }
        ((alvg) ((alvg) alviVar.i()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "getThreadIdFromConversationsTable", 117, "DatabaseThreadOperations.java")).q("Failed to retrieve thread ID from conversations table. Setting thread ID as unknown.");
        return xhvVar;
    }

    @Override // defpackage.ugy
    public final xhv a(ConversationIdType conversationIdType) {
        xhv c;
        akrh e = aktp.e("DatabaseThreadOperations#getThreadId");
        try {
            if (((Boolean) qpf.a.e()).booleanValue()) {
                try {
                    c = ((qos) this.f.b()).a(conversationIdType);
                    if (c.d()) {
                        c = c(conversationIdType);
                    }
                } catch (alia unused) {
                    c = c(conversationIdType);
                }
            } else {
                xyl.h();
                c = (xhv) sni.f(conversationIdType, new tyl(this, 9), new tyr(7));
            }
            e.close();
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ugy
    public final void b(List list, tqc tqcVar) {
        boolean d2 = tqcVar.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xhv a2 = a((ConversationIdType) it.next());
            if (a2.d()) {
                ((alvg) ((alvg) d.i()).h("com/google/android/apps/messaging/shared/datamodel/operations/DatabaseThreadOperations", "setThreadsArchiveStatusInTelephony", 152, "DatabaseThreadOperations.java")).q("Thread Id for conversation not found, skipping telephony archive status update");
            } else {
                ((wzs) this.e.b()).Q(a2, d2);
            }
        }
    }
}
