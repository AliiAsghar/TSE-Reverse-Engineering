package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abci extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    abci(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void d() {
        if (!this.b) {
            this.b = true;
            VideoOverlayView videoOverlayView = (VideoOverlayView) this;
            kqs kqsVar = (kqs) aS();
            videoOverlayView.f = kqsVar.a.a.iC();
            videoOverlayView.e = kqsVar.a.fd;
        }
    }

    public abci(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    abci(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    abci(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
