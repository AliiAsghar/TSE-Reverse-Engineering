package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyc {
    public static final /* synthetic */ artm[] a;
    public final ConversationScrollToBottomButton b;
    public final ViewGroup c;
    public final TextView d;
    public final arml e;
    public final arml f;
    public final arml g;
    public Animator h;
    public final arsn i;
    private final Runnable j;

    static {
        arrr arrrVar = new arrr(iyc.class, "textMode", "getTextMode()Lcom/google/android/apps/messaging/conversation/scrolltobottombutton/ConversationScrollToBottomButtonPeer$TextMode;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public iyc(armf armfVar) {
        armfVar.getClass();
        ConversationScrollToBottomButton conversationScrollToBottomButton = (ConversationScrollToBottomButton) armfVar.b();
        this.b = conversationScrollToBottomButton;
        View.inflate(conversationScrollToBottomButton.getContext(), R.layout.conversation_scroll_to_bottom_button, conversationScrollToBottomButton);
        this.c = (ViewGroup) conversationScrollToBottomButton.findViewById(R.id.inner_root);
        this.d = (TextView) conversationScrollToBottomButton.findViewById(R.id.text);
        conversationScrollToBottomButton.setClickable(true);
        this.j = new ivl(this, 9);
        f();
        this.e = armd.a(new ixz(this, 2));
        this.f = armd.a(new ixz(this, 0));
        this.g = armd.a(new ixz(this, 1));
        this.i = new iyb(ixx.a, this);
        e();
    }

    public final Animator a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new qu(this, 10, null));
        ofFloat.addListener(new ixv(this, new ifa(this, 17), new ifa(this, 18)));
        ofFloat.getClass();
        return ofFloat;
    }

    public final Animator b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new qu(this, 11, null));
        ofFloat.addListener(new ixv(this, new ifa(this, 19), new ifa(this, 20)));
        ofFloat.getClass();
        return ofFloat;
    }

    public final ixy c() {
        return (ixy) this.i.c(a[0]);
    }

    public final String d(ixw ixwVar) {
        return gvf.P(this.b.getContext(), R.string.new_message_label, "count", Integer.valueOf(Math.min(ixwVar.a, 99)));
    }

    public final void e() {
        int i;
        ixy c = c();
        if (c instanceof ixx) {
            i = 0;
        } else if (c instanceof ixw) {
            i = ((ixw) c).a;
        } else {
            throw new armm();
        }
        this.b.setContentDescription(gvf.P(this.b.getContext(), R.string.conversation_scroll_to_bottom_button_content_description, "count", Integer.valueOf(i)));
    }

    public final void f() {
        aabr.am(this.c, this.j);
    }
}
