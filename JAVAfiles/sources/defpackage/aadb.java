package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.messaging.ui.conversation.message.MessageMetadataDetailsView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aadb extends ViewGroup implements apxr {
    private apxm a;
    private boolean b;

    aadb(Context context) {
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
            MessageMetadataDetailsView messageMetadataDetailsView = (MessageMetadataDetailsView) this;
            kqs kqsVar = (kqs) aS();
            messageMetadataDetailsView.r = (wfh) kqsVar.a.ec.b();
            messageMetadataDetailsView.c = kqsVar.a.gC();
            messageMetadataDetailsView.d = (xyt) kqsVar.a.dS.b();
            messageMetadataDetailsView.s = (znj) kqsVar.a.fd.b();
            messageMetadataDetailsView.e = (ytk) kqsVar.a.oj.b();
            messageMetadataDetailsView.q = (uac) kqsVar.a.ed.b();
            messageMetadataDetailsView.f = kqsVar.a.pH;
            messageMetadataDetailsView.g = (abbj) kqsVar.m.b();
            messageMetadataDetailsView.h = kqsVar.a.yJ;
        }
    }

    aadb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public aadb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    aadb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
