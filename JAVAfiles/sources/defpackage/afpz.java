package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afpz<T> extends afpx<T> implements apxr {
    private apxm j;
    private boolean k;

    public afpz(Context context) {
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
        if (this.j == null) {
            this.j = new apxm(this);
        }
        return this.j;
    }

    protected final void i() {
        if (!this.k) {
            this.k = true;
            ((SingleEmojiViewWithVariantIndicator) this).e = (arwe) ((kqs) aS()).a.dO.b();
        }
    }

    public afpz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}
