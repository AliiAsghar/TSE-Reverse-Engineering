package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaef extends MaterialCardView implements apxr {
    private apxm g;
    private boolean h;

    aaef(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        n();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.g == null) {
            this.g = new apxm(this);
        }
        return this.g;
    }

    protected final void n() {
        if (!this.h) {
            this.h = true;
            ConversationRichCardView conversationRichCardView = (ConversationRichCardView) this;
            kqs kqsVar = (kqs) aS();
            conversationRichCardView.r = (wpp) kqsVar.a.Ci.b();
            conversationRichCardView.q = (vid) kqsVar.a.kO.b();
            conversationRichCardView.p = kqsVar.a();
            conversationRichCardView.n = (xnv) kqsVar.a.bV.b();
            conversationRichCardView.o = kqsVar.a.xC;
        }
    }

    public aaef(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        n();
    }

    public aaef(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        n();
    }
}
