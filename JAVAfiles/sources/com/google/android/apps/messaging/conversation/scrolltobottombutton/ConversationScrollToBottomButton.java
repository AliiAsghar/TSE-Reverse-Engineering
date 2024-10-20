package com.google.android.apps.messaging.conversation.scrolltobottombutton;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.akec;
import defpackage.akkh;
import defpackage.akkq;
import defpackage.aklg;
import defpackage.aklm;
import defpackage.albo;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.hht;
import defpackage.iyc;
import defpackage.iyd;
import defpackage.iyf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationScrollToBottomButton extends iyf implements akkh<iyc> {
    private iyc a;
    private Context b;

    @Deprecated
    public ConversationScrollToBottomButton(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                this.a = ((iyd) aS()).j();
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof apxq) && !(context instanceof apxm.a) && !(context instanceof aklm)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof aklg)) {
                    throw new IllegalStateException(hht.f(this));
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.akkh
    public final Class C() {
        return iyc.class;
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iyc E() {
        iyc iycVar = this.a;
        if (iycVar != null) {
            return iycVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.b;
            if (context == null) {
                this.b = o;
                return;
            }
            boolean z = true;
            if (context != o && !akec.p(context)) {
                z = false;
            }
            albo.U(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ConversationScrollToBottomButton(akkq akkqVar) {
        super(akkqVar);
        d();
    }
}
