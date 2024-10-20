package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardContentContainer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaeg extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    aaeg(Context context) {
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
            RichCardContentContainer richCardContentContainer = (RichCardContentContainer) this;
            kqs kqsVar = (kqs) aS();
            richCardContentContainer.f = (qyh) kqsVar.a.a.fn.b();
            richCardContentContainer.g = kqsVar.B;
        }
    }

    public aaeg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    aaeg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    aaeg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
