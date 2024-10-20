package defpackage;

import android.animation.Animator;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageBubbleView;
import com.google.android.apps.messaging.welcome.EmergencySmsButtonView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aach implements Animator.AnimatorListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aach(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        if (i != 0 && i != 1 && i != 2) {
            animator.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, agea] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    animator.getClass();
                    ?? a = ((agdu) this.a).d.a();
                    if (a != 0) {
                        ((agdu) this.a).h(a);
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj = this.a;
            if (((aabq) obj).fe() != null) {
                bd bdVar = new bd(((cg) obj).E.G());
                bdVar.n((cg) this.a);
                bdVar.i();
                return;
            }
            return;
        }
        ConversationMessageBubbleView conversationMessageBubbleView = (ConversationMessageBubbleView) this.a;
        conversationMessageBubbleView.a = null;
        conversationMessageBubbleView.c.getLayoutParams().width = -2;
        ConversationMessageBubbleView conversationMessageBubbleView2 = (ConversationMessageBubbleView) this.a;
        conversationMessageBubbleView2.c.setMinimumWidth(conversationMessageBubbleView2.a(conversationMessageBubbleView2.b()));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.b;
        if (i != 0 && i != 1 && i != 2) {
            animator.getClass();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.b;
        if (i != 0 && i != 1) {
            if (i != 2) {
                animator.getClass();
            } else {
                ((EmergencySmsButtonView) this.a).a.setVisibility(0);
            }
        }
    }
}
