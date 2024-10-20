package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldr extends LinearLayout implements apxr {
    private aklx a;
    private boolean b;

    public ldr(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.a == null) {
            this.a = new aklx(this);
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
            ((ldq) aS()).N();
        }
    }

    public ldr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public ldr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public ldr(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
