package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lma implements lju {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler");
    private final Context b;
    private final armf c;
    private final Optional d;

    public lma(Context context, armf armfVar, Optional optional) {
        armfVar.getClass();
        this.b = context;
        this.c = armfVar;
        this.d = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lju
    public final /* bridge */ /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        Object obj;
        lls llsVar = (lls) lkfVar;
        boolean z = llsVar.a.f;
        this.d.isPresent();
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "Bugle");
        ((alvg) g.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 62, "Conversation.kt")).t("Navigating w/activity, RBM: %s", Boolean.valueOf(z));
        Activity al = aabr.al(this.b);
        if (al != 0) {
            llt lltVar = llsVar.a;
            if (al instanceof akkh) {
                obj = ((akkh) al).E();
            } else {
                obj = null;
            }
            if ((obj instanceof lex) && ((Boolean) yyv.a.e()).booleanValue() && !z) {
                alvw g2 = alviVar.g();
                g2.X(alwp.a, "Bugle");
                boolean z2 = false;
                ((alvg) g2.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 70, "Conversation.kt")).t("Navigating w/main activity fragment host, RBM: %s", false);
                lex lexVar = (lex) obj;
                lexVar.v.isPresent();
                lexVar.J();
                lexVar.Q = null;
                if (lltVar.h == 2) {
                    lexVar.m().a = amfe.CONVERSATION_FROM_COMPOSE;
                    lexVar.d().b = 16;
                }
                Intent intent = lexVar.b.getIntent();
                intent.putExtra("render_add_recipient_button", lltVar.b);
                intent.putExtra("delete_empty_conversation_on_back", lltVar.c);
                if (lltVar.h == 2) {
                    z2 = true;
                }
                intent.putExtra("via_start_chat_intent", z2);
                lexVar.y(lltVar.a, rvc.a);
            } else {
                alvw g3 = alviVar.g();
                g3.X(alwp.a, "Bugle");
                ((alvg) g3.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 73, "Conversation.kt")).t("Navigating w/activity, RBM: %s", Boolean.valueOf(z));
                if (lltVar.e != null) {
                    qoq qoqVar = (qoq) this.c.b();
                    Context context = this.b;
                    ConversationId conversationId = lltVar.a;
                    IncomingDraft incomingDraft = lltVar.e;
                    if (incomingDraft != null) {
                        qoqVar.v(context, conversationId, incomingDraft, lga.g(lltVar), lltVar.f);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    ((qoq) this.c.b()).u(this.b, lltVar.a, lltVar.d, lga.g(lltVar), Optional.empty(), lltVar.f);
                }
            }
            if (lltVar.g) {
                al.finish();
            }
            return arnb.a;
        }
        throw new IllegalArgumentException("ConversationNavigationHandler must be created with an activity context.");
    }
}
