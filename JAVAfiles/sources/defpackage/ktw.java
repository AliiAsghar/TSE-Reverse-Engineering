package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ktw extends MaterialCardView implements apxr {
    private apxm g;
    private boolean h;

    ktw(Context context) {
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
        if (this.g == null) {
            this.g = new apxm(this);
        }
        return this.g;
    }

    protected final void i() {
        if (!this.h) {
            this.h = true;
            ((AdvancedFeedbackDataView) this).k = (aohs) ((kqs) aS()).J.aG.b();
        }
    }

    public ktw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    ktw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}
