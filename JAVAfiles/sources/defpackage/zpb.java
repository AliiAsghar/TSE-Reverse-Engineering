package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zpb extends HorizontalScrollView implements apxr {
    private aklx a;
    private boolean b;

    public zpb(Context context) {
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
            ((zor) aS()).D();
        }
    }

    public zpb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public zpb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public zpb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
