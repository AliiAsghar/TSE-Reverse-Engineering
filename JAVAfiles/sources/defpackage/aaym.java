package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.rcs.setup.RcsPromoView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaym extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    aaym(Context context) {
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
            RcsPromoView rcsPromoView = (RcsPromoView) this;
            kqs kqsVar = (kqs) aS();
            rcsPromoView.a = (yjy) kqsVar.a.aF.b();
            rcsPromoView.b = kqsVar.a.gD;
        }
    }

    public aaym(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    aaym(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    aaym(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
