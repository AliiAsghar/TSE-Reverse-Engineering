package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aada extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    aada(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected final void b() {
        if (!this.b) {
            this.b = true;
            MessageAttachmentsView messageAttachmentsView = (MessageAttachmentsView) this;
            kqs kqsVar = (kqs) aS();
            messageAttachmentsView.e = (zpt) kqsVar.a.ef.b();
            messageAttachmentsView.f = kqsVar.a.a.gW;
        }
    }

    public aada(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    aada(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    aada(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
