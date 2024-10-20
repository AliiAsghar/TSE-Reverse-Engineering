package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jba extends FrameLayout implements apxr {
    private aklx a;
    private boolean b;

    public jba(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.a == null) {
            this.a = new aklx(this);
        }
        return this.a;
    }

    protected final void c() {
        if (!this.b) {
            this.b = true;
            ((jay) aS()).o();
        }
    }

    public jba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public jba(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public jba(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
