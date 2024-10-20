package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sju extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(qhx qhxVar) {
        Integer valueOf;
        int a;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 58690) {
            agnc.t("classification_state", intValue);
        }
        if (qhxVar == null) {
            a = 0;
        } else {
            a = qhxVar.a();
        }
        U(new agoi("conversation_classifications_table.classification_state", 2, Integer.valueOf(a)));
    }

    public final void c(qhy qhyVar) {
        int a;
        if (qhyVar == null) {
            a = 0;
        } else {
            a = qhyVar.a();
        }
        U(new agoi("conversation_classifications_table.classification_type", 1, Integer.valueOf(a)));
    }

    public final void d(ConversationIdType conversationIdType) {
        U(new agmd("conversation_classifications_table.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void e(String str) {
        U(new agmd("conversation_classifications_table.date", 1, String.valueOf(str)));
    }
}
