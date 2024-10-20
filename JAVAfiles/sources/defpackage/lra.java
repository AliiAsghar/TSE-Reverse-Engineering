package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lra extends ScrollView implements apxr {
    private apxm a;
    private boolean b;

    lra(Context context) {
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
            SpamPopupView spamPopupView = (SpamPopupView) this;
            krv krvVar = ((kqs) aS()).a;
            spamPopupView.c = krvVar.yJ;
            spamPopupView.d = krvVar.a.fP;
        }
    }

    public lra(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    lra(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    lra(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
