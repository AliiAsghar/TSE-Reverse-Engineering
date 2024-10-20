package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kyw extends ConstraintLayout implements apxr {
    private aklx d;
    private boolean e;

    public kyw(Context context) {
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
    public final aklx aR() {
        if (this.d == null) {
            this.d = new aklx(this);
        }
        return this.d;
    }

    protected final void d() {
        if (!this.e) {
            this.e = true;
            ((kya) aS()).G();
        }
    }

    public kyw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public kyw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
