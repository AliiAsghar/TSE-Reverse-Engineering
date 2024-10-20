package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.conversation.settings.BusinessTopActionView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iyt extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    public iyt(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
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
            BusinessTopActionView businessTopActionView = (BusinessTopActionView) this;
            kqs kqsVar = (kqs) aS();
            businessTopActionView.b = (mho) kqsVar.a.gD.b();
            businessTopActionView.c = (abbu) kqsVar.a.yF.b();
        }
    }

    public iyt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    iyt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    iyt(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
