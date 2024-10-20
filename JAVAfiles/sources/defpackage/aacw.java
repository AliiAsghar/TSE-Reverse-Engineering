package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aacw extends FrameLayout implements apxr {
    private apxm a;
    private boolean b;

    aacw(Context context) {
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
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void e() {
        if (!this.b) {
            this.b = true;
            ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) this;
            kqs kqsVar = (kqs) aS();
            conversationMessageLinkPreviewView.b = (rzc) kqsVar.a.oA.b();
            conversationMessageLinkPreviewView.c = (ryx) kqsVar.a.pa.b();
            conversationMessageLinkPreviewView.d = (Optional) kqsVar.a.ph.b();
            conversationMessageLinkPreviewView.e = (lzv) kqsVar.a.yJ.b();
            conversationMessageLinkPreviewView.u = (iyh) kqsVar.J.p.b();
            krv krvVar = kqsVar.a;
            krvVar.yF.getClass();
            conversationMessageLinkPreviewView.f = krvVar.os;
            conversationMessageLinkPreviewView.g = krvVar.dV;
        }
    }

    aacw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    public aacw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    aacw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        e();
    }
}
