package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardCarouselView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaee extends RecyclerView implements apxr {
    private apxm ab;
    private boolean ac;

    public aaee(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    @Override // defpackage.apxr
    /* renamed from: aN, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.ab == null) {
            this.ab = new apxm(this);
        }
        return this.ab;
    }

    protected final void aO() {
        if (!this.ac) {
            this.ac = true;
            ConversationRichCardCarouselView conversationRichCardCarouselView = (ConversationRichCardCarouselView) this;
            kqs kqsVar = (kqs) aS();
            conversationRichCardCarouselView.ae = (vid) kqsVar.a.kO.b();
            conversationRichCardCarouselView.ad = kqsVar.a();
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    public aaee(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    aaee(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aO();
    }
}
