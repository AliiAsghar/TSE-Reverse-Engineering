package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ubn extends aker {
    private static final xze b = xze.g("BugleDataModel", "TelephonyMessagesObserver");
    public final armf a;
    private final armf c;

    public ubn(armf armfVar, armf armfVar2, aksr aksrVar, anen anenVar) {
        super(aksrVar, "TelephonyMessagesObserver", anenVar);
        this.c = armfVar;
        this.a = armfVar2;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        xyo a = b.a();
        a.H("Sms/Mms DB changed");
        a.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        a.q();
        if (((wzp) this.c.b()).v()) {
            return;
        }
        if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
            ((wzp) this.c.b()).l(amvm.TELEPHONY_MESSAGES_OBSERVER);
        } else {
            ((wzp) this.c.b()).h();
        }
    }
}
