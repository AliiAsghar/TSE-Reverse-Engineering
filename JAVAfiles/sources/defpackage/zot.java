package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.attachment.FileAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zot extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    zot(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void f() {
        if (!this.b) {
            this.b = true;
            ((FileAttachmentView) this).h = (zpt) ((kqs) aS()).a.ef.b();
        }
    }

    zot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    public zot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    zot(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}
