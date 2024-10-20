package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.conversation.messagelist.tombstone.ConversationTombstoneView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class itz extends LinearLayout implements apxr {
    private apxm a;
    private boolean b;

    itz(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void i() {
        if (!this.b) {
            this.b = true;
            ConversationTombstoneView conversationTombstoneView = (ConversationTombstoneView) this;
            kqs kqsVar = (kqs) aS();
            conversationTombstoneView.m = (vid) kqsVar.a.kO.b();
            conversationTombstoneView.n = (znj) kqsVar.a.fd.b();
            conversationTombstoneView.d = kqsVar.a.yJ;
            conversationTombstoneView.l = (iyh) kqsVar.J.p.b();
            conversationTombstoneView.e = apxv.a(kqsVar.J.ao);
            conversationTombstoneView.f = kqsVar.c;
            conversationTombstoneView.g = apxv.a(kqsVar.d);
            krv krvVar = kqsVar.a;
            conversationTombstoneView.h = krvVar.os;
            conversationTombstoneView.i = krvVar.a.er;
        }
    }

    public itz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    itz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    itz(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}
