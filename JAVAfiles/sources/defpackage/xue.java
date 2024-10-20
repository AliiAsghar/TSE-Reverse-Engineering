package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xue extends AsyncImageView {
    private boolean h;

    public xue(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.xud
    protected final void o() {
        if (!this.h) {
            this.h = true;
            ContactIconView contactIconView = (ContactIconView) this;
            kqs kqsVar = (kqs) aS();
            contactIconView.e = (yai) kqsVar.a.a.ey.b();
            contactIconView.f = (uga) kqsVar.a.ne.b();
            contactIconView.g = (ahmn) kqsVar.J.aJ.b();
            contactIconView.q = Optional.of((qky) kqsVar.a.a.cL.b());
            contactIconView.s = (xvc) kqsVar.a.dW.b();
            krv krvVar = kqsVar.a;
            contactIconView.t = new zxy(krvVar.gD, krvVar.dw, krvVar.lP, krvVar.jN, kqsVar.e, null);
            contactIconView.r = kqsVar.a.dd;
        }
    }

    public xue(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}
