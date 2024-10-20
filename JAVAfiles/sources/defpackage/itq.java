package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class itq extends RecyclerView implements apxr {
    private aklx ab;
    private boolean ac;

    public itq(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    @Override // defpackage.apxr
    /* renamed from: aN, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.ab == null) {
            this.ab = new aklx(this);
        }
        return this.ab;
    }

    protected final void aO() {
        if (!this.ac) {
            this.ac = true;
            ((iti) aS()).i();
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    public itq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    public itq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aO();
    }
}
