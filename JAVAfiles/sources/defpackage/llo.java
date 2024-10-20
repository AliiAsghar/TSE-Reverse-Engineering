package defpackage;

import android.app.Activity;
import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llo implements lju {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler");
    private final Context b;
    private final Optional c;

    public llo(Context context, Optional optional) {
        this.b = context;
        this.c = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lju
    public final /* bridge */ /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        Object obj;
        this.c.isPresent();
        Activity al = aabr.al(this.b);
        if (al != 0) {
            if (al instanceof akkh) {
                obj = ((akkh) al).E();
            } else {
                obj = null;
            }
            if (obj instanceof lex) {
                ((alvg) a.d().h("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler", "navigate", 62, "CloseConversation.kt")).q("Invoking onFinishCurrentConversation on conversation host");
                ((lex) obj).C();
            } else {
                ((alvg) a.g().h("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler", "navigate", 65, "CloseConversation.kt")).q("Dispatching Close Conversation event.");
                aktp.J(lln.a, al);
            }
            return arnb.a;
        }
        throw new IllegalArgumentException("CloseConversationNavigationHandler must be created with an activity context.");
    }
}
