package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class znd extends ConstraintLayout implements apxr {
    private aklx h;
    private boolean i;

    public znd(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.h == null) {
            this.h = new aklx(this);
        }
        return this.h;
    }

    protected final void g() {
        if (!this.i) {
            this.i = true;
            ((zla) aS()).L();
        }
    }

    public znd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public znd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public znd(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}
