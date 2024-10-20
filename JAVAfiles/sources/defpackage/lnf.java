package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnf implements lju {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler");
    public final arpi b;
    public final armf c;
    private final Context d;
    private final arwe e;
    private final armf f;

    public lnf(Context context, arpi arpiVar, arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3) {
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.d = context;
        this.b = arpiVar;
        this.e = arweVar;
        this.f = armfVar;
        this.c = armfVar3;
    }

    @Override // defpackage.lju
    public final /* bridge */ /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        Boolean bool;
        lnd lndVar = (lnd) lkfVar;
        ConversationId conversationId = lndVar.a;
        String str = lndVar.b;
        Recipient recipient = lndVar.c;
        tqc tqcVar = lndVar.d;
        ConversationIdType b = ruy.b(conversationId.b());
        String f = ((xzu) this.c.b()).f(b);
        if (yhx.d) {
            if (tqcVar != null) {
                bool = Boolean.valueOf(tqcVar.g());
            } else {
                bool = null;
            }
            bool.getClass();
            armf armfVar = this.c;
            boolean booleanValue = bool.booleanValue();
            if (!((xzu) armfVar.b()).k(f) && !booleanValue) {
                qjh.l(this.e, null, new lne(this, f, str, b, conversationId, recipient, (arpe) null, 0), 3);
                return arnb.a;
            }
        }
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) g.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler", "handleNotificationNavigation", 131, "NotificationSettings.kt")).q("Shortcut already exists. Will launch notification settings now.");
        b(str, b, f);
        return arnb.a;
    }

    public final void b(String str, ConversationIdType conversationIdType, String str2) {
        Intent b = ((vml) this.f.b()).b(str, str2, conversationIdType);
        if (b == null) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.p, conversationIdType);
            alvgVar.X(vjh.t, str2);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler", "createAndOpenNotificationChannel", 157, "NotificationSettings.kt")).q("intent is null, unable to open notification channel settings");
            return;
        }
        this.d.startActivity(b);
    }
}
