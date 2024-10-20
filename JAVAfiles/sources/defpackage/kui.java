package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kui extends MaterialCardView implements apxr {
    private aklx g;
    private boolean h;

    public kui(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aklx aR() {
        if (this.g == null) {
            this.g = new aklx(this);
        }
        return this.g;
    }

    protected final void h() {
        if (!this.h) {
            this.h = true;
            ((kue) aS()).I();
        }
    }

    public kui(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    public kui(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        h();
    }
}
