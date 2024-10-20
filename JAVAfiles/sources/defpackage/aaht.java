package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.ui.conversation.typingindicator.ConversationTypingIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaht extends gmm {
    final /* synthetic */ ConversationTypingIndicatorView b;

    public aaht(ConversationTypingIndicatorView conversationTypingIndicatorView) {
        this.b = conversationTypingIndicatorView;
    }

    @Override // defpackage.gmm
    public final void b(Drawable drawable) {
        ((Animatable) this.b.c).start();
    }
}
