package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhq {
    public static final xze a = xze.g("BugleDataModel", "MessageAnnotationDatabaseOperations");
    public final armf b;
    private final agnq c;

    public yhq(armf armfVar, agnq agnqVar) {
        this.b = armfVar;
        this.c = agnqVar;
    }

    public static ryi a(MessageIdType messageIdType) {
        akrh e = aktp.e("MessageAnnotationDatabaseOperations#getAnnotationsForMessage");
        try {
            xyl.h();
            ryi ryiVar = new ryi();
            stj a2 = stl.a();
            a2.w("getAnnotationsForMessage");
            a2.e(new yec(messageIdType, 4));
            ryiVar.c(a2.b().t());
            e.close();
            return ryiVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean b(ConversationIdType conversationIdType, MessageIdType messageIdType, List list) {
        boolean booleanValue;
        akrh e = aktp.e("MessageAnnotationDatabaseOperations#addMessageAnnotations");
        try {
            xyl.h();
            if (adom.o(list)) {
                booleanValue = false;
            } else {
                booleanValue = ((Boolean) this.c.c("MessageAnnotationDatabaseOperations#addMessageAnnotationsTraced", new rka(this, list, conversationIdType, messageIdType, 11))).booleanValue();
            }
            e.close();
            return booleanValue;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(ConversationIdType conversationIdType, MessageIdType messageIdType, List list) {
        xyl.h();
        return ((Boolean) this.c.c("MessageAnnotationDatabaseOperations#setMessageAnnotations", new rka(this, messageIdType, conversationIdType, list, 10))).booleanValue();
    }
}
