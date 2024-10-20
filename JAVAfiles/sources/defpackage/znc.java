package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class znc extends ajfq implements apxr {
    private aklx a;
    private boolean f;

    public znc(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.a == null) {
            this.a = new aklx(this);
        }
        return this.a;
    }

    protected final void e() {
        if (!this.f) {
            this.f = true;
            ((zkl) aS()).K();
        }
    }

    public znc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    public znc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        e();
    }
}
