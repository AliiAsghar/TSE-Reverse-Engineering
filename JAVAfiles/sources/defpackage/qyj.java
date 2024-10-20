package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyj {
    private static final alwo b = alwo.o("BugleDataModel");
    public final armf a;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final armf d;
    private final anen e;

    public qyj(armf armfVar, armf armfVar2, anen anenVar) {
        this.d = armfVar;
        this.a = armfVar2;
        this.e = anenVar;
    }

    public final akul a(ConversationIdType conversationIdType) {
        akrh e = aktp.e("SendingContext::populateSendingContext");
        try {
            akul ah = aktp.ah(new nan(this, conversationIdType, 20), this.e);
            e.close();
            return ah;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(ConversationIdType conversationIdType) {
        akrh e = aktp.e("SendingContext::populatePendingMessages");
        try {
            sxy b2 = rbk.b();
            b2.g(new qwz(conversationIdType, 20));
            sxt sxtVar = (sxt) b2.b().n();
            while (sxtVar.moveToNext()) {
                try {
                    MessageCoreData a = ((tqx) this.d.b()).a();
                    a.cX(sxtVar);
                    if (a.cH() || a.cO()) {
                        this.c.put(conversationIdType, true);
                        break;
                    }
                } finally {
                }
            }
            this.c.put(conversationIdType, false);
            ((alwl) ((alwl) b.g()).h("com/google/android/apps/messaging/shared/datamodel/SendingContext", "populateFirstPendingMessage", 76, "SendingContext.java")).t("Conversation(id:%s) has no pending messages & using fast path message sending cache", conversationIdType);
            sxtVar.close();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(ConversationIdType conversationIdType) {
        Boolean bool = (Boolean) this.c.put(conversationIdType, true);
        if (bool != null && !bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
