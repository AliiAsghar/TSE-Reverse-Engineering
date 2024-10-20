package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zow extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    zow(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void f() {
        if (!this.b) {
            this.b = true;
            VCardAttachmentView vCardAttachmentView = (VCardAttachmentView) this;
            kqs kqsVar = (kqs) aS();
            vCardAttachmentView.a = (qky) kqsVar.a.a.cL.b();
            krv krvVar = kqsVar.a;
            vCardAttachmentView.l = new gqg(krvVar.n, kqsVar.f, krvVar.dW, krvVar.ne, krvVar.a.eR, (char[]) null);
            vCardAttachmentView.m = (wfh) kqsVar.a.ec.b();
            vCardAttachmentView.b = (zpt) kqsVar.a.ef.b();
            vCardAttachmentView.c = kqsVar.a.dd;
        }
    }

    public zow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    zow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    zow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}
