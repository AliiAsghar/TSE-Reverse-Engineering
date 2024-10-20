package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.conversation.messagelist.ConversationStartView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class irj extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    public irj(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void d() {
        if (!this.b) {
            this.b = true;
            ConversationStartView conversationStartView = (ConversationStartView) this;
            kqs kqsVar = (kqs) aS();
            krv krvVar = kqsVar.a;
            conversationStartView.b = krvVar.a.fP;
            conversationStartView.c = (mho) krvVar.gD.b();
            conversationStartView.d = kqsVar.b;
        }
    }

    public irj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public irj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    irj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
