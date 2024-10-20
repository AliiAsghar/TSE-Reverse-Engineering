package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl");
    public final arwe b;
    public final arpi c;
    public final armf d;
    public final uie e;
    public final lpg f;
    private final armf g;
    private final Context h;

    public mnl(arwe arweVar, arpi arpiVar, uie uieVar, armf armfVar, lpg lpgVar, armf armfVar2, Context context) {
        arweVar.getClass();
        arpiVar.getClass();
        uieVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        context.getClass();
        this.b = arweVar;
        this.c = arpiVar;
        this.e = uieVar;
        this.g = armfVar;
        this.f = lpgVar;
        this.d = armfVar2;
        this.h = context;
    }

    public static final ConversationIdType d(Conversation conversation) {
        return ((DefaultConversation) conversation).a.a;
    }

    public static final vst e(mnk mnkVar) {
        aozy createBuilder = vst.a.createBuilder();
        createBuilder.getClass();
        Integer b = mnkVar.b();
        if (b != null) {
            int intValue = b.intValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            vst vstVar = (vst) createBuilder.b;
            vstVar.b |= 1;
            vstVar.c = intValue;
        }
        apct k = aoue.k(mnkVar.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vst vstVar2 = (vst) createBuilder.b;
        vstVar2.d = k;
        vstVar2.b |= 2;
        apag s = createBuilder.s();
        s.getClass();
        return (vst) s;
    }

    public static final boolean f(Conversation conversation, mnk mnkVar) {
        Integer valueOf;
        Integer valueOf2;
        sng sngVar = new sng();
        sngVar.aj("RichThemeControllerImpl#persistRichThemeInDatabase");
        vst e = e(mnkVar);
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59820) {
            agnc.t("custom_theme", intValue2);
        }
        if (intValue >= 59820) {
            sngVar.a.put("custom_theme", e.toByteArray());
        }
        return sngVar.e(d(conversation));
    }

    public final String a(mnk mnkVar) {
        Map map = mnm.a;
        Integer num = (Integer) mnm.a.get(mnkVar.b());
        if (num != null) {
            Context context = this.h;
            return context.getResources().getString(num.intValue());
        }
        return null;
    }

    public final void b(Conversation conversation, String str, Recipient recipient) {
        if (recipient instanceof ndr) {
            ujq ujqVar = (ujq) this.g.b();
            ConversationIdType d = d(conversation);
            ParticipantsTable.BindData i = ((ndr) recipient).i();
            i.getClass();
            ujqVar.a(d, i, str);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void c(Conversation conversation, String str) {
        ((ujq) this.g.b()).b(d(conversation), str);
    }
}
