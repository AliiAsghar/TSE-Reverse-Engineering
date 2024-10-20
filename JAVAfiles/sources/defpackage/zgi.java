package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.ui.ImeDetectCoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zgi extends CoordinatorLayout implements apxr {
    private apxm i;
    private boolean j;

    zgi(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.i == null) {
            this.i = new apxm(this);
        }
        return this.i;
    }

    protected final void o() {
        if (!this.j) {
            this.j = true;
            ImeDetectCoordinatorLayout imeDetectCoordinatorLayout = (ImeDetectCoordinatorLayout) this;
            kqs kqsVar = (kqs) aS();
            krv krvVar = kqsVar.a;
            imeDetectCoordinatorLayout.i = new znj((armf) krvVar.a.cX, (armf) krvVar.yF);
            imeDetectCoordinatorLayout.j = (aqws) kqsVar.J.k.b();
        }
    }

    public zgi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    zgi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}
