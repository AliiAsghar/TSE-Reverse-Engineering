package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iys extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    public iys(Context context) {
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
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void c() {
        if (!this.b) {
            this.b = true;
            BusinessContactActionView businessContactActionView = (BusinessContactActionView) this;
            kqs kqsVar = (kqs) aS();
            businessContactActionView.a = (mho) kqsVar.a.gD.b();
            businessContactActionView.b = (abbu) kqsVar.a.yF.b();
        }
    }

    public iys(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    iys(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    iys(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
