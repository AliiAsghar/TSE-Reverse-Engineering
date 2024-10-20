package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aacx extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    aacx(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void g() {
        if (!this.b) {
            this.b = true;
            ConversationMessageMetadataView conversationMessageMetadataView = (ConversationMessageMetadataView) this;
            kqs kqsVar = (kqs) aS();
            conversationMessageMetadataView.b = (yai) kqsVar.a.a.ey.b();
            conversationMessageMetadataView.c = apxv.a(kqsVar.J.ao);
            conversationMessageMetadataView.d = kqsVar.c;
        }
    }

    aacx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public aacx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    aacx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}
