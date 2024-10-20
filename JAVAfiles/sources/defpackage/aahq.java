package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.toolstone.ConversationToolstoneView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aahq extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    aahq(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void i() {
        if (!this.b) {
            this.b = true;
            ConversationToolstoneView conversationToolstoneView = (ConversationToolstoneView) this;
            kqs kqsVar = (kqs) aS();
            conversationToolstoneView.a = kqsVar.D;
            krv krvVar = kqsVar.a;
            conversationToolstoneView.b = krvVar.kO;
            conversationToolstoneView.c = kqsVar.E;
            conversationToolstoneView.d = krvVar.a.gX;
        }
    }

    public aahq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    aahq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    aahq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}
